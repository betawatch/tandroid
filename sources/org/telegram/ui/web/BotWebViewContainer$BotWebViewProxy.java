package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public x0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.h3(new r31(this, str, str2, 6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
