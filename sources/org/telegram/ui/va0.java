package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class va0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ia0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity g;

    public va0(LaunchActivity launchActivity, ia0 ia0Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.g = launchActivity;
        this.a = ia0Var;
        this.b = str;
        this.c = n2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        if (str == null || !(n2Var instanceof xn) || ((xn) n2Var).a() != j3) {
            if (n2Var instanceof xn) {
                xn xnVar = (xn) n2Var;
                if (xnVar.a() == j3 && this.e == null) {
                    AndroidUtilities.shakeViewSpring(xnVar.x0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    jk jkVar = xnVar.Y;
                    for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = xnVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                }
            }
            n2Var = new xn(this.f);
            ((ActionBarLayout) launchActivity.O()).P(n2Var);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i21(this, this.b, this.d, n2Var, 4), 150L);
    }
}
