package com.example.linguaggio;

public class Calcolatore {
private Integer x;
private Integer y;
	public Calcolatore(Integer x, Integer y)
	{
		this.x=x;
		this.y=y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public Integer somma(Integer x, Integer y) {
		x=x+y;
		return x;
	}
	public Integer differenza(Integer x, Integer y) {
		if(x==null)
				x=0;
		if(y==null)
				y=0;
		x=x-y;
		return x;
	}
}
