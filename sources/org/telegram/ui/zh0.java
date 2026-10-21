package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zh0 extends org.telegram.ui.Components.vg {
    public final /* synthetic */ org.telegram.ui.Components.vg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ mi0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(mi0 mi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.n0 = mi0Var;
        this.l0 = vgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        return (this.m0 && this.n0.p0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.vg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean j() {
        return this.l0.j();
    }
}
