import java.util.Calendar;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calc theCalc = new Calc();

        System.out.print("Input first integer: ");
        int m_a = input.nextInt();
        System.out.print("Input next integer: ");
        int m_b = input.nextInt();

        System.out.print("Input what to do with the to numbers: ");
        String cmd = input.next();

        if(cmd.equals("add")||cmd.equals("+")){
            System.out.println(theCalc.add(m_a,m_b));
        }else if(cmd.equals("sub")||cmd.equals("-")){
            System.out.println(theCalc.sub(m_a,m_b));
        }else if(cmd.equals("multi")||cmd.equals("*")){
            System.out.println(theCalc.multi(m_a,m_b));
        }else if(cmd.equals("divi")||cmd.equals("/")){
            System.out.println(theCalc.divi(m_a,m_b));
        }else{
            System.out.println(theCalc.secret(m_a,m_b));
        }
    }
}
