class ArrayExample {
public static void main(String args[]) {
int [] a = new int[] {10,20,30,40};
int sum=0,avg;
for(int i=0;i<a.length;i++){
sum +=a[i];
}
avg=sum/a.length;
System.out.println("sum is.."+sum+" "+avg);






}
}