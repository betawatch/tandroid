package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
