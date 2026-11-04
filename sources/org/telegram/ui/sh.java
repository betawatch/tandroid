package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sh implements org.telegram.ui.Components.ij0 {
    public final /* synthetic */ wm a;

    public sh(wm wmVar) {
        this.a = wmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(float f10, float f11, int i3, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        wm wmVar = this.a;
        ll llVar = wmVar.r9;
        if ((llVar == null || !llVar.z) && !wmVar.y9()) {
            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
            if (!z10 && !wmVar.jb) {
                wmVar.Q4 = true;
                if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && t0Var.getMessageObject().D != 21 && !t0Var.getMessageObject().Y4() && t0Var.getMessageObject().D != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                            if (!kVar.v() || (wmVar.W9() && !z11)) {
                                view2 = view;
                                wm.j2(wmVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).A2(f10) : false, f10, f11);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = wmVar.X7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().D != 27) {
                                    wm.k2(wmVar, i3);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar.v()) {
                }
                view2 = view;
                wm.j2(wmVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).A2(f10) : false, f10, f11);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public final /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.ij0
    public final /* synthetic */ void h() {
    }
}
