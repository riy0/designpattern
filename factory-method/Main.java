import framework.*;
import idcard.*;

public class Main {
public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 =factory.create("Ryosuke");
        Product card2 =factory.create("Ryo");

        card1.use();
        card2.use();
}
}
