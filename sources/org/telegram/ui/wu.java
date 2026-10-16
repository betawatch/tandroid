package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ av a;

    public /* synthetic */ wu(av avVar) {
        this.a = avVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        av avVar = this.a;
        ev evVar = avVar.m3;
        ArrayList arrayList = avVar.d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            zu[] zuVarArr = avVar.e3;
            if (i14 >= zuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                avVar.V2 = true;
                avVar.A1();
                avVar.B1(true);
                return;
            }
            zu zuVar = zuVarArr[i14];
            if (zuVar.c > 0) {
                arrayList.add(Integer.valueOf(zuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        av avVar = this.a;
        ArrayList arrayList = avVar.a3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((vu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        avVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
