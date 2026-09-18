package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ org.telegram.ui.Components.ny e;

    public /* synthetic */ r31(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ny nyVar, int i10) {
        this.a = i10;
        this.b = o2Var;
        this.c = context;
        this.d = f6Var;
        this.e = nyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.vc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            case 1:
                org.telegram.ui.Components.vc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            default:
                org.telegram.ui.Components.vc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
        }
    }
}
