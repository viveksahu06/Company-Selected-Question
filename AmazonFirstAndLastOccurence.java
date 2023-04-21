/*
  Given a sorted array will possibly duplicate elements the task is to fing indexes of first and 
  last occurences of an element x in the given array
 */ 
//by Recursion
public class AmazonFirstAndLastOccurence { 
    public static int firstOccurence(int arr[],int idx,int key){
        if(arr[idx]==key){
            return idx;
        } 
        if(idx==arr.length-1){
            return -1;
        } 
        return firstOccurence(arr,idx+1,key);
    } 
   public static int lastOccurence(int arr[],int idx,int key){
             if(idx==arr.length){
                return -1; 
             }   
             int isfound=lastOccurence(arr,idx+1,key); 
             if(isfound==-1 && arr[idx]==key){
                return idx;
             }   
             return isfound;
   }
    public static void main(String []args){
        int arr[]={1,3,5,5,5,5,7,123,125}; 
        int key=7; 
        System.out.println(firstOccurence(arr, 0, key));
        System.out.println(lastOccurence(arr, 0, key));
        
    }
} 

// by iteration  
public class AmazonFirstandLastOccur { 
    public static void calc(int arr[],int key){
        int c=-1;   
        int ca=-1; 
        int ck=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                if(ck==0){
                    c=i; 
                    ck++;
                } 
                ca=i;
            }  
           
        } 
       
        System.out.println(c+" "+ca);
    }
    public static void main(String []args){
        int arr[]={1,3,5,5,5,5,67,123,125}; 
        int key=5; 
        calc(arr,key);
        
    }
    
}

