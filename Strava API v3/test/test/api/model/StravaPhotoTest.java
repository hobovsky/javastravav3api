package test.api.model;

import stravajava.api.v3.model.StravaPhoto;
import test.utils.BeanTest;


/**
 * @author dshannon
 *
 */
public class StravaPhotoTest extends BeanTest<StravaPhoto> {

	@Override
	protected Class<StravaPhoto> getClassUnderTest() {
		return StravaPhoto.class;
	}
}
