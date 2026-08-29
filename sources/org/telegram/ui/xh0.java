package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xh0 extends org.telegram.ui.Components.og {
    public final /* synthetic */ org.telegram.ui.Components.og h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ ki0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(ki0 ki0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.og ogVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.j0 = ki0Var;
        this.h0 = ogVar;
        this.i0 = z10;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d() {
        return this.h0.d();
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e() {
        return this.h0.e();
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f() {
        return (this.i0 && this.j0.m0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final int getFillColor() {
        return this.h0.getFillColor();
    }

    @Override // org.telegram.ui.Components.og
    public final boolean j() {
        return this.h0.j();
    }
}
