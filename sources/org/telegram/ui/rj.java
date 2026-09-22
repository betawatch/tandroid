package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rj implements org.telegram.ui.Components.oo {
    public final /* synthetic */ bo a;

    public rj(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.ui.Components.oo
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.oo
    public final void n() {
        bo boVar = this.a;
        boVar.bc(true);
        org.telegram.ui.Components.vc.A(boVar, boVar.getMessagesController().isDialogMuted(boVar.T5, boVar.d()), boVar.ea).j();
    }

    @Override // org.telegram.ui.Components.oo
    public final void o() {
        bo boVar = this.a;
        if (boVar.T5 == 0 || boVar.R3 == 3) {
            return;
        }
        if (boVar.f != null) {
            boVar.getMessagesController().putUser(boVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", boVar.T5);
        if (boVar.d() != 0) {
            bundle.putLong("topic_id", boVar.d());
        }
        boVar.presentFragment(new x11(bundle, boVar.ea));
    }

    @Override // org.telegram.ui.Components.oo
    public final void r() {
        int i10;
        bo boVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(boVar.T5, boVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(boVar.T5, boVar.d()), z11).apply();
        if (org.telegram.ui.Components.vc.a(boVar)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, boVar, boVar.getResourceProvider()).j();
        }
        boVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.oo
    public final void t(int i10) {
        bo boVar = this.a;
        if (i10 != 0) {
            boVar.getNotificationsController().muteUntil(boVar.T5, boVar.d(), i10);
            if (org.telegram.ui.Components.vc.a(boVar)) {
                org.telegram.ui.Components.vc.z(boVar, 5, i10, boVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (boVar.getMessagesController().isDialogMuted(boVar.T5, boVar.d())) {
            boVar.bc(true);
        }
        if (org.telegram.ui.Components.vc.a(boVar)) {
            org.telegram.ui.Components.vc.z(boVar, 4, i10, boVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void l() {
    }
}
