import java.io.*;
import java.util.*;

interface bank {
    public void Askname();

    public void AskphoneNo();

    public void AskEmpId();

    public void AskAddress();

    public void Askloan();

    // public void AskMyBalance();
    // public void Display();
    public void Balances();
}

class NBNK implements bank {
    public String firstname, lastname;
    public long EmpId, phoneno;
    public List address = new ArrayList();
    public long MyBalance, ParentBalance;

    Scanner sc = new Scanner(System.in);

    @Override
    public void Askname() {
        System.out.println("Enter firstname");
        String s = sc.nextLine();
        this.firstname = s;
        System.out.println("Enter lastname");
        s = sc.nextLine();
        this.lastname = s;

    }

    @Override
    public void AskphoneNo() {
        System.out.println("Enter phonenNo");
        this.phoneno = Long.parseLong(sc.nextLine());

    }

    @Override
    public void AskEmpId() {
        System.out.println("Enter EmpId");
        this.EmpId = Long.parseLong(sc.nextLine());

    }

    @Override
    public void AskAddress() {
        System.out.println("Enter Address");
        System.out.println("Enter HouseNo");
        String HouseNo = sc.nextLine();
        address.add(HouseNo);
        System.out.println("Enter Pincode");
        long pincode = Long.parseLong(sc.nextLine());
        address.add(pincode);

    }

    @Override
    public void Balances() {
        System.out.println("Enter your balance");
        this.MyBalance = Long.parseLong(sc.nextLine());
        System.out.println("Enter parents balance");
        this.ParentBalance = Long.parseLong(sc.nextLine());

    }

    @Override
    public void Askloan() {
        String[] loanTypes = { "house", "education", "personal", "travel" };
        System.out.println("Enter type loan");
        System.out.println(loanTypes.toString());
        String s = sc.nextLine();
        System.out.println("Enter loan amount");
        long loanamount = Long.parseLong(sc.nextLine());

        switch (s) {
        case "house":
            if (this.MyBalance >= 1000000 && loanamount <= Math.pow(10, 7)) {
                System.out.println("Loan of C.I. of 6% House loan term of 5 years amount of-" + loanamount);
            } else {
                System.out.println("Not eligible for loan");
            }
            break;
        case "education":
            if (this.MyBalance >= 500000 && loanamount <= Math.pow(10, 7)) {
                System.out.println("Loan of C.I. of 8% Education loan term of 6 years amount of-" + loanamount);
            } else {
                System.out.println("Not eligible for loan");
            }
            break;
        case "personal":
            if (loanamount <= Math.pow(10, 7)) {
                System.out.println("Loan of C.I. of 5% Personal loan term of 1 years amount of-" + loanamount);
            } else {
                System.out.println("Not eligible for loan");
            }
            break;
        case "travel":
            if (this.MyBalance >= 5000000 && loanamount <= Math.pow(10, 7)) {
                System.out.println("Loan of S.I. of 1% Travel loan term of 1 years amount of-" + loanamount);
            } else {
                System.out.println("Not eligible for loan");
            }
            break;

        }

    }

}

public class NGUIbank {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        NBNK obj = new NBNK();
        obj.Askname();
        obj.AskphoneNo();
        obj.AskEmpId();
        obj.AskAddress();
        obj.Balances();
        obj.Askloan();

    }

}