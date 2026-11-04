package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class r0 implements WebView.FindListener {
    public final /* synthetic */ t0 a;

    public r0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i3, int i10, boolean z10) {
        t0 t0Var = this.a;
        t0Var.H = i3;
        t0Var.I = i10;
        t0Var.getClass();
        Runnable runnable = t0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
