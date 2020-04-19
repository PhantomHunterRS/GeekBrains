package HomeWork2;

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
        //snake
        int [][] newArray4 = spiral(6,10);
        printDoubleMatrix(newArray4);
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
    public static int [][] spiral(int row, int col){
        int sequence = 1;
        int direction = 0;
        int iteration = 0;
        int [][] arraySriral = new int[col][row];
        for (int i = 0; sequence <= row*col; i++) {
            direction = i%4;
            iteration = i/4;
            switch (direction){
                case 0:
                    for (int j = iteration; j < row - iteration ; j++ , sequence++) {
                        arraySriral[iteration][j] = sequence;
                    }
                    break;
                case 1:
                    for (int j = iteration + 1; j < col - iteration ; j++, sequence++) {
                        arraySriral[j][row - iteration - 1] = sequence;
                    }
                    break;
                case 2:
                    for (int j = row - iteration -2; j >= iteration ; j--,sequence++) {
                        arraySriral[col - iteration - 1][j] = sequence;
                    }
                    break;
                case 3:
                    for (int j = col - iteration - 2; j > iteration ; j--,sequence++) {
                        arraySriral[j][iteration] = sequence;
                    }
                    break;
            }
        }
        return arraySriral;
    }
    public static void printDoubleMatrix(int [][]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
