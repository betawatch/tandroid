package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ z11 a;

    public u11(z11 z11Var) {
        this.a = z11Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        z11 z11Var = this.a;
        boolean z4 = z11Var.F;
        SharedConfig.ProxyInfo proxyInfo = z11Var.G;
        if (i10 == -1) {
            z11Var.finishFragment();
            return;
        }
        boolean z10 = true;
        if (i10 != 1 || z11Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.hj0 a2 = sf.a.a();
        int i11 = z11Var.v;
        a2.a = i11 != 0 ? i11 : 1;
        String i12 = i11 == 3 ? sf.j.i(z11Var.a[0].getText().toString()) : z11Var.a[0].getText().toString();
        if (i12 == null) {
            i12 = "";
        }
        a2.b = i12;
        a2.c = z11Var.v == 3 ? 443 : Utilities.parseInt((CharSequence) z11Var.a[1].getText().toString()).intValue();
        String obj = z11Var.v == 1 ? z11Var.a[2].getText().toString() : "";
        if (obj == null) {
            obj = "";
        }
        a2.d = obj;
        String obj2 = z11Var.v == 1 ? z11Var.a[3].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.e = obj2;
        String obj3 = z11Var.v != 1 ? z11Var.a[4].getText().toString() : "";
        a2.f = obj3 != null ? obj3 : "";
        proxyInfo.settings = new sf.a(a2);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor edit = globalMainSettings.edit();
        if (z4) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            edit.putBoolean("proxy_enabled", true);
        } else {
            z10 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
        }
        if (z4 || SharedConfig.currentProxy == proxyInfo) {
            proxyInfo.settings.f(edit);
            ConnectionsManager.setProxySettings(z10, proxyInfo.settings);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        z11Var.finishFragment();
    }
}
