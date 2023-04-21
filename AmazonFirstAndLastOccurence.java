/*
  Given a sorted array will possibly duplicate elements the task is to fing indexes of first and 
  last occurences of an element x in the given array
 */
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
