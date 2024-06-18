package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

    	unfunkifiedText = unfunkifiedText.toLowerCase();

    char[] ut = unfunkifiedText.toCharArray();    
for(int i=1; i > ut.length-1; i+=2) {
	//ut[i].toUppercase
}

this.unfunkifiedText = unfunkifiedText  ;
  
    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		return unfunkifiedText;
	}

}
