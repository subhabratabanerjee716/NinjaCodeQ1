package Ninja;

public class tcsNinja {
	

		
		public static String encodeS(String s) {
			
			char []ch =s.toCharArray();
			char [] ch2=new char[ch.length];
			for(int i=0;i<ch.length;i++) {
				
				int c = ch[i]+5;
				
				ch2[i]=(char)c;
				
			}
			
			return String.valueOf(ch2);
			
		}
		
		public static String decodes(String s) {
			
			char ch[] = s.toCharArray();
			char ch2[]=new char[ch.length];
			
			for(int i=0;i<ch2.length;i++) {
				
				int c = ch[i]-5;
				
				ch2[i]=(char)c;
				
				
			}
			
			return String.valueOf(ch2);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = "It has been a long day without you my friend";
			s=encodeS(s);
			System.out.println(s);
			s=decodes(s);
			System.out.println(s);

		}

	}


