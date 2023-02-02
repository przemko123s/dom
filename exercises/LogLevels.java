package exercises;

public class LogLevels {
    public static void main(String[] args) {
        //System.out.println(message("[INFO]: Operation completed"));
        //System.out.println(message("[WARNING]:  Disk almost full\r\n"));
        //System.out.println(logLevel("[ERROR]: Invalid operation"));
        System.out.println(reformat("[INFO]: Invalid operation"));

    }
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        if(logLine.contains("INFO")){
            return "info";
        }
        else if (logLine.contains("WARNING")){
            return "warning";
        }
        else return "error";
    }

    public static String reformat(String logLine) {
        if(logLine.contains("INFO")){
            return logLine.split(":")[1].trim()+" (info)";
        }
        else if (logLine.contains("WARNING")){
            return logLine.split(":")[1].trim()+" (warning)";
        }
        else return logLine.split(":")[1].trim()+" (error)";
    }
}
