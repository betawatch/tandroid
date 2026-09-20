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
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.es;
import org.telegram.ui.pj0;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class a2 extends n61 implements NotificationCenter.NotificationCenterDelegate {
    public t3 e;
    public final Utilities.Callback f;
    public long h;
    public long n;
    public long r;

    public a2(org.telegram.ui.r rVar) {
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

    @Override // org.telegram.ui.Components.n61
    public final void U(ArrayList arrayList, k61 k61Var) {
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        w51 w51Var = new w51(9);
        w51Var.d = 1;
        w51Var.l = string;
        w51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(w51Var);
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            w51 i10 = w51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            com.google.android.gms.internal.vision.e2.w(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(w51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            t3 t3Var = this.e;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            w51 w51Var2 = new w51(3);
            w51Var2.d = 16;
            w51Var2.G = t3Var;
            w51Var2.l = string2;
            w51Var2.q = true;
            arrayList.add(w51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j3 = webDomainException.favicon;
                int i11 = y1.a;
                w51 J = w51.J(y1.class);
                J.l = str;
                J.n = str2;
                J.B = j3;
                arrayList.add(J);
            }
            arrayList.add(w51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            w51 e = w51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e.r = true;
            arrayList.add(e);
            arrayList.add(w51.B(null));
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j10 = this.n;
        arrayList.add(w51.d(3, i12, string3, j10 > 0 ? AndroidUtilities.formatFileSize(j10) : ""));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j11 = this.h;
        arrayList.add(w51.d(2, i13, string4, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(w51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(w51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.r, ',')));
            arrayList.add(w51.B(null));
        }
        arrayList.add(w51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        t3 t3Var2 = this.e;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        w51 w51Var3 = new w51(3);
        w51Var3.d = 15;
        w51Var3.G = t3Var2;
        w51Var3.l = string5;
        w51Var3.q = true;
        arrayList.add(w51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j12 = webDomainException2.favicon;
            int i14 = y1.a;
            w51 J2 = w51.J(y1.class);
            J2.l = str3;
            J2.n = str4;
            J2.B = j12;
            arrayList.add(J2);
        }
        arrayList.add(w51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            w51 e7 = w51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.r = true;
            arrayList.add(e7);
            arrayList.add(w51.B(null));
        }
        arrayList.size();
        arrayList.add(w51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), p1.a().a));
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            w51 i15 = w51.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            w51 i16 = w51.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override // org.telegram.ui.Components.n61
    public final void W(w51 w51Var, View view) {
        int i10 = w51Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((x8) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((x8) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((x8) view).setChecked(z10);
            this.a.Y2.N(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            x8 x8Var = (x8) view;
            x8Var.setChecked(isWebBrowserInAppEnabled);
            x8Var.b(j6.w0(null, isWebBrowserInAppEnabled ? j6.f6 : j6.e6, false), isWebBrowserInAppEnabled);
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
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            int i14 = R.string.BrowserSettingsCacheClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            b2Var.T = LocaleController.formatString(i14, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.x1
                public final /* synthetic */ a2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void k(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                    switch (i12) {
                        case 0:
                            a2 a2Var = this.b;
                            a2Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(a2Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    a2.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    a2.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            o2 b10 = o2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            a2Var.a0();
                            break;
                        case 1:
                            a2 a2Var2 = this.b;
                            a2Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    a2.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            a2Var2.a0();
                            break;
                        case 2:
                            a2 a2Var3 = this.b;
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
                            a2Var3.r = 0L;
                            a2Var3.a.Y2.N(true);
                            break;
                        default:
                            a2 a2Var4 = this.b;
                            a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                            a2Var4.a.Y2.N(true);
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
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            int i16 = R.string.BrowserSettingsCookiesClearText;
            if (this.n != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.n) + ")";
            }
            b2Var2.T = LocaleController.formatString(i16, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.x1
                public final /* synthetic */ a2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void k(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                    switch (i11) {
                        case 0:
                            a2 a2Var = this.b;
                            a2Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(a2Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    a2.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    a2.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            o2 b10 = o2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            a2Var.a0();
                            break;
                        case 1:
                            a2 a2Var2 = this.b;
                            a2Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    a2.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            a2Var2.a0();
                            break;
                        case 2:
                            a2 a2Var3 = this.b;
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
                            a2Var3.r = 0L;
                            a2Var3.a.Y2.N(true);
                            break;
                        default:
                            a2 a2Var4 = this.b;
                            a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                            a2Var4.a.Y2.N(true);
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
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
            b2Var3.R = string3;
            b2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j3 / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.x1
                public final /* synthetic */ a2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void k(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                    switch (i13) {
                        case 0:
                            a2 a2Var = this.b;
                            a2Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(a2Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    a2.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    a2.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            o2 b10 = o2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            a2Var.a0();
                            break;
                        case 1:
                            a2 a2Var2 = this.b;
                            a2Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    a2.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            a2Var2.a0();
                            break;
                        case 2:
                            a2 a2Var3 = this.b;
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
                            a2Var3.r = 0L;
                            a2Var3.a.Y2.N(true);
                            break;
                        default:
                            a2 a2Var4 = this.b;
                            a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                            a2Var4.a.Y2.N(true);
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
            i1[] i1VarArr = {null};
            org.telegram.ui.ActionBar.n2 i1Var = new i1(null, new pj0(11, this, i1VarArr));
            i1VarArr[0] = i1Var;
            presentFragment(i1Var);
            return;
        }
        int i18 = 5;
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
            b2Var4.R = string4;
            b2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.x1
                public final /* synthetic */ a2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void k(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                    switch (i15) {
                        case 0:
                            a2 a2Var = this.b;
                            a2Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(a2Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    a2.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    a2.Y(file2, null);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            o2 b10 = o2.b();
                            HashMap hashMap = b10.a;
                            if (hashMap == null) {
                                b10.c = false;
                                b10.b = true;
                                b10.a = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            b10.d();
                            a2Var.a0();
                            break;
                        case 1:
                            a2 a2Var2 = this.b;
                            a2Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    a2.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            a2Var2.a0();
                            break;
                        case 2:
                            a2 a2Var3 = this.b;
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
                            a2Var3.r = 0L;
                            a2Var3.a.Y2.N(true);
                            break;
                        default:
                            a2 a2Var4 = this.b;
                            a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                            a2Var4.a.Y2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (w51Var.G(y1.class)) {
            z1 z1Var = (z1) view;
            String str2 = z1Var.e;
            v70 F = v70.F((ViewGroup) this.fragmentView, null, z1Var);
            F.s = 40;
            F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new g1(i15, this, str2), false);
            F.Z();
            return;
        }
        int i19 = w51Var.d;
        if (i19 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList b10 = p1.b();
            int size2 = b10.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i20 = 0;
            while (i20 < size2) {
                charSequenceArr[i20] = ((p1) b10.get(i20)).a;
                m6 m6Var = new m6(getParentActivity(), null);
                m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                m6Var.a(j6.w0(null, j6.g7, false), j6.w0(null, j6.E5, false));
                m6Var.b(charSequenceArr[i20], i20 == SharedConfig.searchEngineType);
                m6Var.setBackground(j6.f0(j6.w0(null, j6.i6, false), 2, -1));
                linearLayout.addView(m6Var);
                m6Var.setOnClickListener(new va(i20, view, atomicReference));
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
                d5.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            f6 resourceProvider = getResourceProvider();
            i3 i3Var = new i3(i18, this, isWebBrowserInAppEnabled2);
            Pattern pattern = d5.a;
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
            n5 n5Var = new n5(editTextBoldCursor, i3Var, b2VarArr, currentFocus, 16);
            editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(n5Var, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, y5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.n(linearLayout2);
            b2Var6.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(n5Var, i13));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new es(11));
            b2VarArr[0] = b2Var6;
            b2Var6.h0 = false;
            b2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, i11));
            b2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(i12, editTextBoldCursor));
            b2VarArr[0].show();
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean X(w51 w51Var, View view) {
        return false;
    }

    public final void a0() {
        k61 k61Var;
        if (f1.a(new b1(this, 2)) != null) {
            this.r = r0.size();
            m61 m61Var = this.a;
            if (m61Var != null && (k61Var = m61Var.Y2) != null && m61Var.G) {
                k61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new r0(this, 5));
    }

    @Override // org.telegram.ui.Components.n61, org.telegram.ui.ActionBar.n2
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
        m61 m61Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (m61Var = this.a) == null) {
            return;
        }
        m61Var.Y2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final vl0 getListViewForSimpleGlass() {
        return this.a;
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
}
