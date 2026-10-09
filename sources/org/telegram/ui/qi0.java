package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qi0 extends org.telegram.ui.Components.xg {
    public final /* synthetic */ org.telegram.ui.Components.xg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ dj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(dj0 dj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.xg xgVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.n0 = dj0Var;
        this.l0 = xgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.xg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean j() {
        return this.l0.j();
    }
}
