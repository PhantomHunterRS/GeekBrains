package HomeWork5;

public class ClassWork5 {


    public static long fibo(int x){
        if (x < 3){
            return 1;
        }
        return fibo(x-2)+ fibo(x-1);
    }
    public static float goldSection(int x){
        return (float)fibo(x+1)/fibo(x);
    }
}
