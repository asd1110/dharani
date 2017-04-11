class ElementArray {
public static void main(String args[]) {
int [] a = new int[] {10,20,30,40};
int i;
   int s=Integer.parseInt(args[0]);
for(i=0;i<=4;i++)
{
if(s==a[i]){
System.out.println("the index of element is"+i);
}
else{
System.out.println("-1");
break;
}

}


}
}