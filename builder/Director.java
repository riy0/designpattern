public class Director {
private Builder builder;
public Director(Builder builder){
        this.builder = builder;
}
public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("from morning to noon");
        builder.makeItems(new String[] {
                        "Good morning",
                        "Good afternoon",
                });
        builder.makeString("night");
        builder.makeItems(new String[] {
                        "Good evening",
                        "Good night",
                });
        builder.close();
}
}
