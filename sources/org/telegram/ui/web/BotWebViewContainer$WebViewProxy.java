package org.telegram.ui.web;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class BotWebViewContainer$WebViewProxy {
    public hv0 a;
    public final cv0 b;

    public BotWebViewContainer$WebViewProxy(cv0 cv0Var, hv0 hv0Var) {
        this.b = cv0Var;
        this.a = hv0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        gl.c3(new fv0((Object) this, (Object) str, (Object) str2, (byte) 0));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        gl.c3(new b87((Object) this, (Object) str, (Object) bArr, (Object) str2, (Object) str3, (byte) 10));
    }
}
