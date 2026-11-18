package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ qe(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // org.telegram.messenger.p10
    public final Object run() {
        org.telegram.ui.ActionBar.h2 h2Var;
        switch (this.a) {
            case 0:
                h2Var = (bn) this.b;
                break;
            case 1:
                bn bnVar = (bn) this.b;
                if (org.telegram.messenger.pc.e(65536) && org.telegram.ui.Components.mz0.c()) {
                    org.telegram.ui.Components.mz0 mz0Var = bnVar.y0;
                    if (mz0Var == null || mz0Var.e) {
                        if (bnVar.getParentActivity() != null && org.telegram.ui.Components.mz0.c() && bnVar.A0 != null && bnVar.m1 != null) {
                            org.telegram.ui.Components.mz0 mz0Var2 = bnVar.y0;
                            if (mz0Var2 != null) {
                                org.telegram.messenger.g0.E2(mz0Var2);
                            }
                            org.telegram.ui.Components.mz0 mz0Var3 = new org.telegram.ui.Components.mz0(bnVar.getParentActivity(), new k9(14, bnVar, r2));
                            bnVar.y0 = mz0Var3;
                            org.telegram.ui.Components.mz0[] mz0VarArr = {mz0Var3};
                            pl plVar = bnVar.m1;
                            plVar.addView(mz0Var3, plVar.indexOfChild(bnVar.A0) + 1, c8.ma.c(-1.0f, -1));
                        }
                    }
                    return bnVar.y0;
                }
                return null;
            case 2:
                ((bn) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.mz0.c() && org.telegram.messenger.pc.e(65536));
            default:
                h2Var = (ProfileActivity) this.b;
                break;
        }
        return h2Var.getSimpleMenuOverlay();
    }
}
