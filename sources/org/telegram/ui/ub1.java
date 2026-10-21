package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ub1 implements bc1 {
    public boolean a;
    public final /* synthetic */ qn b;

    public ub1(qn qnVar, boolean z10) {
        this.b = qnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.bc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.bc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.bc1
    public final void c1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        on onVar = this.b.ea;
        onVar.k(onVar.f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
