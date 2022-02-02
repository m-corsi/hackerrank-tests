package com.mcorsi.tests;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class HackerRankTests {

     public static void miniMaxSum(List<Integer> arr) {

         Long minSum = 0L;
         Long maxSum = 0L;

         //Sort list
         List<Long> sortedArr = arr.stream()
                 .sorted()
                 .collect(Collectors.toList()).stream()
                 .mapToLong(Integer::longValue)
                 .boxed()
                 .collect(Collectors.toList());
         Long[] numbers = sortedArr.stream().toArray(Long[]::new);

         //Min sum
         for(int i = 0; i < numbers.length-1; i++){
             minSum += numbers[i];
         }

         //Max sum
         for(int i = 1; i < numbers.length; i++){
             System.out.println(numbers[i]);
             maxSum += numbers[i];

         }

         System.out.println(minSum + " " + maxSum);

    }

    public static String timeConversion(String s) {
        //Format of the date defined in the inpiut string
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");

        Date date = null;
        try {
            date = parseFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return displayFormat.format(date);

    }

    public static int lonelyinteger(List<Integer> a) {

        int result = 0;

        int[] integerArray = a.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < integerArray.length; i++) {
            result = result ^ integerArray[i];
        }

        System.out.println(result);
        return result;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        int listSize = arr.size();

        for(int i = 0; i < listSize; i++) {
            leftDiagonal = leftDiagonal + arr.get(i).get(i);
            rightDiagonal = rightDiagonal +  arr.get(i).get(i-listSize-1);
        }

        int absoluteSum = Math.abs(leftDiagonal + rightDiagonal);
        return absoluteSum;
    }

}
