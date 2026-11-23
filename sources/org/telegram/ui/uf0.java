package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class uf0 extends org.telegram.ui.Components.ug {
    public final /* synthetic */ eg0 A0;
    public final /* synthetic */ org.telegram.ui.Components.ug y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i7, context, h6Var, false);
        this.A0 = eg0Var;
        this.y0 = ugVar;
        this.z0 = z10;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean b() {
        return this.y0.b();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean c() {
        return this.y0.c();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean d() {
        return (this.z0 && this.A0.u0 && this.w <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ug
    public final int getFillColor() {
        return this.y0.getFillColor();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean j() {
        return this.y0.j();
    }
}
