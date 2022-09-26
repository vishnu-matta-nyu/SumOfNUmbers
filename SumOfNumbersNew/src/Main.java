public class Main {

    public static void main(String[] args) {

        System.out.println(sumOfNumbers("46gthsj74"));

    }

    public static int sumOfNumbers(String str) {
        //Sum Value
        int sum = 0;

        //Dummy String for keeping chunks of numbers from the string
        String dummy = "";

        //Count variable to check if number was previously found
        int count = 0;

        //Iterating through the string
        for (int i = 0; i < str.length(); i++) {

            //Checking if it is a digit at the given index
            if (Character.isDigit(str.charAt(i))) {

                //If the index is the last index, and it is a number automatically add the vales stored in the dummy string
                if (i == str.length() - 1) {
                    dummy = dummy + str.charAt(i);
                    sum = sum + Integer.parseInt(dummy);
                    count = 0;

                }

                //Adding any digit values to the dummy string
                dummy = dummy + str.charAt(i);
                //increasing the count to let the program know that a number was found
                count++;


            } else {

                // Checking to see if a number was found in order to parseInt and add to sum
                if (count > 0) {

                    sum = sum + Integer.parseInt(dummy);
                    count = 0;

                }

                // Setting the dummy value back to nothing to prepare for the next chunk
                dummy = "";

            }


        }

        //return sum
        return sum;
    }

}
