public class Main {
        public static boolean resultNumber(int numb) {
        return numb % 2== 0;
    }
    public static int getEvenNumbers(int [] values) {

        int completResult=(0);
        for (int value : values) {
            if (Main.resultNumber(value)) {
                completResult++;
            }
        }

        return completResult;
    }}