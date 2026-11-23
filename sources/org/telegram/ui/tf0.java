package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tf0 extends org.telegram.ui.Components.tg {
    public final /* synthetic */ dg0 A0;
    public final /* synthetic */ org.telegram.ui.Components.tg y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(dg0 dg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.tg tgVar, boolean z10) {
        super(i7, context, i6Var, false);
        this.A0 = dg0Var;
        this.y0 = tgVar;
        this.z0 = z10;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean b() {
        return this.y0.b();
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean c() {
        return this.y0.c();
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean d() {
        return (this.z0 && this.A0.u0 && this.w <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.tg
    public final int getFillColor() {
        return this.y0.getFillColor();
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean j() {
        return this.y0.j();
    }
}
