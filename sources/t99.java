// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x99 b;

    public /* synthetic */ t99(x99 x99Var, byte b) {
        this.a = b;
        this.b = x99Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x99 x99Var = this.b;
        switch (b) {
            case 0:
                q99 q99Var = x99Var.c;
                if (!q99Var.j.isEmpty()) {
                    q99Var.j.clear();
                    q99Var.m();
                    break;
                }
                break;
            case 1:
                q99 q99Var2 = x99Var.c;
                if (!q99Var2.k.isEmpty()) {
                    q99Var2.k.clear();
                    q99Var2.m();
                    break;
                }
                break;
            case 2:
                q99 q99Var3 = x99Var.c;
                if (!q99Var3.l.isEmpty()) {
                    q99Var3.l.clear();
                    q99Var3.m();
                    break;
                }
                break;
            case 3:
                x99Var.c.p(p99.a);
                break;
            case 4:
                x99Var.c.p(p99.b);
                break;
            default:
                x99Var.c.p(p99.c);
                break;
        }
    }
}
