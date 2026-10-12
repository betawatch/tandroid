package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z61 extends sg.c1 {
    public final /* synthetic */ a71 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(a71 a71Var, Context context) {
        super(context, 2, null);
        this.M = a71Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a71 a71Var = this.M;
        if (a71Var.getParent() instanceof View) {
            ((View) a71Var.getParent()).invalidate();
        }
    }
}
