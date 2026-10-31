package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ry0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ String a;
    public final /* synthetic */ uy0 b;

    public ry0(uy0 uy0Var, String str) {
        this.b = uy0Var;
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
        uy0 uy0Var = this.b;
        long j10 = uy0Var.h;
        long j11 = uy0Var.f;
        String str = this.a;
        if (i10 == -1) {
            if (!uy0Var.n && uy0Var.r) {
                i17 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                org.telegram.messenger.vp.r1(i17).e7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i11).e7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.vp.r1(i12).Q.f(j11);
            if (uy0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    org.telegram.messenger.hs.a0(i16).E1(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    org.telegram.messenger.ot.t(i13).N(j11);
                    i14 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    org.telegram.messenger.hs.a0(i14).E1(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i15 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
            org.telegram.messenger.ot.t(i15).c0(uy0Var.f, uy0Var.h, true);
            if (uy0Var.s != null) {
                ui0 ui0Var = new ui0();
                ui0Var.d = j11;
                ui0Var.b = true;
                int c10 = org.telegram.messenger.m5.c("notify2_", str, sharedPreferences, 0);
                ui0Var.c = c10;
                if (c10 != 0) {
                    ui0Var.a = org.telegram.messenger.m5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                uy0Var.s.w(ui0Var);
            }
        }
        uy0Var.finishFragment();
    }
}
