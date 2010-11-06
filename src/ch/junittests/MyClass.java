package ch.junittests;

import java.util.Locale;



public class MyClass implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if (s == null || s.equals("")) {
			return true;
		}
		return false;
	}
	
	@Override
	public String capitalize(String s) {
		StringBuffer sb = new StringBuffer(s.toLowerCase(Locale.ENGLISH));
		sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		return sb.toString();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}

	@Override
	public String join(String... strings) {
		StringBuffer sb = new StringBuffer(strings[0]);
		for (int i = 1; i < strings.length; i++) {
			sb.append(" " + strings[i]);
		}
		return sb.toString();
	}

}
