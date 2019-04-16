package business.dao;

import java.sql.ResultSet;
import java.util.List;

import model.Score;
import model.ScoreCollege;

/**
 * 学院成绩业务接口类
 * @author jock
 *
 */
public interface ScoreCollegeDAO {
	/**
	 * 
	 * @param collegeid 学院id
	 * @return 学院成绩信息
	 */
	public ScoreCollege getByCollegeid(int collegeid);
	/**
	 * 查询所有学院成绩
	 * @return List<ScoreCollege>数据集
	 * string action 动作
	 */
	public List<ScoreCollege> getAllCollegeScore(String asction,String opretion);
	
	/**
	 * 根据学院名称查询学院成绩(分页)
	 * @collegename 学院名称
	 * @return List<ScoreCollege>数据集
	 */
	public List<ScoreCollege> getAllCollegeScoreBypage(String collegename);
	/**
	 * 查询学院成绩
	 * @param opretion 条件
	 * @return
	 */
	public List<ScoreCollege> getSearchCollege(String opretion);
	
}
