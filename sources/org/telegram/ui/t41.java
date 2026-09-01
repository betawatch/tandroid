package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r61 b;

    public /* synthetic */ t41(r61 r61Var, int i10) {
        this.a = i10;
        this.b = r61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r61 r61Var = this.b;
                r61Var.getClass();
                HashSet hashSet = ng.g0.a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ng.g0.b = true;
                ng.g0.e = false;
                ng.g0.g = false;
                AndroidUtilities.runOnUIThread(new t41(r61Var, 2), 0L);
                break;
            case 1:
                r61 r61Var2 = this.b;
                ArrayList arrayList = r61Var2.x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = r61Var2.y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = r61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r61Var2.n0.E(true);
                break;
            case 2:
                this.b.R1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                r61 r61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                t41 t41Var = r61Var3.O1;
                globalInstance.removeDelayed(t41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(t41Var);
                break;
        }
    }
}
