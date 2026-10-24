package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ w11 a;

    public r11(w11 w11Var) {
        this.a = w11Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        w11 w11Var = this.a;
        boolean z10 = w11Var.I;
        SharedConfig.ProxyInfo proxyInfo = w11Var.J;
        if (i10 == -1) {
            w11Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || w11Var.getParentActivity() == null) {
            return;
        }
        k2.q0 a2 = qi.a.a();
        int i11 = w11Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = w11Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.c = obj;
        a2.b = w11Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) w11Var.a[1].getText().toString()).intValue();
        String obj2 = w11Var.v == 1 ? w11Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = w11Var.v == 1 ? w11Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = w11Var.v != 1 ? w11Var.a[4].getText().toString() : "";
        a2.f = obj4 != null ? obj4 : "";
        proxyInfo.settings = a2.b();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor edit = globalMainSettings.edit();
        if (z10) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            edit.putBoolean("proxy_enabled", true);
        } else {
            z11 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
        }
        if (z10 || SharedConfig.currentProxy == proxyInfo) {
            proxyInfo.settings.h(edit);
            ConnectionsManager.setProxySettings(z11, proxyInfo.settings);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        w11Var.finishFragment();
    }
}
