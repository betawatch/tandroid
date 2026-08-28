package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yh0 extends org.telegram.ui.Components.lg {
    public final /* synthetic */ org.telegram.ui.Components.lg h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ li0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(li0 li0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.lg lgVar, boolean z10) {
        super(i9, context, b6Var, false);
        this.j0 = li0Var;
        this.h0 = lgVar;
        this.i0 = z10;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean d() {
        return this.h0.d();
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        return this.h0.e();
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        return (this.i0 && this.j0.m0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.lg
    public final int getFillColor() {
        return this.h0.getFillColor();
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean j() {
        return this.h0.j();
    }
}
