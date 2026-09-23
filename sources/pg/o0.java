package pg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ o0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                r0Var.c = null;
                k2.u uVar = r0Var.a;
                if (uVar != null) {
                    uVar.W();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
