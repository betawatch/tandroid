package zh;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ f3(k3 k3Var, int i7) {
        this.a = i7;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b.c;
                if (!c3Var.j.isEmpty()) {
                    c3Var.j.clear();
                    c3Var.h();
                    break;
                }
                break;
            case 1:
                c3 c3Var2 = this.b.c;
                if (!c3Var2.k.isEmpty()) {
                    c3Var2.k.clear();
                    c3Var2.h();
                    break;
                }
                break;
            case 2:
                c3 c3Var3 = this.b.c;
                if (!c3Var3.l.isEmpty()) {
                    c3Var3.l.clear();
                    c3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(b3.a);
                break;
            case 4:
                this.b.c.i(b3.b);
                break;
            default:
                this.b.c.i(b3.c);
                break;
        }
    }
}
