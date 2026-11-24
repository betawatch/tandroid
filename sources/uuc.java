// default package

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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uuc extends n7c implements jm7 {
    public o38 e;
    public final xt f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public uuc(xt xtVar) {
        this.f = xtVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
                        z = false;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
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
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += e0(file2, bool);
                }
                return j;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // n7c
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        boolean O2 = getMessagesController().O2();
        arrayList.size();
        String M0 = jb6.M0(2131752810, null);
        c6c c6cVar = new c6c(9);
        c6cVar.d = 1;
        c6cVar.m = M0;
        c6cVar.L(O2);
        arrayList.add(c6cVar);
        arrayList.add(c6c.C(jb6.M0(2131752809, null)));
        int i = 0;
        if (!O2) {
            getMessagesController().Q2();
            c6c i2 = c6c.i(17, jb6.M0(2131742597, null));
            i2.L(getMessagesController().Q2());
            arrayList.add(i2);
            arrayList.add(c6c.C(jb6.M0(2131742596, null)));
            arrayList.add(c6c.u(jb6.M0(2131752818, null)));
            arrayList.size();
            o38 o38Var = this.e;
            String M02 = jb6.M0(2131752802, null);
            c6c c6cVar2 = new c6c(3);
            c6cVar2.d = 16;
            c6cVar2.H = o38Var;
            c6cVar2.m = M02;
            c6cVar2.r = true;
            arrayList.add(c6cVar2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().o5;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i);
                i++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j = webDomainException2.favicon;
                int i3 = suc.b;
                c6c K = c6c.K(suc.class);
                K.m = str;
                K.o = str2;
                K.C = j;
                arrayList.add(K);
            }
            arrayList.add(c6c.C(jb6.M0(2131752819, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            c6c e = c6c.e(5, jb6.M0(2131752801, null));
            e.s = true;
            arrayList.add(e);
            arrayList.add(c6c.C(null));
            return;
        }
        arrayList.size();
        String M03 = jb6.M0(2131752815, null);
        long j2 = this.n;
        arrayList.add(c6c.d(3, R.drawable.menu_clear_cookies, M03, j2 > 0 ? gm.i0(j2, false, false) : ""));
        arrayList.size();
        String M04 = jb6.M0(2131752817, null);
        long j3 = this.h;
        arrayList.add(c6c.d(2, R.drawable.menu_clear_cache, M04, j3 > 0 ? gm.i0(j3, false, false) : ""));
        arrayList.add(c6c.C(jb6.M0(2131752813, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(c6c.c(9, R.drawable.menu_clear_recent, jb6.M0(2131752803, null)));
            arrayList.size();
            arrayList.add(c6c.d(7, R.drawable.menu_clear_cache, jb6.M0(2131752808, null), jb6.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(c6c.C(null));
        }
        arrayList.add(c6c.u(jb6.M0(2131752799, null)));
        arrayList.size();
        o38 o38Var2 = this.e;
        String M05 = jb6.M0(2131752802, null);
        c6c c6cVar3 = new c6c(3);
        c6cVar3.d = 15;
        c6cVar3.H = o38Var2;
        c6cVar3.m = M05;
        c6cVar3.r = true;
        arrayList.add(c6cVar3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().o5;
        ArrayList<TL_account.WebDomainException> arrayList3 = tL_webBrowserSettings2 == null ? new ArrayList<>() : tL_webBrowserSettings2.external_exceptions;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList3.get(i4);
            i4++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str3 = webDomainException4.domain;
            String str4 = webDomainException4.title;
            long j4 = webDomainException4.favicon;
            int i5 = suc.b;
            c6c K2 = c6c.K(suc.class);
            K2.m = str3;
            K2.o = str4;
            K2.C = j4;
            arrayList.add(K2);
        }
        arrayList.add(c6c.C(jb6.M0(2131752800, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            c6c e2 = c6c.e(5, jb6.M0(2131752801, null));
            e2.s = true;
            arrayList.add(e2);
            arrayList.add(c6c.C(null));
        }
        arrayList.size();
        arrayList.add(c6c.d(6, R.drawable.msg_search, jb6.M0(2131745533, null), ku9.a().a));
        arrayList.add(c6c.C(jb6.M0(2131752795, null)));
        boolean z = e21.a;
    }

    @Override // n7c
    public final CharSequence a0() {
        return jb6.M0(2131752794, null);
    }

    @Override // n7c
    public final void b0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        if (i == 12) {
            gda.I();
            ((bjb) view).setChecked(gda.s0);
            return;
        }
        final byte b = 1;
        if (i == 13) {
            gda.t0 = !gda.t0;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putBoolean("onlyLocalInstantView", gda.t0);
            edit.apply();
            ((bjb) view).setChecked(gda.t0);
            return;
        }
        if (i == 17) {
            boolean z = !getMessagesController().Q2();
            oc7 messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.o5;
            if (tL_webBrowserSettings != null) {
                messagesController.C5(tL_webBrowserSettings.open_external_browser, z);
            }
            ((bjb) view).setChecked(z);
            this.a.g3.O(true);
            return;
        }
        final byte b2 = 0;
        if (i == 1) {
            oc7 messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.o5;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.C5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean O2 = getMessagesController().O2();
            bjb bjbVar = (bjb) view;
            bjbVar.setChecked(O2);
            bjbVar.b(cmb.w0(null, O2 ? cmb.e6 : cmb.d6, false), O2);
            this.a.g3.O(true);
            return;
        }
        if (i == 10) {
            oc7 messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.o5;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.C5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
            return;
        }
        byte b3 = 11;
        if (i == 11) {
            oc7 messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.o5;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.C5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
            return;
        }
        final byte b4 = 2;
        if (i == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = jb6.M0(2131752817, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.a0(null, null, 2131752816, this.h != 0 ? b10.j(new StringBuilder(" ("), gm.i0(this.h, false, false), ")") : "");
            alertDialog$Builder.j(jb6.M0(2131752038, null), new ee(this) { // from class: ruc
                public final /* synthetic */ uuc b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i2) {
                    byte b5 = b2;
                    uuc uucVar = this.b;
                    switch (b5) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(uucVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    uuc.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    uuc.d0(file2, null);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            x84 c = x84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            uucVar.f0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    uuc.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            uucVar.f0();
                            break;
                        case 2:
                            try {
                                crd.c.clear();
                                crd.d.clear();
                                File file4 = new File(bc4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                            uucVar.r = 0L;
                            uucVar.a.g3.O(true);
                            break;
                        default:
                            oc7 messagesController5 = uucVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.Y4(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                            uucVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
            return;
        }
        final byte b5 = 3;
        if (i == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M02 = jb6.M0(2131752815, null);
            he heVar2 = alertDialog$Builder2.a;
            heVar2.S = M02;
            heVar2.U = jb6.a0(null, null, 2131752814, this.n != 0 ? b10.j(new StringBuilder(" ("), gm.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.j(jb6.M0(2131752038, null), new ee(this) { // from class: ruc
                public final /* synthetic */ uuc b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar22, int i2) {
                    byte b52 = b;
                    uuc uucVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(uucVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    uuc.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    uuc.d0(file2, null);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            x84 c = x84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            uucVar.f0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    uuc.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            uucVar.f0();
                            break;
                        case 2:
                            try {
                                crd.c.clear();
                                crd.d.clear();
                                File file4 = new File(bc4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                            uucVar.r = 0L;
                            uucVar.a.g3.O(true);
                            break;
                        default:
                            oc7 messagesController5 = uucVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.Y4(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                            uucVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder2.c(-1);
            alertDialog$Builder2.o();
            return;
        }
        if (i == 7) {
            ArrayList a = crd.a(null);
            int size = a.size();
            long j = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < size) {
                Object obj = a.get(i2);
                i2++;
                j = Math.min(j, ((m11) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M03 = jb6.M0(2131752808, null);
            he heVar3 = alertDialog$Builder3.a;
            heVar3.S = M03;
            heVar3.U = jb6.a0(null, null, 2131752807, jb6.u(j / 1000, false));
            alertDialog$Builder3.j(jb6.M0(2131752038, null), new ee(this) { // from class: ruc
                public final /* synthetic */ uuc b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar22, int i22) {
                    byte b52 = b4;
                    uuc uucVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(uucVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    uuc.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    uuc.d0(file2, null);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            x84 c = x84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            uucVar.f0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    uuc.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            uucVar.f0();
                            break;
                        case 2:
                            try {
                                crd.c.clear();
                                crd.d.clear();
                                File file4 = new File(bc4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                            uucVar.r = 0L;
                            uucVar.a.g3.O(true);
                            break;
                        default:
                            oc7 messagesController5 = uucVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.Y4(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                            uucVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder3.c(-1);
            alertDialog$Builder3.o();
            return;
        }
        if (i == 9) {
            lg5[] lg5VarArr = {null};
            d lg5Var = new lg5(null, new ts9(this, lg5VarArr, (byte) 26));
            lg5VarArr[0] = lg5Var;
            presentFragment(lg5Var);
            return;
        }
        if (i == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M04 = jb6.M0(2131742600, null);
            he heVar4 = alertDialog$Builder4.a;
            heVar4.S = M04;
            heVar4.U = jb6.M0(2131742601, null);
            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee(this) { // from class: ruc
                public final /* synthetic */ uuc b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar22, int i22) {
                    byte b52 = b5;
                    uuc uucVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(uucVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    uuc.d0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    uuc.d0(file2, null);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            x84 c = x84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            uucVar.f0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    uuc.d0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            uucVar.f0();
                            break;
                        case 2:
                            try {
                                crd.c.clear();
                                crd.d.clear();
                                File file4 = new File(bc4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                            uucVar.r = 0L;
                            uucVar.a.g3.O(true);
                            break;
                        default:
                            oc7 messagesController5 = uucVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.Y4(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                            uucVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder4.c(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (c6cVar.H(suc.class)) {
            tuc tucVar = (tuc) view;
            String str = tucVar.e;
            bu5 G = bu5.G((ViewGroup) this.fragmentView, null, tucVar);
            G.s = (short) 40;
            G.b(R.drawable.menu_delete_old, jb6.M0(2131746054, null), new ptc(this, str, (byte) 4), false);
            G.a0();
            return;
        }
        int i3 = c6cVar.d;
        if (i3 == 6) {
            if (getParentActivity() != null) {
                AtomicReference atomicReference = new AtomicReference();
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                ArrayList b6 = ku9.b();
                int size2 = b6.size();
                CharSequence[] charSequenceArr = new CharSequence[size2];
                int i4 = 0;
                while (i4 < size2) {
                    charSequenceArr[i4] = ((ku9) b6.get(i4)).a;
                    x09 x09Var = new x09(getParentActivity(), null);
                    x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                    x09Var.a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                    x09Var.b(charSequenceArr[i4], i4 == gda.m0);
                    int i5 = cmb.h6;
                    fg0 f0 = cmb.f0(cmb.w0(null, i5, false), 2, -1);
                    wmb M = anb.M(i5);
                    x09Var.setBackground(f0);
                    anb.j(x09Var, f0, null, M, null);
                    linearLayout.addView(x09Var);
                    x09Var.setOnClickListener(new wh(i4, view, atomicReference));
                    i4++;
                }
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                String M05 = jb6.M0(2131745533, null);
                he heVar5 = alertDialog$Builder5.a;
                heVar5.S = M05;
                alertDialog$Builder5.n(linearLayout);
                alertDialog$Builder5.g(jb6.M0(2131752542, null), null);
                atomicReference.set(heVar5);
                showDialog(heVar5);
                return;
            }
            return;
        }
        if (i3 == 15 || i3 == 16) {
            boolean O22 = getMessagesController().O2();
            if (getMessagesController().N2(O22)) {
                ik.r0(this, jb6.M0(2131742598, null), jb6.M0(2131742599, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            ylb resourceProvider = getResourceProvider();
            ra raVar = new ra(b3, this, O22);
            Pattern pattern = ik.a;
            Activity W = gm.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            he[] heVarArr = new he[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, resourceProvider, parentActivity);
            String M06 = jb6.M0(O22 ? 2131752821 : 2131752820, null);
            he heVar6 = alertDialog$Builder6.a;
            heVar6.S = M06;
            heVar6.U = jb6.M0(O22 ? 2131752823 : 2131752822, null);
            hk hkVar = new hk(parentActivity);
            hkVar.setTextSize(1, 16.0f);
            int i6 = cmb.i5;
            anb.X(hkVar, i6, resourceProvider);
            anb.D(hkVar, cmb.Ni, resourceProvider);
            hkVar.setHint(jb6.M0(2131752824, null));
            hkVar.setInputType(17);
            hkVar.setImeOptions(6);
            hkVar.setSingleLine(true);
            hkVar.setFocusable(true);
            hkVar.setPadding(gm.L(16.0f), gm.L(13.0f), gm.L(16.0f), gm.L(13.0f));
            hkVar.setCursorWidth(1.5f);
            hkVar.A(cmb.p6, resourceProvider);
            ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i6, resourceProvider)));
            wmb K = anb.K(0.06f, i6);
            hkVar.setBackground(b0);
            anb.j(hkVar, b0, K, null, resourceProvider);
            l97 l97Var = new l97(hkVar, raVar, heVarArr, currentFocus, (byte) 6);
            hkVar.setOnEditorActionListener(new j(l97Var, b5));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(hkVar, qoe.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.b();
            alertDialog$Builder6.n(linearLayout2);
            heVar6.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
            alertDialog$Builder6.j(jb6.M0(2131751291, null), new l0(l97Var, b3));
            alertDialog$Builder6.g(jb6.M0(2131752542, null), new c((byte) 16));
            heVarArr[0] = heVar6;
            heVar6.k0 = false;
            heVar6.setOnDismissListener(new n1(hkVar, (byte) 3));
            heVarArr[0].setOnShowListener(new bf(hkVar, (byte) 0));
            heVarArr[0].show();
        }
    }

    @Override // n7c
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override // n7c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable d = b10.d(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(cmb.M6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        d.setColorFilter(new PorterDuffColorFilter(getThemedColor(cmb.j7), mode));
        o38 o38Var = new o38(mutate, d, (byte) 4);
        o38Var.y = gm.L(2.0f);
        this.e = o38Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i != nm7.V5 || (vaVar = this.a) == null) {
            return;
        }
        vaVar.g3.O(true);
    }

    public final void f0() {
        l7c l7cVar;
        if (crd.a(new eg9(this, (byte) 29)) != null) {
            this.r = r0.size();
            va vaVar = this.a;
            if (vaVar != null && (l7cVar = vaVar.g3) != null && vaVar.H) {
                l7cVar.O(true);
            }
        }
        Utilities.e.c(new cpc(this, (byte) 10));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().b(this, nm7.V5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.V5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            o38 o38Var = this.e;
            if (o38Var != null) {
                int themedColor = getThemedColor(cmb.M6);
                int themedColor2 = getThemedColor(cmb.j7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = o38Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = o38Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                va vaVar = this.a;
                if (vaVar != null) {
                    vaVar.h1();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
