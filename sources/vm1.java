// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vm1(yv1 yv1Var, int i, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 1:
                this.b.J(this.c, 0, 0, 0, false, true);
                break;
            case 2:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 3:
                yv1Var.G9(i);
                break;
            case 4:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 5:
                yv1Var.C8(i);
                break;
            case 6:
                yv1Var.B8(i);
                break;
            case 7:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 8:
                yv1Var.a9(i);
                break;
            default:
                yv1Var.b9(i);
                break;
        }
    }
}
