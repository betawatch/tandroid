package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gs0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public z0 a;
    public final w0 b;

    public BotWebViewContainer$WebViewProxy(w0 w0Var, z0 z0Var) {
        this.b = w0Var;
        this.a = z0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new gs0(this, str, str2, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new z(this, str, bArr, str2, str3, 3));
    }
}
