package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rl extends mq0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ an c;

    public rl(an anVar, ArrayList arrayList) {
        this.c = anVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.iv ivVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        rl rlVar = this;
        an anVar = rlVar.c;
        if (anVar.A0 == null || i7 < 0) {
            return null;
        }
        ArrayList arrayList = rlVar.a;
        if (i7 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i7);
        int childCount = anVar.A0.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = anVar.A0.getChildAt(i10);
            boolean z12 = childAt instanceof org.telegram.ui.Cells.q1;
            int[] iArr = rlVar.b;
            if (!z12 || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || (ivVar = messageObject.y2) == null) {
                c10 = 0;
                c11 = 1;
                imageReceiver = null;
            } else {
                int[] iArr2 = new int[2];
                ArrayList arrayList2 = ivVar.g;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        c10 = 0;
                        c11 = 1;
                        imageReceiver = null;
                        break;
                    }
                    org.telegram.messenger.cu cuVar = (org.telegram.messenger.cu) arrayList2.get(i11);
                    if (cuVar instanceof org.telegram.messenger.qu) {
                        org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) cuVar;
                        pageBlock = quVar.r0;
                        imageReceiver2 = quVar.Y;
                    } else if (cuVar instanceof org.telegram.messenger.cv) {
                        org.telegram.messenger.cv cvVar = (org.telegram.messenger.cv) cuVar;
                        TL_iv.pageBlockVideo pageblockvideo = cvVar.r0;
                        imageReceiver2 = cvVar.Y;
                        pageBlock = pageblockvideo;
                    } else if (cuVar instanceof org.telegram.messenger.hu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.hu) cuVar).Y;
                        int size = arrayList3.size();
                        c10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            c11 = 1;
                            org.telegram.messenger.vt vtVar = (org.telegram.messenger.vt) obj;
                            if (vtVar.b == pageBlock2) {
                                Rect rect = cuVar.b;
                                iArr2[0] = rect.left;
                                iArr2[1] = cuVar.U + rect.top;
                                imageReceiver = vtVar.c;
                                break;
                            }
                        }
                        i11++;
                    } else {
                        c10 = 0;
                        c11 = 1;
                        if (cuVar instanceof org.telegram.messenger.uu) {
                            org.telegram.messenger.uu uuVar = (org.telegram.messenger.uu) cuVar;
                            ArrayList arrayList4 = uuVar.Y;
                            int i13 = uuVar.b0;
                            if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.vt) arrayList4.get(i13)).b == pageBlock2) {
                                Rect rect2 = cuVar.b;
                                iArr2[0] = rect2.left;
                                iArr2[1] = cuVar.U + rect2.top;
                                imageReceiver = ((org.telegram.messenger.vt) arrayList4.get(i13)).c;
                                break;
                            }
                            i11++;
                        } else {
                            pageBlock = null;
                            imageReceiver2 = null;
                            if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                Rect rect3 = cuVar.b;
                                iArr2[c10] = rect3.left;
                                iArr2[c11] = cuVar.U + rect3.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            i11++;
                        }
                    }
                    c10 = 0;
                    c11 = 1;
                    if (pageBlock == pageBlock2) {
                        Rect rect32 = cuVar.b;
                        iArr2[c10] = rect32.left;
                        iArr2[c11] = cuVar.U + rect32.top;
                        imageReceiver = imageReceiver2;
                        break;
                    }
                    continue;
                    i11++;
                }
                if (imageReceiver != null) {
                    childAt.getLocationInWindow(iArr);
                    iArr[c10] = q1Var.getTextX() + iArr2[c10] + iArr[c10];
                    iArr[c11] = q1Var.getTextY() + iArr2[c11] + iArr[c11];
                }
            }
            if (imageReceiver != null) {
                uq0 uq0Var = new uq0();
                uq0Var.b = iArr[c10];
                uq0Var.c = iArr[c11];
                uq0Var.d = anVar.A0;
                uq0Var.a = imageReceiver;
                uq0Var.e = imageReceiver.p();
                uq0Var.h = imageReceiver.E();
                uq0Var.j = (int) ((anVar.O9 - anVar.Q9) - org.telegram.messenger.g0.L(4.0f));
                uq0Var.i = (int) (anVar.t9(org.telegram.ui.Components.l11.c) + anVar.w.d() + org.telegram.messenger.g0.L(9.0f) + anVar.Xa + anVar.Zc);
                return uq0Var;
            }
            i10++;
            rlVar = this;
        }
        return null;
    }
}
