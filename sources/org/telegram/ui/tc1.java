package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tc1 {
    public final /* synthetic */ uc1 a;

    public tc1(uc1 uc1Var) {
        this.a = uc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new hc1(3, this, str));
    }
}
