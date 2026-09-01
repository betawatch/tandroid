package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yl extends au0 {
    public final /* synthetic */ xn a;

    public yl(xn xnVar) {
        this.a = xnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        bk bkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            xn xnVar = this.a;
            if (i10 < xnVar.Ea.size() && (bkVar = xnVar.F1) != null && bkVar.getListView() != null) {
                int childCount = xnVar.F1.getListView().getChildCount();
                Object obj = xnVar.Ea.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.F1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                lu0 lu0Var = new lu0();
                                lu0Var.b = iArr[0];
                                lu0Var.c = iArr[1];
                                lu0Var.d = xnVar.F1.getListView();
                                lu0Var.a = imageReceiver;
                                lu0Var.e = imageReceiver.getBitmapSafe();
                                lu0Var.h = imageReceiver.getRoundRadius(true);
                                return lu0Var;
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

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            xn xnVar = this.a;
            if (i10 >= xnVar.Ea.size()) {
                return;
            }
            xnVar.cb((TLRPC.BotInlineResult) xnVar.Ea.get(i10), z4, i11, 0L);
        }
    }
}
