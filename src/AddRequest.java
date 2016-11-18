public class AddRequest extends Request {
    private AddRequest(String studentID,String courseID) {
        createRequest(REQUEST_ADD,getStudentID(),getCourseID());
    }
}

