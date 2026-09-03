package org.telegram.ui.web;

import android.webkit.WebView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class w0 implements WebView.FindListener {
    public final /* synthetic */ y0 a;

    public w0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public final void onFindResultReceived(int i10, int i11, boolean z4) {
        y0 y0Var = this.a;
        y0Var.D = i10;
        y0Var.E = i11;
        y0Var.getClass();
        Runnable runnable = y0Var.F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
