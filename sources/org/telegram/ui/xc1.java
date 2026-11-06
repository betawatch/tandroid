package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xc1 {
    public final /* synthetic */ yc1 a;

    public xc1(yc1 yc1Var) {
        this.a = yc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.n(28, this, str));
    }
}
