package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
