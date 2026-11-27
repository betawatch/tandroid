package org.telegram.ui.web;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public rv0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                cc4.b("webviewproxy.postEvent: no container");
            } else {
                hl.c3(new tu0(this, str, str2, (byte) 0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
