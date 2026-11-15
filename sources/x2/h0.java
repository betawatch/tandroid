package x2;

import a8.xa;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa b;
    public final /* synthetic */ t c;
    public final /* synthetic */ b0 d;

    public /* synthetic */ h0(xa xaVar, t tVar, b0 b0Var, int i7) {
        this.a = i7;
        this.b = xaVar;
        this.c = tVar;
        this.d = b0Var;
    }

    @Override // h2.j
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.a) {
            case 0:
                xa xaVar = this.b;
                j0Var.G(xaVar.b, (f0) xaVar.c, this.c, this.d);
                break;
            default:
                xa xaVar2 = this.b;
                j0Var.A(xaVar2.b, (f0) xaVar2.c, this.c, this.d);
                break;
        }
    }
}
