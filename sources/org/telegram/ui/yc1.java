package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yc1 {
    public final /* synthetic */ zc1 a;

    public yc1(zc1 zc1Var) {
        this.a = zc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(24, this, str));
    }
}
