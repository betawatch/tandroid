package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sk0(tk0 tk0Var, String str, int i10) {
        this.a = i10;
        this.b = tk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tk0 tk0Var = this.b;
                String str = this.c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                break;
            default:
                tk0 tk0Var2 = this.b;
                String str2 = this.c;
                hg.b2 b2Var = tk0Var2.h;
                int i10 = tk0Var2.n.s;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(tk0Var2, str2, new ArrayList(tk0Var2.n.w), 8));
                break;
        }
    }
}
