
package Newjavaall.Chame;

public class Marks{
	private int physics;
	private int chemistry;
	private int math;
	public Marks(int physics, int chemistry, int math) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
	}
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Marks [physics=" + physics + ", chemistry=" + chemistry + ", math=" + math + "]";
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}