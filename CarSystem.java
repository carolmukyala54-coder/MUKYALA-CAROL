
    import java.util.Scanner;
    public class CarSystem{
       public static void main(String[] args){
   
                Scanner input = new Scanner(System.in);
           
           String  AvailableCar[]=new String[4];
          String Functionality[]=new String[4];
          double  Price[]=new double[4];
          int choice[]=new int[4];
         int  Quantity[]=new int[4];

           for(int i=0;i<4;i++){
           System.out.println("Enter the Available Cars:");
           AvailableCar[i] = input.nextLine();

           System.out.println("ter Price:");
           Price[i] = input.nextDouble();

           System.out.println("Enter the Quantity:");
           Quantity[i] = input.nextInt();

           System.out.println("Enter the Choice:");
           choice[i] = input.nextInt();

          
           input.nextLine();
           System.out.println("Enter the Fuctionality:");
           Functionality[i] = input.nextLine();
           }
           for(int i=0;i<4;i++){
           System.out.println("--Car details---");
           System.out.println("Car: " + AvailableCar[i]);
           System.out.println("Price: " + Price[i]);
           
           System.out.println("Quantity: " + Quantity[i]);

           System.out.println("choice: " + choice[i]);
           
           System.out.println("Functionality:" + Functionality[i]);
           }
   
           input.close();
   
           
           
       }
    }


