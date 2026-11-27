// default package

import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1a implements sy4, ry4 {
    public final /* synthetic */ r1a a;

    public /* synthetic */ q1a(r1a r1aVar) {
        this.a = r1aVar;
    }

    @Override // sy4
    public final int h() {
        return aob.v0(aob.d6, this.a.J0);
    }

    @Override // ry4
    public final void k(int i) {
        r1a r1aVar = this.a;
        tq3 tq3Var = r1aVar.g2;
        if (Build.VERSION.SDK_INT < 31 || tq3Var == null) {
            return;
        }
        if (vsd.a(i, 4)) {
            tq3Var.h(r1aVar.X0.e());
        }
        tq3Var.e(r1aVar.i2, r1aVar.b.getWidth(), r1aVar.b.getHeight());
    }
}
