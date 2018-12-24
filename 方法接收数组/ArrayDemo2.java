public class ArrayDemo2{
    public static void main(String[] args){
        int[] data =new int[]{2,4,6,8,10};
        printArray(data);
    }
    public static void printArray(int[] data){
        for(int temp: data){
            System.out.println(temp+"、");
        }
    }
}//方法接收数组