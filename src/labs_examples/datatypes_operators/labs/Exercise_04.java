package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int num1 = 34;
        int num2 = 64;

        if (num1 <= num2) {
            System.out.println("num1 is less than or equal to num2");
        }

        if (num2 > num1) {
            System.out.println("num2 is greater than num1");
        }

        int num3 = 35;
        int num4 = 35;

        if (num3 >= num4) {
            System.out.println("num3 is greater than or equal to num4");
        }

        if (num3 == num4) {
            System.out.println("num3 is equal to num4");
        }

    }

}

