// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ypa implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ ypa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.X1();
                break;
            case 1:
                goc.M0(wsaVar.a, wsaVar.J0, wsaVar.getContext());
                break;
            default:
                wsaVar.X1();
                break;
        }
    }
}
