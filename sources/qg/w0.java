package qg;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ w0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b.a;
                if (b1Var != null) {
                    b1Var.b();
                    break;
                }
                break;
            case 1:
                c1 c1Var = this.b;
                c1Var.c.a(c1Var.r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                break;
            default:
                c1 c1Var2 = this.b;
                c1Var2.c.q(c1Var2.x);
                break;
        }
    }
}
