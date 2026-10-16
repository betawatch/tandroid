package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r71 b;

    public /* synthetic */ t51(r71 r71Var, int i10) {
        this.a = i10;
        this.b = r71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r71 r71Var = this.b;
                r71Var.getClass();
                HashSet hashSet = ah.x0.a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ah.x0.b = true;
                ah.x0.e = false;
                ah.x0.g = false;
                AndroidUtilities.runOnUIThread(new t51(r71Var, 2), 0L);
                break;
            case 1:
                r71 r71Var2 = this.b;
                ArrayList arrayList = r71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = r71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = r71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                r71 r71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                t51 t51Var = r71Var3.R1;
                globalInstance.removeDelayed(t51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(t51Var);
                break;
        }
    }
}
