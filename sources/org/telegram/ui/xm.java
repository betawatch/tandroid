package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class xm extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gh(8, this, (org.telegram.ui.Cells.x0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                en enVar = (en) this.f;
                sn snVar = enVar.a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                snVar.wb = u1Var.getMessageObject().getId();
                sn snVar2 = enVar.a;
                snVar2.xb = 2;
                snVar2.yb = null;
                u1Var.invalidate();
                break;
            case 1:
                en enVar2 = (en) this.f;
                sn snVar3 = enVar2.a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                snVar3.wb = u1Var2.getMessageObject().getId();
                sn snVar4 = enVar2.a;
                snVar4.xb = 2;
                snVar4.yb = null;
                u1Var2.invalidate();
                break;
            case 2:
                en enVar3 = (en) this.f;
                sn snVar5 = enVar3.a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                snVar5.wb = u1Var3.getMessageObject().getId();
                sn snVar6 = enVar3.a;
                snVar6.xb = 2;
                snVar6.yb = null;
                u1Var3.invalidate();
                break;
            case 3:
                en enVar4 = (en) this.f;
                sn snVar7 = enVar4.a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                snVar7.wb = u1Var4.getMessageObject().getId();
                sn snVar8 = enVar4.a;
                snVar8.xb = 2;
                snVar8.yb = null;
                u1Var4.invalidate();
                break;
            case 4:
                en enVar5 = (en) this.f;
                sn snVar9 = enVar5.a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                snVar9.wb = u1Var5.getMessageObject().getId();
                sn snVar10 = enVar5.a;
                snVar10.xb = 2;
                snVar10.yb = null;
                u1Var5.invalidate();
                break;
            case 5:
                en enVar6 = (en) this.f;
                sn snVar11 = enVar6.a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                snVar11.wb = u1Var6.getMessageObject().getId();
                sn snVar12 = enVar6.a;
                snVar12.xb = 2;
                snVar12.yb = null;
                u1Var6.invalidate();
                break;
            default:
                wl wlVar = (wl) this.f;
                sn snVar13 = wlVar.a.Q;
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.e;
                snVar13.wb = x0Var.getMessageObject().getId();
                sn snVar14 = wlVar.a.Q;
                snVar14.xb = 4;
                snVar14.yb = null;
                x0Var.getMessageObject().flickerLoading = true;
                x0Var.invalidate();
                break;
        }
    }
}
