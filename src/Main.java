import com.exadel.lab.CheapPurchase;
import com.exadel.lab.GoodPurchase;
import com.exadel.lab.Purchase;

public class Main {

    /*
     * Создание массива покупок из 6 товаров
     */
    public static void main(String[] args) {

        Purchase [] listPurchase = {
                new Purchase("Blackboard",200,5),
                new Purchase("Table",100,34),
                new CheapPurchase("Workbook",60,67,15),
                new CheapPurchase("Book",15,56,10),
                new GoodPurchase("Pen",30,40,23.4),
                new GoodPurchase("Pencil",20,5,45.3)
        };
        /*
         * Печать созданного списка на консоль
         * Определение максимальной стоимости покупки
         *
         */
        int maxCost = 0;
        String result = "All purchases are equal!";
        System.out.println("Print the array content to the console ");
        for (int i = 0; i < listPurchase.length; i++){
            System.out.println(listPurchase[i]);
            if (listPurchase[i].getCost() > maxCost) {
                maxCost = listPurchase[i].getCost();
            }
            if ( i != listPurchase.length - 1)
                if (!listPurchase[i].equals(listPurchase[i+1]))
                    result = "All purchases are not equal!";

        }
        System.out.println("Print the maximum cost purchase");
        System.out.println(maxCost);
        System.out.println(result);
    }
}
