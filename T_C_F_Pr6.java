class T_C_F_Pr6 {
public static void main(String args[]){

    String text = null;

    try {
        System.out.println("length of text: "+ text.length());

    } catch (NullPointerException a) {
        System.out.println("Catch Block: Sting is null");

    } finally {
        System.out.println("Program is Ended");
    }
}
}