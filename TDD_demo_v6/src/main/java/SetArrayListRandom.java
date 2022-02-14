import java.util.Random;

public class SetArrayListRandom {
    public int[] arraylistRandom(){
        Random ran = new Random();
        int[] arr = new int[100];
        for(int i =0; i<arr.length; i++){
            arr[i] = ran.nextInt(99)+1; // random from 1 to 100
        }
        return arr;
    }
}
