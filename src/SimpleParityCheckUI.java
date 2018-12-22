import java.util.Scanner;

public class SimpleParityCheckUI {

    private SimpleParityCheck parityCheck;

    public SimpleParityCheckUI(){
        init();

        start();
    }

    private void init() {
        parityCheck = new SimpleParityCheck();
    }


    private void start() {

        System.out.println("-Input in binary-");
        System.out.print("Input A: ");
        int[] inputA = getInput();
        System.out.print("Input B: ");
        int[] inputB = getInput();
        System.out.println("@Sender");
        System.out.print("Codeword: ");
        int[] inputA_parity = parityCheck.assignParityBit(inputA);
        System.out.println(Functions.arrayIntToString(inputA_parity));

        System.out.println("@Receiver");
        System.out.print("Data Word: ");
        System.out.println(parityCheck.validateParity(inputB));

    }

    // Returns an integer array as an input
    private int[] getInput(){

        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        char[] charInput;
        int[] input;

        do {
            String strInput = sc.next();
            charInput = strInput.toCharArray();
            input = Functions.charToIntArr(charInput);
        } while(!isValidInput(input));

        return input;
    }

    // Checks if array contains only 0 and 1
    // returns false if invalid input
    private boolean isValidInput(int[] arr){
        for(int num : arr){
            if(num > 1 || num < 0){
                return false;
            }
        }
        return true;
    }



}