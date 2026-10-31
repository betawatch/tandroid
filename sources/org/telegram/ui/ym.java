package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ym extends gf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ym(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = zVar;
    }

    @Override // gf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zg(10, this, (org.telegram.ui.Cells.s0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // gf.e
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f;
                un unVar = fnVar.a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                unVar.Rb = q1Var.getMessageObject().f1();
                un unVar2 = fnVar.a;
                unVar2.Sb = 2;
                unVar2.Tb = null;
                q1Var.invalidate();
                break;
            case 1:
                fn fnVar2 = (fn) this.f;
                un unVar3 = fnVar2.a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                unVar3.Rb = q1Var2.getMessageObject().f1();
                un unVar4 = fnVar2.a;
                unVar4.Sb = 2;
                unVar4.Tb = null;
                q1Var2.invalidate();
                break;
            case 2:
                fn fnVar3 = (fn) this.f;
                un unVar5 = fnVar3.a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                unVar5.Rb = q1Var3.getMessageObject().f1();
                un unVar6 = fnVar3.a;
                unVar6.Sb = 2;
                unVar6.Tb = null;
                q1Var3.invalidate();
                break;
            case 3:
                fn fnVar4 = (fn) this.f;
                un unVar7 = fnVar4.a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                unVar7.Rb = q1Var4.getMessageObject().f1();
                un unVar8 = fnVar4.a;
                unVar8.Sb = 2;
                unVar8.Tb = null;
                q1Var4.invalidate();
                break;
            case 4:
                fn fnVar5 = (fn) this.f;
                un unVar9 = fnVar5.a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                unVar9.Rb = q1Var5.getMessageObject().f1();
                un unVar10 = fnVar5.a;
                unVar10.Sb = 2;
                unVar10.Tb = null;
                q1Var5.invalidate();
                break;
            case 5:
                fn fnVar6 = (fn) this.f;
                un unVar11 = fnVar6.a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                unVar11.Rb = q1Var6.getMessageObject().f1();
                un unVar12 = fnVar6.a;
                unVar12.Sb = 2;
                unVar12.Tb = null;
                q1Var6.invalidate();
                break;
            default:
                am amVar = (am) this.f;
                un unVar13 = amVar.a.Q;
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.e;
                unVar13.Rb = s0Var.getMessageObject().f1();
                un unVar14 = amVar.a.Q;
                unVar14.Sb = 4;
                unVar14.Tb = null;
                s0Var.getMessageObject().r = true;
                s0Var.invalidate();
                break;
        }
    }
}
