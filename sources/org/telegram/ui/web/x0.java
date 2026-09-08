package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class x0 implements WebView.FindListener {
    public final /* synthetic */ z0 a;

    public x0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        z0 z0Var = this.a;
        z0Var.G = i10;
        z0Var.H = i11;
        z0Var.getClass();
        Runnable runnable = z0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
