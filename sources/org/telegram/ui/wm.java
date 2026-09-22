package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wm extends tu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ bo c;

    public wm(bo boVar, ArrayList arrayList) {
        this.c = boVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        bo boVar = this.c;
        if (boVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = boVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = boVar.x0.getChildAt(i11);
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
                        dv0 dv0Var = new dv0();
                        dv0Var.b = iArr[0];
                        dv0Var.c = iArr[1];
                        dv0Var.d = boVar.x0;
                        dv0Var.a = imageReceiver;
                        dv0Var.e = imageReceiver.getBitmapSafe();
                        dv0Var.h = imageReceiver.getRoundRadius(true);
                        dv0Var.j = (int) ((boVar.s9 - boVar.u9) - AndroidUtilities.dp(4.0f));
                        dv0Var.i = (int) (boVar.W8(org.telegram.ui.Components.t21.c) + boVar.v.c() + AndroidUtilities.dp(9.0f) + boVar.Aa + boVar.rc);
                        return dv0Var;
                    }
                }
            }
        }
        return null;
    }
}
