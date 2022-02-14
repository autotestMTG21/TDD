public class IntArray {
    public int[] returnsArrayWithReplaceZeroWithOne(int[] intArray ) {

        for(int i : intArray){
            if(i == 0){
                intArray[i] = 1;
            }
        }
        return intArray;

    }
}
