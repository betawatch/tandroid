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
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d00;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.m5;
import org.telegram.messenger.n20;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.qz;
import org.telegram.messenger.t2;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.ys;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.k3;
import org.telegram.ui.jo;
import org.telegram.ui.mb;
import org.telegram.ui.ns0;
import org.telegram.ui.p9;
import org.telegram.ui.px0;
import org.telegram.ui.q8;
import org.telegram.ui.ra1;
import org.telegram.ui.u9;
import w7.b6;
import w7.g6;
import xh.m2;
import xh.q3;
import xh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class z0 extends FrameLayout implements us, k6 {
    public static boolean Q0 = true;
    public static int R0;
    public static HashMap S0;
    public int A0;
    public boolean B0;
    public int C0;
    public int D;
    public Runnable D0;
    public int E;
    public boolean E0;
    public String F;
    public s3 F0;
    public String G;
    public String G0;
    public int H;
    public final Rect H0;
    public int I;
    public int I0;
    public String J;
    public x0 J0;
    public String K;
    public final q K0;
    public String L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public long N0;
    public boolean O;
    public final int O0;
    public long P;
    public n20 P0;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public u41 V;
    public Activity W;
    public v0 a;
    public boolean a0;
    public String b;
    public String b0;
    public d0 c;
    public org.telegram.ui.ActionBar.x1 c0;
    public y0 d;
    public int d0;
    public final p6 e;
    public long e0;
    public final TextView f;
    public long f0;
    public p9 g0;
    public boolean h;
    public boolean h0;
    public String i0;
    public xh.n j0;
    public xh.o0 k0;
    public xh.f0 l0;
    public xh.g1 m0;
    public final org.telegram.ui.Components.voip.g n;
    public xh.g1 n0;
    public final boolean o0;
    public int p0;
    public boolean q0;
    public c00 r;
    public BotWebViewContainer$BotWebViewProxy r0;
    public final ag.d2 s;
    public long s0;
    public boolean t0;
    public BotWebViewContainer$WebViewProxy u0;
    public v0 v0;
    public boolean w;
    public int w0;
    public q0.a x;
    public boolean x0;
    public ValueCallback y;
    public boolean y0;
    public float z0;

    public z0(int i10, Context context, p6 p6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.n = gVar;
        int i11 = t6.Ci;
        this.D = j(i11);
        int i12 = t6.Gi;
        this.E = j(i12);
        this.F = "";
        this.H = j(i11);
        this.I = j(i12);
        this.J = "";
        this.K = "";
        this.M = d20.s0;
        this.A0 = -1;
        this.H0 = new Rect(0, 0, 0, 0);
        this.I0 = 0;
        this.K0 = new q(this, 2);
        this.L0 = -1;
        this.M0 = 0;
        int i13 = R0;
        R0 = i13 + 1;
        this.O0 = i13;
        this.o0 = z10;
        this.e = p6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        gVar.k = false;
        gVar.b(i10, zs.j2);
        ag.d2 d2Var = new ag.d2(this, context);
        this.s = d2Var;
        int j10 = j(t6.yj);
        this.p0 = j10;
        d2Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        d2Var.getImageReceiver().R0 = true;
        addView(d2Var, b6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(cd.L0(2131752913, null));
        a7.V(textView, t6.y6, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.i0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, b6.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(gf.f.u(Uri.parse(str2), "https", null, S(org.telegram.messenger.i0.K0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            f8.g(e, true);
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
        sb2.append(vp.r1(d20.s0).V5);
        return sb2.toString();
    }

    public static void a(z0 z0Var, String[] strArr, q0.a aVar) {
        z0Var.getClass();
        for (String str : strArr) {
            if (z0Var.getContext().checkSelfPermission(str) != 0) {
                z0Var.V = new u41(z0Var, aVar, strArr, 5);
                Activity activity = z0Var.W;
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
        String K0 = org.telegram.messenger.i0.K0(str, false);
        try {
            K0 = IDN.toASCII(K0, 1);
        } catch (Exception unused) {
        }
        String S = S(K0);
        if (S0 == null) {
            S0 = new HashMap();
        }
        S0.put(S, K0);
        return gf.f.u(Uri.parse(str), "https", null, S, null);
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
        this.w = z10;
        ag.d2 d2Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int L = org.telegram.messenger.i0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d2Var.requestLayout();
    }

    private void setupWebView(v0 v0Var) {
        W(v0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (S0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.i0.K0(str, false);
        if (K0 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(vp.r1(d20.s0).V5);
        return (K0.endsWith(sb2.toString()) && (str2 = (String) S0.get(K0)) != null) ? gf.f.u(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void w(int i10, v0 v0Var, x0 x0Var, String str, JSONObject jSONObject) {
        if (v0Var == null) {
            return;
        }
        zs.f(i10).d(new px0(v0Var, x0Var, str, jSONObject, 10));
    }

    public final boolean C() {
        if (this.a == null || !this.R) {
            return false;
        }
        x("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x07bd, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x07c0, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0e09  */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x11d9  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x11e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final x0 x0Var, String str, String str2) {
        char c10;
        int i10;
        int i11;
        t2 t2Var;
        final int i12;
        p9 p9Var;
        final z0 z0Var;
        final z0 z0Var2;
        x0 x0Var2;
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
        String str11;
        boolean z16;
        if (this.o0) {
            if (this.a == null || this.c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!o(x0Var)) {
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
            q qVar = this.K0;
            long j13 = 1000;
            p6 p6Var = this.e;
            t2 t2Var2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            h3 h3Var = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
            t2Var2 = null;
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
                        v0 v0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = vp.r1(i14).n1(this.U.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i14).sendRequest(invokewebviewcustommethod, new q8(this, string, i14, v0Var, x0Var, 9));
                        return;
                    } catch (Exception e) {
                        f8.f(e);
                        if (e instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Y(null);
                            return;
                        }
                    }
                case 1:
                    if (!this.h0 || (p9Var = this.g0) == null) {
                        return;
                    }
                    p9Var.dismiss();
                    return;
                case 2:
                    v(x0Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject2.optString("url"));
                        String optString = jSONObject2.optString("try_browser");
                        if (vp.r1(this.M).C4 == null || !vp.r1(this.M).C4.contains(parse.getScheme())) {
                            return;
                        }
                        G(parse, optString, jSONObject2.optBoolean("try_instant_view"), true, false);
                        return;
                    } catch (Exception e7) {
                        f8.f(e7);
                        return;
                    }
                case 4:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    if (this.l0 == null) {
                        this.l0 = xh.f0.c(getContext(), this.M, this.U.id);
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        String string3 = jSONObject3.getString("url");
                        String string4 = jSONObject3.getString("file_name");
                        if (this.l0.d(string3) != null) {
                            this.l0.b(string3, string4);
                            y(x0Var, "file_download_requested", A("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = vp.r1(this.M).p1(this.U);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.M).sendRequest(checkdownloadfileparams, new mb(this, x0Var, string3, string4, 9));
                        return;
                    } catch (Exception e10) {
                        f8.f(e10);
                        y(x0Var, "file_download_requested", A("cancelled", "status"));
                        return;
                    }
                case 5:
                    z0Var = this;
                    try {
                        if (z0Var.c0 == null) {
                            if (System.currentTimeMillis() - z0Var.e0 <= 150) {
                                int i15 = z0Var.d0 + 1;
                                z0Var.d0 = i15;
                                if (i15 >= 3) {
                                    z0Var.d0 = 0;
                                    z0Var.f0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - z0Var.f0 > 3000) {
                                JSONObject jSONObject4 = new JSONObject(str2);
                                String optString2 = jSONObject4.optString("title", null);
                                String string5 = jSONObject4.getString("message");
                                JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z0Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i16 = 0; i16 < jSONArray.length(); i16++) {
                                    arrayList.add(new w0(jSONArray.getJSONObject(i16)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final w0 w0Var = (w0) arrayList.get(0);
                                            final int i17 = 0;
                                            alertDialog$Builder.k(w0Var.b, new org.telegram.ui.ActionBar.u1(z0Var) { // from class: org.telegram.ui.web.n
                                                public final /* synthetic */ z0 b;

                                                {
                                                    this.b = z0Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.u1
                                                public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i18) {
                                                    switch (i17) {
                                                        case 0:
                                                            z0 z0Var3 = this.b;
                                                            x0 x0Var3 = x0Var;
                                                            w0 w0Var2 = w0Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            x1Var.dismiss();
                                                            try {
                                                                z0Var3.P = System.currentTimeMillis();
                                                                z0Var3.y(x0Var3, "popup_closed", new JSONObject().put("button_id", w0Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e11) {
                                                                f8.g(e11, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            z0 z0Var4 = this.b;
                                                            x0 x0Var4 = x0Var;
                                                            w0 w0Var3 = w0Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            x1Var.dismiss();
                                                            try {
                                                                z0Var4.P = System.currentTimeMillis();
                                                                z0Var4.y(x0Var4, "popup_closed", new JSONObject().put("button_id", w0Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                f8.g(e12, true);
                                                                return;
                                                            }
                                                        default:
                                                            z0 z0Var5 = this.b;
                                                            x0 x0Var5 = x0Var;
                                                            w0 w0Var4 = w0Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            x1Var.dismiss();
                                                            try {
                                                                z0Var5.P = System.currentTimeMillis();
                                                                z0Var5.y(x0Var5, "popup_closed", new JSONObject().put("button_id", w0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                f8.g(e13, true);
                                                            }
                                                    }
                                                }
                                            });
                                        } catch (JSONException e11) {
                                            e = e11;
                                            f8.f(e);
                                            return;
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        final w0 w0Var2 = (w0) arrayList.get(1);
                                        final int i18 = 1;
                                        alertDialog$Builder.h(w0Var2.b, new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.n
                                            public final /* synthetic */ z0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i182) {
                                                switch (i18) {
                                                    case 0:
                                                        z0 z0Var3 = this.b;
                                                        x0 x0Var3 = x0Var;
                                                        w0 w0Var22 = w0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        x1Var.dismiss();
                                                        try {
                                                            z0Var3.P = System.currentTimeMillis();
                                                            z0Var3.y(x0Var3, "popup_closed", new JSONObject().put("button_id", w0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e112) {
                                                            f8.g(e112, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        z0 z0Var4 = this.b;
                                                        x0 x0Var4 = x0Var;
                                                        w0 w0Var3 = w0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        x1Var.dismiss();
                                                        try {
                                                            z0Var4.P = System.currentTimeMillis();
                                                            z0Var4.y(x0Var4, "popup_closed", new JSONObject().put("button_id", w0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e12) {
                                                            f8.g(e12, true);
                                                            return;
                                                        }
                                                    default:
                                                        z0 z0Var5 = this.b;
                                                        x0 x0Var5 = x0Var;
                                                        w0 w0Var4 = w0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        x1Var.dismiss();
                                                        try {
                                                            z0Var5.P = System.currentTimeMillis();
                                                            z0Var5.y(x0Var5, "popup_closed", new JSONObject().put("button_id", w0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            f8.g(e13, true);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final w0 w0Var3 = (w0) arrayList.get(2);
                                        String str15 = w0Var3.b;
                                        final int i19 = 2;
                                        z0Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(z0Var2) { // from class: org.telegram.ui.web.n
                                                public final /* synthetic */ z0 b;

                                                {
                                                    this.b = z0Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.u1
                                                public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i182) {
                                                    switch (i19) {
                                                        case 0:
                                                            z0 z0Var3 = this.b;
                                                            x0 x0Var3 = x0Var;
                                                            w0 w0Var22 = w0Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            x1Var.dismiss();
                                                            try {
                                                                z0Var3.P = System.currentTimeMillis();
                                                                z0Var3.y(x0Var3, "popup_closed", new JSONObject().put("button_id", w0Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e112) {
                                                                f8.g(e112, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            z0 z0Var4 = this.b;
                                                            x0 x0Var4 = x0Var;
                                                            w0 w0Var32 = w0Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            x1Var.dismiss();
                                                            try {
                                                                z0Var4.P = System.currentTimeMillis();
                                                                z0Var4.y(x0Var4, "popup_closed", new JSONObject().put("button_id", w0Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                f8.g(e12, true);
                                                                return;
                                                            }
                                                        default:
                                                            z0 z0Var5 = this.b;
                                                            x0 x0Var5 = x0Var;
                                                            w0 w0Var4 = w0Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            x1Var.dismiss();
                                                            try {
                                                                z0Var5.P = System.currentTimeMillis();
                                                                z0Var5.y(x0Var5, "popup_closed", new JSONObject().put("button_id", w0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                f8.g(e13, true);
                                                            }
                                                    }
                                                }
                                            };
                                            x0Var2 = x0Var;
                                            alertDialog$Builder.i(str15, u1Var);
                                        } catch (JSONException e12) {
                                            e = e12;
                                            f8.f(e);
                                            return;
                                        }
                                    } else {
                                        z0Var2 = this;
                                        x0Var2 = x0Var;
                                    }
                                    alertDialog$Builder.j(new org.telegram.ui.Components.z1(z0Var2, atomicBoolean, x0Var2, 2));
                                    z0Var2.c0 = alertDialog$Builder.p();
                                    if (arrayList.size() >= 1) {
                                        w0 w0Var4 = (w0) arrayList.get(0);
                                        if (w0Var4.c >= 0 && (textView3 = (TextView) z0Var2.c0.d(-1)) != null) {
                                            textView3.setTextColor(z0Var2.j(w0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        w0 w0Var5 = (w0) arrayList.get(1);
                                        if (w0Var5.c >= 0 && (textView2 = (TextView) z0Var2.c0.d(-2)) != null) {
                                            textView2.setTextColor(z0Var2.j(w0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        w0 w0Var6 = (w0) arrayList.get(2);
                                        if (w0Var6.c < 0 || (textView = (TextView) z0Var2.c0.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(z0Var2.j(w0Var6.c));
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
                    z0Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (z0Var.b0 != null) {
                            z0Var.F(optString3, "cancelled", true);
                            return;
                        }
                        z0Var.b0 = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(z0Var.M).sendRequest(tL_payments_getPaymentForm, new ag.p0(z0Var, optString3, tL_inputInvoiceSlug, 15));
                        return;
                    } catch (JSONException e14) {
                        f8.f(e14);
                        break;
                    }
                case 7:
                    z0Var = this;
                    if (z0Var.U != null && System.currentTimeMillis() - z0Var.P <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j10 = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            try {
                                i13 = jSONObject5.getInt("duration");
                            } catch (Exception unused) {
                                i13 = 0;
                                user = z0Var.U;
                                if (user != null) {
                                }
                            }
                        } catch (Exception unused2) {
                            j10 = 0;
                        }
                        user = z0Var.U;
                        if (user != null) {
                            z0Var.y(x0Var, "emoji_status_failed", A("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            q3.f(z0Var.M, user, j10, i13, new o(z0Var, x0Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    z0Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", z0Var.J).trim();
                        boolean z17 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : z0Var.H;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : z0Var.I;
                        boolean z18 = jSONObject6.optBoolean("is_progress_visible", false) && z17;
                        boolean z19 = jSONObject6.optBoolean("has_shine_effect", false) && z17;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : z0Var.K;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        z0Var.H = parseColor;
                        z0Var.I = parseColor2;
                        z0Var.J = trim;
                        z0Var.K = optString4;
                        z0Var.L = str2;
                        z0Var.c.l(z17, optBoolean, trim, j11, parseColor, parseColor2, z18, z19, optString4);
                        break;
                    } catch (Exception e15) {
                        f8.f(e15);
                        break;
                    }
                    break;
                case '\t':
                    z0Var = this;
                    try {
                        z0Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e16) {
                        f8.f(e16);
                        break;
                    }
                case '\n':
                    z0Var = this;
                    try {
                        if (!z0Var.h0 && z0Var.W != null) {
                            z0Var.i0 = new JSONObject(str2).optString("text");
                            z0Var.h0 = true;
                            if (z0Var.W.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = z0Var.W;
                                if (activity != null) {
                                    z0Var.g0 = u9.i0(activity, 3, new l2.f(z0Var, 21));
                                    return;
                                }
                                break;
                            } else {
                                zs.e().a(new ys(z0Var, x0Var, 2));
                                z0Var.W.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                return;
                            }
                        }
                    } catch (JSONException e17) {
                        f8.f(e17);
                        break;
                    }
                    break;
                case 11:
                    if (m(4)) {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            y(x0Var, "phone_requested", jSONObject7);
                            return;
                        } catch (Exception e18) {
                            f8.f(e18);
                            return;
                        }
                    }
                    final int i20 = this.M;
                    final v0 v0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), p6Var);
                    alertDialog$Builder2.l(cd.K0(2131745438));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String p5 = h20.p(this.U);
                    if (TextUtils.isEmpty(p5)) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.K0(2131754069)));
                    } else {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.Z(2131754066, p5)));
                    }
                    final boolean z20 = vp.r1(this.M).G0.indexOfKey(this.U.id) >= 0;
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) cd.K0(2131754068));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(cd.K0(2131745479), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.web.t
                        @Override // org.telegram.ui.ActionBar.u1
                        public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i21) {
                            strArr[0] = null;
                            x1Var.dismiss();
                            z0 z0Var3 = z0.this;
                            boolean z21 = z20;
                            int i22 = i20;
                            v0 v0Var3 = v0Var2;
                            x0 x0Var3 = x0Var;
                            if (z21) {
                                vp.r1(z0Var3.M).c5(new c11(z0Var3, i22, v0Var3, x0Var3, 15), z0Var3.U.id);
                                return;
                            }
                            qz.C(z0Var3.M).r0(oz.g(d20.i(z0Var3.M).f(), z0Var3.U.id, null, null, null, null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                z0.w(i22, v0Var3, x0Var3, "phone_requested", jSONObject8);
                            } catch (Exception e19) {
                                f8.g(e19, true);
                            }
                        }
                    });
                    alertDialog$Builder2.h(cd.K0(2131752589), new ra1(6));
                    X(4, alertDialog$Builder2.a(), new u(strArr, i20, v0Var2, x0Var, 0));
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
                        this.n0 = new xh.g1(i21, d20.i(i21).e(), this.U.id, true);
                    }
                    l(x0Var, this.n0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.k0 == null) {
                        xh.o0 e19 = xh.o0.e(getContext(), this.M, this.U.id);
                        this.k0 = e19;
                        e19.f.add(qVar);
                    }
                    this.J0 = x0Var;
                    qVar.run();
                    return;
                case 15:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    k2 T = LaunchActivity.T();
                    if (T == null || T.getParentLayout() == null) {
                        return;
                    }
                    z4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.z4(this.U.id));
                    org.telegram.messenger.i0.j3(parentLayout, "botPermissionBiometry");
                    d0 d0Var = this.c;
                    if (d0Var != null) {
                        d0Var.b();
                        return;
                    }
                    return;
                case 16:
                    n(!((getParent() instanceof xh.h3) && ((xh.h3) getParent()).d()), true);
                    return;
                case 17:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    q3.a(this.M, this.U.id, new o(this, x0Var, 0));
                    return;
                case 18:
                    xh.s0 A = this.c.A();
                    if (A == null || !A.h()) {
                        y(x0Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(x0Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i22 = this.M;
                        this.m0 = new xh.g1(i22, d20.i(i22).e(), this.U.id, false);
                    }
                    U(x0Var, this.m0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i23 = this.M;
                        this.m0 = new xh.g1(i23, d20.i(i23).e(), this.U.id, false);
                    }
                    l(x0Var, this.m0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    e();
                    xh.n nVar = this.j0;
                    if (nVar == null) {
                        return;
                    }
                    if (nVar.e) {
                        nVar.j(str3, true, null, new jo(6, nVar, new o(this, x0Var, 3)));
                        return;
                    }
                    try {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("status", "failed");
                        y(x0Var, "biometry_auth_requested", jSONObject8);
                        return;
                    } catch (Exception e20) {
                        f8.f(e20);
                        return;
                    }
                case 22:
                    try {
                        z10 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z10 = false;
                    }
                    d0 d0Var2 = this.c;
                    if (d0Var2 != null) {
                        d0Var2.p(z10);
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
                            if (getParent() instanceof xh.h3) {
                            }
                        }
                    } catch (Exception unused7) {
                        z11 = true;
                    }
                    g("allowScroll " + z11 + " " + z12);
                    if (getParent() instanceof xh.h3) {
                        return;
                    }
                    ((xh.h3) getParent()).a(z11, z12);
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
                        f8.f(e21);
                        return;
                    }
                case 25:
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i24 = this.M;
                        this.n0 = new xh.g1(i24, d20.i(i24).e(), this.U.id, true);
                    }
                    R(x0Var, this.n0, str2);
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
                            f8.f(e);
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
                        if (!vp.r1(this.M).T4()) {
                            new kg.i1((k2) new kg.q1(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this.W);
                        new HttpGetFileTask(new v(this, x1Var, str8, str10, str9), null).execute(str7);
                        x1Var.r(250L);
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
                        xh.o0 e26 = xh.o0.e(getContext(), this.M, this.U.id);
                        this.k0 = e26;
                        e26.f.add(qVar);
                    }
                    this.J0 = x0Var;
                    if (this.k0.g()) {
                        this.k0.j(new p(this, x0Var, 0));
                        return;
                    } else {
                        this.k0.i(new o(this, x0Var, 1));
                        return;
                    }
                case 28:
                    xh.s0 A2 = this.c.A();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long k10 = Utilities.k(j13, 1000L, 20L);
                    if (A2 == null || !A2.d(k10)) {
                        y(x0Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(x0Var, "gyroscope_started", null);
                        return;
                    }
                case 29:
                    try {
                        z13 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e27) {
                        f8.f(e27);
                        z13 = false;
                    }
                    this.c.z();
                    if (z13) {
                        if (this.E0 && LaunchActivity.I1 != null) {
                            Activity W = org.telegram.messenger.i0.W(getContext());
                            if (W == null) {
                                W = LaunchActivity.I1;
                            }
                            if (W == null || W.isFinishing()) {
                                return;
                            }
                            W.moveTaskToBack(true);
                            return;
                        }
                        if (this.F0 == null || (launchActivity = LaunchActivity.I1) == null || launchActivity.O() == null) {
                            return;
                        }
                        i3 O = LaunchActivity.I1.O();
                        ArrayList<h3> tabs = O.getTabs();
                        int i25 = 0;
                        while (true) {
                            if (i25 < tabs.size()) {
                                h3 h3Var2 = tabs.get(i25);
                                if (!this.F0.equals(h3Var2.a) || h3Var2.b == this.a) {
                                    i25++;
                                } else {
                                    h3Var = h3Var2;
                                }
                            }
                        }
                        if (h3Var != null) {
                            O.e(h3Var);
                            return;
                        }
                        return;
                    }
                    return;
                case zs.T /* 30 */:
                    T(this.a.getUrl(), true);
                    return;
                case zs.U /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.P <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            y(x0Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            return;
                        }
                        y(x0Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                        return;
                    } catch (JSONException e28) {
                        f8.f(e28);
                        return;
                    }
                case ' ':
                    Activity W2 = org.telegram.messenger.i0.W(getContext());
                    if (W2 == null) {
                        W2 = LaunchActivity.I1;
                    }
                    if (W2 != null) {
                        org.telegram.messenger.i0.v1(W2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    xh.s0 A3 = this.c.A();
                    if (A3 == null || !A3.g()) {
                        y(x0Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(x0Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i26 = this.M;
                        this.n0 = new xh.g1(i26, d20.i(i26).e(), this.U.id, true);
                    }
                    d(x0Var, this.n0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i27 = this.M;
                        this.m0 = new xh.g1(i27, d20.i(i27).e(), this.U.id, false);
                    }
                    d(x0Var, this.m0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    xh.s0 A4 = this.c.A();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long k11 = Utilities.k(j13, 1000L, 20L);
                    if (A4 == null || !A4.c(k11)) {
                        y(x0Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(x0Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    xh.s0 A5 = this.c.A();
                    if (A5 == null || !A5.f()) {
                        y(x0Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(x0Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            y(x0Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            xh.c1.e1(getContext(), this.M, this.U.id, string7, this.e, new q(this, 0), new org.telegram.tgnet.e(this, x0Var, botWebViewContainer$BotWebViewProxy, 4));
                            return;
                        }
                    } catch (Exception e29) {
                        f8.f(e29);
                        y(x0Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                        return;
                    }
                case '\'':
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        return;
                    } catch (JSONException e30) {
                        f8.f(e30);
                        return;
                    }
                case '(':
                    O(this.I0, true);
                    return;
                case ')':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    ui.b0(this.M);
                    long j14 = this.U.id;
                    int i28 = ui.c2;
                    if (ui.z0(i28, j14)) {
                        y(x0Var, "home_screen_added", null);
                        return;
                    } else {
                        ui.b0(this.M).y0(this.U.id, i28, new p(this, x0Var, 2));
                        return;
                    }
                case '*':
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
                        y(x0Var, "fullscreen_changed", B("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z15)));
                        return;
                    } else {
                        y(x0Var, "fullscreen_failed", A(g10, "error"));
                        return;
                    }
                case '+':
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i29 = 0; i29 < jSONArray3.length(); i29++) {
                            arrayList2.add(jSONArray3.getString(i29));
                        }
                        this.c.v(this.U, jSONObject11.getString("query"), arrayList2);
                        return;
                    } catch (JSONException e31) {
                        f8.f(e31);
                        return;
                    }
                case ',':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i30 = this.M;
                        this.n0 = new xh.g1(i30, d20.i(i30).e(), this.U.id, true);
                    }
                    U(x0Var, this.n0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case '-':
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        y(x0Var, "fullscreen_changed", A(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        y(x0Var, "fullscreen_failed", A(g11, "error"));
                        return;
                    }
                case '.':
                    if (this.P0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z21 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.web.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z0.this.P0.a(Boolean.valueOf(z21), Double.valueOf(d), optString6, Double.valueOf(optDouble));
                                }
                            });
                            return;
                        } catch (Exception e32) {
                            f8.f(e32);
                            return;
                        }
                    }
                    return;
                case '/':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    k2 T2 = LaunchActivity.T();
                    if (T2 == null || T2.getParentLayout() == null) {
                        return;
                    }
                    z4 parentLayout2 = T2.getParentLayout();
                    T2.presentFragment(ProfileActivity.z4(this.U.id));
                    org.telegram.messenger.i0.j3(parentLayout2, "botPermissionLocation");
                    d0 d0Var3 = this.c;
                    if (d0Var3 != null) {
                        d0Var3.b();
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
                        f8.f(e33);
                        return;
                    }
                case '1':
                    try {
                        str13 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused12) {
                    }
                    e();
                    xh.n nVar2 = this.j0;
                    if (nVar2 == null) {
                        return;
                    }
                    boolean z22 = nVar2.f;
                    if (z22) {
                        v(x0Var);
                        return;
                    }
                    if (nVar2.e) {
                        if (!z22) {
                            nVar2.f = true;
                            nVar2.k();
                        }
                        v(x0Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new k3(22, this, x0Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), p6Var);
                    if (TextUtils.isEmpty(str13)) {
                        alertDialog$Builder3.l(cd.K0(2131753141));
                        i12 = 0;
                        alertDialog$Builder3.g(org.telegram.messenger.i0.W2(cd.Z(2131753142, h20.p(this.U))));
                    } else {
                        i12 = 0;
                        alertDialog$Builder3.l(org.telegram.messenger.i0.W2(cd.Z(2131753142, h20.p(this.U))));
                        alertDialog$Builder3.g(str13);
                    }
                    alertDialog$Builder3.k(cd.K0(2131754284), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.w
                        public final /* synthetic */ z0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.u1
                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i31) {
                            switch (i12) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    z0 z0Var3 = this.b;
                                    xh.n nVar3 = z0Var3.j0;
                                    nVar3.f = true;
                                    nVar3.k();
                                    xh.n nVar4 = z0Var3.j0;
                                    o oVar = new o(z0Var3, x0Var, 2);
                                    nVar4.getClass();
                                    nVar4.j(null, true, null, new jo(6, nVar4, oVar));
                                    break;
                                default:
                                    z0 z0Var4 = this.b;
                                    z0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    xh.n nVar5 = z0Var4.j0;
                                    nVar5.f = true;
                                    nVar5.d = true;
                                    nVar5.k();
                                    z0Var4.v(x0Var);
                                    break;
                            }
                        }
                    });
                    final int i31 = 1;
                    alertDialog$Builder3.h(cd.K0(2131752589), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.web.w
                        public final /* synthetic */ z0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.u1
                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i312) {
                            switch (i31) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    z0 z0Var3 = this.b;
                                    xh.n nVar3 = z0Var3.j0;
                                    nVar3.f = true;
                                    nVar3.k();
                                    xh.n nVar4 = z0Var3.j0;
                                    o oVar = new o(z0Var3, x0Var, 2);
                                    nVar4.getClass();
                                    nVar4.j(null, true, null, new jo(6, nVar4, oVar));
                                    break;
                                default:
                                    z0 z0Var4 = this.b;
                                    z0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    xh.n nVar5 = z0Var4.j0;
                                    nVar5.f = true;
                                    nVar5.d = true;
                                    nVar5.k();
                                    z0Var4.v(x0Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new ag.x(runnableArr, 8));
                    alertDialog$Builder3.p();
                    return;
                case '2':
                    try {
                        JSONObject jSONObject13 = new JSONObject(str2);
                        String optString7 = jSONObject13.optString(TeXSymbolParser.TYPE_ATTR);
                        int hashCode = optString7.hashCode();
                        if (hashCode != -1184809658) {
                            if (hashCode == 193071555) {
                                if (optString7.equals("selection_change")) {
                                    t2Var2 = t2.y;
                                    break;
                                }
                            } else if (hashCode == 595233003 && optString7.equals("notification")) {
                                String optString8 = jSONObject13.optString("notification_type");
                                int hashCode2 = optString8.hashCode();
                                if (hashCode2 != -1867169789) {
                                    if (hashCode2 != 96784904) {
                                        if (hashCode2 == 1124446108 && optString8.equals("warning")) {
                                            t2Var = t2.x;
                                            t2Var2 = t2Var;
                                            break;
                                        }
                                    } else if (optString8.equals("error")) {
                                        t2Var = t2.s;
                                        t2Var2 = t2Var;
                                    }
                                } else if (optString8.equals("success")) {
                                    t2Var = t2.w;
                                    t2Var2 = t2Var;
                                }
                            }
                            return;
                        }
                        if (optString7.equals("impact")) {
                            String optString9 = jSONObject13.optString("impact_style");
                            switch (optString9.hashCode()) {
                                case -1078030475:
                                    if (optString9.equals("medium")) {
                                        t2Var = t2.f;
                                        t2Var2 = t2Var;
                                        break;
                                    }
                                    break;
                                case 3535914:
                                    if (optString9.equals("soft")) {
                                        t2Var = t2.r;
                                        t2Var2 = t2Var;
                                        break;
                                    }
                                    break;
                                case 99152071:
                                    if (optString9.equals("heavy")) {
                                        t2Var = t2.h;
                                        t2Var2 = t2Var;
                                        break;
                                    }
                                    break;
                                case 102970646:
                                    if (optString9.equals("light")) {
                                        t2Var = t2.e;
                                        t2Var2 = t2Var;
                                        break;
                                    }
                                    break;
                                case 108511787:
                                    if (optString9.equals("rigid")) {
                                        t2Var = t2.n;
                                        t2Var2 = t2Var;
                                        break;
                                    }
                                    break;
                            }
                        }
                        return;
                    } catch (Exception e34) {
                        f8.f(e34);
                        return;
                    }
                case zs.o0 /* 51 */:
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.F).trim();
                        boolean z23 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.D;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.E;
                        boolean z24 = jSONObject14.optBoolean("is_progress_visible", false) && z23;
                        boolean z25 = jSONObject14.optBoolean("has_shine_effect", false) && z23;
                        try {
                            j12 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused13) {
                            j12 = 0;
                        }
                        this.D = parseColor3;
                        this.E = parseColor4;
                        this.F = trim2;
                        this.G = str2;
                        this.c.q(z23, optBoolean4, trim2, j12, parseColor3, parseColor4, z24, z25);
                        return;
                    } catch (Exception e35) {
                        f8.f(e35);
                        return;
                    }
                case zs.p0 /* 52 */:
                    try {
                        this.c.y(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        return;
                    } catch (JSONException e36) {
                        f8.f(e36);
                        return;
                    }
                case zs.q0 /* 53 */:
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.S) {
                            this.S = optBoolean5;
                            this.c.t(optBoolean5);
                            return;
                        }
                        return;
                    } catch (JSONException e37) {
                        f8.f(e37);
                        return;
                    }
                case zs.r0 /* 54 */:
                    if (this.U == null || Build.VERSION.SDK_INT < 26) {
                        str11 = "unsupported";
                    } else {
                        ui.b0(this.M);
                        str11 = ui.z0(ui.c2, this.U.id) ? "added" : "missed";
                    }
                    y(x0Var, "home_screen_checked", A(str11, "status"));
                    return;
                case zs.s0 /* 55 */:
                    try {
                        str12 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e38) {
                        f8.f(e38);
                    }
                    if (str12 == null) {
                        return;
                    }
                    TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                    getrequestedwebviewbutton.bot = vp.r1(this.M).p1(this.U);
                    getrequestedwebviewbutton.webapp_req_id = str12;
                    ConnectionsManager.getInstance(this.M).sendRequestTyped(getrequestedwebviewbutton, new a3.b(2), new s(this, x0Var, str12, 0));
                    return;
                case zs.t0 /* 56 */:
                    xh.s0 A6 = this.c.A();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        z16 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused14) {
                        z16 = false;
                    }
                    long k12 = Utilities.k(j13, 1000L, 20L);
                    if (A6 == null || !A6.e(k12, z16)) {
                        y(x0Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        y(x0Var, "device_orientation_started", null);
                        return;
                    }
                case zs.u0 /* 57 */:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str14 = jSONObject16.getString("reason");
                        } catch (Exception unused15) {
                        }
                        e();
                        xh.n nVar3 = this.j0;
                        if (nVar3 == null) {
                            return;
                        }
                        if (nVar3.e) {
                            nVar3.l(str14, string8, new kg.d0(this, string8, x0Var, 5));
                            return;
                        }
                        try {
                            JSONObject jSONObject17 = new JSONObject();
                            jSONObject17.put("status", "failed");
                            y(x0Var, "biometry_token_updated", jSONObject17);
                            return;
                        } catch (Exception e39) {
                            f8.f(e39);
                            return;
                        }
                    } catch (Exception e40) {
                        f8.f(e40);
                        if (e40 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Y(null);
                            return;
                        }
                    }
                case zs.v0 /* 58 */:
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        boolean isEmpty = TextUtils.isEmpty(optString10);
                        int w02 = isEmpty ? t6.w0(t6.a7, p6Var) : Color.parseColor(optString10);
                        d0 d0Var4 = this.c;
                        if (d0Var4 != null) {
                            if (isEmpty) {
                                d0Var4.x(w02);
                                return;
                            } else {
                                d0Var4.r(w02);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e41) {
                        f8.f(e41);
                        return;
                    }
                case zs.w0 /* 59 */:
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
                                i10 = t6.a7;
                                i11 = i10;
                            }
                            i11 = -1;
                        } else {
                            if (optString12.equals("bg_color")) {
                                i10 = t6.d6;
                                i11 = i10;
                            }
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            this.c.u(i11, t6.w0(i11, p6Var), false);
                            return;
                        }
                        return;
                    } catch (Exception e42) {
                        f8.f(e42);
                        return;
                    }
                case zs.x0 /* 60 */:
                    P(this.H0, true);
                    return;
                case zs.y0 /* 61 */:
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        return;
                    } catch (Exception e43) {
                        f8.f(e43);
                        return;
                    }
                case zs.z0 /* 62 */:
                    if (!m(3)) {
                        int i32 = this.M;
                        v0 v0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = vp.r1(this.M).p1(this.U);
                        ConnectionsManager.getInstance(this.M).sendRequest(cansendmessage, new org.telegram.ui.b0(this, i32, v0Var3, x0Var, 6));
                        return;
                    }
                    try {
                        JSONObject jSONObject19 = new JSONObject();
                        jSONObject19.put("status", "cancelled");
                        y(x0Var, "write_access_requested", jSONObject19);
                        return;
                    } catch (Exception e44) {
                        f8.f(e44);
                        return;
                    }
                case zs.A0 /* 63 */:
                    this.c.s();
                    return;
                default:
                    f8.b("unknown webapp event ".concat(str));
                    return;
            }
        }
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            x("invoice_closed", jSONObject);
            f8.b("invoice_closed " + jSONObject);
            if (z10 || !Objects.equals(this.b0, str)) {
                return;
            }
            this.b0 = null;
        } catch (JSONException e) {
            f8.g(e, true);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P <= 10000 || !z11) {
            this.P = 0L;
            boolean[] zArr = {false};
            if (gf.f.e(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            gf.f.q(getContext(), uri, true, z10, false, null, str, false, true, z12);
        }
    }

    public abstract void J(v0 v0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.o0) {
            x("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.s0++;
        }
        v0 v0Var = this.a;
        if (v0Var != null) {
            v0Var.f(null, null);
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

    public final void N(int i10, v0 v0Var, Object obj, String str, boolean z10) {
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.o0;
        if (z11) {
            this.s0++;
            this.t0 = z10;
            this.G0 = z10 ? k(str) : null;
        }
        W(v0Var, obj);
        if (z11) {
            x("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i10, boolean z10) {
        JSONObject jSONObject;
        if (z10 || i10 != this.I0) {
            Float valueOf = Float.valueOf(i10 / org.telegram.messenger.i0.p);
            try {
                jSONObject = new JSONObject();
                jSONObject.put("left", (Object) 0);
                jSONObject.put("top", valueOf);
                jSONObject.put("right", (Object) 0);
                jSONObject.put("bottom", (Object) 0);
            } catch (Exception unused) {
                jSONObject = null;
            }
            x("content_safe_area_changed", jSONObject);
            this.I0 = i10;
        }
    }

    public final void P(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.H0;
            if (z10 || !rect2.equals(rect)) {
                Float valueOf = Float.valueOf(rect.left / org.telegram.messenger.i0.p);
                Float valueOf2 = Float.valueOf(rect.top / org.telegram.messenger.i0.p);
                Float valueOf3 = Float.valueOf(rect.right / org.telegram.messenger.i0.p);
                Float valueOf4 = Float.valueOf(rect.bottom / org.telegram.messenger.i0.p);
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("left", valueOf);
                    jSONObject.put("top", valueOf2);
                    jSONObject.put("right", valueOf3);
                    jSONObject.put("bottom", valueOf4);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                x("safe_area_changed", jSONObject);
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
            f8.g(e, true);
        }
    }

    public final void R(x0 x0Var, xh.g1 g1Var, String str) {
        if (g1Var == null || this.U == null) {
            return;
        }
        boolean z10 = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    y(x0Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = g1Var.h(optString);
                    if (h.isEmpty()) {
                        y(x0Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    v vVar = new v(this, x0Var, string, g1Var, optString);
                    k2 T = LaunchActivity.T();
                    p6 resourceProvider = T != null ? T.getResourceProvider() : null;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    z2 k10 = m5.k(1, context, resourceProvider, false);
                    LinearLayout f7 = m5.f(context, 1);
                    g9 g9Var = new g9(context);
                    TLRPC.User Z1 = vp.r1(g1Var.a).Z1(Long.valueOf(g1Var.b));
                    r8 r8Var = new r8((p6) null);
                    r8Var.r(Z1);
                    g9Var.e(Z1, r8Var);
                    f7.addView(g9Var, b6.t(80, 80, 49, 0, 21, 0, 13));
                    int i10 = t6.G6;
                    Context context2 = context;
                    TextView b10 = g6.b(context2, 20.0f, i10, true, null);
                    b10.setText(cd.L0(2131752990, null));
                    b10.setGravity(17);
                    f7.addView(b10, b6.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = g6.b(context2, 14.0f, i10, false, null);
                    m5.q(null, null, 2131752991, new Object[]{o5.H(null, null, Z1)}, b11);
                    b11.setGravity(17);
                    f7.addView(b11, b6.t(-1, -2, 7, 32, 0, 32, 19));
                    b9 b9Var = new b9(context2, resourceProvider);
                    ColorDrawable colorDrawable = new ColorDrawable(-1);
                    b9Var.setBackground(new eq(colorDrawable, t6.X0(context2, R.drawable.greydivider, t6.w0(t6.b7, resourceProvider))));
                    a7.y(b9Var, colorDrawable, t6.a7, resourceProvider, PorterDuff.Mode.SRC_IN);
                    b9Var.setFixedSize(12);
                    f7.addView(b9Var, b6.t(-1, 12, 7, 0, 0, 0, 0));
                    p4 p4Var = new p4(context2, resourceProvider);
                    p4Var.setText(cd.L0(2131752992, null));
                    f7.addView(p4Var, b6.t(-1, -2, 7, 0, 0, 0, 0));
                    vh.d dVar = new vh.d(context2, resourceProvider, true);
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    while (i11 < h.size()) {
                        xh.f1 f1Var = (xh.f1) h.get(i11);
                        boolean z11 = z10;
                        xh.e1 e1Var = new xh.e1(f1Var, i11 < h.size() + (-1) ? z11 : false, context2);
                        int i12 = t6.i6;
                        v vVar2 = vVar;
                        org.telegram.ui.Cells.y h02 = t6.h0(t6.w0(i12, resourceProvider), 2, -1);
                        w6 N = a7.N(i12);
                        e1Var.setBackground(h02);
                        a7.k(e1Var, h02, null, N, resourceProvider);
                        LinearLayout linearLayout = f7;
                        e1Var.setOnClickListener(new org.telegram.messenger.video.h(strArr, f1Var, arrayList, dVar, 15));
                        linearLayout.addView(e1Var, b6.o(-1, 56));
                        arrayList.add(e1Var);
                        i11++;
                        context2 = context2;
                        f7 = linearLayout;
                        z10 = z11;
                        vVar = vVar2;
                        zArr = zArr;
                    }
                    v vVar3 = vVar;
                    boolean[] zArr2 = zArr;
                    boolean z12 = z10;
                    LinearLayout linearLayout2 = f7;
                    int i13 = 17;
                    dVar.i(cd.L0(2131752994, null), false, z12);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, b6.t(-1, 48, 7, 8, 8, 8, 4));
                    k10.N = linearLayout2;
                    k10.Q(t6.h5);
                    dVar.setOnClickListener(new org.telegram.messenger.video.h(zArr2, vVar3, strArr, k10, 16));
                    k10.setOnDismissListener(new mg.g(i13, zArr2, vVar3));
                    k10.show();
                } catch (Exception e) {
                    y(x0Var, "secure_storage_failed", B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
                y(x0Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(x0Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void T(String str, boolean z10) {
        v0 v0Var = this.a;
        if (v0Var != null) {
            boolean z11 = v0Var.E;
        }
        boolean z12 = v0Var == null || !v0Var.canGoBack();
        v0 v0Var2 = this.a;
        I(z12, v0Var2 == null || !v0Var2.canGoForward());
        v0 v0Var3 = this.a;
        if (v0Var3 != null) {
            v0Var3.b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        ag.d2 d2Var = this.s;
        if (!z10 || v0Var3 == null || d2Var == null) {
            if (v0Var3 != null) {
                v0Var3.setAlpha(1.0f);
            }
            if (d2Var != null) {
                d2Var.setAlpha(0.0f);
                d2Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<v0, Float>) property, 1.0f), ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, 0.0f));
            animatorSet.addListener(new ns0(this, 24));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.c.getClass();
    }

    public final void U(x0 x0Var, xh.g1 g1Var, String str, String str2, String str3) {
        if (g1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        g1Var.n(optString, jSONObject.optString("value"));
                        y(x0Var, str2, A(string, "req_id"));
                    } catch (RuntimeException e) {
                        y(x0Var, str3, B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    y(x0Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(x0Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void V() {
        v0 v0Var = this.a;
        if (v0Var == null || !this.o0) {
            return;
        }
        v0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!a.a.a("WEB_MESSAGE_LISTENER")) {
            g("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        v0 v0Var2 = this.a;
        if (!v0Var2.R) {
            a5.c.a(v0Var2, "TelegramWebviewProxyMessage", singleton, new mg.l(v0Var2, 16));
            this.a.R = true;
        }
        if (a.a.a("DOCUMENT_START_SCRIPT")) {
            v0 v0Var3 = this.a;
            if (v0Var3.S == null) {
                boolean z10 = a5.c.a;
                if (!b5.m.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                b5.o c10 = a5.c.c(v0Var3);
                v0Var3.S = new a4.l((ScriptHandlerBoundaryInterface) me.b.b(ScriptHandlerBoundaryInterface.class, c10.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 4);
            }
        }
    }

    public final void W(v0 v0Var, Object obj) {
        v0 v0Var2;
        TLRPC.User user;
        String str = "";
        v0 v0Var3 = this.a;
        if (v0Var3 != null) {
            v0Var3.destroy();
            removeView(this.a);
        }
        if (v0Var != null) {
            org.telegram.messenger.i0.E2(v0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(tz.J0 && !r());
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (v0Var == null) {
            Context context = getContext();
            boolean z10 = this.o0;
            long j10 = 0;
            if (z10 && (user = this.U) != null) {
                j10 = user.id;
            }
            v0Var2 = new v0(context, z10, j10);
        } else {
            v0Var2 = v0Var;
        }
        this.a = v0Var2;
        if (this.o0) {
            v0Var2.setBackgroundColor(j(t6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.v0;
        }
        if (!vp.r1(this.M).H6) {
            this.a.setLayerType(2, null);
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.D0);
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
                PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
                int o10 = tz.o();
                String str3 = o10 == 0 ? "LOW" : o10 == 1 ? "AVERAGE" : "HIGH";
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
            f8.g(e7, true);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(org.telegram.messenger.w0.h(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (v0Var == null && this.o0) {
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
                v0 v0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(v0Var4, this);
                this.u0 = botWebViewContainer$WebViewProxy2;
                v0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (v0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.u0.a = this;
        }
        J(this.a);
        Q0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.x1 x1Var, Runnable runnable) {
        if (x1Var == null || m(i10)) {
            return;
        }
        x1Var.setOnDismissListener(new mg.g(12, this, runnable));
        this.c0 = x1Var;
        x1Var.j0 = false;
        x1Var.show();
        if (this.L0 != i10) {
            this.L0 = i10;
            this.M0 = 0;
            this.N0 = 0L;
        }
        this.M0++;
    }

    public final void Y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cd.L0(2131743904, "UnknownError"));
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
            f8.g(th2, true);
            this.s.setVisibility(8);
            this.h = true;
            this.f.setVisibility(0);
            v0 v0Var = this.a;
            if (v0Var != null) {
                removeView(v0Var);
            }
        }
    }

    public final void d(x0 x0Var, xh.g1 g1Var, String str, String str2, String str3) {
        if (g1Var == null || this.U == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                g1Var.m(new JSONObject());
                y(x0Var, str2, A(string, "req_id"));
            } catch (RuntimeException e) {
                y(x0Var, str3, B("req_id", string, "error", e.getMessage()));
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(x0Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u41 u41Var;
        Uri[] uriArr;
        if (i10 == zs.n4) {
            v0 v0Var = this.a;
            if (v0Var != null) {
                v0Var.setBackgroundColor(j(t6.d6));
            }
            if (!this.q0) {
                int i12 = t6.yj;
                int j10 = j(i12);
                this.p0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                ag.d2 d2Var = this.s;
                d2Var.setColorFilter(porterDuffColorFilter);
                c00 c00Var = this.r;
                if (c00Var != null) {
                    c00Var.n = Integer.valueOf(this.p0);
                    this.r.f(i12, this.e, 1.0f, false);
                }
                d2Var.invalidate();
            }
            z();
            return;
        }
        if (i10 != zs.c5) {
            if (i10 == zs.d5) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (u41Var = this.V) == null) {
                    return;
                }
                u41Var.run();
                this.V = null;
                return;
            }
            return;
        }
        int intValue2 = ((Integer) objArr[0]).intValue();
        int intValue3 = ((Integer) objArr[1]).intValue();
        Intent intent = (Intent) objArr[2];
        if (intValue2 != 3000 || this.y == null) {
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
            this.y.onReceiveValue(uriArr);
            this.y = null;
        }
        uriArr = null;
        this.y.onReceiveValue(uriArr);
        this.y = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.s) {
            if (this.w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (this.w) {
                canvas.restore();
            }
            if (!this.w) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        }
        if (view == this.f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        }
        if (view == this.a) {
            if (org.telegram.messenger.i0.m0) {
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
        xh.n nVar = this.j0;
        if (nVar == null) {
            this.j0 = xh.n.c(getContext(), this.M, this.U.id);
        } else {
            nVar.h();
        }
    }

    public final x0 f() {
        v0 v0Var = this.a;
        long j10 = this.s0;
        boolean z10 = this.t0;
        String str = this.G0;
        x0 x0Var = new x0();
        x0Var.c = this;
        x0Var.d = v0Var;
        x0Var.a = j10;
        x0Var.b = z10;
        x0Var.e = str;
        return x0Var;
    }

    public final void g(String str) {
        f8.b("[webviewcontainer] #" + this.O0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.r0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof xh.h3)) {
            return 0;
        }
        xh.h3 h3Var = (xh.h3) getParent();
        if (h3Var.J) {
            return (int) ((h3Var.getMeasuredHeight() - h3Var.getOffsetY()) + this.z0);
        }
        return 0;
    }

    public String getOriginHost() {
        v0 v0Var = this.a;
        if (v0Var == null) {
            return null;
        }
        return k(v0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.u0;
    }

    public String getTrustedOrigin() {
        return this.G0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public v0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        v0 v0Var = this.a;
        if (v0Var != null) {
            if (v0Var.getParent() != null) {
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
            xh.o0 o0Var = this.k0;
            if (o0Var != null) {
                o0Var.f.remove(this.K0);
                this.k0 = null;
                this.J0 = null;
            }
        }
    }

    public final void i(String str) {
        new cc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        p6 p6Var = this.e;
        return p6Var != null ? p6Var.h(i10) : t6.x0(null, i10, false);
    }

    public final void l(x0 x0Var, xh.g1 g1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (g1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f7 = g1Var.f(optString);
                    if (!g1Var.d || (obj = f7.first) != null) {
                        y(x0Var, str2, B("req_id", string, "value", f7.first));
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
                    y(x0Var, str2, jSONObject);
                } catch (RuntimeException e) {
                    y(x0Var, str3, B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused2) {
                y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            y(x0Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean m(int i10) {
        if (this.c0 != null || (this.N0 > 0 && System.currentTimeMillis() < this.N0)) {
            return true;
        }
        if (this.L0 != i10 || this.M0 <= 3) {
            return false;
        }
        this.N0 = System.currentTimeMillis() + 3000;
        this.M0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.N || z11) && (z12 = this.o0) && (getParent() instanceof xh.h3)) {
            xh.h3 h3Var = (xh.h3) getParent();
            if (z10) {
                this.O = h3Var.getSwipeOffsetY() == h3Var.getTopActionBarOffsetY() + (-h3Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (h3Var.getTopActionBarOffsetY() + ((h3Var.getMeasuredHeight() - h3Var.getOffsetY()) - h3Var.getSwipeOffsetY()) + this.z0));
            if (!z11 && max == this.w0 && this.x0 == z10 && this.y0 == this.O) {
                return;
            }
            this.w0 = max;
            this.x0 = z10;
            this.y0 = this.O;
            String str = "{height:" + (max / org.telegram.messenger.i0.p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
            if (!z12 || q()) {
                zs.f(this.M).d(new z(this, a1.g.n("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
            } else {
                g("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    public final boolean o(x0 x0Var) {
        boolean z10;
        if (x0Var == null) {
            return false;
        }
        String str = (String) x0Var.e;
        if (((z0) x0Var.c) != this || ((v0) x0Var.d) != this.a || x0Var.a != this.s0 || (z10 = x0Var.b) != this.t0) {
            return false;
        }
        if (z10) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.G0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        zs.e().c(this, zs.n4);
        zs.e().c(this, zs.c5);
        zs.e().c(this, zs.d5);
        setTag(R.id.bulletin_delegate_tag, new k7(this, 5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        zs.e().n(this, zs.n4);
        zs.e().n(this, zs.c5);
        zs.e().n(this, zs.d5);
        setTag(R.id.bulletin_delegate_tag, null);
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
            return !TextUtils.isEmpty(this.G0) && TextUtils.equals(this.G0, getOriginHost());
        }
        return true;
    }

    public final boolean r() {
        return this.P0 != null;
    }

    public final void s(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
        TLRPC.UserFull a2 = vp.r1(i10).a2(j10);
        String n10 = h20.n(Z1);
        ag.d2 d2Var = this.s;
        if (n10 != null && n10.equals("DurgerKingBot")) {
            d2Var.setVisibility(0);
            d2Var.setAlpha(1.0f);
            d2Var.h(null, null, d00.h(R.raw.durgerking_placeholder, Integer.valueOf(j(t6.a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i10).b.bots;
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
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = tL_attachMenuBot.icons;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList2.get(i12);
                i12++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals("placeholder_static")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ui.k0(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                d2Var.setVisibility(0);
                d2Var.setAlpha(1.0f);
                d2Var.j(ic.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        p6 p6Var = this.e;
        if (a2 != null && (botInfo = a2.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d2Var.setVisibility(0);
            d2Var.setAlpha(1.0f);
            c00 j11 = d00.j(512, 512, a2.bot_info.app_settings.placeholder_svg_path);
            this.r = j11;
            if (j11 != null) {
                j11.n = Integer.valueOf(this.p0);
                this.r.f(t6.yj, p6Var, 1.0f, false);
            }
            d2Var.h(null, null, this.r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        d2Var.setVisibility(0);
        d2Var.setAlpha(1.0f);
        c00 j12 = d00.j(512, 512, path);
        this.r = j12;
        if (j12 != null) {
            j12.n = Integer.valueOf(this.p0);
            this.r.f(t6.yj, p6Var, 1.0f, false);
        }
        d2Var.h(null, null, this.r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(d0 d0Var) {
        this.c = d0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10 = org.telegram.messenger.i0.B(i10) > 0.7f ? t6.b(0.0f, -0.15f, i10) : t6.b(0.025f, 0.15f, i10);
        if (this.p0 == b10) {
            return;
        }
        this.p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        ag.d2 d2Var = this.s;
        d2Var.setColorFilter(porterDuffColorFilter);
        c00 c00Var = this.r;
        if (c00Var != null) {
            c00Var.n = Integer.valueOf(this.p0);
            this.r.f(t6.yj, this.e, 1.0f, false);
        }
        this.q0 = true;
        d2Var.invalidate();
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
        this.D0 = runnable;
        v0 v0Var = this.a;
        if (v0Var != null) {
            v0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(n20 n20Var) {
        this.P0 = n20Var;
    }

    public void setOpener(v0 v0Var) {
        v0 v0Var2;
        this.v0 = v0Var;
        if (this.o0 || (v0Var2 = this.a) == null) {
            return;
        }
        v0Var2.f = v0Var;
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

    public void setWasOpenedByBot(s3 s3Var) {
        this.F0 = s3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.E0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.x = aVar;
    }

    public void setWebViewScrollListener(y0 y0Var) {
        this.d = y0Var;
        v0 v0Var = this.a;
        if (v0Var != null) {
            v0Var.f(this, y0Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        this.M = i10;
        if (this.o0) {
            this.s0++;
            this.t0 = z10;
            this.G0 = z10 ? k(str) : null;
            if (this.a != null) {
                V();
            }
        }
        zs.f(i10).d(new z(this, str, 1));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ag.d2 d2Var;
        int j10;
        try {
            if (this.a != null && (j10 = j(t6.d6)) != this.C0) {
                this.C0 = j10;
                this.a.setBackgroundColor(j10);
            }
            if (this.q0 || (d2Var = this.s) == null) {
                return;
            }
            int i10 = this.p0;
            int i11 = t6.yj;
            if (i10 != j(i11)) {
                int j11 = j(i11);
                this.p0 = j11;
                d2Var.setColorFilter(new PorterDuffColorFilter(j11, PorterDuff.Mode.SRC_IN));
                c00 c00Var = this.r;
                if (c00Var != null) {
                    c00Var.n = Integer.valueOf(this.p0);
                }
                d2Var.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void v(x0 x0Var) {
        if (this.U == null) {
            return;
        }
        e();
        xh.n nVar = this.j0;
        if (nVar == null) {
            return;
        }
        try {
            y(x0Var, "biometry_info_received", nVar.f());
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void x(String str, JSONObject jSONObject) {
        if (this.o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        zs.f(this.M).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void y(x0 x0Var, String str, JSONObject jSONObject) {
        if (o(x0Var)) {
            x(str, jSONObject);
            return;
        }
        g("notifyEvent " + str + " dropped after document change");
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = m2.u(this.e, true);
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (u10 != null) {
            jSONObject = new JSONObject().put("theme_params", u10);
            x("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        x("theme_changed", jSONObject);
    }

    public void H() {
    }

    public void K(v0 v0Var) {
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void D(boolean z10, String str) {
    }

    public void I(boolean z10, boolean z11) {
    }
}
