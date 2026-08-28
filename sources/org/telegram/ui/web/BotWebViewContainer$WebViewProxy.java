package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ue0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public y0 a;
    public final v0 b;

    public BotWebViewContainer$WebViewProxy(v0 v0Var, y0 y0Var) {
        this.b = v0Var;
        this.a = y0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new ue0(this, str, str2, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new y(this, str, bArr, str2, str3, 3));
    }
}
