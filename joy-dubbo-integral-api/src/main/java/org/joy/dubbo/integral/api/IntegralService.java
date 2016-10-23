package org.joy.dubbo.integral.api;

import org.joy.dubbo.integral.model.Integral;

/**
 * 积分服务
 * @author raozy
 *
 */
public interface IntegralService {
	
	/**
	 * 添加积分
	 * @param integral
	 */
	public void addIntegral(Integral integral);
}
