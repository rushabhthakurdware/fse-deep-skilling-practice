//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computer c = new Computer.Builder("i5","8GB").
                setStorage("128GB").
                build();

        c.showConfig();

        Computer gaming = new Computer.Builder("i9", "32GB").
                setStorage("256GB").
                build();
        gaming.showConfig();

    }
}