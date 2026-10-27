package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ uv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                mx mxVar = eyVar.C0;
                if (mxVar != null && mxVar.A0) {
                    mxVar.R(false);
                    break;
                } else {
                    eyVar.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(eyVar.X.r);
                    eyVar.X.r.clearFocus();
                    eyVar.Y.b(false);
                    break;
                }
            case 1:
                ey eyVar2 = this.b;
                if (eyVar2.R0 != 10) {
                    eyVar2.k4(false);
                }
                if (!eyVar2.L || !eyVar2.f4().I()) {
                    eyVar2.F4(true, true);
                    break;
                } else {
                    eyVar2.E0.h();
                    break;
                }
                break;
            case 2:
                ey eyVar3 = this.b;
                jh.f fVar = eyVar3.y1;
                if (fVar != null) {
                    fVar.d();
                }
                eyVar3.A3();
                eyVar3.B3();
                li.w1 w1Var = eyVar3.C1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-eyVar3.v.d());
                    break;
                }
                break;
            case 3:
                this.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 4:
                this.b.U3();
                break;
            case 5:
                this.b.c5();
                break;
            case 6:
                ey.E0(this.b);
                break;
            case 7:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            case 8:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 9:
                ey eyVar4 = this.b;
                fi.v3 v3Var = eyVar4.q0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                eyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 10:
                this.b.e0[0].d.l();
                break;
            case 11:
                ey eyVar5 = this.b;
                UndoView g42 = eyVar5.g4();
                if (g42 != null) {
                    g42.l(0L, 15, null, new ev(eyVar5, 26));
                    break;
                }
                break;
            case 12:
                ey eyVar6 = this.b;
                eyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                eyVar6.c5();
                break;
            case 13:
                ey eyVar7 = this.b;
                eyVar7.e0[0].a.requestLayout();
                vw vwVar = eyVar7.G3;
                cf1 cf1Var = (vwVar == null || !(vwVar.getFragment() instanceof cf1)) ? null : (cf1) eyVar7.G3.getFragment();
                if (cf1Var != null) {
                    cf1Var.B0();
                }
                eyVar7.O3(false);
                eyVar7.a5();
                mx mxVar2 = eyVar7.C0;
                if (mxVar2 != null) {
                    mxVar2.invalidate();
                    break;
                }
                break;
            default:
                this.b.k5();
                break;
        }
    }
}
