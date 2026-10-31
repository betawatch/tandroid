package rh;

import android.os.Build;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements ei.n, ei.o {
    public final /* synthetic */ t0 a;

    @Override // ei.o
    public int c() {
        return this.a.d1();
    }

    @Override // ei.n
    public void j(int i10) {
        t0 t0Var = this.a;
        tg.f fVar = t0Var.j2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            fVar.h(t0Var.X0.e());
        }
        fVar.e(t0Var.o2, t0Var.b.getWidth(), t0Var.b.getHeight());
    }
}
