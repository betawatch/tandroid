package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d51 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ w31(d51 d51Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = d51Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.a) {
            case 0:
                d51 d51Var = this.b;
                di.r6 r6Var = d51Var.C0;
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
                    d51Var.m0();
                    d51Var.r0();
                    break;
                }
                break;
            default:
                d51 d51Var2 = this.b;
                ArrayList arrayList2 = d51Var2.v0;
                ArrayList arrayList3 = d51Var2.u0;
                int i10 = 0;
                d51Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i11);
                        int i12 = d51Var2.s0.get(ijVar.e1(), -1);
                        if (i12 >= 0 && ((a51) arrayList3.get(i12)).b() == ijVar.e1()) {
                            ((a51) arrayList3.get(i12)).b = ijVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            a51 a51Var = (a51) arrayList3.get(i10);
                            if (a51Var.b == null) {
                                d51Var2.r0 = a51Var.b();
                            } else {
                                arrayList2.add(a51Var);
                                i10++;
                            }
                        }
                    }
                    d51Var2.r0();
                    d51Var2.S.setItemAnimator(null);
                    d51Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
