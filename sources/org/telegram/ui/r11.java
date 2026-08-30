package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ w11 a;

    public r11(w11 w11Var) {
        this.a = w11Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        boolean z4;
        w11 w11Var = this.a;
        SharedConfig.ProxyInfo proxyInfo = w11Var.H;
        if (i10 == -1) {
            w11Var.finishFragment();
            return;
        }
        if (i10 != 1 || w11Var.getParentActivity() == null) {
            return;
        }
        proxyInfo.address = w11Var.v == 2 ? WebProxyTransport.normalizeHost(w11Var.a[0].getText().toString()) : w11Var.a[0].getText().toString();
        proxyInfo.port = w11Var.v == 2 ? 443 : Utilities.parseInt((CharSequence) w11Var.a[1].getText().toString()).intValue();
        int i11 = w11Var.v;
        proxyInfo.type = i11;
        if (i11 == 0) {
            proxyInfo.secret = "";
            proxyInfo.username = w11Var.a[2].getText().toString();
            proxyInfo.password = w11Var.a[3].getText().toString();
        } else {
            proxyInfo.secret = w11Var.a[4].getText().toString();
            proxyInfo.username = "";
            proxyInfo.password = "";
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor edit = globalMainSettings.edit();
        if (w11Var.G) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            edit.putBoolean("proxy_enabled", true);
            z4 = true;
        } else {
            boolean z10 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
            z4 = z10;
        }
        if (w11Var.G || SharedConfig.currentProxy == proxyInfo) {
            edit.putString("proxy_ip", proxyInfo.address);
            edit.putString("proxy_pass", proxyInfo.password);
            edit.putString("proxy_user", proxyInfo.username);
            edit.putInt("proxy_port", proxyInfo.port);
            edit.putString("proxy_secret", proxyInfo.secret);
            edit.putInt("proxy_type", proxyInfo.type);
            ConnectionsManager.setProxySettings(z4, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, proxyInfo.type);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        w11Var.finishFragment();
    }
}
