package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uf0 extends org.telegram.ui.Components.cg {
    public final /* synthetic */ org.telegram.ui.Components.cg n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ eg0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.cg cgVar, boolean z9) {
        super(i7, context, h6Var, false);
        this.p0 = eg0Var;
        this.n0 = cgVar;
        this.o0 = z9;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean b() {
        return this.n0.b();
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean c() {
        return this.n0.c();
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean d() {
        return (this.o0 && this.p0.p0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.cg
    public final int getFillColor() {
        return this.n0.getFillColor();
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean j() {
        return this.n0.j();
    }
}
