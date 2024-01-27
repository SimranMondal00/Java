package StingsAndStringBuilders;
import java.util.Arrays;
public class StringPractice3 {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
       // String ans = new Integer(56) + " " + new Arraylist<>();
        stringPerformance();
        stringPerformanceUsingBuilders();
        nameToCharArray();
    }

    // IN THIS CASE EVERYTIME A NEW OBJECT IS BEEN CREATED WHICH INTERNALLY LEADS TO
    // WASTAGE OF MEMORY AND HAS A TIME COMPLEXITY NOF O(N^2)
    private static void stringPerformance() {
        String series = " ";
        for(int i=0;i<26;i++){
           char ch = (char)('a'+i); //TYPECASTING
            System.out.println(ch);
        }
   }
    //STRING BUILDERS ARE SOLUTION TO THIS
    private static void stringPerformanceUsingBuilders() {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++) {
            char ch = (char) ('a' + i); //TYPECASTING
            builder.append(ch + " ");
        }
        System.out.println(builder.toString());
    }

    private static void nameToCharArray() {
        String name = "Simran Mondal";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
