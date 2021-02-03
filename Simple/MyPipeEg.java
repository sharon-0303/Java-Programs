import java.io.*;
class WriteTh extends Thread
{
  PipedOutputStream pos = new PipedOutputStream();
  public WriteTh(PipedOutputStream ob)
  {
    pos=ob;
  }
  public void run()
  {
    try
    {
      for(int i=0;i<10;i++)
      {
        pos.write(i);
      }
    }
    catch(Exception ex)
    {
      System.out.print(ex.getMessage());
    }
  }
}

class ReadTh extends Thread
{
  PipedInputStream pis = new PipedInputStream();

  public ReadTh(PipedInputStream ob)
  {
    pis=ob;
  }
  public void run()
  {
  		try
  		{
  			int ch;
  			while ((ch = pis.read())!=-1)
  				System.out.println("RunTh "+ch);
  		}
  		catch(Exception ex)
  		{
  			System.out.print(ex.getMessage());
  		}
  }
  
}
class ReadTh1 extends Thread
{
	PipedInputStream pis = new PipedInputStream();
	public ReadTh1(PipedInputStream ob)
	{
		pis=ob;
	}
	public void run()
	{
		try
		{
			int ch;
			while ((ch=pis.read())!=-1)
			{
				System.out.println("ReadTh1 " +ch);
			}
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}

class MyPipeEg
{
	public static void main(String[] args) 
	{
		try
		{
			PipedOutputStream po = new PipedOutputStream();
			PipedInputStream pi = new PipedInputStream(po);
			WriteTh th1=new WriteTh(po);
			ReadTh th2 = new ReadTh(pi);
			ReadTh1 th3 = new ReadTh1(pi);
			th1.start();
			th2.start();
			th3.start();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}	
	}
}