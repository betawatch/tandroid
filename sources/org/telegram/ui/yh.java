package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yh implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ qn a;

    public yh(qn qnVar) {
        this.a = qnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i9, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        qn qnVar = this.a;
        jm jmVar = qnVar.Y8;
        if ((jmVar == null || !jmVar.z) && !qnVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
            if (!z10 && !qnVar.Ka) {
                qnVar.z4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                            if (!kVar.s() || (qnVar.A9() && !z11)) {
                                view2 = view;
                                qn.b2(qnVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f10) : false, f10, f11);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = qnVar.I7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().type != 27) {
                                    qn.c2(qnVar, i9);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                qn.b2(qnVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f10) : false, f10, f11);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void u(float f10) {
    }
}
