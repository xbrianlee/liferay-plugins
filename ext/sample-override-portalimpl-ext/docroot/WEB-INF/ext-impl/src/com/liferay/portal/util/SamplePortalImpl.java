package com.liferay.portal.util;

public class SamplePortalImpl extends PortalImpl {

	@Override
	public String getComputerName() {
		return "SAMPLE_EXT_INSTALLED_" + super.getComputerName();
	}

}