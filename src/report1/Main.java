package report1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{	
		int num=0;//검색된 단어의 총 개수

		ArrayList<String> titlec6_1=new ArrayList<>();
		ArrayList<String> urlc6_1=new ArrayList<>();
		ArrayList<String> titlec6_2=new ArrayList<>();
		ArrayList<String> urlc6_2=new ArrayList<>();	
		ArrayList<String> titlec6_3=new ArrayList<>();
		ArrayList<String> urlc6_3=new ArrayList<>();
		ArrayList<String> titlec6_4=new ArrayList<>();
		ArrayList<String> urlc6_4=new ArrayList<>();
		ArrayList<String> titlec6_5=new ArrayList<>();
		ArrayList<String> urlc6_5=new ArrayList<>();
		ArrayList<String> titlec6_6=new ArrayList<>();
		ArrayList<String> urlc6_6=new ArrayList<>();
		
		//c11
		ArrayList<String> titlec11_1=new ArrayList<>();
		ArrayList<String> urlc11_1=new ArrayList<>();
		ArrayList<String> titlec11_2=new ArrayList<>();
		ArrayList<String> urlc11_2=new ArrayList<>();
		//c12
		ArrayList<String> titlec12=new ArrayList<>();
		ArrayList<String> urlc12=new ArrayList<>();
		//c13
		ArrayList<String> titlec13_1=new ArrayList<>();
		ArrayList<String> urlc13_1=new ArrayList<>();
		ArrayList<String> titlec13_2=new ArrayList<>();
		ArrayList<String> urlc13_2=new ArrayList<>();	
		ArrayList<String> titlec13_3=new ArrayList<>();
		ArrayList<String> urlc13_3=new ArrayList<>();
		ArrayList<String> titlec13_4=new ArrayList<>();
		ArrayList<String> urlc13_4=new ArrayList<>();
		ArrayList<String> titlec13_5=new ArrayList<>();
		ArrayList<String> urlc13_5=new ArrayList<>();
		ArrayList<String> titlec13_6=new ArrayList<>();
		ArrayList<String> urlc13_6=new ArrayList<>();	
		ArrayList<String> titlec13_7=new ArrayList<>();
		ArrayList<String> urlc13_7=new ArrayList<>();
		ArrayList<String> titlec13_8=new ArrayList<>();
		ArrayList<String> urlc13_8=new ArrayList<>();
		ArrayList<String> titlec13_9=new ArrayList<>();
		ArrayList<String> urlc13_9=new ArrayList<>();
		ArrayList<String> titlec13_10=new ArrayList<>();
		ArrayList<String> urlc13_10=new ArrayList<>();	
		ArrayList<String> titlec13_11=new ArrayList<>();
		ArrayList<String> urlc13_11=new ArrayList<>();
		ArrayList<String> titlec13_12=new ArrayList<>();
		ArrayList<String> urlc13_12=new ArrayList<>();
		ArrayList<String> titlec13_13=new ArrayList<>();
		ArrayList<String> urlc13_13=new ArrayList<>();
		ArrayList<String> titlec13_14=new ArrayList<>();
		ArrayList<String> urlc13_14=new ArrayList<>();	
		ArrayList<String> titlec13_15=new ArrayList<>();
		ArrayList<String> urlc13_15=new ArrayList<>();
		ArrayList<String> titlec13_16=new ArrayList<>();
		ArrayList<String> urlc13_16=new ArrayList<>();
		ArrayList<String> titlec13_17=new ArrayList<>();
		ArrayList<String> urlc13_17=new ArrayList<>();

		System.out.print("찾을 단어: ");
		Scanner sc= new Scanner(System.in);
		String search= sc.next();
		
		//c1
		Crawler1 c1 = new Crawler1("https://post.naver.com/my/series/detail.nhn?seriesNo=348876&memberNo=30910003&prevVolumeNo=28423045");
		c1.start();

		//c2
		Crawler2 c2_1=new Crawler2("https://sports.news.naver.com/wfootball/index.nhn");
		c2_1.start();
		
		Crawler2 c2_2=new Crawler2("https://sports.news.naver.com/kfootball/index.nhn");
		c2_2.start();
		
		Crawler2 c2_3=new Crawler2("https://sports.news.naver.com/general/index.nhn");
		c2_3.start();

		Crawler2 c2_4=new Crawler2("https://sports.news.naver.com/esports/index.nhn");
		c2_4.start();

		//c3
		Crawler3 c3_1=new Crawler3("https://sports.news.naver.com/wfootball/news/index.nhn?isphoto=N&type=popular");
		c3_1.start();
		
		Crawler3 c3_2=new Crawler3("https://sports.news.naver.com/kfootball/news/index.nhn?isphoto=N&type=popular");
		c3_2.start();
		
		Crawler3 c3_3=new Crawler3("https://sports.news.naver.com/general/news/index.nhn?isphoto=N&type=popular");
		c3_3.start();
		
		//c4
		Crawler4 c4=new Crawler4("https://news.naver.com/main/ranking/popularDay.nhn");
		c4.start();
		
		//c5
		Crawler5 c5=new Crawler5("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=001");
		c5.start();
		
		//c6
		Crawler6 c6_1=new Crawler6("https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=100");
		c6_1.start();
		titlec6_1=c6_1.setTitle();urlc6_1=c6_1.seturl();
		
		Crawler6 c6_2=new Crawler6("https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=101");
		c6_2.start();
		titlec6_2=c6_2.setTitle();urlc6_2=c6_2.seturl();
		
		Crawler6 c6_3=new Crawler6("https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=102");
		c6_3.start();
		titlec6_3=c6_3.setTitle();urlc6_3=c6_3.seturl();
				
		Crawler6 c6_4=new Crawler6("https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=103");
		c6_4.start();
		titlec6_4=c6_4.setTitle();urlc6_4=c6_4.seturl();
				
		Crawler6 c6_5=new Crawler6("https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=104");
		c6_5.start();
		titlec6_5=c6_5.setTitle();urlc6_5=c6_5.seturl();
		
		Crawler6 c6_6=new Crawler6("https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=105");
		c6_6.start();
		titlec6_6=c6_6.setTitle();urlc6_6=c6_6.seturl();
		
		//c7
		Crawler7 c7=new Crawler7("https://news.naver.com/main/opinion/home.nhn");
		c7.start();
		
		//c8
		Crawler8 c8=new Crawler8("https://entertain.naver.com/ranking");
		c8.start();

		//c9
		Crawler9 c9=new Crawler9("https://entertain.naver.com/home");
		c9.start();
		
		//c10
		Crawler10 c10=new Crawler10("https://entertain.naver.com/starcast");
		c10.start();

		//c11
		Crawler11 c11_1=new Crawler11("https://entertain.naver.com/now");
		c11_1.start();
		titlec11_1=c11_1.setTitle();urlc11_1=c11_1.seturl();

		Crawler11 c11_2=new Crawler11("https://entertain.naver.com/movie");
		c11_2.start();
		titlec11_2=c11_2.setTitle();urlc11_2=c11_2.seturl();

		//c12
		Crawler12 c12=new Crawler12("https://sports.news.naver.com/esports/news/index.nhn?isphoto=N&type=popular");
		c12.start();
		titlec12=c12.setTitle();urlc12=c12.seturl();

		//c13
		Crawler13 c13_1=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=590488&memberNo=44341434&prevVolumeNo=28361060");
		c13_1.start();
		titlec13_1=c13_1.setTitle();urlc13_1=c13_1.seturl();
		
		Crawler13 c13_2=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=263543&memberNo=31724756&prevVolumeNo=28393627");
		c13_2.start();
		titlec13_2=c13_2.setTitle();urlc13_2=c13_2.seturl();

		Crawler13 c13_3=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=544676&memberNo=12124533&prevVolumeNo=24317057");
		c13_3.start();
		titlec13_3=c13_3.setTitle();urlc13_3=c13_3.seturl();

		Crawler13 c13_4=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=589370&memberNo=4812526&prevVolumeNo=28341563");
		c13_4.start();
		titlec13_4=c13_4.setTitle();urlc13_4=c13_4.seturl();

		Crawler13 c13_5=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=589366&memberNo=49393306&prevVolumeNo=28132983");
		c13_5.start();
		titlec13_5=c13_5.setTitle();urlc13_5=c13_5.seturl();

		Crawler13 c13_6=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=585257&memberNo=475948&prevVolumeNo=28378553");
		c13_6.start();
		titlec13_6=c13_6.setTitle();urlc13_6=c13_6.seturl();

		Crawler13 c13_7=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=562878&memberNo=45197719&prevVolumeNo=28431040");
		c13_7.start();
		titlec13_7=c13_7.setTitle();urlc13_7=c13_7.seturl();
		
		Crawler13 c13_8=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=537728&memberNo=45151676&prevVolumeNo=28464512");
		c13_8.start();
		titlec13_8=c13_8.setTitle();urlc13_8=c13_8.seturl();
		
		Crawler13 c13_9=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=585786&memberNo=38111732&prevVolumeNo=28464485");
		c13_9.start();
		titlec13_9=c13_9.setTitle();urlc13_9=c13_9.seturl();

		Crawler13 c13_10=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=190973&memberNo=3830854&prevVolumeNo=28460345");
		c13_10.start();
		titlec13_10=c13_10.setTitle();urlc13_10=c13_10.seturl();

		Crawler13 c13_11=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=571394&memberNo=20182790&prevVolumeNo=28465675");
		c13_11.start();
		titlec13_11=c13_11.setTitle();urlc13_11=c13_11.seturl();

		Crawler13 c13_12=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=512301&memberNo=19482409&prevVolumeNo=28463852");
		c13_12.start();
		titlec13_12=c13_12.setTitle();urlc13_12=c13_12.seturl();

		Crawler13 c13_13=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=497131&memberNo=12158111&prevVolumeNo=28446730");
		c13_13.start();
		titlec13_13=c13_13.setTitle();urlc13_13=c13_13.seturl();
		
		Crawler13 c13_14=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=516032&memberNo=44833462&prevVolumeNo=28450157");	
		c13_14.start();
		titlec13_14=c13_14.setTitle();urlc13_14=c13_14.seturl();
		
		Crawler13 c13_15=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=299288&memberNo=37255411&prevVolumeNo=28329865");
		c13_15.start();
		titlec13_15=c13_15.setTitle();urlc13_15=c13_15.seturl();
		
		Crawler13 c13_16=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=471560&memberNo=42198376&prevVolumeNo=28379593");
		c13_16.start();
		titlec13_16=c13_16.setTitle();urlc13_16=c13_16.seturl();
		
		Crawler13 c13_17=new Crawler13("https://post.naver.com/my/series/detail.nhn?seriesNo=486625&memberNo=40848952&prevVolumeNo=28383951");
		c13_17.start();
		titlec13_17=c13_17.setTitle();urlc13_17=c13_17.seturl();

		//Search1 s1=new Search1(search,c1.listTitle,c1.listUrl);
		Search1 s1=new Search1(search,c1.listTitle,c1.listUrl);
		s1.start();
		Search2 s2_1=new Search2(search,c2_1.listTitle,c2_1.listUrl);
		s2_1.start();
		Search2 s2_2=new Search2(search,c2_2.listTitle,c2_2.listUrl);
		s2_2.start();
		Search2 s2_3=new Search2(search,c2_3.listTitle,c2_3.listUrl);
		s2_3.start();
		Search2 s2_4=new Search2(search,c2_4.listTitle,c2_4.listUrl);
		s2_4.start();
		Search3 s3_1=new Search3(search,c3_1.listTitle,c3_1.listUrl);
		s3_1.start();
		Search3 s3_2=new Search3(search,c3_2.listTitle,c3_2.listUrl);
		s3_2.start();
		Search3 s3_3=new Search3(search,c3_3.listTitle,c3_3.listUrl);
		s3_3.start();
		Search4 s4=new Search4(search,c4.listTitle,c4.listUrl);
		s4.start();
		Search5 s5=new Search5(search,c5.listTitle,c5.listUrl);
		s5.start();
		
		Search6 s6_1=new Search6(search,c6_1.listTitle, urlc6_1);
		s6_1.start();
		Search6 s6_2=new Search6(search,c6_2.listTitle, urlc6_2);
		s6_2.start();
		Search6 s6_3=new Search6(search,c6_3.listTitle, urlc6_3);
		s6_3.start();
		Search6 s6_4=new Search6(search,c6_4.listTitle, urlc6_4);
		s6_4.start();
		Search6 s6_5=new Search6(search,c6_5.listTitle, urlc6_5);
		s6_5.start();
		Search6 s6_6=new Search6(search,c6_6.listTitle, urlc6_6);
		s6_6.start();
		
		Search7 s7=new Search7(search,c7.listTitle,c7.listUrl);
		s7.start();
		
		Search8 s8=new Search8(search,c8.listTitle,c8.listUrl);
		s8.start();
		
		Search9 s9=new Search9(search,c9.listTitle,c9.listUrl);
		s9.start();
		
		Search10 s10=new Search10(search,c10.listTitle,c10.listUrl);
		s10.start();
		
		Search11 s11_1=new Search11(search,c11_1.listTitle, urlc11_1);
		s11_1.start();
		Search11 s11_2=new Search11(search,c11_2.listTitle, urlc11_2);
		s11_2.start();
		
		Search12 s12=new Search12(search,c12.listTitle,c12.listUrl);
		s12.start();
		
		Search13 s13_1=new Search13(search,c13_1.listTitle, urlc13_1);
		s13_1.start();
		Search13 s13_2=new Search13(search,c13_2.listTitle, urlc13_2);
		s13_2.start();
		Search13 s13_3=new Search13(search,c13_3.listTitle, urlc13_3);
		s13_3.start();
		Search13 s13_4=new Search13(search,c13_4.listTitle, urlc13_4);
		s13_4.start();
		Search13 s13_5=new Search13(search,c13_5.listTitle, urlc13_5);
		s13_5.start();
		Search13 s13_6=new Search13(search,c13_6.listTitle, urlc13_6);
		s13_6.start();
		Search13 s13_7=new Search13(search,c13_7.listTitle, urlc13_7);
		s13_7.start();
		Search13 s13_8=new Search13(search,c13_8.listTitle, urlc13_8);
		s13_8.start();
		Search13 s13_9=new Search13(search,c13_9.listTitle, urlc13_9);
		s13_9.start();
		Search13 s13_10=new Search13(search,c13_10.listTitle, urlc13_10);
		s13_10.start();
		Search13 s13_11=new Search13(search,c13_11.listTitle, urlc13_11);
		s13_11.start();
		Search13 s13_12=new Search13(search,c13_12.listTitle, urlc13_12);
		s13_12.start();
		Search13 s13_13=new Search13(search,c13_13.listTitle, urlc13_13);
		s13_13.start();
		Search13 s13_14=new Search13(search,c13_14.listTitle, urlc13_14);
		s13_14.start();
		Search13 s13_15=new Search13(search,c13_15.listTitle, urlc13_15);
		s13_15.start();
		Search13 s13_16=new Search13(search,c13_16.listTitle, urlc13_16);
		s13_16.start();
		Search13 s13_17=new Search13(search,c13_17.listTitle, urlc13_17);
		s13_17.start();
		
		num+=s1.getnum();
		num+=s2_1.getnum();
		num+=s2_2.getnum();
		num+=s2_3.getnum();
		num+=s2_4.getnum();
		num+=s3_1.getnum();
		num+=s3_2.getnum();
		num+=s3_3.getnum();
		num+=s4.getnum();
		num+=s5.getnum();
		
		num+=s6_1.getnum();
		num+=s6_2.getnum();
		num+=s6_3.getnum();
		num+=s6_4.getnum();
		num+=s6_5.getnum();
		num+=s6_6.getnum();
		num+=s7.getnum();
		num+=s8.getnum();
		num+=s9.getnum();
		num+=s10.getnum();
		num+=s11_1.getnum();
		num+=s11_2.getnum();
		num+=s12.getnum();
		
		num+=s13_1.getnum();
		num+=s13_2.getnum();
		num+=s13_3.getnum();
		num+=s13_4.getnum();
		num+=s13_5.getnum();
		num+=s13_6.getnum();
		num+=s13_7.getnum();
		num+=s13_8.getnum();
		num+=s13_9.getnum();
		num+=s13_10.getnum();
		num+=s13_11.getnum();
		num+=s13_12.getnum();
		num+=s13_13.getnum();
		num+=s13_14.getnum();
		num+=s13_15.getnum();
		num+=s13_16.getnum();
		num+=s13_17.getnum();
		
		System.out.println("");
		System.out.println("<검색 된 단어의 개수>: "+num);
		
		System.out.println("Enter 키를 누르세요");
		pause();		
		System.out.println(".");
	}
	public static void pause() {
		try {
			System.in.read();
		}
			catch(IOException e) {}
		
	}
}
