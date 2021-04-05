package ru.netology.stats;
public class StatisticService {

    public int sum(int[] items) {
        int sum = 0;
        for (int item : items) {
            sum += item;
        }
        return sum;
    }

    public int avg(int[] items) {
        return sum(items) / items.length;
    }

    public int NumberWithMax(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (item > max)
                max = item;
        }
        int monthCount = 0;
        int resultMonth = 0;
        for (int item : items) {
            monthCount++;
            if (item == max) {
                resultMonth = monthCount;
            }
        }
        return resultMonth;
    }

    public int NumberWithMin(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (item <= min)
                min = item;
        }
        int monthCount = 0;
        int resultMonth = 0;
        for (int item : items) {
            monthCount++;
            if (item == min) {
                resultMonth = monthCount;
            }
        }
        return resultMonth;
    }

    public int moreThanAvg(int[] items) {
        int monthCount = 0;

        int avg = avg(items);
        for (int item : items) {
            if (item > avg) {
                monthCount++;
            }

        }
        return monthCount;
    }

    public int lessThanAvg(int[] items) {
        int monthCount = 0;

        int avg = avg(items);
        for (int item : items) {
            if (item < avg) {
                monthCount++;
            }

        }
        return monthCount;
    }
}










