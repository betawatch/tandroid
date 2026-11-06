package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public x0 a;
    public final u0 b;

    public BotWebViewContainer$WebViewProxy(u0 u0Var, x0 x0Var) {
        this.b = u0Var;
        this.a = x0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new r31(this, str, str2, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.h3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
