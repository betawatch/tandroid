// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sk3 b;

    public /* synthetic */ vg6(sk3 sk3Var, byte b) {
        this.a = b;
        this.b = sk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sk3 sk3Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new vg6(sk3Var, (byte) 1));
                break;
            default:
                sk3Var.a("CANCELLED");
                break;
        }
    }
}
