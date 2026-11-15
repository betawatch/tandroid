package sg;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ j0 c;

    public /* synthetic */ t(v vVar, j0 j0Var, int i7) {
        this.a = i7;
        this.b = vVar;
        this.c = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new t(this.b, this.c, 1));
                break;
            default:
                v vVar = this.b;
                vVar.getClass();
                vVar.i = this.c.a;
                break;
        }
    }
}
