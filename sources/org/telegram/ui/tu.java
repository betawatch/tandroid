package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu implements org.telegram.ui.Components.gl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ xu a;

    public /* synthetic */ tu(xu xuVar) {
        this.a = xuVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        xu xuVar = this.a;
        bv bvVar = xuVar.o3;
        ArrayList arrayList = xuVar.f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            wu[] wuVarArr = xuVar.g3;
            if (i14 >= wuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                xuVar.X2 = true;
                xuVar.y1();
                xuVar.z1(true);
                return;
            }
            wu wuVar = wuVarArr[i14];
            if (wuVar.c > 0) {
                arrayList.add(Integer.valueOf(wuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public int run() {
        xu xuVar = this.a;
        ArrayList arrayList = xuVar.c3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((su) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        xuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
