package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sl extends pt0 {
    public final /* synthetic */ tn a;

    public sl(tn tnVar) {
        this.a = tnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        wj wjVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            tn tnVar = this.a;
            if (i10 < tnVar.Da.size() && (wjVar = tnVar.E1) != null && wjVar.getListView() != null) {
                int childCount = tnVar.E1.getListView().getChildCount();
                Object obj = tnVar.Da.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = tnVar.E1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                zt0 zt0Var = new zt0();
                                zt0Var.b = iArr[0];
                                zt0Var.c = iArr[1];
                                zt0Var.d = tnVar.E1.getListView();
                                zt0Var.a = imageReceiver;
                                zt0Var.e = imageReceiver.getBitmapSafe();
                                zt0Var.h = imageReceiver.getRoundRadius(true);
                                return zt0Var;
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

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            tn tnVar = this.a;
            if (i10 >= tnVar.Da.size()) {
                return;
            }
            tnVar.cb((TLRPC.BotInlineResult) tnVar.Da.get(i10), z10, i11, 0L);
        }
    }
}
