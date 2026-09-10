package wh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ x3(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b.c;
                if (!u3Var.j.isEmpty()) {
                    u3Var.j.clear();
                    u3Var.h();
                    break;
                }
                break;
            case 1:
                u3 u3Var2 = this.b.c;
                if (!u3Var2.k.isEmpty()) {
                    u3Var2.k.clear();
                    u3Var2.h();
                    break;
                }
                break;
            case 2:
                u3 u3Var3 = this.b.c;
                if (!u3Var3.l.isEmpty()) {
                    u3Var3.l.clear();
                    u3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(t3.b);
                break;
            case 4:
                this.b.c.i(t3.c);
                break;
            default:
                this.b.c.i(t3.d);
                break;
        }
    }
}
