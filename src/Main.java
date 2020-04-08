public class Main {
    public static void main(String[] args) {
        //task #1
        int [] arrayM = createArray(1000000);
        // task #2
        int [] array = new int[]{2,4,6,8,10,12};
        int [] newArray = deleteElementsArray(array,3);
        printArrayInfo(array);
        printArrayInfo(newArray);
        int [] newArray2 = addElementsArray(array,14,2);
        printArrayInfo(newArray2);
        searchArray(array,6);
        // task #3
        int [] newArray3 = fillingRandomNumbers(240);
        //printArrayInfo(newArray3);
        //task #4
        // quickSort
        qSort(newArray3);
        //printArrayInfo(newArray3);
        int [] newArrayBubble = fillingRandomNumbers(10);
        printArrayInfo(newArrayBubble);
        bubbleSort(newArrayBubble);
        printArrayInfo(newArrayBubble);
    }
    public static int [] createArray(int size){
        int [] array = new int[size];
        return array;
   }
    public static int [] deleteElementsArray(int []array, int elementDelete){
        int [] newArray = new int[array.length-1];
       for (int i = 0; i <array.length-1 ; i++) {
           if (i >= elementDelete){
               newArray[i] = array[i+1];
           }else {
               newArray[i] = array[i];
           }
       }
        return newArray;
   }
    public static int [] addElementsArray(int []array, int addElement, int position){
        int [] newArray = new int[array.length+1];
        for (int i = 0; i <array.length+1 ; i++) {
            if (i == position){
                newArray[i] = addElement;
            }else if (i > position){
                newArray[i] = array[i-1];
            }else{
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
    public static void searchArray(int [] array,int element){
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==element){
                System.out.println("Element found on position " + i);
            }
        }
    }
    public static void printArrayInfo(int[]array){
        System.out.print("Array size - " + array.length + ": ");
        for (int x :array ) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
    public static int [] fillingRandomNumbers(int size){
        int [] array = createArray(size);
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int)(Math.random()*size -size/2);
        }
        return array;
    }
    static void qSort(int [] array){
        long time = System.currentTimeMillis();
        quickSort(array,0,array.length-1);
        System.out.println("Execution Time Quick Sorting:" + (System.currentTimeMillis()-time));
    }
    private static void quickSort(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int supportElement = array[(left + right) / 2];
        do {
            while ((array[i] < supportElement && (i < right))) i++;
            while ((supportElement < array[j] && (j > left))) j--;
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        } while (i <= j); {
            if (left < j) quickSort(array, left, j);
            if (i < right) quickSort(array, i, right);
        }
    }
    public static void bubbleSort(int [] array){
        long time = System.currentTimeMillis();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
        System.out.println("Execution Time Bubble Sorting:" + (System.currentTimeMillis()-time));
    }
}
