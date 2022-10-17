public class rectPrint {

    public static void main(String[] args) {
      
        rectPrinter(10,9);
      
    }
  
    public static void rectPrinter(int len, int br){
        
        /*
        
        this piece of code prints out a rectangle of given length and breadth greater than 1
        im running two for loops so the time complexity is O(n^2) 
        my first for loop goes from 0 to the height (or breadth (br)) 
        inside my first for loop I begin by printing a star and end by printing a star, 
        since this is static information and I know that every line needs a starting and ending star
        the second for loop goes from 1 to (length-1)
        within this for loop, an if statement checks if the program is on the first or last row (because they need a full line of stars)
        if it is the first or last row, the program prints stars to create the boundary
        if it is neither, it will print tabs "\t" for better spacing
        
         */
        
        
        for(int i=0; i<br; i++){
            System.out.print("*\t");
            for(int j=1; j<len-1; j++){
                if(i==0 || i==br-1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println("*");
        }
    }
  
}
