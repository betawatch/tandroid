package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yb1 implements fc1 {
    public boolean a;
    public final /* synthetic */ qn b;

    public yb1(qn qnVar, boolean z10) {
        this.b = qnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.fc1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.fc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.fc1
    public final void m1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        on onVar = this.b.aa;
        onVar.i(onVar.f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
