/**
 * A simple ASCII table generator.
 * By Byn
 */

package chartools;

object CharTable {
    fun makeTable() {
        println(); // Space table away from user prompt
        println(" ASCII | HEX | DEC     ASCII | HEX | DEC     ASCII | HEX | DEC "); // Headers
        println("-------|-----|-----   -------|-----|-----   -------|-----|-----");
        
        for (left in 0x20..0x3f) {  // Val for 1st column
            val mid = left + 0x20;  //  "   "  2nd column
            val right = mid + 0x20; //  "   "  3rd column
    
            tableEntry(left);
            
            print("   "); // Space between columns
            
            tableEntry(mid);
    
            print("   "); // Space between columns
            
            if (right != 127) {
                tableEntry(right)
            } else {
                tableEntry(right, "BKSP")
            }
    
            println();
        }
        println(); // Space from bottom.
    }
    
    /**
     * Prints a table entry for a given ASCII/Unicode character code.
     * 
     * @param charCode The numerical value for the character code to print.
     * @param character A string representation of a character, for use in place of control characters (BELL, NULL, BKSP, CR, etc.)
     */
    private fun tableEntry(charCode: Int, character: String = charCode.toChar().toString()): Unit {
        print("%6s ".format(character)); // Allows abbreviations in place of ctrl chars
        print("|  ${charCode.toString(16)} | ${"%3d".format(charCode)} ");
    }
}
