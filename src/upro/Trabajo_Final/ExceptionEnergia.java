package upro.Trabajo_Final;

public class ExceptionEnergia {
	private int year;
	private String resource;
	private String variable;
	private String units;
	private String magnitude;
	private String source;
	private double data_value;
	private String flag;
	
	public ExceptionEnergia(int year, String resource, String variable, String units, String magnitude, String source,
			double data_value, String flag) {
		super();
		this.year = year;
		this.resource = resource;
		this.variable = variable;
		this.units = units;
		this.magnitude = magnitude;
		this.source = source;
		this.data_value = data_value;
		this.flag = flag;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public double getData_value() {
		return data_value;
	}
	public void setData_value(double data_value) {
		this.data_value = data_value;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	

}
