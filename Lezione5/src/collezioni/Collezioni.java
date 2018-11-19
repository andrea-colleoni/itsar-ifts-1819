package collezioni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collezioni {

	public static void main(String[] args) {
		List<String> stringhe = new ArrayList<>();

		stringhe.add("ciao");
		stringhe.add("Buongiorno");
		stringhe.add("buonasera");

		System.out.println(stringhe.get(1));

		Map<String, String> mappa = new HashMap<>();
		mappa.put("lu", "lunedì");
		mappa.put("ma", "martedì");
		mappa.put("me", "mercoledì");
		
		System.out.println(mappa.get("ma"));

	}

}
