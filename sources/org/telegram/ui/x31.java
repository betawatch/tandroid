package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ x31(e51 e51Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = e51Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.a) {
            case 0:
                e51 e51Var = this.b;
                di.r6 r6Var = e51Var.C0;
                r6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!r6Var.j.containsKey((Integer) obj)) {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!r6Var.q(0, arrayList, z9)) {
                    e51Var.m0();
                    e51Var.r0();
                    break;
                }
                break;
            default:
                e51 e51Var2 = this.b;
                ArrayList arrayList2 = e51Var2.v0;
                ArrayList arrayList3 = e51Var2.u0;
                int i10 = 0;
                e51Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i11);
                        int i12 = e51Var2.s0.get(ijVar.e1(), -1);
                        if (i12 >= 0 && ((b51) arrayList3.get(i12)).b() == ijVar.e1()) {
                            ((b51) arrayList3.get(i12)).b = ijVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            b51 b51Var = (b51) arrayList3.get(i10);
                            if (b51Var.b == null) {
                                e51Var2.r0 = b51Var.b();
                            } else {
                                arrayList2.add(b51Var);
                                i10++;
                            }
                        }
                    }
                    e51Var2.r0();
                    e51Var2.S.setItemAnimator(null);
                    e51Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
