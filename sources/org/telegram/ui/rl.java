package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rl extends st0 {
    public final /* synthetic */ rn a;

    public rl(rn rnVar) {
        this.a = rnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        vj vjVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            rn rnVar = this.a;
            if (i10 < rnVar.Da.size() && (vjVar = rnVar.E1) != null && vjVar.getListView() != null) {
                int childCount = rnVar.E1.getListView().getChildCount();
                Object obj = rnVar.Da.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rnVar.E1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                cu0 cu0Var = new cu0();
                                cu0Var.b = iArr[0];
                                cu0Var.c = iArr[1];
                                cu0Var.d = rnVar.E1.getListView();
                                cu0Var.a = imageReceiver;
                                cu0Var.e = imageReceiver.getBitmapSafe();
                                cu0Var.h = imageReceiver.getRoundRadius(true);
                                return cu0Var;
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            rn rnVar = this.a;
            if (i10 >= rnVar.Da.size()) {
                return;
            }
            rnVar.cb((TLRPC.BotInlineResult) rnVar.Da.get(i10), z10, i11, 0L);
        }
    }
}
