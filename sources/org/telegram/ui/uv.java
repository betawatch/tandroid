package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ uv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                if (dyVar.N0 != 10) {
                    dyVar.c4(false);
                }
                if (!dyVar.H || !dyVar.X3().G()) {
                    dyVar.x4(true, true);
                    break;
                } else {
                    dyVar.A0.h();
                    break;
                }
            case 1:
                dy dyVar2 = this.b;
                pg.f fVar = dyVar2.u1;
                if (fVar != null) {
                    fVar.d();
                }
                dyVar2.s3();
                dyVar2.m3();
                dyVar2.t3();
                org.telegram.ui.Components.wo0 wo0Var = dyVar2.y1;
                if (wo0Var != null) {
                    wo0Var.setTranslationY(-dyVar2.v.c());
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
                dy.E0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                dy dyVar3 = this.b;
                kh.x3 x3Var = dyVar3.m0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                dyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.a0[0].d.l();
                break;
            case 9:
                dy dyVar4 = this.b;
                UndoView Y3 = dyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new dv(dyVar4, 25));
                    break;
                }
                break;
            case 10:
                dy dyVar5 = this.b;
                dyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                dyVar5.U4();
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
