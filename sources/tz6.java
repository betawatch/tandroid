// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tz6 implements fu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kq b;
    public final /* synthetic */ ea6 c;
    public final /* synthetic */ ft6 d;

    public /* synthetic */ tz6(kq kqVar, ea6 ea6Var, ft6 ft6Var, byte b) {
        this.a = b;
        this.b = kqVar;
        this.c = ea6Var;
        this.d = ft6Var;
    }

    @Override // fu2
    public final void accept(Object obj) {
        byte b = this.a;
        ft6 ft6Var = this.d;
        ea6 ea6Var = this.c;
        kq kqVar = this.b;
        vz6 vz6Var = (vz6) obj;
        switch (b) {
            case 0:
                vz6Var.u(kqVar.b, (rz6) kqVar.c, ea6Var, ft6Var);
                break;
            default:
                vz6Var.s(kqVar.b, (rz6) kqVar.c, ea6Var, ft6Var);
                break;
        }
    }
}
