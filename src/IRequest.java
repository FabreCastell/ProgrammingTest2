/**
 * Created by pruet on 18/11/2559.
 */
public interface IRequest {
    public static final int REQUEST_ADD = 1;
    public static final int REQUEST_DROP = 2;

    public String getStudentID();
    public String setStudentID(String studentID);
    public String getCourseID();
    public void setCourseID(String courseID);
    public int getRequestType();
    public void setRequestType(int type);
}
