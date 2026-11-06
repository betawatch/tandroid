package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class s0 implements WebView.FindListener {
    public final /* synthetic */ u0 a;

    public s0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i7, int i10, boolean z9) {
        u0 u0Var = this.a;
        u0Var.G = i7;
        u0Var.H = i10;
        u0Var.getClass();
        Runnable runnable = u0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
