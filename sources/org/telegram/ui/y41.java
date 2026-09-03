package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w61 b;

    public /* synthetic */ y41(w61 w61Var, int i10) {
        this.a = i10;
        this.b = w61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w61 w61Var = this.b;
                w61Var.getClass();
                HashSet hashSet = ng.g0.a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ng.g0.b = true;
                ng.g0.e = false;
                ng.g0.g = false;
                AndroidUtilities.runOnUIThread(new y41(w61Var, 2), 0L);
                break;
            case 1:
                w61 w61Var2 = this.b;
                ArrayList arrayList = w61Var2.x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = w61Var2.y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = w61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                w61Var2.n0.E(true);
                break;
            case 2:
                this.b.R1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                w61 w61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                y41 y41Var = w61Var3.O1;
                globalInstance.removeDelayed(y41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(y41Var);
                break;
        }
    }
}
