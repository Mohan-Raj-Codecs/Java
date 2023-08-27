package IPinfo;
import com.google.gson.Gson;

public class json {

	public schema parseString(String resp) {
		
        Gson gson = new Gson();
        schema data = gson.fromJson(resp, schema.class);
        System.out.println("Name: " + data.continent);
        System.out.println("Age: " + data.country);
        System.out.println("City: " + data.city);
        return data;
	}

}

class schema{
    public String status;
    public String message;
    public String continent;
    public String country;
    public String countryCode;
    public String regionName;
    public String city;
    public String zip;
    public double lat;
    public double lon;
    public String timezone;
    public String currency;
    public String isp;
    public String org;
    public String as;
    public String reverse;
    public boolean mobile;
    public boolean proxy;
    public boolean hosting;
    public String ip;
    public boolean cached;
    public int cacheTimestamp;
}
