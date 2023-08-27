package IPinfo;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class api_fetch {
	
	public String fetch(String url,String data) {
		data = (data==null)?"":data;
		url+=data;
		try {
			Connection.Response response = Jsoup.connect(url)
					.ignoreContentType(true) // This is important for JSON responses
					.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:91.0) Gecko/20100101 Firefox/91.0")
					.execute();

			if (response.statusCode() == 200) {
				String json = response.body(); // JSON response as a string
//				System.out.println(json);
				return json;
			} else {
				return "Failed to retrieve JSON. Status code: " + response.statusCode();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "{\"status\":\"fail\",\"message\":\"No Internet :(\"}";
		}
	}

}
