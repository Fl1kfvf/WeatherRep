
package weatherReport.transport.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocodingDTO {
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("lat")
    @Expose
    public Double lat;
    @SerializedName("lon")
    @Expose
    public Double lon;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("state")
    @Expose
    public String state;

    public String getFullName() {
        return name + ", " + state;
    }


}
