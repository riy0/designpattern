import factory.*;

public class Main {
public static void main(String[] args) {
        if(args.length != 1) {
                System.out.println("Usage");
                System.out.println("listfactory");
                System.out.println("tablefactory");
                System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
}
}
