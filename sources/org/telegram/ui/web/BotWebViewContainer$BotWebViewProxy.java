package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.lv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public v0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.h3(new lv0(this, str, str2, 8));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
