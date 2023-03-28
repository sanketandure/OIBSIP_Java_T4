import java.util.*;

public class online_examination{
    Scanner sc=new Scanner(System.in);
 
    HashMap<String,Integer> info=new HashMap<String,Integer>();

    //Exam
    public void start_Exam(){
        int score=0;
        int ans;
        long start_Time=System.currentTimeMillis();
        long end_Time=start_Time + 30;
        
        System.out.println("\n Instructions, Please Read Carefully!");
        System.out.println(" 1. Carry all necessary material.");
        System.out.println(" 2. Read the Question Paper carefully.");
        System.out.println(" 3. All Questions Are Compulsory.");
        System.out.println(" 4. Manage your time.");
        System.out.println("\n ---All The Best!---\n");

        System.out.println("\n *******");
        System.out.println(" ----Exam has started----"); 

        while(System.currentTimeMillis()<end_Time){
            System.out.println("*************************");
            System.out.println(" Q1. Who is the father of Java? ");
            System.out.println(" 1.Guido van Rossum\n 2.James Gosling \n 3.Brendan Eich \n 4.Dennis Ritchie \n");
            System.out.print("Answer: ");
            ans=sc.nextInt();
            if(ans==2){
                score +=5;
            }else{
                score--;
            }

            System.out.println(" *********************************** ");
            System.out.println(" Q2.What is the extention of Java code file?");
            System.out.println(" 1. .js \n 2. .java \n 3. .txt \n 4. .html");
            System.out.print("Answer: ");
            ans=sc.nextInt();
            if(ans==2){
                score +=5;
            }else{
                score--;
            }

            System.out.println(" ********************************* ");
            System.out.println(" Q3.Which of the following is not a OOPs concept?");
            System.out.println(" 1.Abstraction \n 2.Encapsulation \n 3.Polymorphism \n 4.Compilation");
            System.out.print("Answer: ");
            ans =sc.nextInt();
            if(ans == 4){
                score+=5;
            }else{
                score--;
            }

            System.out.println(" ******************************* ");
            System.out.println(" Q4.In JAVA, The Dynamic Array Are Known AS: ");
            System.out.println(" 1.Kubernates \n 2.Remote \n 3.Vectors \n 4.Cycle");
            System.out.print("Answer : ");
            ans =sc.nextInt();
            if(ans == 3){
                score+=5;
            }else{
                score--;
            }

            System.out.println(" ******************************* ");
            System.out.println(" Q5.Which of the following is not a Java Feature?");
            System.out.println(" 1.Object-Oriented \n 2.Use of Pointers \n 3.Portable \n 4.Dynamic and Extensible");
            System.out.print("Answer : ");
            ans =sc.nextInt();
            if(ans == 2){
                score+=5;
            }else{
                score--;
            }
            System.out.println("\n *******");
            break;
        }   
        System.out.println("You have Submitted Answers.\n");
        System.out.println("Your Score is "+score);
        if(score>10){
            System.out.println("Congratulation, You're Passed!");
        }else{
            System.out.println("Better Luck, Try again!");
        }
        System.out.println(" ************************** ");
    }

    //Update Operation
    public HashMap<String,Integer> update(){
        System.out.print(" Enter Username/ID-: ");
        String update_id=sc.next();
        System.out.print(" Enter Old Password-: ");
        int update_password=sc.nextInt();

        if(info.containsKey(update_id) && info.get(update_id)==update_password){
            System.out.print(" Enter New Password-: ");
            update_password=sc.nextInt();
            info.replace(update_id,update_password);
            System.out.println("\n Your Password Update Successfully!");
        }else{
            System.out.println(" User Not Found!\n");
        }
        return info;
    }

    //Menu
    public void menu(){
        System.out.println(" --------------------");
        System.out.println(" 1.Update Profile \n 2.Start Exam \n 3.Logout");
        System.out.print("Enter Your choice-: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:{
                //update
                info=update();
                menu();
                break;
            }
            case 2:{
                //start Exam
                start_Exam();
                menu();
                break;
            }
            case 3:{
                //log out
                System.exit(0);
                break;
            }
            default:{
                System.out.println(" Invalid Choice.");
            }
        }

    }

    //login student
    void login(){
        info.put("Arnav",1943);
        info.put("Sanket",1234);
        info.put("Ram",5678);
        info.put("Vijay",9101);
        info.put("Om",1213);
        
 
        System.out.println(" Please Login!");
        System.out.print(" Enter Username: ");
        String id=sc.next();
        System.out.print("\n Enter Password:");
        int password=sc.nextInt();

        if(info.containsKey(id) && info.get(id)==password){
            System.out.println("\n You have Successfully Logged in to the Exam!");
            menu();
        }else{
            System.out.println("\n Incorrect User Name/ID or Password! \n Enter Correct Details! \n");
            login();
        }
    }

    public static void main(String args[]){
        online_examination obj=new online_examination();
        System.out.println("\n*********************************** ");
        obj.login();
    }
}  