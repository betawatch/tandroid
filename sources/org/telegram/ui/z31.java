package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x51 b;

    public /* synthetic */ z31(x51 x51Var, int i10) {
        this.a = i10;
        this.b = x51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x51 x51Var = this.b;
                x51Var.getClass();
                HashSet hashSet = ah.x0.a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ah.x0.b = true;
                ah.x0.e = false;
                ah.x0.g = false;
                AndroidUtilities.runOnUIThread(new z31(x51Var, 2), 0L);
                break;
            case 1:
                x51 x51Var2 = this.b;
                ArrayList arrayList = x51Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = x51Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = x51Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                x51Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                x51 x51Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                z31 z31Var = x51Var3.R1;
                globalInstance.removeDelayed(z31Var);
                NotificationCenter.getGlobalInstance().doOnIdle(z31Var);
                break;
        }
    }
}
