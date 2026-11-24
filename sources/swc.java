// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class swc extends c6 {
    public final /* synthetic */ uwc a;

    public swc(uwc uwcVar) {
        this.a = uwcVar;
    }

    @Override // c6
    public final void b(int i) {
        uwc uwcVar = this.a;
        k47 k47Var = uwcVar.n;
        if (i == -1) {
            uwcVar.finishFragment();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                uwc.a0(uwcVar.d, k47Var, uwcVar.getParentActivity(), uwcVar.r, uwcVar.e);
            }
        } else if (k47Var != null) {
            k47Var.k.with_my_score = false;
            uwcVar.showDialog(tca.G0(uwcVar.getParentActivity(), k47Var, null, false, uwcVar.h));
        }
    }
}
