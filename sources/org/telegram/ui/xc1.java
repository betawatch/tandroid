package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
