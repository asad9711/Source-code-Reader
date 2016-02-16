import java.io.*;
import java.net.*;
class Net
{
	public static void main(String s[])throws IOException,MalformedURLException
	{
		URL url=new URL("http://www.google.com");
		FileWriter fw=new FileWriter("F:\\fread.txt");//path of the file where to save the data
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
