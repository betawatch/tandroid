package org.telegram.ui.web;

import ai.ha;
import ai.y8;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import ci.p2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Wallet.z3;
import org.telegram.ui.rr;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class x1 extends w61 implements NotificationCenter.NotificationCenterDelegate {
    public p2 d;
    public final Utilities.Callback e;
    public long f;
    public long h;
    public long n;

    public x1(org.telegram.ui.r rVar) {
        this.e = rVar;
    }

    public static boolean Y(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !Y(file2, bool)) {
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

    public static long Z(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += Z(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.w61
    public final void U(ArrayList arrayList, t61 t61Var) {
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        g61 g61Var = new g61(9);
        g61Var.d = 1;
        g61Var.l = string;
        g61Var.K(isWebBrowserInAppEnabled);
        arrayList.add(g61Var);
        i2.e.B(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            g61 i10 = g61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            i2.e.B(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(g61.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            p2 p2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            g61 g61Var2 = new g61(3);
            g61Var2.d = 16;
            g61Var2.G = p2Var;
            g61Var2.l = string2;
            g61Var2.q = true;
            arrayList.add(g61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = v1.a;
                g61 J = g61.J(v1.class);
                J.l = str;
                J.n = str2;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(g61.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            g61 e = g61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e.r = true;
            arrayList.add(e);
            arrayList.add(g61.B(null));
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.h;
        arrayList.add(g61.d(3, i12, string3, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f;
        arrayList.add(g61.d(2, i13, string4, j12 > 0 ? AndroidUtilities.formatFileSize(j12) : ""));
        i2.e.B(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.n > 0) {
            arrayList.size();
            arrayList.add(g61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(g61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.n, ',')));
            arrayList.add(g61.B(null));
        }
        arrayList.add(g61.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        p2 p2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        g61 g61Var3 = new g61(3);
        g61Var3.d = 15;
        g61Var3.G = p2Var2;
        g61Var3.l = string5;
        g61Var3.q = true;
        arrayList.add(g61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = v1.a;
            g61 J2 = g61.J(v1.class);
            J2.l = str3;
            J2.n = str4;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(g61.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            g61 e7 = g61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.r = true;
            arrayList.add(e7);
            arrayList.add(g61.B(null));
        }
        arrayList.size();
        arrayList.add(g61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), m1.a().a));
        i2.e.B(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            g61 i15 = g61.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            g61 i16 = g61.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override // org.telegram.ui.Components.w61
    public final void W(g61 g61Var, View view) {
        int i10 = g61Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((v8) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((v8) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((v8) view).setChecked(z10);
            this.a.W2.N(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            v8 v8Var = (v8) view;
            v8Var.setChecked(isWebBrowserInAppEnabled);
            v8Var.b(h6.x0(null, isWebBrowserInAppEnabled ? h6.f6 : h6.e6, false), isWebBrowserInAppEnabled);
            this.a.W2.N(true);
            return;
        }
        int i13 = 10;
        if (i10 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.a.W2.N(true);
            return;
        }
        if (i10 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.a.W2.N(true);
            return;
        }
        String str = "";
        final int i14 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            int i15 = R.string.BrowserSettingsCacheClearText;
            if (this.f != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.f) + ")";
            }
            b2Var.T = LocaleController.formatString(i15, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.u1
                public final /* synthetic */ x1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i16) {
                    switch (i12) {
                        case 0:
                            x1 x1Var = this.b;
                            x1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(x1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    x1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    x1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            m2 b10 = m2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            x1Var.a0();
                            break;
                        case 1:
                            x1 x1Var2 = this.b;
                            x1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    x1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            x1Var2.a0();
                            break;
                        case 2:
                            x1 x1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            x1Var3.n = 0L;
                            x1Var3.a.W2.N(true);
                            break;
                        default:
                            x1 x1Var4 = this.b;
                            x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            x1Var4.a.W2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
            return;
        }
        final int i16 = 3;
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            int i17 = R.string.BrowserSettingsCookiesClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            b2Var2.T = LocaleController.formatString(i17, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.u1
                public final /* synthetic */ x1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i162) {
                    switch (i11) {
                        case 0:
                            x1 x1Var = this.b;
                            x1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(x1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    x1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    x1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            m2 b10 = m2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            x1Var.a0();
                            break;
                        case 1:
                            x1 x1Var2 = this.b;
                            x1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    x1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            x1Var2.a0();
                            break;
                        case 2:
                            x1 x1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            x1Var3.n = 0L;
                            x1Var3.a.W2.N(true);
                            break;
                        default:
                            x1 x1Var4 = this.b;
                            x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            x1Var4.a.W2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.o();
            return;
        }
        if (i10 == 7) {
            ArrayList a2 = c1.a(null);
            int size = a2.size();
            long j10 = Long.MAX_VALUE;
            int i18 = 0;
            while (i18 < size) {
                Object obj = a2.get(i18);
                i18++;
                j10 = Math.min(j10, ((b1) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
            b2Var3.R = string3;
            b2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.u1
                public final /* synthetic */ x1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i162) {
                    switch (i14) {
                        case 0:
                            x1 x1Var = this.b;
                            x1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(x1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    x1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    x1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            m2 b10 = m2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            x1Var.a0();
                            break;
                        case 1:
                            x1 x1Var2 = this.b;
                            x1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    x1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            x1Var2.a0();
                            break;
                        case 2:
                            x1 x1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            x1Var3.n = 0L;
                            x1Var3.a.W2.N(true);
                            break;
                        default:
                            x1 x1Var4 = this.b;
                            x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            x1Var4.a.W2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.o();
            return;
        }
        if (i10 == 9) {
            f1[] f1VarArr = {null};
            n2 f1Var = new f1(null, new org.telegram.ui.Wallet.x(13, this, f1VarArr));
            f1VarArr[0] = f1Var;
            presentFragment(f1Var);
            return;
        }
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
            b2Var4.R = string4;
            b2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.u1
                public final /* synthetic */ x1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i162) {
                    switch (i16) {
                        case 0:
                            x1 x1Var = this.b;
                            x1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(x1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    x1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    x1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            m2 b10 = m2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            x1Var.a0();
                            break;
                        case 1:
                            x1 x1Var2 = this.b;
                            x1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    x1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            x1Var2.a0();
                            break;
                        case 2:
                            x1 x1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            x1Var3.n = 0L;
                            x1Var3.a.W2.N(true);
                            break;
                        default:
                            x1 x1Var4 = this.b;
                            x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            x1Var4.a.W2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (g61Var.G(v1.class)) {
            w1 w1Var = (w1) view;
            String str2 = w1Var.e;
            i80 F = i80.F((ViewGroup) this.fragmentView, null, w1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new z3(27, this, str2), false);
            F.Z();
            return;
        }
        int i19 = g61Var.d;
        if (i19 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = m1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i20 = 0;
            while (i20 < size2) {
                charSequenceArr[i20] = ((m1) b10.get(i20)).a;
                k6 k6Var = new k6(getParentActivity(), null);
                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var.a(h6.x0(null, h6.g7, false), h6.x0(null, h6.E5, false));
                k6Var.b(charSequenceArr[i20], i20 == SharedConfig.searchEngineType);
                k6Var.setBackground(h6.g0(h6.x0(null, h6.i6, false), 2, -1));
                linearLayout.addView(k6Var);
                k6Var.setOnClickListener(new ha(i20, view, atomicReference));
                i20++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String string5 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.a;
            b2Var5.R = string5;
            alertDialog$Builder5.n(linearLayout);
            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
            atomicReference.set(b2Var5);
            showDialog(b2Var5);
            return;
        }
        if (i19 == 15 || i19 == 16) {
            boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
            if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                f5.t0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            d6 resourceProvider = getResourceProvider();
            y8 y8Var = new y8(i13, this, isWebBrowserInAppEnabled2);
            Pattern pattern = f5.a;
            Activity findActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            org.telegram.ui.ActionBar.b2 b2Var6 = alertDialog$Builder6.a;
            b2Var6.R = string6;
            b2Var6.T = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i21 = h6.j5;
            editTextBoldCursor.setTextColor(h6.w0(i21, resourceProvider));
            editTextBoldCursor.setHintTextColor(h6.w0(h6.Xh, resourceProvider));
            editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
            editTextBoldCursor.setInputType(17);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setCursorColor(h6.w0(h6.q6, resourceProvider));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(h6.m1(0.06f, h6.w0(i21, resourceProvider)));
            editTextBoldCursor.setBackground(gradientDrawable);
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(editTextBoldCursor, y8Var, b2VarArr, currentFocus, 20);
            editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(iVar, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.n(linearLayout2);
            b2Var6.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(iVar, i14));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new rr(9));
            b2VarArr[0] = b2Var6;
            b2Var6.h0 = false;
            b2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, i11));
            b2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(i12, editTextBoldCursor));
            b2VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean X(g61 g61Var, View view) {
        return false;
    }

    public final void a0() {
        t61 t61Var;
        if (c1.a(new ig.l0(this, 11)) != null) {
            this.n = r0.size();
            v61 v61Var = this.a;
            if (v61Var != null && (t61Var = v61Var.W2) != null && v61Var.G) {
                t61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new ki.u(this, 29));
    }

    @Override // org.telegram.ui.Components.w61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(h6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(h6.k7), mode));
        p2 p2Var = new p2(mutate, mutate2, 4);
        p2Var.x = AndroidUtilities.dp(2.0f);
        this.d = p2Var;
        this.fragmentView = super.createView(context);
        this.a.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v61 v61Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (v61Var = this.a) == null) {
            return;
        }
        v61Var.W2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        a0();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        v61 v61Var = this.a;
        v61Var.setPadding(0, v61Var.getPaddingTop(), 0, i13);
        this.a.setClipToPadding(false);
    }
}
