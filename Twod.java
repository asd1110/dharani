class Twod{
public static void main(String args[]) {
int [] [] x = new int [3] [];
int i,j;
x[0]= new int[3];
x[1]=new int[3];
x[2]=new int[3];
for(i=0;i<x.length;i++){
	for(j=0;j<x[i].length;j++){
		x[i][j]=i;
		System.out.print(x[i][j]+" ");
	}
	System.out.println();
}

}
}