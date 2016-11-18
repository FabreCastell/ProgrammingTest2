public class DropRequest extends Request {
    private DropRequest() {
        createRequest(REQUEST_DROP,getStudentID(),getCourseID());
    }
}
