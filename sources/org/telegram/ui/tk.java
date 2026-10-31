package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tk extends w7.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.x5
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                unVar.G9 = !z10;
                if (z10) {
                    if (unVar.r9 != null) {
                        un.c2(unVar, 0.0f);
                        unVar.r9 = null;
                    }
                    unVar.s9 = false;
                    unVar.y9 = false;
                    ql qlVar = unVar.A9;
                    if (qlVar != null) {
                        org.telegram.messenger.i0.r(qlVar.H);
                        qlVar.a();
                    }
                }
                unVar.Pc();
                break;
            case 1:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) this.b;
                org.telegram.ui.Components.oa0 oa0Var = ua0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ua0Var.s;
                org.telegram.ui.Components.ab0 ab0Var = ua0Var.c0;
                if (ab0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (oa0Var.v - oa0Var.u <= org.telegram.messenger.vp.r1(ab0Var.x).p4) {
                            org.telegram.ui.Cells.r9 r9Var = oa0Var.W;
                            org.telegram.messenger.jj c10 = ua0Var.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                            org.telegram.messenger.nj njVar = ab0Var.d;
                            if (njVar.d == null) {
                                int i10 = oa0Var.u;
                                njVar.e = i10;
                                int i11 = oa0Var.v;
                                njVar.f = i11;
                                njVar.d = kn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ua0Var.I);
                                break;
                            }
                        } else {
                            ua0Var.g();
                            break;
                        }
                    }
                }
                break;
            default:
                th.z2 z2Var = (th.z2) this.b;
                th.v2 v2Var = z2Var.z1;
                boolean x10 = z2Var.t0.W.x();
                th.o7 o7Var = ((th.f7) v2Var).d;
                o7Var.j1 = x10;
                o7Var.d0();
                break;
        }
    }

    @Override // w7.x5
    public void b() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    if (lVar2.u()) {
                        unVar.H7(false);
                    }
                }
                unVar.Y7();
                unVar.M3.j(58, 0L, null);
                break;
        }
    }
}
