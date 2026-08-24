/**
 * (1) Fill in the following minimal documentation in the comments:
 * Complete the placeholders with your information.
 */

// NAME: Zhi Gao
// ULID: C00571719
// COURSE: CMPS 260, Section 010
// PA: 1

public class PA1 {

    public static void main(String[] args) {
        // Introduction
        System.out.println("CMPS 260 PA1 [Fall 2026]");
        System.out.println();

        /**
         * (2) The following variable should contain your ULID.
         * Replace the placeholder "C00..." with your actual ULID.
         */
        String ULID = "C00571719";

        // Declaring and assigning variables.
        /**
         * (3) Change each 0 to the appropriate number based on your ULID.
         * You may determine these numbers by trial and error or by
         * examining the description of the substring method.
         */
        int preBegin = 0; // Start index for the prefix.
        int preEnd   = 3; // End index for the prefix.

        int midBegin = 3; // Start index for the middle.
        int midEnd   = 6; // End index for the middle.

        int sufBegin = 6; // Start index for the suffix.
        int sufEnd   = 9; // End index for the suffix.

        // Extract the prefix, middle, and suffix of the ULID.
        String prefix = ULID.substring(preBegin, preEnd);
        String middle = ULID.substring(midBegin, midEnd);
        String suffix = ULID.substring(sufBegin, sufEnd);

        /**
         * (4) Replace each "placeholder" String literal with the appropriate
         * variables defined above.
         */
        System.out.println("My ULID is "    + ULID);
        System.out.println("The prefix is " + prefix);
        System.out.println("The middle is " + middle);
        System.out.println("The suffix is " + suffix);

        // Use Integer's parseInt static method to retrieve the
        // int-value of the Strings middle and suffix.
        /**
         * (5) Replace the "-1" string literals with the variables containing
         * the middle and suffix values.
         */
        int middleNum = Integer.parseInt(middle);
        int suffixNum = Integer.parseInt(suffix);

        // Use Math's max and min static methods to retrieve
        // the larger and smaller of the middle and suffix numbers
        /**
         * (6) Replace the zero (0) integer literals with the appropriate
         * variables middleNum and suffixNum.
         */
        int maxNum = Math.max(middleNum, suffixNum);
        int minNum = Math.min(middleNum, suffixNum);

        // Append the appropriate variables to each String
        System.out.println("The max is " + maxNum);
        System.out.println("The min is " + minNum);
    }
}