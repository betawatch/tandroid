package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v0 implements WebView.FindListener {
    public final /* synthetic */ x0 a;

    public v0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        x0 x0Var = this.a;
        x0Var.G = i10;
        x0Var.H = i11;
        x0Var.getClass();
        Runnable runnable = x0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
