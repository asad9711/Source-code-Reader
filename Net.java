import java.io.*;
import java.net.*;
class Net
{
	public static void main(String s[])throws IOException,MalformedURLException
	{
		// URL url=new URL("http://www.facebook.com/");
		// URL url=new URL("http://www.google.com/");
		URL url=new URL("http://jmi.ac.in/");
		// URL url=new URL("http://www.quora.com/");


		FileWriter fw=new FileWriter("F:\\frea.txt",false);
		PrintWriter pw=new PrintWriter(fw);
		BufferedReader bf=new BufferedReader(new InputStreamReader(url.openStream()));
        String str="";
		while((str=bf.readLine())!=null)
		{
			// System.out.println(str);
		  pw.println(str);
		}
	}

}
