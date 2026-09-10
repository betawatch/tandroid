package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class z91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ z91(fb1 fb1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = fb1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                fb1 fb1Var = this.b;
                ArrayList arrayList = fb1Var.s0;
                ArrayList arrayList2 = fb1Var.r0;
                int i10 = 0;
                fb1Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = fb1Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((cb1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((cb1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            cb1 cb1Var = (cb1) arrayList2.get(i10);
                            if (cb1Var.b == null) {
                                fb1Var.o0 = cb1Var.b();
                            } else {
                                arrayList.add(cb1Var);
                                i10++;
                            }
                        }
                    }
                    fb1Var.o0();
                    fb1Var.S.setItemAnimator(null);
                    fb1Var.y0.f();
                    break;
                }
                break;
            default:
                fb1 fb1Var2 = this.b;
                zh.a5 a5Var = fb1Var2.z0;
                a5Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!a5Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!a5Var.q(0, arrayList4, z10)) {
                    fb1Var2.j0();
                    fb1Var2.o0();
                    break;
                }
                break;
        }
    }
}
