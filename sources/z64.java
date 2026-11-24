// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class z64 implements x76, ku4, fu2, os4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ z64(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override // os4
    public final u31 a(c41 c41Var) {
        return c41Var.k(this.b);
    }

    @Override // fu2
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        cf8 cf8Var = (cf8) obj;
        switch (b) {
            case 3:
                cf8Var.V(z);
                break;
            case 4:
                cf8Var.o0(z);
                break;
            default:
                cf8Var.v(z);
                break;
        }
    }

    @Override // x76
    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        pe8 pe8Var = (pe8) obj;
        switch (b) {
            case 0:
                pe8Var.v(z);
                break;
            default:
                pe8Var.f(z);
                break;
        }
    }

    @Override // ku4
    public final Object l(Object obj) {
        Bundle l = ts2.l("afterSignup", this.b);
        bj6 bj6Var = new bj6();
        bj6Var.n0(l);
        return bj6Var;
    }
}
