package org.telegram.ui.web;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class BotWebViewContainer$WebViewProxy {
    public rv0 a;
    public final nv0 b;

    public BotWebViewContainer$WebViewProxy(nv0 nv0Var, rv0 rv0Var) {
        this.b = nv0Var;
        this.a = rv0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        hl.c3(new tu0(this, str, str2, (byte) 1));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        hl.c3(new la7((Object) this, (Object) str, (Object) bArr, (Object) str2, (Object) str3, (byte) 10));
    }
}
