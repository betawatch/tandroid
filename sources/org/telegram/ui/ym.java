package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ym extends tu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ eo c;

    public ym(eo eoVar, ArrayList arrayList) {
        this.c = eoVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        eo eoVar = this.c;
        if (eoVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = eoVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = eoVar.x0.getChildAt(i11);
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
                        ev0 ev0Var = new ev0();
                        ev0Var.b = iArr[0];
                        ev0Var.c = iArr[1];
                        ev0Var.d = eoVar.x0;
                        ev0Var.a = imageReceiver;
                        ev0Var.e = imageReceiver.getBitmapSafe();
                        ev0Var.h = imageReceiver.getRoundRadius(true);
                        ev0Var.j = (int) ((eoVar.s9 - eoVar.u9) - AndroidUtilities.dp(4.0f));
                        ev0Var.i = (int) (eoVar.W8(org.telegram.ui.Components.g31.c) + eoVar.v.c() + AndroidUtilities.dp(9.0f) + eoVar.Aa + eoVar.sc);
                        return ev0Var;
                    }
                }
            }
        }
        return null;
    }
}
