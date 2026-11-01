package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
