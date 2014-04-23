package com.ait.toolkit.hammer.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Hammer gesture behavior
 */
public class HammerGestureBehavior extends JsObject {

	protected HammerGestureBehavior() {
		jsObj = JsoHelper.createObject();
	}

	public void setContentZooming(String value) {
		JsoHelper.setAttribute(jsObj, "contentZooming", value);
	}

	public void setTapHighlightColor(String value) {
		JsoHelper.setAttribute(jsObj, "tapHighlightColor", value);
	}

	public void setTouchAction(String value) {
		JsoHelper.setAttribute(jsObj, "touchAction", value);
	}

	public void setTouchCallout(String value) {
		JsoHelper.setAttribute(jsObj, "touchCallout", value);
	}

	public void setUserDrag(String value) {
		JsoHelper.setAttribute(jsObj, "userDrag", value);
	}

	public void setUserSelect(String value) {
		JsoHelper.setAttribute(jsObj, "userSelect", value);
	}
}
