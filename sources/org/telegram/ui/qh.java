package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qh extends oq0 {
    public final /* synthetic */ bn a;

    public qh(bn bnVar) {
        this.a = bnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        kj kjVar;
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            bn bnVar = this.a;
            if (i7 < bnVar.fb.size() && (kjVar = bnVar.X1) != null && kjVar.getListView() != null) {
                int childCount = bnVar.X1.getListView().getChildCount();
                Object obj = bnVar.fb.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = bnVar.X1.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                        if (i2Var.getResult() == obj) {
                            imageReceiver = i2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                wq0 wq0Var = new wq0();
                                wq0Var.b = iArr[0];
                                wq0Var.c = iArr[1];
                                wq0Var.d = bnVar.X1.getListView();
                                wq0Var.a = imageReceiver;
                                wq0Var.e = imageReceiver.p();
                                wq0Var.h = imageReceiver.E();
                                return wq0Var;
                            }
                        }
                    }
                    imageReceiver = null;
                    if (imageReceiver == null) {
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            bn bnVar = this.a;
            if (i7 >= bnVar.fb.size()) {
                return;
            }
            bnVar.Hb((TLRPC.BotInlineResult) bnVar.fb.get(i7), z10, i10, 0L);
        }
    }
}
