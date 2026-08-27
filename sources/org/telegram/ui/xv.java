package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ xv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gy gyVar = this.b;
                if (gyVar.N0 != 10) {
                    gyVar.c4(false);
                }
                if (!gyVar.H || !gyVar.X3().G()) {
                    gyVar.x4(true, true);
                    break;
                } else {
                    gyVar.A0.h();
                    break;
                }
            case 1:
                gy gyVar2 = this.b;
                qg.g gVar = gyVar2.u1;
                if (gVar != null) {
                    gVar.d();
                }
                gyVar2.s3();
                gyVar2.m3();
                gyVar2.t3();
                org.telegram.ui.Components.wo0 wo0Var = gyVar2.y1;
                if (wo0Var != null) {
                    wo0Var.setTranslationY(-gyVar2.v.c());
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
                gy.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                gy gyVar3 = this.b;
                lh.w3 w3Var = gyVar3.m0;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                gyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.a0[0].d.l();
                break;
            case 9:
                gy gyVar4 = this.b;
                UndoView Y3 = gyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new gv(gyVar4, 25));
                    break;
                }
                break;
            case 10:
                gy gyVar5 = this.b;
                gyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                gyVar5.U4();
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
