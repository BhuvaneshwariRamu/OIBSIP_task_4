package com.onlineExam;
import java.util.*;
import java.util.Scanner;
public class Myexam {
    Scanner sc = new Scanner(System.in);
    int count=0;
    int ans;
    String Name;
    String Username;
     String Password;
public static void main(String[] args)
{
Myexam obj=new Myexam();
Scanner sc=new Scanner(System.in);
System.out.println("welcome to java online examination");
System.out.println("1.create account  \t 2.exit");
 System.out.println("----------------------------------------------------------------------- \n");
 System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
	obj.Account_SignUp();
                break;
            }
            case 2: {
                System.exit(0);
            }
        }
    System.out.println(" \t >>> Press 1 To LOGIN \n \t >>> Press 2 TO EXIT ");
        System.out.println("----------------------------------------------------------------------- \n");
        System.out.println("Enter Your Choice : ");
        int choice1 = sc.nextInt();

        switch (choice1)
        {

            case 1: {
                obj.Account_Login();
            }

            case 2: {
                System.exit(0);
            }
        }
}

		void Account_SignUp() {
        System.out.println("Enter Your Name : ");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        this.Name = sc.nextLine();
        System.out.println(">>>>>>>>>>>>>>>>>> n");
        System.out.println("Enter Your UserName  : ");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        this.Username = sc.nextLine();
        System.out.println(">>>>>>>>>>>>>>>>>>\n");
        System.out.println("Enter Your Password : ");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        this.Password = sc.nextLine();
System.out.println("---------------------------!! Registration Completed ! Thanks For Registering.. !! --------------------------------- \n");


    }
   void Account_Login() {

       while (true)
       {
           System.out.println("Enter Your Username : ");
           System.out.println(">>>>>>>>>>>>>>>>>>");
           String Username1 = sc.nextLine();
           System.out.println(">>>>>>>>>>>>>>>>>>\n");

           if (Username1.equals(Username))
           {
               while (true)
               {
                   System.out.println("Enter Your Password : ");
                   System.out.println(">>>>>>>>>>>>>>>>>>");
                   String Password1 = sc.nextLine();
                   System.out.println(">>>>>>>>>>>>>>>>>>\n");

                   if (Password1.equals(Password)) {
                       System.out.println(" ********** !! Login Successful !! *********** \n");
                       update();
                       break;
                   } else {
                       System.out.println(" ********* !! Incorrect Password !! ************* \n");
                   }
               }
           } else {
               System.out.println(" ************ !! Incorrect Username !! ************* \n");
           }
           break;

       }
  }
   		
void update(){
    
	while(true) {
			System.out.println("Do you want to Update your profile? Y/N");
			char userChoice = sc.next().charAt(0);
			switch (userChoice) {
  case 'y':
	  System.out.println("Change username:");
	  String newUsername=sc.next();
	  Username=newUsername;
	  System.out.println("Change password:");
	  String newPassword=sc.next();
	  Password=newPassword;
	  System.out.println("the updated profile is:");
	  System.out.println("new username:"+newUsername);
	  System.out.println("new password:"+newPassword);
	  System.out.println("-------------------------------");
	  startTest();
      break;

  case 'n':
      
      startTest();
      break;

  default:
      System.out.println("That is not a valid entry");
      break;
			}
	break;		
	}

}

void startTest()
{

 System.out.println("There are 5 questions in the examination");
System.out.println("Each question consist of 4 option you have to choose correct answer");
 	System.out.println("Q.1.Java is developed by:");
                
                System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                ans=sc.nextInt();
                if(ans==1)
                {
                    ++count;
                }
                System.out.println("Q.2.Java is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                ans=sc.nextInt();
                if(ans==1)
                {
                    ++count;
                }
                  System.out.println("Q.3.Java is:");
                System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                 System.out.print("Enter answer:");
                ans=sc.nextInt();
                  if(ans==2)
                {
                    ++count;
                }
                  System.out.println("Q.4.Technical Name of Core Java is knon as:");
                System.out.println("1.JSE\n2.JEE\n3.J2SE\n4.J2EE");
                 System.out.print("Enter answer:");
                ans=sc.nextInt();
                  if(ans==1)
                {
                    ++count;
                }
                  System.out.println("Q.5.Java is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                 System.out.print("Enter answer:");
                ans=sc.nextInt();
                
                  if(ans==3)
                {
                    ++count;
                }
	System.out.println("Congrats !, "+Name+"  You scored "+count+"marks out of 5");
	
}
}
}
