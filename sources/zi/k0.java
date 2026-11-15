package zi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7.i b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ k0(u7.i iVar, Exception exc, int i7) {
        this.a = i7;
        this.b = iVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b.a;
                v0Var.m.a("recording segment interrupted in state=".concat(p0.b(v0Var.a0)), this.c);
                int i7 = v0Var.a0;
                if (i7 != 3) {
                    if (i7 == 2) {
                        v0Var.D = true;
                        break;
                    }
                } else {
                    v0Var.q();
                    break;
                }
                break;
            default:
                ((v0) this.b.a).h(this.c);
                break;
        }
    }
}
