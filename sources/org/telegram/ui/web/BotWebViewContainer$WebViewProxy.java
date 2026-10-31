package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public z0 a;
    public final v0 b;

    public BotWebViewContainer$WebViewProxy(v0 v0Var, z0 z0Var) {
        this.b = v0Var;
        this.a = z0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        org.telegram.messenger.i0.g3(new u41(this, str, str2, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.i0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
