package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sm extends lu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ wn c;

    public sm(wn wnVar, ArrayList arrayList) {
        this.c = wnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        wn wnVar = this.c;
        if (wnVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = wnVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = wnVar.x0.getChildAt(i11);
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
                        vu0 vu0Var = new vu0();
                        vu0Var.b = iArr[0];
                        vu0Var.c = iArr[1];
                        vu0Var.d = wnVar.x0;
                        vu0Var.a = imageReceiver;
                        vu0Var.e = imageReceiver.getBitmapSafe();
                        vu0Var.h = imageReceiver.getRoundRadius(true);
                        vu0Var.j = (int) ((wnVar.s9 - wnVar.u9) - AndroidUtilities.dp(4.0f));
                        vu0Var.i = (int) (wnVar.W8(org.telegram.ui.Components.g31.c) + wnVar.v.c() + AndroidUtilities.dp(9.0f) + wnVar.Aa + wnVar.rc);
                        return vu0Var;
                    }
                }
            }
        }
        return null;
    }
}
