// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
