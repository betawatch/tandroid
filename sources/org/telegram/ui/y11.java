package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ d21 a;

    public y11(d21 d21Var) {
        this.a = d21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        d21 d21Var = this.a;
        boolean z4 = d21Var.F;
        SharedConfig.ProxyInfo proxyInfo = d21Var.G;
        if (i10 == -1) {
            d21Var.finishFragment();
            return;
        }
        boolean z10 = true;
        if (i10 != 1 || d21Var.getParentActivity() == null) {
            return;
        }
        rf.a a2 = rf.b.a();
        int i11 = d21Var.v;
        a2.a = i11 != 0 ? i11 : 1;
        String i12 = i11 == 3 ? rf.j.i(d21Var.a[0].getText().toString()) : d21Var.a[0].getText().toString();
        if (i12 == null) {
            i12 = "";
        }
        a2.b = i12;
        a2.c = d21Var.v == 3 ? 443 : Utilities.parseInt((CharSequence) d21Var.a[1].getText().toString()).intValue();
        String obj = d21Var.v == 1 ? d21Var.a[2].getText().toString() : "";
        if (obj == null) {
            obj = "";
        }
        a2.d = obj;
        String obj2 = d21Var.v == 1 ? d21Var.a[3].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.e = obj2;
        String obj3 = d21Var.v != 1 ? d21Var.a[4].getText().toString() : "";
        a2.f = obj3 != null ? obj3 : "";
        proxyInfo.settings = new rf.b(a2);
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
        d21Var.finishFragment();
    }
}
