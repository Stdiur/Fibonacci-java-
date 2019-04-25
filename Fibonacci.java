package 文件类操作;
import java.math.BigInteger;
import java.util.Scanner;
public class Fibonacci{
    public static BigInteger fo(int num){
        BigInteger nextF = BigInteger.ONE;
        BigInteger thisF = BigInteger.ONE;
        BigInteger temp = BigInteger.ZERO;
        for(int i = 1; i <= num; ++i){
            if(i <= 2)
            	nextF = BigInteger.ONE;
            else{
            	temp = nextF;
            	nextF = nextF.add(thisF);
            	thisF = temp;
            }
        }
        return nextF;
    }
    public static void main(String[] args){
        System.out.print("请输入数列个数：");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            for(int i=1;i<=num;++i){
            	System.out.println("Fibonacci.fo(" + i + ") == " + Fibonacci.fo(i));
            }
        }
    }
}