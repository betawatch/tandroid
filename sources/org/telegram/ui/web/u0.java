package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class u0 implements WebView.FindListener {
    public final /* synthetic */ w0 a;

    public u0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z4) {
        w0 w0Var = this.a;
        w0Var.D = i10;
        w0Var.E = i11;
        w0Var.getClass();
        Runnable runnable = w0Var.F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
