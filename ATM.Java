import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ATM");
        System.out.println("1.ADMIN");
        System.out.println("2.USER");
        System.out.println("3.EXIT");
        System.out.println("CHOOSE ANY OPTION 1,2 or 3:");
        int s=sc.nextInt();
        if(s==1) {
            System.out.println("WELCOME TO ADMIN PAGE");
            System.out.println("Login to admin");
             System.out.println("ENTER THE USERNAME");
            String ID=sc.next();
            sc.nextLine();
            System.out.println("ENTER THE PASSWORD");  
            int Password=sc.nextInt();
           
            if(ID.equals("Admin")&& Password==4321)
            {
                System.out.println("WELCOME TO ADMIN!!!");
                int RS100=sc.nextInt();
                System.out.println("ENTER THE RS100");
                int RS200=sc.nextInt();
                System.out.println("ENTER THE RS200");
                int RS500=sc.nextInt();
                System.out.println("ENTER THE RS500");
                int RS2000=sc.nextInt();
                System.out.println("ENTER THE RS2000");
            }
        }
        else if(s==2) {
            System.out.println("LOGIN");
            System.out.println("ENTER YOUR NAME");
            String name1=sc.next();
            System.out.println("ENTER THE PASSWORD");
            int passw=sc.nextInt();
            int e=3434;
           
            if(name1.equals("Sandhiya")&&passw==e){
                System.out.println("WELCOME"+name1);
                System.out.println("1.WITHDRAW");
                System.out.println("2.CHECK BALANCE");
                System.out.println("3.PIN CHANGE");
                System.out.println("4.DIRECT DEPOSIT");
                System.out.println("5.AMOUNT TRANSFER");
                System.out.println("PRESS ANY OPTION 1,2,3,4 or 5:");
                int d=sc.nextInt();
                int bal=4000;
                    if(d==1){
                        System.out.println("ENTER THE AMOUNT DETAILS BELOW!!");
                        int w=sc.nextInt();
                        System.out.println(w);
                    }
                    if(d==2)
                    {
                        System.out.println("TO CHECK BALANCE ,PRESS 2 AGAIN");
                        int ss=sc.nextInt();
                        System.out.println("YOUR CURRENT BALANCE IS"+bal);
                    }
                   
                       
                    if(d==3)
                    {
                        System.out.println("TO CHANGE PIN,PRESS 3 AGAIN");
                        System.out.println("ENTER YOUR OLD PIN");
                        int f=sc.nextInt();
                        if(f==3434)
                        {
                            System.out.println("ENTER YOUR NEW PIN");
                                int newpassword=sc.nextInt();
                        }
                        else
                        {
                        System.out.println("PRESS VALID NUMBER");
                        }
                    }
                   else if(name1.equals("Sandhiya")&&passw!=3434)
                   {
            System.out.println("INVALID PASSWORD.PLEASE CHECK YOUR PASSWORD.!");
                    }
                   
                   else if(s==3)
                   {
            System.out.println("LOGOUT SUCCESSFUL");
           sc.close();
                 }
       
               
           
        }
    }
    }
    }