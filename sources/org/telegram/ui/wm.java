package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wm extends we.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // we.d
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rd(17, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // we.d
    public final void d() {
        switch (this.d) {
            case 0:
                dn dnVar = (dn) this.f;
                rn rnVar = dnVar.a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                rnVar.sb = s1Var.getMessageObject().getId();
                rn rnVar2 = dnVar.a;
                rnVar2.tb = 2;
                rnVar2.ub = null;
                s1Var.invalidate();
                break;
            case 1:
                dn dnVar2 = (dn) this.f;
                rn rnVar3 = dnVar2.a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                rnVar3.sb = s1Var2.getMessageObject().getId();
                rn rnVar4 = dnVar2.a;
                rnVar4.tb = 2;
                rnVar4.ub = null;
                s1Var2.invalidate();
                break;
            case 2:
                dn dnVar3 = (dn) this.f;
                rn rnVar5 = dnVar3.a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                rnVar5.sb = s1Var3.getMessageObject().getId();
                rn rnVar6 = dnVar3.a;
                rnVar6.tb = 2;
                rnVar6.ub = null;
                s1Var3.invalidate();
                break;
            case 3:
                dn dnVar4 = (dn) this.f;
                rn rnVar7 = dnVar4.a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                rnVar7.sb = s1Var4.getMessageObject().getId();
                rn rnVar8 = dnVar4.a;
                rnVar8.tb = 2;
                rnVar8.ub = null;
                s1Var4.invalidate();
                break;
            case 4:
                dn dnVar5 = (dn) this.f;
                rn rnVar9 = dnVar5.a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                rnVar9.sb = s1Var5.getMessageObject().getId();
                rn rnVar10 = dnVar5.a;
                rnVar10.tb = 2;
                rnVar10.ub = null;
                s1Var5.invalidate();
                break;
            case 5:
                dn dnVar6 = (dn) this.f;
                rn rnVar11 = dnVar6.a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                rnVar11.sb = s1Var6.getMessageObject().getId();
                rn rnVar12 = dnVar6.a;
                rnVar12.tb = 2;
                rnVar12.ub = null;
                s1Var6.invalidate();
                break;
            default:
                ul ulVar = (ul) this.f;
                rn rnVar13 = ulVar.a.M;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                rnVar13.sb = v0Var.getMessageObject().getId();
                rn rnVar14 = ulVar.a.M;
                rnVar14.tb = 4;
                rnVar14.ub = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
