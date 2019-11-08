public class BubbleSort{
public static void main(String[] args){
int[] arr={2,5,12,65,0,3,6,1,111111,656566,12,32,0};
for(int i=0; i<arr.length-1;i++){
for(int j=0; j<arr.length-1-i;j++){
if(arr[j]>arr[j+1]){
int tmp=arr[j+1];
arr[j+1]=arr[j];
arr[j]=tmp;
}

}
for(int a:arr){
System.out.print(a+",");
}
}
}

