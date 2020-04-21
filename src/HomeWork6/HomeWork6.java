package HomeWork6;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        testBalance(5);
        testBalance(7);

    }
    static void testBalance(int x){
        int balanced = 0;
        int size = 10000;
        Random random = new Random();
        MyTreeMap<Integer,String>[] treeMaps = new MyTreeMap[size];
        for (int i = 0; i < treeMaps.length ; i++) {
            treeMaps[i] = new MyTreeMap<Integer, String>();
            while(treeMaps[i].height()<x){
                treeMaps[i].put(random.nextInt(200),"");
            }
            if (treeMaps[i].isBalance()){
                balanced++;
            }
        }
        System.out.println("Level Tree - " + x);
        System.out.println("Balanced \t" + balanced + " pieces");
        System.out.println("Balanced \t" + ((double)balanced/size)*100 + "%");
        System.out.println("NoBalanced \t" + (100 -((double)balanced/size)*100 + "%" ));
        System.out.println();
    }
}
