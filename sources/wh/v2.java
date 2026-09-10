package wh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ v2(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b.d;
                if (!u3Var.l.isEmpty()) {
                    u3Var.l.clear();
                    u3Var.h();
                    break;
                }
                break;
            case 1:
                u3 u3Var2 = this.b.d;
                if (!u3Var2.k.isEmpty()) {
                    u3Var2.k.clear();
                    u3Var2.h();
                    break;
                }
                break;
            case 2:
                u3 u3Var3 = this.b.d;
                if (!u3Var3.j.isEmpty()) {
                    u3Var3.j.clear();
                    u3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(t3.b);
                break;
            case 4:
                this.b.d.i(t3.c);
                break;
            default:
                this.b.d.i(t3.d);
                break;
        }
    }
}
