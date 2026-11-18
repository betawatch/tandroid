package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vh implements org.telegram.ui.Components.rj0 {
    public final /* synthetic */ bn a;

    public vh(bn bnVar) {
        this.a = bnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        bn bnVar = this.a;
        ql qlVar = bnVar.u9;
        if ((qlVar == null || !qlVar.z) && !bnVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
            if (!z10 && !bnVar.mb) {
                bnVar.R4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().D != 21 && !v0Var.getMessageObject().X4() && v0Var.getMessageObject().D != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                            if (!kVar.y() || (bnVar.Y9() && !z11)) {
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
                kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                if (kVar.y()) {
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

    @Override // org.telegram.ui.Components.rj0
    public final /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.rj0
    public final /* synthetic */ void j() {
    }
}
