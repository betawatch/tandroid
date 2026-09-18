package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ u91(ab1 ab1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ab1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                ab1 ab1Var = this.b;
                ArrayList arrayList = ab1Var.s0;
                ArrayList arrayList2 = ab1Var.r0;
                int i10 = 0;
                ab1Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ab1Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((xa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((xa1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            xa1 xa1Var = (xa1) arrayList2.get(i10);
                            if (xa1Var.b == null) {
                                ab1Var.o0 = xa1Var.b();
                            } else {
                                arrayList.add(xa1Var);
                                i10++;
                            }
                        }
                    }
                    ab1Var.o0();
                    ab1Var.S.setItemAnimator(null);
                    ab1Var.y0.f();
                    break;
                }
                break;
            default:
                ab1 ab1Var2 = this.b;
                ai.d9 d9Var = ab1Var2.z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    ab1Var2.j0();
                    ab1Var2.o0();
                    break;
                }
                break;
        }
    }
}
