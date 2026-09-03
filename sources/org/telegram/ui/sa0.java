package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sa0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ w10 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public sa0(LaunchActivity launchActivity, w10 w10Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j10, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = w10Var;
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
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) kf.k0.i(1, launchActivity.a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.g;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.b;
        long j10 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        if (str == null || !(p2Var instanceof zn) || ((zn) p2Var).a() != j10) {
            if (p2Var instanceof zn) {
                zn znVar = (zn) p2Var;
                if (znVar.a() == j10 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(znVar.u0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    lk lkVar = znVar.V;
                    for (int i10 = 0; i10 < lkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(lkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = znVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            p2Var = new zn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(p2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.di(this, this.b, this.d, p2Var, 9), 150L);
    }
}
