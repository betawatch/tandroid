package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ti0 extends org.telegram.ui.Components.wg {
    public final /* synthetic */ org.telegram.ui.Components.wg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ gj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(gj0 gj0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.wg wgVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.n0 = gj0Var;
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
