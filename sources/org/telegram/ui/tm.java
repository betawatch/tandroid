package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class tm extends ou0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ yn c;

    public tm(yn ynVar, ArrayList arrayList) {
        this.c = ynVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        yn ynVar = this.c;
        if (ynVar.v0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = ynVar.v0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ynVar.v0.getChildAt(i11);
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
                        yu0 yu0Var = new yu0();
                        yu0Var.b = iArr[0];
                        yu0Var.c = iArr[1];
                        yu0Var.d = ynVar.v0;
                        yu0Var.a = imageReceiver;
                        yu0Var.e = imageReceiver.getBitmapSafe();
                        yu0Var.h = imageReceiver.getRoundRadius(true);
                        yu0Var.j = (int) ((ynVar.q9 - ynVar.s9) - AndroidUtilities.dp(4.0f));
                        yu0Var.i = (int) (ynVar.X8(org.telegram.ui.Components.r31.c) + ynVar.v.c() + AndroidUtilities.dp(9.0f) + ynVar.ya + ynVar.pc);
                        return yu0Var;
                    }
                }
            }
        }
        return null;
    }
}
