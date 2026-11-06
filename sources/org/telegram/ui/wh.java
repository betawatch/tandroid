package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wh implements org.telegram.ui.Components.ej0 {
    public final /* synthetic */ an a;

    public wh(an anVar) {
        this.a = anVar;
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
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z11;
        an anVar = this.a;
        pl plVar = anVar.q9;
        if ((plVar == null || !plVar.z) && !anVar.y9()) {
            z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
            if (!z9 && !anVar.ib) {
                anVar.P4 = true;
                if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && t0Var.getMessageObject().D != 21 && !t0Var.getMessageObject().Y4() && t0Var.getMessageObject().D != 30) {
                            z10 = false;
                            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                            if (!kVar.v() || (anVar.W9() && !z10)) {
                                view2 = view;
                                an.j2(anVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).B2(f10) : false, f10, f11);
                                z11 = true;
                            } else {
                                view2 = view;
                                z11 = anVar.X7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().D != 27) {
                                    an.k2(anVar, i7);
                                    return true;
                                }
                            }
                            return z11;
                        }
                    }
                }
                z10 = true;
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar.v()) {
                }
                view2 = view;
                an.j2(anVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).B2(f10) : false, f10, f11);
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
