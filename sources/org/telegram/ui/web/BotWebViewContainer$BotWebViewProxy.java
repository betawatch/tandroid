package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class BotWebViewContainer$BotWebViewProxy {
    public v0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.g3(new sv0((Object) this, (Object) str, (Object) str2, 11));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
