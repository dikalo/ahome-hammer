package com.ait.toolkit.hammer.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Event for any Hammer interaction
 */
public class HammerEventCenter extends JsObject {

	protected HammerEventCenter(JavaScriptObject peer) {
		jsObj = peer;
	}

	public double getPageX() {
		return JsoHelper.getAttributeAsDouble(jsObj, "pageX");
	}

	public double getPageY() {
		return JsoHelper.getAttributeAsDouble(jsObj, "pageY");
	}

}
