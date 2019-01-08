package tech.iopi.usercenter.sql;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;

import tech.iopi.blueprint.usercenter.IUserCenter;

public class UserCenterTest {
	
	private static Ioc ioc;
	private static IUserCenter userCenter;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ioc = new NutIoc(new JsonLoader("UserCenter.json"));
		userCenter = ioc.get(null, "userCenter");
	}

	@Test
	public void test() {
		assertNotNull(userCenter);
	}

}
