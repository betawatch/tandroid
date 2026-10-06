package xh;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
