import java.io.*;
import java.util.*;
public class bitwiseoperator
{
    public static void main(String args[])
    {
        int num1 = 3;
        int num2 = 1;
        int result = 0;

        result = num1 & num2;
        System.out.println("num1 & num2 = "+result);

        result = num1 | num2;
        System.out.println("num1 | num2 = "+result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2 = "+result);

        result = num1 << num2;
        System.out.println("num1 << num2 = "+result);

        result = num1 >> num2;
        System.out.println("num1 >> num2 = "+result);

        result = num1 >>> num2;
        System.out.println("num1 >>> num2 = "+result);
    }
}