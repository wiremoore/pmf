package org.contract;

import java.util.List;
import java.util.Observer;

public interface Imodel {
	
	public boolean connect(String port);
	
	public boolean disconnect();
	
	public double getTemperature();
	
	public void setTemperature(int temperature);
	
	public double getHumidityTx();
	
	public String getLog();
	
	public boolean getConnected();
	
	public List<String> getPortAvailable();
	
	public List<Double> getTempInt();
	
	public List<Double> getTempExt();
	
	public List<Double> getTempModule();
	
	public List<Double> getHumidity();

	void observerAdd(Observer o);

	void observerDelete(Observer o);
}
