package vh;

import android.os.Build;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements ei.o, ei.n {
    public final /* synthetic */ f5 a;

    public /* synthetic */ d5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // ei.o
    public int c() {
        f5 f5Var = this.a;
        f5Var.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, f5Var.I0);
    }

    @Override // ei.n
    public void j(int i10) {
        f5 f5Var = this.a;
        tg.f fVar = f5Var.d2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            fVar.h(f5Var.X0.e());
        }
        fVar.e(f5Var.g2, f5Var.b.getWidth(), f5Var.b.getHeight());
    }
}
