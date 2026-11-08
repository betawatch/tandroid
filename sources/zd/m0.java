package zd;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m0 extends e1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ m0(Object obj, int i7) {
        this.e = i7;
        this.f = obj;
    }

    @Override // zd.e1
    public final boolean i() {
        switch (this.e) {
        }
        return false;
    }

    @Override // zd.e1
    public final void j(Throwable th2) {
        switch (this.e) {
            case 0:
                ((l0) this.f).dispose();
                return;
            case 1:
                ((rd.l) this.f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f;
                n1Var.getClass();
                n1.a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f;
                Object obj = n1.a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(af.b.b(((v) obj).a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.e = 2;
        this.f = n1Var;
    }
}
