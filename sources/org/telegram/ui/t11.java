package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProxyListActivity b;

    public t11(ProxyListActivity proxyListActivity, Context context) {
        this.b = proxyListActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ProxyListActivity proxyListActivity = this.b;
        ArrayList arrayList = proxyListActivity.E;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                proxyListActivity.finishFragment();
                return;
            } else {
                proxyListActivity.a.F();
                return;
            }
        }
        int i11 = 0;
        if (i10 == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.a.Q = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(this, 14));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                return;
            }
            return;
        }
        if (i10 != 1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
            if (sb.length() > 0) {
                sb.append("\n\n");
            }
            sf.b bVar = proxyInfo.settings;
            String str = bVar.f;
            String str2 = bVar.e;
            String str3 = bVar.d;
            int i12 = bVar.a;
            int c3 = m1.j.c(i12);
            StringBuilder sb2 = c3 != 1 ? c3 != 2 ? new StringBuilder("https://t.me/socks?") : new StringBuilder("https://t.me/webproxy?") : new StringBuilder("https://t.me/proxy?");
            try {
                sb2.append("server=");
                sb2.append(URLEncoder.encode(bVar.b, "UTF-8"));
                if (i12 != 3) {
                    sb2.append("&port=");
                    sb2.append(bVar.c);
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append("&user=");
                    sb2.append(URLEncoder.encode(str3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append("&pass=");
                    sb2.append(URLEncoder.encode(str2, "UTF-8"));
                }
                if (!TextUtils.isEmpty(str)) {
                    sb2.append("&secret=");
                    sb2.append(URLEncoder.encode(str, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            sb.append(sb2.toString());
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        Intent createChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
        createChooser.setFlags(TLObject.FLAG_28);
        this.a.startActivity(createChooser);
        u11 u11Var = proxyListActivity.a;
        if (u11Var != null) {
            u11Var.F();
        }
    }
}
