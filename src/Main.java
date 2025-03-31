public class Main {
    public static void main(String[] args) {
        int targetAmount = 2459000;
        int monthlyDeposit = 15000;
        int currentSavings = 0;
        int monthsCount = 0;
        while (currentSavings < targetAmount) {
            currentSavings += monthlyDeposit;
            monthsCount += 1;
        }
        System.out.println("Месяц " + monthsCount + ", сумма накоплений равна " + currentSavings + " рублей");

        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        for (int number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        int citizens = 12000000;
        int birthFactor = 17;
        int deathFactor = 8;
        for (int currentYear = 1; currentYear <= 10; currentYear++) {
            int newborns = (citizens * birthFactor) / 1000;
            int deceased = (citizens * deathFactor) / 1000;
            citizens += newborns - deceased;
            System.out.println("Год " + currentYear + ", численность населения составляет " + citizens);
        }

        int initialFriday = 5;
        int monthLength = 31;
        for (int currentDay = initialFriday; currentDay <= monthLength; currentDay += 7) {
            System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет.");
        }

        int referenceYear = 2025;
        int pastLimit = referenceYear - 200;
        int futureLimit = referenceYear + 100;
        for (int pastYear = pastLimit; pastYear <= referenceYear; pastYear++) {
            if (pastYear % 79 == 0) {
                System.out.println(pastYear);
            }
        }
        for (int futureYear = referenceYear; futureYear <= futureLimit; futureYear++) {
            if (futureYear % 79 == 0) {
                System.out.println(futureYear);
                break;
            }
        }
    }
}