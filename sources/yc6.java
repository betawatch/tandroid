// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd6 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ yc6(dd6 dd6Var, Integer num, byte b) {
        this.a = b;
        this.b = dd6Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Integer num = this.c;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                if (!dd6Var.b.isEmpty()) {
                    gm.c3(new yc6(dd6Var, num, b2));
                    break;
                }
                break;
            default:
                dd6Var.getNotificationCenter().k(77, num);
                break;
        }
    }
}
