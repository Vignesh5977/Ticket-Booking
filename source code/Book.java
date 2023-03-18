import java.util.*;
public class Book
    {
        static int Book(String arr[][],int count){
            Scanner sc1=new Scanner(System.in);

            //booking name
            System.out.println("Enter the Name :");
            String name=sc1.nextLine();

            //table
            if(name.length()>0){
                count++;

                //pnr number
                Random r=new Random();
                int a=r.nextInt(100000);

                //int to String
                String s=String.valueOf(count);
                String s1=Integer.toString(a);

                //store the data
                for(int i=count-1;i<count;i++){
                    arr[i][0]=name;
                    arr[i][1]=s1;
                    arr[i][2]=s;
                }
            }
            return count;
        }

        static void Availability(int count){
            //Availability ticket
            int re=12-count;
            String arr2[][]=new String[4][3];
            int a=1;
            String w="#";
            for(int i=0;i<4;i++){
                for(int j=0;j<3;j++){
                    String s=String.valueOf(a);
                    if(count>0){
                        arr2[i][j]=s;
                        a++;
                        count--;
                    }else{
                        arr2[i][j]=w;
                    }
                }
            }
            for(int i=0;i<4;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr2[i][j]);
                }
                System.out.println();
            }
            System.out.println("Availability ticket "+re);

        }

        static int Cancellation(String arr[][],int count){
            for(int i=count-1;i<count;i++){
                arr[i][0]="";
                arr[i][1]="";
                arr[i][2]="";
            }
            System.out.print("ticket cancelled");
            count--;
            return count;

        }

        static void Chart(String arr[][],int count){
            //chart
            System.out.print("Name   \t\tPNR   \t\tSeNo");
            System.out.println();
            for(int i=0;i<count;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+"\t\t");

                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            // booking option
            String arr[][]=new String[12][3];
            int count=0;

            for(int i=0;i<11;i++){
                System.out.println();
                System.out.println("1.Booking\n2.Availability cheching\n3.Cancellation\n4.Prepare chart\n5.Exit\n");
                System.out.println("Choose the option");
                int uvalue=sc.nextInt();
                System.out.println();
                switch(uvalue){
                    case 1:
                        count=Book(arr,count);

                        break;
                    case 2:
                        Availability(count);
                        break;
                    case 3:
                        count=Cancellation(arr,count);
                        break;
                    case 4:
                        Chart(arr,count);
                        break;
                    case 5:
                        System.out.print("EXIT");
                        break;
                }
                if(uvalue==5)
                    break;
            }
        }
    }


