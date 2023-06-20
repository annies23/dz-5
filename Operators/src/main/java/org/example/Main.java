package org.example;

public class Main {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;

        //2. Сумує їх попарно.
        int intSum1 = number1 + number2;
        System.out.println(number1 +" + " + number2 + " = " + intSum1);
        int intSum2 = number3 + number4;
        System.out.println(number3 +" + " + number4 + " = " + intSum2);

        //3.Виводить результат порівняння (true якщо перша сума менша).
        boolean compareVal1 = intSum1 < intSum2;
        System.out.println("Compare Result 1: " + compareVal1);

        //4. Збільшує першу суму на 1.
        int intSum3 = intSum1;
        int postIncrement = intSum3 ++;
        System.out.println(intSum1 + " + 1 = " + intSum3);

        //5.Другу суму зменшує на 2.
        int intSum4 = intSum2;
        intSum4 -= 2;
        System.out.println(intSum2 + " - 2 = " + intSum4);

        //6. Виводить результат порівняння сум (true, якщо перша сума більша).
        boolean compareValue2 = intSum3 > intSum4;
        System.out.println("Compare Result 2: " + compareValue2);

        //7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
        boolean anySumIsEven = intSum3 % 2 == 0 || intSum4 % 2 == 0; {
           System.out.println("Is there any even sum? " + anySumIsEven);
        }

        /* Для себе пробувала з використанням if
        boolean isFirstSumEven = intSum3 % 2 == 0;
        boolean isSecondSumEven = intSum4 % 2 == 0;
        if ((intSum3 % 2) == 0 || (intSum4 % 2) == 0) {
            System.out.println("true");
        }
        */


    }
}