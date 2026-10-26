package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                jx jxVar = cyVar.C0;
                if (jxVar != null && jxVar.A0) {
                    jxVar.R(false);
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
                    cyVar2.k4(false);
                }
                if (!cyVar2.L || !cyVar2.f4().G()) {
                    cyVar2.F4(true, true);
                    break;
                } else {
                    cyVar2.E0.h();
                    break;
                }
                break;
            case 2:
                cy cyVar3 = this.b;
                jh.f fVar = cyVar3.y1;
                if (fVar != null) {
                    fVar.d();
                }
                cyVar3.A3();
                cyVar3.B3();
                li.w1 w1Var = cyVar3.C1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-cyVar3.v.d());
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
                cy.E0(this.b);
                break;
            case 7:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            case 8:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 9:
                cy cyVar4 = this.b;
                fi.v3 v3Var = cyVar4.q0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                cyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 10:
                this.b.e0[0].d.l();
                break;
            case 11:
                cy cyVar5 = this.b;
                UndoView g42 = cyVar5.g4();
                if (g42 != null) {
                    g42.l(0L, 15, null, new cv(cyVar5, 26));
                    break;
                }
                break;
            case 12:
                cy cyVar6 = this.b;
                cyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                cyVar6.c5();
                break;
            case 13:
                cy cyVar7 = this.b;
                cyVar7.e0[0].a.requestLayout();
                tw twVar = cyVar7.G3;
                af1 af1Var = (twVar == null || !(twVar.getFragment() instanceof af1)) ? null : (af1) cyVar7.G3.getFragment();
                if (af1Var != null) {
                    af1Var.B0();
                }
                cyVar7.O3(false);
                cyVar7.a5();
                jx jxVar2 = cyVar7.C0;
                if (jxVar2 != null) {
                    jxVar2.invalidate();
                    break;
                }
                break;
            default:
                this.b.k5();
                break;
        }
    }
}
