package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ sv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                lx lxVar = cyVar.C0;
                if (lxVar != null && lxVar.y0) {
                    lxVar.Q(false);
                    break;
                } else {
                    cyVar.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(cyVar.X.r);
                    cyVar.X.r.clearFocus();
                    cyVar.Y.b(false);
                    break;
                }
            case 1:
                cy cyVar2 = this.b;
                if (cyVar2.R0 != 10) {
                    cyVar2.a4(false);
                }
                if (!cyVar2.L || !cyVar2.V3().G()) {
                    cyVar2.v4(true, true);
                    break;
                } else {
                    cyVar2.E0.h();
                    break;
                }
            case 2:
                cy cyVar3 = this.b;
                ih.f fVar = cyVar3.y1;
                if (fVar != null) {
                    fVar.d();
                }
                cyVar3.q3();
                cyVar3.j3();
                cyVar3.r3();
                ki.y1 y1Var = cyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-cyVar3.v.d());
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
                cy.x0(this.b);
                break;
            case 7:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 8:
                cy cyVar4 = this.b;
                ei.x3 x3Var = cyVar4.q0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                cyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 9:
                this.b.e0[0].d.l();
                break;
            case 10:
                cy cyVar5 = this.b;
                UndoView W3 = cyVar5.W3();
                if (W3 != null) {
                    W3.l(0L, 15, null, new cv(cyVar5, 27));
                    break;
                }
                break;
            case 11:
                cy cyVar6 = this.b;
                cyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                cyVar6.S4();
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
