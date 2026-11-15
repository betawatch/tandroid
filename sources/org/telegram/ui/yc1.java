package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
