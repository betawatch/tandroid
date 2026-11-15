package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z41 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ t31(z41 z41Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = z41Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                z41 z41Var = this.b;
                fi.k6 k6Var = z41Var.D0;
                k6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!k6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!k6Var.q(0, arrayList, z10)) {
                    z41Var.m0();
                    z41Var.r0();
                    break;
                }
                break;
            default:
                z41 z41Var2 = this.b;
                ArrayList arrayList2 = z41Var2.w0;
                ArrayList arrayList3 = z41Var2.v0;
                int i10 = 0;
                z41Var2.A0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList4.get(i11);
                        int i12 = z41Var2.t0.get(gjVar.e1(), -1);
                        if (i12 >= 0 && ((w41) arrayList3.get(i12)).b() == gjVar.e1()) {
                            ((w41) arrayList3.get(i12)).b = gjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            w41 w41Var = (w41) arrayList3.get(i10);
                            if (w41Var.b == null) {
                                z41Var2.s0 = w41Var.b();
                            } else {
                                arrayList2.add(w41Var);
                                i10++;
                            }
                        }
                    }
                    z41Var2.r0();
                    z41Var2.T.setItemAnimator(null);
                    z41Var2.C0.f();
                    break;
                }
                break;
        }
    }
}
