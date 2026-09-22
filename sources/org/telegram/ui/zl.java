package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zl extends tu0 {
    public final /* synthetic */ zn a;

    public zl(zn znVar) {
        this.a = znVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        fk fkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            zn znVar = this.a;
            if (i10 < znVar.Ha.size() && (fkVar = znVar.I1) != null && fkVar.getListView() != null) {
                int childCount = znVar.I1.getListView().getChildCount();
                Object obj = znVar.Ha.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                dv0 dv0Var = new dv0();
                                dv0Var.b = iArr[0];
                                dv0Var.c = iArr[1];
                                dv0Var.d = znVar.I1.getListView();
                                dv0Var.a = imageReceiver;
                                dv0Var.e = imageReceiver.getBitmapSafe();
                                dv0Var.h = imageReceiver.getRoundRadius(true);
                                return dv0Var;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            zn znVar = this.a;
            if (i10 >= znVar.Ha.size()) {
                return;
            }
            znVar.cb((TLRPC.BotInlineResult) znVar.Ha.get(i10), z10, i11, 0L);
        }
    }
}
