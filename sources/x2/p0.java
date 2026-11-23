package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ p0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = true;
                break;
            case 1:
                this.b.y();
                break;
            default:
                w0 w0Var = this.b;
                if (!w0Var.i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.i2(w0Var);
                    break;
                }
                break;
        }
    }
}
