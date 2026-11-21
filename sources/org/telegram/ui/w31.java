package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ w31(c51 c51Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = c51Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                c51 c51Var = this.b;
                fi.h6 h6Var = c51Var.D0;
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
                    c51Var.m0();
                    c51Var.r0();
                    break;
                }
                break;
            default:
                c51 c51Var2 = this.b;
                ArrayList arrayList2 = c51Var2.w0;
                ArrayList arrayList3 = c51Var2.v0;
                int i10 = 0;
                c51Var2.A0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i11);
                        int i12 = c51Var2.t0.get(fjVar.e1(), -1);
                        if (i12 >= 0 && ((z41) arrayList3.get(i12)).b() == fjVar.e1()) {
                            ((z41) arrayList3.get(i12)).b = fjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            z41 z41Var = (z41) arrayList3.get(i10);
                            if (z41Var.b == null) {
                                c51Var2.s0 = z41Var.b();
                            } else {
                                arrayList2.add(z41Var);
                                i10++;
                            }
                        }
                    }
                    c51Var2.r0();
                    c51Var2.T.setItemAnimator(null);
                    c51Var2.C0.f();
                    break;
                }
                break;
        }
    }
}
