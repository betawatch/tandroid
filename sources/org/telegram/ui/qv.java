package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
