package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class v0 implements WebView.FindListener {
    public final /* synthetic */ x0 a;

    public v0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z4) {
        x0 x0Var = this.a;
        x0Var.D = i10;
        x0Var.E = i11;
        x0Var.getClass();
        Runnable runnable = x0Var.F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
