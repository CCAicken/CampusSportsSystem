package business.factory;

import model.Project;
import business.dao.ClassesDAO;
import business.dao.CollegeDAO;
import business.dao.MajorDAO;
import business.dao.ProjectDAO;
import business.dao.UserDAO;
import business.impl.ClassesDaoImpl;
import business.impl.CollegeDaoImpl;
import business.impl.MajorDaoImpl;
import business.impl.ProjectDaoImpl;
import business.impl.UserDaoImpl;

public class DAOFactory {
	/**
	 * 得到一个用于班级业务操作的ClassesDAO类实现对象
	 * @return ClassesDAO
	 */
	public static ClassesDAO getClassesDAO(){
		return new ClassesDaoImpl();
	}
	/**
	 * 返回一个用于学院业务操作的CollegeDAO对象
	 * @return CollegeDAO
	 */
	public static CollegeDAO getCollegeDAO(){
		return new CollegeDaoImpl();
	}
	/**
	 * 返回一个用于专业业务操作的MajorDAO对象
	 * @return MajorDAO
	 */
	public static MajorDAO getMajorDAO(){
		return new MajorDaoImpl();
	}
	/**
	 * 返回一个用于用户业务操作的UserDAO对象
	 * @return UserDAO
	 */
	public static UserDAO getUserDAO(){
		return new UserDaoImpl();
	}
	
	/**
	 * 返回一个用于比赛项目业务操作的ProjectDAO对象
	 * @return ProjectDAO
	 */
	public static ProjectDAO getProjectDAO(){
		return new ProjectDaoImpl();
	}
}
