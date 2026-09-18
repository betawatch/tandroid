package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ qv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.j6.J(this.b, false);
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
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                nf.f.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
