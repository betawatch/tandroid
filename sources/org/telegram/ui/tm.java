package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tm extends mu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ xn c;

    public tm(xn xnVar, ArrayList arrayList) {
        this.c = xnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.c;
        if (xnVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.x0.getChildAt(i11);
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
                        wu0 wu0Var = new wu0();
                        wu0Var.b = iArr[0];
                        wu0Var.c = iArr[1];
                        wu0Var.d = xnVar.x0;
                        wu0Var.a = imageReceiver;
                        wu0Var.e = imageReceiver.getBitmapSafe();
                        wu0Var.h = imageReceiver.getRoundRadius(true);
                        wu0Var.j = (int) ((xnVar.s9 - xnVar.u9) - AndroidUtilities.dp(4.0f));
                        wu0Var.i = (int) (xnVar.W8(org.telegram.ui.Components.s21.c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.Aa + xnVar.rc);
                        return wu0Var;
                    }
                }
            }
        }
        return null;
    }
}
