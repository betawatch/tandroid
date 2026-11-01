package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.v41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public z0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                f8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.i0.g3(new v41(this, str, str2, 6));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
