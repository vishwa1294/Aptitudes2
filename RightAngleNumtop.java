import java.util.Scanner;
class RightAngleNumtop{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of row");
int row = sc.nextInt();
int number = 1;
for (int i = 1; i <= row; i++){
for (int j = 5; j >= i; j--){
System.out.print("  " + i);
} 
 System.out.println();

  }
}
}
  
  