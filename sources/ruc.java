// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ruc extends c6 {
    public final /* synthetic */ tuc a;

    public ruc(tuc tucVar) {
        this.a = tucVar;
    }

    @Override // c6
    public final void b(int i) {
        tuc tucVar = this.a;
        k27 k27Var = tucVar.n;
        if (i == -1) {
            tucVar.finishFragment();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                tuc.Z(tucVar.d, k27Var, tucVar.getParentActivity(), tucVar.r, tucVar.e);
            }
        } else if (k27Var != null) {
            k27Var.k.with_my_score = false;
            tucVar.showDialog(taa.G0(tucVar.getParentActivity(), k27Var, null, false, tucVar.h));
        }
    }
}
