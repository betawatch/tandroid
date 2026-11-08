package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yc1 {
    public final /* synthetic */ zc1 a;

    public yc1(zc1 zc1Var) {
        this.a = zc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.n(28, this, str));
    }
}
