package com.ait.toolkit.hammer.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Hammer gesture options
 */
public class HammerGestureOptions extends JsObject {

	protected HammerGestureOptions() {
		jsObj = JsoHelper.createObject();
	}

	public void setBehavior(HammerGestureBehavior value) {
		JsoHelper.setAttribute(jsObj, "behavior", value.getJsObj());
	}

	public void setDoubleTapDistance(double value) {
		JsoHelper.setAttribute(jsObj, "doubleTapDistance", value);
	}

	public void setDoubleTapInterval(double value) {
		JsoHelper.setAttribute(jsObj, "doubleTapInterval", value);
	}

	public void setDrag(boolean value) {
		JsoHelper.setAttribute(jsObj, "drag", value);
	}

	public void setDragBlockHorizontal(boolean value) {
		JsoHelper.setAttribute(jsObj, "dragBlockHorizontal", value);
	}

	public void setDragBlockVertical(boolean value) {
		JsoHelper.setAttribute(jsObj, "dragBlockVertical", value);
	}

	public void setDragDistanceCorrectiob(boolean value) {
		JsoHelper.setAttribute(jsObj, "dragDistanceCorrection", value);
	}

	public void setDragLockMinDistance(double value) {
		JsoHelper.setAttribute(jsObj, "dragLockMinDistance", value);
	}

	public void setDragLockToAxis(boolean value) {
		JsoHelper.setAttribute(jsObj, "dragLockToAxis", value);
	}

	public void setDragMaxTouches(int value) {
		JsoHelper.setAttribute(jsObj, "dragMaxTouches", value);
	}

	public void setDragMinDistance(boolean value) {
		JsoHelper.setAttribute(jsObj, "dragMinDistance", value);
	}

	public void setGesture(boolean value) {
		JsoHelper.setAttribute(jsObj, "gesture", value);
	}

	public void setHold(boolean value) {
		JsoHelper.setAttribute(jsObj, "hold", value);
	}

	public void setHoldTreshold(int value) {
		JsoHelper.setAttribute(jsObj, "holdTeshold", value);
	}

	public void setHoldTimeOut(int value) {
		JsoHelper.setAttribute(jsObj, "holdTimeout", value);
	}

	public void setPreventDefault(boolean value) {
		JsoHelper.setAttribute(jsObj, "preventDefault", value);
	}

	public void setPreventMouse(boolean value) {
		JsoHelper.setAttribute(jsObj, "preventMouse", value);
	}

	public void setRelease(boolean value) {
		JsoHelper.setAttribute(jsObj, "release", value);
	}

	public void setShowTouches(boolean value) {
		JsoHelper.setAttribute(jsObj, "showTouches", value);
	}

	public void setSwipe(boolean value) {
		JsoHelper.setAttribute(jsObj, "swipe", value);
	}

	public void setSwipeMaxTouches(boolean value) {
		JsoHelper.setAttribute(jsObj, "swipeMaxTouches", value);
	}

	public void setSwipeMinTouches(boolean value) {
		JsoHelper.setAttribute(jsObj, "swipeMinTouches", value);
	}

	public void setSwipeVelocityX(boolean value) {
		JsoHelper.setAttribute(jsObj, "swipeVelocityX", value);
	}

	public void setSwipeVelocityY(boolean value) {
		JsoHelper.setAttribute(jsObj, "swipeVelocityY", value);
	}

	public void setTap(boolean value) {
		JsoHelper.setAttribute(jsObj, "tap", value);
	}

	public void setTapAlways(boolean value) {
		JsoHelper.setAttribute(jsObj, "tapAlways", value);
	}

	public void setTapMaxDistance(double value) {
		JsoHelper.setAttribute(jsObj, "tapMaxDistance", value);
	}

	public void setTapMaxTime(double value) {
		JsoHelper.setAttribute(jsObj, "tapMaxTime", value);
	}

	public void setTouch(boolean value) {
		JsoHelper.setAttribute(jsObj, "touch", value);
	}

	public void setTransform(boolean value) {
		JsoHelper.setAttribute(jsObj, "transform", value);
	}

	public void setTransformMinRotation(double value) {
		JsoHelper.setAttribute(jsObj, "transformMinRotation", value);
	}

	public void setTransformMinScale(double value) {
		JsoHelper.setAttribute(jsObj, "transformMinScale", value);
	}

}
