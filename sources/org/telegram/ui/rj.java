package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rj implements org.telegram.ui.Components.oo {
    public final /* synthetic */ zn a;

    public rj(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.oo
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.oo
    public final void n() {
        zn znVar = this.a;
        znVar.bc(true);
        org.telegram.ui.Components.xc.A(znVar, znVar.getMessagesController().isDialogMuted(znVar.T5, znVar.d()), znVar.ea).j();
    }

    @Override // org.telegram.ui.Components.oo
    public final void o() {
        zn znVar = this.a;
        if (znVar.T5 == 0 || znVar.R3 == 3) {
            return;
        }
        if (znVar.f != null) {
            znVar.getMessagesController().putUser(znVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", znVar.T5);
        if (znVar.d() != 0) {
            bundle.putLong("topic_id", znVar.d());
        }
        znVar.presentFragment(new w11(bundle, znVar.ea));
    }

    @Override // org.telegram.ui.Components.oo
    public final void r() {
        int i10;
        zn znVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.T5, znVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.T5, znVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(znVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, znVar, znVar.getResourceProvider()).j();
        }
        znVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.oo
    public final void u(int i10) {
        zn znVar = this.a;
        if (i10 != 0) {
            znVar.getNotificationsController().muteUntil(znVar.T5, znVar.d(), i10);
            if (org.telegram.ui.Components.xc.a(znVar)) {
                org.telegram.ui.Components.xc.z(znVar, 5, i10, znVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (znVar.getMessagesController().isDialogMuted(znVar.T5, znVar.d())) {
            znVar.bc(true);
        }
        if (org.telegram.ui.Components.xc.a(znVar)) {
            org.telegram.ui.Components.xc.z(znVar, 4, i10, znVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void k() {
    }
}
