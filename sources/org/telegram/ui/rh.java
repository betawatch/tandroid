package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rh extends mq0 {
    public final /* synthetic */ an a;

    public rh(an anVar) {
        this.a = anVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        jj jjVar;
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            an anVar = this.a;
            if (i7 < anVar.eb.size() && (jjVar = anVar.X1) != null && jjVar.getListView() != null) {
                int childCount = anVar.X1.getListView().getChildCount();
                Object obj = anVar.eb.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = anVar.X1.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                uq0 uq0Var = new uq0();
                                uq0Var.b = iArr[0];
                                uq0Var.c = iArr[1];
                                uq0Var.d = anVar.X1.getListView();
                                uq0Var.a = imageReceiver;
                                uq0Var.e = imageReceiver.p();
                                uq0Var.h = imageReceiver.E();
                                return uq0Var;
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            an anVar = this.a;
            if (i7 >= anVar.eb.size()) {
                return;
            }
            anVar.Hb((TLRPC.BotInlineResult) anVar.eb.get(i7), z10, i10, 0L);
        }
    }
}
