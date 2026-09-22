package xh;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ x2(i4 i4Var, int i10) {
        this.a = i10;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v3 v3Var = this.b.d;
                if (!v3Var.l.isEmpty()) {
                    v3Var.l.clear();
                    v3Var.h();
                    break;
                }
                break;
            case 1:
                v3 v3Var2 = this.b.d;
                if (!v3Var2.k.isEmpty()) {
                    v3Var2.k.clear();
                    v3Var2.h();
                    break;
                }
                break;
            case 2:
                v3 v3Var3 = this.b.d;
                if (!v3Var3.j.isEmpty()) {
                    v3Var3.j.clear();
                    v3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(u3.b);
                break;
            case 4:
                this.b.d.i(u3.c);
                break;
            default:
                this.b.d.i(u3.d);
                break;
        }
    }
}
