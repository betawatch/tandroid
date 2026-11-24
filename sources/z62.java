// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v72 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z62(v72 v72Var, int i, byte b) {
        this.a = b;
        this.b = v72Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.h0(i, null);
                break;
            case 1:
                v72Var.d0(i);
                break;
            default:
                v72Var.h0(i, null);
                break;
        }
    }
}
