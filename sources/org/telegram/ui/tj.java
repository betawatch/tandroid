package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tj implements org.telegram.ui.Components.to {
    public final /* synthetic */ eo a;

    public tj(eo eoVar) {
        this.a = eoVar;
    }

    @Override // org.telegram.ui.Components.to
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.to
    public final void n() {
        eo eoVar = this.a;
        eoVar.bc(true);
        org.telegram.ui.Components.wc.A(eoVar, eoVar.getMessagesController().isDialogMuted(eoVar.T5, eoVar.d()), eoVar.ea).j();
    }

    @Override // org.telegram.ui.Components.to
    public final void o() {
        eo eoVar = this.a;
        if (eoVar.T5 == 0 || eoVar.R3 == 3) {
            return;
        }
        if (eoVar.f != null) {
            eoVar.getMessagesController().putUser(eoVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", eoVar.T5);
        if (eoVar.d() != 0) {
            bundle.putLong("topic_id", eoVar.d());
        }
        eoVar.presentFragment(new c21(bundle, eoVar.ea));
    }

    @Override // org.telegram.ui.Components.to
    public final void r() {
        int i10;
        eo eoVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(eoVar.T5, eoVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(eoVar.T5, eoVar.d()), z11).apply();
        if (org.telegram.ui.Components.wc.a(eoVar)) {
            org.telegram.ui.Components.wc.S(z10 ? 1 : 0, eoVar, eoVar.getResourceProvider()).j();
        }
        eoVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.to
    public final void t(int i10) {
        eo eoVar = this.a;
        if (i10 != 0) {
            eoVar.getNotificationsController().muteUntil(eoVar.T5, eoVar.d(), i10);
            if (org.telegram.ui.Components.wc.a(eoVar)) {
                org.telegram.ui.Components.wc.z(eoVar, 5, i10, eoVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (eoVar.getMessagesController().isDialogMuted(eoVar.T5, eoVar.d())) {
            eoVar.bc(true);
        }
        if (org.telegram.ui.Components.wc.a(eoVar)) {
            org.telegram.ui.Components.wc.z(eoVar, 4, i10, eoVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.to
    public final /* synthetic */ void l() {
    }
}
