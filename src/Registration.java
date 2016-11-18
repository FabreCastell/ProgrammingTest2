import java.util.ArrayList;
import java.util.Collections;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList;

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        if (exists(request) ){
            throw new RuntimeException("exists studentID or courseID");
        }else{
            requestList.add(request);
        }

    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if (!exists(request)){
            throw new RuntimeException("not match studentID or courseID");
        }else{
            requestList.add(request);
        }

    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {
        return requestList.contains(request);
    }

    // Count all requests
    public int count() {
        return requestList.size();
    }

    // Count requests by request type
    public int countByType(int type) {
        return Collections.frequency(requestList, type);
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        return Collections.frequency(requestList, courseID);
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        return Collections.frequency(requestList, studentID);
    }
}
//55555