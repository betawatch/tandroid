package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements org.telegram.ui.Components.gl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ uu a;

    public /* synthetic */ qu(uu uuVar) {
        this.a = uuVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        uu uuVar = this.a;
        yu yuVar = uuVar.l3;
        ArrayList arrayList = uuVar.c3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            tu[] tuVarArr = uuVar.d3;
            if (i14 >= tuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                uuVar.U2 = true;
                uuVar.z1();
                uuVar.A1(true);
                return;
            }
            tu tuVar = tuVarArr[i14];
            if (tuVar.c > 0) {
                arrayList.add(Integer.valueOf(tuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public int run() {
        uu uuVar = this.a;
        ArrayList arrayList = uuVar.Z2;
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
        uuVar.W2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
