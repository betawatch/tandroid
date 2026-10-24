package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements xx, org.telegram.ui.ActionBar.z1, c11 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.w.size();
        for (int i11 = 0; i11 < size; i11++) {
            ik0 ik0Var = (ik0) notificationsCustomSettingsActivity.w.get(i11);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + ik0Var.d);
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + ik0Var.d).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + ik0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(ik0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(ik0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((ik0) notificationsCustomSettingsActivity.w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.w.clear();
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.c11
    public void r(ik0 ik0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.w.add(0, ik0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putBoolean("exception", true);
            d11 d11Var = new d11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            d11Var.r = new wj0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(d11Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((ik0) it.next()).d == j10) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.w;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((ik0) it2.next()).d == j10) {
                    it2.remove();
                }
            }
        }
        ik0 ik0Var = new ik0();
        ik0Var.d = j10;
        ik0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ik0Var.c = i12;
        if (notificationsCustomSettingsActivity.w == null) {
            notificationsCustomSettingsActivity.w = new ArrayList();
        }
        notificationsCustomSettingsActivity.w.add(ik0Var);
        notificationsCustomSettingsActivity.l0(true);
        return true;
    }

    @Override // org.telegram.ui.c11
    public /* synthetic */ void O() {
    }
}
