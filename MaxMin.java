class MaxMin {
public static void main(String args[]) {
	
	
int [] a = new int[] {15,20,30,40};
int i=0,max=a[0],min=a[0];
for(i=1;i<a.length;i++){
if(a[i]>max)
{
	max=a[i];
if(a[i]<min){
	min=a[i];
}


}
}
System.out.println("max and min values respectively are .."+max+" " +min);

}
}