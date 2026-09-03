package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n71;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public a1 a;
    public final x0 b;

    public BotWebViewContainer$WebViewProxy(x0 x0Var, a1 a1Var) {
        this.b = x0Var;
        this.a = a1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new n71(this, str, str2, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new z(this, str, bArr, str2, str3, 3));
    }
}
