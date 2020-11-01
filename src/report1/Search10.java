package report1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Search10 extends Thread{

	private volatile boolean done=false;
	ArrayList<String> listTitle=new ArrayList<>();
	ArrayList<String> listUrl=new ArrayList<>();
	
	int num=0;
	String search;
	public Search10(String search,ArrayList<String>t,ArrayList<String> u) 
	{
		this.search=search;
		listTitle.addAll(t);
		listUrl.addAll(u);
	}
	public void run()
	{
		for(int i=0;i<listTitle.size();i++)
		{
			if(listTitle.get(i).contains(search))
			{
				System.out.println("==========================================================");
				System.out.println(Thread.currentThread().getName());
				System.out.println(listTitle.get(i));
				System.out.println("https://entertain.naver.com"+listUrl.get(i));
				num++;
			}
			else if(listTitle.size()==0)
			{
				System.out.println("검색 결과가 없습니다");
			}
		}
		try {
			TimeUnit.MICROSECONDS.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		done=true;
		synchronized(this)
		{
			this.notifyAll();	
		}
	}
	public int getnum() {
		if(!done)
		{
			synchronized(this)
			{
				try
				{
					this.wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		//System.out.println(listTitle);
		return num;
	}
}
