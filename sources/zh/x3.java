package zh;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
