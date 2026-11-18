package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vf0 extends org.telegram.ui.Components.sg {
    public final /* synthetic */ fg0 A0;
    public final /* synthetic */ org.telegram.ui.Components.sg y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(fg0 fg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.sg sgVar, boolean z10) {
        super(i7, context, i6Var, false);
        this.A0 = fg0Var;
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
