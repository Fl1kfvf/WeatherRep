
package weatherReport.transport.data;

import java.util.List;

import weatherReport.transport.data.util.Weather;
import weatherReport.transport.data.util.Main;
import weatherReport.transport.data.util.Wind;
import weatherReport.transport.data.util.Rain;
import weatherReport.transport.data.util.Clouds;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WeatherDTO {
    @SerializedName("weather")
    @Expose
    public List<Weather> weather;
    @SerializedName("main")
    @Expose
    public Main main;
    @SerializedName("wind")
    @Expose
    public Wind wind;
    @SerializedName("rain")
    @Expose
    public Rain rain;
    @SerializedName("clouds")
    @Expose
    public Clouds clouds;
    @SerializedName("dt")
    @Expose
    public Integer dt;

    @SerializedName("name")
    @Expose
    public String name;

}
