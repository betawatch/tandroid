package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.v41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.messenger.i0.g3(new v41(this, str, str2, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.i0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
