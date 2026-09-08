package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ org.telegram.ui.Components.jn0 e;

    public /* synthetic */ s31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var, int i10) {
        this.a = i10;
        this.b = n2Var;
        this.c = context;
        this.d = f6Var;
        this.e = jn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.yc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            case 1:
                org.telegram.ui.Components.yc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            default:
                org.telegram.ui.Components.yc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
        }
    }
}
