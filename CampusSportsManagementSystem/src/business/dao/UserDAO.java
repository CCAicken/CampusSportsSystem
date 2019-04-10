package business.dao;

import java.util.List;
import model.User;
/**
 * 用户业务接口类
 * @author Administrator
 *
 */
public interface UserDAO {
	/**
	 * 用户登录
	 * @param userid 用户id
	 * @param pwd 用户密码
	 * @return user用户对象
	 */
	public User login(String userid,String pwd);
	//public boolean insert(String userid,String username,String pwd,String agend,String mobile,Classes classes,College college,Role role);
	/**
	 * 添加学生用户对象
	 * @param user 用户对象
	 * @return 添加结果，true为成功，false为失败
	 */
	public boolean insertStu(User user);
	
	/**
	 * 添加教师用户对象
	 * @param user 用户对象
	 * @return 添加结果，true为成功，false为失败
	 */
	public boolean insertTea(User user);
	
	/**
	 * 修改密码
	 * @param userid 用户id
	 * @param pwd 新密码
	 * @return 更新结果，true为成功，false为失败
	 */
	public boolean updatePwd(String userid,String pwd);
	
	/**
	 * 删除用户对象
	 * @param userid 用户id
	 * @return 删除结果，true为成功，false为失败
	 */
	public boolean delete(String userid);
	
	/**
	 * 获取用户对象
	 * @param userid 用户id
	 * @return 用户对象
	 */
	public User getUser(String userid);
	
	/**
	 * 根据学院id获取用户对象列表
	 * @param collegeid 学院id
	 * @return 用户对象列表
	 */
	public List<User> selectByColl(String collegeid);
	
	/**
	 * 根据专业id获取用户对象列表
	 * @param majorid 专业id
	 * @return 用户对象列表
	 */
	public List<User> selectByMajor(String majorid);
	
	/**
	 * 根据班级id获取用户对象列表
	 * @param classid 班级id
	 * @return 用户对象列表
	 */
	public List<User> selectByClass(String classid);
}
