public class DropRequest extends Request {
    private DropRequest(String studentID,String courseID) {
        createRequest(REQUEST_DROP,studentID,courseID);
    }
}
