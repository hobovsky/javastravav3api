package test.model;

import stravajava.model.MapPoint;
import test.utils.BeanTest;

public class MapPointTest extends BeanTest<MapPoint> {

	@Override
	protected Class<MapPoint> getClassUnderTest() {
		return MapPoint.class;
	}

}
