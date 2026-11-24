// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pt8 extends c6 {
    public final /* synthetic */ String a;
    public final /* synthetic */ st8 b;

    public pt8(st8 st8Var, String str) {
        this.b = st8Var;
        this.a = str;
    }

    @Override // c6
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        st8 st8Var = this.b;
        long j = st8Var.h;
        long j2 = st8Var.f;
        String str = this.a;
        if (i == -1) {
            if (!st8Var.n && st8Var.r) {
                i8 = ((d) st8Var).currentAccount;
                oc7.r1(i8).W3.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i == 1) {
            i2 = ((d) st8Var).currentAccount;
            SharedPreferences sharedPreferences = oc7.r1(i2).W3;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i3 = ((d) st8Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(i3).R.f(j2);
            if (st8Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j == 0) {
                    i7 = ((d) st8Var).currentAccount;
                    cf7.Y(i7).B1(j2, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j == 0) {
                    i4 = ((d) st8Var).currentAccount;
                    lo7.n(i4).N(j2);
                    i5 = ((d) st8Var).currentAccount;
                    cf7.Y(i5).B1(j2, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i6 = ((d) st8Var).currentAccount;
            lo7.n(i6).c0(st8Var.f, st8Var.h, true);
            if (st8Var.s != null) {
                zo7 zo7Var = new zo7();
                zo7Var.d = j2;
                zo7Var.b = true;
                int g = kt6.g("notify2_", str, sharedPreferences, 0);
                zo7Var.c = g;
                if (g != 0) {
                    zo7Var.a = kt6.g("notifyuntil_", str, sharedPreferences, 0);
                }
                st8Var.s.f(zo7Var);
            }
        }
        st8Var.finishFragment();
    }
}
