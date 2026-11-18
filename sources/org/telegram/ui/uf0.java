package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uf0 extends org.telegram.ui.Components.sg {
    public final /* synthetic */ eg0 A0;
    public final /* synthetic */ org.telegram.ui.Components.sg y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.sg sgVar, boolean z10) {
        super(i7, context, i6Var, false);
        this.A0 = eg0Var;
        this.y0 = sgVar;
        this.z0 = z10;
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean b() {
        return this.y0.b();
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean c() {
        return this.y0.c();
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean d() {
        return (this.z0 && this.A0.u0 && this.w <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.sg
    public final int getFillColor() {
        return this.y0.getFillColor();
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean j() {
        return this.y0.j();
    }
}
