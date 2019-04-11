package business.dao;

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
	 */
	public List<ScoreCollege> getAllCollegeScore();
	
	/**
	 * 查询所有学院成绩(分页)
	 * @return List<ScoreCollege>数据集
	 */
	public List<ScoreCollege> getAllCollegeScoreBypage(ScoreCollege scorecollege);
}
