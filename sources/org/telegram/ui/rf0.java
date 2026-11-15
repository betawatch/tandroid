package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rf0 extends org.telegram.ui.Components.jg {
    public final /* synthetic */ org.telegram.ui.Components.jg w0;
    public final /* synthetic */ boolean x0;
    public final /* synthetic */ bg0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.jg jgVar, boolean z10) {
        super(i7, context, e6Var, false);
        this.y0 = bg0Var;
        this.w0 = jgVar;
        this.x0 = z10;
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean b() {
        return this.w0.b();
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean c() {
        return this.w0.c();
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean d() {
        return (this.x0 && this.y0.u0 && this.w <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.jg
    public final int getFillColor() {
        return this.w0.getFillColor();
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean j() {
        return this.w0.j();
    }
}
