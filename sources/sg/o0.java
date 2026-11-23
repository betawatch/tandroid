package sg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ o0(p0 p0Var, int i7) {
        this.a = i7;
        this.b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b.b.d;
                if (r0Var != null) {
                    r0Var.postRunnable(r0Var.x);
                    break;
                }
                break;
            case 1:
                r0 r0Var2 = this.b.b.d;
                if (r0Var2 != null) {
                    r0Var2.postRunnable(r0Var2.x);
                    break;
                }
                break;
            default:
                t0 t0Var = this.b.b;
                r0 r0Var3 = t0Var.d;
                r0Var3.getClass();
                r0Var3.postRunnable(new q0(r0Var3, 2));
                t0Var.d = null;
                break;
        }
    }
}
