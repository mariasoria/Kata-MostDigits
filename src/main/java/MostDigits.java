public class MostDigits {
    public static int mostDigits(int[] numbers){

        int length = 0;

        int result = numbers[0];
        int lengthResult = (int) (Math.log10(Math.abs(numbers[0])) + 1);

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < 0) length = (int) (Math. log10(Math.abs(numbers[i])) + 1);
            else length = (int) (Math. log10(numbers[i]) + 1);
            if (length > lengthResult) {
                result=numbers[i];
                lengthResult= (int) (Math. log10(Math.abs(result)) + 1);
            }
        }
        return result;
    }
}
