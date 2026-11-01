package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class te1 {
    public final /* synthetic */ ue1 a;

    public te1(ue1 ue1Var) {
        this.a = ue1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.m2(22, this, str));
    }
}
