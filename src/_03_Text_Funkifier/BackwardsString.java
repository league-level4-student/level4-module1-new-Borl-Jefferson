package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = new StringBuilder(unfunkifiedText).reverse().toString();

    }

    @Override
    public String funkifyText() {

        return unfunkifiedText;

    }
}
