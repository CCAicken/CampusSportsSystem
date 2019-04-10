package business.dao;

import java.util.List;

import model.Scene;

/**
 * 比赛场次信息接口类
 * @author Administrator
 *
 */
public interface SceneDAO {
	/**
	 * 添加场次比赛人员信息
	 * @param scene 场次信息对象
	 * @return 操作结果，true为成功，false为失败
	 */
	public boolean insert(Scene scene);
}
