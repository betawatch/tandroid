package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wh implements org.telegram.ui.Components.tj0 {
    public final /* synthetic */ bn a;

    public wh(bn bnVar) {
        this.a = bnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        bn bnVar = this.a;
        ql qlVar = bnVar.u9;
        if ((qlVar == null || !qlVar.z) && !bnVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (!z10 && !bnVar.mb) {
                bnVar.R4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().D != 21 && !v0Var.getMessageObject().X4() && v0Var.getMessageObject().D != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                            if (!kVar.x() || (bnVar.Y9() && !z11)) {
                                view2 = view;
                                bn.k2(bnVar, view2, view2 instanceof org.telegram.ui.Cells.r1 ? !((org.telegram.ui.Cells.r1) view2).E2(f10) : false, f10, f11);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = bnVar.Y7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.r1) {
                                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().D != 27) {
                                    bn.l2(bnVar, i7);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar.x()) {
                }
                view2 = view;
                bn.k2(bnVar, view2, view2 instanceof org.telegram.ui.Cells.r1 ? !((org.telegram.ui.Cells.r1) view2).E2(f10) : false, f10, f11);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void l(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void h() {
    }
}
