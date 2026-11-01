package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qy0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ String a;
    public final /* synthetic */ ty0 b;

    public qy0(ty0 ty0Var, String str) {
        this.b = ty0Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ty0 ty0Var = this.b;
        long j10 = ty0Var.h;
        long j11 = ty0Var.f;
        String str = this.a;
        if (i10 == -1) {
            if (!ty0Var.n && ty0Var.r) {
                i17 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                org.telegram.messenger.wp.r1(i17).e7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i11).e7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.wp.r1(i12).Q.f(j11);
            if (ty0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    org.telegram.messenger.is.a0(i16).E1(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    org.telegram.messenger.pt.t(i13).N(j11);
                    i14 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    org.telegram.messenger.is.a0(i14).E1(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i15 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
            org.telegram.messenger.pt.t(i15).c0(ty0Var.f, ty0Var.h, true);
            if (ty0Var.s != null) {
                si0 si0Var = new si0();
                si0Var.d = j11;
                si0Var.b = true;
                int c10 = org.telegram.messenger.m5.c("notify2_", str, sharedPreferences, 0);
                si0Var.c = c10;
                if (c10 != 0) {
                    si0Var.a = org.telegram.messenger.m5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                ty0Var.s.w(si0Var);
            }
        }
        ty0Var.finishFragment();
    }
}
