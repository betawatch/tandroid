package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z0 extends w7.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.w5
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = ((j4) this.b).I;
                if (h3Var != null) {
                    h3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 1:
                eo eoVar = (eo) this.b;
                eoVar.n9 = !z10;
                if (z10) {
                    if (eoVar.d9 != null) {
                        eo.V1(eoVar, 0.0f);
                        eoVar.d9 = null;
                    }
                    eoVar.e9 = false;
                    eoVar.f9 = false;
                    tl tlVar = eoVar.h9;
                    if (tlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(tlVar.H);
                        tlVar.a();
                    }
                }
                eoVar.vc();
                break;
            case 2:
                org.telegram.ui.Components.yb0 yb0Var = (org.telegram.ui.Components.yb0) this.b;
                org.telegram.ui.Components.qb0 qb0Var = yb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = yb0Var.s;
                org.telegram.ui.Components.ec0 ec0Var = yb0Var.c0;
                if (ec0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (qb0Var.v - qb0Var.u <= MessagesController.getInstance(ec0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.aa aaVar = qb0Var.W;
                            MessageObject c10 = yb0Var.c(aaVar != null ? ((org.telegram.ui.Cells.t1) aaVar).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = ec0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = qb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = qb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = tn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(yb0Var.I);
                                break;
                            }
                        } else {
                            yb0Var.f();
                            break;
                        }
                    }
                }
                break;
            default:
                zh.a3 a3Var = (zh.a3) this.b;
                zh.w2 w2Var = a3Var.Q1;
                boolean y3 = a3Var.K0.W.y();
                zh.u7 u7Var = ((zh.l7) w2Var).d;
                u7Var.j1 = y3;
                u7Var.P();
                break;
        }
    }

    @Override // w7.w5
    public void b() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 1:
                eo eoVar = (eo) this.b;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    if (lVar2.s()) {
                        eoVar.z7(false);
                    }
                }
                eoVar.Q7();
                eoVar.y3.j(58, 0L, null);
                break;
        }
    }
}
