package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements org.telegram.messenger.o10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ qe(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // org.telegram.messenger.o10
    public final Object run() {
        org.telegram.ui.ActionBar.g2 g2Var;
        switch (this.a) {
            case 0:
                g2Var = (bn) this.b;
                break;
            case 1:
                bn bnVar = (bn) this.b;
                if (org.telegram.messenger.pc.e(65536) && org.telegram.ui.Components.nz0.c()) {
                    org.telegram.ui.Components.nz0 nz0Var = bnVar.y0;
                    if (nz0Var == null || nz0Var.e) {
                        if (bnVar.getParentActivity() != null && org.telegram.ui.Components.nz0.c() && bnVar.A0 != null && bnVar.m1 != null) {
                            org.telegram.ui.Components.nz0 nz0Var2 = bnVar.y0;
                            if (nz0Var2 != null) {
                                org.telegram.messenger.g0.E2(nz0Var2);
                            }
                            org.telegram.ui.Components.nz0 nz0Var3 = new org.telegram.ui.Components.nz0(bnVar.getParentActivity(), new u5(18, bnVar, r2));
                            bnVar.y0 = nz0Var3;
                            org.telegram.ui.Components.nz0[] nz0VarArr = {nz0Var3};
                            pl plVar = bnVar.m1;
                            plVar.addView(nz0Var3, plVar.indexOfChild(bnVar.A0) + 1, c8.na.c(-1.0f, -1));
                        }
                    }
                    return bnVar.y0;
                }
                return null;
            case 2:
                ((bn) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.nz0.c() && org.telegram.messenger.pc.e(65536));
            default:
                g2Var = (ProfileActivity) this.b;
                break;
        }
        return g2Var.getSimpleMenuOverlay();
    }
}
