package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class t0 implements WebView.FindListener {
    public final /* synthetic */ v0 a;

    public t0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        v0 v0Var = this.a;
        v0Var.G = i10;
        v0Var.H = i11;
        v0Var.getClass();
        Runnable runnable = v0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
