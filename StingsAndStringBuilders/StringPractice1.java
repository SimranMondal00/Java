package StingsAndStringBuilders;


public class StringPractice1 {
    public static void main(String[] args) {
        //HERE BOTH THE OBJECTS POINTS TO THE SAME VALUE
        String a = "Kunal";
        String b = "Kunal";
        System.out.println(checkEqual(a,b));
        dotEqualMethord(a,b);

        // CREATING DIFFERENT OBJECTS OF SAME VALUE
        String n1 = new String("Simran");
        String n2 = new String("Simran");
        System.out.println(checkEqual(n1,n2));
        dotEqualMethord(n1,n2);
    }


    //CHECKS WHEATHER THE TWO STRING ARE EQUAL USING COMPARATOR

    private static boolean checkEqual(String a, String b) {
        if(a==b){
            return true;
        }
        return false;
    }
    private static void dotEqualMethord(String a, String b) {
        // .equals() CHECKS ONLY FOR THE VALUES NOT REFERENCE VARIABLE POINTING

        System.out.println(a.equals(b));
    }

}
