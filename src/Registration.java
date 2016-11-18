import java.util.ArrayList;
import java.util.Collections;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList;

    public Registration(){
        requestList = new ArrayList<IRequest>();
    }

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        if (request.getRequestType()!= IRequest.REQUEST_ADD){
            throw new RuntimeException("not add");
        }else{
            if (exists(request)){
                throw new RuntimeException("exists studentID or courseID");
            }else{
                requestList.add(request);
            }
        }
    }

    /*Registration reg = new Registration();
    IRequest r1 = new AddRequest("100", "200");
    reg.add(r1);

    IRequest r2 = new DropRequest("100", "200");
    reg.drop(r2);
    */
    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if (request.getRequestType()!= IRequest.REQUEST_DROP) {
            throw new RuntimeException("not drop");
        }else{
            for(IRequest r: requestList) { //foreach
                if(r.getStudentID().equals(request.getStudentID()) && r.getCourseID().equals(request.getCourseID())){
                    requestList.remove(r);
                    return;
                }
            }
            throw new RuntimeException("not match studentID or courseID");
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
        //return Collections.frequency(requestList, type);
        int count = 0;
        for(int i = 0; i != requestList.size(); i++) {
            if(requestList.get(i).getRequestType()==(type)) {
                count++;
            }
        }
        return count;
    }


    // Count request by course ID
    public int countByCourseID(String courseID) {
        //return Collections.frequency(requestList, courseID);
        int count = 0;
        for(int i = 0; i != requestList.size(); i++) {
            if(requestList.get(i).getCourseID().equals(courseID)) {
                count++;
            }
        }
        return count;
    }


    // Count request by student ID
    public int countByStudentID(String studentID) {
        //return Collections.frequency(requestList, studentID);
        int count = 0;
        for(int i = 0; i != requestList.size(); i++) {
            if(requestList.get(i).getStudentID().equals(studentID)) {
                count++;
            }
        }
        return count;
    }
}
