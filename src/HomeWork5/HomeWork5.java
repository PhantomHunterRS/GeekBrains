package HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println(exponentiation(5,3));
        int [] array = new int []{-10,20,25,26,40,45,75,80,82,91};
        binaryFind(-45,array);
    }
    // exponentiation number
    public static int exponentiation(int x,int n){
        if (n==1){
            return x;
        }return x*exponentiation(x,n-1);
    }
    // update BinaryFind from Recursion

    public static void binaryFind(int search,int [] array) {
        int result = recBinaryFind(search,0,array.length-1,array);
        if (result == -1){
            throw new NotFoundSearch("search key not found in array");
        }else{
            System.out.println("True "+ result);
        }
    }
    private static int recBinaryFind(int searchKey,int low,int high,int [] array)  {
        int curIn;
        curIn = (low+high)/2;
        if (array[curIn] == searchKey) {
            return curIn;
        }else{
            if (low > high){
                    //;
                return -1;
            }else
                if (array[curIn]<searchKey){
                    return recBinaryFind(searchKey,curIn+1,high,array);
                }else {
                    return recBinaryFind(searchKey,low,curIn-1,array);
                }
        }
    }

}
