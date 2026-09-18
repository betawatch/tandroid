package org.telegram.ui.web;

import ai.i3;
import ai.t3;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.gs;
import org.telegram.ui.oj0;
import org.telegram.ui.qb1;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class z1 extends a61 implements NotificationCenter.NotificationCenterDelegate {
    public t3 e;
    public final Utilities.Callback f;
    public long h;
    public long n;
    public long r;

    public z1(org.telegram.ui.r rVar) {
        this.f = rVar;
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
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j3 += Z(file2, bool);
                }
                return j3;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.a61
    public final void U(ArrayList arrayList, x51 x51Var) {
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        j51 j51Var = new j51(9);
        j51Var.d = 1;
        j51Var.l = string;
        j51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(j51Var);
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            j51 i10 = j51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            com.google.android.gms.internal.vision.e2.w(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(j51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            t3 t3Var = this.e;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            j51 j51Var2 = new j51(3);
            j51Var2.d = 16;
            j51Var2.G = t3Var;
            j51Var2.l = string2;
            j51Var2.q = true;
            arrayList.add(j51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j3 = webDomainException.favicon;
                int i11 = x1.a;
                j51 J = j51.J(x1.class);
                J.l = str;
                J.n = str2;
                J.B = j3;
                arrayList.add(J);
            }
            arrayList.add(j51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            j51 e = j51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e.r = true;
            arrayList.add(e);
            arrayList.add(j51.B(null));
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j10 = this.n;
        arrayList.add(j51.d(3, i12, string3, j10 > 0 ? AndroidUtilities.formatFileSize(j10) : ""));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j11 = this.h;
        arrayList.add(j51.d(2, i13, string4, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(j51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(j51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.r, ',')));
            arrayList.add(j51.B(null));
        }
        arrayList.add(j51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        t3 t3Var2 = this.e;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        j51 j51Var3 = new j51(3);
        j51Var3.d = 15;
        j51Var3.G = t3Var2;
        j51Var3.l = string5;
        j51Var3.q = true;
        arrayList.add(j51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j12 = webDomainException2.favicon;
            int i14 = x1.a;
            j51 J2 = j51.J(x1.class);
            J2.l = str3;
            J2.n = str4;
            J2.B = j12;
            arrayList.add(J2);
        }
        arrayList.add(j51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            j51 e7 = j51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.r = true;
            arrayList.add(e7);
            arrayList.add(j51.B(null));
        }
        arrayList.size();
        arrayList.add(j51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), o1.a().a));
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j51 i15 = j51.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            j51 i16 = j51.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override // org.telegram.ui.Components.a61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override // org.telegram.ui.Components.a61
    public final void W(j51 j51Var, View view) {
        int i10 = j51Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((w8) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((w8) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((w8) view).setChecked(z10);
            this.a.Y2.N(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            w8 w8Var = (w8) view;
            w8Var.setChecked(isWebBrowserInAppEnabled);
            w8Var.b(j6.w0(null, isWebBrowserInAppEnabled ? j6.f6 : j6.e6, false), isWebBrowserInAppEnabled);
            this.a.Y2.N(true);
            return;
        }
        if (i10 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.a.Y2.N(true);
            return;
        }
        if (i10 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.a.Y2.N(true);
            return;
        }
        String str = "";
        final int i13 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            int i14 = R.string.BrowserSettingsCacheClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            c2Var.T = LocaleController.formatString(i14, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.w1
                public final /* synthetic */ z1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i15) {
                    switch (i12) {
                        case 0:
                            z1 z1Var = this.b;
                            z1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(z1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    z1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    z1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            n2 b10 = n2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            z1Var.a0();
                            break;
                        case 1:
                            z1 z1Var2 = this.b;
                            z1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    z1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            z1Var2.a0();
                            break;
                        case 2:
                            z1 z1Var3 = this.b;
                            try {
                                f1.c.clear();
                                f1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            z1Var3.r = 0L;
                            z1Var3.a.Y2.N(true);
                            break;
                        default:
                            z1 z1Var4 = this.b;
                            z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            z1Var4.a.Y2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
            return;
        }
        final int i15 = 3;
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.R = string2;
            int i16 = R.string.BrowserSettingsCookiesClearText;
            if (this.n != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.n) + ")";
            }
            c2Var2.T = LocaleController.formatString(i16, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.w1
                public final /* synthetic */ z1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                    switch (i11) {
                        case 0:
                            z1 z1Var = this.b;
                            z1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(z1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    z1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    z1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            n2 b10 = n2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            z1Var.a0();
                            break;
                        case 1:
                            z1 z1Var2 = this.b;
                            z1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    z1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            z1Var2.a0();
                            break;
                        case 2:
                            z1 z1Var3 = this.b;
                            try {
                                f1.c.clear();
                                f1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            z1Var3.r = 0L;
                            z1Var3.a.Y2.N(true);
                            break;
                        default:
                            z1 z1Var4 = this.b;
                            z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            z1Var4.a.Y2.N(true);
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
            ArrayList a2 = f1.a(null);
            int size = a2.size();
            long j3 = Long.MAX_VALUE;
            int i17 = 0;
            while (i17 < size) {
                Object obj = a2.get(i17);
                i17++;
                j3 = Math.min(j3, ((e1) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            c2Var3.R = string3;
            c2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j3 / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.w1
                public final /* synthetic */ z1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                    switch (i13) {
                        case 0:
                            z1 z1Var = this.b;
                            z1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(z1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    z1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    z1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            n2 b10 = n2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            z1Var.a0();
                            break;
                        case 1:
                            z1 z1Var2 = this.b;
                            z1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    z1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            z1Var2.a0();
                            break;
                        case 2:
                            z1 z1Var3 = this.b;
                            try {
                                f1.c.clear();
                                f1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            z1Var3.r = 0L;
                            z1Var3.a.Y2.N(true);
                            break;
                        default:
                            z1 z1Var4 = this.b;
                            z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            z1Var4.a.Y2.N(true);
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
            h1[] h1VarArr = {null};
            o2 h1Var = new h1(null, new oj0(11, this, h1VarArr));
            h1VarArr[0] = h1Var;
            presentFragment(h1Var);
            return;
        }
        int i18 = 5;
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
            c2Var4.R = string4;
            c2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.w1
                public final /* synthetic */ z1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                    switch (i15) {
                        case 0:
                            z1 z1Var = this.b;
                            z1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(z1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    z1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    z1.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            n2 b10 = n2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            z1Var.a0();
                            break;
                        case 1:
                            z1 z1Var2 = this.b;
                            z1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    z1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            z1Var2.a0();
                            break;
                        case 2:
                            z1 z1Var3 = this.b;
                            try {
                                f1.c.clear();
                                f1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            z1Var3.r = 0L;
                            z1Var3.a.Y2.N(true);
                            break;
                        default:
                            z1 z1Var4 = this.b;
                            z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            z1Var4.a.Y2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (j51Var.G(x1.class)) {
            y1 y1Var = (y1) view;
            String str2 = y1Var.e;
            n70 F = n70.F((ViewGroup) this.fragmentView, null, y1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new qb1(27, this, str2), false);
            F.Z();
            return;
        }
        int i19 = j51Var.d;
        if (i19 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = o1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i20 = 0;
            while (i20 < size2) {
                charSequenceArr[i20] = ((o1) b10.get(i20)).a;
                k6 k6Var = new k6(getParentActivity(), null);
                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var.a(j6.w0(null, j6.g7, false), j6.w0(null, j6.E5, false));
                k6Var.b(charSequenceArr[i20], i20 == SharedConfig.searchEngineType);
                k6Var.setBackground(j6.f0(j6.w0(null, j6.i6, false), 2, -1));
                linearLayout.addView(k6Var);
                k6Var.setOnClickListener(new va(i20, view, atomicReference));
                i20++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String string5 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.a;
            c2Var5.R = string5;
            alertDialog$Builder5.n(linearLayout);
            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
            atomicReference.set(c2Var5);
            showDialog(c2Var5);
            return;
        }
        if (i19 == 15 || i19 == 16) {
            boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
            if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                c5.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            f6 resourceProvider = getResourceProvider();
            i3 i3Var = new i3(i18, this, isWebBrowserInAppEnabled2);
            Pattern pattern = c5.a;
            Activity findActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            org.telegram.ui.ActionBar.c2 c2Var6 = alertDialog$Builder6.a;
            c2Var6.R = string6;
            c2Var6.T = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i21 = j6.j5;
            editTextBoldCursor.setTextColor(j6.v0(i21, resourceProvider));
            editTextBoldCursor.setHintTextColor(j6.v0(j6.Xh, resourceProvider));
            editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
            editTextBoldCursor.setInputType(17);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setCursorColor(j6.v0(j6.q6, resourceProvider));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(j6.l1(0.06f, j6.v0(i21, resourceProvider)));
            editTextBoldCursor.setBackground(gradientDrawable);
            o5 o5Var = new o5(editTextBoldCursor, i3Var, c2VarArr, currentFocus, 16);
            editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(o5Var, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, x5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.n(linearLayout2);
            c2Var6.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(o5Var, i13));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new gs(7));
            c2VarArr[0] = c2Var6;
            c2Var6.h0 = false;
            c2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, i11));
            c2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(i12, editTextBoldCursor));
            c2VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean X(j51 j51Var, View view) {
        return false;
    }

    public final void a0() {
        x51 x51Var;
        if (f1.a(new b1(this, 2)) != null) {
            this.r = r0.size();
            z51 z51Var = this.a;
            if (z51Var != null && (x51Var = z51Var.Y2) != null && z51Var.G) {
                x51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new u0(this, 4));
    }

    @Override // org.telegram.ui.Components.a61, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(j6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.k7), mode));
        t3 t3Var = new t3(mutate, mutate2, 4);
        t3Var.x = AndroidUtilities.dp(2.0f);
        this.e = t3Var;
        this.fragmentView = super.createView(context);
        this.a.q1();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z51 z51Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (z51Var = this.a) == null) {
            return;
        }
        z51Var.Y2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ml0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        a0();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }
}
