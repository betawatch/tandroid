package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xl extends lu0 {
    public final /* synthetic */ wn a;

    public xl(wn wnVar) {
        this.a = wnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ck ckVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            wn wnVar = this.a;
            if (i10 < wnVar.Ha.size() && (ckVar = wnVar.I1) != null && ckVar.getListView() != null) {
                int childCount = wnVar.I1.getListView().getChildCount();
                Object obj = wnVar.Ha.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = wnVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                vu0 vu0Var = new vu0();
                                vu0Var.b = iArr[0];
                                vu0Var.c = iArr[1];
                                vu0Var.d = wnVar.I1.getListView();
                                vu0Var.a = imageReceiver;
                                vu0Var.e = imageReceiver.getBitmapSafe();
                                vu0Var.h = imageReceiver.getRoundRadius(true);
                                return vu0Var;
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

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            wn wnVar = this.a;
            if (i10 >= wnVar.Ha.size()) {
                return;
            }
            wnVar.cb((TLRPC.BotInlineResult) wnVar.Ha.get(i10), z10, i11, 0L);
        }
    }
}
