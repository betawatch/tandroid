package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yh implements org.telegram.ui.Components.ej0 {
    public final /* synthetic */ cn a;

    public yh(cn cnVar) {
        this.a = cnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.ej0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z9;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        View view2;
        boolean z11;
        cn cnVar = this.a;
        rl rlVar = cnVar.s9;
        if ((rlVar == null || !rlVar.z) && !cnVar.z9()) {
            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
            if (!z9 && !cnVar.kb) {
                cnVar.P4 = true;
                if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && t0Var.getMessageObject().D != 21 && !t0Var.getMessageObject().X4() && t0Var.getMessageObject().D != 30) {
                            z10 = false;
                            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                            if (!lVar.x() || (cnVar.X9() && !z10)) {
                                view2 = view;
                                cn.k2(cnVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).B2(f10) : false, f10, f11);
                                z11 = true;
                            } else {
                                view2 = view;
                                z11 = cnVar.Y7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().D != 27) {
                                    cn.l2(cnVar, i7);
                                    return true;
                                }
                            }
                            return z11;
                        }
                    }
                }
                z10 = true;
                lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (lVar.x()) {
                }
                view2 = view;
                cn.k2(cnVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).B2(f10) : false, f10, f11);
                z11 = true;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                }
                return z11;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ej0
    public final /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public final /* synthetic */ void i() {
    }
}
