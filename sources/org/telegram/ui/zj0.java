package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ zj0(ak0 ak0Var, String str, int i10) {
        this.a = i10;
        this.b = ak0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ak0 ak0Var = this.b;
                String str = this.c;
                ak0Var.getClass();
                AndroidUtilities.runOnUIThread(new zj0(ak0Var, str, 1));
                break;
            default:
                ak0 ak0Var2 = this.b;
                String str2 = this.c;
                hg.a2 a2Var = ak0Var2.h;
                int i10 = ak0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ve0(ak0Var2, str2, new ArrayList(ak0Var2.n.w), 9));
                break;
        }
    }
}
