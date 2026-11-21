package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
