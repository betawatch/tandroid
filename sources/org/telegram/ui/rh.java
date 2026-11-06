package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rh extends mq0 {
    public final /* synthetic */ an a;

    public rh(an anVar) {
        this.a = anVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        jj jjVar;
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            an anVar = this.a;
            if (i7 < anVar.bb.size() && (jjVar = anVar.W1) != null && jjVar.getListView() != null) {
                int childCount = anVar.W1.getListView().getChildCount();
                Object obj = anVar.bb.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = anVar.W1.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                vq0 vq0Var = new vq0();
                                vq0Var.b = iArr[0];
                                vq0Var.c = iArr[1];
                                vq0Var.d = anVar.W1.getListView();
                                vq0Var.a = imageReceiver;
                                vq0Var.e = imageReceiver.p();
                                vq0Var.h = imageReceiver.E();
                                return vq0Var;
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            an anVar = this.a;
            if (i7 >= anVar.bb.size()) {
                return;
            }
            anVar.Db((TLRPC.BotInlineResult) anVar.bb.get(i7), z9, i10, 0L);
        }
    }
}
