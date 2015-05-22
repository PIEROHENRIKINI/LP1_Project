package edu.lp1.sistemagestaoacademica.model.vo;


public class UnderGraduateStudent extends Student {
	
	private String major;
	private String minor;
	
	

	public UnderGraduateStudent(long ID, String name, String address, String phone, String email, String major, String minor) {
		super(ID,name,address,phone,email);
		this.major = major;
		this.minor = minor;
	}
	
	
	@Override
	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String getMinor() {
		return minor;
	}



	public void setMinor(String minor) {
		this.minor = minor;
	}



	/* (non-Javadoc)
	 * @see edu.lp1.sistemagestaoacademica.model.vo.Student#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" \n|Principal: "+major+" \n|Secundário: "+minor;
	}

}
