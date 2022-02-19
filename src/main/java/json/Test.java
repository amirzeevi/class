package json;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONException;

import javax.net.ssl.HttpsURLConnection;


public class Test {
    public static final String JSON_URL = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";
    public static final String JSON_BIKE = "https://data.gov.il/api/3/action/datastore_search?resource_id=bf9df4e2-d90d-4c0a-a400-19e15af8e95f&q=";
    public static final String RECALL = "https://data.gov.il/api/3/action/datastore_search?resource_id=36bf1404-0be4-49d2-82dc-2f1ead4a8b93&q=";
    public static final String NECHIM = "https://data.gov.il/api/3/action/datastore_search?resource_id=c8b9f9c8-4612-4068-934f-d4acd2e3c06e&q=";
    public static final String ON_ROAD = "https://data.gov.il/api/3/action/datastore_search?resource_id=f6efe89a-fb3d-43a4-bb61-9bf12a9b9099&q=";

    public static void main(String[] args) {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter License Plate");
        String lp = scanner.nextLine();
        test.readJsonCar(test.getURLdata(JSON_URL+lp));
        test.isNechim(test.getURLdata(NECHIM + lp));
        test.isOnRoad(test.getURLdata(NECHIM + lp));
        test.isReCall(test.getURLdata(RECALL + lp));
    }

    private void readJsonCar(String JSON) {

        try {
            var carData = new JSONObject(JSON);
            var result = carData.getJSONObject("result");
            var carArray = result.getJSONArray("records");
            if (carArray.length() == 0) {
                System.out.println("Car not found");
                return;
            }
            var singleCar = (JSONObject) carArray.get(0);
            System.out.println();
            System.out.println("Maker: " + singleCar.getString("tozeret_nm"));
            System.out.println("Model: " + singleCar.getString("kinuy_mishari"));
            System.out.println("Engine: " + singleCar.getString("degem_manoa"));
            System.out.println("Color: " + singleCar.getString("tzeva_rechev"));
            System.out.println("Last test: " + singleCar.getString("mivchan_acharon_dt").split("T")[0]);
            System.out.println("License expiration: " + singleCar.getString("tokef_dt").split("T")[0]);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void readJsonBike(String JSON) {

        try {
            var bikeData = new JSONObject(JSON);
            var result = bikeData.getJSONObject("result");
            var bikeArray = result.getJSONArray("records");
            if (bikeArray.length() == 0) {
                System.out.println("Bike not found");
                return;
            }
            var singleBike = (JSONObject) bikeArray.get(0);
            System.out.println();
            System.out.println("Maker: " + singleBike.getString("tozeret_nm"));
            System.out.println("Country: " + singleBike.getString("tozeret_eretz_nm"));
            System.out.println("Model: " + singleBike.getString("degem_nm"));
            System.out.println("Year: " + singleBike.getInt("shnat_yitzur"));
            System.out.println("Engine: " + singleBike.getString("nefach_manoa"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void isReCall(String RECALL) {
        try {
            var recallObj = new JSONObject(RECALL);
            var result = recallObj.getJSONObject("result");
            var records = result.getJSONArray("records");
            if (records.length() == 0) {
                System.out.println("No recall");
            } else {
                System.out.println("Recall was made");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void isNechim(String NECHIM) {
        try {
            var nechim = new JSONObject(NECHIM);
            var result = nechim.getJSONObject("result");
            var records = result.getJSONArray("records");
            if (records.length() == 0) {
                System.out.println("Vehicle is not for disabled");
            } else {
                System.out.println("Vehicle is for disabled");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void isOnRoad(String ON_ROAD) {
        try {
            var onRoad = new JSONObject(ON_ROAD);
            var result = onRoad.getJSONObject("result");
            var records = result.getJSONArray("records");
            if (records.length() == 0) {
                System.out.println("Vehicle is on road");
            } else {
                System.out.println("Vehicle was taken off the road");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String getURLdata(String url) {
        HttpURLConnection httpURLConnection = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            httpURLConnection = (HttpsURLConnection) new URL(url).openConnection();
            var buf = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            while ((line = buf.readLine()) != null){
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert httpURLConnection != null;
            httpURLConnection.disconnect();
        }
        return stringBuilder.toString();
    }
}
