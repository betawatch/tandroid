package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ay0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public b1 a;
    public final y0 b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, b1 b1Var) {
        this.b = y0Var;
        this.a = b1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ay0(this, str, str2, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new c0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
