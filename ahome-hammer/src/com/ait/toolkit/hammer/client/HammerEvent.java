package com.ait.toolkit.hammer.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Event for any Hammer interaction
 */
public class HammerEvent extends JsObject {

	protected HammerEvent(JavaScriptObject peer) {
		jsObj = peer;
	}

	public native HammerGesture getGesture()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = peer.gesture;
		return @com.ait.toolkit.hammer.client.HammerGesture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

	public native void preventDefault()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.preventDefault();
	}-*/;

	public double getTimeStamp() {
		return JsoHelper.getAttributeAsDouble(jsObj, "timestamp");
	}

	public Element getTarget() {
		return JsoHelper.getAttributeAsElement(jsObj, "target");
	}

	public JavaScriptObject getTouches() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "touches");
	}

	public String getPointerType() {
		return JsoHelper.getAttribute(jsObj, "pointerType");
	}

	public String getType() {
		return JsoHelper.getAttribute(jsObj, "type");
	}

	public native HammerEventCenter getCenter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = peer.center;
		return @com.ait.toolkit.hammer.client.HammerEventCenter::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

	public double getDeltaTime() {
		return JsoHelper.getAttributeAsDouble(jsObj, "deltaTime");
	}

	public double getDeltaX() {
		return JsoHelper.getAttributeAsDouble(jsObj, "deltaX");
	}

	public double getDeltaY() {
		return JsoHelper.getAttributeAsDouble(jsObj, "deltaY");
	}

	public double getVelocityX() {
		return JsoHelper.getAttributeAsDouble(jsObj, "velocityX");
	}

	public double getVelocityY() {
		return JsoHelper.getAttributeAsDouble(jsObj, "velocityY");
	}

	public double getAngle() {
		return JsoHelper.getAttributeAsDouble(jsObj, "angle");
	}

	public double getInterimAngle() {
		return JsoHelper.getAttributeAsDouble(jsObj, "interimAngle");
	}

	public String getDirection() {
		return JsoHelper.getAttribute(jsObj, "direction");
	}

	public String getInterimDirection() {
		return JsoHelper.getAttribute(jsObj, "interimDirection");
	}

	public double getDistance() {
		return JsoHelper.getAttributeAsDouble(jsObj, "distance");
	}

	public double getScale() {
		return JsoHelper.getAttributeAsDouble(jsObj, "scale");
	}

	public double getRotation() {
		return JsoHelper.getAttributeAsDouble(jsObj, "rotation");
	}

	public String getEventType() {
		return JsoHelper.getAttribute(jsObj, "eventType");
	}

	public HammerEvent getSourceEvent() {
		JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "srcEvent");
		return new HammerEvent(obj);
	}

	public HammerEvent getStartEvent() {
		JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "startEvent");
		return new HammerEvent(obj);
	}

}
