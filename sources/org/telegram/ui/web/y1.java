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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import k7.b6;
import lh.m6;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ai;
import org.telegram.ui.bs;
import org.telegram.ui.kh;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y1 extends b61 implements NotificationCenter.NotificationCenterDelegate {
    public nh.i2 d;
    public final Utilities.Callback e;
    public long f;
    public long h;
    public long n;

    public y1(org.telegram.ui.t tVar) {
        this.e = tVar;
    }

    public static boolean Y(File file, Boolean bool) {
        boolean z4;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z4 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !Y(file2, bool)) {
                        z4 = false;
                    }
                }
            } else {
                z4 = true;
            }
            if (z4) {
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

    @Override // org.telegram.ui.Components.b61
    public final void U(ArrayList arrayList, w51 w51Var) {
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        i51 i51Var = new i51(9);
        i51Var.d = 1;
        i51Var.l = string;
        i51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(i51Var);
        ai.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            i51 i10 = i51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            ai.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(i51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            nh.i2 i2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            i51 i51Var2 = new i51(3);
            i51Var2.d = 16;
            i51Var2.G = i2Var;
            i51Var2.l = string2;
            i51Var2.q = true;
            arrayList.add(i51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = w1.a;
                i51 J = i51.J(w1.class);
                J.l = str;
                J.n = str2;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(i51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            i51 e = i51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e.r = true;
            arrayList.add(e);
            arrayList.add(i51.B(null));
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.h;
        arrayList.add(i51.d(3, i12, string3, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f;
        arrayList.add(i51.d(2, i13, string4, j12 > 0 ? AndroidUtilities.formatFileSize(j12) : ""));
        ai.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.n > 0) {
            arrayList.size();
            arrayList.add(i51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(i51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.n, ',')));
            arrayList.add(i51.B(null));
        }
        arrayList.add(i51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        nh.i2 i2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        i51 i51Var3 = new i51(3);
        i51Var3.d = 15;
        i51Var3.G = i2Var2;
        i51Var3.l = string5;
        i51Var3.q = true;
        arrayList.add(i51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = w1.a;
            i51 J2 = i51.J(w1.class);
            J2.l = str3;
            J2.n = str4;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(i51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            i51 e6 = i51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e6.r = true;
            arrayList.add(e6);
            arrayList.add(i51.B(null));
        }
        arrayList.size();
        arrayList.add(i51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), n1.a().a));
        ai.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            i51 i15 = i51.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            i51 i16 = i51.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override // org.telegram.ui.Components.b61
    public final void W(i51 i51Var, View view) {
        int i10 = i51Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((r8) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((r8) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z4 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z4);
            ((r8) view).setChecked(z4);
            this.a.V2.N(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            r8 r8Var = (r8) view;
            r8Var.setChecked(isWebBrowserInAppEnabled);
            r8Var.b(j6.w0(null, isWebBrowserInAppEnabled ? j6.f6 : j6.e6, false), isWebBrowserInAppEnabled);
            this.a.V2.N(true);
            return;
        }
        if (i10 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.a.V2.N(true);
            return;
        }
        if (i10 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.a.V2.N(true);
            return;
        }
        String str = "";
        final int i13 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            int i14 = R.string.BrowserSettingsCacheClearText;
            if (this.f != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.f) + ")";
            }
            d2Var.Q = LocaleController.formatString(i14, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i15) {
                    switch (i12) {
                        case 0:
                            y1 y1Var = this.b;
                            y1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(y1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    y1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Y(file2, null);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
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
                            y1Var.a0();
                            break;
                        case 1:
                            y1 y1Var2 = this.b;
                            y1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    y1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            y1Var2.a0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                e1.c.clear();
                                e1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var3.n = 0L;
                            y1Var3.a.V2.N(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.V2.N(true);
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
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            int i16 = R.string.BrowserSettingsCookiesClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            d2Var2.Q = LocaleController.formatString(i16, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                    switch (i11) {
                        case 0:
                            y1 y1Var = this.b;
                            y1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(y1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    y1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Y(file2, null);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
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
                            y1Var.a0();
                            break;
                        case 1:
                            y1 y1Var2 = this.b;
                            y1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    y1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            y1Var2.a0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                e1.c.clear();
                                e1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var3.n = 0L;
                            y1Var3.a.V2.N(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.V2.N(true);
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
            ArrayList a2 = e1.a(null);
            int size = a2.size();
            long j10 = Long.MAX_VALUE;
            int i17 = 0;
            while (i17 < size) {
                Object obj = a2.get(i17);
                i17++;
                j10 = Math.min(j10, ((d1) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
            d2Var3.O = string3;
            d2Var3.Q = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                    switch (i13) {
                        case 0:
                            y1 y1Var = this.b;
                            y1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(y1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    y1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Y(file2, null);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
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
                            y1Var.a0();
                            break;
                        case 1:
                            y1 y1Var2 = this.b;
                            y1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    y1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            y1Var2.a0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                e1.c.clear();
                                e1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var3.n = 0L;
                            y1Var3.a.V2.N(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.V2.N(true);
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
            g1[] g1VarArr = {null};
            p2 g1Var = new g1(null, new vk(28, this, g1VarArr));
            g1VarArr[0] = g1Var;
            presentFragment(g1Var);
            return;
        }
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
            d2Var4.O = string4;
            d2Var4.Q = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                    switch (i15) {
                        case 0:
                            y1 y1Var = this.b;
                            y1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(y1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    y1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Y(file2, null);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
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
                            y1Var.a0();
                            break;
                        case 1:
                            y1 y1Var2 = this.b;
                            y1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    y1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            y1Var2.a0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                e1.c.clear();
                                e1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var3.n = 0L;
                            y1Var3.a.V2.N(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.V2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (i51Var.G(w1.class)) {
            x1 x1Var = (x1) view;
            String str2 = x1Var.e;
            p70 F = p70.F((ViewGroup) this.fragmentView, null, x1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new sg1(14, this, str2), false);
            F.Z();
            return;
        }
        int i18 = i51Var.d;
        if (i18 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = n1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i19 = 0;
            while (i19 < size2) {
                charSequenceArr[i19] = ((n1) b10.get(i19)).a;
                org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                j6Var.a(j6.w0(null, j6.g7, false), j6.w0(null, j6.E5, false));
                j6Var.b(charSequenceArr[i19], i19 == SharedConfig.searchEngineType);
                j6Var.setBackground(j6.f0(j6.w0(null, j6.i6, false), 2, -1));
                linearLayout.addView(j6Var);
                j6Var.setOnClickListener(new dg.m2(i19, view, atomicReference));
                i19++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String string5 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder5.a;
            d2Var5.O = string5;
            alertDialog$Builder5.n(linearLayout);
            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
            atomicReference.set(d2Var5);
            showDialog(d2Var5);
            return;
        }
        if (i18 == 15 || i18 == 16) {
            boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
            if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                z4.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            f6 resourceProvider = getResourceProvider();
            m6 m6Var = new m6(4, this, isWebBrowserInAppEnabled2);
            Pattern pattern = z4.a;
            Activity findActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            org.telegram.ui.ActionBar.d2 d2Var6 = alertDialog$Builder6.a;
            d2Var6.O = string6;
            d2Var6.Q = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i20 = j6.j5;
            editTextBoldCursor.setTextColor(j6.v0(i20, resourceProvider));
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
            gradientDrawable.setColor(j6.l1(0.06f, j6.v0(i20, resourceProvider)));
            editTextBoldCursor.setBackground(gradientDrawable);
            kh khVar = new kh(editTextBoldCursor, m6Var, d2VarArr, currentFocus, 7);
            editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.d1(khVar, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, b6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.n(linearLayout2);
            d2Var6.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.t(khVar, i13));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new bs(8));
            d2VarArr[0] = d2Var6;
            d2Var6.e0 = false;
            d2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, i11));
            d2VarArr[0].setOnShowListener(new org.telegram.ui.Components.e1(i12, editTextBoldCursor));
            d2VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    public final void a0() {
        w51 w51Var;
        if (e1.a(new a1(this, 2)) != null) {
            this.n = r0.size();
            a61 a61Var = this.a;
            if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                w51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new q0(this, 5));
    }

    @Override // org.telegram.ui.Components.b61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(j6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.k7), mode));
        nh.i2 i2Var = new nh.i2(mutate, mutate2, 4);
        i2Var.x = AndroidUtilities.dp(2.0f);
        this.d = i2Var;
        this.fragmentView = super.createView(context);
        this.a.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a61 a61Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (a61Var = this.a) == null) {
            return;
        }
        a61Var.V2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        a0();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        a61 a61Var = this.a;
        a61Var.setPadding(0, a61Var.getPaddingTop(), 0, i13);
        this.a.setClipToPadding(false);
    }
}
