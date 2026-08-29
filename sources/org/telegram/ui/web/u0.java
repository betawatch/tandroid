package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u0 implements WebView.FindListener {
    public final /* synthetic */ w0 a;

    public u0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        w0 w0Var = this.a;
        w0Var.C = i10;
        w0Var.D = i11;
        w0Var.getClass();
        Runnable runnable = w0Var.E;
        if (runnable != null) {
            runnable.run();
        }
    }
}
