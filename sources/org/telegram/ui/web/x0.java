package org.telegram.ui.web;

import a8.n9;
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
import bi.eb;
import bi.f2;
import bi.g2;
import bi.u3;
import bi.v3;
import bi.w4;
import c8.ha;
import c8.qa;
import di.d4;
import di.j8;
import di.p7;
import hi.a3;
import hi.b4;
import hi.o4;
import hi.q4;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.ps;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.jo0;
import org.telegram.ui.mo0;
import org.telegram.ui.o9;
import org.telegram.ui.s9;
import org.telegram.ui.u81;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class x0 extends FrameLayout implements ls, c6 {
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
    public q4 F0;
    public String G;
    public String G0;
    public int H;
    public final Rect H0;
    public int I;
    public int I0;
    public String J;
    public p7 J0;
    public String K;
    public final p K0;
    public String L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public long N0;
    public boolean O;
    public final int O0;
    public long P;
    public z10 P0;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public r31 V;
    public Activity W;
    public u0 a;
    public boolean a0;
    public String b;
    public String b0;
    public d0 c;
    public org.telegram.ui.ActionBar.u1 c0;
    public w0 d;
    public int d0;
    public final h6 e;
    public long e0;
    public final TextView f;
    public long f0;
    public o9 g0;
    public boolean h;
    public boolean h0;
    public String i0;
    public hi.p j0;
    public hi.r0 k0;
    public hi.g0 l0;
    public hi.m1 m0;
    public final org.telegram.ui.Components.voip.n n;
    public hi.m1 n0;
    public final boolean o0;
    public int p0;
    public boolean q0;
    public rz r;
    public BotWebViewContainer$BotWebViewProxy r0;
    public final d4 s;
    public long s0;
    public boolean t0;
    public BotWebViewContainer$WebViewProxy u0;
    public u0 v0;
    public boolean w;
    public int w0;
    public q0.a x;
    public boolean x0;
    public ValueCallback y;
    public boolean y0;
    public float z0;

    public x0(int i7, Context context, h6 h6Var, boolean z9) {
        super(context);
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.n = nVar;
        int i10 = m6.Ci;
        this.D = j(i10);
        int i11 = m6.Gi;
        this.E = j(i11);
        this.F = "";
        this.H = j(i10);
        this.I = j(i11);
        this.J = "";
        this.K = "";
        this.M = p10.s0;
        this.A0 = -1;
        this.H0 = new Rect(0, 0, 0, 0);
        this.I0 = 0;
        this.K0 = new p(this, 2);
        this.L0 = -1;
        this.M0 = 0;
        int i12 = R0;
        R0 = i12 + 1;
        this.O0 = i12;
        this.o0 = z9;
        this.e = h6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        nVar.k = false;
        nVar.b(i7, qs.j2);
        d4 d4Var = new d4(this, context);
        this.s = d4Var;
        int j3 = j(m6.yj);
        this.p0 = j3;
        d4Var.setColorFilter(new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN));
        d4Var.getImageReceiver().R0 = true;
        addView(d4Var, ha.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(id.M0(2131752913, null));
        t6.U(textView, m6.y6, h6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, ha.e(-1, -2, 17));
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

    public static JSONObject C(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            jSONObject.put(str4, obj4);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse N(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(vf.c.w(Uri.parse(str2), "https", null, T(org.telegram.messenger.g0.K0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static String T(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < split.length; i7++) {
            if (i7 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i7].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(qp.s1(p10.s0).U5);
        return sb2.toString();
    }

    public static void a(x0 x0Var, String[] strArr, q0.a aVar) {
        x0Var.getClass();
        for (String str : strArr) {
            if (x0Var.getContext().checkSelfPermission(str) != 0) {
                x0Var.V = new r31(x0Var, aVar, strArr, 5);
                Activity activity = x0Var.W;
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
        String K0 = org.telegram.messenger.g0.K0(str, false);
        try {
            K0 = IDN.toASCII(K0, 1);
        } catch (Exception unused) {
        }
        String T = T(K0);
        if (S0 == null) {
            S0 = new HashMap();
        }
        S0.put(T, K0);
        return vf.c.w(Uri.parse(str), "https", null, T, null);
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

    private void setupFlickerParams(boolean z9) {
        this.w = z9;
        d4 d4Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        layoutParams.gravity = z9 ? 17 : 48;
        if (z9) {
            int L = org.telegram.messenger.g0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d4Var.requestLayout();
    }

    private void setupWebView(u0 u0Var) {
        X(u0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (S0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.g0.K0(str, false);
        if (K0 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(qp.s1(p10.s0).U5);
        return (K0.endsWith(sb2.toString()) && (str2 = (String) S0.get(K0)) != null) ? vf.c.w(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void w(int i7, u0 u0Var, p7 p7Var, String str, JSONObject jSONObject) {
        if (u0Var == null) {
            return;
        }
        qs.f(i7).d(new mo0(u0Var, p7Var, str, jSONObject, 20));
    }

    public final boolean D() {
        if (this.a == null || !this.R) {
            return false;
        }
        y("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x07c6, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:947:0x07c9, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x11e6  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x11f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final p7 p7Var, String str, String str2) {
        char c10;
        p2 p2Var;
        final int i7;
        int i10;
        int i11;
        o9 o9Var;
        final x0 x0Var;
        final x0 x0Var2;
        p7 p7Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j3;
        int i12;
        TLRPC.User user;
        JSONObject jSONObject;
        long j10;
        String str3;
        boolean z9;
        boolean z10;
        boolean z11;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject optJSONObject;
        boolean z12;
        LaunchActivity launchActivity;
        boolean z13;
        boolean z14;
        String g10;
        long j11;
        String str11;
        boolean z15;
        if (this.o0) {
            if (this.a == null || this.c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!o(p7Var)) {
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
            p pVar = this.K0;
            long j12 = 1000;
            h6 h6Var = this.e;
            p2 p2Var2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            d3 d3Var = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
            p2Var2 = null;
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
                        int i13 = this.M;
                        u0 u0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = qp.s1(i13).o1(this.U.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i13).sendRequest(invokewebviewcustommethod, new bg.k0(this, string, i13, u0Var, p7Var, 14));
                        return;
                    } catch (Exception e10) {
                        a8.f(e10);
                        if (e10 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Z(null);
                            return;
                        }
                    }
                case 1:
                    if (!this.h0 || (o9Var = this.g0) == null) {
                        return;
                    }
                    o9Var.dismiss();
                    return;
                case 2:
                    v(p7Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject3.optString("url"));
                        String optString = jSONObject3.optString("try_browser");
                        if (qp.s1(this.M).B4 == null || !qp.s1(this.M).B4.contains(parse.getScheme())) {
                            return;
                        }
                        H(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                        return;
                    } catch (Exception e11) {
                        a8.f(e11);
                        return;
                    }
                case 4:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    if (this.l0 == null) {
                        this.l0 = hi.g0.c(getContext(), this.M, this.U.id);
                    }
                    try {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        String string3 = jSONObject4.getString("url");
                        String string4 = jSONObject4.getString("file_name");
                        if (this.l0.d(string3) != null) {
                            this.l0.b(string3, string4);
                            x(p7Var, "file_download_requested", A("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = qp.s1(this.M).q1(this.U);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.M).sendRequest(checkdownloadfileparams, new g2(this, p7Var, string3, string4, 18));
                        return;
                    } catch (Exception e12) {
                        a8.f(e12);
                        x(p7Var, "file_download_requested", A("cancelled", "status"));
                        return;
                    }
                case 5:
                    x0Var = this;
                    try {
                        if (x0Var.c0 == null) {
                            if (System.currentTimeMillis() - x0Var.e0 <= 150) {
                                int i14 = x0Var.d0 + 1;
                                x0Var.d0 = i14;
                                if (i14 >= 3) {
                                    x0Var.d0 = 0;
                                    x0Var.f0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - x0Var.f0 > 3000) {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                String optString2 = jSONObject5.optString("title", null);
                                String string5 = jSONObject5.getString("message");
                                JSONArray jSONArray = jSONObject5.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x0Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                                    arrayList.add(new v0(jSONArray.getJSONObject(i15)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final v0 v0Var = (v0) arrayList.get(0);
                                            final int i16 = 0;
                                            alertDialog$Builder.k(v0Var.b, new org.telegram.ui.ActionBar.r1(x0Var) { // from class: org.telegram.ui.web.m
                                                public final /* synthetic */ x0 b;

                                                {
                                                    this.b = x0Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.r1
                                                public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i17) {
                                                    switch (i16) {
                                                        case 0:
                                                            x0 x0Var3 = this.b;
                                                            p7 p7Var3 = p7Var;
                                                            v0 v0Var2 = v0Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            u1Var.dismiss();
                                                            try {
                                                                x0Var3.P = System.currentTimeMillis();
                                                                x0Var3.x(p7Var3, "popup_closed", new JSONObject().put("button_id", v0Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                a8.g(e13, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            x0 x0Var4 = this.b;
                                                            p7 p7Var4 = p7Var;
                                                            v0 v0Var3 = v0Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            u1Var.dismiss();
                                                            try {
                                                                x0Var4.P = System.currentTimeMillis();
                                                                x0Var4.x(p7Var4, "popup_closed", new JSONObject().put("button_id", v0Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                a8.g(e14, true);
                                                                return;
                                                            }
                                                        default:
                                                            x0 x0Var5 = this.b;
                                                            p7 p7Var5 = p7Var;
                                                            v0 v0Var4 = v0Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            u1Var.dismiss();
                                                            try {
                                                                x0Var5.P = System.currentTimeMillis();
                                                                x0Var5.x(p7Var5, "popup_closed", new JSONObject().put("button_id", v0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e15) {
                                                                a8.g(e15, true);
                                                            }
                                                    }
                                                }
                                            });
                                        } catch (JSONException e13) {
                                            e = e13;
                                            a8.f(e);
                                            return;
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        final v0 v0Var2 = (v0) arrayList.get(1);
                                        final int i17 = 1;
                                        alertDialog$Builder.h(v0Var2.b, new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.m
                                            public final /* synthetic */ x0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i172) {
                                                switch (i17) {
                                                    case 0:
                                                        x0 x0Var3 = this.b;
                                                        p7 p7Var3 = p7Var;
                                                        v0 v0Var22 = v0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        u1Var.dismiss();
                                                        try {
                                                            x0Var3.P = System.currentTimeMillis();
                                                            x0Var3.x(p7Var3, "popup_closed", new JSONObject().put("button_id", v0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        x0 x0Var4 = this.b;
                                                        p7 p7Var4 = p7Var;
                                                        v0 v0Var3 = v0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        u1Var.dismiss();
                                                        try {
                                                            x0Var4.P = System.currentTimeMillis();
                                                            x0Var4.x(p7Var4, "popup_closed", new JSONObject().put("button_id", v0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            a8.g(e14, true);
                                                            return;
                                                        }
                                                    default:
                                                        x0 x0Var5 = this.b;
                                                        p7 p7Var5 = p7Var;
                                                        v0 v0Var4 = v0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        u1Var.dismiss();
                                                        try {
                                                            x0Var5.P = System.currentTimeMillis();
                                                            x0Var5.x(p7Var5, "popup_closed", new JSONObject().put("button_id", v0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e15) {
                                                            a8.g(e15, true);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final v0 v0Var3 = (v0) arrayList.get(2);
                                        String str15 = v0Var3.b;
                                        final int i18 = 2;
                                        x0Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.r1 r1Var = new org.telegram.ui.ActionBar.r1(x0Var2) { // from class: org.telegram.ui.web.m
                                                public final /* synthetic */ x0 b;

                                                {
                                                    this.b = x0Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.r1
                                                public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i172) {
                                                    switch (i18) {
                                                        case 0:
                                                            x0 x0Var3 = this.b;
                                                            p7 p7Var3 = p7Var;
                                                            v0 v0Var22 = v0Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            u1Var.dismiss();
                                                            try {
                                                                x0Var3.P = System.currentTimeMillis();
                                                                x0Var3.x(p7Var3, "popup_closed", new JSONObject().put("button_id", v0Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e132) {
                                                                a8.g(e132, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            x0 x0Var4 = this.b;
                                                            p7 p7Var4 = p7Var;
                                                            v0 v0Var32 = v0Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            u1Var.dismiss();
                                                            try {
                                                                x0Var4.P = System.currentTimeMillis();
                                                                x0Var4.x(p7Var4, "popup_closed", new JSONObject().put("button_id", v0Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                a8.g(e14, true);
                                                                return;
                                                            }
                                                        default:
                                                            x0 x0Var5 = this.b;
                                                            p7 p7Var5 = p7Var;
                                                            v0 v0Var4 = v0Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            u1Var.dismiss();
                                                            try {
                                                                x0Var5.P = System.currentTimeMillis();
                                                                x0Var5.x(p7Var5, "popup_closed", new JSONObject().put("button_id", v0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e15) {
                                                                a8.g(e15, true);
                                                            }
                                                    }
                                                }
                                            };
                                            p7Var2 = p7Var;
                                            alertDialog$Builder.i(str15, r1Var);
                                        } catch (JSONException e14) {
                                            e = e14;
                                            a8.f(e);
                                            return;
                                        }
                                    } else {
                                        x0Var2 = this;
                                        p7Var2 = p7Var;
                                    }
                                    alertDialog$Builder.j(new hi.o0(x0Var2, atomicBoolean, p7Var2, 4));
                                    x0Var2.c0 = alertDialog$Builder.p();
                                    if (arrayList.size() >= 1) {
                                        v0 v0Var4 = (v0) arrayList.get(0);
                                        if (v0Var4.c >= 0 && (textView3 = (TextView) x0Var2.c0.d(-1)) != null) {
                                            textView3.setTextColor(x0Var2.j(v0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        v0 v0Var5 = (v0) arrayList.get(1);
                                        if (v0Var5.c >= 0 && (textView2 = (TextView) x0Var2.c0.d(-2)) != null) {
                                            textView2.setTextColor(x0Var2.j(v0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        v0 v0Var6 = (v0) arrayList.get(2);
                                        if (v0Var6.c < 0 || (textView = (TextView) x0Var2.c0.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(x0Var2.j(v0Var6.c));
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
                    } catch (JSONException e15) {
                        e = e15;
                    }
                    break;
                case 6:
                    x0Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (x0Var.b0 != null) {
                            x0Var.G(optString3, "cancelled", true);
                            return;
                        }
                        x0Var.b0 = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(x0Var.M).sendRequest(tL_payments_getPaymentForm, new f2(x0Var, optString3, tL_inputInvoiceSlug, 19));
                        return;
                    } catch (JSONException e16) {
                        a8.f(e16);
                        break;
                    }
                case 7:
                    x0Var = this;
                    if (x0Var.U != null && System.currentTimeMillis() - x0Var.P <= 10000) {
                        try {
                            jSONObject = new JSONObject(str2);
                            j3 = Long.parseLong(jSONObject.getString("custom_emoji_id"));
                        } catch (Exception unused) {
                            j3 = 0;
                        }
                        try {
                            i12 = jSONObject.getInt("duration");
                        } catch (Exception unused2) {
                            i12 = 0;
                            user = x0Var.U;
                            if (user != null) {
                            }
                        }
                        user = x0Var.U;
                        if (user != null) {
                            x0Var.x(p7Var, "emoji_status_failed", A("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            o4.f(x0Var.M, user, j3, i12, new n(x0Var, p7Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    x0Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", x0Var.J).trim();
                        boolean z16 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : x0Var.H;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : x0Var.I;
                        boolean z17 = jSONObject6.optBoolean("is_progress_visible", false) && z16;
                        boolean z18 = jSONObject6.optBoolean("has_shine_effect", false) && z16;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : x0Var.K;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j10 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j10 = 0;
                        }
                        x0Var.H = parseColor;
                        x0Var.I = parseColor2;
                        x0Var.J = trim;
                        x0Var.K = optString4;
                        x0Var.L = str2;
                        x0Var.c.l(z16, optBoolean, trim, j10, parseColor, parseColor2, z17, z18, optString4);
                        break;
                    } catch (Exception e17) {
                        a8.f(e17);
                        break;
                    }
                    break;
                case '\t':
                    x0Var = this;
                    try {
                        x0Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e18) {
                        a8.f(e18);
                        break;
                    }
                case '\n':
                    x0Var = this;
                    try {
                        if (!x0Var.h0 && x0Var.W != null) {
                            x0Var.i0 = new JSONObject(str2).optString("text");
                            x0Var.h0 = true;
                            if (x0Var.W.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = x0Var.W;
                                if (activity != null) {
                                    x0Var.g0 = s9.j0(activity, 3, new org.telegram.ui.Components.m(x0Var));
                                    return;
                                }
                                break;
                            } else {
                                qs.e().a(new ps(x0Var, p7Var, 2));
                                x0Var.W.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                return;
                            }
                        }
                    } catch (JSONException e19) {
                        a8.f(e19);
                        break;
                    }
                    break;
                case 11:
                    if (m(4)) {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            x(p7Var, "phone_requested", jSONObject7);
                            return;
                        } catch (Exception e20) {
                            a8.f(e20);
                            return;
                        }
                    }
                    final int i19 = this.M;
                    final u0 u0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), h6Var);
                    alertDialog$Builder2.l(id.L0(2131745420));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String p10 = t10.p(this.U);
                    if (TextUtils.isEmpty(p10)) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.L0(2131754069)));
                    } else {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.Z(2131754066, p10)));
                    }
                    final boolean z19 = qp.s1(this.M).G0.indexOfKey(this.U.id) >= 0;
                    if (z19) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) id.L0(2131754068));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(id.L0(2131745461), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.web.t
                        @Override // org.telegram.ui.ActionBar.r1
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i20) {
                            strArr[0] = null;
                            u1Var.dismiss();
                            x0 x0Var3 = x0.this;
                            boolean z20 = z19;
                            int i21 = i19;
                            u0 u0Var3 = u0Var2;
                            p7 p7Var3 = p7Var;
                            if (z20) {
                                qp.s1(x0Var3.M).f5(new pp0(x0Var3, i21, u0Var3, p7Var3, 20), x0Var3.U.id);
                                return;
                            }
                            gz.C(x0Var3.M).r0(ez.g(p10.i(x0Var3.M).f(), x0Var3.U.id, null, null, null, null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                x0.w(i21, u0Var3, p7Var3, "phone_requested", jSONObject8);
                            } catch (Exception e21) {
                                a8.g(e21, true);
                            }
                        }
                    });
                    alertDialog$Builder2.h(id.L0(2131752589), new jo0(16));
                    Y(4, alertDialog$Builder2.a(), new u(strArr, i19, u0Var2, p7Var, 0));
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
                        int i20 = this.M;
                        this.n0 = new hi.m1(i20, p10.i(i20).e(), this.U.id, true);
                    }
                    l(p7Var, this.n0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.k0 == null) {
                        hi.r0 e21 = hi.r0.e(getContext(), this.M, this.U.id);
                        this.k0 = e21;
                        e21.f.add(pVar);
                    }
                    this.J0 = p7Var;
                    pVar.run();
                    return;
                case 15:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T == null || T.getParentLayout() == null) {
                        return;
                    }
                    r4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(this.U.id));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionBiometry");
                    d0 d0Var = this.c;
                    if (d0Var != null) {
                        d0Var.b();
                        return;
                    }
                    return;
                case 16:
                    n(!((getParent() instanceof b4) && ((b4) getParent()).d()), true);
                    return;
                case 17:
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    o4.a(this.M, this.U.id, new n(this, p7Var, 0));
                    return;
                case 18:
                    hi.v0 A = this.c.A();
                    if (A == null || !A.h()) {
                        x(p7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i21 = this.M;
                        this.m0 = new hi.m1(i21, p10.i(i21).e(), this.U.id, false);
                    }
                    V(p7Var, this.m0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i22 = this.M;
                        this.m0 = new hi.m1(i22, p10.i(i22).e(), this.U.id, false);
                    }
                    l(p7Var, this.m0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    e();
                    hi.p pVar2 = this.j0;
                    if (pVar2 == null) {
                        return;
                    }
                    if (pVar2.e) {
                        pVar2.j(str3, true, null, new di.b0(2, pVar2, new n(this, p7Var, 3)));
                        return;
                    }
                    try {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("status", "failed");
                        x(p7Var, "biometry_auth_requested", jSONObject8);
                        return;
                    } catch (Exception e22) {
                        a8.f(e22);
                        return;
                    }
                case 22:
                    try {
                        z9 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z9 = false;
                    }
                    d0 d0Var2 = this.c;
                    if (d0Var2 != null) {
                        d0Var2.p(z9);
                        return;
                    }
                    return;
                case 23:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        z10 = jSONArray2.optBoolean(0, true);
                        try {
                            z11 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused6) {
                            z11 = true;
                            g("allowScroll " + z10 + " " + z11);
                            if (getParent() instanceof b4) {
                            }
                        }
                    } catch (Exception unused7) {
                        z10 = true;
                    }
                    g("allowScroll " + z10 + " " + z11);
                    if (getParent() instanceof b4) {
                        return;
                    }
                    ((b4) getParent()).a(z10, z11);
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
                    } catch (JSONException e23) {
                        a8.f(e23);
                        return;
                    }
                case 25:
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i23 = this.M;
                        this.n0 = new hi.m1(i23, p10.i(i23).e(), this.U.id, true);
                    }
                    S(p7Var, this.n0, str2);
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
                            } catch (Exception e24) {
                                e = e24;
                                str4 = null;
                            }
                        } catch (Exception e25) {
                            e = e25;
                            str4 = null;
                            str6 = null;
                        }
                    } catch (Exception e26) {
                        e = e26;
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
                        } catch (Exception e27) {
                            e = e27;
                            a8.f(e);
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
                        if (!qp.s1(this.M).W4()) {
                            new ug.w0((org.telegram.ui.ActionBar.f2) new w4(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this.W);
                        new HttpGetFileTask(new v(this, u1Var, str8, str10, str9), null).execute(str7);
                        u1Var.r(250L);
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
                        hi.r0 e28 = hi.r0.e(getContext(), this.M, this.U.id);
                        this.k0 = e28;
                        e28.f.add(pVar);
                    }
                    this.J0 = p7Var;
                    if (this.k0.g()) {
                        this.k0.j(new o(this, p7Var, 0));
                        return;
                    } else {
                        this.k0.i(new n(this, p7Var, 1));
                        return;
                    }
                case 28:
                    hi.v0 A2 = this.c.A();
                    try {
                        j12 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long k10 = Utilities.k(j12, 1000L, 20L);
                    if (A2 == null || !A2.d(k10)) {
                        x(p7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "gyroscope_started", null);
                        return;
                    }
                case 29:
                    try {
                        z12 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e29) {
                        a8.f(e29);
                        z12 = false;
                    }
                    this.c.z();
                    if (z12) {
                        if (this.E0 && LaunchActivity.G1 != null) {
                            Activity W = org.telegram.messenger.g0.W(getContext());
                            if (W == null) {
                                W = LaunchActivity.G1;
                            }
                            if (W == null || W.isFinishing()) {
                                return;
                            }
                            W.moveTaskToBack(true);
                            return;
                        }
                        if (this.F0 == null || (launchActivity = LaunchActivity.G1) == null || launchActivity.O() == null) {
                            return;
                        }
                        e3 O = LaunchActivity.G1.O();
                        ArrayList<d3> tabs = O.getTabs();
                        int i24 = 0;
                        while (true) {
                            if (i24 < tabs.size()) {
                                d3 d3Var2 = tabs.get(i24);
                                if (!this.F0.equals(d3Var2.a) || d3Var2.b == this.a) {
                                    i24++;
                                } else {
                                    d3Var = d3Var2;
                                }
                            }
                        }
                        if (d3Var != null) {
                            O.e(d3Var);
                            return;
                        }
                        return;
                    }
                    return;
                case qs.T /* 30 */:
                    U(this.a.getUrl(), true);
                    return;
                case qs.U /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.P <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            x(p7Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            return;
                        }
                        x(p7Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                        return;
                    } catch (JSONException e30) {
                        a8.f(e30);
                        return;
                    }
                case ' ':
                    Activity W2 = org.telegram.messenger.g0.W(getContext());
                    if (W2 == null) {
                        W2 = LaunchActivity.G1;
                    }
                    if (W2 != null) {
                        org.telegram.messenger.g0.v1(W2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    hi.v0 A3 = this.c.A();
                    if (A3 == null || !A3.g()) {
                        x(p7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i25 = this.M;
                        this.n0 = new hi.m1(i25, p10.i(i25).e(), this.U.id, true);
                    }
                    d(p7Var, this.n0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.U == null) {
                        return;
                    }
                    if (this.m0 == null) {
                        getContext();
                        int i26 = this.M;
                        this.m0 = new hi.m1(i26, p10.i(i26).e(), this.U.id, false);
                    }
                    d(p7Var, this.m0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    hi.v0 A4 = this.c.A();
                    try {
                        j12 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long k11 = Utilities.k(j12, 1000L, 20L);
                    if (A4 == null || !A4.c(k11)) {
                        x(p7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    hi.v0 A5 = this.c.A();
                    if (A5 == null || !A5.f()) {
                        x(p7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            x(p7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            hi.i1.e1(getContext(), this.M, this.U.id, string7, this.e, new p(this, 0), new bi.t0(this, p7Var, botWebViewContainer$BotWebViewProxy, 6));
                            return;
                        }
                    } catch (Exception e31) {
                        a8.f(e31);
                        x(p7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                        return;
                    }
                case '\'':
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        return;
                    } catch (JSONException e32) {
                        a8.f(e32);
                        return;
                    }
                case '(':
                    P(this.I0, true);
                    return;
                case ')':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    ui.b0(this.M);
                    long j13 = this.U.id;
                    int i27 = ui.c2;
                    if (ui.z0(i27, j13)) {
                        x(p7Var, "home_screen_added", null);
                        return;
                    } else {
                        ui.b0(this.M).y0(this.U.id, i27, new o(this, p7Var, 2));
                        return;
                    }
                case '*':
                    try {
                        z13 = true;
                        try {
                            z14 = new JSONObject(str2).optBoolean("blur", true);
                        } catch (Exception unused10) {
                            z14 = z13;
                            g10 = this.c.g(z13, z14);
                            if (g10 != null) {
                            }
                        }
                    } catch (Exception unused11) {
                        z13 = true;
                    }
                    g10 = this.c.g(z13, z14);
                    if (g10 != null) {
                        x(p7Var, "fullscreen_changed", B("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z14)));
                        return;
                    } else {
                        x(p7Var, "fullscreen_failed", A(g10, "error"));
                        return;
                    }
                case '+':
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i28 = 0; i28 < jSONArray3.length(); i28++) {
                            arrayList2.add(jSONArray3.getString(i28));
                        }
                        this.c.v(this.U, jSONObject11.getString("query"), arrayList2);
                        return;
                    } catch (JSONException e33) {
                        a8.f(e33);
                        return;
                    }
                case ',':
                    if (this.U == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i29 = this.M;
                        this.n0 = new hi.m1(i29, p10.i(i29).e(), this.U.id, true);
                    }
                    V(p7Var, this.n0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case '-':
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        x(p7Var, "fullscreen_changed", A(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        x(p7Var, "fullscreen_failed", A(g11, "error"));
                        return;
                    }
                case '.':
                    if (this.P0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z20 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.web.q
                                @Override // java.lang.Runnable
                                public final void run() {
                                    x0.this.P0.a(Boolean.valueOf(z20), Double.valueOf(d), optString6, Double.valueOf(optDouble));
                                }
                            });
                            return;
                        } catch (Exception e34) {
                            a8.f(e34);
                            return;
                        }
                    }
                    return;
                case '/':
                    if (this.U == null || System.currentTimeMillis() - this.P > 10000) {
                        return;
                    }
                    this.P = 0L;
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 == null || T2.getParentLayout() == null) {
                        return;
                    }
                    r4 parentLayout2 = T2.getParentLayout();
                    T2.presentFragment(ProfileActivity.D4(this.U.id));
                    org.telegram.messenger.g0.k3(parentLayout2, "botPermissionLocation");
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
                    } catch (JSONException e35) {
                        a8.f(e35);
                        return;
                    }
                case '1':
                    try {
                        str12 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused12) {
                    }
                    e();
                    hi.p pVar3 = this.j0;
                    if (pVar3 == null) {
                        return;
                    }
                    boolean z21 = pVar3.f;
                    if (z21) {
                        v(p7Var);
                        return;
                    }
                    if (pVar3.e) {
                        if (!z21) {
                            pVar3.f = true;
                            pVar3.k();
                        }
                        v(p7Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new s(0, this, p7Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), h6Var);
                    if (TextUtils.isEmpty(str12)) {
                        alertDialog$Builder3.l(id.L0(2131753141));
                        i7 = 0;
                        alertDialog$Builder3.g(org.telegram.messenger.g0.X2(id.Z(2131753142, t10.p(this.U))));
                    } else {
                        i7 = 0;
                        alertDialog$Builder3.l(org.telegram.messenger.g0.X2(id.Z(2131753142, t10.p(this.U))));
                        alertDialog$Builder3.g(str12);
                    }
                    alertDialog$Builder3.k(id.L0(2131754284), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.w
                        public final /* synthetic */ x0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.r1
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i30) {
                            switch (i7) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    x0 x0Var3 = this.b;
                                    hi.p pVar4 = x0Var3.j0;
                                    pVar4.f = true;
                                    pVar4.k();
                                    hi.p pVar5 = x0Var3.j0;
                                    n nVar = new n(x0Var3, p7Var, 2);
                                    pVar5.getClass();
                                    pVar5.j(null, true, null, new di.b0(2, pVar5, nVar));
                                    break;
                                default:
                                    x0 x0Var4 = this.b;
                                    x0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    hi.p pVar6 = x0Var4.j0;
                                    pVar6.f = true;
                                    pVar6.d = true;
                                    pVar6.k();
                                    x0Var4.v(p7Var);
                                    break;
                            }
                        }
                    });
                    final int i30 = 1;
                    alertDialog$Builder3.h(id.L0(2131752589), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.web.w
                        public final /* synthetic */ x0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.r1
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i302) {
                            switch (i30) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    x0 x0Var3 = this.b;
                                    hi.p pVar4 = x0Var3.j0;
                                    pVar4.f = true;
                                    pVar4.k();
                                    hi.p pVar5 = x0Var3.j0;
                                    n nVar = new n(x0Var3, p7Var, 2);
                                    pVar5.getClass();
                                    pVar5.j(null, true, null, new di.b0(2, pVar5, nVar));
                                    break;
                                default:
                                    x0 x0Var4 = this.b;
                                    x0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    hi.p pVar6 = x0Var4.j0;
                                    pVar6.f = true;
                                    pVar6.d = true;
                                    pVar6.k();
                                    x0Var4.v(p7Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new eb(runnableArr, 10));
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
                                    p2Var2 = p2.y;
                                    break;
                                }
                            } else if (hashCode == 595233003 && optString7.equals("notification")) {
                                String optString8 = jSONObject13.optString("notification_type");
                                int hashCode2 = optString8.hashCode();
                                if (hashCode2 != -1867169789) {
                                    if (hashCode2 != 96784904) {
                                        if (hashCode2 == 1124446108 && optString8.equals("warning")) {
                                            p2Var = p2.x;
                                            p2Var2 = p2Var;
                                            break;
                                        }
                                    } else if (optString8.equals("error")) {
                                        p2Var = p2.s;
                                        p2Var2 = p2Var;
                                    }
                                } else if (optString8.equals("success")) {
                                    p2Var = p2.w;
                                    p2Var2 = p2Var;
                                }
                            }
                            return;
                        }
                        if (optString7.equals("impact")) {
                            String optString9 = jSONObject13.optString("impact_style");
                            switch (optString9.hashCode()) {
                                case -1078030475:
                                    if (optString9.equals("medium")) {
                                        p2Var = p2.f;
                                        p2Var2 = p2Var;
                                        break;
                                    }
                                    break;
                                case 3535914:
                                    if (optString9.equals("soft")) {
                                        p2Var = p2.r;
                                        p2Var2 = p2Var;
                                        break;
                                    }
                                    break;
                                case 99152071:
                                    if (optString9.equals("heavy")) {
                                        p2Var = p2.h;
                                        p2Var2 = p2Var;
                                        break;
                                    }
                                    break;
                                case 102970646:
                                    if (optString9.equals("light")) {
                                        p2Var = p2.e;
                                        p2Var2 = p2Var;
                                        break;
                                    }
                                    break;
                                case 108511787:
                                    if (optString9.equals("rigid")) {
                                        p2Var = p2.n;
                                        p2Var2 = p2Var;
                                        break;
                                    }
                                    break;
                            }
                        }
                        return;
                    } catch (Exception e36) {
                        a8.f(e36);
                        return;
                    }
                case qs.o0 /* 51 */:
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.F).trim();
                        boolean z22 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.D;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.E;
                        boolean z23 = jSONObject14.optBoolean("is_progress_visible", false) && z22;
                        boolean z24 = jSONObject14.optBoolean("has_shine_effect", false) && z22;
                        try {
                            j11 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused13) {
                            j11 = 0;
                        }
                        this.D = parseColor3;
                        this.E = parseColor4;
                        this.F = trim2;
                        this.G = str2;
                        this.c.q(z22, optBoolean4, trim2, j11, parseColor3, parseColor4, z23, z24);
                        return;
                    } catch (Exception e37) {
                        a8.f(e37);
                        return;
                    }
                case qs.p0 /* 52 */:
                    try {
                        this.c.y(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        return;
                    } catch (JSONException e38) {
                        a8.f(e38);
                        return;
                    }
                case qs.q0 /* 53 */:
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.S) {
                            this.S = optBoolean5;
                            this.c.t(optBoolean5);
                            return;
                        }
                        return;
                    } catch (JSONException e39) {
                        a8.f(e39);
                        return;
                    }
                case qs.r0 /* 54 */:
                    if (this.U == null || Build.VERSION.SDK_INT < 26) {
                        str11 = "unsupported";
                    } else {
                        ui.b0(this.M);
                        str11 = ui.z0(ui.c2, this.U.id) ? "added" : "missed";
                    }
                    x(p7Var, "home_screen_checked", A(str11, "status"));
                    return;
                case qs.s0 /* 55 */:
                    try {
                        str13 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e40) {
                        a8.f(e40);
                    }
                    if (str13 == null) {
                        return;
                    }
                    TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                    getrequestedwebviewbutton.bot = qp.s1(this.M).q1(this.U);
                    getrequestedwebviewbutton.webapp_req_id = str13;
                    ConnectionsManager.getInstance(this.M).sendRequestTyped(getrequestedwebviewbutton, new d3.b(2), new r(this, p7Var, str13, 0));
                    return;
                case qs.t0 /* 56 */:
                    hi.v0 A6 = this.c.A();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j12 = jSONObject15.getLong("refresh_rate");
                        z15 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused14) {
                        z15 = false;
                    }
                    long k12 = Utilities.k(j12, 1000L, 20L);
                    if (A6 == null || !A6.e(k12, z15)) {
                        x(p7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "device_orientation_started", null);
                        return;
                    }
                case qs.u0 /* 57 */:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str14 = jSONObject16.getString("reason");
                        } catch (Exception unused15) {
                        }
                        e();
                        hi.p pVar4 = this.j0;
                        if (pVar4 == null) {
                            return;
                        }
                        if (pVar4.e) {
                            pVar4.l(str14, string8, new v3(this, string8, p7Var, 10));
                            return;
                        }
                        try {
                            JSONObject jSONObject17 = new JSONObject();
                            jSONObject17.put("status", "failed");
                            x(p7Var, "biometry_token_updated", jSONObject17);
                            return;
                        } catch (Exception e41) {
                            a8.f(e41);
                            return;
                        }
                    } catch (Exception e42) {
                        a8.f(e42);
                        if (e42 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Z(null);
                            return;
                        }
                    }
                case qs.v0 /* 58 */:
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        boolean isEmpty = TextUtils.isEmpty(optString10);
                        int w02 = isEmpty ? m6.w0(m6.a7, h6Var) : Color.parseColor(optString10);
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
                    } catch (Exception e43) {
                        a8.f(e43);
                        return;
                    }
                case qs.w0 /* 59 */:
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
                                i10 = m6.a7;
                                i11 = i10;
                            }
                            i11 = -1;
                        } else {
                            if (optString12.equals("bg_color")) {
                                i10 = m6.d6;
                                i11 = i10;
                            }
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            this.c.u(i11, m6.w0(i11, h6Var), false);
                            return;
                        }
                        return;
                    } catch (Exception e44) {
                        a8.f(e44);
                        return;
                    }
                case qs.x0 /* 60 */:
                    Q(this.H0, true);
                    return;
                case qs.y0 /* 61 */:
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        return;
                    } catch (Exception e45) {
                        a8.f(e45);
                        return;
                    }
                case qs.z0 /* 62 */:
                    if (!m(3)) {
                        int i31 = this.M;
                        u0 u0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = qp.s1(this.M).q1(this.U);
                        ConnectionsManager.getInstance(this.M).sendRequest(cansendmessage, new j8(this, i31, u0Var3, p7Var, 8));
                        return;
                    }
                    try {
                        JSONObject jSONObject19 = new JSONObject();
                        jSONObject19.put("status", "cancelled");
                        x(p7Var, "write_access_requested", jSONObject19);
                        return;
                    } catch (Exception e46) {
                        a8.f(e46);
                        return;
                    }
                case qs.A0 /* 63 */:
                    this.c.s();
                    return;
                default:
                    a8.b("unknown webapp event ".concat(str));
                    return;
            }
        }
    }

    public final void G(String str, String str2, boolean z9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            a8.b("invoice_closed " + jSONObject);
            if (z9 || !Objects.equals(this.b0, str)) {
                return;
            }
            this.b0 = null;
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    public final void H(Uri uri, String str, boolean z9, boolean z10, boolean z11) {
        if (System.currentTimeMillis() - this.P <= 10000 || !z10) {
            this.P = 0L;
            boolean[] zArr = {false};
            if (vf.c.g(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            vf.c.s(getContext(), uri, true, z9, false, null, str, false, true, z11, false);
        }
    }

    public abstract void K(u0 u0Var);

    public final void M() {
        g("preserveWebView");
        this.B0 = true;
        if (this.o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.s0++;
        }
        u0 u0Var = this.a;
        if (u0Var != null) {
            u0Var.f(null, null);
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

    public final void O(int i7, u0 u0Var, Object obj, String str, boolean z9) {
        this.M = i7;
        this.B0 = false;
        boolean z10 = this.o0;
        if (z10) {
            this.s0++;
            this.t0 = z9;
            this.G0 = z9 ? k(str) : null;
        }
        X(u0Var, obj);
        if (z10) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i7, boolean z9) {
        if (z9 || i7 != this.I0) {
            y("content_safe_area_changed", C("left", 0, "top", Float.valueOf(i7 / org.telegram.messenger.g0.p), "right", 0, "bottom", 0));
            this.I0 = i7;
        }
    }

    public final void Q(Rect rect, boolean z9) {
        if (rect != null) {
            Rect rect2 = this.H0;
            if (z9 || !rect2.equals(rect)) {
                y("safe_area_changed", C("left", Float.valueOf(rect.left / org.telegram.messenger.g0.p), "top", Float.valueOf(rect.top / org.telegram.messenger.g0.p), "right", Float.valueOf(rect.right / org.telegram.messenger.g0.p), "bottom", Float.valueOf(rect.bottom / org.telegram.messenger.g0.p)));
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.G != null) {
                F(this.r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(p7 p7Var, hi.m1 m1Var, String str) {
        if (m1Var == null || this.U == null) {
            return;
        }
        boolean z9 = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    x(p7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = m1Var.h(optString);
                    if (h.isEmpty()) {
                        x(p7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    v vVar = new v(this, p7Var, string, m1Var, optString);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    h6 resourceProvider = T != null ? T.getResourceProvider() : null;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    w2 l10 = k5.l(1, context, resourceProvider, false);
                    LinearLayout f10 = k5.f(context, 1);
                    k9 k9Var = new k9(context);
                    TLRPC.User a22 = qp.s1(m1Var.a).a2(Long.valueOf(m1Var.b));
                    v8 v8Var = new v8((h6) null);
                    v8Var.r(a22);
                    k9Var.e(a22, v8Var);
                    f10.addView(k9Var, ha.t(80, 80, 49, 0, 21, 0, 13));
                    int i7 = m6.G6;
                    Context context2 = context;
                    TextView b10 = qa.b(context2, 20.0f, i7, true, null);
                    b10.setText(id.M0(2131752990, null));
                    b10.setGravity(17);
                    f10.addView(b10, ha.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = qa.b(context2, 14.0f, i7, false, null);
                    k5.r(null, null, 2131752991, new Object[]{m5.H(null, null, a22)}, b11);
                    b11.setGravity(17);
                    f10.addView(b11, ha.t(-1, -2, 7, 32, 0, 32, 19));
                    z8 z8Var = new z8(context2, resourceProvider);
                    ColorDrawable colorDrawable = new ColorDrawable(-1);
                    z8Var.setBackground(new xp(colorDrawable, m6.X0(context2, R.drawable.greydivider, m6.w0(m6.b7, resourceProvider))));
                    t6.x(z8Var, colorDrawable, m6.a7, resourceProvider, PorterDuff.Mode.SRC_IN);
                    z8Var.setFixedSize(12);
                    f10.addView(z8Var, ha.t(-1, 12, 7, 0, 0, 0, 0));
                    n4 n4Var = new n4(context2, resourceProvider);
                    n4Var.setText(id.M0(2131752992, null));
                    f10.addView(n4Var, ha.t(-1, -2, 7, 0, 0, 0, 0));
                    fi.d dVar = new fi.d(context2, resourceProvider, true);
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < h.size()) {
                        hi.l1 l1Var = (hi.l1) h.get(i10);
                        boolean z10 = z9;
                        hi.k1 k1Var = new hi.k1(l1Var, i10 < h.size() + (-1) ? z10 : false, context2);
                        int i11 = m6.i6;
                        v vVar2 = vVar;
                        org.telegram.ui.Cells.y h02 = m6.h0(m6.w0(i11, resourceProvider), 2, -1);
                        p6 M = t6.M(i11);
                        k1Var.setBackground(h02);
                        t6.j(k1Var, h02, null, M, resourceProvider);
                        LinearLayout linearLayout = f10;
                        k1Var.setOnClickListener(new di.v3(strArr, l1Var, arrayList, dVar, 2));
                        linearLayout.addView(k1Var, ha.o(-1, 56));
                        arrayList.add(k1Var);
                        i10++;
                        context2 = context2;
                        f10 = linearLayout;
                        z9 = z10;
                        vVar = vVar2;
                        zArr = zArr;
                    }
                    v vVar3 = vVar;
                    boolean[] zArr2 = zArr;
                    LinearLayout linearLayout2 = f10;
                    dVar.i(id.M0(2131752994, null), false, z9);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, ha.t(-1, 48, 7, 8, 8, 8, 4));
                    l10.N = linearLayout2;
                    l10.P(m6.h5);
                    dVar.setOnClickListener(new di.v3(zArr2, vVar3, strArr, l10, 3));
                    l10.setOnDismissListener(new u3(3, zArr2, vVar3));
                    l10.show();
                } catch (Exception e10) {
                    x(p7Var, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception unused) {
                x(p7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(p7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void U(String str, boolean z9) {
        u0 u0Var = this.a;
        if (u0Var != null) {
            boolean z10 = u0Var.E;
        }
        boolean z11 = u0Var == null || !u0Var.canGoBack();
        u0 u0Var2 = this.a;
        J(z11, u0Var2 == null || !u0Var2.canGoForward());
        u0 u0Var3 = this.a;
        if (u0Var3 != null) {
            u0Var3.b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        d4 d4Var = this.s;
        if (!z9 || u0Var3 == null || d4Var == null) {
            if (u0Var3 != null) {
                u0Var3.setAlpha(1.0f);
            }
            if (d4Var != null) {
                d4Var.setAlpha(0.0f);
                d4Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<u0, Float>) property, 1.0f), ObjectAnimator.ofFloat(d4Var, (Property<d4, Float>) property, 0.0f));
            animatorSet.addListener(new u81(this, 13));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.c.getClass();
    }

    public final void V(p7 p7Var, hi.m1 m1Var, String str, String str2, String str3) {
        if (m1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        m1Var.n(optString, jSONObject.optString("value"));
                        x(p7Var, str2, A(string, "req_id"));
                    } catch (RuntimeException e10) {
                        x(p7Var, str3, B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(p7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(p7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void W() {
        u0 u0Var = this.a;
        if (u0Var == null || !this.o0) {
            return;
        }
        u0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!n9.a("WEB_MESSAGE_LISTENER")) {
            g("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        u0 u0Var2 = this.a;
        if (!u0Var2.R) {
            d5.b.a(u0Var2, "TelegramWebviewProxyMessage", singleton, new n3(u0Var2, 4));
            this.a.R = true;
        }
        if (n9.a("DOCUMENT_START_SCRIPT")) {
            u0 u0Var3 = this.a;
            if (u0Var3.S == null) {
                boolean z9 = d5.b.a;
                if (!e5.k.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                e5.m c10 = d5.b.c(u0Var3);
                u0Var3.S = new d6.i((ScriptHandlerBoundaryInterface) af.b.a(ScriptHandlerBoundaryInterface.class, c10.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 19);
            }
        }
    }

    public final void X(u0 u0Var, Object obj) {
        u0 u0Var2;
        TLRPC.User user;
        String str = "";
        u0 u0Var3 = this.a;
        if (u0Var3 != null) {
            u0Var3.destroy();
            removeView(this.a);
        }
        if (u0Var != null) {
            org.telegram.messenger.g0.E2(u0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(iz.J0 && !r());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (u0Var == null) {
            Context context = getContext();
            boolean z9 = this.o0;
            long j3 = 0;
            if (z9 && (user = this.U) != null) {
                j3 = user.id;
            }
            u0Var2 = new u0(context, z9, j3);
        } else {
            u0Var2 = u0Var;
        }
        this.a = u0Var2;
        if (this.o0) {
            u0Var2.setBackgroundColor(j(m6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.v0;
        }
        if (!qp.s1(this.M).G6) {
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
                PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                int o4 = iz.o();
                String str3 = o4 == 0 ? "LOW" : o4 == 1 ? "AVERAGE" : "HIGH";
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
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(org.telegram.messenger.t0.h(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (u0Var == null && this.o0) {
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
                u0 u0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(u0Var4, this);
                this.u0 = botWebViewContainer$WebViewProxy2;
                u0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (u0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.u0.a = this;
        }
        K(this.a);
        Q0 = false;
    }

    public final void Y(int i7, org.telegram.ui.ActionBar.u1 u1Var, Runnable runnable) {
        if (u1Var == null || m(i7)) {
            return;
        }
        u1Var.setOnDismissListener(new u3(16, this, runnable));
        this.c0 = u1Var;
        u1Var.j0 = false;
        u1Var.show();
        if (this.L0 != i7) {
            this.L0 = i7;
            this.M0 = 0;
            this.N0 = 0L;
        }
        this.M0++;
    }

    public final void Z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(id.M0(2131743879, "UnknownError"));
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
            a8.g(th2, true);
            this.s.setVisibility(8);
            this.h = true;
            this.f.setVisibility(0);
            u0 u0Var = this.a;
            if (u0Var != null) {
                removeView(u0Var);
            }
        }
    }

    public final void d(p7 p7Var, hi.m1 m1Var, String str, String str2, String str3) {
        if (m1Var == null || this.U == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                m1Var.m(new JSONObject());
                x(p7Var, str2, A(string, "req_id"));
            } catch (RuntimeException e10) {
                x(p7Var, str3, B("req_id", string, "error", e10.getMessage()));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(p7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        r31 r31Var;
        Uri[] uriArr;
        if (i7 == qs.n4) {
            u0 u0Var = this.a;
            if (u0Var != null) {
                u0Var.setBackgroundColor(j(m6.d6));
            }
            if (!this.q0) {
                int i11 = m6.yj;
                int j3 = j(i11);
                this.p0 = j3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN);
                d4 d4Var = this.s;
                d4Var.setColorFilter(porterDuffColorFilter);
                rz rzVar = this.r;
                if (rzVar != null) {
                    rzVar.n = Integer.valueOf(this.p0);
                    this.r.f(i11, this.e, 1.0f, false);
                }
                d4Var.invalidate();
            }
            z();
            return;
        }
        if (i7 != qs.c5) {
            if (i7 == qs.d5) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (r31Var = this.V) == null) {
                    return;
                }
                r31Var.run();
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
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    uriArr[i12] = clipData.getItemAt(i12).getUri();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.s) {
            if (this.w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.w) {
                canvas.restore();
            }
            if (!this.w) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        }
        if (view == this.f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        }
        if (view == this.a) {
            if (org.telegram.messenger.g0.m0) {
                return true;
            }
            if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                return true;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (this.U == null) {
            return;
        }
        hi.p pVar = this.j0;
        if (pVar == null) {
            this.j0 = hi.p.c(getContext(), this.M, this.U.id);
        } else {
            pVar.h();
        }
    }

    public final p7 f() {
        u0 u0Var = this.a;
        long j3 = this.s0;
        boolean z9 = this.t0;
        String str = this.G0;
        p7 p7Var = new p7();
        p7Var.c = this;
        p7Var.d = u0Var;
        p7Var.a = j3;
        p7Var.b = z9;
        p7Var.e = str;
        return p7Var;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.O0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.r0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof b4)) {
            return 0;
        }
        b4 b4Var = (b4) getParent();
        if (b4Var.J) {
            return (int) ((b4Var.getMeasuredHeight() - b4Var.getOffsetY()) + this.z0);
        }
        return 0;
    }

    public String getOriginHost() {
        u0 u0Var = this.a;
        if (u0Var == null) {
            return null;
        }
        return k(u0Var.getUrl());
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

    public u0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        u0 u0Var = this.a;
        if (u0Var != null) {
            if (u0Var.getParent() != null) {
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
            hi.r0 r0Var = this.k0;
            if (r0Var != null) {
                r0Var.f.remove(this.K0);
                this.k0 = null;
                this.J0 = null;
            }
        }
    }

    public final void i(String str) {
        new gc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i7) {
        h6 h6Var = this.e;
        return h6Var != null ? h6Var.h(i7) : m6.x0(null, i7, false);
    }

    public final void l(p7 p7Var, hi.m1 m1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (m1Var == null || this.U == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f10 = m1Var.f(optString);
                    if (!m1Var.d || (obj = f10.first) != null) {
                        x(p7Var, str2, B("req_id", string, "value", f10.first));
                        return;
                    }
                    Object obj2 = f10.second;
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("req_id", string);
                        jSONObject.put("value", obj);
                        jSONObject.put("can_restore", obj2);
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    x(p7Var, str2, jSONObject);
                } catch (RuntimeException e10) {
                    x(p7Var, str3, B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception unused2) {
                x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(p7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean m(int i7) {
        if (this.c0 != null || (this.N0 > 0 && System.currentTimeMillis() < this.N0)) {
            return true;
        }
        if (this.L0 != i7 || this.M0 <= 3) {
            return false;
        }
        this.N0 = System.currentTimeMillis() + 3000;
        this.M0 = 0;
        return true;
    }

    public final void n(boolean z9, boolean z10) {
        boolean z11;
        invalidate();
        if ((this.N || z10) && (z11 = this.o0) && (getParent() instanceof b4)) {
            b4 b4Var = (b4) getParent();
            if (z9) {
                this.O = b4Var.getSwipeOffsetY() == b4Var.getTopActionBarOffsetY() + (-b4Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (b4Var.getTopActionBarOffsetY() + ((b4Var.getMeasuredHeight() - b4Var.getOffsetY()) - b4Var.getSwipeOffsetY()) + this.z0));
            if (!z10 && max == this.w0 && this.x0 == z9 && this.y0 == this.O) {
                return;
            }
            this.w0 = max;
            this.x0 = z9;
            this.y0 = this.O;
            String str = "{height:" + (max / org.telegram.messenger.g0.p) + ",is_state_stable:" + z9 + ",is_expanded:" + this.O + "}";
            if (!z11 || q()) {
                qs.f(this.M).d(new z(this, a8.p0.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
            } else {
                g("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    public final boolean o(p7 p7Var) {
        boolean z9;
        if (p7Var == null) {
            return false;
        }
        String str = (String) p7Var.e;
        if (((x0) p7Var.c) != this || ((u0) p7Var.d) != this.a || p7Var.a != this.s0 || (z9 = p7Var.b) != this.t0) {
            return false;
        }
        if (z9) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.G0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        qs.e().c(this, qs.n4);
        qs.e().c(this, qs.c5);
        qs.e().c(this, qs.d5);
        setTag(R.id.bulletin_delegate_tag, new ch.v(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        qs.e().n(this, qs.n4);
        qs.e().n(this, qs.c5);
        qs.e().n(this, qs.d5);
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.A0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
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

    public final void s(int i7, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
        TLRPC.UserFull b22 = qp.s1(i7).b2(j3);
        String n10 = t10.n(a22);
        d4 d4Var = this.s;
        if (n10 != null && n10.equals("DurgerKingBot")) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            d4Var.h(null, null, sz.h(R.raw.durgerking_placeholder, Integer.valueOf(j(m6.a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i7).b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == j3) {
                break;
            }
        }
        boolean z9 = true;
        if (tL_attachMenuBot != null) {
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = tL_attachMenuBot.icons;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList2.get(i11);
                i11++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals("placeholder_static")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ui.k0(tL_attachMenuBot);
            } else {
                z9 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                d4Var.setVisibility(0);
                d4Var.setAlpha(1.0f);
                d4Var.j(hc.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z9);
                return;
            }
            return;
        }
        h6 h6Var = this.e;
        if (b22 != null && (botInfo = b22.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            rz j10 = sz.j(512, 512, b22.bot_info.app_settings.placeholder_svg_path);
            this.r = j10;
            if (j10 != null) {
                j10.n = Integer.valueOf(this.p0);
                this.r.f(m6.yj, h6Var, 1.0f, false);
            }
            d4Var.h(null, null, this.r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        d4Var.setVisibility(0);
        d4Var.setAlpha(1.0f);
        rz j11 = sz.j(512, 512, path);
        this.r = j11;
        if (j11 != null) {
            j11.n = Integer.valueOf(this.p0);
            this.r.f(m6.yj, h6Var, 1.0f, false);
        }
        d4Var.h(null, null, this.r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(d0 d0Var) {
        this.c = d0Var;
    }

    public void setFlickerViewColor(int i7) {
        int b10 = org.telegram.messenger.g0.B(i7) > 0.7f ? m6.b(0.0f, -0.15f, i7) : m6.b(0.025f, 0.15f, i7);
        if (this.p0 == b10) {
            return;
        }
        this.p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        d4 d4Var = this.s;
        d4Var.setColorFilter(porterDuffColorFilter);
        rz rzVar = this.r;
        if (rzVar != null) {
            rzVar.n = Integer.valueOf(this.p0);
            this.r.f(m6.yj, this.e, 1.0f, false);
        }
        this.q0 = true;
        d4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i7) {
        if (this.A0 == i7) {
            return;
        }
        this.A0 = i7;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z9) {
        this.R = z9;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.D0 = runnable;
        u0 u0Var = this.a;
        if (u0Var != null) {
            u0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(z10 z10Var) {
        this.P0 = z10Var;
    }

    public void setOpener(u0 u0Var) {
        u0 u0Var2;
        this.v0 = u0Var;
        if (this.o0 || (u0Var2 = this.a) == null) {
            return;
        }
        u0Var2.f = u0Var;
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z9) {
        this.a0 = z9;
    }

    public void setViewPortHeightOffset(float f10) {
        this.z0 = f10;
    }

    public void setWasOpenedByBot(q4 q4Var) {
        this.F0 = q4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z9) {
        this.E0 = z9;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.x = aVar;
    }

    public void setWebViewScrollListener(w0 w0Var) {
        this.d = w0Var;
        u0 u0Var = this.a;
        if (u0Var != null) {
            u0Var.f(this, w0Var);
        }
    }

    public final void t(int i7, String str, boolean z9) {
        this.M = i7;
        if (this.o0) {
            this.s0++;
            this.t0 = z9;
            this.G0 = z9 ? k(str) : null;
            if (this.a != null) {
                W();
            }
        }
        qs.f(i7).d(new z(this, str, 1));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        d4 d4Var;
        int j3;
        try {
            if (this.a != null && (j3 = j(m6.d6)) != this.C0) {
                this.C0 = j3;
                this.a.setBackgroundColor(j3);
            }
            if (this.q0 || (d4Var = this.s) == null) {
                return;
            }
            int i7 = this.p0;
            int i10 = m6.yj;
            if (i7 != j(i10)) {
                int j10 = j(i10);
                this.p0 = j10;
                d4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
                rz rzVar = this.r;
                if (rzVar != null) {
                    rzVar.n = Integer.valueOf(this.p0);
                }
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(p7 p7Var) {
        if (this.U == null) {
            return;
        }
        e();
        hi.p pVar = this.j0;
        if (pVar == null) {
            return;
        }
        try {
            x(p7Var, "biometry_info_received", pVar.f());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void x(p7 p7Var, String str, JSONObject jSONObject) {
        if (o(p7Var)) {
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
        qs.f(this.M).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = a3.u(this.e, true);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (u10 != null) {
            jSONObject = new JSONObject().put("theme_params", u10);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public void I() {
    }

    public void L(u0 u0Var) {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z9) {
    }

    public void E(boolean z9, String str) {
    }

    public void J(boolean z9, boolean z10) {
    }
}
