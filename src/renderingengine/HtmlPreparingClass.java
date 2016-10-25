package renderingengine;
import java.util.Arrays;
import java.util.List;

public class HtmlPreparingClass extends RenderingImplementer{
	public static void main(String[] args){
		HtmlPreparingClass htmlpreparing = new HtmlPreparingClass();
		List<String> genderarray = (List<String>)Arrays.asList("male","femlae");
		List<String> maritialstatus = (List<String>)Arrays.asList("select one","married","single","divorced");
		String Html = "";
		Html += htmlpreparing.Formation("gender","radio",genderarray);
		Html +=htmlpreparing.Formation("maritial","dropdown",maritialstatus);
		Html +=htmlpreparing.Formation("username","text","username");
		Html +=htmlpreparing.Formation("email","email","email");
		Html = htmlpreparing.finalHtml(Html);
		System.out.println(Html);
	}
}
