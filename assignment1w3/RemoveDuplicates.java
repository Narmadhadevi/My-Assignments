package week3.assignment1w3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
	String[] tex=text.split(" ");
	for(int i=0;i<tex.length;i++)
	   {
		for(int j=0;j<tex.length;j++)
		{
			if(tex[i].equals(tex[j]))
			{
				count++;
			}
			if(count>1)
			{
				tex[i]="";
			}
		}
		count=0;
		System.out.print(tex[i].trim());
		}
	   }
	
}


