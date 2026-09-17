package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
