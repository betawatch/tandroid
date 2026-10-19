package org.telegram.ui.web;

import ai.a4;
import ai.a5;
import ai.bb;
import ai.sb;
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
import ci.c4;
import ci.k4;
import ci.t8;
import ci.z7;
import gi.d3;
import gi.e4;
import gi.r4;
import gi.t4;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.z3;
import org.telegram.ui.fk0;
import org.telegram.ui.fn0;
import org.telegram.ui.s9;
import org.telegram.ui.tf1;
import org.telegram.ui.w9;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class a1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean P0 = true;
    public static int Q0;
    public static HashMap R0;
    public int A0;
    public boolean B0;
    public Runnable C0;
    public boolean D0;
    public int E;
    public t4 E0;
    public String F;
    public String F0;
    public String G;
    public final Rect G0;
    public int H;
    public int H0;
    public int I;
    public z7 I0;
    public String J;
    public final t J0;
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
    public by0 V;
    public Activity W;
    public x0 a;
    public boolean a0;
    public String b;
    public String b0;
    public g0 c;
    public org.telegram.ui.ActionBar.b2 c0;
    public z0 d;
    public int d0;
    public final d6 e;
    public long e0;
    public final TextView f;
    public long f0;
    public s9 g0;
    public boolean h;
    public boolean h0;
    public String i0;
    public gi.r j0;
    public gi.u0 k0;
    public gi.j0 l0;
    public gi.p1 m0;
    public final org.telegram.ui.Components.voip.h n;
    public gi.p1 n0;
    public final boolean o0;
    public int p0;
    public boolean q0;
    public SvgHelper.SvgDrawable r;
    public BotWebViewContainer$BotWebViewProxy r0;
    public final k4 s;
    public long s0;
    public boolean t0;
    public BotWebViewContainer$WebViewProxy u0;
    public boolean v;
    public x0 v0;
    public q0.a w;
    public int w0;
    public ValueCallback x;
    public boolean x0;
    public int y;
    public boolean y0;
    public float z0;

    public a1(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n = hVar;
        int i11 = h6.Oh;
        this.y = j(i11);
        int i12 = h6.Sh;
        this.E = j(i12);
        this.F = "";
        this.H = j(i11);
        this.I = j(i12);
        this.J = "";
        this.K = "";
        this.M = UserConfig.selectedAccount;
        this.A0 = -1;
        this.G0 = new Rect(0, 0, 0, 0);
        this.H0 = 0;
        this.J0 = new t(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.o0 = z10;
        this.e = d6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.k = false;
        hVar.b(i10, 153);
        k4 k4Var = new k4(this, context);
        this.s = k4Var;
        int j10 = j(h6.Ki);
        this.p0 = j10;
        k4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        k4Var.getImageReceiver().setAspectFit(true);
        addView(k4Var, z5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(h6.y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, z5.e(-1, -2, 17));
        setFocusable(false);
    }

    public static JSONObject A(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject B(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse M(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(pf.d.u(Uri.parse(str2), "https", null, S(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
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

    public static void a(a1 a1Var, String[] strArr, q0.a aVar) {
        a1Var.getClass();
        for (String str : strArr) {
            if (a1Var.getContext().checkSelfPermission(str) != 0) {
                a1Var.V = new by0(a1Var, aVar, strArr, 7);
                Activity activity = a1Var.W;
                if (activity != null) {
                    activity.requestPermissions(strArr, 4000);
                    return;
                }
                return;
            }
        }
        aVar.accept(Boolean.TRUE);
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        if (!p(Uri.parse(str))) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        try {
            hostAuthority = IDN.toASCII(hostAuthority, 1);
        } catch (Exception unused) {
        }
        String S = S(hostAuthority);
        if (R0 == null) {
            R0 = new HashMap();
        }
        R0.put(S, hostAuthority);
        return pf.d.u(Uri.parse(str), "https", null, S, null);
    }

    public static String k(String str) {
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

    public static boolean p(Uri uri) {
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
        k4 k4Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k4Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        k4Var.requestLayout();
    }

    private void setupWebView(x0 x0Var) {
        W(x0Var, null);
    }

    public static String u(String str) {
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
        return (hostAuthority.endsWith(sb2.toString()) && (str2 = (String) R0.get(hostAuthority)) != null) ? pf.d.u(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void w(int i10, x0 x0Var, z7 z7Var, String str, JSONObject jSONObject) {
        if (x0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new fn0(x0Var, z7Var, str, jSONObject, 25));
    }

    public final boolean C() {
        if (this.a == null || !this.R) {
            return false;
        }
        y("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:944:0x07b7, code lost:
    
        r5.vibrate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x07ba, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0e07  */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x11d4  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x11e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final z7 z7Var, String str, String str2) {
        char c10;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        int i10;
        int i11;
        final int i12;
        s9 s9Var;
        final a1 a1Var;
        final a1 a1Var2;
        z7 z7Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j10;
        int i13;
        TLRPC.User user;
        long j11;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
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
        boolean z15;
        String g10;
        long j12;
        boolean z16;
        if (this.o0) {
            if (this.a == null || this.c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!o(z7Var)) {
                g("onEventReceived ignore " + str + " after document change");
                return;
            }
            g("onEventReceived " + str);
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
            t tVar = this.J0;
            long j13 = 1000;
            d6 d6Var = this.e;
            BotWebViewVibrationEffect botWebViewVibrationEffect2 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            m3 m3Var = null;
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
                        JSONObject jSONObject = new JSONObject(str2);
                        String string = jSONObject.getString("req_id");
                        String string2 = jSONObject.getString("method");
                        String obj = jSONObject.get("params").toString();
                        int i14 = this.M;
                        x0 x0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = MessagesController.getInstance(i14).getInputUser(this.U.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i14).sendRequest(invokewebviewcustommethod, new sb(this, string, i14, x0Var, z7Var));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (e instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Y(null);
                            return;
                        }
                    }
                case 1:
                    if (!this.h0 || (s9Var = this.g0) == null) {
                        return;
                    }
                    s9Var.dismiss();
                    return;
                case 2:
                    v(z7Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject2.optString("url"));
                        String optString = jSONObject2.optString("try_browser");
                        if (MessagesController.getInstance(this.M).webAppAllowedProtocols == null || !MessagesController.getInstance(this.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                            return;
                        }
                        G(parse, optString, jSONObject2.optBoolean("try_instant_view"), true, false);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                case 4:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    if (this.l0 == null) {
                        this.l0 = gi.j0.c(getContext(), this.M, this.U.id);
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        String string3 = jSONObject3.getString("url");
                        String string4 = jSONObject3.getString("file_name");
                        if (this.l0.d(string3) != null) {
                            this.l0.b(string3, string4);
                            x(z7Var, "file_download_requested", A("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = MessagesController.getInstance(this.M).getInputUser(this.U);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.M).sendRequest(checkdownloadfileparams, new ai.k2(this, z7Var, string3, string4, 18));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        x(z7Var, "file_download_requested", A("cancelled", "status"));
                        return;
                    }
                case 5:
                    a1Var = this;
                    try {
                        if (a1Var.c0 == null) {
                            if (System.currentTimeMillis() - a1Var.e0 <= 150) {
                                int i15 = a1Var.d0 + 1;
                                a1Var.d0 = i15;
                                if (i15 >= 3) {
                                    a1Var.d0 = 0;
                                    a1Var.f0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - a1Var.f0 > 3000) {
                                JSONObject jSONObject4 = new JSONObject(str2);
                                String optString2 = jSONObject4.optString("title", null);
                                String string5 = jSONObject4.getString("message");
                                JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a1Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i16 = 0; i16 < jSONArray.length(); i16++) {
                                    arrayList.add(new y0(jSONArray.getJSONObject(i16)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final y0 y0Var = (y0) arrayList.get(0);
                                            final int i17 = 0;
                                            alertDialog$Builder.k(y0Var.b, new org.telegram.ui.ActionBar.a2(a1Var) { // from class: org.telegram.ui.web.q
                                                public final /* synthetic */ a1 b;

                                                {
                                                    this.b = a1Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                                                    switch (i17) {
                                                        case 0:
                                                            z7 z7Var3 = z7Var;
                                                            y0 y0Var2 = y0Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            a1 a1Var3 = this.b;
                                                            a1Var3.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                a1Var3.P = System.currentTimeMillis();
                                                                a1Var3.x(z7Var3, "popup_closed", new JSONObject().put("button_id", y0Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e11) {
                                                                FileLog.e(e11);
                                                                return;
                                                            }
                                                        case 1:
                                                            z7 z7Var4 = z7Var;
                                                            y0 y0Var3 = y0Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            a1 a1Var4 = this.b;
                                                            a1Var4.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                a1Var4.P = System.currentTimeMillis();
                                                                a1Var4.x(z7Var4, "popup_closed", new JSONObject().put("button_id", y0Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                FileLog.e(e12);
                                                                return;
                                                            }
                                                        default:
                                                            z7 z7Var5 = z7Var;
                                                            y0 y0Var4 = y0Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            a1 a1Var5 = this.b;
                                                            a1Var5.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                a1Var5.P = System.currentTimeMillis();
                                                                a1Var5.x(z7Var5, "popup_closed", new JSONObject().put("button_id", y0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                FileLog.e(e13);
                                                            }
                                                    }
                                                }
                                            });
                                        } catch (JSONException e11) {
                                            e = e11;
                                            FileLog.e(e);
                                            return;
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        final y0 y0Var2 = (y0) arrayList.get(1);
                                        final int i18 = 1;
                                        alertDialog$Builder.h(y0Var2.b, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.q
                                            public final /* synthetic */ a1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.a2
                                            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i182) {
                                                switch (i18) {
                                                    case 0:
                                                        z7 z7Var3 = z7Var;
                                                        y0 y0Var22 = y0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        a1 a1Var3 = this.b;
                                                        a1Var3.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            a1Var3.P = System.currentTimeMillis();
                                                            a1Var3.x(z7Var3, "popup_closed", new JSONObject().put("button_id", y0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e112) {
                                                            FileLog.e(e112);
                                                            return;
                                                        }
                                                    case 1:
                                                        z7 z7Var4 = z7Var;
                                                        y0 y0Var3 = y0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        a1 a1Var4 = this.b;
                                                        a1Var4.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            a1Var4.P = System.currentTimeMillis();
                                                            a1Var4.x(z7Var4, "popup_closed", new JSONObject().put("button_id", y0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    default:
                                                        z7 z7Var5 = z7Var;
                                                        y0 y0Var4 = y0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        a1 a1Var5 = this.b;
                                                        a1Var5.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            a1Var5.P = System.currentTimeMillis();
                                                            a1Var5.x(z7Var5, "popup_closed", new JSONObject().put("button_id", y0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final y0 y0Var3 = (y0) arrayList.get(2);
                                        String str14 = y0Var3.b;
                                        final int i19 = 2;
                                        a1Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(a1Var2) { // from class: org.telegram.ui.web.q
                                                public final /* synthetic */ a1 b;

                                                {
                                                    this.b = a1Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i182) {
                                                    switch (i19) {
                                                        case 0:
                                                            z7 z7Var3 = z7Var;
                                                            y0 y0Var22 = y0Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            a1 a1Var3 = this.b;
                                                            a1Var3.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                a1Var3.P = System.currentTimeMillis();
                                                                a1Var3.x(z7Var3, "popup_closed", new JSONObject().put("button_id", y0Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e112) {
                                                                FileLog.e(e112);
                                                                return;
                                                            }
                                                        case 1:
                                                            z7 z7Var4 = z7Var;
                                                            y0 y0Var32 = y0Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            a1 a1Var4 = this.b;
                                                            a1Var4.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                a1Var4.P = System.currentTimeMillis();
                                                                a1Var4.x(z7Var4, "popup_closed", new JSONObject().put("button_id", y0Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                FileLog.e(e12);
                                                                return;
                                                            }
                                                        default:
                                                            z7 z7Var5 = z7Var;
                                                            y0 y0Var4 = y0Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            a1 a1Var5 = this.b;
                                                            a1Var5.getClass();
                                                            b2Var.dismiss();
                                                            try {
                                                                a1Var5.P = System.currentTimeMillis();
                                                                a1Var5.x(z7Var5, "popup_closed", new JSONObject().put("button_id", y0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                FileLog.e(e13);
                                                            }
                                                    }
                                                }
                                            };
                                            z7Var2 = z7Var;
                                            alertDialog$Builder.i(str14, a2Var);
                                        } catch (JSONException e12) {
                                            e = e12;
                                            FileLog.e(e);
                                            return;
                                        }
                                    } else {
                                        a1Var2 = this;
                                        z7Var2 = z7Var;
                                    }
                                    alertDialog$Builder.j(new gi.r0(a1Var2, atomicBoolean, z7Var2, 4));
                                    a1Var2.c0 = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        y0 y0Var4 = (y0) arrayList.get(0);
                                        if (y0Var4.c >= 0 && (textView3 = (TextView) a1Var2.c0.d(-1)) != null) {
                                            textView3.setTextColor(a1Var2.j(y0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        y0 y0Var5 = (y0) arrayList.get(1);
                                        if (y0Var5.c >= 0 && (textView2 = (TextView) a1Var2.c0.d(-2)) != null) {
                                            textView2.setTextColor(a1Var2.j(y0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        y0 y0Var6 = (y0) arrayList.get(2);
                                        if (y0Var6.c < 0 || (textView = (TextView) a1Var2.c0.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(a1Var2.j(y0Var6.c));
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
                    } catch (JSONException e13) {
                        e = e13;
                    }
                    break;
                case 6:
                    a1Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (a1Var.b0 != null) {
                            a1Var.F(optString3, "cancelled", true);
                            return;
                        }
                        a1Var.b0 = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(a1Var.M).sendRequest(tL_payments_getPaymentForm, new ai.j2(a1Var, optString3, tL_inputInvoiceSlug, 19));
                        return;
                    } catch (JSONException e14) {
                        FileLog.e(e14);
                        break;
                    }
                case 7:
                    a1Var = this;
                    if (a1Var.U != null && System.currentTimeMillis() - a1Var.P <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j10 = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            try {
                                i13 = jSONObject5.getInt("duration");
                            } catch (Exception unused) {
                                i13 = 0;
                                user = a1Var.U;
                                if (user != null) {
                                }
                            }
                        } catch (Exception unused2) {
                            j10 = 0;
                        }
                        user = a1Var.U;
                        if (user != null) {
                            a1Var.x(z7Var, "emoji_status_failed", A("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            r4.f(a1Var.M, user, j10, i13, new r(a1Var, z7Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    a1Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", a1Var.J).trim();
                        boolean z17 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : a1Var.H;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : a1Var.I;
                        boolean z18 = jSONObject6.optBoolean("is_progress_visible", false) && z17;
                        boolean z19 = jSONObject6.optBoolean("has_shine_effect", false) && z17;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : a1Var.K;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        a1Var.H = parseColor;
                        a1Var.I = parseColor2;
                        a1Var.J = trim;
                        a1Var.K = optString4;
                        a1Var.L = str2;
                        a1Var.c.l(z17, optBoolean, trim, j11, parseColor, parseColor2, z18, z19, optString4);
                        break;
                    } catch (Exception e15) {
                        FileLog.e(e15);
                        break;
                    }
                    break;
                case '\t':
                    a1Var = this;
                    try {
                        a1Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e16) {
                        FileLog.e(e16);
                        break;
                    }
                case '\n':
                    a1Var = this;
                    try {
                        if (!a1Var.h0 && a1Var.W != null) {
                            a1Var.i0 = new JSONObject(str2).optString("text");
                            a1Var.h0 = true;
                            if (a1Var.W.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = a1Var.W;
                                if (activity != null) {
                                    a1Var.g0 = w9.e0(activity, 3, new le.b(a1Var, 13));
                                    return;
                                }
                                break;
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new d0(a1Var, z7Var), NotificationCenter.onRequestPermissionResultReceived);
                                a1Var.W.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                return;
                            }
                        }
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        break;
                    }
                    break;
                case 11:
                    if (m(4)) {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            x(z7Var, "phone_requested", jSONObject7);
                            return;
                        } catch (Exception e18) {
                            FileLog.e(e18);
                            return;
                        }
                    }
                    final int i20 = this.M;
                    final x0 x0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), d6Var);
                    alertDialog$Builder2.l(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String userName = UserObject.getUserName(this.U);
                    if (TextUtils.isEmpty(userName)) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                    }
                    final boolean z20 = MessagesController.getInstance(this.M).blockePeers.indexOfKey(this.U.id) >= 0;
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.web.w
                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i21) {
                            strArr[0] = null;
                            b2Var.dismiss();
                            a1 a1Var3 = a1.this;
                            boolean z21 = z20;
                            int i22 = i20;
                            x0 x0Var3 = x0Var2;
                            z7 z7Var3 = z7Var;
                            if (z21) {
                                MessagesController.getInstance(a1Var3.M).unblockPeer(a1Var3.U.id, new bz0(i22, 17, a1Var3, x0Var3, z7Var3));
                                return;
                            }
                            SendMessagesHelper.getInstance(a1Var3.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var3.M).getCurrentUser(), a1Var3.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                a1.w(i22, x0Var3, z7Var3, "phone_requested", jSONObject8);
                            } catch (Exception e19) {
                                FileLog.e(e19);
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fk0(17));
                    X(4, alertDialog$Builder2.a(), new x(strArr, i20, x0Var2, z7Var, 0));
                    return;
                case '\f':
                    z();
                    return;
                case '\r':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i21 = this.M;
                        this.n0 = new gi.p1(UserConfig.getInstance(i21).getClientUserId(), this.U.id, i21, true);
                    }
                    l(z7Var, this.n0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.k0 == null) {
                        gi.u0 e19 = gi.u0.e(getContext(), this.M, this.U.id);
                        this.k0 = e19;
                        e19.f.add(tVar);
                    }
                    this.I0 = z7Var;
                    tVar.run();
                    return;
                case 15:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    n2 U = LaunchActivity.U();
                    if (U == null || U.getParentLayout() == null) {
                        return;
                    }
                    d5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(this.U.id));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                    g0 g0Var = this.c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                case 16:
                    n(!((getParent() instanceof e4) && ((e4) getParent()).d()), true);
                    return;
                case 17:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    r4.a(this.M, this.U.id, new r(this, z7Var, 0));
                    return;
                case 18:
                    gi.y0 z21 = this.c.z();
                    if (z21 == null || !z21.h()) {
                        x(z7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(z7Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i22 = this.M;
                        this.m0 = new gi.p1(UserConfig.getInstance(i22).getClientUserId(), this.U.id, i22, false);
                    }
                    U(z7Var, this.m0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i23 = this.M;
                        this.m0 = new gi.p1(UserConfig.getInstance(i23).getClientUserId(), this.U.id, i23, false);
                    }
                    l(z7Var, this.m0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    e();
                    gi.r rVar = this.j0;
                    if (rVar == null) {
                        return;
                    }
                    if (rVar.e) {
                        rVar.j(str3, true, null, new ci.c0(2, rVar, new r(this, z7Var, 3)));
                        return;
                    }
                    try {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("status", "failed");
                        x(z7Var, "biometry_auth_requested", jSONObject8);
                        return;
                    } catch (Exception e20) {
                        FileLog.e(e20);
                        return;
                    }
                case 22:
                    try {
                        z10 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z10 = false;
                    }
                    g0 g0Var2 = this.c;
                    if (g0Var2 != null) {
                        g0Var2.p(z10);
                        return;
                    }
                    return;
                case 23:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        z11 = jSONArray2.optBoolean(0, true);
                        try {
                            z12 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused6) {
                            z12 = true;
                            g("allowScroll " + z11 + " " + z12);
                            if (getParent() instanceof e4) {
                            }
                        }
                    } catch (Exception unused7) {
                        z11 = true;
                    }
                    g("allowScroll " + z11 + " " + z12);
                    if (getParent() instanceof e4) {
                        return;
                    }
                    ((e4) getParent()).a(z11, z12);
                    return;
                case 24:
                    try {
                        JSONObject jSONObject9 = new JSONObject(str2);
                        String optString5 = jSONObject9.optString("path_full");
                        boolean optBoolean2 = jSONObject9.optBoolean("force_request", false);
                        if (optString5.startsWith("/")) {
                            optString5 = optString5.substring(1);
                        }
                        G(Uri.parse("https://t.me/" + optString5), null, false, true, optBoolean2);
                        return;
                    } catch (JSONException e21) {
                        FileLog.e(e21);
                        return;
                    }
                case 25:
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i24 = this.M;
                        this.n0 = new gi.p1(UserConfig.getInstance(i24).getClientUserId(), this.U.id, i24, true);
                    }
                    R(z7Var, this.n0, str2);
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
                            } catch (Exception e22) {
                                e = e22;
                                str4 = null;
                            }
                        } catch (Exception e23) {
                            e = e23;
                            str4 = null;
                            str6 = null;
                        }
                    } catch (Exception e24) {
                        e = e24;
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
                        } catch (Exception e25) {
                            e = e25;
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
                            new sg.y0((n2) new a5(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.W);
                        new HttpGetFileTask(new a0(this, b2Var, str8, str10, str9), null).execute(str7);
                        b2Var.r(250L);
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
                        gi.u0 e26 = gi.u0.e(getContext(), this.M, this.U.id);
                        this.k0 = e26;
                        e26.f.add(tVar);
                    }
                    this.I0 = z7Var;
                    if (this.k0.g()) {
                        this.k0.j(new s(this, z7Var, 0));
                        return;
                    } else {
                        this.k0.i(new r(this, z7Var, 1));
                        return;
                    }
                case 28:
                    gi.y0 z22 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long clamp = Utilities.clamp(j13, 1000L, 20L);
                    if (z22 == null || !z22.d(clamp)) {
                        x(z7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(z7Var, "gyroscope_started", null);
                        return;
                    }
                case 29:
                    try {
                        z13 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e27) {
                        FileLog.e(e27);
                        z13 = false;
                    }
                    this.c.y();
                    if (z13) {
                        if (this.D0 && LaunchActivity.H1 != null) {
                            Activity findActivity = AndroidUtilities.findActivity(getContext());
                            if (findActivity == null) {
                                findActivity = LaunchActivity.H1;
                            }
                            if (findActivity == null || findActivity.isFinishing()) {
                                return;
                            }
                            findActivity.moveTaskToBack(true);
                            return;
                        }
                        if (this.E0 == null || (launchActivity = LaunchActivity.H1) == null || launchActivity.P() == null) {
                            return;
                        }
                        n3 P = LaunchActivity.H1.P();
                        ArrayList<m3> tabs = P.getTabs();
                        int i25 = 0;
                        while (true) {
                            if (i25 < tabs.size()) {
                                m3 m3Var2 = tabs.get(i25);
                                if (!this.E0.equals(m3Var2.a) || m3Var2.b == this.a) {
                                    i25++;
                                } else {
                                    m3Var = m3Var2;
                                }
                            }
                        }
                        if (m3Var != null) {
                            P.e(m3Var);
                            return;
                        }
                        return;
                    }
                    return;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    T(this.a.getUrl(), true);
                    return;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.P <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            x(z7Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            return;
                        }
                        x(z7Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                        return;
                    } catch (JSONException e28) {
                        FileLog.e(e28);
                        return;
                    }
                case ' ':
                    Activity findActivity2 = AndroidUtilities.findActivity(getContext());
                    if (findActivity2 == null) {
                        findActivity2 = LaunchActivity.H1;
                    }
                    if (findActivity2 != null) {
                        AndroidUtilities.hideKeyboard(findActivity2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    gi.y0 z23 = this.c.z();
                    if (z23 == null || !z23.g()) {
                        x(z7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(z7Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i26 = this.M;
                        this.n0 = new gi.p1(UserConfig.getInstance(i26).getClientUserId(), this.U.id, i26, true);
                    }
                    d(z7Var, this.n0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i27 = this.M;
                        this.m0 = new gi.p1(UserConfig.getInstance(i27).getClientUserId(), this.U.id, i27, false);
                    }
                    d(z7Var, this.m0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    gi.y0 z24 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long clamp2 = Utilities.clamp(j13, 1000L, 20L);
                    if (z24 == null || !z24.c(clamp2)) {
                        x(z7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(z7Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    gi.y0 z25 = this.c.z();
                    if (z25 == null || !z25.f()) {
                        x(z7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(z7Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            x(z7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            gi.l1.R(getContext(), this.M, this.U.id, string7, this.e, new t(this, 0), new ai.s0(this, z7Var, botWebViewContainer$BotWebViewProxy, 6));
                            return;
                        }
                    } catch (Exception e29) {
                        FileLog.e(e29);
                        x(z7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                        return;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        return;
                    } catch (JSONException e30) {
                        FileLog.e(e30);
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    O(this.H0, true);
                    return;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    if (MediaDataController.getInstance(this.M).isShortcutAdded(this.U.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                        x(z7Var, "home_screen_added", null);
                        return;
                    } else {
                        MediaDataController.getInstance(this.M).installShortcut(this.U.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new s(this, z7Var, 2));
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    try {
                        z14 = true;
                        try {
                            z15 = new JSONObject(str2).optBoolean("blur", true);
                        } catch (Exception unused10) {
                            z15 = z14;
                            g10 = this.c.g(z14, z15);
                            if (g10 != null) {
                            }
                        }
                    } catch (Exception unused11) {
                        z14 = true;
                    }
                    g10 = this.c.g(z14, z15);
                    if (g10 != null) {
                        x(z7Var, "fullscreen_changed", B("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z15)));
                        return;
                    } else {
                        x(z7Var, "fullscreen_failed", A(g10, "error"));
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
                    } catch (JSONException e31) {
                        FileLog.e(e31);
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i29 = this.M;
                        this.n0 = new gi.p1(UserConfig.getInstance(i29).getClientUserId(), this.U.id, i29, true);
                    }
                    U(z7Var, this.n0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        x(z7Var, "fullscreen_changed", A(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        x(z7Var, "fullscreen_failed", A(g11, "error"));
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    if (this.O0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z26 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a1.this.O0.run(Boolean.valueOf(z26), Double.valueOf(d), optString6, Double.valueOf(optDouble));
                                }
                            });
                            return;
                        } catch (Exception e32) {
                            FileLog.e(e32);
                            return;
                        }
                    }
                    return;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    n2 U2 = LaunchActivity.U();
                    if (U2 == null || U2.getParentLayout() == null) {
                        return;
                    }
                    d5 parentLayout2 = U2.getParentLayout();
                    U2.presentFragment(ProfileActivity.m4(this.U.id));
                    AndroidUtilities.scrollToFragmentRow(parentLayout2, "botPermissionLocation");
                    g0 g0Var3 = this.c;
                    if (g0Var3 != null) {
                        g0Var3.b();
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
                    } catch (JSONException e33) {
                        FileLog.e(e33);
                        return;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    try {
                        str12 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused12) {
                    }
                    e();
                    gi.r rVar2 = this.j0;
                    if (rVar2 == null) {
                        return;
                    }
                    boolean z27 = rVar2.f;
                    if (z27) {
                        v(z7Var);
                        return;
                    }
                    if (rVar2.e) {
                        if (!z27) {
                            rVar2.f = true;
                            rVar2.k();
                        }
                        v(z7Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new z3(21, this, z7Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), d6Var);
                    if (TextUtils.isEmpty(str12)) {
                        alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                        i12 = 0;
                        alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.U))));
                    } else {
                        i12 = 0;
                        alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.U))));
                        alertDialog$Builder3.g(str12);
                    }
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.z
                        public final /* synthetic */ a1 b;

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
                                    a1 a1Var3 = this.b;
                                    gi.r rVar3 = a1Var3.j0;
                                    rVar3.f = true;
                                    rVar3.k();
                                    gi.r rVar4 = a1Var3.j0;
                                    r rVar5 = new r(a1Var3, z7Var, 2);
                                    rVar4.getClass();
                                    rVar4.j(null, true, null, new ci.c0(2, rVar4, rVar5));
                                    break;
                                default:
                                    a1 a1Var4 = this.b;
                                    a1Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    gi.r rVar6 = a1Var4.j0;
                                    rVar6.f = true;
                                    rVar6.d = true;
                                    rVar6.k();
                                    a1Var4.v(z7Var);
                                    break;
                            }
                        }
                    });
                    final int i30 = 1;
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.web.z
                        public final /* synthetic */ a1 b;

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
                                    a1 a1Var3 = this.b;
                                    gi.r rVar3 = a1Var3.j0;
                                    rVar3.f = true;
                                    rVar3.k();
                                    gi.r rVar4 = a1Var3.j0;
                                    r rVar5 = new r(a1Var3, z7Var, 2);
                                    rVar4.getClass();
                                    rVar4.j(null, true, null, new ci.c0(2, rVar4, rVar5));
                                    break;
                                default:
                                    a1 a1Var4 = this.b;
                                    a1Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    gi.r rVar6 = a1Var4.j0;
                                    rVar6.f = true;
                                    rVar6.d = true;
                                    rVar6.k();
                                    a1Var4.v(z7Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new bb(runnableArr, 9));
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
                    } catch (Exception e34) {
                        FileLog.e(e34);
                        return;
                    }
                case '3':
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.F).trim();
                        boolean z28 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.y;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.E;
                        boolean z29 = jSONObject14.optBoolean("is_progress_visible", false) && z28;
                        boolean z30 = jSONObject14.optBoolean("has_shine_effect", false) && z28;
                        try {
                            j12 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused13) {
                            j12 = 0;
                        }
                        this.y = parseColor3;
                        this.E = parseColor4;
                        this.F = trim2;
                        this.G = str2;
                        this.c.q(z28, optBoolean4, trim2, j12, parseColor3, parseColor4, z29, z30);
                        return;
                    } catch (Exception e35) {
                        FileLog.e(e35);
                        return;
                    }
                case '4':
                    try {
                        this.c.x(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        return;
                    } catch (JSONException e36) {
                        FileLog.e(e36);
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
                    } catch (JSONException e37) {
                        FileLog.e(e37);
                        return;
                    }
                case '6':
                    x(z7Var, "home_screen_checked", A((this.U == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.M).isShortcutAdded(this.U.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
                    return;
                case '7':
                    try {
                        str11 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e38) {
                        FileLog.e(e38);
                    }
                    if (str11 == null) {
                        return;
                    }
                    TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                    getrequestedwebviewbutton.bot = MessagesController.getInstance(this.M).getInputUser(this.U);
                    getrequestedwebviewbutton.webapp_req_id = str11;
                    ConnectionsManager.getInstance(this.M).sendRequestTyped(getrequestedwebviewbutton, new a3.b(1), new v(this, z7Var, str11, 0));
                    return;
                case '8':
                    gi.y0 z31 = this.c.z();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        z16 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused14) {
                        z16 = false;
                    }
                    long clamp3 = Utilities.clamp(j13, 1000L, 20L);
                    if (z31 == null || !z31.e(clamp3, z16)) {
                        x(z7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(z7Var, "device_orientation_started", null);
                        return;
                    }
                case '9':
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str13 = jSONObject16.getString("reason");
                        } catch (Exception unused15) {
                        }
                        e();
                        gi.r rVar3 = this.j0;
                        if (rVar3 == null) {
                            return;
                        }
                        if (rVar3.e) {
                            rVar3.l(str13, string8, new a4(this, string8, z7Var, 10));
                            return;
                        }
                        try {
                            JSONObject jSONObject17 = new JSONObject();
                            jSONObject17.put("status", "failed");
                            x(z7Var, "biometry_token_updated", jSONObject17);
                            return;
                        } catch (Exception e39) {
                            FileLog.e(e39);
                            return;
                        }
                    } catch (Exception e40) {
                        FileLog.e(e40);
                        if (e40 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Y(null);
                            return;
                        }
                    }
                case ':':
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        int w02 = TextUtils.isEmpty(optString10) ? h6.w0(h6.a7, d6Var) : Color.parseColor(optString10);
                        g0 g0Var4 = this.c;
                        if (g0Var4 != null) {
                            g0Var4.r(w02);
                            return;
                        }
                        return;
                    } catch (Exception e41) {
                        FileLog.e(e41);
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
                                i10 = h6.a7;
                                i11 = i10;
                            }
                            i11 = -1;
                        } else {
                            if (optString12.equals("bg_color")) {
                                i10 = h6.d6;
                                i11 = i10;
                            }
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            this.c.u(i11, h6.w0(i11, d6Var), false);
                            return;
                        }
                        return;
                    } catch (Exception e42) {
                        FileLog.e(e42);
                        return;
                    }
                case '<':
                    P(this.G0, true);
                    return;
                case '=':
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        return;
                    } catch (Exception e43) {
                        FileLog.e(e43);
                        return;
                    }
                case '>':
                    if (!m(3)) {
                        int i31 = this.M;
                        x0 x0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.M).getInputUser(this.U);
                        ConnectionsManager.getInstance(this.M).sendRequest(cansendmessage, new t8(this, i31, x0Var3, z7Var, 8));
                        return;
                    }
                    try {
                        JSONObject jSONObject19 = new JSONObject();
                        jSONObject19.put("status", "cancelled");
                        x(z7Var, "write_access_requested", jSONObject19);
                        return;
                    } catch (Exception e44) {
                        FileLog.e(e44);
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

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z10 || !Objects.equals(this.b0, str)) {
                return;
            }
            this.b0 = null;
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P <= 10000 || !z11) {
            this.P = 0L;
            boolean[] zArr = {false};
            if (pf.d.e(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            pf.d.q(getContext(), uri, true, z10, false, null, str, false, true, z12);
        }
    }

    public abstract void J(x0 x0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.s0++;
        }
        x0 x0Var = this.a;
        if (x0Var != null) {
            x0Var.f(null, null);
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

    public final void N(int i10, x0 x0Var, Object obj, String str, boolean z10) {
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.o0;
        if (z11) {
            this.s0++;
            this.t0 = z10;
            this.F0 = z10 ? k(str) : null;
        }
        W(x0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i10, boolean z10) {
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
            y("content_safe_area_changed", jSONObject);
            this.H0 = i10;
        }
    }

    public final void P(Rect rect, boolean z10) {
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
                y("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void Q() {
        try {
            if (this.G != null) {
                E(this.r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                E(this.r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(z7 z7Var, gi.p1 p1Var, String str) {
        if (p1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    x(z7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = p1Var.h(optString);
                    if (h.isEmpty()) {
                        x(z7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    a0 a0Var = new a0(this, z7Var, string, p1Var, optString);
                    n2 U = LaunchActivity.U();
                    d6 resourceProvider = U != null ? U.getResourceProvider() : null;
                    int i10 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    f3 i11 = kk.i(1, context, resourceProvider, false);
                    LinearLayout e = kk.e(context, 1);
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                    ArrayList arrayList = h;
                    TLRPC.User user = MessagesController.getInstance(p1Var.a).getUser(Long.valueOf(p1Var.b));
                    h9 h9Var = new h9((d6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                    e.addView(w9Var, z5.t(80, 80, 49, 0, 21, 0, 13));
                    int i12 = h6.G6;
                    TextView b10 = w7.d6.b(context, 20.0f, i12, true, null);
                    kk.m(R.string.BotRestoreStorageTitle, b10, 17);
                    e.addView(b10, z5.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = w7.d6.b(context, 14.0f, i12, false, null);
                    b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    b11.setGravity(17);
                    e.addView(b11, z5.t(-1, -2, 7, 32, 0, 32, 19));
                    d9 d9Var = new d9(context, resourceProvider);
                    d9Var.setBackground(new zq(new ColorDrawable(h6.w0(h6.a7, resourceProvider)), h6.V0(context, R.drawable.greydivider, h6.w0(h6.b7, resourceProvider))));
                    d9Var.setFixedSize(12);
                    e.addView(d9Var, z5.t(-1, 12, 7, 0, 0, 0, 0));
                    l4 l4Var = new l4(context, resourceProvider);
                    l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    e.addView(l4Var, z5.t(-1, -2, 7, 0, 0, 0, 0));
                    ei.d dVar = new ei.d(context, resourceProvider, true);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        ArrayList arrayList3 = arrayList;
                        gi.o1 o1Var = (gi.o1) arrayList3.get(i13);
                        gi.n1 n1Var = new gi.n1(o1Var, i13 < arrayList3.size() - i10 ? i10 : 0, context);
                        n1Var.setBackground(h6.g0(h6.w0(h6.i6, resourceProvider), 2, -1));
                        LinearLayout linearLayout = e;
                        n1Var.setOnClickListener(new c4(strArr, o1Var, arrayList2, dVar, 2));
                        linearLayout.addView(n1Var, z5.n(-1, 56));
                        arrayList2.add(n1Var);
                        i13++;
                        i11 = i11;
                        arrayList = arrayList3;
                        e = linearLayout;
                        a0Var = a0Var;
                        i10 = 1;
                    }
                    a0 a0Var2 = a0Var;
                    f3 f3Var = i11;
                    LinearLayout linearLayout2 = e;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, z5.t(-1, 48, 7, 8, 8, 8, 4));
                    f3Var.customView = linearLayout2;
                    f3Var.fixNavigationBar(h6.w0(h6.h5, resourceProvider));
                    dVar.setOnClickListener(new c4(zArr, a0Var2, strArr, f3Var, 3));
                    f3Var.setOnDismissListener(new ai.z3(3, zArr, a0Var2));
                    f3Var.show();
                } catch (Exception e7) {
                    x(z7Var, "secure_storage_failed", B("req_id", string, "error", e7.getMessage()));
                }
            } catch (Exception unused) {
                x(z7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(z7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void T(String str, boolean z10) {
        x0 x0Var = this.a;
        if (x0Var != null) {
            boolean z11 = x0Var.E;
        }
        boolean z12 = x0Var == null || !x0Var.canGoBack();
        x0 x0Var2 = this.a;
        I(z12, x0Var2 == null || !x0Var2.canGoForward());
        x0 x0Var3 = this.a;
        if (x0Var3 != null) {
            x0Var3.b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        k4 k4Var = this.s;
        if (!z10 || x0Var3 == null || k4Var == null) {
            if (x0Var3 != null) {
                x0Var3.setAlpha(1.0f);
            }
            if (k4Var != null) {
                k4Var.setAlpha(0.0f);
                k4Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<x0, Float>) property, 1.0f), ObjectAnimator.ofFloat(k4Var, (Property<k4, Float>) property, 0.0f));
            animatorSet.addListener(new tf1(this, 11));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.c.getClass();
    }

    public final void U(z7 z7Var, gi.p1 p1Var, String str, String str2, String str3) {
        if (p1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        p1Var.n(optString, jSONObject.optString("value"));
                        x(z7Var, str2, A(string, "req_id"));
                    } catch (RuntimeException e) {
                        x(z7Var, str3, B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    x(z7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(z7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void V() {
        x0 x0Var = this.a;
        if (x0Var == null || !this.o0) {
            return;
        }
        x0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!a.a.a("WEB_MESSAGE_LISTENER")) {
            g("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        x0 x0Var2 = this.a;
        if (!x0Var2.R) {
            a5.c.a(x0Var2, "TelegramWebviewProxyMessage", singleton, new j5.b(x0Var2, 27));
            this.a.R = true;
        }
        if (a.a.a("DOCUMENT_START_SCRIPT")) {
            x0 x0Var3 = this.a;
            if (x0Var3.S == null) {
                boolean z10 = a5.c.a;
                if (!b5.m.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                b5.o c10 = a5.c.c(x0Var3);
                x0Var3.S = new a4.l((ScriptHandlerBoundaryInterface) androidx.activity.result.c.a(ScriptHandlerBoundaryInterface.class, c10.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 5);
            }
        }
    }

    public final void W(x0 x0Var, Object obj) {
        x0 x0Var2;
        TLRPC.User user;
        String str = "";
        x0 x0Var3 = this.a;
        if (x0Var3 != null) {
            x0Var3.destroy();
            removeView(this.a);
        }
        if (x0Var != null) {
            AndroidUtilities.removeFromParent(x0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !r());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (x0Var == null) {
            Context context = getContext();
            boolean z10 = this.o0;
            long j10 = 0;
            if (z10 && (user = this.U) != null) {
                j10 = user.id;
            }
            x0Var2 = new x0(context, z10, j10);
        } else {
            x0Var2 = x0Var;
        }
        this.a = x0Var2;
        if (this.o0) {
            x0Var2.setBackgroundColor(j(h6.d6));
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
        if (r()) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (x0Var == null && this.o0) {
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
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.u0;
            if (botWebViewContainer$WebViewProxy == null) {
                x0 x0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(x0Var4, this);
                this.u0 = botWebViewContainer$WebViewProxy2;
                x0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.u0.a = this;
        }
        J(this.a);
        P0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var == null || m(i10)) {
            return;
        }
        b2Var.setOnDismissListener(new ai.z3(16, this, runnable));
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

    public final void Y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        sb2.append(str != null ? ": ".concat(str) : "");
        i(sb2.toString());
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
            x0 x0Var = this.a;
            if (x0Var != null) {
                removeView(x0Var);
            }
        }
    }

    public final void d(z7 z7Var, gi.p1 p1Var, String str, String str2, String str3) {
        if (p1Var == null || this.U == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                p1Var.m(new JSONObject());
                x(z7Var, str2, A(string, "req_id"));
            } catch (RuntimeException e) {
                x(z7Var, str3, B("req_id", string, "error", e.getMessage()));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(z7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        by0 by0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            x0 x0Var = this.a;
            if (x0Var != null) {
                x0Var.setBackgroundColor(j(h6.d6));
            }
            if (!this.q0) {
                int i12 = h6.Ki;
                int j10 = j(i12);
                this.p0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                k4 k4Var = this.s;
                k4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.p0);
                    this.r.setupGradient(i12, this.e, 1.0f, false);
                }
                k4Var.invalidate();
            }
            z();
            return;
        }
        if (i10 != NotificationCenter.onActivityResultReceived) {
            if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (by0Var = this.V) == null) {
                    return;
                }
                by0Var.run();
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
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
            boolean drawChild2 = super.drawChild(canvas, view, j10);
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
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.U == null) {
            return;
        }
        gi.r rVar = this.j0;
        if (rVar == null) {
            this.j0 = gi.r.c(getContext(), this.M, this.U.id);
        } else {
            rVar.h();
        }
    }

    public final z7 f() {
        x0 x0Var = this.a;
        long j10 = this.s0;
        boolean z10 = this.t0;
        String str = this.F0;
        z7 z7Var = new z7();
        z7Var.c = this;
        z7Var.d = x0Var;
        z7Var.a = j10;
        z7Var.b = z10;
        z7Var.e = str;
        return z7Var;
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.r0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof e4)) {
            return 0;
        }
        e4 e4Var = (e4) getParent();
        if (e4Var.J) {
            return (int) ((e4Var.getMeasuredHeight() - e4Var.getOffsetY()) + this.z0);
        }
        return 0;
    }

    public String getOriginHost() {
        x0 x0Var = this.a;
        if (x0Var == null) {
            return null;
        }
        return k(x0Var.getUrl());
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

    public x0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        x0 x0Var = this.a;
        if (x0Var != null) {
            if (x0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.B0) {
                this.a.destroy();
                K(this.a);
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
            gi.u0 u0Var = this.k0;
            if (u0Var != null) {
                u0Var.f.remove(this.J0);
                this.k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void i(String str) {
        new xc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        d6 d6Var = this.e;
        return d6Var != null ? d6Var.w(i10) : h6.x0(null, i10, false);
    }

    public final void l(z7 z7Var, gi.p1 p1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (p1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f7 = p1Var.f(optString);
                    if (!p1Var.d || (obj = f7.first) != null) {
                        x(z7Var, str2, B("req_id", string, "value", f7.first));
                        return;
                    }
                    Object obj2 = f7.second;
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("req_id", string);
                        jSONObject.put("value", obj);
                        jSONObject.put("can_restore", obj2);
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    x(z7Var, str2, jSONObject);
                } catch (RuntimeException e) {
                    x(z7Var, str3, B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused2) {
                x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(z7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean m(int i10) {
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

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.N || z11) && (z12 = this.o0) && (getParent() instanceof e4)) {
            e4 e4Var = (e4) getParent();
            if (z10) {
                this.O = e4Var.getSwipeOffsetY() == e4Var.getTopActionBarOffsetY() + (-e4Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (e4Var.getTopActionBarOffsetY() + ((e4Var.getMeasuredHeight() - e4Var.getOffsetY()) - e4Var.getSwipeOffsetY()) + this.z0));
            if (!z11 && max == this.w0 && this.x0 == z10 && this.y0 == this.O) {
                return;
            }
            this.w0 = max;
            this.x0 = z10;
            this.y0 = this.O;
            String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
            if (!z12 || q()) {
                NotificationCenter.getInstance(this.M).doOnIdle(new y(this, a1.g.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
            } else {
                g("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    public final boolean o(z7 z7Var) {
        boolean z10;
        if (z7Var == null) {
            return false;
        }
        String str = (String) z7Var.e;
        if (((a1) z7Var.c) != this || ((x0) z7Var.d) != this.a || z7Var.a != this.s0 || (z10 = z7Var.b) != this.t0) {
            return false;
        }
        if (z10) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.F0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        qc.a(this, new ah.m0(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
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
        n(true, false);
    }

    public final boolean q() {
        if (this.a == null) {
            return false;
        }
        if (this.t0) {
            return !TextUtils.isEmpty(this.F0) && TextUtils.equals(this.F0, getOriginHost());
        }
        return true;
    }

    public final boolean r() {
        return this.O0 != null;
    }

    public final void s(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        k4 k4Var = this.s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            k4Var.setVisibility(0);
            k4Var.setAlpha(1.0f);
            k4Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(h6.a7))));
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
            if (tL_attachMenuBot.bot_id == j10) {
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
                k4Var.setVisibility(0);
                k4Var.setAlpha(1.0f);
                k4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        d6 d6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            k4Var.setVisibility(0);
            k4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.p0);
                this.r.setupGradient(h6.Ki, d6Var, 1.0f, false);
            }
            k4Var.f(null, null, this.r);
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
        k4Var.setVisibility(0);
        k4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.p0);
            this.r.setupGradient(h6.Ki, d6Var, 1.0f, false);
        }
        k4Var.f(null, null, this.r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(g0 g0Var) {
        this.c = g0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10 = AndroidUtilities.computePerceivedBrightness(i10) > 0.7f ? h6.b(0.0f, -0.15f, i10) : h6.b(0.025f, 0.15f, i10);
        if (this.p0 == b10) {
            return;
        }
        this.p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        k4 k4Var = this.s;
        k4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.p0);
            this.r.setupGradient(h6.Ki, this.e, 1.0f, false);
        }
        this.q0 = true;
        k4Var.invalidate();
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
        x0 x0Var = this.a;
        if (x0Var != null) {
            x0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(x0 x0Var) {
        x0 x0Var2;
        this.v0 = x0Var;
        if (this.o0 || (x0Var2 = this.a) == null) {
            return;
        }
        x0Var2.f = x0Var;
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

    public void setWasOpenedByBot(t4 t4Var) {
        this.E0 = t4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.w = aVar;
    }

    public void setWebViewScrollListener(z0 z0Var) {
        this.d = z0Var;
        x0 x0Var = this.a;
        if (x0Var != null) {
            x0Var.f(this, z0Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        this.M = i10;
        if (this.o0) {
            this.s0++;
            this.t0 = z10;
            this.F0 = z10 ? k(str) : null;
            if (this.a != null) {
                V();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void v(z7 z7Var) {
        if (this.U == null) {
            return;
        }
        e();
        gi.r rVar = this.j0;
        if (rVar == null) {
            return;
        }
        try {
            x(z7Var, "biometry_info_received", rVar.f());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x(z7 z7Var, String str, JSONObject jSONObject) {
        if (o(z7Var)) {
            y(str, jSONObject);
            return;
        }
        g("notifyEvent " + str + " dropped after document change");
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject q6;
        try {
            q6 = d3.q(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (q6 != null) {
            jSONObject = new JSONObject().put("theme_params", q6);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public void H() {
    }

    public void K(x0 x0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void D(boolean z10, String str) {
    }

    public void I(boolean z10, boolean z11) {
    }
}
