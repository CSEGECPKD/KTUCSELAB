/*
A vegetable shop is using a java program to sell and stock vegetables(eg. beans, gaurd, cucumber and cabbage).  This program has the functionality to sell as well as take stock.  Now they want to start selling fruits(2 items) also. While selling the stoek will be reduced accordingly and on taking stoke it should be updated. Extend the class they have already implemented and override the sell and stock methods.
*/

class VegetableShop {
    protected Map<String, Integer> stock = new HashMap<>();

    public void sell(String item, int quantity) {
        int currentStock = stock.getOrDefault(item, 0);
        if (currentStock < quantity) {
            System.out.println("Not enough stock for " + item);
            return;
        }
        stock.put(item, currentStock - quantity);
    }

    public void addStock(String item, int quantity) {
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }
}

class FruitShop extends VegetableShop {
    @Override
    public void sell(String item, int quantity) {
        super.sell(item, quantity);
        System.out.println("Sold " + quantity + " of " + item);
    }

    @Override
    public void addStock(String item, int quantity) {
        super.addStock(item, quantity);
        System.out.println("Added " + quantity + " of " + item + " to stock");
    }
}