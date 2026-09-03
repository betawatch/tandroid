package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements org.telegram.ui.Components.el0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ vu a;

    public /* synthetic */ ru(vu vuVar) {
        this.a = vuVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        vu vuVar = this.a;
        zu zuVar = vuVar.l3;
        ArrayList arrayList = vuVar.c3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.d3;
            if (i14 >= uuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.p2) zuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.p2) zuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.p2) zuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                vuVar.U2 = true;
                vuVar.y1();
                vuVar.z1(true);
                return;
            }
            uu uuVar = uuVarArr[i14];
            if (uuVar.c > 0) {
                arrayList.add(Integer.valueOf(uuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.el0
    public int run() {
        vu vuVar = this.a;
        ArrayList arrayList = vuVar.Z2;
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
        vuVar.W2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
