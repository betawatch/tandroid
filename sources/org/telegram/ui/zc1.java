package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zc1 {
    public final /* synthetic */ ad1 a;

    public zc1(ad1 ad1Var) {
        this.a = ad1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.r(22, this, str));
    }
}
