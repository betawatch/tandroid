package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class th extends pq0 {
    public final /* synthetic */ cn a;

    public th(cn cnVar) {
        this.a = cnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
                                yq0 yq0Var = new yq0();
                                yq0Var.b = iArr[0];
                                yq0Var.c = iArr[1];
                                yq0Var.d = cnVar.W1.getListView();
                                yq0Var.a = imageReceiver;
                                yq0Var.e = imageReceiver.p();
                                yq0Var.h = imageReceiver.E();
                                return yq0Var;
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

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
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
