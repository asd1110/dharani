import java.util.Scanner;
class Doow{
public static void main(String args[]){
int a,b,total,option;
char ch;
do{
System.out.println("1.add"+"2.sub");
Scanner sc=new Scanner(System.in);
System.out.println("enter the option number");
option=sc.nextInt();
System.out.println("enter the 1st number");
a=sc.nextInt();
System.out.println("enter the 2nd number");
b=sc.nextInt();
switch(option){
	case 1 :
	total=a+b;
	System.out.println("total"+total);
	break;
	case 2 :
	total=a-b;
	System.out.println("total"+total);
	break;
	default:
	System.out.println("enter correct values");
	}
	System.out.println("do u want to continue (y/n)");
	ch=sc.next().charAt(0);
}
while(ch=='y');
}
}

