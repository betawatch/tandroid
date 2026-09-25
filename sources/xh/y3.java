package xh;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ y3(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v3 v3Var = this.b.c;
                if (!v3Var.j.isEmpty()) {
                    v3Var.j.clear();
                    v3Var.h();
                    break;
                }
                break;
            case 1:
                v3 v3Var2 = this.b.c;
                if (!v3Var2.k.isEmpty()) {
                    v3Var2.k.clear();
                    v3Var2.h();
                    break;
                }
                break;
            case 2:
                v3 v3Var3 = this.b.c;
                if (!v3Var3.l.isEmpty()) {
                    v3Var3.l.clear();
                    v3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(u3.b);
                break;
            case 4:
                this.b.c.i(u3.c);
                break;
            default:
                this.b.c.i(u3.d);
                break;
        }
    }
}
