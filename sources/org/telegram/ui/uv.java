package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                nx nxVar = eyVar.C0;
                if (nxVar != null && nxVar.y0) {
                    nxVar.Q(false);
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
                    eyVar2.a4(false);
                }
                if (!eyVar2.L || !eyVar2.V3().G()) {
                    eyVar2.v4(true, true);
                    break;
                } else {
                    eyVar2.E0.h();
                    break;
                }
            case 2:
                ey eyVar3 = this.b;
                ih.f fVar = eyVar3.y1;
                if (fVar != null) {
                    fVar.d();
                }
                eyVar3.q3();
                eyVar3.j3();
                eyVar3.r3();
                ki.y1 y1Var = eyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-eyVar3.v.d());
                    break;
                }
                break;
            case 3:
                this.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 4:
                this.b.K3();
                break;
            case 5:
                this.b.S4();
                break;
            case 6:
                ey.x0(this.b);
                break;
            case 7:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 8:
                ey eyVar4 = this.b;
                ei.x3 x3Var = eyVar4.q0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                eyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 9:
                this.b.e0[0].d.l();
                break;
            case 10:
                ey eyVar5 = this.b;
                UndoView W3 = eyVar5.W3();
                if (W3 != null) {
                    W3.l(0L, 15, null, new ev(eyVar5, 27));
                    break;
                }
                break;
            case 11:
                ey eyVar6 = this.b;
                eyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                eyVar6.S4();
                break;
            case 12:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            default:
                this.b.Y4();
                break;
        }
    }
}
