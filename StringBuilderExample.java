public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // Create a new StringBuilder
        
        sb.append("Hello");        // Append a string
        sb.append(" ");           // Append a space
        sb.append("World!");      // Append another string
        
        System.out.println(sb);    // Output: Hello World!
        
        sb.insert(6, "Java ");     // Insert "Java " at index 6
        System.out.println(sb);    // Output: Hello Java World!
        
        sb.replace(6, 11, "C++");  // Replace "Java" with "C++"
        System.out.println(sb);    // Output: Hello C++ World!
        
        sb.delete(5, 6);           // Remove the space
        System.out.println(sb);    // Output: HelloC++ World!
        
        sb.reverse();              // Reverse the string
        System.out.println(sb);    // Output: !dlroW ++ColleH
    }
}
