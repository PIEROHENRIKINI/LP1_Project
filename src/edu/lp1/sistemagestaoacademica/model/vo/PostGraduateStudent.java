/**
 * 
 */
package edu.lp1.sistemagestaoacademica.model.vo;

/**
 * @author Brendoon Ryos
 *
 */
public class PostGraduateStudent extends Student {
	
	private String thesisTitle = new String();
	private String supervisor = new String();
	
	public PostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle, String supervisor) {
		super(ID,name,address,phone,email);
		this.thesisTitle = thesisTitle;
		this.supervisor = supervisor;
	}
	@Override
	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	@Override
	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	/* (non-Javadoc)
	 * @see edu.lp1.sistemagestaoacademica.model.vo.Student#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return super.toString()+" \n|Titulo tese: "+thesisTitle+" \n|Orientador: "+supervisor;
	}

	

}
