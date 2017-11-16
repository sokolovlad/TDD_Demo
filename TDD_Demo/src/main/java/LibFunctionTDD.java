
public class LibFunctionTDD implements LibIterface{
	int[] libcards= {7659765,76976575,765976577,8975707,123456};
	long[] all_isdn= {765765976579579l,7608768l,324465567l,94586643l,34454666l,123433l,43224424l,};

	public boolean isvalid(int libcardno) {
		// TODO Auto-generated method stub
		for(int i=0;i<libcards.length;i++) {
			if(libcards[i]==libcardno)
				return true;
		}
		return false;
	}

	public int noofbooks() {
		// TODO Auto-generated method stub
		//int i=0;
		//for(i=0;i<all_isdn.length;i++);
		//return i;
		
		
		
		return all_isdn.length;
	}

	public boolean bookExists(long isdn) {
		// TODO Auto-generated method stub
		for (int i=0; i<all_isdn.length;i++)
		{
			if(isdn==all_isdn[i])
				return true;
		}
		return false;
	}
}