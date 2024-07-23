public abstract class HelloGoodbye {
    public static void main(String[] args) {
        try {
            String input1 = args[0];
            String input2 = args[1];
            System.out.println(String.format("Hello %s and %s", input1, input2));
            System.out.println(String.format("Goodbye %s and %s", input2, input1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You must specify an argument");
        } catch (IllegalArgumentException e) {
            System.out.println("Bad argument: " + e.getMessage());
        }
    }
}
