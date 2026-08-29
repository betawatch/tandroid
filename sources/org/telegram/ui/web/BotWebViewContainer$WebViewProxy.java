package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        AndroidUtilities.runOnUIThread(new yw0(this, str, str2, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new a0(this, str, bArr, str2, str3, 3));
    }
}
