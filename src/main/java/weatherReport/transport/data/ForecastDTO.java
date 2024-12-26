package weatherReport.transport.data;


import weatherReport.transport.data.util.City;
import weatherReport.transport.data.util.Stamp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastDTO {

    @SerializedName("cod")
    @Expose
    public String cod;
    @SerializedName("message")
    @Expose
    public Integer message;
    @SerializedName("cnt")
    @Expose
    public Integer cnt;
    @SerializedName("list")
    @Expose
    public List<Stamp> list;
    @SerializedName("city")
    @Expose
    public City city;


}
