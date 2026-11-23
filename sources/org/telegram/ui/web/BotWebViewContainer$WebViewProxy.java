package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.es0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public v0 a;
    public final s0 b;

    public BotWebViewContainer$WebViewProxy(s0 s0Var, v0 v0Var) {
        this.b = s0Var;
        this.a = v0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new es0((Object) this, (Object) str, (Object) str2, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
