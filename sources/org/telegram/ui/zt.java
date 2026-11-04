package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ zt(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.k6.K(context, false);
                break;
            case 1:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W == null) {
                    W = LaunchActivity.K1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            default:
                sf.c.t(context, org.telegram.messenger.bd.M0(2131742953, null));
                break;
        }
    }
}
