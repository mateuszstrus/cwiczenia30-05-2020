public class TestExceptions {
    public static void main(String[] args) {

        try {
            args = new String[]{"one", "two", "three"};
            for (int i = 0; i <= 3; i++) {
                System.out.println("args[" + i + "] is '" + args[i] + "'");

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Quiting...");


        }

    }
}