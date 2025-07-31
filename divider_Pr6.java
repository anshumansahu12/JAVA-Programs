class divider_Pr6 {
    static void divide (int a, int b) throws
    Exception {
        if (b == 0) {
            throw new Exception("Cannot Divide By Zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String args[]) {
        try {
            divide(10, 40);

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}