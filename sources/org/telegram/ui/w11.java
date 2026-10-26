package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ b21 a;

    public w11(b21 b21Var) {
        this.a = b21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        b21 b21Var = this.a;
        boolean z10 = b21Var.I;
        SharedConfig.ProxyInfo proxyInfo = b21Var.J;
        if (i10 == -1) {
            b21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || b21Var.getParentActivity() == null) {
            return;
        }
        k2.r0 a2 = ti.a.a();
        int i11 = b21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = b21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.c = obj;
        a2.b = b21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) b21Var.a[1].getText().toString()).intValue();
        String obj2 = b21Var.v == 1 ? b21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = b21Var.v == 1 ? b21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = b21Var.v != 1 ? b21Var.a[4].getText().toString() : "";
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
        b21Var.finishFragment();
    }
}
