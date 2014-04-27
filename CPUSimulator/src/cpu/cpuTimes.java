package cpu;

public enum cpuTimes {

	max_burst_time(500), max_io_time(45);
    
	private int value;

    private cpuTimes(int value) {
            this.value = value;
    }
    
   int getTime() {
        return this.value;
}



}
