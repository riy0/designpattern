package idcard;
import framework.*;

public class IDcard extends Product {
private String owner;
IDCard(String owner){
        System.out.println("make" + owner + "'s card.");
        this.owner = owner;
}
public void use(){
        System.out.println("use" + owner + "'s card.");
}
public String getOwner(){
        return owner;
}
}
