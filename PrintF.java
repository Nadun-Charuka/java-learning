public class PrintF {
    public static void main(String[] args){
        /* 
                
        
                %d: Integer (decimal)
                %f: Floating point number
                %s: String
                %n: Newline (equivalent to \n)
                %c: Character
                %x: Hexadecimal integer
                %b: Boolean
        
                %-10.2f
                "Alice     "  // Alice left-aligned, 5 spaces added to the right
                "30        "  // 30 left-aligned, 8 spaces added to the right

                %10.2f
                "     7500.00"  // Salary right-aligned, 5 spaces added to the left
                "     4000.50"  // Salary right-aligned, 5 spaces added to the left
        
        */
                System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "Salary");
                System.out.printf("%-10s %-10d %-10.2f%n", "Alice", 30, 7578.4596);
                System.out.printf("%-10s %-10d %-10.2f%n", "Bob", 22, 4320.846);
                
            }
    
}
