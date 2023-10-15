package Modelo;

public class FCFS {

	private Queue<Process> queue;
	private int currentFinalTime = 0;
	private int serialId;

	public FCFS() {
		queue = new Queue<Process>();
		serialId = 0;
	}

	private int randomBurst() {
		return (int) (Math.random() * 10 + 1);
	}

	private void calcuteTime(Process process) {
		process.setStartTime(currentFinalTime);
		process.setFinalTime(process.getBurstTime() + process.getStartTime());
		process.setReturnTime(process.getFinalTime() - process.getArrivalTime());
		process.setWaitTime(process.getReturnTime() - process.getBurstTime());
		currentFinalTime = process.getFinalTime();
	}

	public Object[] getDataProcess(Process process) {
		calcuteTime(process);
		return process.resume();
	}

	public Object[] addProcess() {
		Process process = new Process(serialId + 1, serialId, randomBurst());
		queue.add(process);
		serialId++;
		return process.resume();
	}

	public Object[] appendProcess(Process process) {
		queue.add(process);
		return process.resume();
	}

	public Process pollProcess() {
		return queue.poll();
	}

	public int getSerialId() {
		return serialId;
	}

	public int getCurrentFinalTime() {
		return currentFinalTime;
	}

	public boolean isQueueEmpty() {
		return queue.isEmpty();
	}

	public void finalizeQueue() throws Throwable {
		queue.finalize();
	}
}