import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private String studentID ;
    private String courseID ;
    private static int requestType ;



    public static IRequest createRequest(int type, String studentID, String courseID) {
        IRequest request = new Request();
        request.setRequestType(type);
        request.setStudentID(studentID);
        request.setCourseID(courseID);

        return request;
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    public String setStudentID(String studentID) {

        if(studentID == null) throw new RuntimeException();
        this.studentID = studentID;

        return studentID;
    }

    @Override
    public String getCourseID() {
        return this.courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        if(courseID != null ) this.courseID = courseID ;
        else throw new RuntimeException();
    }

    @Override
    public int getRequestType() {
        return requestType ;
    }
    public void setRequestType(int type) {

        if(type == REQUEST_ADD || type == REQUEST_DROP ){
            requestType = type ;

        }
        else throw new RuntimeException();
    }


}
