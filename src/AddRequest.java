public class AddRequest extends Request {
    private AddRequest() {
        createRequest(REQUEST_ADD,getStudentID(),getCourseID());
    }
}

