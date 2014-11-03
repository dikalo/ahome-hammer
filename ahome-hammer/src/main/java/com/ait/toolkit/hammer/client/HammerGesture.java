package com.ait.toolkit.hammer.client;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Hammer gesture object
 */
public class HammerGesture extends JsObject {

	protected HammerGesture(JavaScriptObject peer) {
		jsObj = peer;
	}

	public native void preventDefault()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.preventDefault();
	}-*/;
}
