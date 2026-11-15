package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ o0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = true;
                break;
            case 1:
                this.b.y();
                break;
            default:
                v0 v0Var = this.b;
                if (!v0Var.i0) {
                    c0 c0Var = v0Var.J;
                    c0Var.getClass();
                    c0Var.f0(v0Var);
                    break;
                }
                break;
        }
    }
}
