package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t0 implements WebView.FindListener {
    public final /* synthetic */ v0 a;

    public t0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i9, int i10, boolean z10) {
        v0 v0Var = this.a;
        v0Var.C = i9;
        v0Var.D = i10;
        v0Var.getClass();
        Runnable runnable = v0Var.E;
        if (runnable != null) {
            runnable.run();
        }
    }
}
