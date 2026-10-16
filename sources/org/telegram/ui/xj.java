package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xj implements org.telegram.ui.Components.bp {
    public final /* synthetic */ fo a;

    public xj(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.Components.bp
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.bp
    public final void o() {
        fo foVar = this.a;
        foVar.fc(true);
        org.telegram.ui.Components.zc.A(foVar, foVar.getMessagesController().isDialogMuted(foVar.T5, foVar.d()), foVar.ea).j();
    }

    @Override // org.telegram.ui.Components.bp
    public final void p() {
        fo foVar = this.a;
        if (foVar.T5 == 0 || foVar.R3 == 3) {
            return;
        }
        if (foVar.f != null) {
            foVar.getMessagesController().putUser(foVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", foVar.T5);
        if (foVar.d() != 0) {
            bundle.putLong("topic_id", foVar.d());
        }
        foVar.presentFragment(new c21(bundle, foVar.ea));
    }

    @Override // org.telegram.ui.Components.bp
    public final void t() {
        int i10;
        fo foVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(foVar.T5, foVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(foVar.T5, foVar.d()), z11).apply();
        if (org.telegram.ui.Components.zc.a(foVar)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, foVar, foVar.getResourceProvider()).j();
        }
        foVar.Tc(false);
    }

    @Override // org.telegram.ui.Components.bp
    public final void y(int i10) {
        fo foVar = this.a;
        if (i10 != 0) {
            foVar.getNotificationsController().muteUntil(foVar.T5, foVar.d(), i10);
            if (org.telegram.ui.Components.zc.a(foVar)) {
                org.telegram.ui.Components.zc.z(foVar, 5, i10, foVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (foVar.getMessagesController().isDialogMuted(foVar.T5, foVar.d())) {
            foVar.fc(true);
        }
        if (org.telegram.ui.Components.zc.a(foVar)) {
            org.telegram.ui.Components.zc.z(foVar, 4, i10, foVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final /* synthetic */ void m() {
    }
}
