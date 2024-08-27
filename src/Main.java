public class Main {
    public static void main(String[] args) {
        System.out.println(printEqual(1, 1, 1));
        System.out.println(printEqual(1, 1, 2));
        System.out.println(printEqual(-1, -1, -1));
        System.out.println(printEqual(1, 2, 3));
    }

    private static String printEqual(int num1, int num2, int num3) {
        if(num1 < 0 || num2 < 0 || num3 < 0){
            return "Invalid";
        }

        if(num1 == num2 && num2 == num3){
            return "All Equal";
        }

        if(num1 != num2 && num1 != num3){
            return "All different";
        }

        else{
            return "Neither";
        }
    }
}
