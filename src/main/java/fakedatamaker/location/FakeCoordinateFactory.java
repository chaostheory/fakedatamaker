package fakedatamaker.location;

import org.apache.commons.math3.random.RandomData;
import org.apache.commons.math3.random.RandomDataImpl;

public class FakeCoordinateFactory {
	public static final RandomData RANDOM = new RandomDataImpl();
	
	private FakeCoordinateFactory() {

	}
	
	public static FakeCoordinate makeCoordinate(){
		return null;
	}
}