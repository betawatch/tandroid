package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class th extends qq0 {
    public final /* synthetic */ cn a;

    public th(cn cnVar) {
        this.a = cnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        lj ljVar;
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            cn cnVar = this.a;
            if (i7 < cnVar.db.size() && (ljVar = cnVar.W1) != null && ljVar.getListView() != null) {
                int childCount = cnVar.W1.getListView().getChildCount();
                Object obj = cnVar.db.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = cnVar.W1.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                zq0 zq0Var = new zq0();
                                zq0Var.b = iArr[0];
                                zq0Var.c = iArr[1];
                                zq0Var.d = cnVar.W1.getListView();
                                zq0Var.a = imageReceiver;
                                zq0Var.e = imageReceiver.p();
                                zq0Var.h = imageReceiver.E();
                                return zq0Var;
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

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            cn cnVar = this.a;
            if (i7 >= cnVar.db.size()) {
                return;
            }
            cnVar.Gb((TLRPC.BotInlineResult) cnVar.db.get(i7), z9, i10, 0L);
        }
    }
}
