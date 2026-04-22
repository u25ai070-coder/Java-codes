package Lab_6;

public class THreeD 
{
	int x,y,z;
	int x1=0,y1=0,z1=0;
	THreeD()
	{
		x=0;
		y=0;
		z=0;
	}
	THreeD(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void input(int x,int y, int z)
	{
		x1=x;
		y1=y;
		z1=z;
	}
	void output()
	{
		System.out.println("("+x+","+y+","+z+")");
	}
	void Distance()
	{
		System.out.println("Distance BEtween this two point :"+Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y, 2)+Math.pow(z1-z, 2)));
	}
}
