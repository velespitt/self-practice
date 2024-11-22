package day04_practice_tasks_switch;

public class HttpStatusCode {
    public static void main(String[] args) {
        /*
        Create a class named HttpStatusCode. HTTP is the protocol that governs communications between
Web servers and web clients. Part of the protocol includes a status code returned by the server to
inform the browser of its most recent page request status.

		Here are some of the codes and their meanings:

			200, OK
			201, Created
			202, Accepted
			301, Moved Permanently
			303, See Other
			304, Not Modified
			307, Temporary Redirect
			400, Bad Request
			401, Unauthorized
			403, Forbidden
			404, Not Found
			410, Gone
			500, Internal Server Error
			503, Service Unavailable
         */
        int statusCode = 200;

        switch (statusCode){
            case 200 -> System.out.println("OK");
            case 201 -> System.out.println("Created");
            case 202 -> System.out.println("Accepted");
            case 301 -> System.out.println("Moved Permanently");
            case 303 -> System.out.println("See Other");
            case 304 -> System.out.println("Not Modified");
            case 307 -> System.out.println("Temporary redirect");
            case 400 -> System.out.println("Bad Request");
            case 401 -> System.out.println("Unauthorized");
            case 403 -> System.out.println("Forbidden");
            case 404 -> System.out.println("Not Found");
            case 410 -> System.out.println("Gone");
            case 500 -> System.out.println("Internal Server Error");
            case 503 -> System.out.println("Service Unavailable");

        }
    }
}
