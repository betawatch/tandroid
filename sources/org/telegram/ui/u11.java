package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ x11 b;

    public u11(x11 x11Var, String str) {
        this.b = x11Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        x11 x11Var = this.b;
        long j3 = x11Var.f;
        long j10 = x11Var.e;
        String str = this.a;
        if (i10 == -1) {
            if (!x11Var.h && x11Var.n) {
                i17 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                MessagesController.getNotificationsSettings(i17).edit().putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit = notificationsSettings.edit();
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, true);
            i12 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j10);
            if (x11Var.n) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0);
                if (j3 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 2);
                if (j3 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j10);
                    i14 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i15 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j10, j3);
            if (x11Var.r != null) {
                tk0 tk0Var = new tk0();
                tk0Var.d = j10;
                tk0Var.b = true;
                int c10 = org.telegram.messenger.y0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, str, notificationsSettings, 0);
                tk0Var.c = c10;
                if (c10 != 0) {
                    tk0Var.a = org.telegram.messenger.y0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, str, notificationsSettings, 0);
                }
                x11Var.r.v(tk0Var);
            }
        }
        x11Var.finishFragment();
    }
}
