package json_data_streaming;

import java.util.List;

/**
 * Logs class
 * @author Jasper Lee
 *
 */
public class Logs {
	private Log[] logs;
	private String id;
	
	//Getter and Setter methods
	public Log[] getLogs() {
		return logs;
	}
	public String getId() {
		return id;
	}
	public Log getLog(int i) {
		return logs[i];
	}
	
	public void setLogs(Log[] logs) {
		this.logs = logs;
	}
	public void setId(String id) {
		this.id = id;
	}
}
