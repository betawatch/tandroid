package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ua0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ m80 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public ua0(LaunchActivity launchActivity, m80 m80Var, String str, org.telegram.ui.ActionBar.m2 m2Var, long j3, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = m80Var;
        this.b = str;
        this.c = m2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.m2) hg.c.g(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z10) {
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
        long j3 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        if (str == null || !(m2Var instanceof wn) || ((wn) m2Var).a() != j3) {
            if (m2Var instanceof wn) {
                wn wnVar = (wn) m2Var;
                if (wnVar.a() == j3 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(wnVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    jk jkVar = wnVar.Y;
                    for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = wnVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            m2Var = new wn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(m2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w21(this, this.b, this.d, m2Var, 4), 150L);
    }
}
