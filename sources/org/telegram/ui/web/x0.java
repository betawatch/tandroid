package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
