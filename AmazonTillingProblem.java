public class AmazonTillingProblem { 
    public static int tillingProblem(int n){
        if(n==0 || n==1){
            return 1;
        } 
        //vertically
       int fnm1=tillingProblem(n-1); 
       //horizontal; 
       int fnm2=tillingProblem(n-2); 
       int totway=fnm1+fnm2; 
         
       return totway;
    }
    public static void main(String []args){
             System.out.println(tillingProblem(4));
    }
}
