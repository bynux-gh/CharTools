/**
 * Encoding and decoding hexadecimal byte strings.
 * By Byn
 */

package chartools;

object HexLib {
    /**
    * Decodes a string of hexadecimal numbers into a string of characters.
    *
    * @param input A string with only valid HEX numbers separated by spaces and/or commas.
    */
    fun decodeHex(input: String): String {
        return input
            .split(Regex("(\\s|,)+")) // Split into individual values
            .map { Integer.parseInt(it, 16) } // Parse as hex into numbers
            .map { it.toChar() } // Convert numbers to ASCII
            .joinToString(""); // Merge results into a string
    }
    
    /**
    * Converts a regular string into the equivalent hexadecimal values.
    *
    * @param input Any string of valid ASCII/Unicode characters.
    */
    fun encodeHex(input: String): String {
        return input
            .map { it.code.toString(16) } // Convert to number, then hex
            .joinToString(" "); // Merge with space separators
    }
}
