package zh;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ p5(r5 r5Var, long j3, int i10) {
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
