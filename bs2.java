public class bs2 {
    
        public static void  main(String[] args) {
            int[] arr={3,2,1,0,4,5,6};
            int x=50;
        /*    boolean flag=false;
            for(int i=0;i<arr.length; i++){
                if(arr[i]==x){
                    System.out.println("element found"+ x);
                    flag=true;
                }
            }
            if(!flag)
            System.out.println("not found");
        */   int a=1;
            switch (a) {
                case 1:
                    LinearSearch.bs(arr,0,arr.length-1,5);
                    break;
            
                default:
                    break;
            }
        }
    
        public  static void bs(int[] arr, int f, int s,int key){
        int mid=(f+s)/2;
            while(f<=l){
                if(arr[mid]<key){
                    if(arr[mid]<key){
                        f=mid+1;
                    }else if(arr[mid]==key){
                        System.out.println("found");
    
                    }else{
                        s=mid-1;
                    }
    
                    mid=(f+s)/2;
    
                }
                if(f>s){
                    System.out.println("not found");
                }
    
        }
        }
    }
    

