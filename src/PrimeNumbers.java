public class PrimeNumbers {
    public static void main(String[] args) {
        // Empty String ...
        String primeNumbers = "";

        for(int index = 1; index <= 100; index++) {
            int counter = 0;

            for (int number = index; number >= 1; number--) {
                if (index % number == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                // Appended the prime number to the String
                primeNumbers = primeNumbers + index + " ";
            }
        }

        System.out.println("Prime numbers from 1 to 100 are : ");
        System.out.println(primeNumbers);
    }
}