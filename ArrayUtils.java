package www.bit.java;


    //Java数组章节练习题
    public class ArrayUtils{

        //1.计算数组中最大值
        public static int arrayMaxElement(int[] data){
            int max=data[0];
            for (int i = 0; i <data.length ; i++) {
                if(data[i]>max)
                    max=data[i];
            }
            return max;
        }

        //2.计算数组中最小值
        public static int arrayMinElement(int[] data){
            int min=data[0];
            for (int i = 0; i <data.length ; i++) {
                if(data[i]<min)
                    min=data[i];
            }
            return min;
        }


        //3.计算数组值之和
        public static int arrayElementSum(int[] data){
            int result=0;
            for (int i = 0; i <data.length ; i++) {
                result+=data[i];
            }
            return result;
        }

        //4.数组拼接
        // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
        //返回值类型是一个新的数组
        public static int[] arrayJoin(int[] a, int[] b){
            int[] result=new int[a.length+b.length];
            for (int i = 0; i <a.length ; i++) {
                result[i]=a[i];
            }
            for (int i = 0; i <b.length ; i++) {
                result [a.length+i]=b[i];
            }
            return result;
        }

        //5.数组截取
        //[start, end)
        // A {1,3,5,7,9} ->(A,1,4) > {3,5,7}
        public static int[] arraySub(int[] data, int start , int end){
            int[] result=new int[end-start];//新数组result的长度end-start
            int flag=0;
            for (int i = start; i <end ; i++) {
                result[flag]=data[i];
                flag++;
            }
            return result;
        }

        //6.数组打印
        public static void printArray(int[] data){
            for (int i :data) {
                System.out.print(i+"、");
            }
        }

        //7.数组反转,从后往前打印
        // 比如：[1,2,3,4] => [4,3,2,1]
        public static void printReversal(int[] data){
            for (int i = data.length-1; i >=0; i--) {
                System.out.print(data[i]+"、");
            }
        }

        public static void main(String[] args){
           /* int[] data=new int[]{1,3,5,7,9};
            System.out.println(arrayMaxElement(data));
            System.out.println(arrayMinElement(data));
            System.out.println(arrayElementSum(data));*/
            /*int[] A=new int[]{1,3,5,7,9};
            int[] B=new int[]{2,4,6,8,10};
            int[] result=arrayJoin(A, B);*/
            int[] A=new int[]{1,3,5,7,9};
            /*int[] result=arraySub(A,1,4);
            printArray(result);*/
            printReversal(A);
        }

}
