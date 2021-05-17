import java.util.Scanner;
class OddNumber{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of row");
int row = sc.nextInt();
int number = 1;
for (int i = 1; i <= row; i++){
for (int j = 1; j <= row; j++){
	if (i >= j && i + j <= row +1){
		System.out.print(number + " ");
       number = number +2;		
		}else
			System.out.print("  ");
	}	
 System.out.println();

  }
}
}