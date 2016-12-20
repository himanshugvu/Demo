
public class adada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "an,.^df*7 -as";
		String b = a.replaceAll("[^\\w\\s]", "");
		System.out.println(b);
		
		char[] c = a.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<c.length;i++){
			if(!(String.valueOf(c[i]).matches("[^\\w\\s-.]"))){
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
		char[] d = a.toCharArray();
		StringBuilder sc = new StringBuilder();
		for(int i=0; i<c.length;i++){
			if(((d[i]>=48 && d[i]<=57) || (d[i]>=65 && d[i]<=90) || (d[i]>=97 && d[i]<=122))){
				sc.append(c[i]);
			}
		}
		System.out.println(sc);
	}

}
