package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ r81(y91 y91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = y91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                y91 y91Var = this.b;
                di.z6 z6Var = y91Var.C0;
                z6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!z6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList, z10)) {
                    y91Var.i0();
                    y91Var.n0();
                    break;
                }
                break;
            default:
                y91 y91Var2 = this.b;
                ArrayList arrayList2 = y91Var2.v0;
                ArrayList arrayList3 = y91Var2.u0;
                int i11 = 0;
                y91Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = y91Var2.s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((v91) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((v91) arrayList3.get(i13)).b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            v91 v91Var = (v91) arrayList3.get(i11);
                            if (v91Var.b == null) {
                                y91Var2.r0 = v91Var.b();
                            } else {
                                arrayList2.add(v91Var);
                                i11++;
                            }
                        }
                    }
                    y91Var2.n0();
                    y91Var2.S.setItemAnimator(null);
                    y91Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
