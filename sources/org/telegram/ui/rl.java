package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rl extends nq0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ an c;

    public rl(an anVar, ArrayList arrayList) {
        this.c = anVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.kv kvVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        rl rlVar = this;
        an anVar = rlVar.c;
        if (anVar.z0 == null || i7 < 0) {
            return null;
        }
        ArrayList arrayList = rlVar.a;
        if (i7 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i7);
        int childCount = anVar.z0.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = anVar.z0.getChildAt(i10);
            boolean z11 = childAt instanceof org.telegram.ui.Cells.q1;
            int[] iArr = rlVar.b;
            if (!z11 || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || (kvVar = messageObject.w2) == null) {
                c10 = 0;
                c11 = 1;
                imageReceiver = null;
            } else {
                int[] iArr2 = new int[2];
                ArrayList arrayList2 = kvVar.g;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        c10 = 0;
                        c11 = 1;
                        imageReceiver = null;
                        break;
                    }
                    org.telegram.messenger.fu fuVar = (org.telegram.messenger.fu) arrayList2.get(i11);
                    if (fuVar instanceof org.telegram.messenger.su) {
                        org.telegram.messenger.su suVar = (org.telegram.messenger.su) fuVar;
                        pageBlock = suVar.q0;
                        imageReceiver2 = suVar.X;
                    } else if (fuVar instanceof org.telegram.messenger.ev) {
                        org.telegram.messenger.ev evVar = (org.telegram.messenger.ev) fuVar;
                        TL_iv.pageBlockVideo pageblockvideo = evVar.q0;
                        imageReceiver2 = evVar.X;
                        pageBlock = pageblockvideo;
                    } else if (fuVar instanceof org.telegram.messenger.ku) {
                        ArrayList arrayList3 = ((org.telegram.messenger.ku) fuVar).X;
                        int size = arrayList3.size();
                        c10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            c11 = 1;
                            org.telegram.messenger.yt ytVar = (org.telegram.messenger.yt) obj;
                            if (ytVar.b == pageBlock2) {
                                Rect rect = fuVar.b;
                                iArr2[0] = rect.left;
                                iArr2[1] = fuVar.T + rect.top;
                                imageReceiver = ytVar.c;
                                break;
                            }
                        }
                        i11++;
                    } else {
                        c10 = 0;
                        c11 = 1;
                        if (fuVar instanceof org.telegram.messenger.wu) {
                            org.telegram.messenger.wu wuVar = (org.telegram.messenger.wu) fuVar;
                            ArrayList arrayList4 = wuVar.X;
                            int i13 = wuVar.a0;
                            if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.yt) arrayList4.get(i13)).b == pageBlock2) {
                                Rect rect2 = fuVar.b;
                                iArr2[0] = rect2.left;
                                iArr2[1] = fuVar.T + rect2.top;
                                imageReceiver = ((org.telegram.messenger.yt) arrayList4.get(i13)).c;
                                break;
                            }
                            i11++;
                        } else {
                            pageBlock = null;
                            imageReceiver2 = null;
                            if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                Rect rect3 = fuVar.b;
                                iArr2[c10] = rect3.left;
                                iArr2[c11] = fuVar.T + rect3.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            i11++;
                        }
                    }
                    c10 = 0;
                    c11 = 1;
                    if (pageBlock == pageBlock2) {
                        Rect rect32 = fuVar.b;
                        iArr2[c10] = rect32.left;
                        iArr2[c11] = fuVar.T + rect32.top;
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
                wq0 wq0Var = new wq0();
                wq0Var.b = iArr[c10];
                wq0Var.c = iArr[c11];
                wq0Var.d = anVar.z0;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = imageReceiver.E();
                wq0Var.j = (int) ((anVar.L9 - anVar.N9) - org.telegram.messenger.g0.L(4.0f));
                wq0Var.i = (int) (anVar.r9(org.telegram.ui.Components.i11.c) + anVar.w.d() + org.telegram.messenger.g0.L(9.0f) + anVar.Ua + anVar.Wc);
                return wq0Var;
            }
            i10++;
            rlVar = this;
        }
        return null;
    }
}
