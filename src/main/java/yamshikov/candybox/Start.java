package yamshikov.candybox;

import yamshikov.candybox.candy.Candy;
import yamshikov.candybox.candy.Chocolate;
import yamshikov.candybox.candy.Ice;
import yamshikov.candybox.candybox.CandyBox;

import java.util.Arrays;
import java.util.Random;

public class Start {
    private final static int arraySize = 20;

    public static void main(String[] args) {
        //Задание на рандом
        changeMaxMin(getRandomArray());


        //Задание на ООП
        Chocolate chocolate1 = new Chocolate("Аленка", 70.50,90, "Россия");
        Chocolate chocolate2 = new Chocolate("АльпенГольд", 50.00,90, "Германия");
        Candy ice = new Ice("Башкирское мороженное", 50.99, 80, "Шоколадное");

        CandyBox box = new CandyBox(chocolate1, ice);
        box.addCandyInBox(chocolate2);
        System.out.println("Стоимость подарка = " + box.getPriceBox());
        System.out.println("Вес подарка = " + box.getWeightBox());
        System.out.println(box);

    }


    private static int[] getRandomArray() {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static int[] changeMaxMin(int[] array){
        int[] arrayOut = new int[arraySize];
        int maxNegative = -11;
        int iMaxNegative = 0;
        int minPositive = 11;
        int iMinPositive = 0;

        for (int i = 0; i < arraySize; i++){
            if ((array[i]<0)&&(array[i]!=0)){
                if (maxNegative<array[i]){
                    maxNegative = array[i];
                    iMaxNegative = i;
                }
            }
            if ((array[i]>0)&&(array[i]!=0)) {
                if (minPositive>array[i]){
                    minPositive = array[i];
                    iMinPositive = i;
                }
            }
        }

        array[iMaxNegative] = minPositive;
        array[iMinPositive] = maxNegative;
        System.out.println("minPositive = " + minPositive);
        System.out.println("maxNegative = " + maxNegative);
        System.out.println(Arrays.toString(array));
        return array;
    }



}
