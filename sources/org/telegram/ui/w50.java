package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg.q1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w50(jg.q1 q1Var, String str, int i7) {
        this.a = i7;
        this.b = q1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.g.c(new w50(this.b, this.c, 1));
                break;
            default:
                jg.q1 q1Var = this.b;
                String str = this.c;
                x50 x50Var = (x50) q1Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    boolean z10 = true;
                    String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
                    if (lowerCase.equals(T0) || T0.isEmpty()) {
                        T0 = null;
                    }
                    int i7 = (T0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i7];
                    strArr[0] = lowerCase;
                    if (T0 != null) {
                        strArr[1] = T0;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i10 = 0;
                    while (i10 < x50Var.n.w.size()) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) x50Var.n.w.get(i10);
                        String lowerCase2 = org.telegram.messenger.i5.m(0, f5Var.i, f5Var.j).toLowerCase();
                        String T02 = org.telegram.messenger.hd.E0().T0(lowerCase2, z10, false);
                        if (lowerCase2.equals(T02)) {
                            T02 = null;
                        }
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            if (i11 < i7) {
                                String str2 = strArr[i11];
                                if (lowerCase2.startsWith(str2) || i5.c.B(" ", str2, lowerCase2) || (T02 != null && (T02.startsWith(str2) || i5.c.B(" ", str2, T02)))) {
                                    z11 = true;
                                }
                                if (z11) {
                                    arrayList2.add(org.telegram.messenger.g0.r0(f5Var.i, f5Var.j, str2));
                                    arrayList.add(f5Var);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        i10++;
                        z10 = true;
                    }
                    org.telegram.messenger.g0.g3(new up(x50Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    x50Var.getClass();
                    org.telegram.messenger.g0.g3(new up(x50Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
