package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rf0 extends org.telegram.ui.Components.dg {
    public final /* synthetic */ org.telegram.ui.Components.dg n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ bg0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.dg dgVar, boolean z9) {
        super(i7, context, f6Var, false);
        this.p0 = bg0Var;
        this.n0 = dgVar;
        this.o0 = z9;
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean b() {
        return this.n0.b();
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean c() {
        return this.n0.c();
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean d() {
        return (this.o0 && this.p0.p0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.dg
    public final int getFillColor() {
        return this.n0.getFillColor();
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean j() {
        return this.n0.j();
    }
}
