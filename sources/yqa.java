// default package

import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
