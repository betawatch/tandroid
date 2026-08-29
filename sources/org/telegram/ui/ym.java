package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ym extends ye.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ym(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // ye.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vf(14, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // ye.c
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f;
                tn tnVar = fnVar.a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                tnVar.sb = s1Var.getMessageObject().getId();
                tn tnVar2 = fnVar.a;
                tnVar2.tb = 2;
                tnVar2.ub = null;
                s1Var.invalidate();
                break;
            case 1:
                fn fnVar2 = (fn) this.f;
                tn tnVar3 = fnVar2.a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                tnVar3.sb = s1Var2.getMessageObject().getId();
                tn tnVar4 = fnVar2.a;
                tnVar4.tb = 2;
                tnVar4.ub = null;
                s1Var2.invalidate();
                break;
            case 2:
                fn fnVar3 = (fn) this.f;
                tn tnVar5 = fnVar3.a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                tnVar5.sb = s1Var3.getMessageObject().getId();
                tn tnVar6 = fnVar3.a;
                tnVar6.tb = 2;
                tnVar6.ub = null;
                s1Var3.invalidate();
                break;
            case 3:
                fn fnVar4 = (fn) this.f;
                tn tnVar7 = fnVar4.a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                tnVar7.sb = s1Var4.getMessageObject().getId();
                tn tnVar8 = fnVar4.a;
                tnVar8.tb = 2;
                tnVar8.ub = null;
                s1Var4.invalidate();
                break;
            case 4:
                fn fnVar5 = (fn) this.f;
                tn tnVar9 = fnVar5.a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                tnVar9.sb = s1Var5.getMessageObject().getId();
                tn tnVar10 = fnVar5.a;
                tnVar10.tb = 2;
                tnVar10.ub = null;
                s1Var5.invalidate();
                break;
            case 5:
                fn fnVar6 = (fn) this.f;
                tn tnVar11 = fnVar6.a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                tnVar11.sb = s1Var6.getMessageObject().getId();
                tn tnVar12 = fnVar6.a;
                tnVar12.tb = 2;
                tnVar12.ub = null;
                s1Var6.invalidate();
                break;
            default:
                vl vlVar = (vl) this.f;
                tn tnVar13 = vlVar.a.M;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                tnVar13.sb = v0Var.getMessageObject().getId();
                tn tnVar14 = vlVar.a.M;
                tnVar14.tb = 4;
                tnVar14.ub = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
