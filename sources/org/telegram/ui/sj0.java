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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements wx, org.telegram.ui.ActionBar.b2, r01 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.w.size();
        for (int i10 = 0; i10 < size; i10++) {
            ek0 ek0Var = (ek0) notificationsCustomSettingsActivity.w.get(i10);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + ek0Var.d);
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + ek0Var.d).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + ek0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(ek0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(ek0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.w.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((ek0) notificationsCustomSettingsActivity.w.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.w.clear();
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.k0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.r01
    public void g(ek0 ek0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.w.add(0, ek0Var);
        notificationsCustomSettingsActivity.k0(true);
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        int i11 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putBoolean("exception", true);
            s01 s01Var = new s01(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            s01Var.r = new sj0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(s01Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((ek0) it.next()).d == j10) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.w;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((ek0) it2.next()).d == j10) {
                    it2.remove();
                }
            }
        }
        ek0 ek0Var = new ek0();
        ek0Var.d = j10;
        ek0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ek0Var.c = i11;
        if (notificationsCustomSettingsActivity.w == null) {
            notificationsCustomSettingsActivity.w = new ArrayList();
        }
        notificationsCustomSettingsActivity.w.add(ek0Var);
        notificationsCustomSettingsActivity.k0(true);
        return true;
    }

    @Override // org.telegram.ui.r01
    public /* synthetic */ void E() {
    }
}
