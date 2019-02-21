package calcconsole;

import java.util.Scanner;

public class CalcConsole {
    
    public static void main(String[] args) throws Exception {
        try { 
            Scanner in = new Scanner(System.in);
            System.out.print("Input a string: ");
            String str = in.nextLine().toUpperCase();
            int rezult;
            String[] argsLine = argsToStringArray(str);
            
            if ("roman".equals(romanOrNumber(argsLine[0],argsLine[2])))
            {
                if (RomanNumber.isRoman(argsLine[0]) & RomanNumber.isRoman(argsLine[2]))
                {
                    rezult = arifmeticArg(RomanNumber.fromRomanToInt(argsLine[0]),RomanNumber.fromRomanToInt(argsLine[2]),argsLine[1]);
                    System.out.println("Roman rezult - " + rezult); 
                    System.out.println("Roman rezult - " + RomanNumber.fromIntToRoman(rezult)); 
                }
            }
            if ("number".equals(romanOrNumber(argsLine[0],argsLine[2])))
            {
                rezult = arifmeticArg(Integer.parseInt(argsLine[0]),Integer.parseInt(argsLine[2]),argsLine[1]);
                System.out.println("rezult - " + rezult); 
            }            
           
            //System.out.println(validString(str));
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe);
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    static int arifmeticArg(int a1, int a2, String oper) throws Exception
    {
        int rez = 0;
        switch (oper)
        {
            case "+": rez = a1+a2;
                break;
            case "-": rez = a1-a2;
                break;            
            case "*": rez = a1*a2;
                break;            
            case "/": 
            {
                if (a2 == 0 )
                {
                    throw new Exception ("Divide by zero");
                }
                else
                {
                    rez = a1/a2;
                }
                break;
            }               
        }
        
        return rez;
    }
    
    static String[] argsToStringArray(String s) throws Exception
    {

        s = s.replace(" ", "");
        s = s.replace("+", " + ");
        s = s.replace("-", " - ");
        s = s.replace("/", " / ");
        s = s.replace("*", " * ");        

        String[] words = s.split(" ");
        if (words.length % 2 ==0 || words.length<2) { 
            throw new Exception ("Error count of arguments");
        }
        return words;
    }
    
    static String romanOrNumber(String arg1,String arg2) throws Exception
    {
        if (strOrNum(arg1) == null ? strOrNum(arg2) == null : strOrNum(arg1).equals(strOrNum(arg2)))
        {
            return strOrNum(arg1);
        }
        else
        {
            throw new Exception("Error: different arguments"); 
        }
    }
    
    static String strOrNum (String str)
    {
        Boolean argIsNumber = false;
        char [] arChar = str.toCharArray();
        for (int i=0;i<arChar.length;i++)
        {
            argIsNumber = Character.isDigit(arChar[i]);
        }
        if (argIsNumber) 
        {
            return "number";
        }
        else 
        {
            return "roman";
        }
    }
 
    
    static class RomanNumber {
        public RomanNumber(){}
	static String [] romanLetters = {"M","D","C","L","X","IX","V","IV","I"};
        static int [] numbers  = {1000,500,100,50,10,9,5,4,1};
 
        public static Boolean isRoman(String str)
        {
            Boolean b = false;
            if (fromRomanToInt(str)>0) b = true;
            return b;
        }
        
	public static int fromRomanToInt(String str) throws NumberFormatException
	{
            int newIntValue = 0;
            int romNum = 2000;
            for (int i = 0; i < str.length(); i++)
            {
                int num = fromLetToNumber(str.charAt(i));
                if ( num == -1)
                {
                    throw new NumberFormatException("Error number format");
                }
                if (romNum<num)
                num = num - romNum - 1;
                newIntValue += num;
                romNum = num;
            }
            return newIntValue;
	}
	public static int fromLetToNumber(char l)
	{
            switch (l) {
                case 'M':  return 1000;
                case 'D':  return 500;
                case 'C':  return 100;
                case 'L':  return 50;
                case 'X':  return 10;
                case 'V':  return 5;
                case 'I':  return 1;
                default:   return -1;
            }
	}
	public static String fromIntToRoman(int num)
	{
            String newRomanValue = "";
            for (int index = 0; index < numbers.length; index++) {
              while (numbers[index] <= num) {
                newRomanValue += romanLetters[index];
                num -= numbers[index];
              }
            }            
          
            return newRomanValue;
	}
    }
}

