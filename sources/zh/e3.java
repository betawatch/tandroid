package zh;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ e3(j3 j3Var, int i7) {
        this.a = i7;
        this.b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b.c;
                if (!b3Var.j.isEmpty()) {
                    b3Var.j.clear();
                    b3Var.h();
                    break;
                }
                break;
            case 1:
                b3 b3Var2 = this.b.c;
                if (!b3Var2.k.isEmpty()) {
                    b3Var2.k.clear();
                    b3Var2.h();
                    break;
                }
                break;
            case 2:
                b3 b3Var3 = this.b.c;
                if (!b3Var3.l.isEmpty()) {
                    b3Var3.l.clear();
                    b3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(a3.a);
                break;
            case 4:
                this.b.c.i(a3.b);
                break;
            default:
                this.b.c.i(a3.c);
                break;
        }
    }
}
