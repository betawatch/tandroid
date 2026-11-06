package zh;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ g3(k3 k3Var, int i7) {
        this.a = i7;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b.c;
                if (!d3Var.j.isEmpty()) {
                    d3Var.j.clear();
                    d3Var.h();
                    break;
                }
                break;
            case 1:
                d3 d3Var2 = this.b.c;
                if (!d3Var2.k.isEmpty()) {
                    d3Var2.k.clear();
                    d3Var2.h();
                    break;
                }
                break;
            case 2:
                d3 d3Var3 = this.b.c;
                if (!d3Var3.l.isEmpty()) {
                    d3Var3.l.clear();
                    d3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(c3.a);
                break;
            case 4:
                this.b.c.i(c3.b);
                break;
            default:
                this.b.c.i(c3.c);
                break;
        }
    }
}
