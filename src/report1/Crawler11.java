package report1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler11 extends Thread{
	private String url;//전달 받을 거
	private volatile boolean done=false;
	Document doc=null;
	
	ArrayList<String> listTitle=new ArrayList<>();
	ArrayList<String> listUrl=new ArrayList<>();
	
	public Crawler11(String u)
	{
		this.url=u;
	}
	public void run()
	{
		try
		{
			doc = Jsoup.connect(url).get();//doc에 저장
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		Elements element = doc.select("ul");
		Elements list=element.select("a.tit");
		
		for (Element e:list)
		{
			listTitle.add(e.text());
			String href = e.attr("href");
			listUrl.add(href);
		}
		System.out.println("==========================================================");
		System.out.println(doc.title()+ " Crawling Complete");
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
	public ArrayList<String> setTitle()//인자 받기
	{
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
		return listTitle;
	}
	public ArrayList<String> seturl()//인자 받기
	{
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
		return listUrl;
	}	
}
