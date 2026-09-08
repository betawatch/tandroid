package yh;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ o(v vVar, int i10) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onBackPressed();
                break;
            default:
                this.b.T();
                break;
        }
    }
}
