package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class wm extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wm(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = zVar;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new eh(8, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                dn dnVar = (dn) this.f;
                sn snVar = dnVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                snVar.Jb = t1Var.getMessageObject().getId();
                sn snVar2 = dnVar.a;
                snVar2.Kb = 2;
                snVar2.Lb = null;
                t1Var.invalidate();
                break;
            case 1:
                dn dnVar2 = (dn) this.f;
                sn snVar3 = dnVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                snVar3.Jb = t1Var2.getMessageObject().getId();
                sn snVar4 = dnVar2.a;
                snVar4.Kb = 2;
                snVar4.Lb = null;
                t1Var2.invalidate();
                break;
            case 2:
                dn dnVar3 = (dn) this.f;
                sn snVar5 = dnVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                snVar5.Jb = t1Var3.getMessageObject().getId();
                sn snVar6 = dnVar3.a;
                snVar6.Kb = 2;
                snVar6.Lb = null;
                t1Var3.invalidate();
                break;
            case 3:
                dn dnVar4 = (dn) this.f;
                sn snVar7 = dnVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                snVar7.Jb = t1Var4.getMessageObject().getId();
                sn snVar8 = dnVar4.a;
                snVar8.Kb = 2;
                snVar8.Lb = null;
                t1Var4.invalidate();
                break;
            case 4:
                dn dnVar5 = (dn) this.f;
                sn snVar9 = dnVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                snVar9.Jb = t1Var5.getMessageObject().getId();
                sn snVar10 = dnVar5.a;
                snVar10.Kb = 2;
                snVar10.Lb = null;
                t1Var5.invalidate();
                break;
            case 5:
                dn dnVar6 = (dn) this.f;
                sn snVar11 = dnVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                snVar11.Jb = t1Var6.getMessageObject().getId();
                sn snVar12 = dnVar6.a;
                snVar12.Kb = 2;
                snVar12.Lb = null;
                t1Var6.invalidate();
                break;
            default:
                vl vlVar = (vl) this.f;
                sn snVar13 = vlVar.a.Q;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                snVar13.Jb = v0Var.getMessageObject().getId();
                sn snVar14 = vlVar.a.Q;
                snVar14.Kb = 4;
                snVar14.Lb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
