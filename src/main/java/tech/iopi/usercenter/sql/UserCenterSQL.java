/**
 * 
 */
package tech.iopi.usercenter.sql;


import javax.sql.DataSource;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;

import tech.iopi.blueprint.usercenter.IUserCenter;
import tech.iopi.blueprint.usercenter.UserID;

/**
 * @author Neal
 * @since 0.1.0
 *
 */
public class UserCenterSQL implements IUserCenter {
	
	private DataSource dataSource;
	protected Dao dao;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		dao = new NutDao(this.dataSource);
	}

	/* (non-Javadoc)
	 * @see tech.iopi.blueprint.usercenter.IUserCenter#addNewUser(tech.iopi.blueprint.usercenter.UserID, java.lang.String)
	 */
	@Override
	public String addNewUser(UserID userId, String password) {
		// TODO Auto-generated method stub
		Dao dao = new NutDao(null);
		return null;
	}

	/* (non-Javadoc)
	 * @see tech.iopi.blueprint.usercenter.IUserCenter#login(tech.iopi.blueprint.usercenter.UserID, java.lang.String)
	 */
	@Override
	public String login(UserID userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see tech.iopi.blueprint.usercenter.IUserCenter#login(tech.iopi.blueprint.usercenter.UserID)
	 */
	@Override
	public String login(UserID userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
