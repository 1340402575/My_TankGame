package com.gh.model;
/**
 * ��ը��
 * ���ǵ�ͬʱ��ը�������
 * @author ganhang
 *
 */
public class Bomb {
	private int x;
	private int y;//����
	public boolean islive=true;
	private int time=9;//ը������
	public Bomb() {
		super();
	}
	public Bomb(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getTime() {
		return time;
	}
	//�����ݼ�
	public void livedown(){
		if(time>0){
			time--;
		}else{
			islive=false;
		}
	}
}
