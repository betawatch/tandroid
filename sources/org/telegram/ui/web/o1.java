package org.telegram.ui.web;

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
import bi.b9;
import bi.la;
import c8.ha;
import c8.xa;
import di.i2;
import fi.w3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.fl;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.m6;
import org.telegram.ui.zq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class o1 extends n41 implements ls {
    public i2 e;
    public final c20 f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public o1(org.telegram.ui.q qVar) {
        this.f = qVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z9;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z9 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
                        z9 = false;
                    }
                }
            } else {
                z9 = true;
            }
            if (z9) {
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

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = id.M0(2131752857, null);
        x31 x31Var = new x31(9);
        x31Var.d = 1;
        x31Var.l = M0;
        x31Var.L(M2);
        arrayList.add(x31Var);
        arrayList.add(x31.C(id.M0(2131752856, null)));
        int i7 = 0;
        if (!M2) {
            getMessagesController().O2();
            x31 i10 = x31.i(17, id.M0(2131742937, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(x31.C(id.M0(2131742936, null)));
            arrayList.add(x31.u(id.M0(2131752865, null)));
            arrayList.size();
            i2 i2Var = this.e;
            String M02 = id.M0(2131752849, null);
            x31 x31Var2 = new x31(3);
            x31Var2.d = 16;
            x31Var2.G = i2Var;
            x31Var2.l = M02;
            x31Var2.q = true;
            arrayList.add(x31Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().y8;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i7 < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i7);
                i7++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j3 = webDomainException2.favicon;
                int i11 = m1.b;
                x31 K = x31.K(m1.class);
                K.l = str;
                K.n = str2;
                K.B = j3;
                arrayList.add(K);
            }
            arrayList.add(x31.C(id.M0(2131752866, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            x31 e10 = x31.e(5, id.M0(2131752848, null));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(x31.C(null));
            return;
        }
        arrayList.size();
        String M03 = id.M0(2131752862, null);
        long j10 = this.n;
        arrayList.add(x31.d(3, R.drawable.menu_clear_cookies, M03, j10 > 0 ? org.telegram.messenger.g0.i0(j10, false, false) : ""));
        arrayList.size();
        String M04 = id.M0(2131752864, null);
        long j11 = this.h;
        arrayList.add(x31.d(2, R.drawable.menu_clear_cache, M04, j11 > 0 ? org.telegram.messenger.g0.i0(j11, false, false) : ""));
        arrayList.add(x31.C(id.M0(2131752860, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(x31.c(9, R.drawable.menu_clear_recent, id.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(x31.d(7, R.drawable.menu_clear_cache, id.M0(2131752855, null), id.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(x31.C(null));
        }
        arrayList.add(x31.u(id.M0(2131752846, null)));
        arrayList.size();
        i2 i2Var2 = this.e;
        String M05 = id.M0(2131752849, null);
        x31 x31Var3 = new x31(3);
        x31Var3.d = 15;
        x31Var3.G = i2Var2;
        x31Var3.l = M05;
        x31Var3.q = true;
        arrayList.add(x31Var3);
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
            long j12 = webDomainException4.favicon;
            int i13 = m1.b;
            x31 K2 = x31.K(m1.class);
            K2.l = str3;
            K2.n = str4;
            K2.B = j12;
            arrayList.add(K2);
        }
        arrayList.add(x31.C(id.M0(2131752847, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            x31 e11 = x31.e(5, id.M0(2131752848, null));
            e11.r = true;
            arrayList.add(e11);
            arrayList.add(x31.C(null));
        }
        arrayList.size();
        arrayList.add(x31.d(6, R.drawable.msg_search, id.M0(2131745802, null), f1.a().a));
        arrayList.add(x31.C(id.M0(2131752842, null)));
        boolean z9 = r2.a;
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return id.M0(2131752841, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
        int i7 = x31Var.d;
        if (i7 == 12) {
            iz.J();
            ((r8) view).setChecked(iz.v0);
            return;
        }
        final int i10 = 1;
        if (i7 == 13) {
            iz.w0 = !iz.w0;
            SharedPreferences.Editor edit = qp.e1().edit();
            edit.putBoolean("onlyLocalInstantView", iz.w0);
            edit.apply();
            ((r8) view).setChecked(iz.w0);
            return;
        }
        if (i7 == 17) {
            boolean z9 = !getMessagesController().O2();
            qp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.y8;
            if (tL_webBrowserSettings != null) {
                messagesController.u5(tL_webBrowserSettings.open_external_browser, z9);
            }
            ((r8) view).setChecked(z9);
            this.a.f3.O(true);
            return;
        }
        ?? r72 = 0;
        Object[] objArr = 0;
        if (i7 == 1) {
            qp messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.y8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.u5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean M2 = getMessagesController().M2();
            r8 r8Var = (r8) view;
            r8Var.setChecked(M2);
            r8Var.b(k6.x0(null, M2 ? k6.f6 : k6.e6, false), M2);
            this.a.f3.O(true);
            return;
        }
        int i11 = 10;
        if (i7 == 10) {
            qp messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.y8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.u5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.f3.O(true);
            return;
        }
        if (i7 == 11) {
            qp messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.y8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.u5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.f3.O(true);
            return;
        }
        final int i12 = 2;
        if (i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = id.M0(2131752864, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = id.a0(null, null, 2131752863, this.h != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")") : "");
            String M02 = id.M0(2131752101, null);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.l1
                public final /* synthetic */ o1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                    switch (objArr2) {
                        case 0:
                            o1 o1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(o1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    o1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    o1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            b2 b10 = b2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            o1Var.f0();
                            break;
                        case 1:
                            o1 o1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    o1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            o1Var2.f0();
                            break;
                        case 2:
                            o1 o1Var3 = this.b;
                            try {
                                xa.c.clear();
                                xa.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            o1Var3.r = 0L;
                            o1Var3.a.f3.O(true);
                            break;
                        default:
                            o1 o1Var4 = this.b;
                            qp messagesController5 = o1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                            o1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i13 = 3;
        if (i7 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M03 = id.M0(2131752862, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.R = M03;
            u1Var2.T = id.a0(null, null, 2131752861, this.n != 0 ? a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.l1
                public final /* synthetic */ o1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                    switch (i10) {
                        case 0:
                            o1 o1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(o1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    o1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    o1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            b2 b10 = b2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            o1Var.f0();
                            break;
                        case 1:
                            o1 o1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    o1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            o1Var2.f0();
                            break;
                        case 2:
                            o1 o1Var3 = this.b;
                            try {
                                xa.c.clear();
                                xa.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            o1Var3.r = 0L;
                            o1Var3.a.f3.O(true);
                            break;
                        default:
                            o1 o1Var4 = this.b;
                            qp messagesController5 = o1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                            o1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(id.M0(2131752589, null), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
            return;
        }
        if (i7 == 7) {
            ArrayList a10 = xa.a(null);
            int size = a10.size();
            long j3 = Long.MAX_VALUE;
            int i14 = 0;
            while (i14 < size) {
                Object obj = a10.get(i14);
                i14++;
                j3 = Math.min(j3, ((y0) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M04 = id.M0(2131752855, null);
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
            u1Var3.R = M04;
            u1Var3.T = id.a0(null, null, 2131752854, id.u(j3 / 1000, false));
            alertDialog$Builder3.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.l1
                public final /* synthetic */ o1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                    switch (i12) {
                        case 0:
                            o1 o1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(o1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    o1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    o1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            b2 b10 = b2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            o1Var.f0();
                            break;
                        case 1:
                            o1 o1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    o1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            o1Var2.f0();
                            break;
                        case 2:
                            o1 o1Var3 = this.b;
                            try {
                                xa.c.clear();
                                xa.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            o1Var3.r = 0L;
                            o1Var3.a.f3.O(true);
                            break;
                        default:
                            o1 o1Var4 = this.b;
                            qp messagesController5 = o1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                            o1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(id.M0(2131752589, null), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i7 == 9) {
            z0[] z0VarArr = {null};
            f2 z0Var = new z0(null, new org.telegram.ui.Wallet.t(13, this, z0VarArr));
            z0VarArr[0] = z0Var;
            presentFragment(z0Var);
            return;
        }
        int i15 = 5;
        if (i7 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M05 = id.M0(2131742940, null);
            org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
            u1Var4.R = M05;
            u1Var4.T = id.M0(2131742941, null);
            alertDialog$Builder4.k(id.M0(2131751599, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.l1
                public final /* synthetic */ o1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                    switch (i13) {
                        case 0:
                            o1 o1Var = this.b;
                            org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                            org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(o1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    o1.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            try {
                                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    o1.d0(file2, null);
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            b2 b10 = b2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            o1Var.f0();
                            break;
                        case 1:
                            o1 o1Var2 = this.b;
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    o1.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            o1Var2.f0();
                            break;
                        case 2:
                            o1 o1Var3 = this.b;
                            try {
                                xa.c.clear();
                                xa.d.clear();
                                File file4 = new File(w7.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            o1Var3.r = 0L;
                            o1Var3.a.f3.O(true);
                            break;
                        default:
                            o1 o1Var4 = this.b;
                            qp messagesController5 = o1Var4.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.y8;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.y8.inapp_exceptions.clear();
                                messagesController5.Q4(messagesController5.y8);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                            o1Var4.a.f3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(id.M0(2131752589, null), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (x31Var.H(m1.class)) {
            n1 n1Var = (n1) view;
            String str = n1Var.e;
            k60 F = k60.F((ViewGroup) this.fragmentView, null, n1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, id.M0(2131746322, null), new w(i15, this, str), false);
            F.Z();
            return;
        }
        int i16 = x31Var.d;
        if (i16 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = f1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i17 = 0;
            while (i17 < size2) {
                charSequenceArr[i17] = ((f1) b10.get(i17)).a;
                j6 j6Var = new j6(getParentActivity(), null);
                j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r72, org.telegram.messenger.g0.L(4.0f), r72);
                j6Var.a(k6.x0(null, k6.g7, r72), k6.x0(null, k6.E5, r72));
                j6Var.b(charSequenceArr[i17], i17 == iz.p0 ? true : r72);
                int i18 = k6.i6;
                org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i18, r72), 2, -1);
                n6 N = r6.N(i18);
                j6Var.setBackground(h02);
                r6.k(j6Var, h02, null, N, null);
                linearLayout.addView(j6Var);
                j6Var.setOnClickListener(new la(i17, view, atomicReference));
                i17++;
                r72 = 0;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String M06 = id.M0(2131745802, null);
            org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.a;
            u1Var5.R = M06;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(id.M0(2131752589, null), null);
            atomicReference.set(u1Var5);
            showDialog(u1Var5);
            return;
        }
        if (i16 == 15 || i16 == 16) {
            boolean M22 = getMessagesController().M2();
            if (getMessagesController().L2(M22)) {
                v4.r0(this, id.M0(2131742938, null), id.M0(2131742939, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            f6 resourceProvider = getResourceProvider();
            b9 b9Var = new b9(i11, this, M22);
            Pattern pattern = v4.a;
            Activity W = org.telegram.messenger.g0.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
            String M07 = id.M0(M22 ? 2131752868 : 2131752867, null);
            org.telegram.ui.ActionBar.u1 u1Var6 = alertDialog$Builder6.a;
            u1Var6.R = M07;
            u1Var6.T = id.M0(M22 ? 2131752870 : 2131752869, null);
            u4 u4Var = new u4(parentActivity);
            u4Var.setTextSize(1, 16.0f);
            int i19 = k6.j5;
            r6.V(u4Var, i19, resourceProvider);
            r6.E(u4Var, k6.Li, resourceProvider);
            u4Var.setHint(id.M0(2131752871, null));
            u4Var.setInputType(17);
            u4Var.setImeOptions(6);
            u4Var.setSingleLine(true);
            u4Var.setFocusable(true);
            u4Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
            u4Var.setCursorWidth(1.5f);
            u4Var.z(k6.q6, resourceProvider);
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.r1(0.06f, k6.w0(i19, resourceProvider)));
            n6 L = r6.L(0.06f, i19);
            u4Var.setBackground(d02);
            r6.k(u4Var, d02, L, null, resourceProvider);
            m6 m6Var = new m6(u4Var, b9Var, u1VarArr, currentFocus, 15);
            u4Var.setOnEditorActionListener(new org.telegram.ui.Components.t0(m6Var, 0));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(u4Var, ha.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            u1Var6.a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.q.x * 85) / 100);
            alertDialog$Builder6.k(id.M0(2131751355, null), new org.telegram.ui.Components.u(m6Var, i12));
            alertDialog$Builder6.h(id.M0(2131752589, null), new zq(5));
            u1VarArr[0] = u1Var6;
            u1Var6.j0 = false;
            u1Var6.setOnDismissListener(new org.telegram.ui.Components.p0(u4Var, i10));
            u1VarArr[0].setOnShowListener(new org.telegram.ui.Components.u0(0, u4Var));
            u1VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable h = jg.g.h(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(k6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        h.setColorFilter(new PorterDuffColorFilter(getThemedColor(k6.k7), mode));
        i2 i2Var = new i2(mutate, h, 4);
        i2Var.y = org.telegram.messenger.g0.L(2.0f);
        this.e = i2Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        w3 w3Var;
        if (i7 != qs.R5 || (w3Var = this.a) == null) {
            return;
        }
        w3Var.f3.O(true);
    }

    public final void f0() {
        l41 l41Var;
        if (xa.a(new ii.c(this, 18)) != null) {
            this.r = r0.size();
            w3 w3Var = this.a;
            if (w3Var != null && (l41Var = w3Var.f3) != null && w3Var.G) {
                l41Var.O(true);
            }
        }
        Utilities.e.c(new m5(this, 18));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, qs.R5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, qs.R5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            i2 i2Var = this.e;
            if (i2Var != null) {
                int themedColor = getThemedColor(k6.N6);
                int themedColor2 = getThemedColor(k6.k7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = i2Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = i2Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                w3 w3Var = this.a;
                if (w3Var != null) {
                    w3Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
