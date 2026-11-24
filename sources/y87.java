// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class y87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ b54 c;

    public /* synthetic */ y87(oc7 oc7Var, b54 b54Var, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = b54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b54 b54Var = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                vh6 vh6Var = b54Var.c;
                int m = vh6Var.m();
                for (int i = 0; i < m; i++) {
                    oc7Var.getNotificationCenter().k(50, Long.valueOf(vh6Var.j(i)), vh6Var.n(i), Boolean.FALSE);
                }
                break;
            case 1:
                vh6 vh6Var2 = b54Var.c;
                int m2 = vh6Var2.m();
                for (int i2 = 0; i2 < m2; i2++) {
                    oc7Var.getNotificationCenter().k(50, Long.valueOf(vh6Var2.j(i2)), vh6Var2.n(i2), Boolean.FALSE);
                }
                break;
            default:
                vh6 vh6Var3 = b54Var.c;
                if (!vh6Var3.i()) {
                    int m3 = vh6Var3.m();
                    for (int i3 = 0; i3 < m3; i3++) {
                        oc7Var.getNotificationCenter().k(1, Long.valueOf(vh6Var3.j(i3)), vh6Var3.n(i3), Boolean.FALSE, 0);
                    }
                    break;
                }
                break;
        }
    }
}
