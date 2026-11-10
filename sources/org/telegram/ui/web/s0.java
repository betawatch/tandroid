package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
