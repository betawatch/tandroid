package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public w0 a;
    public final t0 b;

    public BotWebViewContainer$WebViewProxy(t0 t0Var, w0 w0Var) {
        this.b = t0Var;
        this.a = w0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new iv0(this, str, str2, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.h3(new y((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
