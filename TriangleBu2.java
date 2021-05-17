import java.util.Scanner;
class TriangleBu{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of row");
byte row = sc.nextByte();
for (int i = 1; i <= row; i++){
for (int j = 1; j <= row; j++){
if ( (i <= j && i + j > row) || (i >= j && i + j <= row +1) )
	System.out.print(i + "" + j + " ");
else
	System.out.print("   ");
}

 System.out.println();
}
}
}