public class AmountOfThreeInArray {

    public int amountOfThree(int[] myArray){  // Here array variable is set,so no necessary to declare it within {}
         //myArray = new int[]; // It will go wrong if there is no value whthin []
         int amount = 0;
         for(int i = 0;i< myArray.length;i++){
             if (myArray[i] == 3){
                 amount++;
             }
         }
         return amount;

    }

    public int[] creatArrayOfDesiredLength(int length){
        int[] myArray = new int[length];
        for(int i = 0; i< myArray.length; i++){
            myArray[i] = 3;
        }
        return myArray;
    }
}
