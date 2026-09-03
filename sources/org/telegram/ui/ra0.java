package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ra0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ z10 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public ra0(LaunchActivity launchActivity, z10 z10Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = z10Var;
        this.b = str;
        this.c = p2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) l.d.i(1, launchActivity.a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        LaunchActivity launchActivity = this.g;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.b;
        long j10 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        if (str == null || !(p2Var instanceof xn) || ((xn) p2Var).a() != j10) {
            if (p2Var instanceof xn) {
                xn xnVar = (xn) p2Var;
                if (xnVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(xnVar.u0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    jk jkVar = xnVar.V;
                    for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = xnVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            p2Var = new xn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(p2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.di(this, this.b, this.d, p2Var, 9), 150L);
    }
}
