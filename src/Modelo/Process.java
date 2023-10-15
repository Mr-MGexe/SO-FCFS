package Modelo;

public class Process {

	private int id;
	private int arrivalTime;
	private int burstTime;
	private int startTime;
	private int finalTime;
	private int returnTime;
	private int waitTime;

	public Process(int id, int arrivalTime, int burstTime) {
		this.id = id;
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
		startTime = 0;
		finalTime = 0;
		returnTime = 0;
		waitTime = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(int finalTime) {
		this.finalTime = finalTime;
	}

	public int getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(int returnTime) {
		this.returnTime = returnTime;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	public Object[] resume() {
		return new Object[] { "P" + id, arrivalTime, burstTime, startTime, finalTime, returnTime, waitTime};
	}
}
