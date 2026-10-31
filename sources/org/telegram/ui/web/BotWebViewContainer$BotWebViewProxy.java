package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public z0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                f8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.i0.g3(new u41(this, str, str2, 6));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
