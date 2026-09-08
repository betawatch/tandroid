package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class rj implements org.telegram.ui.Components.no {
    public final /* synthetic */ co a;

    public rj(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.Components.no
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.no
    public final void n() {
        co coVar = this.a;
        coVar.bc(true);
        org.telegram.ui.Components.yc.A(coVar, coVar.getMessagesController().isDialogMuted(coVar.T5, coVar.d()), coVar.ea).j();
    }

    @Override // org.telegram.ui.Components.no
    public final void p() {
        co coVar = this.a;
        if (coVar.T5 == 0 || coVar.R3 == 3) {
            return;
        }
        if (coVar.f != null) {
            coVar.getMessagesController().putUser(coVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", coVar.T5);
        if (coVar.d() != 0) {
            bundle.putLong("topic_id", coVar.d());
        }
        coVar.presentFragment(new y11(bundle, coVar.ea));
    }

    @Override // org.telegram.ui.Components.no
    public final void s() {
        int i10;
        co coVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(coVar.T5, coVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(coVar.T5, coVar.d()), z11).apply();
        if (org.telegram.ui.Components.yc.a(coVar)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, coVar, coVar.getResourceProvider()).j();
        }
        coVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.no
    public final void x(int i10) {
        co coVar = this.a;
        if (i10 != 0) {
            coVar.getNotificationsController().muteUntil(coVar.T5, coVar.d(), i10);
            if (org.telegram.ui.Components.yc.a(coVar)) {
                org.telegram.ui.Components.yc.z(coVar, 5, i10, coVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (coVar.getMessagesController().isDialogMuted(coVar.T5, coVar.d())) {
            coVar.bc(true);
        }
        if (org.telegram.ui.Components.yc.a(coVar)) {
            org.telegram.ui.Components.yc.z(coVar, 4, i10, coVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public final /* synthetic */ void m() {
    }
}
