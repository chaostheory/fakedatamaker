package fakedatamaker.location;

public class FakeCoordinate {
	private Double latitude = null;
	private Double longitude = null;
	
	/**
	 * 
	 * @param latitude
	 * @param longitude
	 */
	public FakeCoordinate(Double latitude, Double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}