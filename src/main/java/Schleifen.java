public class Schleifen {

    public static void main(String[] args) {

        System.out.println(testFor(10));
        System.out.println(testWhile(10));
        testFor(10);

    }

    public static int testFor(int z) {

        int fact = 1;
        for (int i = 2; i <= z; i++) {
            fact =  fact * i;
        }
        return fact;

    }

    public static int testWhile(int fact){

        int  i = 1;
        int  result = 1;

        while (i <= fact){
            result = result * i;  // result *= i;
            i++;

        }

        return result;

    }


}
