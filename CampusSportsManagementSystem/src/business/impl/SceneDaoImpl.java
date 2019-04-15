package business.impl;

import java.sql.ResultSet;
import java.util.List;

import model.Scene;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.SceneDAO;

public class SceneDaoImpl implements SceneDAO {
	private BaseDao bdao = null;
	public SceneDaoImpl() {
		bdao = new BaseDaoImpl();
	}

	@Override
	public boolean insert(Scene scene) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Scene> seleScenes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scene> seleScenes(String userid) {
		String sql = "select * from V_Scene where userid=?";
		Object[] para = {userid};
		List<Scene> list = null;
		ResultSet rs = bdao.select(sql,para);
		if(rs!=null){
			list = Scene.toList(rs);
			return list;
		}
		else{
			return null;
		}
	}
//	public static void main(String[] args){
//		SceneDAO sDao = new SceneDaoImpl();
//		List<Scene> list = sDao.seleScenes("1001");
//			System.out.print(list.size());
//	}
}
