class ArrayCopy{
public static void main(String args[]) {
int[] source={10,20,30};
int i;
int[] dest=new int[3];
System.arraycopy(source,0,dest,0,source.length);
for(i=0;i<dest.length;i++)
{
System.out.println("element at index"+i+":"+dest[i]);
}
}
}