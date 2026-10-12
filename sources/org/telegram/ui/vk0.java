package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vk0(wk0 wk0Var, String str, int i10) {
        this.a = i10;
        this.b = wk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wk0 wk0Var = this.b;
                String str = this.c;
                wk0Var.getClass();
                AndroidUtilities.runOnUIThread(new vk0(wk0Var, str, 1));
                break;
            default:
                wk0 wk0Var2 = this.b;
                String str2 = this.c;
                hg.a2 a2Var = wk0Var2.h;
                int i10 = wk0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new uf0(wk0Var2, str2, new ArrayList(wk0Var2.n.w), 8));
                break;
        }
    }
}
