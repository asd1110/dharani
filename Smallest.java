class Smallest{
public static void main(String args[]) {
int []a={68,69,70,88,65,89,101,108};
int i,j,x;
int b=a.length;
for(i=0;i<a.length;i++){
	for(j=i+1;j<a.length;j++) {
	if(a[i]>a[j]){
	x=a[i];
	a[i]=a[j];
	a[j]=x;
	
	}
	}
}
System.out.println("the two smallest values in array are"+a[0]+ " "+a[1]);
	System.out.println("the two largest values in array are"+a[b-2]+ " "+a[b-1]);
}
}