package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qk0(rk0 rk0Var, String str, int i10) {
        this.a = i10;
        this.b = rk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rk0 rk0Var = this.b;
                String str = this.c;
                rk0Var.getClass();
                AndroidUtilities.runOnUIThread(new qk0(rk0Var, str, 1));
                break;
            default:
                rk0 rk0Var2 = this.b;
                String str2 = this.c;
                gg.b2 b2Var = rk0Var2.h;
                int i10 = rk0Var2.n.s;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new of0(rk0Var2, str2, new ArrayList(rk0Var2.n.w), 8));
                break;
        }
    }
}
