package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w0 implements WebView.FindListener {
    public final /* synthetic */ y0 a;

    public w0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        y0 y0Var = this.a;
        y0Var.G = i10;
        y0Var.H = i11;
        y0Var.getClass();
        Runnable runnable = y0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
