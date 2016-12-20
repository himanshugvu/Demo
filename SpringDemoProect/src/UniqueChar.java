
public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc deeag jhjjhjjhj";
		String[] st=str.split(" ");
		int count=0;
		String word = st[0];
		for(int i=1;i<st.length;i++){
			char[] ch=st[i].toCharArray();
			StringBuilder sb = new StringBuilder();
			//int temp=0;
			for(int k=0;k<ch.length;k++){
				if(!sb.toString().contains(String.valueOf(ch[k]))){
					sb.append(ch[k]);
					//temp++;
				}
			}
			if(sb.length()>=word.length()){
				count=sb.length();
				word=st[i];
			}
			
		}
		System.out.println("Word is  "+ word + "  and count is  " + count);
	}

}
