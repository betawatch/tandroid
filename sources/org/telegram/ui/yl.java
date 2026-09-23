package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yl extends mu0 {
    public final /* synthetic */ xn a;

    public yl(xn xnVar) {
        this.a = xnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ck ckVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            xn xnVar = this.a;
            if (i10 < xnVar.Ha.size() && (ckVar = xnVar.I1) != null && ckVar.getListView() != null) {
                int childCount = xnVar.I1.getListView().getChildCount();
                Object obj = xnVar.Ha.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                wu0 wu0Var = new wu0();
                                wu0Var.b = iArr[0];
                                wu0Var.c = iArr[1];
                                wu0Var.d = xnVar.I1.getListView();
                                wu0Var.a = imageReceiver;
                                wu0Var.e = imageReceiver.getBitmapSafe();
                                wu0Var.h = imageReceiver.getRoundRadius(true);
                                return wu0Var;
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

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            xn xnVar = this.a;
            if (i10 >= xnVar.Ha.size()) {
                return;
            }
            xnVar.cb((TLRPC.BotInlineResult) xnVar.Ha.get(i10), z10, i11, 0L);
        }
    }
}
