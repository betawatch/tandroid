package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ v31(c51 c51Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = c51Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.a) {
            case 0:
                c51 c51Var = this.b;
                di.q6 q6Var = c51Var.C0;
                q6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!q6Var.j.containsKey((Integer) obj)) {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!q6Var.q(0, arrayList, z9)) {
                    c51Var.m0();
                    c51Var.r0();
                    break;
                }
                break;
            default:
                c51 c51Var2 = this.b;
                ArrayList arrayList2 = c51Var2.v0;
                ArrayList arrayList3 = c51Var2.u0;
                int i10 = 0;
                c51Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i11);
                        int i12 = c51Var2.s0.get(ijVar.f1(), -1);
                        if (i12 >= 0 && ((z41) arrayList3.get(i12)).b() == ijVar.f1()) {
                            ((z41) arrayList3.get(i12)).b = ijVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            z41 z41Var = (z41) arrayList3.get(i10);
                            if (z41Var.b == null) {
                                c51Var2.r0 = z41Var.b();
                            } else {
                                arrayList2.add(z41Var);
                                i10++;
                            }
                        }
                    }
                    c51Var2.r0();
                    c51Var2.S.setItemAnimator(null);
                    c51Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
