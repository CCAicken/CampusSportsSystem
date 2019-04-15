package business.impl;

import java.util.List;

import javax.ejb.Init;

import model.Match;
import business.basic.BaseDao;
import business.basic.BaseDaoImpl;
import business.dao.MatchDAO;
import business.factory.DAOFactory;

public class MatchDaoImpl implements MatchDAO {
	private BaseDao bdao = null;
	public MatchDaoImpl() {
		bdao = new BaseDaoImpl();
	}

	@Override
	public boolean insert(Match match) {
//		String proName = "up_AddMatch(?,?)";
//		Object[] param = {match.getProject().getProid(),match.getUser().getUserid()};
//		int row = (Integer)bdao.executeProduce(proName, param);
//		if(row>0){
//			return true;
//		}else{
//			return false;
//		}
		return true;
	}

	@Override
	public List<Match> selectByUser(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
