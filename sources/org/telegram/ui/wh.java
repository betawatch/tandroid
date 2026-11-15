package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wh implements org.telegram.ui.Components.jj0 {
    public final /* synthetic */ an a;

    public wh(an anVar) {
        this.a = anVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.jj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        an anVar = this.a;
        pl plVar = anVar.t9;
        if ((plVar == null || !plVar.z) && !anVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
            if (!z10 && !anVar.lb) {
                anVar.Q4 = true;
                if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && t0Var.getMessageObject().D != 21 && !t0Var.getMessageObject().X4() && t0Var.getMessageObject().D != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                            if (!kVar.x() || (anVar.Y9() && !z11)) {
                                view2 = view;
                                an.k2(anVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).C2(f10) : false, f10, f11);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = anVar.Y7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().D != 27) {
                                    an.l2(anVar, i7);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar.x()) {
                }
                view2 = view;
                an.k2(anVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).C2(f10) : false, f10, f11);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public final /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.jj0
    public final /* synthetic */ void i() {
    }
}
