package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vm extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new eh(8, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                cn cnVar = (cn) this.f;
                qn qnVar = cnVar.a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                qnVar.wb = u1Var.getMessageObject().getId();
                qn qnVar2 = cnVar.a;
                qnVar2.xb = 2;
                qnVar2.yb = null;
                u1Var.invalidate();
                break;
            case 1:
                cn cnVar2 = (cn) this.f;
                qn qnVar3 = cnVar2.a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                qnVar3.wb = u1Var2.getMessageObject().getId();
                qn qnVar4 = cnVar2.a;
                qnVar4.xb = 2;
                qnVar4.yb = null;
                u1Var2.invalidate();
                break;
            case 2:
                cn cnVar3 = (cn) this.f;
                qn qnVar5 = cnVar3.a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                qnVar5.wb = u1Var3.getMessageObject().getId();
                qn qnVar6 = cnVar3.a;
                qnVar6.xb = 2;
                qnVar6.yb = null;
                u1Var3.invalidate();
                break;
            case 3:
                cn cnVar4 = (cn) this.f;
                qn qnVar7 = cnVar4.a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                qnVar7.wb = u1Var4.getMessageObject().getId();
                qn qnVar8 = cnVar4.a;
                qnVar8.xb = 2;
                qnVar8.yb = null;
                u1Var4.invalidate();
                break;
            case 4:
                cn cnVar5 = (cn) this.f;
                qn qnVar9 = cnVar5.a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                qnVar9.wb = u1Var5.getMessageObject().getId();
                qn qnVar10 = cnVar5.a;
                qnVar10.xb = 2;
                qnVar10.yb = null;
                u1Var5.invalidate();
                break;
            case 5:
                cn cnVar6 = (cn) this.f;
                qn qnVar11 = cnVar6.a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                qnVar11.wb = u1Var6.getMessageObject().getId();
                qn qnVar12 = cnVar6.a;
                qnVar12.xb = 2;
                qnVar12.yb = null;
                u1Var6.invalidate();
                break;
            default:
                ul ulVar = (ul) this.f;
                qn qnVar13 = ulVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                qnVar13.wb = w0Var.getMessageObject().getId();
                qn qnVar14 = ulVar.a.Q;
                qnVar14.xb = 4;
                qnVar14.yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
