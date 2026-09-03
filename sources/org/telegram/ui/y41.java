package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x61 b;

    public /* synthetic */ y41(x61 x61Var, int i10) {
        this.a = i10;
        this.b = x61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x61 x61Var = this.b;
                x61Var.getClass();
                HashSet hashSet = mg.g0.a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                mg.g0.b = true;
                mg.g0.e = false;
                mg.g0.g = false;
                AndroidUtilities.runOnUIThread(new y41(x61Var, 2), 0L);
                break;
            case 1:
                x61 x61Var2 = this.b;
                ArrayList arrayList = x61Var2.x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = x61Var2.y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = x61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                x61Var2.n0.E(true);
                break;
            case 2:
                this.b.R1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                x61 x61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                y41 y41Var = x61Var3.O1;
                globalInstance.removeDelayed(y41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(y41Var);
                break;
        }
    }
}
