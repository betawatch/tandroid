package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public a1 a;
    public final w0 b;

    public BotWebViewContainer$WebViewProxy(w0 w0Var, a1 a1Var) {
        this.b = w0Var;
        this.a = a1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new m71(this, str, str2, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new z(this, str, bArr, str2, str3, 3));
    }
}
