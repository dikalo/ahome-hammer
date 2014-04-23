package com.ait.toolkit.hammer.client;

import com.ait.toolkit.hammer.client.resources.HammerRessource;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * Hammer class
 */
public class Hammer {

	static {
		if (!isLoaded()) {
			load();
		}
	}

	private Hammer() {

	}

	public static HammerInstance get(Widget widget) {
		return get(widget.getElement());
	}

	public static HammerInstance get(Widget widget, HammerGestureOptions options) {
		return get(widget.getElement(), options);
	}

	public static native HammerInstance get(Element el)/*-{
		var obj = $wnd.Hammer(el);
		return @com.ait.toolkit.hammer.client.HammerInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public static native HammerInstance get(Element el, HammerGestureOptions options)/*-{
		var peer = options.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = $wnd.Hammer(el, peer);
		return @com.ait.toolkit.hammer.client.HammerInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Loads the hammer.js library. You normally never have to do this manually
	 */
	public static void load() {
		if (!isLoaded()) {
			HammerRessource resources = GWT.create(HammerRessource.class);
			ScriptInjector.fromString(resources.js().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
	}

	public static native boolean isLoaded()/*-{
		if (typeof $wnd.Hammer === "undefined" || $wnd.Hammer === null) {
			return false;
		}
		return true;
	}-*/;
}
