package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ve b;
    public final /* synthetic */ String c;

    public /* synthetic */ u60(org.telegram.messenger.ve veVar, String str, int i10) {
        this.a = i10;
        this.b = veVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.g.c(new u60(this.b, this.c, 1));
                break;
            default:
                org.telegram.messenger.ve veVar = this.b;
                String str = this.c;
                v60 v60Var = (v60) veVar.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    boolean z10 = true;
                    String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R0) || R0.isEmpty()) {
                        R0 = null;
                    }
                    int i10 = (R0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (R0 != null) {
                        strArr[1] = R0;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i11 = 0;
                    while (i11 < v60Var.n.w.size()) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) v60Var.n.w.get(i11);
                        String lowerCase2 = org.telegram.messenger.i5.m(0, f5Var.i, f5Var.j).toLowerCase();
                        String R02 = org.telegram.messenger.cd.D0().R0(lowerCase2, z10, false);
                        if (lowerCase2.equals(R02)) {
                            R02 = null;
                        }
                        int i12 = 0;
                        boolean z11 = false;
                        while (true) {
                            if (i12 < i10) {
                                String str2 = strArr[i12];
                                if (lowerCase2.startsWith(str2) || sc.e.y(" ", str2, lowerCase2) || (R02 != null && (R02.startsWith(str2) || sc.e.y(" ", str2, R02)))) {
                                    z11 = true;
                                }
                                if (z11) {
                                    arrayList2.add(org.telegram.messenger.i0.r0(f5Var.i, f5Var.j, str2));
                                    arrayList.add(f5Var);
                                } else {
                                    i12++;
                                }
                            }
                        }
                        i11++;
                        z10 = true;
                    }
                    org.telegram.messenger.i0.g3(new qq(v60Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    v60Var.getClass();
                    org.telegram.messenger.i0.g3(new qq(v60Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
