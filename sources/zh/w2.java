package zh;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ w2(h4 h4Var, int i10) {
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
