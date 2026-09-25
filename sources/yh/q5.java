package yh;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ q5(r5 r5Var, long j3, int i10) {
        this.a = i10;
        this.b = r5Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r5 r5Var = this.b;
                r5Var.q.d0(r5Var.b, r5Var.c, this.c, true, true, r5Var.n);
                break;
            default:
                r5 r5Var2 = this.b;
                r5Var2.q.d0(r5Var2.b, r5Var2.c, this.c, true, true, r5Var2.n);
                break;
        }
    }
}
