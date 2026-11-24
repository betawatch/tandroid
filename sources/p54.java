// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p54 implements x56, js4, us2, nq4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ p54(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override // nq4
    public final m21 a(u21 u21Var) {
        return u21Var.k(this.b);
    }

    @Override // us2
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 3:
                ad8Var.V(z);
                break;
            case 4:
                ad8Var.o0(z);
                break;
            default:
                ad8Var.v(z);
                break;
        }
    }

    @Override // x56
    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 0:
                mc8Var.v(z);
                break;
            default:
                mc8Var.h(z);
                break;
        }
    }

    @Override // js4
    public final Object m(Object obj) {
        Bundle l = ir2.l("afterSignup", this.b);
        ah6 ah6Var = new ah6();
        ah6Var.q0(l);
        return ah6Var;
    }
}
