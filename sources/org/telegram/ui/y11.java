package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ d21 a;

    public y11(d21 d21Var) {
        this.a = d21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        d21 d21Var = this.a;
        boolean z10 = d21Var.I;
        SharedConfig.ProxyInfo proxyInfo = d21Var.J;
        if (i10 == -1) {
            d21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || d21Var.getParentActivity() == null) {
            return;
        }
        k2.r0 a2 = ti.a.a();
        int i11 = d21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = d21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.c = obj;
        a2.b = d21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) d21Var.a[1].getText().toString()).intValue();
        String obj2 = d21Var.v == 1 ? d21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = d21Var.v == 1 ? d21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = d21Var.v != 1 ? d21Var.a[4].getText().toString() : "";
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
        d21Var.finishFragment();
    }
}
