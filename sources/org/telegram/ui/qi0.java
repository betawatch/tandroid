package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qi0 extends org.telegram.ui.Components.ug {
    public final /* synthetic */ org.telegram.ui.Components.ug l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ dj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(dj0 dj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i10, context, f6Var, false);
        this.n0 = dj0Var;
        this.l0 = ugVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ug
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean j() {
        return this.l0.j();
    }
}
