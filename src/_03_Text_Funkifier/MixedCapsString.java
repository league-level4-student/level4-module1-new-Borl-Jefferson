package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

    	unfunkifiedText = unfunkifiedText.toLowerCase();
String x = "";
    char[] ut = unfunkifiedText.toCharArray();    
System.out.println(ut.length);
for(int i=1; i < ut.length-1; i+=2) {
	
	System.out.println(ut[i]);
ut[i] = Character.toUpperCase(ut[i]);

}

unfunkifiedText=String.valueOf(ut);
this.unfunkifiedText = unfunkifiedText  ;
  funkifyText();
    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		
		return unfunkifiedText;
	}

}
