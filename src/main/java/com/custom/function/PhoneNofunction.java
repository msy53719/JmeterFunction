package com.custom.function;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;
import org.apache.jmeter.util.JMeterUtils;

public class PhoneNofunction extends AbstractFunction {

	private static final List<String> desc = new LinkedList<String>();
	private static final String KEY = "_phoneNo";
	private CompoundVariable teet;
	

	static {
		desc.add(JMeterUtils.getResString(""));
		desc.add(JMeterUtils.getResString(""));
		desc.add(JMeterUtils.getResString(""));
	}

	public List<String> getArgumentDesc() {
		return desc;
	}

	@Override
	public String execute(SampleResult previousResult, Sampler currentSampler) throws InvalidVariableException {
		
		return null;
	}

	@Override
	public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getReferenceKey() {
		return KEY;
	}

}
