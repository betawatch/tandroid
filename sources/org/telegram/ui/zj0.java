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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements jy, org.telegram.ui.ActionBar.c2, j11 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(py pyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.w.size();
        for (int i11 = 0; i11 < size; i11++) {
            lk0 lk0Var = (lk0) notificationsCustomSettingsActivity.w.get(i11);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + lk0Var.d);
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + lk0Var.d).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + lk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(lk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(lk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((lk0) notificationsCustomSettingsActivity.w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.w.clear();
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.j11
    public void u(lk0 lk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.w.add(0, lk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override // org.telegram.ui.jy
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putBoolean("exception", true);
            k11 k11Var = new k11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            k11Var.r = new zj0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(k11Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((lk0) it.next()).d == j10) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.w;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((lk0) it2.next()).d == j10) {
                    it2.remove();
                }
            }
        }
        lk0 lk0Var = new lk0();
        lk0Var.d = j10;
        lk0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        lk0Var.c = i12;
        if (notificationsCustomSettingsActivity.w == null) {
            notificationsCustomSettingsActivity.w = new ArrayList();
        }
        notificationsCustomSettingsActivity.w.add(lk0Var);
        notificationsCustomSettingsActivity.l0(true);
        return true;
    }

    @Override // org.telegram.ui.j11
    public /* synthetic */ void d0() {
    }
}
