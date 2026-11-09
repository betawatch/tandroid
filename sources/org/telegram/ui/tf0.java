package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tf0 extends org.telegram.ui.Components.dg {
    public final /* synthetic */ org.telegram.ui.Components.dg n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ dg0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(dg0 dg0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.dg dgVar, boolean z9) {
        super(i7, context, g6Var, false);
        this.p0 = dg0Var;
        this.n0 = dgVar;
        this.o0 = z9;
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean b() {
        return this.n0.b();
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean c() {
        return this.n0.c();
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean d() {
        return (this.o0 && this.p0.p0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.dg
    public final int getFillColor() {
        return this.n0.getFillColor();
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean j() {
        return this.n0.j();
    }
}
