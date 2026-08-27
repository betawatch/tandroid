package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
