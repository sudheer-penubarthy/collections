package com.samples;

/**
 * Created by sudheer on 28/3/15.
 */
public class StringToInt {
    public static void main(String[] args) {

        String numStr = "12345";
        int zeroAscii = 48;
        int nineAscii = 57;

        int length = numStr.length();
        char[] charArr = numStr.toCharArray();
        int total = 0;
        int index=length-1;
        for(int i=0;i<length;i++){
            int acsiiVal = (charArr[index]-zeroAscii);
            if(acsiiVal > nineAscii){
                System.out.println("String contains non numericals...");
                break;
            }
            total = (int) (total + acsiiVal*Math.pow(10, i));
            index--;
            System.out.println("subtotal : "+total);
        }

        System.out.println(total);
    }
}
