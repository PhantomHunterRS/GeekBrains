package HomeWork5.BackPack;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<Item> itemArrayList = null;
    private int bestPrice;
    private int maxWeight;

    public Backpack(int weight) {
        this.maxWeight = weight;
    }
    public int getWeight() {
        return maxWeight;
    }

    private int calcWeight(ArrayList<Item> itemArrayList){
        int sumWeight = 0;
        for (Item x:itemArrayList) {
            sumWeight += x.getWeight();
        }
        return sumWeight;
    }
    private int calcPrice(ArrayList<Item> itemArrayList){
        int sumCost = 0;
        for (Item x:itemArrayList) {
            sumCost += x.getCost();
        }
        return sumCost;
    }
    private void checkSet(ArrayList<Item> itemArrayList){
        if (this.itemArrayList == null){
            if(calcWeight(itemArrayList)<=maxWeight){
                this.itemArrayList = itemArrayList;
                bestPrice = calcPrice(itemArrayList);
            }
        }else {
            if (calcWeight(itemArrayList) <= maxWeight && calcPrice(itemArrayList)>bestPrice){
                this.itemArrayList = itemArrayList;
                bestPrice = calcPrice(itemArrayList);
            }
        }
    }
    public void makeAllSets(ArrayList<Item> itemList){
        if (itemList.size()>0){
            checkSet(itemList);
            for (int i = 0; i <itemList.size() ; i++) {
                ArrayList<Item> newSet = new ArrayList<Item>(itemList);
                newSet.remove(i);
                makeAllSets(newSet);
            }
        }
    }
    public ArrayList<Item> getBestSet(){
        return itemArrayList;
    }
}
