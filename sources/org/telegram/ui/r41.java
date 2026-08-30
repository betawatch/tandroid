package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q61 b;

    public /* synthetic */ r41(q61 q61Var, int i10) {
        this.a = i10;
        this.b = q61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q61 q61Var = this.b;
                q61Var.getClass();
                HashSet hashSet = mg.g0.a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                mg.g0.b = true;
                mg.g0.e = false;
                mg.g0.g = false;
                AndroidUtilities.runOnUIThread(new r41(q61Var, 2), 0L);
                break;
            case 1:
                q61 q61Var2 = this.b;
                ArrayList arrayList = q61Var2.x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = q61Var2.y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = q61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                q61Var2.n0.E(true);
                break;
            case 2:
                this.b.R1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                q61 q61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                r41 r41Var = q61Var3.O1;
                globalInstance.removeDelayed(r41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(r41Var);
                break;
        }
    }
}
