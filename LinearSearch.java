public class LinearSearch{
    public static void  main(String[] args) {
        int[] arr={3,2,1,0,4,5,6};
        int x=50;
        boolean flag=false;
        for(int i=0;i<arr.length; i++){
            if(arr[i]==x){
                System.out.println("element found"+ x);
                flag=true;
            }
        }
        if(!flag)
        System.out.println("not found");
    }
}