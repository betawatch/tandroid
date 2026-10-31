package ph;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ k3(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b.c;
                if (!h3Var.j.isEmpty()) {
                    h3Var.j.clear();
                    h3Var.h();
                    break;
                }
                break;
            case 1:
                h3 h3Var2 = this.b.c;
                if (!h3Var2.k.isEmpty()) {
                    h3Var2.k.clear();
                    h3Var2.h();
                    break;
                }
                break;
            case 2:
                h3 h3Var3 = this.b.c;
                if (!h3Var3.l.isEmpty()) {
                    h3Var3.l.clear();
                    h3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(g3.a);
                break;
            case 4:
                this.b.c.i(g3.b);
                break;
            default:
                this.b.c.i(g3.c);
                break;
        }
    }
}
