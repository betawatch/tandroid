// default package

import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zt extends b0f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ zt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // b0f
    public final void a(boolean z) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (z) {
                    oVar.i0.h(false);
                    break;
                }
                break;
            default:
                nx0 nx0Var = oVar.J;
                if (nx0Var != null) {
                    nx0Var.E0 = z;
                    break;
                }
                break;
        }
    }

    @Override // b0f
    public final void b() {
        switch (this.a) {
            case 0:
                if (hl.C3()) {
                    new d31(this.b.h0, null).i(ob6.M0(2131743847, null)).j();
                    break;
                }
                break;
        }
    }
}
