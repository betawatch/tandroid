package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.il;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.m5;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Wallet.k3;
import org.telegram.ui.f11;
import org.telegram.ui.fp;
import org.telegram.ui.nc;
import org.telegram.ui.zw0;
import w7.b6;
import w7.m6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class p1 extends r51 implements us {
    public zw0 e;
    public final q20 f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public p1(org.telegram.ui.p pVar) {
        this.f = pVar;
    }

    public static boolean c0(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !c0(file2, bool)) {
                        z10 = false;
                    }
                }
            } else {
                z10 = true;
            }
            if (z10) {
                file.delete();
            }
        } else {
            if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
                return false;
            }
            file.delete();
        }
        return true;
    }

    public static long d0(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += d0(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, p51 p51Var) {
        boolean K2 = getMessagesController().K2();
        arrayList.size();
        String L0 = cd.L0(2131752857, null);
        a51 a51Var = new a51(9);
        a51Var.d = 1;
        a51Var.l = L0;
        a51Var.L(K2);
        arrayList.add(a51Var);
        arrayList.add(a51.C(cd.L0(2131752856, null)));
        int i10 = 0;
        if (!K2) {
            getMessagesController().M2();
            a51 i11 = a51.i(17, cd.L0(2131742960, null));
            i11.L(getMessagesController().M2());
            arrayList.add(i11);
            arrayList.add(a51.C(cd.L0(2131742959, null)));
            arrayList.add(a51.u(cd.L0(2131752865, null)));
            arrayList.size();
            zw0 zw0Var = this.e;
            String L02 = cd.L0(2131752849, null);
            a51 a51Var2 = new a51(3);
            a51Var2.d = 16;
            a51Var2.G = zw0Var;
            a51Var2.l = L02;
            a51Var2.q = true;
            arrayList.add(a51Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().z8;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i10 < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i10);
                i10++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j10 = webDomainException2.favicon;
                int i12 = n1.b;
                a51 K = a51.K(n1.class);
                K.l = str;
                K.n = str2;
                K.B = j10;
                arrayList.add(K);
            }
            arrayList.add(a51.C(cd.L0(2131752866, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            a51 e = a51.e(5, cd.L0(2131752848, null));
            e.r = true;
            arrayList.add(e);
            arrayList.add(a51.C(null));
            return;
        }
        arrayList.size();
        String L03 = cd.L0(2131752862, null);
        long j11 = this.n;
        arrayList.add(a51.d(3, R.drawable.menu_clear_cookies, L03, j11 > 0 ? org.telegram.messenger.i0.i0(j11, false, false) : ""));
        arrayList.size();
        String L04 = cd.L0(2131752864, null);
        long j12 = this.h;
        arrayList.add(a51.d(2, R.drawable.menu_clear_cache, L04, j12 > 0 ? org.telegram.messenger.i0.i0(j12, false, false) : ""));
        arrayList.add(a51.C(cd.L0(2131752860, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(a51.c(9, R.drawable.menu_clear_recent, cd.L0(2131752850, null)));
            arrayList.size();
            arrayList.add(a51.d(7, R.drawable.menu_clear_cache, cd.L0(2131752855, null), cd.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(a51.C(null));
        }
        arrayList.add(a51.u(cd.L0(2131752846, null)));
        arrayList.size();
        zw0 zw0Var2 = this.e;
        String L05 = cd.L0(2131752849, null);
        a51 a51Var3 = new a51(3);
        a51Var3.d = 15;
        a51Var3.G = zw0Var2;
        a51Var3.l = L05;
        a51Var3.q = true;
        arrayList.add(a51Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().z8;
        ArrayList<TL_account.WebDomainException> arrayList3 = tL_webBrowserSettings2 == null ? new ArrayList<>() : tL_webBrowserSettings2.external_exceptions;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList3.get(i13);
            i13++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str3 = webDomainException4.domain;
            String str4 = webDomainException4.title;
            long j13 = webDomainException4.favicon;
            int i14 = n1.b;
            a51 K3 = a51.K(n1.class);
            K3.l = str3;
            K3.n = str4;
            K3.B = j13;
            arrayList.add(K3);
        }
        arrayList.add(a51.C(cd.L0(2131752847, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            a51 e7 = a51.e(5, cd.L0(2131752848, null));
            e7.r = true;
            arrayList.add(e7);
            arrayList.add(a51.C(null));
        }
        arrayList.size();
        arrayList.add(a51.d(6, R.drawable.msg_search, cd.L0(2131745816, null), g1.a().a));
        arrayList.add(a51.C(cd.L0(2131752842, null)));
        boolean z10 = v2.a;
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return cd.L0(2131752841, null);
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(a51 a51Var, View view) {
        int i10 = a51Var.d;
        if (i10 == 12) {
            tz.J();
            ((t8) view).setChecked(tz.v0);
            return;
        }
        final int i11 = 1;
        if (i10 == 13) {
            tz.w0 = !tz.w0;
            SharedPreferences.Editor edit = vp.d1().edit();
            edit.putBoolean("onlyLocalInstantView", tz.w0);
            edit.apply();
            ((t8) view).setChecked(tz.w0);
            return;
        }
        if (i10 == 17) {
            boolean z10 = !getMessagesController().M2();
            vp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.z8;
            if (tL_webBrowserSettings != null) {
                messagesController.r5(tL_webBrowserSettings.open_external_browser, z10);
            }
            ((t8) view).setChecked(z10);
            this.a.f3.O(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            vp messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.z8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.r5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean K2 = getMessagesController().K2();
            t8 t8Var = (t8) view;
            t8Var.setChecked(K2);
            t8Var.b(t6.x0(null, K2 ? t6.f6 : t6.e6, false), K2);
            this.a.f3.O(true);
            return;
        }
        if (i10 == 10) {
            vp messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.z8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.r5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.f3.O(true);
            return;
        }
        if (i10 == 11) {
            vp messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.z8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.r5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.f3.O(true);
            return;
        }
        final int i13 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L0 = cd.L0(2131752864, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.a0(null, null, 2131752863, this.h != 0 ? a1.g.r(new StringBuilder(" ("), org.telegram.messenger.i0.i0(this.h, false, false), ")") : "");
            alertDialog$Builder.k(cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.m1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                    switch (i12) {
                        case 0:
                            p1 p1Var = this.b;
                            org.telegram.messenger.w0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.w0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(p1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    p1.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    p1.c0(file2, null);
                                }
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                            d2 b10 = d2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            p1Var.e0();
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    p1.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                f8.g(e10, true);
                            }
                            p1Var2.e0();
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            try {
                                m6.c.clear();
                                m6.d.clear();
                                File file4 = new File(b8.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                            p1Var3.r = 0L;
                            p1Var3.a.f3.O(true);
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            vp messagesController5 = p1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.N4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                            p1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i14 = 3;
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L02 = cd.L0(2131752862, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.R = L02;
            x1Var2.T = cd.a0(null, null, 2131752861, this.n != 0 ? a1.g.r(new StringBuilder(" ("), org.telegram.messenger.i0.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.k(cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.m1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i142) {
                    switch (i11) {
                        case 0:
                            p1 p1Var = this.b;
                            org.telegram.messenger.w0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.w0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(p1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    p1.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    p1.c0(file2, null);
                                }
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                            d2 b10 = d2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            p1Var.e0();
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    p1.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                f8.g(e10, true);
                            }
                            p1Var2.e0();
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            try {
                                m6.c.clear();
                                m6.d.clear();
                                File file4 = new File(b8.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                            p1Var3.r = 0L;
                            p1Var3.a.f3.O(true);
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            vp messagesController5 = p1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.N4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                            p1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(cd.L0(2131752589, null), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
            return;
        }
        if (i10 == 7) {
            ArrayList a2 = m6.a(null);
            int size = a2.size();
            long j10 = Long.MAX_VALUE;
            int i15 = 0;
            while (i15 < size) {
                Object obj = a2.get(i15);
                i15++;
                j10 = Math.min(j10, ((a1) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L03 = cd.L0(2131752855, null);
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
            x1Var3.R = L03;
            x1Var3.T = cd.a0(null, null, 2131752854, cd.u(j10 / 1000, false));
            alertDialog$Builder3.k(cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.m1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i142) {
                    switch (i13) {
                        case 0:
                            p1 p1Var = this.b;
                            org.telegram.messenger.w0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.w0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(p1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    p1.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    p1.c0(file2, null);
                                }
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                            d2 b10 = d2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            p1Var.e0();
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    p1.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                f8.g(e10, true);
                            }
                            p1Var2.e0();
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            try {
                                m6.c.clear();
                                m6.d.clear();
                                File file4 = new File(b8.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                            p1Var3.r = 0L;
                            p1Var3.a.f3.O(true);
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            vp messagesController5 = p1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.N4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                            p1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(cd.L0(2131752589, null), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i10 == 9) {
            b1[] b1VarArr = {null};
            k2 b1Var = new b1(null, new f11(19, this, b1VarArr));
            b1VarArr[0] = b1Var;
            presentFragment(b1Var);
            return;
        }
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L04 = cd.L0(2131742963, null);
            org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
            x1Var4.R = L04;
            x1Var4.T = cd.L0(2131742964, null);
            alertDialog$Builder4.k(cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.m1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i142) {
                    switch (i14) {
                        case 0:
                            p1 p1Var = this.b;
                            org.telegram.messenger.w0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.w0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(p1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    p1.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    p1.c0(file2, null);
                                }
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                            d2 b10 = d2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            p1Var.e0();
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    p1.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                f8.g(e10, true);
                            }
                            p1Var2.e0();
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            try {
                                m6.c.clear();
                                m6.d.clear();
                                File file4 = new File(b8.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                            p1Var3.r = 0L;
                            p1Var3.a.f3.O(true);
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            vp messagesController5 = p1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.N4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                            p1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(cd.L0(2131752589, null), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (a51Var.H(n1.class)) {
            o1 o1Var = (o1) view;
            String str = o1Var.e;
            z60 F = z60.F((ViewGroup) this.fragmentView, null, o1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, cd.L0(2131746336, null), new k3(28, this, str), false);
            F.Z();
            return;
        }
        int i16 = a51Var.d;
        int i17 = 6;
        if (i16 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = g1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i18 = 0;
            while (i18 < size2) {
                charSequenceArr[i18] = ((g1) b10.get(i18)).a;
                n6 n6Var = new n6(getParentActivity(), null);
                n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                n6Var.a(t6.x0(null, t6.g7, false), t6.x0(null, t6.E5, false));
                n6Var.b(charSequenceArr[i18], i18 == tz.p0);
                int i19 = t6.i6;
                org.telegram.ui.Cells.y h02 = t6.h0(t6.x0(null, i19, false), 2, -1);
                w6 N = a7.N(i19);
                n6Var.setBackground(h02);
                a7.k(n6Var, h02, null, N, null);
                linearLayout.addView(n6Var);
                n6Var.setOnClickListener(new jg.w1(i18, view, atomicReference));
                i18++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String L05 = cd.L0(2131745816, null);
            org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder5.a;
            x1Var5.R = L05;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(cd.L0(2131752589, null), null);
            atomicReference.set(x1Var5);
            showDialog(x1Var5);
            return;
        }
        if (i16 == 15 || i16 == 16) {
            boolean K22 = getMessagesController().K2();
            if (getMessagesController().J2(K22)) {
                s4.t0(this, cd.L0(2131742961, null), cd.L0(2131742962, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            p6 resourceProvider = getResourceProvider();
            nc ncVar = new nc(i17, this, K22);
            Pattern pattern = s4.a;
            Activity W = org.telegram.messenger.i0.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
            String L06 = cd.L0(K22 ? 2131752868 : 2131752867, null);
            org.telegram.ui.ActionBar.x1 x1Var6 = alertDialog$Builder6.a;
            x1Var6.R = L06;
            x1Var6.T = cd.L0(K22 ? 2131752870 : 2131752869, null);
            r4 r4Var = new r4(parentActivity);
            r4Var.setTextSize(1, 16.0f);
            int i20 = t6.j5;
            a7.V(r4Var, i20, resourceProvider);
            a7.E(r4Var, t6.Li, resourceProvider);
            r4Var.setHint(cd.L0(2131752871, null));
            r4Var.setInputType(17);
            r4Var.setImeOptions(6);
            r4Var.setSingleLine(true);
            r4Var.setFocusable(true);
            r4Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f));
            r4Var.setCursorWidth(1.5f);
            r4Var.z(t6.q6, resourceProvider);
            ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(22.0f), t6.r1(0.06f, t6.w0(i20, resourceProvider)));
            w6 L = a7.L(0.06f, i20);
            r4Var.setBackground(d02);
            a7.k(r4Var, d02, L, null, resourceProvider);
            fp fpVar = new fp((KeyEvent.Callback) r4Var, (Object) ncVar, (Object) x1VarArr, (Object) currentFocus, 5);
            r4Var.setOnEditorActionListener(new org.telegram.ui.Components.t0(fpVar, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(r4Var, b6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            x1Var6.a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.q.x * 85) / 100);
            alertDialog$Builder6.k(cd.L0(2131751355, null), new org.telegram.ui.Components.t(fpVar, i13));
            alertDialog$Builder6.h(cd.L0(2131752589, null), new m5(19));
            x1VarArr[0] = x1Var6;
            x1Var6.j0 = false;
            x1Var6.setOnDismissListener(new org.telegram.ui.Components.r0(r4Var, 1));
            x1VarArr[0].setOnShowListener(new org.telegram.ui.Components.u0(i12, r4Var));
            x1VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable f7 = i0.a.f(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(t6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        f7.setColorFilter(new PorterDuffColorFilter(getThemedColor(t6.k7), mode));
        zw0 zw0Var = new zw0(mutate, f7, 1);
        zw0Var.y = org.telegram.messenger.i0.L(2.0f);
        this.e = zw0Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        if (i10 != zs.R5 || (iiVar = this.a) == null) {
            return;
        }
        iiVar.f3.O(true);
    }

    public final void e0() {
        p51 p51Var;
        if (m6.a(new ag.l(this, 29)) != null) {
            this.r = r0.size();
            ii iiVar = this.a;
            if (iiVar != null && (p51Var = iiVar.f3) != null && iiVar.G) {
                p51Var.O(true);
            }
        }
        Utilities.e.c(new w5(this, 19));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        e0();
        getNotificationCenter().c(this, zs.R5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, zs.R5);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            zw0 zw0Var = this.e;
            if (zw0Var != null) {
                int themedColor = getThemedColor(t6.N6);
                int themedColor2 = getThemedColor(t6.k7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = zw0Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = zw0Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                ii iiVar = this.a;
                if (iiVar != null) {
                    iiVar.g1();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
