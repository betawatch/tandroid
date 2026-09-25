package pg;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ p0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                s0Var.c = null;
                n2.e eVar = s0Var.a;
                if (eVar != null) {
                    eVar.t();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
