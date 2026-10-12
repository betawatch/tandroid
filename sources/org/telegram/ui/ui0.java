package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ui0 extends org.telegram.ui.Components.wg {
    public final /* synthetic */ org.telegram.ui.Components.wg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ hj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(hj0 hj0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.wg wgVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.n0 = hj0Var;
        this.l0 = wgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.wg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean j() {
        return this.l0.j();
    }
}
