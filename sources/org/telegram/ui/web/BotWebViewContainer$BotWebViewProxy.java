package org.telegram.ui.web;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public qw0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                fc4.b("webviewproxy.postEvent: no container");
            } else {
                gm.c3(new tv0(this, str, str2, (byte) 0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
