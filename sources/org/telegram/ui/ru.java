package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ vu a;

    public /* synthetic */ ru(vu vuVar) {
        this.a = vuVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        vu vuVar = this.a;
        zu zuVar = vuVar.o3;
        ArrayList arrayList = vuVar.f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.g3;
            if (i14 >= uuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                vuVar.X2 = true;
                vuVar.z1();
                vuVar.A1(true);
                return;
            }
            uu uuVar = uuVarArr[i14];
            if (uuVar.c > 0) {
                arrayList.add(Integer.valueOf(uuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        vu vuVar = this.a;
        ArrayList arrayList = vuVar.c3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((qu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        vuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
