package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ tv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                pf.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                pf.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                pf.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                pf.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                pf.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                pf.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                pf.d.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
