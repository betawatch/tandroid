package org.telegram.ui.web;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import bi.c3;
import bi.c5;
import bi.fa;
import bi.ga;
import bi.i5;
import bi.k9;
import bi.l3;
import bi.o4;
import bi.r4;
import bi.z4;
import fi.d5;
import fi.f5;
import fi.k3;
import fi.q4;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.k5;
import ji.u4;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.es0;
import org.telegram.ui.oj1;
import org.telegram.ui.q9;
import org.telegram.ui.sw0;
import org.telegram.ui.u9;
import org.telegram.ui.w81;
import w7.b6;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class d1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean P0 = true;
    public static int Q0;
    public static HashMap R0;
    public int A0;
    public boolean B0;
    public Runnable C0;
    public boolean D0;
    public int E;
    public f5 E0;
    public String F;
    public String F0;
    public String G;
    public final Rect G0;
    public int H;
    public int H0;
    public int I;
    public k9 I0;
    public String J;
    public final u J0;
    public String K;
    public int K0;
    public String L;
    public int L0;
    public int M;
    public long M0;
    public boolean N;
    public final int N0;
    public boolean O;
    public Utilities.Callback4 O0;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public er0 V;
    public Activity W;
    public z0 a;
    public boolean a0;
    public String b;
    public String b0;
    public i0 c;
    public org.telegram.ui.ActionBar.b2 c0;
    public c1 d;
    public int d0;
    public final f6 e;
    public long e0;
    public final TextView f;
    public long f0;
    public q9 g0;
    public boolean h;
    public boolean h0;
    public String i0;
    public fi.s j0;
    public fi.w0 k0;
    public fi.l0 l0;
    public fi.t1 m0;
    public final org.telegram.ui.Components.voip.h n;
    public fi.t1 n0;
    public final boolean o0;
    public int p0;
    public boolean q0;
    public SvgHelper.SvgDrawable r;
    public BotWebViewContainer$BotWebViewProxy r0;
    public final i5 s;
    public long s0;
    public boolean t0;
    public BotWebViewContainer$WebViewProxy u0;
    public boolean v;
    public z0 v0;
    public q0.a w;
    public int w0;
    public ValueCallback x;
    public boolean x0;
    public int y;
    public boolean y0;
    public float z0;

    public d1(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n = hVar;
        int i11 = j6.Oh;
        this.y = k(i11);
        int i12 = j6.Sh;
        this.E = k(i12);
        this.F = "";
        this.H = k(i11);
        this.I = k(i12);
        this.J = "";
        this.K = "";
        this.M = UserConfig.selectedAccount;
        this.A0 = -1;
        this.G0 = new Rect(0, 0, 0, 0);
        this.H0 = 0;
        this.J0 = new u(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.o0 = z10;
        this.e = f6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.k = false;
        hVar.b(i10, 153);
        i5 i5Var = new i5(this, context);
        this.s = i5Var;
        int k10 = k(j6.Ki);
        this.p0 = k10;
        i5Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        i5Var.getImageReceiver().setAspectFit(true);
        addView(i5Var, x5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(j6.y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, x5.e(-1, -2, 17));
        setFocusable(false);
    }

    public static JSONObject B(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject C(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse N(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(of.f.v(Uri.parse(str2), "https", null, T(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static String T(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < split.length; i10++) {
            if (i10 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i10].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb2.toString();
    }

    public static void a(d1 d1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            d1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else {
            if (d1Var.d(strArr)) {
                aVar.accept(Boolean.TRUE);
                return;
            }
            d1Var.V = new er0(d1Var, aVar, strArr, 16);
            Activity activity = d1Var.W;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        if (!q(Uri.parse(str))) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        try {
            hostAuthority = IDN.toASCII(hostAuthority, 1);
        } catch (Exception unused) {
        }
        String T = T(hostAuthority);
        if (R0 == null) {
            R0 = new HashMap();
        }
        R0.put(T, hostAuthority);
        return of.f.v(Uri.parse(str), "https", null, T, null);
    }

    public static String l(String str) {
        if (str != null && !str.isEmpty()) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (scheme != null && host != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(scheme);
                sb2.append("://");
                sb2.append(host);
                if (port != -1 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb2.append(":");
                    sb2.append(port);
                }
                return sb2.toString();
            }
        }
        return null;
    }

    public static boolean q(Uri uri) {
        if ("tonsite".equals(uri.getScheme())) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority == null && uri.getScheme() == null) {
            authority = Uri.parse("http://" + uri.toString()).getAuthority();
        }
        if (authority != null) {
            return authority.endsWith(".ton") || authority.endsWith(".adnl");
        }
        return false;
    }

    private void setupFlickerParams(boolean z10) {
        this.v = z10;
        i5 i5Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i5Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        i5Var.requestLayout();
    }

    private void setupWebView(z0 z0Var) {
        X(z0Var, null);
    }

    public static String v(String str) {
        String str2;
        if (R0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb2.toString()) && (str2 = (String) R0.get(hostAuthority)) != null) ? of.f.v(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void x(int i10, z0 z0Var, k9 k9Var, String str, JSONObject jSONObject) {
        if (z0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new es0(z0Var, k9Var, str, jSONObject, 21));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p5;
        try {
            p5 = k3.p(this.e, true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (p5 != null) {
            jSONObject = new JSONObject().put("theme_params", p5);
            z("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        z("theme_changed", jSONObject);
    }

    public final boolean D() {
        if (this.a == null || !this.R) {
            return false;
        }
        z("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x07bc, code lost:
    
        r5.vibrate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x07bf, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x11f4  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x1200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final k9 k9Var, String str, String str2) {
        char c10;
        int i10;
        int i11;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        final int i12;
        q9 q9Var;
        final d1 d1Var;
        final d1 d1Var2;
        k9 k9Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j3;
        int i13;
        TLRPC.User user;
        JSONObject jSONObject;
        long j10;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        JSONArray jSONArray;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject optJSONObject;
        boolean z13;
        LaunchActivity launchActivity;
        boolean z14;
        long j11;
        boolean z15;
        if (this.o0) {
            if (this.a == null || this.c == null) {
                h("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!p(k9Var)) {
                h("onEventReceived ignore " + str + " after document change");
                return;
            }
            h("onEventReceived " + str);
            str.getClass();
            switch (str.hashCode()) {
                case -2016939055:
                    if (str.equals("web_app_invoke_custom_method")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1898902656:
                    if (str.equals("web_app_close_scan_qr_popup")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1736707758:
                    if (str.equals("web_app_biometry_get_info")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1717314938:
                    if (str.equals("web_app_open_link")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1715704462:
                    if (str.equals("web_app_request_file_download")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1693280352:
                    if (str.equals("web_app_open_popup")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1390641887:
                    if (str.equals("web_app_open_invoice")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1385387727:
                    if (str.equals("web_app_set_emoji_status")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1353432696:
                    if (str.equals("web_app_setup_secondary_button")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1341039673:
                    if (str.equals("web_app_setup_closing_behavior")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1309122684:
                    if (str.equals("web_app_open_scan_qr_popup")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1263619595:
                    if (str.equals("web_app_request_phone")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1259935152:
                    if (str.equals("web_app_request_theme")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1229296877:
                    if (str.equals("web_app_secure_storage_get_key")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1183558219:
                    if (str.equals("web_app_check_location")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1093591555:
                    if (str.equals("web_app_biometry_open_settings")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -921083201:
                    if (str.equals("web_app_request_viewport")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -907261345:
                    if (str.equals("web_app_request_emoji_status_access")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -620103109:
                    if (str.equals("web_app_stop_device_orientation")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -585008607:
                    if (str.equals("web_app_device_storage_save_key")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -581005326:
                    if (str.equals("web_app_device_storage_get_key")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -512688845:
                    if (str.equals("web_app_biometry_request_auth")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -498118340:
                    if (str.equals("web_app_toggle_orientation_lock")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -474676372:
                    if (str.equals("web_app_allow_scroll")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -439770054:
                    if (str.equals("web_app_open_tg_link")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -293897269:
                    if (str.equals("web_app_secure_storage_restore_key")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -244584646:
                    if (str.equals("web_app_share_to_story")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -216725042:
                    if (str.equals("web_app_request_location")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -111186465:
                    if (str.equals("web_app_start_gyroscope")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -71726289:
                    if (str.equals("web_app_close")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -58095910:
                    if (str.equals("web_app_ready")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 22015443:
                    if (str.equals("web_app_read_text_from_clipboard")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 127735931:
                    if (str.equals("web_app_hide_keyboard")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 189207985:
                    if (str.equals("web_app_stop_gyroscope")) {
                        c10 = '!';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 267846314:
                    if (str.equals("web_app_secure_storage_clear")) {
                        c10 = '\"';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 348967753:
                    if (str.equals("web_app_device_storage_clear")) {
                        c10 = '#';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 420328489:
                    if (str.equals("web_app_start_accelerometer")) {
                        c10 = '$';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 475603707:
                    if (str.equals("web_app_stop_accelerometer")) {
                        c10 = '%';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 622108947:
                    if (str.equals("web_app_send_prepared_message")) {
                        c10 = '&';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 668142772:
                    if (str.equals("web_app_data_send")) {
                        c10 = '\'';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 671811520:
                    if (str.equals("web_app_request_content_safe_area")) {
                        c10 = '(';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 721956751:
                    if (str.equals("web_app_add_to_home_screen")) {
                        c10 = ')';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 748864404:
                    if (str.equals("web_app_request_fullscreen")) {
                        c10 = '*';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 751292356:
                    if (str.equals("web_app_switch_inline_query")) {
                        c10 = '+';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 792789792:
                    if (str.equals("web_app_secure_storage_save_key")) {
                        c10 = ',';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 796110323:
                    if (str.equals("web_app_exit_fullscreen")) {
                        c10 = '-';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 880626018:
                    if (str.equals("web_app_verify_age")) {
                        c10 = '.';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 909476449:
                    if (str.equals("web_app_open_location_settings")) {
                        c10 = '/';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1011447167:
                    if (str.equals("web_app_setup_back_button")) {
                        c10 = '0';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1210129967:
                    if (str.equals("web_app_biometry_request_access")) {
                        c10 = '1';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1273834781:
                    if (str.equals("web_app_trigger_haptic_feedback")) {
                        c10 = '2';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1398490221:
                    if (str.equals("web_app_setup_main_button")) {
                        c10 = '3';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1453051298:
                    if (str.equals("web_app_setup_swipe_behavior")) {
                        c10 = '4';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1455972419:
                    if (str.equals("web_app_setup_settings_button")) {
                        c10 = '5';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1495787980:
                    if (str.equals("web_app_check_home_screen")) {
                        c10 = '6';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1759965681:
                    if (str.equals("web_app_request_chat")) {
                        c10 = '7';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1812395469:
                    if (str.equals("web_app_start_device_orientation")) {
                        c10 = '8';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1882780382:
                    if (str.equals("web_app_biometry_update_token")) {
                        c10 = '9';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1899078473:
                    if (str.equals("web_app_set_bottom_bar_color")) {
                        c10 = ':';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1917103703:
                    if (str.equals("web_app_set_header_color")) {
                        c10 = ';';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1937068806:
                    if (str.equals("web_app_request_safe_area")) {
                        c10 = '<';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2001330488:
                    if (str.equals("web_app_set_background_color")) {
                        c10 = '=';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2036090717:
                    if (str.equals("web_app_request_write_access")) {
                        c10 = '>';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2139805763:
                    if (str.equals("web_app_expand")) {
                        c10 = '?';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            char c11 = c10;
            u uVar = this.J0;
            long j12 = 1000;
            f6 f6Var = this.e;
            BotWebViewVibrationEffect botWebViewVibrationEffect2 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            n3 n3Var = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            botWebViewVibrationEffect2 = null;
            switch (c11) {
                case 0:
                    if (this.U == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        String string = jSONObject2.getString("req_id");
                        String string2 = jSONObject2.getString("method");
                        String obj = jSONObject2.get("params").toString();
                        int i14 = this.M;
                        z0 z0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = MessagesController.getInstance(i14).getInputUser(this.U.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i14).sendRequest(invokewebviewcustommethod, new fa(this, string, i14, z0Var, k9Var, 11));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        if (e7 instanceof JSONException) {
                            j("JSON Parse error");
                            return;
                        } else {
                            Z(null);
                            return;
                        }
                    }
                case 1:
                    if (!this.h0 || (q9Var = this.g0) == null) {
                        return;
                    }
                    q9Var.dismiss();
                    return;
                case 2:
                    w(k9Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject3.optString("url"));
                        String optString = jSONObject3.optString("try_browser");
                        if (MessagesController.getInstance(this.M).webAppAllowedProtocols == null || !MessagesController.getInstance(this.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                            return;
                        }
                        H(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                case 4:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    if (this.l0 == null) {
                        this.l0 = fi.l0.c(getContext(), this.M, this.U.id);
                    }
                    try {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        String string3 = jSONObject4.getString("url");
                        String string4 = jSONObject4.getString("file_name");
                        if (this.l0.d(string3) != null) {
                            this.l0.b(string3, string4);
                            y(k9Var, "file_download_requested", B("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = MessagesController.getInstance(this.M).getInputUser(this.U);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.M).sendRequest(checkdownloadfileparams, new c3(this, k9Var, string3, string4, 13));
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        y(k9Var, "file_download_requested", B("cancelled", "status"));
                        return;
                    }
                case 5:
                    d1Var = this;
                    try {
                        if (d1Var.c0 == null) {
                            if (System.currentTimeMillis() - d1Var.e0 <= 150) {
                                int i15 = d1Var.d0 + 1;
                                d1Var.d0 = i15;
                                if (i15 >= 3) {
                                    d1Var.d0 = 0;
                                    d1Var.f0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - d1Var.f0 > 3000) {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                String optString2 = jSONObject5.optString("title", null);
                                String string5 = jSONObject5.getString("message");
                                JSONArray jSONArray2 = jSONObject5.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                                    arrayList.add(new a1(jSONArray2.getJSONObject(i16)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final a1 a1Var = (a1) arrayList.get(0);
                                            final int i17 = 0;
                                            alertDialog$Builder.k(a1Var.b, new org.telegram.ui.ActionBar.a2(d1Var) { // from class: org.telegram.ui.web.r
                                                public final /* synthetic */ d1 b;

                                                {
                                                    this.b = d1Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                                                    switch (i17) {
                                                        case 0:
                                                            k9 k9Var3 = k9Var;
                                                            a1 a1Var2 = a1Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            d1 d1Var3 = this.b;
                                                            d1Var3.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                d1Var3.P = System.currentTimeMillis();
                                                                d1Var3.y(k9Var3, "popup_closed", new JSONObject().put("button_id", a1Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                FileLog.e(e12);
                                                                return;
                                                            }
                                                        case 1:
                                                            k9 k9Var4 = k9Var;
                                                            a1 a1Var3 = a1Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            d1 d1Var4 = this.b;
                                                            d1Var4.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                d1Var4.P = System.currentTimeMillis();
                                                                d1Var4.y(k9Var4, "popup_closed", new JSONObject().put("button_id", a1Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                FileLog.e(e13);
                                                                return;
                                                            }
                                                        default:
                                                            k9 k9Var5 = k9Var;
                                                            a1 a1Var4 = a1Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            d1 d1Var5 = this.b;
                                                            d1Var5.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                d1Var5.P = System.currentTimeMillis();
                                                                d1Var5.y(k9Var5, "popup_closed", new JSONObject().put("button_id", a1Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                FileLog.e(e14);
                                                            }
                                                    }
                                                }
                                            });
                                        } catch (JSONException e12) {
                                            e = e12;
                                            FileLog.e(e);
                                            return;
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        final a1 a1Var2 = (a1) arrayList.get(1);
                                        final int i18 = 1;
                                        alertDialog$Builder.h(a1Var2.b, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.r
                                            public final /* synthetic */ d1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.a2
                                            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i182) {
                                                switch (i18) {
                                                    case 0:
                                                        k9 k9Var3 = k9Var;
                                                        a1 a1Var22 = a1Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        d1 d1Var3 = this.b;
                                                        d1Var3.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            d1Var3.P = System.currentTimeMillis();
                                                            d1Var3.y(k9Var3, "popup_closed", new JSONObject().put("button_id", a1Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e122) {
                                                            FileLog.e(e122);
                                                            return;
                                                        }
                                                    case 1:
                                                        k9 k9Var4 = k9Var;
                                                        a1 a1Var3 = a1Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        d1 d1Var4 = this.b;
                                                        d1Var4.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            d1Var4.P = System.currentTimeMillis();
                                                            d1Var4.y(k9Var4, "popup_closed", new JSONObject().put("button_id", a1Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    default:
                                                        k9 k9Var5 = k9Var;
                                                        a1 a1Var4 = a1Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        d1 d1Var5 = this.b;
                                                        d1Var5.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            d1Var5.P = System.currentTimeMillis();
                                                            d1Var5.y(k9Var5, "popup_closed", new JSONObject().put("button_id", a1Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final a1 a1Var3 = (a1) arrayList.get(2);
                                        String str14 = a1Var3.b;
                                        final int i19 = 2;
                                        d1Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(d1Var2) { // from class: org.telegram.ui.web.r
                                                public final /* synthetic */ d1 b;

                                                {
                                                    this.b = d1Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i182) {
                                                    switch (i19) {
                                                        case 0:
                                                            k9 k9Var3 = k9Var;
                                                            a1 a1Var22 = a1Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            d1 d1Var3 = this.b;
                                                            d1Var3.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                d1Var3.P = System.currentTimeMillis();
                                                                d1Var3.y(k9Var3, "popup_closed", new JSONObject().put("button_id", a1Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e122) {
                                                                FileLog.e(e122);
                                                                return;
                                                            }
                                                        case 1:
                                                            k9 k9Var4 = k9Var;
                                                            a1 a1Var32 = a1Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            d1 d1Var4 = this.b;
                                                            d1Var4.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                d1Var4.P = System.currentTimeMillis();
                                                                d1Var4.y(k9Var4, "popup_closed", new JSONObject().put("button_id", a1Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                FileLog.e(e13);
                                                                return;
                                                            }
                                                        default:
                                                            k9 k9Var5 = k9Var;
                                                            a1 a1Var4 = a1Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            d1 d1Var5 = this.b;
                                                            d1Var5.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                d1Var5.P = System.currentTimeMillis();
                                                                d1Var5.y(k9Var5, "popup_closed", new JSONObject().put("button_id", a1Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                FileLog.e(e14);
                                                            }
                                                    }
                                                }
                                            };
                                            k9Var2 = k9Var;
                                            alertDialog$Builder.i(str14, a2Var);
                                        } catch (JSONException e13) {
                                            e = e13;
                                            FileLog.e(e);
                                            return;
                                        }
                                    } else {
                                        d1Var2 = this;
                                        k9Var2 = k9Var;
                                    }
                                    alertDialog$Builder.j(new fi.t0(d1Var2, atomicBoolean, k9Var2, 4));
                                    d1Var2.c0 = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        a1 a1Var4 = (a1) arrayList.get(0);
                                        if (a1Var4.c >= 0 && (textView3 = (TextView) d1Var2.c0.d(-1)) != null) {
                                            textView3.setTextColor(d1Var2.k(a1Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        a1 a1Var5 = (a1) arrayList.get(1);
                                        if (a1Var5.c >= 0 && (textView2 = (TextView) d1Var2.c0.d(-2)) != null) {
                                            textView2.setTextColor(d1Var2.k(a1Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        a1 a1Var6 = (a1) arrayList.get(2);
                                        if (a1Var6.c < 0 || (textView = (TextView) d1Var2.c0.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(d1Var2.k(a1Var6.c));
                                        return;
                                    }
                                    return;
                                }
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (JSONException e14) {
                        e = e14;
                    }
                    break;
                case 6:
                    d1Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (d1Var.b0 != null) {
                            d1Var.G(optString3, "cancelled", true);
                            return;
                        }
                        d1Var.b0 = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(d1Var.M).sendRequest(tL_payments_getPaymentForm, new c5(d1Var, optString3, tL_inputInvoiceSlug, 14));
                        return;
                    } catch (JSONException e15) {
                        FileLog.e(e15);
                        break;
                    }
                case 7:
                    d1Var = this;
                    if (d1Var.U != null && System.currentTimeMillis() - d1Var.P <= 10000) {
                        try {
                            jSONObject = new JSONObject(str2);
                            j3 = Long.parseLong(jSONObject.getString("custom_emoji_id"));
                        } catch (Exception unused) {
                            j3 = 0;
                        }
                        try {
                            i13 = jSONObject.getInt("duration");
                        } catch (Exception unused2) {
                            i13 = 0;
                            user = d1Var.U;
                            if (user != null) {
                            }
                        }
                        user = d1Var.U;
                        if (user != null) {
                            d1Var.y(k9Var, "emoji_status_failed", B("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            d5.f(d1Var.M, user, j3, i13, new s(d1Var, k9Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    d1Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", d1Var.J).trim();
                        boolean z16 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : d1Var.H;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : d1Var.I;
                        boolean z17 = jSONObject6.optBoolean("is_progress_visible", false) && z16;
                        boolean z18 = jSONObject6.optBoolean("has_shine_effect", false) && z16;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : d1Var.K;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j10 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j10 = 0;
                        }
                        d1Var.H = parseColor;
                        d1Var.I = parseColor2;
                        d1Var.J = trim;
                        d1Var.K = optString4;
                        d1Var.L = str2;
                        d1Var.c.l(z16, optBoolean, trim, j10, parseColor, parseColor2, z17, z18, optString4);
                        break;
                    } catch (Exception e16) {
                        FileLog.e(e16);
                        break;
                    }
                    break;
                case '\t':
                    d1Var = this;
                    try {
                        d1Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        break;
                    }
                case '\n':
                    d1Var = this;
                    try {
                        if (!d1Var.h0 && d1Var.W != null) {
                            d1Var.i0 = new JSONObject(str2).optString("text");
                            d1Var.h0 = true;
                            if (Build.VERSION.SDK_INT < 23 || d1Var.W.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = d1Var.W;
                                if (activity != null) {
                                    d1Var.g0 = u9.e0(activity, 3, new u4(d1Var, 15));
                                    return;
                                }
                                break;
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new f0(d1Var, k9Var), NotificationCenter.onRequestPermissionResultReceived);
                                d1Var.W.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                return;
                            }
                        }
                    } catch (JSONException e18) {
                        FileLog.e(e18);
                        break;
                    }
                    break;
                case 11:
                    if (n(4)) {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            y(k9Var, "phone_requested", jSONObject7);
                            return;
                        } catch (Exception e19) {
                            FileLog.e(e19);
                            return;
                        }
                    }
                    final int i20 = this.M;
                    final z0 z0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), f6Var);
                    alertDialog$Builder2.l(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String userName = UserObject.getUserName(this.U);
                    if (TextUtils.isEmpty(userName)) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                    }
                    final boolean z19 = MessagesController.getInstance(this.M).blockePeers.indexOfKey(this.U.id) >= 0;
                    if (z19) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.web.x
                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i21) {
                            strArr[0] = null;
                            b2Var.dismiss();
                            d1 d1Var3 = d1.this;
                            boolean z20 = z19;
                            int i22 = i20;
                            z0 z0Var3 = z0Var2;
                            k9 k9Var3 = k9Var;
                            if (z20) {
                                MessagesController.getInstance(d1Var3.M).unblockPeer(d1Var3.U.id, new r11(d1Var3, i22, z0Var3, k9Var3, 13));
                                return;
                            }
                            SendMessagesHelper.getInstance(d1Var3.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(d1Var3.M).getCurrentUser(), d1Var3.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                d1.x(i22, z0Var3, k9Var3, "phone_requested", jSONObject8);
                            } catch (Exception e20) {
                                FileLog.e(e20);
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new sw0(6));
                    Y(4, alertDialog$Builder2.a(), new y(strArr, i20, z0Var2, k9Var, 0));
                    return;
                case '\f':
                    A();
                    return;
                case '\r':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i21 = this.M;
                        this.n0 = new fi.t1(UserConfig.getInstance(i21).getClientUserId(), this.U.id, i21, true);
                    }
                    m(k9Var, this.n0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.k0 == null) {
                        fi.w0 e20 = fi.w0.e(getContext(), this.M, this.U.id);
                        this.k0 = e20;
                        e20.f.add(uVar);
                    }
                    this.I0 = k9Var;
                    uVar.run();
                    return;
                case 15:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null || U.getParentLayout() == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.d5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(this.U.id));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                    i0 i0Var = this.c;
                    if (i0Var != null) {
                        i0Var.b();
                        return;
                    }
                    return;
                case 16:
                    o(!((getParent() instanceof q4) && ((q4) getParent()).d()), true);
                    return;
                case 17:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    d5.a(this.M, this.U.id, new s(this, k9Var, 0));
                    return;
                case 18:
                    fi.a1 z20 = this.c.z();
                    if (z20 == null || !z20.h()) {
                        y(k9Var, "device_orientation_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(k9Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i22 = this.M;
                        this.m0 = new fi.t1(UserConfig.getInstance(i22).getClientUserId(), this.U.id, i22, false);
                    }
                    V(k9Var, this.m0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i23 = this.M;
                        this.m0 = new fi.t1(UserConfig.getInstance(i23).getClientUserId(), this.U.id, i23, false);
                    }
                    m(k9Var, this.m0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    f();
                    fi.s sVar = this.j0;
                    if (sVar == null) {
                        return;
                    }
                    if (sVar.e) {
                        sVar.j(str3, true, null, new bi.j0(2, sVar, new s(this, k9Var, 3)));
                        return;
                    }
                    try {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("status", "failed");
                        y(k9Var, "biometry_auth_requested", jSONObject8);
                        return;
                    } catch (Exception e21) {
                        FileLog.e(e21);
                        return;
                    }
                case 22:
                    try {
                        z10 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z10 = false;
                    }
                    i0 i0Var2 = this.c;
                    if (i0Var2 != null) {
                        i0Var2.p(z10);
                        return;
                    }
                    return;
                case 23:
                    try {
                        jSONArray = new JSONArray(str2);
                        z11 = jSONArray.optBoolean(0, true);
                    } catch (Exception unused6) {
                        z11 = true;
                    }
                    try {
                        z12 = jSONArray.optBoolean(1, true);
                    } catch (Exception unused7) {
                        z12 = true;
                        h("allowScroll " + z11 + " " + z12);
                        if (getParent() instanceof q4) {
                        }
                    }
                    h("allowScroll " + z11 + " " + z12);
                    if (getParent() instanceof q4) {
                        return;
                    }
                    ((q4) getParent()).a(z11, z12);
                    return;
                case 24:
                    try {
                        JSONObject jSONObject9 = new JSONObject(str2);
                        String optString5 = jSONObject9.optString("path_full");
                        boolean optBoolean2 = jSONObject9.optBoolean("force_request", false);
                        if (optString5.startsWith("/")) {
                            optString5 = optString5.substring(1);
                        }
                        H(Uri.parse("https://t.me/" + optString5), null, false, true, optBoolean2);
                        return;
                    } catch (JSONException e22) {
                        FileLog.e(e22);
                        return;
                    }
                case 25:
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i24 = this.M;
                        this.n0 = new fi.t1(UserConfig.getInstance(i24).getClientUserId(), this.U.id, i24, true);
                    }
                    S(k9Var, this.n0, str2);
                    return;
                case 26:
                    if (System.currentTimeMillis() - this.P > 10000 || System.currentTimeMillis() - this.Q < 2000) {
                        return;
                    }
                    this.P = 0L;
                    this.Q = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject10 = new JSONObject(str2);
                        str5 = jSONObject10.optString("media_url");
                        try {
                            str6 = jSONObject10.optString("text");
                            try {
                                optJSONObject = jSONObject10.optJSONObject("widget_link");
                            } catch (Exception e23) {
                                e = e23;
                                str4 = null;
                            }
                        } catch (Exception e24) {
                            e = e24;
                            str4 = null;
                            str6 = null;
                        }
                    } catch (Exception e25) {
                        e = e25;
                        str4 = null;
                        str5 = null;
                        str6 = null;
                    }
                    if (optJSONObject != null) {
                        str4 = optJSONObject.optString("url");
                        try {
                            str9 = optJSONObject.optString("name");
                            str7 = str5;
                            str8 = str6;
                        } catch (Exception e26) {
                            e = e26;
                            FileLog.e(e);
                            str7 = str5;
                            str8 = str6;
                            str9 = null;
                            str10 = str4;
                            if (str7 == null) {
                            }
                        }
                        str10 = str4;
                        if (str7 == null) {
                            return;
                        }
                        if (!MessagesController.getInstance(this.M).storiesEnabled()) {
                            new sg.a1((org.telegram.ui.ActionBar.n2) new l3(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.W);
                        new HttpGetFileTask(new b0(this, b2Var, str8, str10, str9), null).execute(str7);
                        b2Var.q(250L);
                        return;
                    }
                    str7 = str5;
                    str8 = str6;
                    str9 = null;
                    str10 = null;
                    if (str7 == null) {
                    }
                    break;
                case 27:
                    if (this.U == null) {
                        return;
                    }
                    if (this.k0 == null) {
                        fi.w0 e27 = fi.w0.e(getContext(), this.M, this.U.id);
                        this.k0 = e27;
                        e27.f.add(uVar);
                    }
                    this.I0 = k9Var;
                    if (this.k0.g()) {
                        this.k0.k(new t(this, k9Var, 0));
                        return;
                    } else {
                        this.k0.j(new s(this, k9Var, 1));
                        return;
                    }
                case 28:
                    fi.a1 z21 = this.c.z();
                    try {
                        j12 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long clamp = Utilities.clamp(j12, 1000L, 20L);
                    if (z21 == null || !z21.d(clamp)) {
                        y(k9Var, "gyroscope_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(k9Var, "gyroscope_started", null);
                        return;
                    }
                case 29:
                    try {
                        z13 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e28) {
                        FileLog.e(e28);
                        z13 = false;
                    }
                    this.c.y();
                    if (z13) {
                        if (this.D0 && LaunchActivity.G1 != null) {
                            Activity findActivity = AndroidUtilities.findActivity(getContext());
                            if (findActivity == null) {
                                findActivity = LaunchActivity.G1;
                            }
                            if (findActivity == null || findActivity.isFinishing()) {
                                return;
                            }
                            findActivity.moveTaskToBack(true);
                            return;
                        }
                        if (this.E0 == null || (launchActivity = LaunchActivity.G1) == null || launchActivity.P() == null) {
                            return;
                        }
                        o3 P = LaunchActivity.G1.P();
                        ArrayList<n3> tabs = P.getTabs();
                        int i25 = 0;
                        while (true) {
                            if (i25 < tabs.size()) {
                                n3 n3Var2 = tabs.get(i25);
                                if (!this.E0.equals(n3Var2.a) || n3Var2.b == this.a) {
                                    i25++;
                                } else {
                                    n3Var = n3Var2;
                                }
                            }
                        }
                        if (n3Var != null) {
                            P.e(n3Var);
                            return;
                        }
                        return;
                    }
                    return;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    U(this.a.getUrl(), true);
                    return;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.P <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            y(k9Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            return;
                        }
                        y(k9Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                        return;
                    } catch (JSONException e29) {
                        FileLog.e(e29);
                        return;
                    }
                case ' ':
                    Activity findActivity2 = AndroidUtilities.findActivity(getContext());
                    if (findActivity2 == null) {
                        findActivity2 = LaunchActivity.G1;
                    }
                    if (findActivity2 != null) {
                        AndroidUtilities.hideKeyboard(findActivity2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    fi.a1 z22 = this.c.z();
                    if (z22 == null || !z22.g()) {
                        y(k9Var, "gyroscope_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(k9Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i26 = this.M;
                        this.n0 = new fi.t1(UserConfig.getInstance(i26).getClientUserId(), this.U.id, i26, true);
                    }
                    e(k9Var, this.n0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i27 = this.M;
                        this.m0 = new fi.t1(UserConfig.getInstance(i27).getClientUserId(), this.U.id, i27, false);
                    }
                    e(k9Var, this.m0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    fi.a1 z23 = this.c.z();
                    try {
                        j12 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long clamp2 = Utilities.clamp(j12, 1000L, 20L);
                    if (z23 == null || !z23.c(clamp2)) {
                        y(k9Var, "accelerometer_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(k9Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    fi.a1 z24 = this.c.z();
                    if (z24 == null || !z24.f()) {
                        y(k9Var, "accelerometer_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(k9Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            y(k9Var, "prepared_message_failed", B("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            fi.p1.Q(getContext(), this.M, this.U.id, string7, this.e, new u(this, 0), new org.telegram.tgnet.e(this, k9Var, botWebViewContainer$BotWebViewProxy, 4));
                            return;
                        }
                    } catch (Exception e30) {
                        FileLog.e(e30);
                        y(k9Var, "prepared_message_failed", B("MESSAGE_EXPIRED", "error"));
                        return;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        return;
                    } catch (JSONException e31) {
                        FileLog.e(e31);
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    P(this.H0, true);
                    return;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    if (MediaDataController.getInstance(this.M).isShortcutAdded(this.U.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                        y(k9Var, "home_screen_added", null);
                        return;
                    } else {
                        MediaDataController.getInstance(this.M).installShortcut(this.U.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new t(this, k9Var, 2));
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    try {
                        z14 = new JSONObject(str2).optBoolean("blur", true);
                    } catch (Exception unused10) {
                        z14 = true;
                    }
                    String g10 = this.c.g(true, z14);
                    if (g10 == null) {
                        y(k9Var, "fullscreen_changed", C("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z14)));
                        return;
                    } else {
                        y(k9Var, "fullscreen_failed", B(g10, "error"));
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i28 = 0; i28 < jSONArray3.length(); i28++) {
                            arrayList2.add(jSONArray3.getString(i28));
                        }
                        this.c.v(this.U, jSONObject11.getString("query"), arrayList2);
                        return;
                    } catch (JSONException e32) {
                        FileLog.e(e32);
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i29 = this.M;
                        this.n0 = new fi.t1(UserConfig.getInstance(i29).getClientUserId(), this.U.id, i29, true);
                    }
                    V(k9Var, this.n0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        y(k9Var, "fullscreen_changed", B(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        y(k9Var, "fullscreen_failed", B(g11, "error"));
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    if (this.O0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z25 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    d1.this.O0.run(Boolean.valueOf(z25), Double.valueOf(d), optString6, Double.valueOf(optDouble));
                                }
                            });
                            return;
                        } catch (Exception e33) {
                            FileLog.e(e33);
                            return;
                        }
                    }
                    return;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 == null || U2.getParentLayout() == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.d5 parentLayout2 = U2.getParentLayout();
                    U2.presentFragment(ProfileActivity.m4(this.U.id));
                    AndroidUtilities.scrollToFragmentRow(parentLayout2, "botPermissionLocation");
                    i0 i0Var3 = this.c;
                    if (i0Var3 != null) {
                        i0Var3.b();
                        return;
                    }
                    return;
                case '0':
                    try {
                        boolean optBoolean3 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean3 != this.R) {
                            this.R = optBoolean3;
                            this.c.i(optBoolean3);
                            return;
                        }
                        return;
                    } catch (JSONException e34) {
                        FileLog.e(e34);
                        return;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    try {
                        str12 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused11) {
                    }
                    f();
                    fi.s sVar2 = this.j0;
                    if (sVar2 == null) {
                        return;
                    }
                    boolean z26 = sVar2.f;
                    if (z26) {
                        w(k9Var);
                        return;
                    }
                    if (sVar2.e) {
                        if (!z26) {
                            sVar2.f = true;
                            sVar2.k();
                        }
                        w(k9Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new w81(27, this, k9Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), f6Var);
                    if (TextUtils.isEmpty(str12)) {
                        alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                        i12 = 0;
                        alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.U))));
                    } else {
                        i12 = 0;
                        alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.U))));
                        alertDialog$Builder3.g(str12);
                    }
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.a0
                        public final /* synthetic */ d1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i30) {
                            switch (i12) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    d1 d1Var3 = this.b;
                                    fi.s sVar3 = d1Var3.j0;
                                    sVar3.f = true;
                                    sVar3.k();
                                    fi.s sVar4 = d1Var3.j0;
                                    s sVar5 = new s(d1Var3, k9Var, 2);
                                    sVar4.getClass();
                                    sVar4.j(null, true, null, new bi.j0(2, sVar4, sVar5));
                                    break;
                                default:
                                    d1 d1Var4 = this.b;
                                    d1Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    fi.s sVar6 = d1Var4.j0;
                                    sVar6.f = true;
                                    sVar6.d = true;
                                    sVar6.k();
                                    d1Var4.w(k9Var);
                                    break;
                            }
                        }
                    });
                    final int i30 = 1;
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.a0
                        public final /* synthetic */ d1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i302) {
                            switch (i30) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    d1 d1Var3 = this.b;
                                    fi.s sVar3 = d1Var3.j0;
                                    sVar3.f = true;
                                    sVar3.k();
                                    fi.s sVar4 = d1Var3.j0;
                                    s sVar5 = new s(d1Var3, k9Var, 2);
                                    sVar4.getClass();
                                    sVar4.j(null, true, null, new bi.j0(2, sVar4, sVar5));
                                    break;
                                default:
                                    d1 d1Var4 = this.b;
                                    d1Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    fi.s sVar6 = d1Var4.j0;
                                    sVar6.f = true;
                                    sVar6.d = true;
                                    sVar6.k();
                                    d1Var4.w(k9Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new r4(runnableArr, 6));
                    alertDialog$Builder3.o();
                    return;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    try {
                        JSONObject jSONObject13 = new JSONObject(str2);
                        String optString7 = jSONObject13.optString(TeXSymbolParser.TYPE_ATTR);
                        int hashCode = optString7.hashCode();
                        if (hashCode != -1184809658) {
                            if (hashCode == 193071555) {
                                if (optString7.equals("selection_change")) {
                                    botWebViewVibrationEffect2 = BotWebViewVibrationEffect.SELECTION_CHANGE;
                                    break;
                                }
                            } else if (hashCode == 595233003 && optString7.equals("notification")) {
                                String optString8 = jSONObject13.optString("notification_type");
                                int hashCode2 = optString8.hashCode();
                                if (hashCode2 != -1867169789) {
                                    if (hashCode2 != 96784904) {
                                        if (hashCode2 == 1124446108 && optString8.equals("warning")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_WARNING;
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                            break;
                                        }
                                    } else if (optString8.equals("error")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_ERROR;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                    }
                                } else if (optString8.equals("success")) {
                                    botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_SUCCESS;
                                    botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                }
                            }
                            return;
                        }
                        if (optString7.equals("impact")) {
                            String optString9 = jSONObject13.optString("impact_style");
                            switch (optString9.hashCode()) {
                                case -1078030475:
                                    if (optString9.equals("medium")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_MEDIUM;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        break;
                                    }
                                    break;
                                case 3535914:
                                    if (optString9.equals("soft")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_SOFT;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        break;
                                    }
                                    break;
                                case 99152071:
                                    if (optString9.equals("heavy")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_HEAVY;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        break;
                                    }
                                    break;
                                case 102970646:
                                    if (optString9.equals("light")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_LIGHT;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        break;
                                    }
                                    break;
                                case 108511787:
                                    if (optString9.equals("rigid")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_RIGID;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        break;
                                    }
                                    break;
                            }
                        }
                        return;
                    } catch (Exception e35) {
                        FileLog.e(e35);
                        return;
                    }
                case '3':
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.F).trim();
                        boolean z27 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.y;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.E;
                        boolean z28 = jSONObject14.optBoolean("is_progress_visible", false) && z27;
                        boolean z29 = jSONObject14.optBoolean("has_shine_effect", false) && z27;
                        try {
                            j11 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j11 = 0;
                        }
                        this.y = parseColor3;
                        this.E = parseColor4;
                        this.F = trim2;
                        this.G = str2;
                        this.c.q(z27, optBoolean4, trim2, j11, parseColor3, parseColor4, z28, z29);
                        return;
                    } catch (Exception e36) {
                        FileLog.e(e36);
                        return;
                    }
                case '4':
                    try {
                        this.c.x(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        return;
                    } catch (JSONException e37) {
                        FileLog.e(e37);
                        return;
                    }
                case '5':
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.S) {
                            this.S = optBoolean5;
                            this.c.t(optBoolean5);
                            return;
                        }
                        return;
                    } catch (JSONException e38) {
                        FileLog.e(e38);
                        return;
                    }
                case '6':
                    y(k9Var, "home_screen_checked", B((this.U == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.M).isShortcutAdded(this.U.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
                    return;
                case '7':
                    try {
                        str11 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e39) {
                        FileLog.e(e39);
                    }
                    if (str11 == null) {
                        return;
                    }
                    TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                    getrequestedwebviewbutton.bot = MessagesController.getInstance(this.M).getInputUser(this.U);
                    getrequestedwebviewbutton.webapp_req_id = str11;
                    ConnectionsManager.getInstance(this.M).sendRequestTyped(getrequestedwebviewbutton, new a3.a(1), new w(this, k9Var, str11, 0));
                    return;
                case '8':
                    fi.a1 z30 = this.c.z();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j12 = jSONObject15.getLong("refresh_rate");
                        z15 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        z15 = false;
                    }
                    long clamp3 = Utilities.clamp(j12, 1000L, 20L);
                    if (z30 == null || !z30.e(clamp3, z15)) {
                        y(k9Var, "device_orientation_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(k9Var, "device_orientation_started", null);
                        return;
                    }
                case '9':
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str13 = jSONObject16.getString("reason");
                        } catch (Exception unused14) {
                        }
                        f();
                        fi.s sVar3 = this.j0;
                        if (sVar3 == null) {
                            return;
                        }
                        if (sVar3.e) {
                            sVar3.l(str13, string8, new o4(this, string8, k9Var, 7));
                            return;
                        }
                        try {
                            JSONObject jSONObject17 = new JSONObject();
                            jSONObject17.put("status", "failed");
                            y(k9Var, "biometry_token_updated", jSONObject17);
                            return;
                        } catch (Exception e40) {
                            FileLog.e(e40);
                            return;
                        }
                    } catch (Exception e41) {
                        FileLog.e(e41);
                        if (e41 instanceof JSONException) {
                            j("JSON Parse error");
                            return;
                        } else {
                            Z(null);
                            return;
                        }
                    }
                case ':':
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        int v02 = TextUtils.isEmpty(optString10) ? j6.v0(j6.a7, f6Var) : Color.parseColor(optString10);
                        i0 i0Var4 = this.c;
                        if (i0Var4 != null) {
                            i0Var4.r(v02);
                            return;
                        }
                        return;
                    } catch (Exception e42) {
                        FileLog.e(e42);
                        return;
                    }
                case ';':
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String optString11 = jSONObject18.optString("color", null);
                        if (!TextUtils.isEmpty(optString11)) {
                            int parseColor5 = Color.parseColor(optString11);
                            if (parseColor5 != 0) {
                                this.c.u(-1, parseColor5, true);
                                return;
                            }
                            return;
                        }
                        String optString12 = jSONObject18.optString("color_key");
                        int hashCode3 = optString12.hashCode();
                        if (hashCode3 != -1265068311) {
                            if (hashCode3 == -210781868 && optString12.equals("secondary_bg_color")) {
                                i10 = j6.a7;
                                i11 = i10;
                            }
                            i11 = -1;
                        } else {
                            if (optString12.equals("bg_color")) {
                                i10 = j6.d6;
                                i11 = i10;
                            }
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            this.c.u(i11, j6.v0(i11, f6Var), false);
                            return;
                        }
                        return;
                    } catch (Exception e43) {
                        FileLog.e(e43);
                        return;
                    }
                case '<':
                    Q(this.G0, true);
                    return;
                case '=':
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        return;
                    } catch (Exception e44) {
                        FileLog.e(e44);
                        return;
                    }
                case '>':
                    if (!n(3)) {
                        int i31 = this.M;
                        z0 z0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.M).getInputUser(this.U);
                        ConnectionsManager.getInstance(this.M).sendRequest(cansendmessage, new ga(this, i31, z0Var3, k9Var, 8));
                        return;
                    }
                    try {
                        JSONObject jSONObject19 = new JSONObject();
                        jSONObject19.put("status", "cancelled");
                        y(k9Var, "write_access_requested", jSONObject19);
                        return;
                    } catch (Exception e45) {
                        FileLog.e(e45);
                        return;
                    }
                case '?':
                    this.c.s();
                    return;
                default:
                    FileLog.d("unknown webapp event ".concat(str));
                    return;
            }
        }
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            z("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z10 || !Objects.equals(this.b0, str)) {
                return;
            }
            this.b0 = null;
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    public final void H(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P <= 10000 || !z11) {
            this.P = 0L;
            boolean[] zArr = {false};
            if (of.f.f(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            of.f.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
        }
    }

    public abstract void K(z0 z0Var);

    public final void M() {
        h("preserveWebView");
        this.B0 = true;
        if (this.o0) {
            z("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.s0++;
        }
        z0 z0Var = this.a;
        if (z0Var != null) {
            z0Var.f(null, null);
            this.a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.a = null;
        }
    }

    public final void O(int i10, z0 z0Var, Object obj, String str, boolean z10) {
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.o0;
        if (z11) {
            this.s0++;
            this.t0 = z10;
            this.F0 = z10 ? l(str) : null;
        }
        X(z0Var, obj);
        if (z11) {
            z("visibility_changed", B(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i10, boolean z10) {
        JSONObject jSONObject;
        if (z10 || i10 != this.H0) {
            Float valueOf = Float.valueOf(i10 / AndroidUtilities.density);
            try {
                jSONObject = new JSONObject();
                jSONObject.put("left", (Object) 0);
                jSONObject.put("top", valueOf);
                jSONObject.put("right", (Object) 0);
                jSONObject.put("bottom", (Object) 0);
            } catch (Exception unused) {
                jSONObject = null;
            }
            z("content_safe_area_changed", jSONObject);
            this.H0 = i10;
        }
    }

    public final void Q(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.G0;
            if (z10 || !rect2.equals(rect)) {
                Float valueOf = Float.valueOf(rect.left / AndroidUtilities.density);
                Float valueOf2 = Float.valueOf(rect.top / AndroidUtilities.density);
                Float valueOf3 = Float.valueOf(rect.right / AndroidUtilities.density);
                Float valueOf4 = Float.valueOf(rect.bottom / AndroidUtilities.density);
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("left", valueOf);
                    jSONObject.put("top", valueOf2);
                    jSONObject.put("right", valueOf3);
                    jSONObject.put("bottom", valueOf4);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                z("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.G != null) {
                F(this.r0, g(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.r0, g(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void S(k9 k9Var, fi.t1 t1Var, String str) {
        if (t1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    y(k9Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = t1Var.h(optString);
                    if (h.isEmpty()) {
                        y(k9Var, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    b0 b0Var = new b0(this, k9Var, string, t1Var, optString);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    f6 resourceProvider = U != null ? U.getResourceProvider() : null;
                    int i10 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    f3 i11 = wl.i(1, context, resourceProvider, false);
                    LinearLayout f7 = wl.f(context, 1);
                    x9 x9Var = new x9(context);
                    TLRPC.User user = MessagesController.getInstance(t1Var.a).getUser(Long.valueOf(t1Var.b));
                    i9 i9Var = new i9((f6) null);
                    i9Var.r(user);
                    x9Var.e(user, i9Var);
                    f7.addView(x9Var, x5.t(80, 80, 49, 0, 21, 0, 13));
                    int i12 = j6.G6;
                    TextView b10 = b6.b(context, 20.0f, i12, true, null);
                    wl.k(R.string.BotRestoreStorageTitle, b10, 17);
                    f7.addView(b10, x5.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = b6.b(context, 14.0f, i12, false, null);
                    b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    b11.setGravity(17);
                    f7.addView(b11, x5.t(-1, -2, 7, 32, 0, 32, 19));
                    e9 e9Var = new e9(context, resourceProvider);
                    e9Var.setBackground(new oq(new ColorDrawable(j6.v0(j6.a7, resourceProvider)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.b7, resourceProvider))));
                    e9Var.setFixedSize(12);
                    f7.addView(e9Var, x5.t(-1, 12, 7, 0, 0, 0, 0));
                    l4 l4Var = new l4(context, resourceProvider);
                    l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    f7.addView(l4Var, x5.t(-1, -2, 7, 0, 0, 0, 0));
                    di.d dVar = new di.d(context, resourceProvider, true);
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i13 < h.size()) {
                        fi.s1 s1Var = (fi.s1) h.get(i13);
                        fi.r1 r1Var = new fi.r1(s1Var, i13 < h.size() - i10, context);
                        r1Var.setBackground(j6.f0(j6.v0(j6.i6, resourceProvider), 2, -1));
                        LinearLayout linearLayout = f7;
                        String[] strArr2 = strArr;
                        r1Var.setOnClickListener(new z4(strArr2, s1Var, arrayList, dVar, 2));
                        linearLayout.addView(r1Var, x5.n(-1, 56));
                        arrayList.add(r1Var);
                        f7 = linearLayout;
                        strArr = strArr2;
                        i10 = 1;
                        i13++;
                    }
                    String[] strArr3 = strArr;
                    LinearLayout linearLayout2 = f7;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr3[0] != null);
                    linearLayout2.addView(dVar, x5.t(-1, 48, 7, 8, 8, 8, 4));
                    i11.customView = linearLayout2;
                    i11.fixNavigationBar(j6.v0(j6.h5, resourceProvider));
                    dVar.setOnClickListener(new z4(zArr, b0Var, strArr3, i11, 3));
                    i11.setOnDismissListener(new fi.e0(1, zArr, b0Var));
                    i11.show();
                } catch (Exception e7) {
                    y(k9Var, "secure_storage_failed", C("req_id", string, "error", e7.getMessage()));
                }
            } catch (Exception unused) {
                y(k9Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(k9Var, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void U(String str, boolean z10) {
        z0 z0Var = this.a;
        if (z0Var != null) {
            boolean z11 = z0Var.E;
        }
        boolean z12 = z0Var == null || !z0Var.canGoBack();
        z0 z0Var2 = this.a;
        J(z12, z0Var2 == null || !z0Var2.canGoForward());
        z0 z0Var3 = this.a;
        if (z0Var3 != null) {
            z0Var3.b = true;
        }
        if (this.N) {
            h("setPageLoaded: already loaded");
            return;
        }
        i5 i5Var = this.s;
        if (!z10 || z0Var3 == null || i5Var == null) {
            if (z0Var3 != null) {
                z0Var3.setAlpha(1.0f);
            }
            if (i5Var != null) {
                i5Var.setAlpha(0.0f);
                i5Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<z0, Float>) property, 1.0f), ObjectAnimator.ofFloat(i5Var, (Property<i5, Float>) property, 0.0f));
            animatorSet.addListener(new oj1(this, 1));
            animatorSet.start();
        }
        this.b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.c.getClass();
    }

    public final void V(k9 k9Var, fi.t1 t1Var, String str, String str2, String str3) {
        if (t1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        t1Var.n(optString, jSONObject.optString("value"));
                        y(k9Var, str2, B(string, "req_id"));
                    } catch (RuntimeException e7) {
                        y(k9Var, str3, C("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused) {
                    y(k9Var, str3, C("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(k9Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void W() {
        z0 z0Var = this.a;
        if (z0Var == null || !this.o0) {
            return;
        }
        z0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!com.google.android.gms.internal.cast.o.a("WEB_MESSAGE_LISTENER")) {
            h("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        z0 z0Var2 = this.a;
        if (!z0Var2.R) {
            a5.c.a(z0Var2, "TelegramWebviewProxyMessage", singleton, new k5(z0Var2, 13));
            this.a.R = true;
        }
        if (com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT")) {
            z0 z0Var3 = this.a;
            if (z0Var3.S == null) {
                boolean z10 = a5.c.a;
                if (!b5.m.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                b5.o c10 = a5.c.c(z0Var3);
                z0Var3.S = new a6.i((ScriptHandlerBoundaryInterface) se.b.a(ScriptHandlerBoundaryInterface.class, c10.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 6);
            }
        }
    }

    public final void X(z0 z0Var, Object obj) {
        z0 z0Var2;
        TLRPC.User user;
        String str = "";
        z0 z0Var3 = this.a;
        if (z0Var3 != null) {
            z0Var3.destroy();
            removeView(this.a);
        }
        if (z0Var != null) {
            AndroidUtilities.removeFromParent(z0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !s());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (z0Var == null) {
            Context context = getContext();
            boolean z10 = this.o0;
            long j3 = 0;
            if (z10 && (user = this.U) != null) {
                j3 = user.id;
            }
            z0Var2 = new z0(context, z10, j3);
        } else {
            z0Var2 = z0Var;
        }
        this.a = z0Var2;
        if (this.o0) {
            z0Var2.setBackgroundColor(k(j6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.v0;
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.a.setLayerType(2, null);
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.C0);
        WebSettings settings = this.a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.o0) {
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setCacheMode(-1);
            settings.setSaveFormData(true);
            settings.setSavePassword(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(true);
            }
        }
        if (s()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb2 = new StringBuilder("(Linux; Android ");
            String str2 = Build.VERSION.RELEASE;
            sb2.append(str2);
            sb2.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb2.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.o0) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                String str3 = devicePerformanceClass == 0 ? "LOW" : devicePerformanceClass == 1 ? "AVERAGE" : "HIGH";
                StringBuilder sb3 = new StringBuilder();
                sb3.append(replaceAll);
                sb3.append(" Telegram-Android/");
                sb3.append(packageInfo.versionName);
                sb3.append(" (");
                String str4 = Build.MANUFACTURER;
                if (str4 != null) {
                    if (str4.length() <= 1) {
                        str = str4.toUpperCase();
                    } else {
                        str = str4.substring(0, 1).toUpperCase() + str4.substring(1).toLowerCase();
                    }
                }
                sb3.append(str);
                sb3.append(" ");
                sb3.append(Build.MODEL);
                sb3.append("; Android ");
                sb3.append(str2);
                sb3.append("; SDK ");
                sb3.append(Build.VERSION.SDK_INT);
                sb3.append("; ");
                sb3.append(str3);
                sb3.append(")");
                replaceAll = sb3.toString();
            }
            settings.setUserAgentString(replaceAll);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (z0Var == null && this.o0) {
            this.a.setAlpha(0.0f);
        }
        addView(this.a);
        if (this.o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.r0 == null) {
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = new BotWebViewContainer$BotWebViewProxy();
                botWebViewContainer$BotWebViewProxy.a = this;
                this.r0 = botWebViewContainer$BotWebViewProxy;
            }
            this.r0.a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.u0;
            if (botWebViewContainer$WebViewProxy == null) {
                z0 z0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(z0Var4, this);
                this.u0 = botWebViewContainer$WebViewProxy2;
                z0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (z0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.u0.a = this;
        }
        K(this.a);
        P0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var == null || n(i10)) {
            return;
        }
        b2Var.setOnDismissListener(new fi.e0(13, this, runnable));
        this.c0 = b2Var;
        b2Var.h0 = false;
        b2Var.show();
        if (this.K0 != i10) {
            this.K0 = i10;
            this.L0 = 0;
            this.M0 = 0L;
        }
        this.L0++;
    }

    public final void Z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        sb2.append(str != null ? ": ".concat(str) : "");
        j(sb2.toString());
    }

    public final void c() {
        if (this.a != null || this.h) {
            return;
        }
        try {
            setupWebView(null);
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.s.setVisibility(8);
            this.h = true;
            this.f.setVisibility(0);
            z0 z0Var = this.a;
            if (z0Var != null) {
                removeView(z0Var);
            }
        }
    }

    public final boolean d(String[] strArr) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        er0 er0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            z0 z0Var = this.a;
            if (z0Var != null) {
                z0Var.setBackgroundColor(k(j6.d6));
            }
            if (!this.q0) {
                int i12 = j6.Ki;
                int k10 = k(i12);
                this.p0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                i5 i5Var = this.s;
                i5Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.p0);
                    this.r.setupGradient(i12, this.e, 1.0f, false);
                }
                i5Var.invalidate();
            }
            A();
            return;
        }
        if (i10 != NotificationCenter.onActivityResultReceived) {
            if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (er0Var = this.V) == null) {
                    return;
                }
                er0Var.run();
                this.V = null;
                return;
            }
            return;
        }
        int intValue2 = ((Integer) objArr[0]).intValue();
        int intValue3 = ((Integer) objArr[1]).intValue();
        Intent intent = (Intent) objArr[2];
        if (intValue2 != 3000 || this.x == null) {
            return;
        }
        if (intValue3 == -1 && intent != null) {
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                uriArr = new Uri[clipData.getItemCount()];
                for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                    uriArr[i13] = clipData.getItemAt(i13).getUri();
                }
            } else if (intent.getData() != null) {
                uriArr = new Uri[]{intent.getData()};
            }
            this.x.onReceiveValue(uriArr);
            this.x = null;
        }
        uriArr = null;
        this.x.onReceiveValue(uriArr);
        this.x = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.v) {
                canvas.restore();
            }
            if (!this.v) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        }
        if (view == this.f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        }
        if (view == this.a) {
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                return true;
            }
            if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                return true;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(k9 k9Var, fi.t1 t1Var, String str, String str2, String str3) {
        if (t1Var == null || this.U == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                t1Var.m(new JSONObject());
                y(k9Var, str2, B(string, "req_id"));
            } catch (RuntimeException e7) {
                y(k9Var, str3, C("req_id", string, "error", e7.getMessage()));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(k9Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void f() {
        if (this.U == null) {
            return;
        }
        fi.s sVar = this.j0;
        if (sVar == null) {
            this.j0 = fi.s.c(getContext(), this.M, this.U.id);
        } else {
            sVar.h();
        }
    }

    public final k9 g() {
        z0 z0Var = this.a;
        long j3 = this.s0;
        boolean z10 = this.t0;
        String str = this.F0;
        k9 k9Var = new k9();
        k9Var.c = this;
        k9Var.d = z0Var;
        k9Var.a = j3;
        k9Var.b = z10;
        k9Var.e = str;
        return k9Var;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.r0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof q4)) {
            return 0;
        }
        q4 q4Var = (q4) getParent();
        if (q4Var.J) {
            return (int) ((q4Var.getMeasuredHeight() - q4Var.getOffsetY()) + this.z0);
        }
        return 0;
    }

    public String getOriginHost() {
        z0 z0Var = this.a;
        if (z0Var == null) {
            return null;
        }
        return l(z0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public z0 getWebView() {
        return this.a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.B0);
        z0 z0Var = this.a;
        if (z0Var != null) {
            if (z0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.B0) {
                this.a.destroy();
                L(this.a);
            }
            this.N = false;
            if (this.j0 != null) {
                this.j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.n0 != null) {
                this.n0 = null;
            }
            fi.w0 w0Var = this.k0;
            if (w0Var != null) {
                w0Var.f.remove(this.J0);
                this.k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void j(String str) {
        new yc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        f6 f6Var = this.e;
        return f6Var != null ? f6Var.G0(i10) : j6.w0(null, i10, false);
    }

    public final void m(k9 k9Var, fi.t1 t1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (t1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f7 = t1Var.f(optString);
                    if (t1Var.d && (obj = f7.first) == null) {
                        Object obj2 = f7.second;
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("req_id", string);
                            jSONObject.put("value", obj);
                            jSONObject.put("can_restore", obj2);
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                        y(k9Var, str2, jSONObject);
                    } else {
                        y(k9Var, str2, C("req_id", string, "value", f7.first));
                    }
                } catch (RuntimeException e7) {
                    y(k9Var, str3, C("req_id", string, "error", e7.getMessage()));
                }
            } catch (Exception unused2) {
                y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(k9Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean n(int i10) {
        if (this.c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
            return true;
        }
        if (this.K0 != i10 || this.L0 <= 3) {
            return false;
        }
        this.M0 = System.currentTimeMillis() + 3000;
        this.L0 = 0;
        return true;
    }

    public final void o(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.N || z11) && (z12 = this.o0) && (getParent() instanceof q4)) {
            q4 q4Var = (q4) getParent();
            if (z10) {
                this.O = q4Var.getSwipeOffsetY() == q4Var.getTopActionBarOffsetY() + (-q4Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (q4Var.getTopActionBarOffsetY() + ((q4Var.getMeasuredHeight() - q4Var.getOffsetY()) - q4Var.getSwipeOffsetY()) + this.z0));
            if (!z11 && max == this.w0 && this.x0 == z10 && this.y0 == this.O) {
                return;
            }
            this.w0 = max;
            this.x0 = z10;
            this.y0 = this.O;
            String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
            if (!z12 || r()) {
                NotificationCenter.getInstance(this.M).doOnIdle(new z(this, a4.a.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
            } else {
                h("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        qc.a(this, new ah.n0(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        qc.h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.A0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.a0) {
            return;
        }
        o(true, false);
    }

    public final boolean p(k9 k9Var) {
        boolean z10;
        if (k9Var == null) {
            return false;
        }
        String str = (String) k9Var.e;
        if (((d1) k9Var.c) != this || ((z0) k9Var.d) != this.a || k9Var.a != this.s0 || (z10 = k9Var.b) != this.t0) {
            return false;
        }
        if (z10) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.F0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    public final boolean r() {
        if (this.a == null) {
            return false;
        }
        if (this.t0) {
            return !TextUtils.isEmpty(this.F0) && TextUtils.equals(this.F0, getOriginHost());
        }
        return true;
    }

    public final boolean s() {
        return this.O0 != null;
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(i0 i0Var) {
        this.c = i0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10 = AndroidUtilities.computePerceivedBrightness(i10) > 0.7f ? j6.b(0.0f, -0.15f, i10) : j6.b(0.025f, 0.15f, i10);
        if (this.p0 == b10) {
            return;
        }
        this.p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        i5 i5Var = this.s;
        i5Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.p0);
            this.r.setupGradient(j6.Ki, this.e, 1.0f, false);
        }
        this.q0 = true;
        i5Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.A0 == i10) {
            return;
        }
        this.A0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.R = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.C0 = runnable;
        z0 z0Var = this.a;
        if (z0Var != null) {
            z0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(z0 z0Var) {
        z0 z0Var2;
        this.v0 = z0Var;
        if (this.o0 || (z0Var2 = this.a) == null) {
            return;
        }
        z0Var2.f = z0Var;
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.z0 = f7;
    }

    public void setWasOpenedByBot(f5 f5Var) {
        this.E0 = f5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.w = aVar;
    }

    public void setWebViewScrollListener(c1 c1Var) {
        this.d = c1Var;
        z0 z0Var = this.a;
        if (z0Var != null) {
            z0Var.f(this, c1Var);
        }
    }

    public final void t(int i10, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
        String publicUsername = UserObject.getPublicUsername(user);
        i5 i5Var = this.s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            i5Var.setVisibility(0);
            i5Var.setAlpha(1.0f);
            i5Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(j6.a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == j3) {
                break;
            }
        }
        boolean z10 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                i5Var.setVisibility(0);
                i5Var.setAlpha(1.0f);
                i5Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        f6 f6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            i5Var.setVisibility(0);
            i5Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.p0);
                this.r.setupGradient(j6.Ki, f6Var, 1.0f, false);
            }
            i5Var.f(null, null, this.r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        i5Var.setVisibility(0);
        i5Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.p0);
            this.r.setupGradient(j6.Ki, f6Var, 1.0f, false);
        }
        i5Var.f(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z10) {
        this.M = i10;
        if (this.o0) {
            this.s0++;
            this.t0 = z10;
            this.F0 = z10 ? l(str) : null;
            if (this.a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new z(this, str, 1));
    }

    public final void w(k9 k9Var) {
        if (this.U == null) {
            return;
        }
        f();
        fi.s sVar = this.j0;
        if (sVar == null) {
            return;
        }
        try {
            y(k9Var, "biometry_info_received", sVar.f());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void y(k9 k9Var, String str, JSONObject jSONObject) {
        if (p(k9Var)) {
            z(str, jSONObject);
            return;
        }
        h("notifyEvent " + str + " dropped after document change");
    }

    public final void z(String str, JSONObject jSONObject) {
        if (this.o0 && !r()) {
            h("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        h("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public void I() {
    }

    public void L(z0 z0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void E(String str, boolean z10) {
    }

    public void J(boolean z10, boolean z11) {
    }
}
