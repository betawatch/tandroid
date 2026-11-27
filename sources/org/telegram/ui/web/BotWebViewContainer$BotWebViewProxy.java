package org.telegram.ui.web;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public rv0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                cc4.b("webviewproxy.postEvent: no container");
            } else {
                hl.c3(new tu0(this, str, str2, (byte) 0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
