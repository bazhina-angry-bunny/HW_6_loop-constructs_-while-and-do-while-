public class Main {
    public static void main(String[] args) {
        {
            System.out.println(" ");
            System.out.println("Задача №1");

            int amountDeposit = 15_000;
            int total = 0;
            int i = 0;
            while (total <= 2_469_000) {
                total = total + total / 100;
                total = total + amountDeposit;
                i++;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        {
            System.out.println(" ");
            System.out.println("Задача №2");

            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
            for ( ; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println(" ");
            System.out.println("Задача №3");

            int population = 12_000_000;
            int fertilityPerThousandPeople = 17 * (population / 1000);
            int mortalityRatePerThousandPeople = 8 * (population / 1000);
            int populationChange = fertilityPerThousandPeople - mortalityRatePerThousandPeople;

            for (int time = 0; time < 10; ) {
                time++;
                population = population + populationChange;
                System.out.println("Через " + time + " год, численность населения составляет " + population);
            }
        }
        {
            System.out.println(" ");
            System.out.println("Задача №4");

            int monthlyAmount = 15000;
            int total = 0;

            for (int i = 1; total <= 12_000_000; i++) {
                total = total + total * 7 / 1000;
                total = total + monthlyAmount;

                System.out.println("За " + i + " месяцев сумма вклада составит " + total + " рублей");
            }
        }
        {
            System.out.println(" ");
            System.out.println("Задача №5");

            int monthlyAmount = 15000;
            int total = 0;
            int i = 0;

            while (total <= 12_000_000) {
                total = total + total * 7 / 1000;
                total = total + monthlyAmount;
                i++;
                if (i % 6 != 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.println("За " + i + " месяцев сумма вклада составит " + total + " рублей");
            }
        }
        {
            System.out.println(" ");
            System.out.println("Задача №6");

            int year = 9;
            int monthsInYear = 12;
            int depositPeriodIn = year * monthsInYear;
            System.out.print("Период до закрытия вклада " + depositPeriodIn + " месяцев.");
            System.out.println(" ");
            int monthlyAmount = 15000;
            int total = 0;
            int i = 0;

            while (i <= depositPeriodIn) {
                total = total + total * 7 / 1000;
                total = total + monthlyAmount;
                i++;
                if (i % 6 != 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.println("За " + i + " месяцев сумма вклада составит " + total + " рублей");
            }
        }
        {
            System.out.println(" ");
            System.out.println("Задача №7");

            int friday = 2;

            for ( ; friday < 31; friday = friday + 7) {
                System.out.println("Сегодня пятница " + friday + " число. Необходимо делать отчет.");
            }

        }
        {
            System.out.println(" ");
            System.out.println("Задача №8");

            int year = 2024;
            int firstTimePeriod = year - 200;
            int secondTimePeriod = year + 100;

            for (int i = firstTimePeriod; i >= firstTimePeriod & i <= secondTimePeriod;  i = i + 79) {
                System.out.println(i);
            }

        }


    }
}