// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pz7 implements zw2 {
    public final /* synthetic */ pn1 a;

    public pz7(pn1 pn1Var) {
        this.a = pn1Var;
    }

    @Override // zw2
    public final mx2 getContext() {
        return u24.a;
    }

    @Override // zw2
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof ge9;
        pn1 pn1Var = this.a;
        if (z) {
            pn1Var.a(null, ((ge9) obj).a);
        } else {
            pn1Var.a(obj, null);
        }
    }
}
