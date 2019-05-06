package week2Capstone;

public class Task {

	public String memberName;
	public String desc;
	public String dueDate;
	public boolean complete = false;

	public Task(String memberName, String desc, String dueDate) {
		this.memberName = memberName;
		this.desc = desc;
		this.dueDate = dueDate;
		complete = false;
	}

	// overloaded constructor w. completion status
	public Task(String memberName, String desc, String dueDate, boolean complete) {
		this.memberName = memberName;
		this.desc = desc;
		this.dueDate = dueDate;
		this.complete = complete;
	}

	public void setMemberName(String a) {
		memberName = a;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setDesc(String a) {
		desc = a;
	}

	public String getDesc() {
		return desc;
	}

	public void setDueDate(String a) {
		dueDate = a;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setComplete(boolean a) {
		complete = a;
	}

	public boolean getComplete() {
		return complete;
	}

	@Override
	public String toString() {
		return ("Team member name: " + memberName + "\n" + "Task Description: " + desc + "\n" + "Due Date: " + dueDate
				+ "\n" + "done? "
				+ complete);
	};

}
