// default package

import java.util.ArrayList;
import java.util.TreeMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class yy0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pz0 b;

    public /* synthetic */ yy0(pz0 pz0Var, byte b) {
        this.a = b;
        this.b = pz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        pz0 pz0Var = this.b;
        switch (b) {
            case 0:
                pz0Var.m = null;
                if (pz0Var.c == 1) {
                    pz0Var.y();
                    break;
                }
                break;
            case 1:
                pz0Var.O = null;
                pz0Var.u();
                break;
            case 2:
                pz0Var.O = null;
                pz0Var.u();
                break;
            case 3:
                pz0Var.O = null;
                pz0Var.u();
                break;
            case 4:
                pz0 pz0Var2 = this.b;
                p44[] p44VarArr = pz0Var2.z;
                pz0Var2.n = null;
                byte b2 = pz0Var2.c;
                if (b2 != 4) {
                    TreeMap treeMap = pz0Var2.d;
                    if (b2 == 2 && pz0Var2.t) {
                        p44 p44Var = p44VarArr[pz0Var2.y ? 1 : 0];
                        if (pz0Var2.o(p44Var)) {
                            long h = pz0Var2.a.h();
                            if (pz0Var2.F) {
                                ArrayList arrayList = new ArrayList(treeMap.values());
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    fz0 fz0Var = (fz0) obj;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (nz0 nz0Var : fz0Var.k.values()) {
                                        mz0 l = pz0Var2.l(nz0Var.a);
                                        if (nz0Var.d != null && l != null && nz0Var.c > 0) {
                                            arrayList2.add(nz0Var);
                                        }
                                    }
                                    int size2 = arrayList2.size();
                                    int i3 = i;
                                    while (i3 < size2) {
                                        int i4 = i3 + 1;
                                        nz0 nz0Var2 = (nz0) arrayList2.get(i3);
                                        mz0 l2 = pz0Var2.l(nz0Var2.a);
                                        p44 p44Var2 = p44VarArr[pz0Var2.y ? 1 : 0];
                                        long j = nz0Var2.g;
                                        int i5 = size2;
                                        int i6 = nz0Var2.c;
                                        l2.getClass();
                                        int a = pz0Var2.a(p44Var2, h, j, i6, 0, fz0Var.a);
                                        if (a >= 0) {
                                            pz0Var2.g(nz0Var2);
                                            nz0Var2.c = a;
                                            pz0Var2.r(fz0Var, nz0Var2);
                                        }
                                        i3 = i4;
                                        size2 = i5;
                                        i = 0;
                                    }
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (fz0 fz0Var2 : treeMap.values()) {
                                    if (fz0Var2.c != null && fz0Var2.b > 1) {
                                        arrayList3.add(fz0Var2);
                                    }
                                }
                                int size3 = arrayList3.size();
                                while (i < size3) {
                                    Object obj2 = arrayList3.get(i);
                                    i++;
                                    fz0 fz0Var3 = (fz0) obj2;
                                    int a2 = pz0Var2.a(p44Var, h, fz0Var3.f, fz0Var3.b, 1, fz0Var3.a);
                                    if (a2 >= 0) {
                                        fz0Var3.c.cancel();
                                        fz0Var3.c = null;
                                        pz0Var2.v--;
                                        fz0Var3.b = a2;
                                        pz0Var2.p(fz0Var3);
                                    }
                                }
                            }
                        }
                    }
                    pz0Var2.B();
                    break;
                }
                break;
            case 5:
                pz0Var.l = null;
                pz0Var.w();
                break;
            case 6:
                if (pz0Var.c == 0) {
                    pz0Var.a.d("start");
                    pz0Var.y();
                    break;
                }
                break;
            default:
                ez0 ez0Var = pz0Var.a;
                if (pz0Var.c == 3) {
                    long h2 = ez0Var.h() - pz0Var.o;
                    ez0Var.d("rejoined after " + h2 + " ms");
                    if (h2 > 30000) {
                        pz0Var.e(false);
                        pz0.d(pz0Var.l);
                        pz0Var.l = null;
                        pz0Var.y();
                        break;
                    } else {
                        pz0Var.c = (byte) 2;
                        pz0Var.e = pz0Var.b();
                        pz0Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
