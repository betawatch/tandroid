package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xm extends su0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ co c;

    public xm(co coVar, ArrayList arrayList) {
        this.c = coVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        co coVar = this.c;
        if (coVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = coVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = coVar.x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = t1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = t1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        cv0 cv0Var = new cv0();
                        cv0Var.b = iArr[0];
                        cv0Var.c = iArr[1];
                        cv0Var.d = coVar.x0;
                        cv0Var.a = imageReceiver;
                        cv0Var.e = imageReceiver.getBitmapSafe();
                        cv0Var.h = imageReceiver.getRoundRadius(true);
                        cv0Var.j = (int) ((coVar.s9 - coVar.u9) - AndroidUtilities.dp(4.0f));
                        cv0Var.i = (int) (coVar.W8(org.telegram.ui.Components.s21.c) + coVar.v.c() + AndroidUtilities.dp(9.0f) + coVar.Aa + coVar.sc);
                        return cv0Var;
                    }
                }
            }
        }
        return null;
    }
}
