package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class um extends tu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ zn c;

    public um(zn znVar, ArrayList arrayList) {
        this.c = znVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.c;
        if (znVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = u1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = u1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        dv0 dv0Var = new dv0();
                        dv0Var.b = iArr[0];
                        dv0Var.c = iArr[1];
                        dv0Var.d = znVar.x0;
                        dv0Var.a = imageReceiver;
                        dv0Var.e = imageReceiver.getBitmapSafe();
                        dv0Var.h = imageReceiver.getRoundRadius(true);
                        dv0Var.j = (int) ((znVar.s9 - znVar.u9) - AndroidUtilities.dp(4.0f));
                        dv0Var.i = (int) (znVar.W8(org.telegram.ui.Components.j31.c) + znVar.v.c() + AndroidUtilities.dp(9.0f) + znVar.Aa + znVar.rc);
                        return dv0Var;
                    }
                }
            }
        }
        return null;
    }
}
