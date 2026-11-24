// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ qf9(ch9 ch9Var, int i, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                ch9Var.d4(i);
                break;
            case 1:
                ch9Var.f4(i);
                break;
            case 2:
                ch9Var.scrollBy(0, i);
                break;
            default:
                ch9Var.e4(i);
                break;
        }
    }
}
