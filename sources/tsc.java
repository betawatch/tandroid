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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tsc extends n5c implements gk7 {
    public m18 e;
    public final ws f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public tsc(ws wsVar) {
        this.f = wsVar;
    }

    public static boolean c0(File file, Boolean bool) {
        boolean z;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !c0(file2, bool)) {
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

    public static long d0(File file, Boolean bool) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += d0(file2, bool);
                }
                return j;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // n5c
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = k96.M0(2131752845, null);
        c4c c4cVar = new c4c(9);
        c4cVar.d = 1;
        c4cVar.m = M0;
        c4cVar.L(M2);
        arrayList.add(c4cVar);
        arrayList.add(c4c.C(k96.M0(2131752844, null)));
        int i = 0;
        if (!M2) {
            getMessagesController().O2();
            c4c i2 = c4c.i(17, k96.M0(2131742671, null));
            i2.L(getMessagesController().O2());
            arrayList.add(i2);
            arrayList.add(c4c.C(k96.M0(2131742670, null)));
            arrayList.add(c4c.u(k96.M0(2131752853, null)));
            arrayList.size();
            m18 m18Var = this.e;
            String M02 = k96.M0(2131752837, null);
            c4c c4cVar2 = new c4c(3);
            c4cVar2.d = 16;
            c4cVar2.H = m18Var;
            c4cVar2.m = M02;
            c4cVar2.r = true;
            arrayList.add(c4cVar2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().m5;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i);
                i++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j = webDomainException2.favicon;
                int i3 = rsc.b;
                c4c K = c4c.K(rsc.class);
                K.m = str;
                K.o = str2;
                K.C = j;
                arrayList.add(K);
            }
            arrayList.add(c4c.C(k96.M0(2131752854, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            c4c e = c4c.e(5, k96.M0(2131752836, null));
            e.s = true;
            arrayList.add(e);
            arrayList.add(c4c.C(null));
            return;
        }
        arrayList.size();
        String M03 = k96.M0(2131752850, null);
        long j2 = this.n;
        arrayList.add(c4c.d(3, R.drawable.menu_clear_cookies, M03, j2 > 0 ? gl.i0(j2, false, false) : ""));
        arrayList.size();
        String M04 = k96.M0(2131752852, null);
        long j3 = this.h;
        arrayList.add(c4c.d(2, R.drawable.menu_clear_cache, M04, j3 > 0 ? gl.i0(j3, false, false) : ""));
        arrayList.add(c4c.C(k96.M0(2131752848, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(c4c.c(9, R.drawable.menu_clear_recent, k96.M0(2131752838, null)));
            arrayList.size();
            arrayList.add(c4c.d(7, R.drawable.menu_clear_cache, k96.M0(2131752843, null), k96.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(c4c.C(null));
        }
        arrayList.add(c4c.u(k96.M0(2131752834, null)));
        arrayList.size();
        m18 m18Var2 = this.e;
        String M05 = k96.M0(2131752837, null);
        c4c c4cVar3 = new c4c(3);
        c4cVar3.d = 15;
        c4cVar3.H = m18Var2;
        c4cVar3.m = M05;
        c4cVar3.r = true;
        arrayList.add(c4cVar3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().m5;
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
            int i5 = rsc.b;
            c4c K2 = c4c.K(rsc.class);
            K2.m = str3;
            K2.o = str4;
            K2.C = j4;
            arrayList.add(K2);
        }
        arrayList.add(c4c.C(k96.M0(2131752835, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            c4c e2 = c4c.e(5, k96.M0(2131752836, null));
            e2.s = true;
            arrayList.add(e2);
            arrayList.add(c4c.C(null));
        }
        arrayList.size();
        arrayList.add(c4c.d(6, R.drawable.msg_search, k96.M0(2131745607, null), is9.a().a));
        arrayList.add(c4c.C(k96.M0(2131752830, null)));
        boolean z = w01.a;
    }

    @Override // n5c
    public final CharSequence Z() {
        return k96.M0(2131752829, null);
    }

    @Override // n5c
    public final void a0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        if (i == 12) {
            gba.I();
            ((ahb) view).setChecked(gba.s0);
            return;
        }
        final byte b = 1;
        if (i == 13) {
            gba.t0 = !gba.t0;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putBoolean("onlyLocalInstantView", gba.t0);
            edit.apply();
            ((ahb) view).setChecked(gba.t0);
            return;
        }
        if (i == 17) {
            boolean z = !getMessagesController().O2();
            na7 messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.m5;
            if (tL_webBrowserSettings != null) {
                messagesController.A5(tL_webBrowserSettings.open_external_browser, z);
            }
            ((ahb) view).setChecked(z);
            this.a.g3.O(true);
            return;
        }
        final byte b2 = 0;
        if (i == 1) {
            na7 messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.m5;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.A5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean M2 = getMessagesController().M2();
            ahb ahbVar = (ahb) view;
            ahbVar.setChecked(M2);
            ahbVar.b(bkb.w0(null, M2 ? bkb.e6 : bkb.d6, false), M2);
            this.a.g3.O(true);
            return;
        }
        if (i == 10) {
            na7 messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.m5;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.A5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
            return;
        }
        byte b3 = 11;
        if (i == 11) {
            na7 messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.m5;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.A5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
            return;
        }
        final byte b4 = 2;
        if (i == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = k96.M0(2131752852, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.a0(null, null, 2131752851, this.h != 0 ? b00.j(new StringBuilder(" ("), gl.i0(this.h, false, false), ")") : "");
            alertDialog$Builder.j(k96.M0(2131752089, null), new ed(this) { // from class: qsc
                public final /* synthetic */ tsc b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i2) {
                    byte b5 = b2;
                    tsc tscVar = this.b;
                    switch (b5) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(tscVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    tsc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    tsc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            o74 c = o74.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            tscVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    tsc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                            }
                            tscVar.e0();
                            break;
                        case 2:
                            try {
                                zod.c.clear();
                                zod.d.clear();
                                File file4 = new File(ba4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                            tscVar.r = 0L;
                            tscVar.a.g3.O(true);
                            break;
                        default:
                            na7 messagesController5 = tscVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.m5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.m5.inapp_exceptions.clear();
                                messagesController5.W4(messagesController5.m5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new hc((byte) 0), new k67(messagesController5, (byte) 6));
                            tscVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
            return;
        }
        final byte b5 = 3;
        if (i == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M02 = k96.M0(2131752850, null);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = M02;
            hdVar2.U = k96.a0(null, null, 2131752849, this.n != 0 ? b00.j(new StringBuilder(" ("), gl.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.j(k96.M0(2131752089, null), new ed(this) { // from class: qsc
                public final /* synthetic */ tsc b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar22, int i2) {
                    byte b52 = b;
                    tsc tscVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(tscVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    tsc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    tsc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            o74 c = o74.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            tscVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    tsc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                            }
                            tscVar.e0();
                            break;
                        case 2:
                            try {
                                zod.c.clear();
                                zod.d.clear();
                                File file4 = new File(ba4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                            tscVar.r = 0L;
                            tscVar.a.g3.O(true);
                            break;
                        default:
                            na7 messagesController5 = tscVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.m5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.m5.inapp_exceptions.clear();
                                messagesController5.W4(messagesController5.m5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new hc((byte) 0), new k67(messagesController5, (byte) 6));
                            tscVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
            alertDialog$Builder2.c(-1);
            alertDialog$Builder2.o();
            return;
        }
        if (i == 7) {
            ArrayList a = zod.a(null);
            int size = a.size();
            long j = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < size) {
                Object obj = a.get(i2);
                i2++;
                j = Math.min(j, ((e01) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M03 = k96.M0(2131752843, null);
            hd hdVar3 = alertDialog$Builder3.a;
            hdVar3.S = M03;
            hdVar3.U = k96.a0(null, null, 2131752842, k96.u(j / 1000, false));
            alertDialog$Builder3.j(k96.M0(2131752089, null), new ed(this) { // from class: qsc
                public final /* synthetic */ tsc b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar22, int i22) {
                    byte b52 = b4;
                    tsc tscVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(tscVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    tsc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    tsc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            o74 c = o74.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            tscVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    tsc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                            }
                            tscVar.e0();
                            break;
                        case 2:
                            try {
                                zod.c.clear();
                                zod.d.clear();
                                File file4 = new File(ba4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                            tscVar.r = 0L;
                            tscVar.a.g3.O(true);
                            break;
                        default:
                            na7 messagesController5 = tscVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.m5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.m5.inapp_exceptions.clear();
                                messagesController5.W4(messagesController5.m5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new hc((byte) 0), new k67(messagesController5, (byte) 6));
                            tscVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.g(k96.M0(2131752577, null), null);
            alertDialog$Builder3.c(-1);
            alertDialog$Builder3.o();
            return;
        }
        if (i == 9) {
            me5[] me5VarArr = {null};
            d me5Var = new me5(null, new nu9(this, me5VarArr, (byte) 25));
            me5VarArr[0] = me5Var;
            presentFragment(me5Var);
            return;
        }
        if (i == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M04 = k96.M0(2131742674, null);
            hd hdVar4 = alertDialog$Builder4.a;
            hdVar4.S = M04;
            hdVar4.U = k96.M0(2131742675, null);
            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed(this) { // from class: qsc
                public final /* synthetic */ tsc b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar22, int i22) {
                    byte b52 = b5;
                    tsc tscVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(tscVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    tsc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    tsc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            o74 c = o74.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            tscVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    tsc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                            }
                            tscVar.e0();
                            break;
                        case 2:
                            try {
                                zod.c.clear();
                                zod.d.clear();
                                File file4 = new File(ba4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                            tscVar.r = 0L;
                            tscVar.a.g3.O(true);
                            break;
                        default:
                            na7 messagesController5 = tscVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.m5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.m5.inapp_exceptions.clear();
                                messagesController5.W4(messagesController5.m5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new hc((byte) 0), new k67(messagesController5, (byte) 6));
                            tscVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.g(k96.M0(2131752577, null), null);
            alertDialog$Builder4.c(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (c4cVar.H(rsc.class)) {
            ssc sscVar = (ssc) view;
            String str = sscVar.e;
            cs5 G = cs5.G((ViewGroup) this.fragmentView, null, sscVar);
            G.s = (short) 40;
            G.b(R.drawable.menu_delete_old, k96.M0(2131746128, null), new isc(this, str, (byte) 2), false);
            G.a0();
            return;
        }
        int i3 = c4cVar.d;
        if (i3 == 6) {
            if (getParentActivity() != null) {
                AtomicReference atomicReference = new AtomicReference();
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                ArrayList b6 = is9.b();
                int size2 = b6.size();
                CharSequence[] charSequenceArr = new CharSequence[size2];
                int i4 = 0;
                while (i4 < size2) {
                    charSequenceArr[i4] = ((is9) b6.get(i4)).a;
                    wy8 wy8Var = new wy8(getParentActivity(), null);
                    wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                    wy8Var.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                    wy8Var.b(charSequenceArr[i4], i4 == gba.m0);
                    int i5 = bkb.h6;
                    ff0 f0 = bkb.f0(bkb.w0(null, i5, false), 2, -1);
                    vkb M = zkb.M(i5);
                    wy8Var.setBackground(f0);
                    zkb.j(wy8Var, f0, null, M, null);
                    linearLayout.addView(wy8Var);
                    wy8Var.setOnClickListener(new wg(i4, view, atomicReference));
                    i4++;
                }
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                String M05 = k96.M0(2131745607, null);
                hd hdVar5 = alertDialog$Builder5.a;
                hdVar5.S = M05;
                alertDialog$Builder5.n(linearLayout);
                alertDialog$Builder5.g(k96.M0(2131752577, null), null);
                atomicReference.set(hdVar5);
                showDialog(hdVar5);
                return;
            }
            return;
        }
        if (i3 == 15 || i3 == 16) {
            boolean M22 = getMessagesController().M2();
            if (getMessagesController().L2(M22)) {
                ij.r0(this, k96.M0(2131742672, null), k96.M0(2131742673, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            wjb resourceProvider = getResourceProvider();
            ra raVar = new ra(b3, this, M22);
            Pattern pattern = ij.a;
            Activity W = gl.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            hd[] hdVarArr = new hd[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, resourceProvider, parentActivity);
            String M06 = k96.M0(M22 ? 2131752856 : 2131752855, null);
            hd hdVar6 = alertDialog$Builder6.a;
            hdVar6.S = M06;
            hdVar6.U = k96.M0(M22 ? 2131752858 : 2131752857, null);
            hj hjVar = new hj(parentActivity);
            hjVar.setTextSize(1, 16.0f);
            int i6 = bkb.i5;
            zkb.X(hjVar, i6, resourceProvider);
            zkb.D(hjVar, bkb.Ni, resourceProvider);
            hjVar.setHint(k96.M0(2131752859, null));
            hjVar.setInputType(17);
            hjVar.setImeOptions(6);
            hjVar.setSingleLine(true);
            hjVar.setFocusable(true);
            hjVar.setPadding(gl.L(16.0f), gl.L(13.0f), gl.L(16.0f), gl.L(13.0f));
            hjVar.setCursorWidth(1.5f);
            hjVar.A(bkb.p6, resourceProvider);
            ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i6, resourceProvider)));
            vkb K = zkb.K(0.06f, i6);
            hjVar.setBackground(b0);
            zkb.j(hjVar, b0, K, null, resourceProvider);
            s67 s67Var = new s67(hjVar, raVar, hdVarArr, currentFocus, (byte) 6);
            hjVar.setOnEditorActionListener(new j(s67Var, b4));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(hjVar, nme.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.b();
            alertDialog$Builder6.n(linearLayout2);
            hdVar6.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
            alertDialog$Builder6.j(k96.M0(2131751342, null), new l0(s67Var, (byte) 9));
            alertDialog$Builder6.g(k96.M0(2131752577, null), new c((byte) 16));
            hdVarArr[0] = hdVar6;
            hdVar6.k0 = false;
            hdVar6.setOnDismissListener(new n1(hjVar, (byte) 3));
            hdVarArr[0].setOnShowListener(new be(hjVar, (byte) 0));
            hdVarArr[0].show();
        }
    }

    @Override // n5c
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override // n5c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable d = b00.d(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(bkb.M6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        d.setColorFilter(new PorterDuffColorFilter(getThemedColor(bkb.j7), mode));
        m18 m18Var = new m18(mutate, d, (byte) 4);
        m18Var.y = gl.L(2.0f);
        this.e = m18Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i != kk7.T5 || (vaVar = this.a) == null) {
            return;
        }
        vaVar.g3.O(true);
    }

    public final void e0() {
        l5c l5cVar;
        if (zod.a(new ae9(this, (byte) 29)) != null) {
            this.r = r0.size();
            va vaVar = this.a;
            if (vaVar != null && (l5cVar = vaVar.g3) != null && vaVar.H) {
                l5cVar.O(true);
            }
        }
        Utilities.e.c(new frc(this, (byte) 2));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        e0();
        getNotificationCenter().b(this, kk7.T5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.T5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            m18 m18Var = this.e;
            if (m18Var != null) {
                int themedColor = getThemedColor(bkb.M6);
                int themedColor2 = getThemedColor(bkb.j7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = m18Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = m18Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                va vaVar = this.a;
                if (vaVar != null) {
                    vaVar.h1();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
