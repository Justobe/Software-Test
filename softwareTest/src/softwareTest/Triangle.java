package softwareTest;

public class Triangle {
	public Triangle(){
		
	}
	public boolean checkTriangle(int a,int b,int c)
	{
		if(a+b>c&&a+c>b&&b+c>a)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean checkEquilateral(int a,int b,int c){
		if(a==b&&b==c)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean checkIsosceles(int a,int b,int c){
		if(checkTriangle(a, b, c))
		{
			if(a == b||b==c||c==a)
			{
				return true;
			}
			else
				return false;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkScalene(int a,int b,int c)
	{
		if(checkTriangle(a, b, c))
		{
			if(a==b||b==c||c==a)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
}
