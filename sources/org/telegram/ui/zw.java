package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zw extends org.telegram.ui.Components.ot {
    public final /* synthetic */ xy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(uy uyVar, xy xyVar) {
        super(uyVar);
        this.E = xyVar;
    }

    @Override // s4.e1
    public final void y() {
        xy xyVar = this.E;
        if (xyVar.c.L0() == 0) {
            View m10 = xyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (xyVar.v == 2) {
                xyVar.v = 1;
            }
            ex exVar = xyVar.n;
            if (exVar != null) {
                exVar.b();
            }
        }
    }
}
