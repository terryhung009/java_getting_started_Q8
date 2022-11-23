public class Main {

    public static boolean findDuplicate(int[] array){
        System.out.println(array.length);
        for(int i = 0; i<array.length;i++){
            for(int j =0;j<array.length;j++){
                if(array[i] == array[j]){
                    return true;
                }
            }

        }
        return false;

    }



    public static void main(String[] args) {
        findDuplicate(new int[] {1, 3, 5, 7, 9, 3});
//        findDuplicate(new int[] {}); // returns false
//        findDuplicate(new int[] {3, 4, 5, 6, 7, 10000, 0});
    }
}
