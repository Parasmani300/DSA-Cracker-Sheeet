public class PrintAllSubSequence{
    public static void print_all(String input,String output)
    {
        if(input.length() == 0){
            System.out.print(output + " ");
            return;
        }

        print_all(input.substring(1),output);
        print_all(input.substring(1),output + input.charAt(0));
    }
    public static void main(String[] args) {
        String a = "abc";

        print_all(a,"");
    }
}