/** Class that represents a computer. */
public class Computer {
    //Data Fields
    private String manufacturer;
    private String processor;
    private double ramSize;
    private int diskSize;
    private double processorSpeed;

    //Methods
    /** Initializes a Computer object with all properties specified.
     * @param man The Computer manufacturer
     * @param processor The processor type
     * @param disk The disk size
     * @param procSpeed The processor speed
     */
    public Computer(String man, String processor, double ram,
                    int disk, double procSpeed){
        manufacturer = man;
        this.processor = processor;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = this.procSpeed;
    }

    public double computerPower() { return ramSize * processorSpeed; }
    public double getRamSize() { return ramSize; }
    public double getProcessorSpeed() { return processorSpeed; }
    public int getDiskSize() { retunr diskSize; }

    public String toString() {
        String result = "Manufacturer: " + manufacturer +
                "\nCPU: " + processor +
                "\nRAM: " + ramSize + " gigabytes" +
                "\nDisk: " + diskSize + " gigabytes" +
                "\nProcessor speed: " + processorSpeed + " gigahertz";
        return result;
    }
}

/** Class that represents a Notebook computer. */
public class Notebook extends Computer {
    //Data Fields
    private double screenSize;
    private double weight;

    //Methods
    /** Initializes a Notebook object with all properties specified
     * @param man The computer manufacturer
     * @param proc The processor type
     * @param ram The RAM size
     * @param disk The disk size
     * @param procSpeed The processor speed
     * @param wei The weight
     */
    public Notebook(String man, String proc, double ram, int disk,
                    double procSpeed, double screen, double wei){
        super(man, proc, ram, disk, procSpeed);
        screenSize = screen;
        weight = wei;
    }

    @override
    public String toString(){
        String result = super.toString() +
                        "\nScreen Size: " + screenSize + " inches" +
                        "\nWeight: " + weight + " pounds";
        return result;
    }
}
