package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xj0(yj0 yj0Var, String str, int i10) {
        this.a = i10;
        this.b = yj0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                String str = this.c;
                yj0Var.getClass();
                AndroidUtilities.runOnUIThread(new xj0(yj0Var, str, 1));
                break;
            default:
                yj0 yj0Var2 = this.b;
                String str2 = this.c;
                rf.k1 k1Var = yj0Var2.h;
                int i10 = yj0Var2.n.s;
                k1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new xe0(yj0Var2, str2, new ArrayList(yj0Var2.n.w), 8));
                break;
        }
    }
}
