package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ vv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                if (fyVar.N0 != 10) {
                    fyVar.c4(false);
                }
                if (!fyVar.H || !fyVar.X3().G()) {
                    fyVar.x4(true, true);
                    break;
                } else {
                    fyVar.A0.h();
                    break;
                }
            case 1:
                fy fyVar2 = this.b;
                sg.f fVar = fyVar2.u1;
                if (fVar != null) {
                    fVar.d();
                }
                fyVar2.s3();
                fyVar2.m3();
                fyVar2.t3();
                org.telegram.ui.Components.hp0 hp0Var = fyVar2.y1;
                if (hp0Var != null) {
                    hp0Var.setTranslationY(-fyVar2.v.c());
                    break;
                }
                break;
            case 2:
                this.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 3:
                this.b.M3();
                break;
            case 4:
                this.b.U4();
                break;
            case 5:
                fy.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                fy fyVar3 = this.b;
                nh.t3 t3Var = fyVar3.m0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                fyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.a0[0].d.l();
                break;
            case 9:
                fy fyVar4 = this.b;
                UndoView Y3 = fyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new ev(fyVar4, 25));
                    break;
                }
                break;
            case 10:
                fy fyVar5 = this.b;
                fyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                fyVar5.U4();
                break;
            case 11:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            default:
                this.b.a5();
                break;
        }
    }
}
