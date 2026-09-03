package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class um extends fu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ zn c;

    public um(zn znVar, ArrayList arrayList) {
        this.c = znVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.c;
        if (znVar.u0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.u0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.u0.getChildAt(i11);
                    boolean z11 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.b;
                    if (!z11 || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = s1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = s1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        qu0 qu0Var = new qu0();
                        qu0Var.b = iArr[0];
                        qu0Var.c = iArr[1];
                        qu0Var.d = znVar.u0;
                        qu0Var.a = imageReceiver;
                        qu0Var.e = imageReceiver.getBitmapSafe();
                        qu0Var.h = imageReceiver.getRoundRadius(true);
                        qu0Var.j = (int) ((znVar.p9 - znVar.r9) - AndroidUtilities.dp(4.0f));
                        qu0Var.i = (int) (znVar.W8(org.telegram.ui.Components.s21.c) + znVar.v.c() + AndroidUtilities.dp(9.0f) + znVar.xa + znVar.pc);
                        return qu0Var;
                    }
                }
            }
        }
        return null;
    }
}
