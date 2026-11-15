package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class za extends mq0 {
    public final /* synthetic */ lb a;

    public za(lb lbVar) {
        this.a = lbVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject2;
        lb lbVar = this.a;
        int childCount = lbVar.w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = lbVar.w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (gjVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == gjVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (gjVar != null) {
                    if (messageObject.e1() == gjVar.e1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.p0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.p0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = t0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                uq0 uq0Var = new uq0();
                uq0Var.b = iArr[0];
                uq0Var.c = iArr[1];
                uq0Var.d = lbVar.w;
                uq0Var.a = imageReceiver;
                uq0Var.e = imageReceiver.p();
                uq0Var.h = imageReceiver.E();
                uq0Var.l = true;
                return uq0Var;
            }
            i10++;
        }
    }
}
