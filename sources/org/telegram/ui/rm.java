package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rm extends iu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ wn c;

    public rm(wn wnVar, ArrayList arrayList) {
        this.c = wnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
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
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
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
                        su0 su0Var = new su0();
                        su0Var.b = iArr[0];
                        su0Var.c = iArr[1];
                        su0Var.d = wnVar.x0;
                        su0Var.a = imageReceiver;
                        su0Var.e = imageReceiver.getBitmapSafe();
                        su0Var.h = imageReceiver.getRoundRadius(true);
                        su0Var.j = (int) ((wnVar.I9 - wnVar.K9) - AndroidUtilities.dp(4.0f));
                        su0Var.i = (int) (wnVar.j9(org.telegram.ui.Components.b41.c) + wnVar.v.d() + AndroidUtilities.dp(9.0f) + wnVar.Ra + wnVar.Tc);
                        return su0Var;
                    }
                }
            }
        }
        return null;
    }
}
