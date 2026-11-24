// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ wf9(ch9 ch9Var, int i, int i2, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U1(this.c, this.d);
                break;
            default:
                this.b.g4(this.c, this.d);
                break;
        }
    }
}
