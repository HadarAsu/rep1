public class singelton2 {
    private static singelton2 ourInstance = new singelton2();

    public static singelton2 getInstance() {
        return ourInstance;
    }

    private singelton2() {
    }
}
