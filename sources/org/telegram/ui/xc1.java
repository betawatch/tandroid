package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
