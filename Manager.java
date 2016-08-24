package ssa;

public class Manager extends Employee {
	
	public String print() {
		return super.print() + " and also a Manager";
	}
	public boolean hasParkingPriv(boolean value) {
		return true;
	}
	
	public Manager() {
		super();
		this.setParkingPriv(true);
	}
	public Manager(String name) {
		super(name);
		this.setParkingPriv(false);
	}
}
