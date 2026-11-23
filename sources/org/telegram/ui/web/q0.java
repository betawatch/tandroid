package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q0 implements WebView.FindListener {
    public final /* synthetic */ s0 a;

    public q0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i7, int i10, boolean z10) {
        s0 s0Var = this.a;
        s0Var.H = i7;
        s0Var.I = i10;
        s0Var.getClass();
        Runnable runnable = s0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
