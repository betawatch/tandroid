package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$WebViewProxy {
    public d1 a;
    public final z0 b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, d1 d1Var) {
        this.b = z0Var;
        this.a = d1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new er0(this, str, str2, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new c0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
