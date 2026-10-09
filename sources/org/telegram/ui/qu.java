package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ uu a;

    public /* synthetic */ qu(uu uuVar) {
        this.a = uuVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        uu uuVar = this.a;
        yu yuVar = uuVar.m3;
        ArrayList arrayList = uuVar.d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            tu[] tuVarArr = uuVar.e3;
            if (i14 >= tuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                uuVar.V2 = true;
                uuVar.A1();
                uuVar.B1(true);
                return;
            }
            tu tuVar = tuVarArr[i14];
            if (tuVar.c > 0) {
                arrayList.add(Integer.valueOf(tuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public int run() {
        uu uuVar = this.a;
        ArrayList arrayList = uuVar.a3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((pu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        uuVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
