package org.joy.dubbo.integral.model;

import java.io.Serializable;

public class Integral implements Serializable{
	
	private Long userId;
	private Integer point;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	
	

}
