package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b51 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ v31(b51 b51Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = b51Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                b51 b51Var = this.b;
                fi.h6 h6Var = b51Var.D0;
                h6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!h6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!h6Var.q(0, arrayList, z10)) {
                    b51Var.m0();
                    b51Var.r0();
                    break;
                }
                break;
            default:
                b51 b51Var2 = this.b;
                ArrayList arrayList2 = b51Var2.w0;
                ArrayList arrayList3 = b51Var2.v0;
                int i10 = 0;
                b51Var2.A0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i11);
                        int i12 = b51Var2.t0.get(fjVar.e1(), -1);
                        if (i12 >= 0 && ((y41) arrayList3.get(i12)).b() == fjVar.e1()) {
                            ((y41) arrayList3.get(i12)).b = fjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            y41 y41Var = (y41) arrayList3.get(i10);
                            if (y41Var.b == null) {
                                b51Var2.s0 = y41Var.b();
                            } else {
                                arrayList2.add(y41Var);
                                i10++;
                            }
                        }
                    }
                    b51Var2.r0();
                    b51Var2.T.setItemAnimator(null);
                    b51Var2.C0.f();
                    break;
                }
                break;
        }
    }
}
