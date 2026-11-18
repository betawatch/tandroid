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
import bi.c6;
import bi.e5;
import c8.cb;
import c8.ma;
import fi.c2;
import hi.t6;
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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.cr;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class n1 extends b51 implements fs {
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

    @Override // org.telegram.ui.Components.b51
    public final void Z(ArrayList arrayList, z41 z41Var) {
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String M0 = gd.M0(2131752846, null);
        l41 l41Var = new l41(9);
        l41Var.d = 1;
        l41Var.m = M0;
        l41Var.L(S2);
        arrayList.add(l41Var);
        arrayList.add(l41.C(gd.M0(2131752845, null)));
        int i7 = 0;
        if (!S2) {
            getMessagesController().U2();
            l41 i10 = l41.i(17, gd.M0(2131742676, null));
            i10.L(getMessagesController().U2());
            arrayList.add(i10);
            arrayList.add(l41.C(gd.M0(2131742675, null)));
            arrayList.add(l41.u(gd.M0(2131752854, null)));
            arrayList.size();
            c2 c2Var = this.e;
            String M02 = gd.M0(2131752838, null);
            l41 l41Var2 = new l41(3);
            l41Var2.d = 16;
            l41Var2.H = c2Var;
            l41Var2.m = M02;
            l41Var2.r = true;
            arrayList.add(l41Var2);
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
                l41 K = l41.K(l1.class);
                K.m = str;
                K.o = str2;
                K.C = j3;
                arrayList.add(K);
            }
            arrayList.add(l41.C(gd.M0(2131752855, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            l41 e10 = l41.e(5, gd.M0(2131752837, null));
            e10.s = true;
            arrayList.add(e10);
            arrayList.add(l41.C(null));
            return;
        }
        arrayList.size();
        String M03 = gd.M0(2131752851, null);
        long j10 = this.n;
        arrayList.add(l41.d(3, R.drawable.menu_clear_cookies, M03, j10 > 0 ? org.telegram.messenger.g0.i0(j10, false, false) : ""));
        arrayList.size();
        String M04 = gd.M0(2131752853, null);
        long j11 = this.h;
        arrayList.add(l41.d(2, R.drawable.menu_clear_cache, M04, j11 > 0 ? org.telegram.messenger.g0.i0(j11, false, false) : ""));
        arrayList.add(l41.C(gd.M0(2131752849, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(l41.c(9, R.drawable.menu_clear_recent, gd.M0(2131752839, null)));
            arrayList.size();
            arrayList.add(l41.d(7, R.drawable.menu_clear_cache, gd.M0(2131752844, null), gd.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(l41.C(null));
        }
        arrayList.add(l41.u(gd.M0(2131752835, null)));
        arrayList.size();
        c2 c2Var2 = this.e;
        String M05 = gd.M0(2131752838, null);
        l41 l41Var3 = new l41(3);
        l41Var3.d = 15;
        l41Var3.H = c2Var2;
        l41Var3.m = M05;
        l41Var3.r = true;
        arrayList.add(l41Var3);
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
            l41 K2 = l41.K(l1.class);
            K2.m = str3;
            K2.o = str4;
            K2.C = j12;
            arrayList.add(K2);
        }
        arrayList.add(l41.C(gd.M0(2131752836, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            l41 e11 = l41.e(5, gd.M0(2131752837, null));
            e11.s = true;
            arrayList.add(e11);
            arrayList.add(l41.C(null));
        }
        arrayList.size();
        arrayList.add(l41.d(6, R.drawable.msg_search, gd.M0(2131745604, null), e1.a().a));
        arrayList.add(l41.C(gd.M0(2131752831, null)));
        boolean z10 = s2.a;
    }

    @Override // org.telegram.ui.Components.b51
    public final CharSequence a0() {
        return gd.M0(2131752830, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // org.telegram.ui.Components.b51
    public final void b0(l41 l41Var, View view) {
        int i7 = l41Var.d;
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
            s8Var.b(n6.x0(null, S2 ? n6.f6 : n6.e6, false), S2);
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
            String M0 = gd.M0(2131752853, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.a0(null, null, 2131752852, this.h != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")") : "");
            String M02 = gd.M0(2131752090, null);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
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
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i13 = 3;
        if (i7 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M03 = gd.M0(2131752851, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.S = M03;
            u1Var2.U = gd.a0(null, null, 2131752850, this.n != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.k(gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
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
            alertDialog$Builder2.h(gd.M0(2131752578, null), null);
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
            String M04 = gd.M0(2131752844, null);
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
            u1Var3.S = M04;
            u1Var3.U = gd.a0(null, null, 2131752843, gd.u(j3 / 1000, false));
            alertDialog$Builder3.k(gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
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
            alertDialog$Builder3.h(gd.M0(2131752578, null), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i7 == 9) {
            x0[] x0VarArr = {null};
            h2 x0Var = new x0(null, new p51(17, this, x0VarArr));
            x0VarArr[0] = x0Var;
            presentFragment(x0Var);
            return;
        }
        if (i7 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M05 = gd.M0(2131742679, null);
            org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
            u1Var4.S = M05;
            u1Var4.U = gd.M0(2131742680, null);
            alertDialog$Builder4.k(gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.k1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
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
            alertDialog$Builder4.h(gd.M0(2131752578, null), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (l41Var.H(l1.class)) {
            m1 m1Var = (m1) view;
            String str = m1Var.e;
            y60 G = y60.G((ViewGroup) this.fragmentView, null, m1Var);
            G.s = 40;
            G.c(R.drawable.menu_delete_old, gd.M0(2131746126, null), new c5(23, this, str), false);
            G.a0();
            return;
        }
        int i15 = l41Var.d;
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
                k6Var.a(n6.x0(null, n6.g7, r62), n6.x0(null, n6.E5, r62));
                k6Var.b(charSequenceArr[i16], i16 == bz.p0 ? true : r62);
                int i17 = n6.i6;
                org.telegram.ui.Cells.y h02 = n6.h0(n6.x0(null, i17, r62), 2, -1);
                q6 M = u6.M(i17);
                k6Var.setBackground(h02);
                u6.j(k6Var, h02, null, M, null);
                linearLayout.addView(k6Var);
                k6Var.setOnClickListener(new e5(i16, view, atomicReference));
                i16++;
                r62 = 0;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String M06 = gd.M0(2131745604, null);
            org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.a;
            u1Var5.S = M06;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(gd.M0(2131752578, null), null);
            atomicReference.set(u1Var5);
            showDialog(u1Var5);
            return;
        }
        if (i15 == 15 || i15 == 16) {
            boolean S22 = getMessagesController().S2();
            if (getMessagesController().R2(S22)) {
                b5.r0(this, gd.M0(2131742677, null), gd.M0(2131742678, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            i6 resourceProvider = getResourceProvider();
            u2 u2Var = new u2(i11, this, S22);
            Pattern pattern = b5.a;
            Activity W = org.telegram.messenger.g0.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
            String M07 = gd.M0(S22 ? 2131752857 : 2131752856, null);
            org.telegram.ui.ActionBar.u1 u1Var6 = alertDialog$Builder6.a;
            u1Var6.S = M07;
            u1Var6.U = gd.M0(S22 ? 2131752859 : 2131752858, null);
            a5 a5Var = new a5(parentActivity);
            a5Var.setTextSize(1, 16.0f);
            int i18 = n6.j5;
            u6.U(a5Var, i18, resourceProvider);
            u6.D(a5Var, n6.Oi, resourceProvider);
            a5Var.setHint(gd.M0(2131752860, null));
            a5Var.setInputType(17);
            a5Var.setImeOptions(6);
            a5Var.setSingleLine(true);
            a5Var.setFocusable(true);
            a5Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
            a5Var.setCursorWidth(1.5f);
            a5Var.A(n6.q6, resourceProvider);
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.r1(0.06f, n6.w0(i18, resourceProvider)));
            q6 K = u6.K(0.06f, i18);
            a5Var.setBackground(d02);
            u6.j(a5Var, d02, K, null, resourceProvider);
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(a5Var, u2Var, u1VarArr, currentFocus, 20);
            a5Var.setOnEditorActionListener(new org.telegram.ui.Components.g(iVar, i10));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(a5Var, ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            u1Var6.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
            alertDialog$Builder6.k(gd.M0(2131751343, null), new org.telegram.ui.Components.b0(iVar, i12));
            alertDialog$Builder6.h(gd.M0(2131752578, null), new cr(10));
            u1VarArr[0] = u1Var6;
            u1Var6.k0 = false;
            u1Var6.setOnDismissListener(new org.telegram.ui.Components.y0(a5Var, i10));
            u1VarArr[0].setOnShowListener(new org.telegram.ui.Components.c1(0, a5Var));
            u1VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.b51, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable g10 = i5.c.g(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(n6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(n6.k7), mode));
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
        c6 c6Var;
        if (i7 != ks.U5 || (c6Var = this.a) == null) {
            return;
        }
        c6Var.g3.O(true);
    }

    public final void f0() {
        z41 z41Var;
        if (cb.a(new t6(this, 24)) != null) {
            this.r = r0.size();
            c6 c6Var = this.a;
            if (c6Var != null && (z41Var = c6Var.g3) != null && c6Var.H) {
                z41Var.O(true);
            }
        }
        Utilities.e.c(new z0(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ks.U5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.U5);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            c2 c2Var = this.e;
            if (c2Var != null) {
                int themedColor = getThemedColor(n6.N6);
                int themedColor2 = getThemedColor(n6.k7);
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
                c6 c6Var = this.a;
                if (c6Var != null) {
                    c6Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
