package org.telegram.ui.web;

import ai.w2;
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
import bi.g6;
import bi.i5;
import c8.cb;
import c8.ma;
import fi.c2;
import hi.s6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.al;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.cr;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n1 extends e51 implements fs {
    public c2 e;
    public final x10 f;
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

    @Override // org.telegram.ui.Components.e51
    public final void Z(ArrayList arrayList, c51 c51Var) {
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String N0 = gd.N0(2131752845, null);
        o41 o41Var = new o41(9);
        o41Var.d = 1;
        o41Var.m = N0;
        o41Var.L(S2);
        arrayList.add(o41Var);
        arrayList.add(o41.C(gd.N0(2131752844, null)));
        int i7 = 0;
        if (!S2) {
            getMessagesController().U2();
            o41 i10 = o41.i(17, gd.N0(2131742670, null));
            i10.L(getMessagesController().U2());
            arrayList.add(i10);
            arrayList.add(o41.C(gd.N0(2131742669, null)));
            arrayList.add(o41.u(gd.N0(2131752853, null)));
            arrayList.size();
            c2 c2Var = this.e;
            String N02 = gd.N0(2131752837, null);
            o41 o41Var2 = new o41(3);
            o41Var2.d = 16;
            o41Var2.H = c2Var;
            o41Var2.m = N02;
            o41Var2.r = true;
            arrayList.add(o41Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().E8;
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
                o41 K = o41.K(l1.class);
                K.m = str;
                K.o = str2;
                K.C = j3;
                arrayList.add(K);
            }
            arrayList.add(o41.C(gd.N0(2131752854, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            o41 e10 = o41.e(5, gd.N0(2131752836, null));
            e10.s = true;
            arrayList.add(e10);
            arrayList.add(o41.C(null));
            return;
        }
        arrayList.size();
        String N03 = gd.N0(2131752850, null);
        long j10 = this.n;
        arrayList.add(o41.d(3, R.drawable.menu_clear_cookies, N03, j10 > 0 ? org.telegram.messenger.g0.i0(j10, false, false) : ""));
        arrayList.size();
        String N04 = gd.N0(2131752852, null);
        long j11 = this.h;
        arrayList.add(o41.d(2, R.drawable.menu_clear_cache, N04, j11 > 0 ? org.telegram.messenger.g0.i0(j11, false, false) : ""));
        arrayList.add(o41.C(gd.N0(2131752848, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(o41.c(9, R.drawable.menu_clear_recent, gd.N0(2131752838, null)));
            arrayList.size();
            arrayList.add(o41.d(7, R.drawable.menu_clear_cache, gd.N0(2131752843, null), gd.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(o41.C(null));
        }
        arrayList.add(o41.u(gd.N0(2131752834, null)));
        arrayList.size();
        c2 c2Var2 = this.e;
        String N05 = gd.N0(2131752837, null);
        o41 o41Var3 = new o41(3);
        o41Var3.d = 15;
        o41Var3.H = c2Var2;
        o41Var3.m = N05;
        o41Var3.r = true;
        arrayList.add(o41Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().E8;
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
            o41 K2 = o41.K(l1.class);
            K2.m = str3;
            K2.o = str4;
            K2.C = j12;
            arrayList.add(K2);
        }
        arrayList.add(o41.C(gd.N0(2131752835, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            o41 e11 = o41.e(5, gd.N0(2131752836, null));
            e11.s = true;
            arrayList.add(e11);
            arrayList.add(o41.C(null));
        }
        arrayList.size();
        arrayList.add(o41.d(6, R.drawable.msg_search, gd.N0(2131745603, null), e1.a().a));
        arrayList.add(o41.C(gd.N0(2131752830, null)));
        boolean z10 = s2.a;
    }

    @Override // org.telegram.ui.Components.e51
    public final CharSequence a0() {
        return gd.N0(2131752829, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // org.telegram.ui.Components.e51
    public final void b0(o41 o41Var, View view) {
        int i7 = o41Var.d;
        if (i7 == 12) {
            bz.J();
            ((s8) view).setChecked(bz.v0);
            return;
        }
        final int i10 = 1;
        if (i7 == 13) {
            bz.w0 = !bz.w0;
            SharedPreferences.Editor edit = mp.g1().edit();
            edit.putBoolean("onlyLocalInstantView", bz.w0);
            edit.apply();
            ((s8) view).setChecked(bz.w0);
            return;
        }
        if (i7 == 17) {
            boolean z10 = !getMessagesController().U2();
            mp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
            if (tL_webBrowserSettings != null) {
                messagesController.G5(tL_webBrowserSettings.open_external_browser, z10);
            }
            ((s8) view).setChecked(z10);
            this.a.g3.O(true);
            return;
        }
        ?? r62 = 0;
        Object[] objArr = 0;
        if (i7 == 1) {
            mp messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.E8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.G5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean S2 = getMessagesController().S2();
            s8 s8Var = (s8) view;
            s8Var.setChecked(S2);
            s8Var.b(m6.x0(null, S2 ? m6.f6 : m6.e6, false), S2);
            this.a.g3.O(true);
            return;
        }
        if (i7 == 10) {
            mp messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.E8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.G5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
            return;
        }
        int i11 = 11;
        if (i7 == 11) {
            mp messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.E8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.G5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
            return;
        }
        final int i12 = 2;
        if (i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N0 = gd.N0(2131752852, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.a0(null, null, 2131752851, this.h != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")") : "");
            String N02 = gd.N0(2131752089, null);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            alertDialog$Builder.k(N02, new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                    switch (objArr2) {
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
                                cb.c.clear();
                                cb.d.clear();
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
                            mp messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.E8.inapp_exceptions.clear();
                                messagesController5.c5(messagesController5.E8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i13 = 3;
        if (i7 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N03 = gd.N0(2131752850, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = N03;
            t1Var2.U = gd.a0(null, null, 2131752849, this.n != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.k(gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
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
                                cb.c.clear();
                                cb.d.clear();
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
                            mp messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.E8.inapp_exceptions.clear();
                                messagesController5.c5(messagesController5.E8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(gd.N0(2131752577, null), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
            return;
        }
        if (i7 == 7) {
            ArrayList a10 = cb.a(null);
            int size = a10.size();
            long j3 = Long.MAX_VALUE;
            int i14 = 0;
            while (i14 < size) {
                Object obj = a10.get(i14);
                i14++;
                j3 = Math.min(j3, ((w0) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N04 = gd.N0(2131752843, null);
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            t1Var3.S = N04;
            t1Var3.U = gd.a0(null, null, 2131752842, gd.u(j3 / 1000, false));
            alertDialog$Builder3.k(gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                    switch (i12) {
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
                                cb.c.clear();
                                cb.d.clear();
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
                            mp messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.E8.inapp_exceptions.clear();
                                messagesController5.c5(messagesController5.E8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(gd.N0(2131752577, null), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i7 == 9) {
            x0[] x0VarArr = {null};
            g2 x0Var = new x0(null, new p51(17, this, x0VarArr));
            x0VarArr[0] = x0Var;
            presentFragment(x0Var);
            return;
        }
        if (i7 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N05 = gd.N0(2131742673, null);
            org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
            t1Var4.S = N05;
            t1Var4.U = gd.N0(2131742674, null);
            alertDialog$Builder4.k(gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
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
                                cb.c.clear();
                                cb.d.clear();
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
                            mp messagesController5 = n1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.E8.inapp_exceptions.clear();
                                messagesController5.c5(messagesController5.E8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                            n1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(gd.N0(2131752577, null), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (o41Var.H(l1.class)) {
            m1 m1Var = (m1) view;
            String str = m1Var.e;
            a70 G = a70.G((ViewGroup) this.fragmentView, null, m1Var);
            G.s = 40;
            G.c(R.drawable.menu_delete_old, gd.N0(2131746125, null), new u4(25, this, str), false);
            G.a0();
            return;
        }
        int i15 = o41Var.d;
        if (i15 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = e1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i16 = 0;
            while (i16 < size2) {
                charSequenceArr[i16] = ((e1) b10.get(i16)).a;
                k6 k6Var = new k6(getParentActivity(), null);
                k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r62, org.telegram.messenger.g0.L(4.0f), r62);
                k6Var.a(m6.x0(null, m6.g7, r62), m6.x0(null, m6.E5, r62));
                k6Var.b(charSequenceArr[i16], i16 == bz.p0 ? true : r62);
                int i17 = m6.i6;
                org.telegram.ui.Cells.y h02 = m6.h0(m6.x0(null, i17, r62), 2, -1);
                p6 M = t6.M(i17);
                k6Var.setBackground(h02);
                t6.j(k6Var, h02, null, M, null);
                linearLayout.addView(k6Var);
                k6Var.setOnClickListener(new i5(i16, view, atomicReference));
                i16++;
                r62 = 0;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String N06 = gd.N0(2131745603, null);
            org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.a;
            t1Var5.S = N06;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(gd.N0(2131752577, null), null);
            atomicReference.set(t1Var5);
            showDialog(t1Var5);
            return;
        }
        if (i15 == 15 || i15 == 16) {
            boolean S22 = getMessagesController().S2();
            if (getMessagesController().R2(S22)) {
                c5.r0(this, gd.N0(2131742671, null), gd.N0(2131742672, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            h6 resourceProvider = getResourceProvider();
            w2 w2Var = new w2(i11, this, S22);
            Pattern pattern = c5.a;
            Activity W = org.telegram.messenger.g0.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
            String N07 = gd.N0(S22 ? 2131752856 : 2131752855, null);
            org.telegram.ui.ActionBar.t1 t1Var6 = alertDialog$Builder6.a;
            t1Var6.S = N07;
            t1Var6.U = gd.N0(S22 ? 2131752858 : 2131752857, null);
            b5 b5Var = new b5(parentActivity);
            b5Var.setTextSize(1, 16.0f);
            int i18 = m6.j5;
            t6.U(b5Var, i18, resourceProvider);
            t6.D(b5Var, m6.Oi, resourceProvider);
            b5Var.setHint(gd.N0(2131752859, null));
            b5Var.setInputType(17);
            b5Var.setImeOptions(6);
            b5Var.setSingleLine(true);
            b5Var.setFocusable(true);
            b5Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
            b5Var.setCursorWidth(1.5f);
            b5Var.A(m6.q6, resourceProvider);
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.r1(0.06f, m6.w0(i18, resourceProvider)));
            p6 K = t6.K(0.06f, i18);
            b5Var.setBackground(d02);
            t6.j(b5Var, d02, K, null, resourceProvider);
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(b5Var, w2Var, t1VarArr, currentFocus, 20);
            b5Var.setOnEditorActionListener(new org.telegram.ui.Components.h(iVar, i10));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(b5Var, ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            t1Var6.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
            alertDialog$Builder6.k(gd.N0(2131751342, null), new org.telegram.ui.Components.c0(iVar, i12));
            alertDialog$Builder6.h(gd.N0(2131752577, null), new cr(10));
            t1VarArr[0] = t1Var6;
            t1Var6.k0 = false;
            t1Var6.setOnDismissListener(new org.telegram.ui.Components.z0(b5Var, i10));
            t1VarArr[0].setOnShowListener(new org.telegram.ui.Components.d1(0, b5Var));
            t1VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.e51
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable g10 = i5.c.g(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(m6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(m6.k7), mode));
        c2 c2Var = new c2(mutate, g10, 4);
        c2Var.y = org.telegram.messenger.g0.L(2.0f);
        this.e = c2Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g6 g6Var;
        if (i7 != ks.U5 || (g6Var = this.a) == null) {
            return;
        }
        g6Var.g3.O(true);
    }

    public final void f0() {
        c51 c51Var;
        if (cb.a(new s6(this, 24)) != null) {
            this.r = r0.size();
            g6 g6Var = this.a;
            if (g6Var != null && (c51Var = g6Var.g3) != null && g6Var.H) {
                c51Var.O(true);
            }
        }
        Utilities.e.c(new z0(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ks.U5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.U5);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            c2 c2Var = this.e;
            if (c2Var != null) {
                int themedColor = getThemedColor(m6.N6);
                int themedColor2 = getThemedColor(m6.k7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = c2Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = c2Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                g6 g6Var = this.a;
                if (g6Var != null) {
                    g6Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
