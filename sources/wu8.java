// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wu8 extends d6 {
    public final /* synthetic */ String a;
    public final /* synthetic */ zu8 b;

    public wu8(zu8 zu8Var, String str) {
        this.b = zu8Var;
        this.a = str;
    }

    @Override // d6
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        zu8 zu8Var = this.b;
        long j = zu8Var.h;
        long j2 = zu8Var.f;
        String str = this.a;
        if (i == -1) {
            if (!zu8Var.n && zu8Var.r) {
                i8 = ((e) zu8Var).currentAccount;
                uc7.s1(i8).W3.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i == 1) {
            i2 = ((e) zu8Var).currentAccount;
            SharedPreferences sharedPreferences = uc7.s1(i2).W3;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i3 = ((e) zu8Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(i3).R.f(j2);
            if (zu8Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j == 0) {
                    i7 = ((e) zu8Var).currentAccount;
                    jf7.Y(i7).B1(j2, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j == 0) {
                    i4 = ((e) zu8Var).currentAccount;
                    ip7.n(i4).N(j2);
                    i5 = ((e) zu8Var).currentAccount;
                    jf7.Y(i5).B1(j2, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i6 = ((e) zu8Var).currentAccount;
            ip7.n(i6).c0(zu8Var.f, zu8Var.h, true);
            if (zu8Var.s != null) {
                vp7 vp7Var = new vp7();
                vp7Var.d = j2;
                vp7Var.b = true;
                int g = qu6.g("notify2_", str, sharedPreferences, 0);
                vp7Var.c = g;
                if (g != 0) {
                    vp7Var.a = qu6.g("notifyuntil_", str, sharedPreferences, 0);
                }
                zu8Var.s.i(vp7Var);
            }
        }
        zu8Var.finishFragment();
    }
}
