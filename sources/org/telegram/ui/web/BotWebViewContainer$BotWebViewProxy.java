package org.telegram.ui.web;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public hv0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                fa4.b("webviewproxy.postEvent: no container");
            } else {
                gl.c3(new nn6(this, str, str2, (byte) 29));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
