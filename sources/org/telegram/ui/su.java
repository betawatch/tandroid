package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ wu a;

    public /* synthetic */ su(wu wuVar) {
        this.a = wuVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        wu wuVar = this.a;
        av avVar = wuVar.o3;
        ArrayList arrayList = wuVar.f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            vu[] vuVarArr = wuVar.g3;
            if (i14 >= vuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) avVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) avVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) avVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                wuVar.X2 = true;
                wuVar.y1();
                wuVar.z1(true);
                return;
            }
            vu vuVar = vuVarArr[i14];
            if (vuVar.c > 0) {
                arrayList.add(Integer.valueOf(vuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        wu wuVar = this.a;
        ArrayList arrayList = wuVar.c3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((ru) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        wuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
