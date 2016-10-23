package org.joy.dubbo.integral.service;

import org.joy.dubbo.integral.api.IntegralService;
import org.joy.dubbo.integral.model.Integral;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IntegralServiceImpl implements IntegralService {
	private Logger log = LoggerFactory.getLogger(IntegralServiceImpl.class);

	@Override
	public void addIntegral(Integral integral) {
		log.error("用户："+integral.getUserId()+",分数："+integral.getPoint()+"，添加成功");
		System.out.println("用户："+integral.getUserId()+",分数："+integral.getPoint()+"，添加成功");

	}

}
