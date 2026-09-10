package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rk0(sk0 sk0Var, String str, int i10) {
        this.a = i10;
        this.b = sk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sk0 sk0Var = this.b;
                String str = this.c;
                sk0Var.getClass();
                AndroidUtilities.runOnUIThread(new rk0(sk0Var, str, 1));
                break;
            default:
                sk0 sk0Var2 = this.b;
                String str2 = this.c;
                fg.d2 d2Var = sk0Var2.h;
                int i10 = sk0Var2.n.s;
                d2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(sk0Var2, str2, new ArrayList(sk0Var2.n.w), 8));
                break;
        }
    }
}
