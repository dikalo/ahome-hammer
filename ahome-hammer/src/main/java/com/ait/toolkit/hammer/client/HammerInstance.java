package com.ait.toolkit.hammer.client;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Class returned after wrapping an Element with Hammer
 */
public class HammerInstance extends JsObject {

	protected HammerInstance(JavaScriptObject peer) {
		jsObj = peer;
	}

	public HammerEventRegistration onHold(HammerEventHandler handler) {
		return on("hold", handler);
	}

	public HammerEventRegistration onTap(HammerEventHandler handler) {
		return on("tap", handler);
	}

	public HammerEventRegistration onDoubleTap(HammerEventHandler handler) {
		return on("doubletap", handler);
	}

	public HammerEventRegistration onDrag(HammerEventHandler handler) {
		return on("drag", handler);
	}

	public HammerEventRegistration onDragStart(HammerEventHandler handler) {
		return on("dragstart", handler);
	}

	public HammerEventRegistration onDragEnd(HammerEventHandler handler) {
		return on("dragend", handler);
	}

	public HammerEventRegistration onDragUp(HammerEventHandler handler) {
		return on("dragup", handler);
	}

	public HammerEventRegistration onDragDowm(HammerEventHandler handler) {
		return on("dragdowm", handler);
	}

	public HammerEventRegistration onDragLeft(HammerEventHandler handler) {
		return on("dragleft", handler);
	}

	public HammerEventRegistration onDragRight(HammerEventHandler handler) {
		return on("dragright", handler);
	}

	public HammerEventRegistration onSwipe(HammerEventHandler handler) {
		return on("swipe", handler);
	}

	public HammerEventRegistration onSwipeUp(HammerEventHandler handler) {
		return on("swipeUp", handler);
	}

	public HammerEventRegistration onSwipeDown(HammerEventHandler handler) {
		return on("swipedown", handler);
	}

	public HammerEventRegistration onSwipeLeft(HammerEventHandler handler) {
		return on("swipeleft", handler);
	}

	public HammerEventRegistration onSwipeRight(HammerEventHandler handler) {
		return on("swiperight", handler);
	}

	public HammerEventRegistration onTransform(HammerEventHandler handler) {
		return on("transform", handler);
	}

	public HammerEventRegistration onTransformStart(HammerEventHandler handler) {
		return on("transformstart", handler);
	}

	public HammerEventRegistration onTransformEnd(HammerEventHandler handler) {
		return on("transformend", handler);
	}

	public HammerEventRegistration onRotate(HammerEventHandler handler) {
		return on("rotate", handler);
	}

	public HammerEventRegistration onPich(HammerEventHandler handler) {
		return on("pinch", handler);
	}

	public HammerEventRegistration onPichIn(HammerEventHandler handler) {
		return on("pinchIn", handler);
	}

	public HammerEventRegistration onPichOut(HammerEventHandler handler) {
		return on("pinchOut", handler);
	}

	public HammerEventRegistration onTouch(HammerEventHandler handler) {
		return on("touch", handler);
	}

	public HammerEventRegistration onRelease(HammerEventHandler handler) {
		return on("release", handler);
	}

	public HammerEventRegistration onGesture(HammerEventHandler handler) {
		return on("gesture", handler);
	}

	public native HammerEventRegistration on(String event, HammerEventHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(e) {
			var eventObject = @com.ait.toolkit.hammer.client.HammerEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.hammer.client.HammerEventHandler::onEvent(Lcom/ait/toolkit/hammer/client/HammerEvent;)(eventObject);
		};
		peer.on(event, fn);
		return @com.ait.toolkit.hammer.client.HammerEventRegistration::new(Lcom/ait/toolkit/hammer/client/HammerInstance;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this, event, fn);

	}-*/;

}
