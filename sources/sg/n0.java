package sg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ n0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b.a;
                if (s0Var != null) {
                    s0Var.l();
                    break;
                }
                break;
            case 1:
                t0 t0Var = this.b;
                t0Var.c.a(t0Var.r);
                r0 r0Var = t0Var.d;
                r0Var.getClass();
                r0Var.postRunnable(new q0(r0Var, 2));
                t0Var.d = null;
                break;
            default:
                t0 t0Var2 = this.b;
                t0Var2.c.q(t0Var2.y);
                break;
        }
    }
}
