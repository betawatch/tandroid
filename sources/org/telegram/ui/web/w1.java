package org.telegram.ui.web;

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
import bg.p2;
import i7.f6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import jh.m6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.gg;
import org.telegram.ui.th;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w1 extends p51 implements NotificationCenter.NotificationCenterDelegate {
    public lh.h2 d;
    public final Utilities.Callback e;
    public long f;
    public long h;
    public long n;

    public w1(org.telegram.ui.t tVar) {
        this.e = tVar;
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

    @Override // org.telegram.ui.Components.p51
    public final void U(ArrayList arrayList, k51 k51Var) {
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        w41 w41Var = new w41(9);
        w41Var.d = 1;
        w41Var.l = string;
        w41Var.K(isWebBrowserInAppEnabled);
        arrayList.add(w41Var);
        th.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            w41 i10 = w41.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            th.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(w41.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            lh.h2 h2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            w41 w41Var2 = new w41(3);
            w41Var2.d = 16;
            w41Var2.G = h2Var;
            w41Var2.l = string2;
            w41Var2.q = true;
            arrayList.add(w41Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = u1.a;
                w41 J = w41.J(u1.class);
                J.l = str;
                J.n = str2;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(w41.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            w41 e10 = w41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(w41.B(null));
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.h;
        arrayList.add(w41.d(3, i12, string3, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f;
        arrayList.add(w41.d(2, i13, string4, j12 > 0 ? AndroidUtilities.formatFileSize(j12) : ""));
        th.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.n > 0) {
            arrayList.size();
            arrayList.add(w41.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(w41.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.n, ',')));
            arrayList.add(w41.B(null));
        }
        arrayList.add(w41.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        lh.h2 h2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        w41 w41Var3 = new w41(3);
        w41Var3.d = 15;
        w41Var3.G = h2Var2;
        w41Var3.l = string5;
        w41Var3.q = true;
        arrayList.add(w41Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = u1.a;
            w41 J2 = w41.J(u1.class);
            J2.l = str3;
            J2.n = str4;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(w41.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            w41 e11 = w41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e11.r = true;
            arrayList.add(e11);
            arrayList.add(w41.B(null));
        }
        arrayList.size();
        arrayList.add(w41.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), k1.a().a));
        th.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            w41 i15 = w41.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            w41 i16 = w41.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override // org.telegram.ui.Components.p51
    public final void W(w41 w41Var, View view) {
        int i10 = w41Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((q8) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((q8) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((q8) view).setChecked(z10);
            this.a.U2.N(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            q8 q8Var = (q8) view;
            q8Var.setChecked(isWebBrowserInAppEnabled);
            q8Var.b(g6.w0(null, isWebBrowserInAppEnabled ? g6.f6 : g6.e6, false), isWebBrowserInAppEnabled);
            this.a.U2.N(true);
            return;
        }
        if (i10 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.a.U2.N(true);
            return;
        }
        if (i10 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.a.U2.N(true);
            return;
        }
        String str = "";
        final int i13 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            int i14 = R.string.BrowserSettingsCacheClearText;
            if (this.f != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.f) + ")";
            }
            c2Var.P = LocaleController.formatString(i14, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s1
                public final /* synthetic */ w1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i15) {
                    switch (i12) {
                        case 0:
                            w1 w1Var = this.b;
                            w1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(w1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    w1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    w1.Y(file2, null);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            k2 b10 = k2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            w1Var.a0();
                            break;
                        case 1:
                            w1 w1Var2 = this.b;
                            w1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    w1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            w1Var2.a0();
                            break;
                        case 2:
                            w1 w1Var3 = this.b;
                            try {
                                b1.c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                            w1Var3.n = 0L;
                            w1Var3.a.U2.N(true);
                            break;
                        default:
                            w1 w1Var4 = this.b;
                            w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            w1Var4.a.U2.N(true);
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
            c2Var2.N = string2;
            int i16 = R.string.BrowserSettingsCookiesClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            c2Var2.P = LocaleController.formatString(i16, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s1
                public final /* synthetic */ w1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                    switch (i11) {
                        case 0:
                            w1 w1Var = this.b;
                            w1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(w1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    w1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    w1.Y(file2, null);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            k2 b10 = k2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            w1Var.a0();
                            break;
                        case 1:
                            w1 w1Var2 = this.b;
                            w1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    w1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            w1Var2.a0();
                            break;
                        case 2:
                            w1 w1Var3 = this.b;
                            try {
                                b1.c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                            w1Var3.n = 0L;
                            w1Var3.a.U2.N(true);
                            break;
                        default:
                            w1 w1Var4 = this.b;
                            w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            w1Var4.a.U2.N(true);
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
            ArrayList a2 = b1.a(null);
            int size = a2.size();
            long j10 = Long.MAX_VALUE;
            int i17 = 0;
            while (i17 < size) {
                Object obj = a2.get(i17);
                i17++;
                j10 = Math.min(j10, ((a1) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            c2Var3.N = string3;
            c2Var3.P = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s1
                public final /* synthetic */ w1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                    switch (i13) {
                        case 0:
                            w1 w1Var = this.b;
                            w1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(w1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    w1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    w1.Y(file2, null);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            k2 b10 = k2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            w1Var.a0();
                            break;
                        case 1:
                            w1 w1Var2 = this.b;
                            w1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    w1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            w1Var2.a0();
                            break;
                        case 2:
                            w1 w1Var3 = this.b;
                            try {
                                b1.c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                            w1Var3.n = 0L;
                            w1Var3.a.U2.N(true);
                            break;
                        default:
                            w1 w1Var4 = this.b;
                            w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            w1Var4.a.U2.N(true);
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
            d1[] d1VarArr = {null};
            o2 d1Var = new d1(null, new yu0(8, this, d1VarArr));
            d1VarArr[0] = d1Var;
            presentFragment(d1Var);
            return;
        }
        int i18 = 5;
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
            c2Var4.N = string4;
            c2Var4.P = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s1
                public final /* synthetic */ w1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                    switch (i15) {
                        case 0:
                            w1 w1Var = this.b;
                            w1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(w1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    w1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    w1.Y(file2, null);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            k2 b10 = k2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            w1Var.a0();
                            break;
                        case 1:
                            w1 w1Var2 = this.b;
                            w1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    w1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            w1Var2.a0();
                            break;
                        case 2:
                            w1 w1Var3 = this.b;
                            try {
                                b1.c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                            w1Var3.n = 0L;
                            w1Var3.a.U2.N(true);
                            break;
                        default:
                            w1 w1Var4 = this.b;
                            w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            w1Var4.a.U2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (w41Var.G(u1.class)) {
            v1 v1Var = (v1) view;
            String str2 = v1Var.e;
            j70 F = j70.F((ViewGroup) this.fragmentView, null, v1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new y(i18, this, str2), false);
            F.Z();
            return;
        }
        int i19 = w41Var.d;
        int i20 = 6;
        if (i19 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = k1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i21 = 0;
            while (i21 < size2) {
                charSequenceArr[i21] = ((k1) b10.get(i21)).a;
                i6 i6Var = new i6(getParentActivity(), null);
                i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                i6Var.a(g6.w0(null, g6.g7, false), g6.w0(null, g6.E5, false));
                i6Var.b(charSequenceArr[i21], i21 == SharedConfig.searchEngineType);
                i6Var.setBackground(g6.f0(g6.w0(null, g6.i6, false), 2, -1));
                linearLayout.addView(i6Var);
                i6Var.setOnClickListener(new p2(i21, view, atomicReference));
                i21++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String string5 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.a;
            c2Var5.N = string5;
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
            c6 resourceProvider = getResourceProvider();
            m6 m6Var = new m6(i20, this, isWebBrowserInAppEnabled2);
            Pattern pattern = c5.a;
            Activity findActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            org.telegram.ui.ActionBar.c2 c2Var6 = alertDialog$Builder6.a;
            c2Var6.N = string6;
            c2Var6.P = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i22 = g6.j5;
            editTextBoldCursor.setTextColor(g6.v0(i22, resourceProvider));
            editTextBoldCursor.setHintTextColor(g6.v0(g6.Xh, resourceProvider));
            editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
            editTextBoldCursor.setInputType(17);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setCursorColor(g6.v0(g6.q6, resourceProvider));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(g6.l1(0.06f, g6.v0(i22, resourceProvider)));
            editTextBoldCursor.setBackground(gradientDrawable);
            gg ggVar = new gg(editTextBoldCursor, m6Var, c2VarArr, currentFocus, 9);
            editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.f1(ggVar, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, f6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.n(linearLayout2);
            c2Var6.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.u(ggVar, i13));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.n0(3));
            c2VarArr[0] = c2Var6;
            c2Var6.d0 = false;
            c2Var6.setOnDismissListener(new org.telegram.ui.Components.d1(editTextBoldCursor, i11));
            c2VarArr[0].setOnShowListener(new org.telegram.ui.Components.g1(i12, editTextBoldCursor));
            c2VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean X(w41 w41Var, View view) {
        return false;
    }

    public final void a0() {
        k51 k51Var;
        if (b1.a(new nh.b0(this, 12)) != null) {
            this.n = r0.size();
            o51 o51Var = this.a;
            if (o51Var != null && (k51Var = o51Var.U2) != null && o51Var.C) {
                k51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new t1(this, 0));
    }

    @Override // org.telegram.ui.Components.p51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(g6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(g6.k7), mode));
        lh.h2 h2Var = new lh.h2(mutate, mutate2, 4);
        h2Var.x = AndroidUtilities.dp(2.0f);
        this.d = h2Var;
        this.fragmentView = super.createView(context);
        this.a.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        o51 o51Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (o51Var = this.a) == null) {
            return;
        }
        o51Var.U2.N(true);
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        o51 o51Var = this.a;
        o51Var.setPadding(0, o51Var.getPaddingTop(), 0, i13);
        this.a.setClipToPadding(false);
    }
}
