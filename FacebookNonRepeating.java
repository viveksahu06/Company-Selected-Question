public class FacebookNonRepeating { 
   public static int nonRepeatingIndex(String s){
        if(s.length()==1) return 0;  
       
        for(int i=0;i<s.length();i++){
            char ab=s.charAt(i);  
            boolean b=false;
            for(int j=i+1;j<s.length();j++){
                if(ab==s.charAt(j))  {
                    b=true; 
                    break;
                } 
                
            } 
            if(b==false) return i;
        } 
        return -1;
    } 
     public static void main(String []args){
        String s="abacdcbd"; 
          System.out.println(nonRepeatingIndex(s));
        
     }
}
