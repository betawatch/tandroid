package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vm extends ve.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i9) {
        this.d = i9;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // ve.d
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rd(17, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // ve.d
    public final void d() {
        switch (this.d) {
            case 0:
                cn cnVar = (cn) this.f;
                qn qnVar = cnVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                qnVar.sb = t1Var.getMessageObject().getId();
                qn qnVar2 = cnVar.a;
                qnVar2.tb = 2;
                qnVar2.ub = null;
                t1Var.invalidate();
                break;
            case 1:
                cn cnVar2 = (cn) this.f;
                qn qnVar3 = cnVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                qnVar3.sb = t1Var2.getMessageObject().getId();
                qn qnVar4 = cnVar2.a;
                qnVar4.tb = 2;
                qnVar4.ub = null;
                t1Var2.invalidate();
                break;
            case 2:
                cn cnVar3 = (cn) this.f;
                qn qnVar5 = cnVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                qnVar5.sb = t1Var3.getMessageObject().getId();
                qn qnVar6 = cnVar3.a;
                qnVar6.tb = 2;
                qnVar6.ub = null;
                t1Var3.invalidate();
                break;
            case 3:
                cn cnVar4 = (cn) this.f;
                qn qnVar7 = cnVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                qnVar7.sb = t1Var4.getMessageObject().getId();
                qn qnVar8 = cnVar4.a;
                qnVar8.tb = 2;
                qnVar8.ub = null;
                t1Var4.invalidate();
                break;
            case 4:
                cn cnVar5 = (cn) this.f;
                qn qnVar9 = cnVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                qnVar9.sb = t1Var5.getMessageObject().getId();
                qn qnVar10 = cnVar5.a;
                qnVar10.tb = 2;
                qnVar10.ub = null;
                t1Var5.invalidate();
                break;
            case 5:
                cn cnVar6 = (cn) this.f;
                qn qnVar11 = cnVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                qnVar11.sb = t1Var6.getMessageObject().getId();
                qn qnVar12 = cnVar6.a;
                qnVar12.tb = 2;
                qnVar12.ub = null;
                t1Var6.invalidate();
                break;
            default:
                tl tlVar = (tl) this.f;
                qn qnVar13 = tlVar.a.M;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                qnVar13.sb = w0Var.getMessageObject().getId();
                qn qnVar14 = tlVar.a.M;
                qnVar14.tb = 4;
                qnVar14.ub = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
