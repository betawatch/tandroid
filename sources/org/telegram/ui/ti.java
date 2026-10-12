package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ti implements org.telegram.ui.Components.dm0 {
    public final /* synthetic */ fo a;

    public ti(fo foVar) {
        this.a = foVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.dm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        fo foVar = this.a;
        ym ymVar = foVar.c9;
        if ((ymVar == null || !ymVar.z) && !foVar.g9()) {
            z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
            if (!z10 && !foVar.Pa) {
                foVar.D4 = true;
                if (view instanceof org.telegram.ui.Cells.x0) {
                    org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) view;
                    MessageObject messageObject = x0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && x0Var.getMessageObject().type != 21 && !x0Var.getMessageObject().isWallpaperAction() && x0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                            if (!kVar.t() || (foVar.F9() && !z11)) {
                                view2 = view;
                                fo.c2(foVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = foVar.L7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().type != 27) {
                                    fo.d2(foVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                if (kVar.t()) {
                }
                view2 = view;
                fo.c2(foVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public final /* synthetic */ void q(float f7) {
    }
}
