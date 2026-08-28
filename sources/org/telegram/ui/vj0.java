package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vj0 implements org.telegram.ui.Components.eo {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ek0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, ek0 ek0Var, boolean z11, int i9, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z10;
        this.c = ek0Var;
        this.d = z11;
        this.e = i9;
        this.f = arrayList;
    }

    @Override // org.telegram.ui.Components.eo
    public final void A(int i9) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i9 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0)) {
                p();
            }
            if (org.telegram.ui.Components.oc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.oc.z(notificationsCustomSettingsActivity, 4, i9, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.a, 0, i9);
            if (org.telegram.ui.Components.oc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.oc.z(notificationsCustomSettingsActivity, 5, i9, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.w;
        ek0 ek0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(ek0Var)) >= 0) {
            notificationsCustomSettingsActivity.w.remove(indexOf);
            notificationsCustomSettingsActivity.x.remove(Long.valueOf(ek0Var.d));
        }
        arrayList2.remove(ek0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.w) {
            notificationsCustomSettingsActivity.k0(true);
            notificationsCustomSettingsActivity.c0();
        } else {
            notificationsCustomSettingsActivity.k0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder(NotificationsSettingsFacade.PROPERTY_CUSTOM);
        ek0 ek0Var = this.c;
        sb2.append(ek0Var.d);
        ek0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i9 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + ek0Var.d, 0);
        ek0Var.c = i9;
        if (i9 != 0) {
            int i10 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + ek0Var.d, -1);
            if (i10 != -1) {
                ek0Var.a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.w.add(ek0Var);
            notificationsCustomSettingsActivity.x.put(Long.valueOf(ek0Var.d), ek0Var);
            notificationsCustomSettingsActivity.k0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override // org.telegram.ui.Components.eo
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.oc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.eo
    public final void s() {
        long j10 = this.a;
        if (j10 != 0) {
            s01 s01Var = new s01(e2.c.g(j10, "dialog_id"), null);
            s01Var.r = new g(this, 28);
            this.h.presentFragment(s01Var);
        }
    }

    @Override // org.telegram.ui.Components.eo
    public final void w() {
        int i9;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i9 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.oc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.oc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.eo
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.eo
    public final /* synthetic */ void o() {
    }
}
