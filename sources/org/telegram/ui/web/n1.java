package org.telegram.ui.web;

import ai.u2;
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
import bi.v3;
import bi.x2;
import c8.ja;
import c8.za;
import fi.e2;
import hi.g7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cl;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.br;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n1 extends r41 implements is {
    public e2 e;
    public final z10 f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public n1(org.telegram.ui.q qVar) {
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
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j3 += e0(file2, bool);
                }
                return j3;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = hd.M0(2131752857, null);
        b41 b41Var = new b41(9);
        b41Var.d = 1;
        b41Var.l = M0;
        b41Var.L(M2);
        arrayList.add(b41Var);
        arrayList.add(b41.C(hd.M0(2131752856, null)));
        int i7 = 0;
        if (!M2) {
            getMessagesController().O2();
            b41 i10 = b41.i(17, hd.M0(2131742934, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(b41.C(hd.M0(2131742933, null)));
            arrayList.add(b41.u(hd.M0(2131752865, null)));
            arrayList.size();
            e2 e2Var = this.e;
            String M02 = hd.M0(2131752849, null);
            b41 b41Var2 = new b41(3);
            b41Var2.d = 16;
            b41Var2.G = e2Var;
            b41Var2.l = M02;
            b41Var2.q = true;
            arrayList.add(b41Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().z8;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i7 < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i7);
                i7++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j3 = webDomainException2.favicon;
                int i11 = l1.b;
                b41 K = b41.K(l1.class);
                K.l = str;
                K.n = str2;
                K.B = j3;
                arrayList.add(K);
            }
            arrayList.add(b41.C(hd.M0(2131752866, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            b41 e10 = b41.e(5, hd.M0(2131752848, null));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(b41.C(null));
            return;
        }
        arrayList.size();
        String M03 = hd.M0(2131752862, null);
        long j10 = this.n;
        arrayList.add(b41.d(3, R.drawable.menu_clear_cookies, M03, j10 > 0 ? org.telegram.messenger.g0.i0(j10, false, false) : ""));
        arrayList.size();
        String M04 = hd.M0(2131752864, null);
        long j11 = this.h;
        arrayList.add(b41.d(2, R.drawable.menu_clear_cache, M04, j11 > 0 ? org.telegram.messenger.g0.i0(j11, false, false) : ""));
        arrayList.add(b41.C(hd.M0(2131752860, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(b41.c(9, R.drawable.menu_clear_recent, hd.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(b41.d(7, R.drawable.menu_clear_cache, hd.M0(2131752855, null), hd.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(b41.C(null));
        }
        arrayList.add(b41.u(hd.M0(2131752846, null)));
        arrayList.size();
        e2 e2Var2 = this.e;
        String M05 = hd.M0(2131752849, null);
        b41 b41Var3 = new b41(3);
        b41Var3.d = 15;
        b41Var3.G = e2Var2;
        b41Var3.l = M05;
        b41Var3.q = true;
        arrayList.add(b41Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().z8;
        ArrayList<TL_account.WebDomainException> arrayList3 = tL_webBrowserSettings2 == null ? new ArrayList<>() : tL_webBrowserSettings2.external_exceptions;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList3.get(i12);
            i12++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str3 = webDomainException4.domain;
            String str4 = webDomainException4.title;
            long j12 = webDomainException4.favicon;
            int i13 = l1.b;
            b41 K2 = b41.K(l1.class);
            K2.l = str3;
            K2.n = str4;
            K2.B = j12;
            arrayList.add(K2);
        }
        arrayList.add(b41.C(hd.M0(2131752847, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            b41 e11 = b41.e(5, hd.M0(2131752848, null));
            e11.r = true;
            arrayList.add(e11);
            arrayList.add(b41.C(null));
        }
        arrayList.size();
        arrayList.add(b41.d(6, R.drawable.msg_search, hd.M0(2131745799, null), d1.a().a));
        arrayList.add(b41.C(hd.M0(2131752842, null)));
        boolean z10 = r2.a;
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131752841, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        int i7 = b41Var.d;
        if (i7 == 12) {
            gz.J();
            ((q8) view).setChecked(gz.v0);
            return;
        }
        final int i10 = 1;
        if (i7 == 13) {
            gz.w0 = !gz.w0;
            SharedPreferences.Editor edit = np.e1().edit();
            edit.putBoolean("onlyLocalInstantView", gz.w0);
            edit.apply();
            ((q8) view).setChecked(gz.w0);
            return;
        }
        if (i7 == 17) {
            boolean z10 = !getMessagesController().O2();
            np messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.z8;
            if (tL_webBrowserSettings != null) {
                messagesController.v5(tL_webBrowserSettings.open_external_browser, z10);
            }
            ((q8) view).setChecked(z10);
            this.a.g3.O(true);
            return;
        }
        final int i11 = 0;
        if (i7 == 1) {
            np messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.z8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.v5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean M2 = getMessagesController().M2();
            q8 q8Var = (q8) view;
            q8Var.setChecked(M2);
            q8Var.b(j6.x0(null, M2 ? j6.f6 : j6.e6, false), M2);
            this.a.g3.O(true);
            return;
        }
        if (i7 == 10) {
            np messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.z8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.v5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
            return;
        }
        int i12 = 11;
        if (i7 == 11) {
            np messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.z8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.v5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
            return;
        }
        final int i13 = 2;
        if (i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131752864, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = hd.a0(null, null, 2131752863, this.h != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")") : "");
            alertDialog$Builder.k(hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i14) {
                    switch (i11) {
                        case 0:
                            n1 n1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(n1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    n1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    n1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            a2 b10 = a2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            n1Var.f0();
                            break;
                        case 1:
                            n1 n1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    n1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            n1Var2.f0();
                            break;
                        case 2:
                            n1 n1Var3 = this.b;
                            try {
                                za.c.clear();
                                za.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            n1Var3.r = 0L;
                            n1Var3.a.g3.O(true);
                            break;
                        default:
                            n1 n1Var4 = this.b;
                            np messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.R4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i14 = 3;
        if (i7 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M02 = hd.M0(2131752862, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = M02;
            t1Var2.U = hd.a0(null, null, 2131752861, this.n != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.k(hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i142) {
                    switch (i10) {
                        case 0:
                            n1 n1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(n1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    n1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    n1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            a2 b10 = a2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            n1Var.f0();
                            break;
                        case 1:
                            n1 n1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    n1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            n1Var2.f0();
                            break;
                        case 2:
                            n1 n1Var3 = this.b;
                            try {
                                za.c.clear();
                                za.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            n1Var3.r = 0L;
                            n1Var3.a.g3.O(true);
                            break;
                        default:
                            n1 n1Var4 = this.b;
                            np messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.R4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(hd.M0(2131752589, null), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
            return;
        }
        if (i7 == 7) {
            ArrayList a10 = za.a(null);
            int size = a10.size();
            long j3 = Long.MAX_VALUE;
            int i15 = 0;
            while (i15 < size) {
                Object obj = a10.get(i15);
                i15++;
                j3 = Math.min(j3, ((w0) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M03 = hd.M0(2131752855, null);
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            t1Var3.S = M03;
            t1Var3.U = hd.a0(null, null, 2131752854, hd.u(j3 / 1000, false));
            alertDialog$Builder3.k(hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i142) {
                    switch (i13) {
                        case 0:
                            n1 n1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(n1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    n1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    n1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            a2 b10 = a2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            n1Var.f0();
                            break;
                        case 1:
                            n1 n1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    n1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            n1Var2.f0();
                            break;
                        case 2:
                            n1 n1Var3 = this.b;
                            try {
                                za.c.clear();
                                za.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            n1Var3.r = 0L;
                            n1Var3.a.g3.O(true);
                            break;
                        default:
                            n1 n1Var4 = this.b;
                            np messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.R4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(hd.M0(2131752589, null), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i7 == 9) {
            x0[] x0VarArr = {null};
            org.telegram.ui.ActionBar.e2 x0Var = new x0(null, new x21(18, this, x0VarArr));
            x0VarArr[0] = x0Var;
            presentFragment(x0Var);
            return;
        }
        if (i7 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M04 = hd.M0(2131742937, null);
            org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
            t1Var4.S = M04;
            t1Var4.U = hd.M0(2131742938, null);
            alertDialog$Builder4.k(hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i142) {
                    switch (i14) {
                        case 0:
                            n1 n1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(n1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    n1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    n1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            a2 b10 = a2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            n1Var.f0();
                            break;
                        case 1:
                            n1 n1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    n1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            n1Var2.f0();
                            break;
                        case 2:
                            n1 n1Var3 = this.b;
                            try {
                                za.c.clear();
                                za.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            n1Var3.r = 0L;
                            n1Var3.a.g3.O(true);
                            break;
                        default:
                            n1 n1Var4 = this.b;
                            np messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.z8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.z8.inapp_exceptions.clear();
                                messagesController5.R4(messagesController5.z8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(hd.M0(2131752589, null), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (b41Var.H(l1.class)) {
            m1 m1Var = (m1) view;
            String str = m1Var.e;
            m60 F = m60.F((ViewGroup) this.fragmentView, null, m1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, hd.M0(2131746321, null), new e1(1, this, str), false);
            F.Z();
            return;
        }
        int i16 = b41Var.d;
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
                i6Var.a(j6.x0(null, j6.g7, false), j6.x0(null, j6.E5, false));
                i6Var.b(charSequenceArr[i17], i17 == gz.p0);
                int i18 = j6.i6;
                org.telegram.ui.Cells.y h02 = j6.h0(j6.x0(null, i18, false), 2, -1);
                m6 M = q6.M(i18);
                i6Var.setBackground(h02);
                q6.j(i6Var, h02, null, M, null);
                linearLayout.addView(i6Var);
                i6Var.setOnClickListener(new x2(i17, view, atomicReference));
                i17++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String M05 = hd.M0(2131745799, null);
            org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.a;
            t1Var5.S = M05;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(hd.M0(2131752589, null), null);
            atomicReference.set(t1Var5);
            showDialog(t1Var5);
            return;
        }
        if (i16 == 15 || i16 == 16) {
            boolean M22 = getMessagesController().M2();
            if (getMessagesController().L2(M22)) {
                t4.r0(this, hd.M0(2131742935, null), hd.M0(2131742936, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            e6 resourceProvider = getResourceProvider();
            u2 u2Var = new u2(i12, this, M22);
            Pattern pattern = t4.a;
            Activity W = org.telegram.messenger.g0.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
            String M06 = hd.M0(M22 ? 2131752868 : 2131752867, null);
            org.telegram.ui.ActionBar.t1 t1Var6 = alertDialog$Builder6.a;
            t1Var6.S = M06;
            t1Var6.U = hd.M0(M22 ? 2131752870 : 2131752869, null);
            s4 s4Var = new s4(parentActivity);
            s4Var.setTextSize(1, 16.0f);
            int i19 = j6.j5;
            q6.U(s4Var, i19, resourceProvider);
            q6.D(s4Var, j6.Oi, resourceProvider);
            s4Var.setHint(hd.M0(2131752871, null));
            s4Var.setInputType(17);
            s4Var.setImeOptions(6);
            s4Var.setSingleLine(true);
            s4Var.setFocusable(true);
            s4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
            s4Var.setCursorWidth(1.5f);
            s4Var.A(j6.q6, resourceProvider);
            ShapeDrawable d02 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.r1(0.06f, j6.w0(i19, resourceProvider)));
            m6 K = q6.K(0.06f, i19);
            s4Var.setBackground(d02);
            q6.j(s4Var, d02, K, null, resourceProvider);
            l5 l5Var = new l5(s4Var, u2Var, t1VarArr, currentFocus, 17);
            s4Var.setOnEditorActionListener(new org.telegram.ui.Components.q0(l5Var, i11));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(s4Var, ja.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            t1Var6.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
            alertDialog$Builder6.k(hd.M0(2131751354, null), new org.telegram.ui.Components.s(l5Var, 2));
            alertDialog$Builder6.h(hd.M0(2131752589, null), new br(9));
            t1VarArr[0] = t1Var6;
            t1Var6.k0 = false;
            t1Var6.setOnDismissListener(new org.telegram.ui.Components.m0(s4Var, i10));
            t1VarArr[0].setOnShowListener(new org.telegram.ui.Components.r0(i11, s4Var));
            t1VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable g10 = i5.c.g(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(j6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.k7), mode));
        e2 e2Var = new e2(mutate, g10, 4);
        e2Var.y = org.telegram.messenger.g0.L(2.0f);
        this.e = e2Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        v3 v3Var;
        if (i7 != ns.R5 || (v3Var = this.a) == null) {
            return;
        }
        v3Var.g3.O(true);
    }

    public final void f0() {
        p41 p41Var;
        if (za.a(new g7(this, 23)) != null) {
            this.r = r0.size();
            v3 v3Var = this.a;
            if (v3Var != null && (p41Var = v3Var.g3) != null && v3Var.H) {
                p41Var.O(true);
            }
        }
        Utilities.e.c(new org.telegram.ui.ActionBar.r0(this, 29));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ns.R5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ns.R5);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            e2 e2Var = this.e;
            if (e2Var != null) {
                int themedColor = getThemedColor(j6.N6);
                int themedColor2 = getThemedColor(j6.k7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = e2Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = e2Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                v3 v3Var = this.a;
                if (v3Var != null) {
                    v3Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
