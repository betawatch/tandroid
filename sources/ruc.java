// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
