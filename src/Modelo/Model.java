package Modelo;

public class Model {

	private FCFS queueReady;
	private FCFS queueLock;
	
	public Model() {
		queueReady = new FCFS();
		queueLock = new FCFS();
	}

	public FCFS getQueueReady() {
		return queueReady;
	}

	public void setQueueReady(FCFS queueReady) {
		this.queueReady = queueReady;
	}

	public FCFS getQueueLock() {
		return queueLock;
	}

	public void setQueueLock(FCFS queueLock) {
		this.queueLock = queueLock;
	}

	public void finalizeQueues() throws Throwable {
		queueReady.finalizeQueue();
		queueLock.finalizeQueue();
	}
}
