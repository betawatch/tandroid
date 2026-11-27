// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
