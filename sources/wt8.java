// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yt8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wt8(yt8 yt8Var, int i, byte b) {
        this.a = b;
        this.b = yt8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        yt8 yt8Var = this.b;
        switch (b) {
            case 0:
                yt8Var.b.e(i, yt8Var.d.i(i));
                break;
            default:
                yt8Var.b.e(i, yt8Var.d.i(i));
                break;
        }
    }
}
