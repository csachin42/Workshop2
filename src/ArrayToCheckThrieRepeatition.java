public class ArrayToCheckThrieRepeatition {

    int array[] = {1, 2, 3, 1, 5, 6, 1, 8, 9};

    void calc() {
        int count=0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = 1; j <=array.length; j++) {
              if ( array[i] == array[j]){
                count++;
              }
            }if (count ==3){
                System.out.println("array is repeated thrice");
            }
            else {
                System.out.println("arrray is not repeated thrice");
            }
        }
            }



    public static void main(String[] args) {
        ArrayToCheckThrieRepeatition a=new ArrayToCheckThrieRepeatition();
        System.out.println("Array Repeatition Program");
        a.calc();

    }


}


