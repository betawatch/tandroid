package ug;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ f0(h0 h0Var, int i10) {
        this.a = i10;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0.e0(this.b);
                break;
            default:
                h0.d0(this.b);
                break;
        }
    }
}
