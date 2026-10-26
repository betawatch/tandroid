package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
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
import bi.pa;
import bi.t8;
import di.o2;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.cg;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y1 extends m71 implements NotificationCenter.NotificationCenterDelegate {
    public o2 e;
    public final Utilities.Callback f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int v;

    public y1(org.telegram.ui.q qVar) {
        this.f = qVar;
    }

    public static boolean Z(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !Z(file2, bool)) {
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

    public static long a0(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += a0(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.m71
    public final void V(ArrayList arrayList, j71 j71Var) {
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        t61 t61Var = new t61(9);
        t61Var.d = 1;
        t61Var.l = string;
        t61Var.L(isWebBrowserInAppEnabled);
        arrayList.add(t61Var);
        ic.a.z(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            t61 i10 = t61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.L(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            ic.a.z(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(t61.u(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            o2 o2Var = this.e;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            t61 t61Var2 = new t61(3);
            t61Var2.d = 16;
            t61Var2.G = o2Var;
            t61Var2.l = string2;
            t61Var2.q = true;
            arrayList.add(t61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = w1.a;
                t61 K = t61.K(w1.class);
                K.l = str;
                K.n = str2;
                K.B = j10;
                arrayList.add(K);
            }
            arrayList.add(t61.C(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            t61 e = t61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e.r = true;
            arrayList.add(e);
            arrayList.add(t61.C(null));
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.n;
        arrayList.add(t61.d(3, i12, string3, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.h;
        arrayList.add(t61.d(2, i13, string4, j12 > 0 ? AndroidUtilities.formatFileSize(j12) : ""));
        ic.a.z(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(t61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(t61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.r, ',')));
            arrayList.add(t61.C(null));
        }
        arrayList.add(t61.u(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        o2 o2Var2 = this.e;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        t61 t61Var3 = new t61(3);
        t61Var3.d = 15;
        t61Var3.G = o2Var2;
        t61Var3.l = string5;
        t61Var3.q = true;
        arrayList.add(t61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = w1.a;
            t61 K2 = t61.K(w1.class);
            K2.l = str3;
            K2.n = str4;
            K2.B = j13;
            arrayList.add(K2);
        }
        arrayList.add(t61.C(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            t61 e10 = t61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(t61.C(null));
        }
        arrayList.size();
        arrayList.add(t61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), n1.a().a));
        ic.a.z(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            t61 i15 = t61.i(12, "adaptable colors");
            i15.L(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            t61 i16 = t61.i(13, "only local IV");
            i16.L(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override // org.telegram.ui.Components.m71
    public final CharSequence W() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override // org.telegram.ui.Components.m71
    public final void X(t61 t61Var, View view) {
        int i10 = t61Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((a9) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((a9) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((a9) view).setChecked(z10);
            this.a.g3.O(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            a9 a9Var = (a9) view;
            a9Var.setChecked(isWebBrowserInAppEnabled);
            a9Var.b(y6.x0(null, isWebBrowserInAppEnabled ? y6.f6 : y6.e6, false), isWebBrowserInAppEnabled);
            this.a.g3.O(true);
            return;
        }
        int i13 = 10;
        if (i10 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.a.g3.O(true);
            return;
        }
        if (i10 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.a.g3.O(true);
            return;
        }
        String str = "";
        final int i14 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            int i15 = R.string.BrowserSettingsCacheClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            e2Var.T = LocaleController.formatString(i15, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i16) {
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
                                    y1.Z(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Z(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                            y1Var.b0();
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
                                    y1.Z(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var2.b0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            y1Var3.r = 0L;
                            y1Var3.a.g3.O(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        final int i16 = 3;
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.R = string2;
            int i17 = R.string.BrowserSettingsCookiesClearText;
            if (this.n != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.n) + ")";
            }
            e2Var2.T = LocaleController.formatString(i17, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i162) {
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
                                    y1.Z(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Z(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                            y1Var.b0();
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
                                    y1.Z(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var2.b0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            y1Var3.r = 0L;
                            y1Var3.a.g3.O(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
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
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
            e2Var3.R = string3;
            e2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i162) {
                    switch (i14) {
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
                                    y1.Z(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Z(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                            y1Var.b0();
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
                                    y1.Z(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var2.b0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            y1Var3.r = 0L;
                            y1Var3.a.g3.O(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.p();
            return;
        }
        if (i10 == 9) {
            f1[] f1VarArr = {null};
            r2 f1Var = new f1(null, new org.telegram.ui.Wallet.s(15, this, f1VarArr));
            f1VarArr[0] = f1Var;
            presentFragment(f1Var);
            return;
        }
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.a;
            e2Var4.R = string4;
            e2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.v1
                public final /* synthetic */ y1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i162) {
                    switch (i16) {
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
                                    y1.Z(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    y1.Z(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                            y1Var.b0();
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
                                    y1.Z(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            y1Var2.b0();
                            break;
                        case 2:
                            y1 y1Var3 = this.b;
                            try {
                                c1.c.clear();
                                c1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            y1Var3.r = 0L;
                            y1Var3.a.g3.O(true);
                            break;
                        default:
                            y1 y1Var4 = this.b;
                            y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            y1Var4.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.p();
            return;
        }
        if (t61Var.H(w1.class)) {
            x1 x1Var = (x1) view;
            String str2 = x1Var.e;
            k80 F = k80.F((ViewGroup) this.fragmentView, null, x1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new q6(17, this, str2), false);
            F.Z();
            return;
        }
        int i19 = t61Var.d;
        if (i19 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = n1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i20 = 0;
            while (i20 < size2) {
                charSequenceArr[i20] = ((n1) b10.get(i20)).a;
                p6 p6Var = new p6(getParentActivity(), null);
                p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                p6Var.a(y6.x0(null, y6.g7, false), y6.x0(null, y6.E5, false));
                p6Var.b(charSequenceArr[i20], i20 == SharedConfig.searchEngineType);
                int i21 = y6.i6;
                org.telegram.ui.Cells.y g02 = y6.g0(y6.x0(null, i21, false), 2, -1);
                b7 N = f7.N(i21);
                p6Var.setBackground(g02);
                f7.k(p6Var, g02, null, N, null);
                linearLayout.addView(p6Var);
                p6Var.setOnClickListener(new pa(i20, view, atomicReference));
                i20++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String string5 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.e2 e2Var5 = alertDialog$Builder5.a;
            e2Var5.R = string5;
            alertDialog$Builder5.o(linearLayout);
            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
            atomicReference.set(e2Var5);
            showDialog(e2Var5);
            return;
        }
        if (i19 == 15 || i19 == 16) {
            boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
            if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                g5.t0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            u6 resourceProvider = getResourceProvider();
            t8 t8Var = new t8(i13, this, isWebBrowserInAppEnabled2);
            Pattern pattern = g5.a;
            Activity findActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            org.telegram.ui.ActionBar.e2 e2Var6 = alertDialog$Builder6.a;
            e2Var6.R = string6;
            e2Var6.T = LocaleController.getString(isWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            f5 f5Var = new f5(parentActivity);
            f5Var.setTextSize(1, 16.0f);
            int i22 = y6.j5;
            f7.V(f5Var, i22, resourceProvider);
            f7.E(f5Var, y6.Xh, resourceProvider);
            f5Var.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
            f5Var.setInputType(17);
            f5Var.setImeOptions(6);
            f5Var.setSingleLine(true);
            f5Var.setFocusable(true);
            f5Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
            f5Var.setCursorWidth(1.5f);
            f5Var.i(y6.q6, resourceProvider);
            ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(22.0f), y6.o1(0.06f, y6.w0(i22, resourceProvider)));
            b7 L = f7.L(0.06f, i22);
            f5Var.setBackground(c02);
            f7.k(f5Var, c02, L, null, resourceProvider);
            m4.v0 v0Var = new m4.v0(f5Var, t8Var, e2VarArr, currentFocus, 23);
            f5Var.setOnEditorActionListener(new org.telegram.ui.Components.d1(v0Var, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(f5Var, gb1.o(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.o(linearLayout2);
            e2Var6.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(v0Var, 2));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new cg(17));
            e2VarArr[0] = e2Var6;
            e2Var6.j0 = false;
            e2Var6.setOnDismissListener(new org.telegram.ui.Components.z0(f5Var, i11));
            e2VarArr[0].setOnShowListener(new org.telegram.ui.Components.e1(i12, f5Var));
            e2VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.m71
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    public final void b0() {
        j71 j71Var;
        if (c1.a(new ig.o(this, 15)) != null) {
            this.r = r0.size();
            l71 l71Var = this.a;
            if (l71Var != null && (j71Var = l71Var.g3) != null && l71Var.G) {
                j71Var.O(true);
            }
        }
        Utilities.globalQueue.postRunnable(new h1(this, 2));
    }

    @Override // org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(y6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(y6.k7), mode));
        o2 o2Var = new o2(mutate, mutate2, 4);
        o2Var.x = AndroidUtilities.dp(2.0f);
        this.e = o2Var;
        this.fragmentView = super.createView(context);
        this.a.u1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l71 l71Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (l71Var = this.a) == null) {
            return;
        }
        l71Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        b0();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            o2 o2Var = this.e;
            if (o2Var != null) {
                int themedColor = getThemedColor(y6.N6);
                int themedColor2 = getThemedColor(y6.k7);
                if (themedColor == this.s && themedColor2 == this.v) {
                    return;
                }
                this.s = themedColor;
                this.v = themedColor2;
                Drawable drawable = o2Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = o2Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                l71 l71Var = this.a;
                if (l71Var != null) {
                    l71Var.g1();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
