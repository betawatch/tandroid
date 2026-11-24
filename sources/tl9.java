// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et8 b;

    public /* synthetic */ tl9(et8 et8Var, byte b) {
        this.a = b;
        this.b = et8Var;
    }

    public final void a(Exception exc) {
        byte b = this.a;
        et8 et8Var = this.b;
        switch (b) {
            case 0:
                ((un9) et8Var.b).i.post(new kn9(et8Var, exc, (byte) 1));
                break;
            default:
                ((un9) et8Var.b).i.post(new kn9(et8Var, exc, (byte) 0));
                break;
        }
    }
}
