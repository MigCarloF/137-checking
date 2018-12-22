public class SimpleParityCheck {

    public SimpleParityCheck(){

    }


    public String validateParity(int[] a) {
        if (isEvenAmount1s(a)){
            return Functions.arrayIntToString(a);
        }
        return "Discarded";
    }

    public int[] assignParityBit(int[] arr){
        int[] arr2 = new int[arr.length + 1];

        // Copies contents of arr to arr2
        for(int i = 0; i < arr.length; i++){

            // Copies contents of arr to arr2
            arr2[i] = arr[i];
        }

        arr2[arr.length] = isEvenAmount1s(arr) ? 0 : 1;

        return arr2;
    }

    private boolean isEvenAmount1s(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }

        return count % 2 != 1;

    }
}