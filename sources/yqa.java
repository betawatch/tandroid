// default package

import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yqa implements ry4, sy4 {
    public final /* synthetic */ gra a;

    @Override // sy4
    public final int h() {
        return this.a.Z0();
    }

    @Override // ry4
    public final void k(int i) {
        gra graVar = this.a;
        tq3 tq3Var = graVar.m2;
        if (Build.VERSION.SDK_INT < 31 || tq3Var == null) {
            return;
        }
        if (vsd.a(i, 4)) {
            tq3Var.h(graVar.X0.e());
        }
        tq3Var.e(graVar.r2, graVar.b.getWidth(), graVar.b.getHeight());
    }
}
