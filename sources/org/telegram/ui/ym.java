package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ym extends qf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ym(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = zVar;
    }

    @Override // qf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f).a, 8), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f).a, 9), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ed(19, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // qf.c
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f;
                un unVar = fnVar.a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                unVar.Sb = s1Var.getMessageObject().getId();
                un unVar2 = fnVar.a;
                unVar2.Tb = 2;
                unVar2.Ub = null;
                s1Var.invalidate();
                break;
            case 1:
                fn fnVar2 = (fn) this.f;
                un unVar3 = fnVar2.a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                unVar3.Sb = s1Var2.getMessageObject().getId();
                un unVar4 = fnVar2.a;
                unVar4.Tb = 2;
                unVar4.Ub = null;
                s1Var2.invalidate();
                break;
            case 2:
                fn fnVar3 = (fn) this.f;
                un unVar5 = fnVar3.a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                unVar5.Sb = s1Var3.getMessageObject().getId();
                un unVar6 = fnVar3.a;
                unVar6.Tb = 2;
                unVar6.Ub = null;
                s1Var3.invalidate();
                break;
            case 3:
                fn fnVar4 = (fn) this.f;
                un unVar7 = fnVar4.a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                unVar7.Sb = s1Var4.getMessageObject().getId();
                un unVar8 = fnVar4.a;
                unVar8.Tb = 2;
                unVar8.Ub = null;
                s1Var4.invalidate();
                break;
            case 4:
                fn fnVar5 = (fn) this.f;
                un unVar9 = fnVar5.a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                unVar9.Sb = s1Var5.getMessageObject().getId();
                un unVar10 = fnVar5.a;
                unVar10.Tb = 2;
                unVar10.Ub = null;
                s1Var5.invalidate();
                break;
            case 5:
                fn fnVar6 = (fn) this.f;
                un unVar11 = fnVar6.a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                unVar11.Sb = s1Var6.getMessageObject().getId();
                un unVar12 = fnVar6.a;
                unVar12.Tb = 2;
                unVar12.Ub = null;
                s1Var6.invalidate();
                break;
            default:
                wl wlVar = (wl) this.f;
                un unVar13 = wlVar.a.Q;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                unVar13.Sb = v0Var.getMessageObject().getId();
                un unVar14 = wlVar.a.Q;
                unVar14.Tb = 4;
                unVar14.Ub = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
