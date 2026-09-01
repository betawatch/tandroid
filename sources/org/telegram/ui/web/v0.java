package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
