package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
