package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sj0 implements org.telegram.ui.Components.io {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bk0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, bk0 bk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z10;
        this.c = bk0Var;
        this.d = z11;
        this.e = i10;
        this.f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.w;
        bk0 bk0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(bk0Var)) >= 0) {
            notificationsCustomSettingsActivity.w.remove(indexOf);
            notificationsCustomSettingsActivity.x.remove(Long.valueOf(bk0Var.d));
        }
        arrayList2.remove(bk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        lVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        lVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.l lVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder(NotificationsSettingsFacade.PROPERTY_CUSTOM);
        bk0 bk0Var = this.c;
        sb2.append(bk0Var.d);
        bk0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + bk0Var.d, 0);
        bk0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + bk0Var.d, -1);
            if (i11 != -1) {
                bk0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.w.add(bk0Var);
            notificationsCustomSettingsActivity.x.put(Long.valueOf(bk0Var.d), bk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().m(this.e);
        }
        lVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        lVar.h(true);
    }

    @Override // org.telegram.ui.Components.io
    public final void k() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.tc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.io
    public final void l() {
        long j10 = this.a;
        if (j10 != 0) {
            t01 t01Var = new t01(j7.l1.g(j10, "dialog_id"), null);
            t01Var.r = new h(this, 28);
            this.h.presentFragment(t01Var);
        }
    }

    @Override // org.telegram.ui.Components.io
    public final void u() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.tc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.tc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.io
    public final void w(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0)) {
                k();
            }
            if (org.telegram.ui.Components.tc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.tc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.a, 0, i10);
            if (org.telegram.ui.Components.tc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.tc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.io
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.io
    public final /* synthetic */ void j() {
    }
}
