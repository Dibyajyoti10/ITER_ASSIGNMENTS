
public class Main {

	public final static int d=256;
	static void search(String pat, String txt, int g) {
		int M=pat.length();
		int N=txt.length();
		int i,j;
		int p=0;
		int t=0;
		int h=1;
		for(int i1=0;i1<M-1;i1++) {
			h=(h*d)%g;
		}
		for(i=0;i<M;i++) {
			p=(d*p+pat.charAt(i))%g;
			t=(d*t+txt.charAt(i))%g;
		}
		for(i=0;i<=N-M;i++) {
			if(p==t) {
				for(j=0;j<M;j++) {
					if(txt.charAt(i+j)!=pat.charAt(j))
						break;
				}
				if(j==M)
					System.out.println("Pattern found at index: "+j);
			}
			if(i<N-M) {
				t=(d*(t-txt.charAt(i)*h)+ txt.charAt(i+M))%g;
				if(t<0)
					t=(t+g);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt="Good morning .Have a Good day";
		String pat="Good";
		int g=0;
		search (pat,txt,g);
	}

}
