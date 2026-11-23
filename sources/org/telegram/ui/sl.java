package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class sl extends oq0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ bn c;

    public sl(bn bnVar, ArrayList arrayList) {
        this.c = bnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.fv fvVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        sl slVar = this;
        bn bnVar = slVar.c;
        if (bnVar.A0 == null || i7 < 0) {
            return null;
        }
        ArrayList arrayList = slVar.a;
        if (i7 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i7);
        int childCount = bnVar.A0.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = bnVar.A0.getChildAt(i10);
            boolean z12 = childAt instanceof org.telegram.ui.Cells.r1;
            int[] iArr = slVar.b;
            if (!z12 || (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) == null || (fvVar = messageObject.y2) == null) {
                c10 = 0;
                c11 = 1;
                imageReceiver = null;
            } else {
                int[] iArr2 = new int[2];
                ArrayList arrayList2 = fvVar.g;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        c10 = 0;
                        c11 = 1;
                        imageReceiver = null;
                        break;
                    }
                    org.telegram.messenger.au auVar = (org.telegram.messenger.au) arrayList2.get(i11);
                    if (auVar instanceof org.telegram.messenger.nu) {
                        org.telegram.messenger.nu nuVar = (org.telegram.messenger.nu) auVar;
                        pageBlock = nuVar.r0;
                        imageReceiver2 = nuVar.Y;
                    } else if (auVar instanceof org.telegram.messenger.zu) {
                        org.telegram.messenger.zu zuVar = (org.telegram.messenger.zu) auVar;
                        TL_iv.pageBlockVideo pageblockvideo = zuVar.r0;
                        imageReceiver2 = zuVar.Y;
                        pageBlock = pageblockvideo;
                    } else if (auVar instanceof org.telegram.messenger.fu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.fu) auVar).Y;
                        int size = arrayList3.size();
                        c10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            c11 = 1;
                            org.telegram.messenger.tt ttVar = (org.telegram.messenger.tt) obj;
                            if (ttVar.b == pageBlock2) {
                                Rect rect = auVar.b;
                                iArr2[0] = rect.left;
                                iArr2[1] = auVar.U + rect.top;
                                imageReceiver = ttVar.c;
                                break;
                            }
                        }
                        i11++;
                    } else {
                        c10 = 0;
                        c11 = 1;
                        if (auVar instanceof org.telegram.messenger.ru) {
                            org.telegram.messenger.ru ruVar = (org.telegram.messenger.ru) auVar;
                            ArrayList arrayList4 = ruVar.Y;
                            int i13 = ruVar.b0;
                            if (i13 >= 0 && i13 < arrayList4.size() && ((org.telegram.messenger.tt) arrayList4.get(i13)).b == pageBlock2) {
                                Rect rect2 = auVar.b;
                                iArr2[0] = rect2.left;
                                iArr2[1] = auVar.U + rect2.top;
                                imageReceiver = ((org.telegram.messenger.tt) arrayList4.get(i13)).c;
                                break;
                            }
                            i11++;
                        } else {
                            pageBlock = null;
                            imageReceiver2 = null;
                            if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                Rect rect3 = auVar.b;
                                iArr2[c10] = rect3.left;
                                iArr2[c11] = auVar.U + rect3.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            i11++;
                        }
                    }
                    c10 = 0;
                    c11 = 1;
                    if (pageBlock == pageBlock2) {
                        Rect rect32 = auVar.b;
                        iArr2[c10] = rect32.left;
                        iArr2[c11] = auVar.U + rect32.top;
                        imageReceiver = imageReceiver2;
                        break;
                    }
                    continue;
                    i11++;
                }
                if (imageReceiver != null) {
                    childAt.getLocationInWindow(iArr);
                    iArr[c10] = r1Var.getTextX() + iArr2[c10] + iArr[c10];
                    iArr[c11] = r1Var.getTextY() + iArr2[c11] + iArr[c11];
                }
            }
            if (imageReceiver != null) {
                wq0 wq0Var = new wq0();
                wq0Var.b = iArr[c10];
                wq0Var.c = iArr[c11];
                wq0Var.d = bnVar.A0;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = imageReceiver.E();
                wq0Var.j = (int) ((bnVar.P9 - bnVar.R9) - org.telegram.messenger.g0.L(4.0f));
                wq0Var.i = (int) (bnVar.t9(org.telegram.ui.Components.w11.c) + bnVar.w.d() + org.telegram.messenger.g0.L(9.0f) + bnVar.Ya + bnVar.ad);
                return wq0Var;
            }
            i10++;
            slVar = this;
        }
        return null;
    }
}
