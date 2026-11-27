// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class w11 implements qs3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z11 b;
    public final /* synthetic */ pt2 c;

    public /* synthetic */ w11(pt2 pt2Var, z11 z11Var, byte b) {
        this.a = b;
        this.c = pt2Var;
        this.b = z11Var;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        z11 z11Var = this.b;
        pt2 pt2Var = this.c;
        switch (b) {
            case 0:
                ((hw) pt2Var).accept(Float.valueOf(z11Var.getTranslationY()));
                break;
            default:
                ((y42) pt2Var).accept(Float.valueOf(z11Var.getTranslationY()));
                break;
        }
    }
}
