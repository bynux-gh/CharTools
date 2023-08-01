// ASCII/Unicode conversion and reference tools by Bryn M.

package chartools;
import chartools.CharTable as Table;
import chartools.HexLib as Hex;

/** Main Program */
fun main(args: Array<String>) {

    // Initiallize program
    var opt: Char? = null; // Start with null value.
    
    if (args.isEmpty()) { // If no arg passed, start interactive session.
        print("(D)ecode, (E)ncode, (T)able, or (Q)uit?\n> ");
        opt = readLine()?.first(); // Prompt to select function
    } else {
        try {
            opt = args[0].first(); // If arg given, accept and process.
        } catch (e: NoSuchElementException) {
            System.err.println("Did you seriously pass an empty string? What is WRONG with you???");
            System.exit(2);
        } // Because apparently this is an edge case I should be aware of.
    }

    when (opt) {
    
        'd','D' -> {
            println("Enter HEX string to decode."); // Decode from HEX
            print("Separate values with commas and/or spaces.\n> ");
            try {
                println("= " + Hex.decodeHex(readLine().orEmpty()) + "\n");
            } catch (e: NumberFormatException) {
                // If user enters invalid string, give error and retry.
                println("Please enter valid hexadecimal, and use " +
                        "only commas and spaces " +
                        "to separate each value.\n");
            } catch (e: Exception) {
                // If there's some other error, print message and quit w/ error code 1.
                System.err.println("An unknown error has occurred.");
                System.exit(1);
            }
        }
    
        'e','E' -> { // Encode to HEX
            print("Enter string to encode.\n> ");
            println("= " + Hex.encodeHex(readLine().orEmpty()) + "\n");
        }

        'f','F' -> { // Press F to pay respects.
            println("Respects have been paid.\n");
        }
        
        't','T' -> {
            Table.makeTable();
        }


        'q','Q' -> { // Quit program
            System.exit(0);
        }

        else -> { // If other selection is made,
            System.err.println("Please enter a valid command.\n"); // give error message.
        }
        
    }
    
    // Finally, loop program if interactive, quit otherwise.
    if (args.isEmpty()) {
        main(emptyArray<String>());
    } else {
        System.exit(0);
    }
} // :]

