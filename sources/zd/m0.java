package zd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                    f1Var.resumeWith(b7.h.a(((v) obj).a));
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
