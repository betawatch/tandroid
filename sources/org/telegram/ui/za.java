package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class za extends oq0 {
    public final /* synthetic */ lb a;

    public za(lb lbVar) {
        this.a = lbVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u0 u0Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj messageObject2;
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
                if (fjVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == fjVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.u0) && (messageObject = (u0Var = (org.telegram.ui.Cells.u0) childAt).getMessageObject()) != null) {
                if (fjVar != null) {
                    if (messageObject.e1() == fjVar.e1()) {
                        imageReceiver = u0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.p0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.p0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = u0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1];
                wq0Var.d = lbVar.w;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = imageReceiver.E();
                wq0Var.l = true;
                return wq0Var;
            }
            i10++;
        }
    }
}
