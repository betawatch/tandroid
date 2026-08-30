package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sm extends yt0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ xn c;

    public sm(xn xnVar, ArrayList arrayList) {
        this.c = xnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.c;
        if (xnVar.u0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.u0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.u0.getChildAt(i11);
                    boolean z11 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.b;
                    if (!z11 || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
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
                        ju0 ju0Var = new ju0();
                        ju0Var.b = iArr[0];
                        ju0Var.c = iArr[1];
                        ju0Var.d = xnVar.u0;
                        ju0Var.a = imageReceiver;
                        ju0Var.e = imageReceiver.getBitmapSafe();
                        ju0Var.h = imageReceiver.getRoundRadius(true);
                        ju0Var.j = (int) ((xnVar.p9 - xnVar.r9) - AndroidUtilities.dp(4.0f));
                        ju0Var.i = (int) (xnVar.W8(org.telegram.ui.Components.s21.c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.xa + xnVar.pc);
                        return ju0Var;
                    }
                }
            }
        }
        return null;
    }
}
