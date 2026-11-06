package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg.q1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v50(jg.q1 q1Var, String str, int i7) {
        this.a = i7;
        this.b = q1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.g.c(new v50(this.b, this.c, 1));
                break;
            default:
                jg.q1 q1Var = this.b;
                String str = this.c;
                w50 w50Var = (w50) q1Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    boolean z9 = true;
                    String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.isEmpty()) {
                        S0 = null;
                    }
                    int i7 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i7];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i10 = 0;
                    while (i10 < w50Var.n.w.size()) {
                        org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) w50Var.n.w.get(i10);
                        String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.i, d5Var.j).toLowerCase();
                        String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z9, false);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        int i11 = 0;
                        boolean z10 = false;
                        while (true) {
                            if (i11 < i7) {
                                String str2 = strArr[i11];
                                if (lowerCase2.startsWith(str2) || jg.g.A(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || jg.g.A(" ", str2, S02)))) {
                                    z10 = true;
                                }
                                if (z10) {
                                    arrayList2.add(org.telegram.messenger.g0.r0(d5Var.i, d5Var.j, str2));
                                    arrayList.add(d5Var);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        i10++;
                        z9 = true;
                    }
                    org.telegram.messenger.g0.h3(new rp(w50Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    w50Var.getClass();
                    org.telegram.messenger.g0.h3(new rp(w50Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
