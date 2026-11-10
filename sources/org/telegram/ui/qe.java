package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ qe(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.messenger.u10
    public final Object run() {
        org.telegram.ui.ActionBar.f2 f2Var;
        switch (this.a) {
            case 0:
                f2Var = (cn) this.b;
                break;
            case 1:
                cn cnVar = (cn) this.b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.dz0.c()) {
                    org.telegram.ui.Components.dz0 dz0Var = cnVar.x0;
                    if (dz0Var == null || dz0Var.e) {
                        if (cnVar.getParentActivity() != null && org.telegram.ui.Components.dz0.c() && cnVar.z0 != null && cnVar.l1 != null) {
                            org.telegram.ui.Components.dz0 dz0Var2 = cnVar.x0;
                            if (dz0Var2 != null) {
                                org.telegram.messenger.g0.E2(dz0Var2);
                            }
                            org.telegram.ui.Components.dz0 dz0Var3 = new org.telegram.ui.Components.dz0(cnVar.getParentActivity(), new oe(0, cnVar, r2));
                            cnVar.x0 = dz0Var3;
                            org.telegram.ui.Components.dz0[] dz0VarArr = {dz0Var3};
                            ql qlVar = cnVar.l1;
                            qlVar.addView(dz0Var3, qlVar.indexOfChild(cnVar.z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return cnVar.x0;
                }
                return null;
            case 2:
                ((cn) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.dz0.c() && org.telegram.messenger.sc.e(65536));
            default:
                f2Var = (ProfileActivity) this.b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
