package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wb1 implements dc1 {
    public boolean a;
    public final /* synthetic */ sn b;

    public wb1(sn snVar, boolean z10) {
        this.b = snVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.dc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.dc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.dc1
    public final void c1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        qn qnVar = this.b.ea;
        qnVar.k(qnVar.f, qnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
