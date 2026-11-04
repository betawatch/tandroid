package org.telegram.ui.web;

import ai.h3;
import ai.h4;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import b8.mf;
import b8.xf;
import ci.b8;
import ei.m2;
import gi.j8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.wk;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.e51;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class m1 extends h41 implements cs {
    public m2 e;
    public final u10 f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public m1(org.telegram.ui.q qVar) {
        this.f = qVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
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

    public static long e0(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += e0(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = bd.M0(2131752857, null);
        r31 r31Var = new r31(9);
        r31Var.d = 1;
        r31Var.l = M0;
        r31Var.L(M2);
        arrayList.add(r31Var);
        arrayList.add(r31.C(bd.M0(2131752856, null)));
        int i3 = 0;
        if (!M2) {
            getMessagesController().O2();
            r31 i10 = r31.i(17, bd.M0(2131742944, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(r31.C(bd.M0(2131742943, null)));
            arrayList.add(r31.u(bd.M0(2131752865, null)));
            arrayList.size();
            m2 m2Var = this.e;
            String M02 = bd.M0(2131752849, null);
            r31 r31Var2 = new r31(3);
            r31Var2.d = 16;
            r31Var2.G = m2Var;
            r31Var2.l = M02;
            r31Var2.q = true;
            arrayList.add(r31Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().y8;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i3 < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i3);
                i3++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j10 = webDomainException2.favicon;
                int i11 = k1.b;
                r31 K = r31.K(k1.class);
                K.l = str;
                K.n = str2;
                K.B = j10;
                arrayList.add(K);
            }
            arrayList.add(r31.C(bd.M0(2131752866, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            r31 e10 = r31.e(5, bd.M0(2131752848, null));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(r31.C(null));
            return;
        }
        arrayList.size();
        String M03 = bd.M0(2131752862, null);
        long j11 = this.n;
        arrayList.add(r31.d(3, R.drawable.menu_clear_cookies, M03, j11 > 0 ? org.telegram.messenger.g0.i0(j11, false, false) : ""));
        arrayList.size();
        String M04 = bd.M0(2131752864, null);
        long j12 = this.h;
        arrayList.add(r31.d(2, R.drawable.menu_clear_cache, M04, j12 > 0 ? org.telegram.messenger.g0.i0(j12, false, false) : ""));
        arrayList.add(r31.C(bd.M0(2131752860, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(r31.c(9, R.drawable.menu_clear_recent, bd.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(r31.d(7, R.drawable.menu_clear_cache, bd.M0(2131752855, null), bd.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(r31.C(null));
        }
        arrayList.add(r31.u(bd.M0(2131752846, null)));
        arrayList.size();
        m2 m2Var2 = this.e;
        String M05 = bd.M0(2131752849, null);
        r31 r31Var3 = new r31(3);
        r31Var3.d = 15;
        r31Var3.G = m2Var2;
        r31Var3.l = M05;
        r31Var3.q = true;
        arrayList.add(r31Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().y8;
        ArrayList<TL_account.WebDomainException> arrayList3 = tL_webBrowserSettings2 == null ? new ArrayList<>() : tL_webBrowserSettings2.external_exceptions;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList3.get(i12);
            i12++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str3 = webDomainException4.domain;
            String str4 = webDomainException4.title;
            long j13 = webDomainException4.favicon;
            int i13 = k1.b;
            r31 K2 = r31.K(k1.class);
            K2.l = str3;
            K2.n = str4;
            K2.B = j13;
            arrayList.add(K2);
        }
        arrayList.add(r31.C(bd.M0(2131752847, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            r31 e11 = r31.e(5, bd.M0(2131752848, null));
            e11.r = true;
            arrayList.add(e11);
            arrayList.add(r31.C(null));
        }
        arrayList.size();
        arrayList.add(r31.d(6, R.drawable.msg_search, bd.M0(2131745809, null), d1.a().a));
        arrayList.add(r31.C(bd.M0(2131752842, null)));
        boolean z10 = r2.a;
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131752841, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        int i3 = r31Var.d;
        if (i3 == 12) {
            az.J();
            ((q8) view).setChecked(az.v0);
            return;
        }
        final int i10 = 1;
        if (i3 == 13) {
            az.w0 = !az.w0;
            SharedPreferences.Editor edit = hp.e1().edit();
            edit.putBoolean("onlyLocalInstantView", az.w0);
            edit.apply();
            ((q8) view).setChecked(az.w0);
            return;
        }
        if (i3 == 17) {
            boolean z10 = !getMessagesController().O2();
            hp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.y8;
            if (tL_webBrowserSettings != null) {
                messagesController.u5(tL_webBrowserSettings.open_external_browser, z10);
            }
            ((q8) view).setChecked(z10);
            this.a.g3.O(true);
            return;
        }
        final int i11 = 0;
        if (i3 == 1) {
            hp messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.y8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.u5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean M2 = getMessagesController().M2();
            q8 q8Var = (q8) view;
            q8Var.setChecked(M2);
            q8Var.b(k6.x0(null, M2 ? k6.f6 : k6.e6, false), M2);
            this.a.g3.O(true);
            return;
        }
        int i12 = 10;
        if (i3 == 10) {
            hp messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.y8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.u5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
            return;
        }
        if (i3 == 11) {
            hp messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.y8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.u5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
            return;
        }
        final int i13 = 2;
        if (i3 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = bd.M0(2131752864, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.a0(null, null, 2131752863, this.h != 0 ? a1.g.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")") : "");
            alertDialog$Builder.k(bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.j1
                public final /* synthetic */ m1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                    switch (i11) {
                        case 0:
                            m1 m1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(m1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    m1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    m1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            z1 b10 = z1.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            m1Var.f0();
                            break;
                        case 1:
                            m1 m1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    m1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            m1Var2.f0();
                            break;
                        case 2:
                            m1 m1Var3 = this.b;
                            try {
                                xf.c.clear();
                                xf.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            m1Var3.r = 0L;
                            m1Var3.a.g3.O(true);
                            break;
                        default:
                            m1 m1Var4 = this.b;
                            hp messagesController5 = m1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                            m1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i14 = 3;
        if (i3 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M02 = bd.M0(2131752862, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.S = M02;
            s1Var2.U = bd.a0(null, null, 2131752861, this.n != 0 ? a1.g.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.k(bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.j1
                public final /* synthetic */ m1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                    switch (i10) {
                        case 0:
                            m1 m1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(m1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    m1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    m1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            z1 b10 = z1.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            m1Var.f0();
                            break;
                        case 1:
                            m1 m1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    m1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            m1Var2.f0();
                            break;
                        case 2:
                            m1 m1Var3 = this.b;
                            try {
                                xf.c.clear();
                                xf.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            m1Var3.r = 0L;
                            m1Var3.a.g3.O(true);
                            break;
                        default:
                            m1 m1Var4 = this.b;
                            hp messagesController5 = m1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                            m1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(bd.M0(2131752589, null), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
            return;
        }
        if (i3 == 7) {
            ArrayList a10 = xf.a(null);
            int size = a10.size();
            long j10 = Long.MAX_VALUE;
            int i15 = 0;
            while (i15 < size) {
                Object obj = a10.get(i15);
                i15++;
                j10 = Math.min(j10, ((x0) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M03 = bd.M0(2131752855, null);
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
            s1Var3.S = M03;
            s1Var3.U = bd.a0(null, null, 2131752854, bd.u(j10 / 1000, false));
            alertDialog$Builder3.k(bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.j1
                public final /* synthetic */ m1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                    switch (i13) {
                        case 0:
                            m1 m1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(m1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    m1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    m1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            z1 b10 = z1.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            m1Var.f0();
                            break;
                        case 1:
                            m1 m1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    m1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            m1Var2.f0();
                            break;
                        case 2:
                            m1 m1Var3 = this.b;
                            try {
                                xf.c.clear();
                                xf.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            m1Var3.r = 0L;
                            m1Var3.a.g3.O(true);
                            break;
                        default:
                            m1 m1Var4 = this.b;
                            hp messagesController5 = m1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                            m1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(bd.M0(2131752589, null), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i3 == 9) {
            y0[] y0VarArr = {null};
            d2 y0Var = new y0(null, new e51(16, this, y0VarArr));
            y0VarArr[0] = y0Var;
            presentFragment(y0Var);
            return;
        }
        if (i3 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M04 = bd.M0(2131742947, null);
            org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.a;
            s1Var4.S = M04;
            s1Var4.U = bd.M0(2131742948, null);
            alertDialog$Builder4.k(bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.j1
                public final /* synthetic */ m1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                    switch (i14) {
                        case 0:
                            m1 m1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(m1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    m1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    m1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            z1 b10 = z1.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            m1Var.f0();
                            break;
                        case 1:
                            m1 m1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    m1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            m1Var2.f0();
                            break;
                        case 2:
                            m1 m1Var3 = this.b;
                            try {
                                xf.c.clear();
                                xf.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            m1Var3.r = 0L;
                            m1Var3.a.g3.O(true);
                            break;
                        default:
                            m1 m1Var4 = this.b;
                            hp messagesController5 = m1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                            m1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(bd.M0(2131752589, null), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (r31Var.H(k1.class)) {
            l1 l1Var = (l1) view;
            String str = l1Var.e;
            f60 F = f60.F((ViewGroup) this.fragmentView, null, l1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, bd.M0(2131746329, null), new hc1(10, this, str), false);
            F.Z();
            return;
        }
        int i16 = r31Var.d;
        if (i16 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = d1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i17 = 0;
            while (i17 < size2) {
                charSequenceArr[i17] = ((d1) b10.get(i17)).a;
                i6 i6Var = new i6(getParentActivity(), null);
                i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                i6Var.a(k6.x0(null, k6.g7, false), k6.x0(null, k6.E5, false));
                i6Var.b(charSequenceArr[i17], i17 == az.p0);
                int i18 = k6.i6;
                org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i18, false), 2, -1);
                n6 N = r6.N(i18);
                i6Var.setBackground(h02);
                r6.k(i6Var, h02, null, N, null);
                linearLayout.addView(i6Var);
                i6Var.setOnClickListener(new h3(i17, view, atomicReference));
                i17++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String M05 = bd.M0(2131745809, null);
            org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder5.a;
            s1Var5.S = M05;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(bd.M0(2131752589, null), null);
            atomicReference.set(s1Var5);
            showDialog(s1Var5);
            return;
        }
        if (i16 == 15 || i16 == 16) {
            boolean M22 = getMessagesController().M2();
            if (getMessagesController().L2(M22)) {
                t4.t0(this, bd.M0(2131742945, null), bd.M0(2131742946, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            e6 resourceProvider = getResourceProvider();
            b8 b8Var = new b8(i12, this, M22);
            Pattern pattern = t4.a;
            Activity W = org.telegram.messenger.g0.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
            String M06 = bd.M0(M22 ? 2131752868 : 2131752867, null);
            org.telegram.ui.ActionBar.s1 s1Var6 = alertDialog$Builder6.a;
            s1Var6.S = M06;
            s1Var6.U = bd.M0(M22 ? 2131752870 : 2131752869, null);
            s4 s4Var = new s4(parentActivity);
            s4Var.setTextSize(1, 16.0f);
            int i19 = k6.j5;
            r6.V(s4Var, i19, resourceProvider);
            r6.E(s4Var, k6.Li, resourceProvider);
            s4Var.setHint(bd.M0(2131752871, null));
            s4Var.setInputType(17);
            s4Var.setImeOptions(6);
            s4Var.setSingleLine(true);
            s4Var.setFocusable(true);
            s4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
            s4Var.setCursorWidth(1.5f);
            s4Var.z(k6.q6, resourceProvider);
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.r1(0.06f, k6.w0(i19, resourceProvider)));
            n6 L = r6.L(0.06f, i19);
            s4Var.setBackground(d02);
            r6.k(s4Var, d02, L, null, resourceProvider);
            o4.b1 b1Var = new o4.b1(s4Var, b8Var, s1VarArr, currentFocus, 21);
            s4Var.setOnEditorActionListener(new org.telegram.ui.Components.s0(b1Var, i11));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(s4Var, mf.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            s1Var6.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
            int i20 = 2;
            alertDialog$Builder6.k(bd.M0(2131751355, null), new org.telegram.ui.Components.t(b1Var, i20));
            alertDialog$Builder6.h(bd.M0(2131752589, null), new org.telegram.ui.Components.c(i20));
            s1VarArr[0] = s1Var6;
            s1Var6.k0 = false;
            s1Var6.setOnDismissListener(new org.telegram.ui.Components.p0(s4Var, i10));
            s1VarArr[0].setOnShowListener(new org.telegram.ui.Components.t0(i11, s4Var));
            s1VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable g7 = k2.p1.g(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(k6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g7.setColorFilter(new PorterDuffColorFilter(getThemedColor(k6.k7), mode));
        m2 m2Var = new m2(mutate, g7, 4);
        m2Var.y = org.telegram.messenger.g0.L(2.0f);
        this.e = m2Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        h4 h4Var;
        if (i3 != hs.R5 || (h4Var = this.a) == null) {
            return;
        }
        h4Var.g3.O(true);
    }

    public final void f0() {
        f41 f41Var;
        if (xf.a(new j8(this, 21)) != null) {
            this.r = r0.size();
            h4 h4Var = this.a;
            if (h4Var != null && (f41Var = h4Var.g3) != null && h4Var.H) {
                f41Var.O(true);
            }
        }
        Utilities.e.c(new d4(this, 23));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, hs.R5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, hs.R5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            m2 m2Var = this.e;
            if (m2Var != null) {
                int themedColor = getThemedColor(k6.N6);
                int themedColor2 = getThemedColor(k6.k7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = m2Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = m2Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                h4 h4Var = this.a;
                if (h4Var != null) {
                    h4Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
