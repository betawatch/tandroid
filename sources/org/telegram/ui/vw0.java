package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vw0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ yw0 b;

    public vw0(yw0 yw0Var, String str) {
        this.b = yw0Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        yw0 yw0Var = this.b;
        long j10 = yw0Var.h;
        long j11 = yw0Var.f;
        String str = this.a;
        if (i3 == -1) {
            if (!yw0Var.n && yw0Var.r) {
                i16 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                org.telegram.messenger.hp.s1(i16).d7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i3 == 1) {
            i10 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i10).d7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.hp.s1(i11).R.f(j11);
            if (yw0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    org.telegram.messenger.qr.a0(i15).E1(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    org.telegram.messenger.us.t(i12).N(j11);
                    i13 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    org.telegram.messenger.qr.a0(i13).E1(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
            org.telegram.messenger.us.t(i14).c0(yw0Var.f, yw0Var.h, true);
            if (yw0Var.s != null) {
                lh0 lh0Var = new lh0();
                lh0Var.d = j11;
                lh0Var.b = true;
                int c2 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                lh0Var.c = c2;
                if (c2 != 0) {
                    lh0Var.a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                yw0Var.s.l(lh0Var);
            }
        }
        yw0Var.finishFragment();
    }
}
