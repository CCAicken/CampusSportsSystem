package business.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import common.properties.ProjectType;
import model.Project;
import model.Student;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.ProjectDAO;
import business.factory.DAOFactory;

public class ProjectDaoImpl implements ProjectDAO {
	private BaseDao bdao = null;
	public ProjectDaoImpl() {
		bdao = new BaseDaoImpl();
	}

	@Override
	public boolean insert(Project project) {
		String sql = "insert into T_Project(proname,scenelimit,collegelimit,totallimit,protype) velues(?,?,?,?,?)";
		Object[] param = {project.getProname(),project.getScenelimit(),project.getCollegelimit(),project.getTotallimit(),project.getProtype()};
		int row = bdao.insert(sql, param);
		if(row>0){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean update(Project project) {
		String sql = "update T_Project set proname=?,scenelimit=?,collegelimit=?,totallimit=?,protype=? where proid=?";
		Object[] para = {project.getProname(),project.getScenelimit(),project.getCollegelimit(),project.getTotallimit(),project.getProtype(),project.getProid()};
		int row = bdao.update(sql, para);
		if(row>0){
			return true;
		}
		else 
		return false;
	}

	@Override
	public boolean delete(int projectid) {
		String sql = "delete from T_Project where proid=?";
		Object[] para = {projectid};
		int row = bdao.delete(sql, para);
		if(row>0) return true;
		else return false;
	}

	@Override
	public List<Project> select() {
		String sql = "select * from T_Project";
		ResultSet rs = bdao.select(sql);
		List<Project> list = null;
		try {
			if(rs!=null&&rs.next()){
				list = Project.toList(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return list;
		}
	}

	@Override
	public List<Project> selectByType(int type) {
		List<Project> list = null;
		if(type==1){
			String sql = "select * from T_Project where protype=1 or protype=2";
			ResultSet rs = bdao.select(sql);
			try{
				if(rs!=null&&rs.next()){
					list = Project.toList(rs);
				}
			}catch(SQLException ex){
				ex.printStackTrace();
			}finally{
				return list;
			}
		}
		else if(type==2){
			String sql = "select * from T_Project where protype=3 or protype=4";
			ResultSet rs = bdao.select(sql);
			try{
				if(rs!=null&&rs.next()){
					list = Project.toList(rs);
				}
			}catch(SQLException ex){
				ex.printStackTrace();
			}finally{
				return list;
			}
		}
		return list;
	}
	
//	public static void main(String[] args){
//		ProjectDAO dao = new ProjectDaoImpl();
//		List<Project> list = dao.selectByType(2);
//		for(Project project : list){
//			System.out.println(project.getProname());
//		}
//	}

	@Override
	public Integer currentNum(int proid){
		String sql = "select * from T_Match where proid=?";
		Object[] para = {proid};
		int row = bdao.selectCount(sql,para);
		return row;
	}
}
