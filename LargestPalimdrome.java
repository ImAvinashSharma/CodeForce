package day4;
public class LargestPalimdrome {
	  
    public boolean isPalimdrome(long number){
        
        long result = 0;
        long q = number;
        while(q != 0){
          long rem = q%10;
          result = result*10 + rem;
          q = q/10;
        }
        
        return result == number;
        
    }
    
    public static void main(String[] args) {

        LargestPalimdrome h = new LargestPalimdrome();
        
         long max = 0;
        
        // starting first term in 999 and and decreasing
        for(int i = 999; i >= 100; i--){
          
          // starting second term in 999 and and decreasing
          for(int j = 999; j >= 100; j--){
           
           //multiply both of them
            long result = i * j;
           
           //test first it is not a multiple of 10 
           //(This way you can do less loops avoiding numbers that ends with 0)
           //after, test if is a palimdrome
            if(((result%10) != 0) && h.isPalimdrome(result)){
              
              // if those conditions are true, compare the result with max value
              max = result > max ? result : max;

          }
        }
      }
      System.out.println(max);
    }
}