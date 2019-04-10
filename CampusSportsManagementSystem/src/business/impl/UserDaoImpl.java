package business.impl;

import java.sql.ResultSet;
import java.util.List;

import model.User;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.UserDAO;

public class UserDaoImpl implements UserDAO {
	private BaseDao bdao = null;
	public UserDaoImpl(){
		bdao = new BaseDaoImpl();
	}
	@Override
	public User login(String userid, String pwd) {
		String sql = "select * from V_User where userid=? and pwd=?";
		Object[] param = {userid,pwd};
		ResultSet rs = bdao.select(sql,param);
		
		User user = new User(rs);
		bdao.close();
		if(user.getUserid()==null || user.getUserid().equals("")){
			return null;
		}else{
			return user;
		}
	}

	@Override
	public boolean insertStu(User user) {
		String sql = "insert into T_User(userid,userbame,pwd,agend,mobile,classid,collegeid,roleid) values(?,?,?,?,?,?,?,?)";
		Object[] param = {user.getUserid(),user.getUsername(),user.getPwd(),user.getAgend(),user.getMobile(),user.getClasses().getClassid(),user.getCollege().getCollegeid(),user.getRole().getRoleid()};
		int row = bdao.insert(sql, param);
		if(row>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean insertTea(User user) {
		String sql = "insert into T_User(userid,userbame,pwd,agend,mobile,collegeid,roleid) values(?,?,?,?,?,?,?)";
		Object[] param = {user.getUserid(),user.getUsername(),user.getPwd(),user.getAgend(),user.getMobile(),user.getCollege().getCollegeid(),user.getRole().getRoleid()};
		int row = bdao.insert(sql, param);
		if(row>0){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectByColl(String collegeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectByMajor(String majorid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectByClass(String classid) {
		// TODO Auto-generated method stub
		return null;
	}

}
