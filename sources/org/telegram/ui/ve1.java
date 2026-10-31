package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ve1 {
    public final /* synthetic */ we1 a;

    public ve1(we1 we1Var) {
        this.a = we1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k3(21, this, str));
    }
}
