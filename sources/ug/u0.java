package ug;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ u0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(true);
                break;
            case 1:
                this.b.b0(true, false);
                break;
            case 2:
                this.b.R();
                break;
            case 3:
                this.b.b0(true, false);
                break;
            case 4:
                this.b.b0(true, false);
                break;
            case 5:
                this.b.b0(true, false);
                break;
            case 6:
                a1 a1Var = this.b;
                a1Var.e0.clear();
                a1Var.f0.clear();
                a1Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
