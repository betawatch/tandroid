package org.telegram.ui.web;

import ai.c7;
import ai.r4;
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
import b8.mf;
import b8.p9;
import b8.rf;
import ci.ba;
import ci.h3;
import ei.d4;
import ei.i8;
import ei.p7;
import ii.c4;
import ii.o4;
import ii.q4;
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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.gs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.kz;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.p2;
import org.telegram.messenger.r10;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hc1;
import org.telegram.ui.i81;
import org.telegram.ui.ih0;
import org.telegram.ui.n9;
import org.telegram.ui.s9;
import org.telegram.ui.u70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class w0 extends FrameLayout implements cs, z5 {
    public static boolean R0 = true;
    public static int S0;
    public static HashMap T0;
    public float A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E;
    public Runnable E0;
    public int F;
    public boolean F0;
    public String G;
    public q4 G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public p7 K0;
    public String L;
    public final r L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public r10 Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public iv0 W;
    public t0 a;
    public Activity a0;
    public String b;
    public boolean b0;
    public d0 c;
    public String c0;
    public v0 d;
    public org.telegram.ui.ActionBar.s1 d0;
    public final e6 e;
    public int e0;
    public final TextView f;
    public long f0;
    public long g0;
    public boolean h;
    public n9 h0;
    public boolean i0;
    public String j0;
    public ii.r k0;
    public ii.s0 l0;
    public ii.i0 m0;
    public final org.telegram.ui.Components.voip.g n;
    public ii.n1 n0;
    public ii.n1 o0;
    public final boolean p0;
    public int q0;
    public jz r;
    public boolean r0;
    public final d4 s;
    public BotWebViewContainer$BotWebViewProxy s0;
    public long t0;
    public boolean u0;
    public BotWebViewContainer$WebViewProxy v0;
    public boolean w;
    public t0 w0;
    public q0.a x;
    public int x0;
    public ValueCallback y;
    public boolean y0;
    public boolean z0;

    public w0(int i3, Context context, e6 e6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.n = gVar;
        int i10 = k6.Ci;
        this.E = j(i10);
        int i11 = k6.Gi;
        this.F = j(i11);
        this.G = "";
        this.I = j(i10);
        this.J = j(i11);
        this.K = "";
        this.L = "";
        this.N = h10.t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new r(this, 2);
        this.M0 = -1;
        this.N0 = 0;
        int i12 = S0;
        S0 = i12 + 1;
        this.P0 = i12;
        this.p0 = z10;
        this.e = e6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.a0 = (Activity) context;
        }
        gVar.k = false;
        gVar.b(i3, hs.j2);
        d4 d4Var = new d4(this, context);
        this.s = d4Var;
        int j10 = j(k6.yj);
        this.q0 = j10;
        d4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        d4Var.getImageReceiver().S0 = true;
        addView(d4Var, mf.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(bd.M0(2131752913, null));
        r6.V(textView, k6.y6, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, mf.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sf.c.w(Uri.parse(str2), "https", null, S(org.telegram.messenger.g0.K0(str2, false)), null)).openConnection();
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

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < split.length; i3++) {
            if (i3 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i3].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(hp.s1(h10.t0).U5);
        return sb2.toString();
    }

    public static void a(w0 w0Var, String[] strArr, q0.a aVar) {
        w0Var.getClass();
        for (String str : strArr) {
            if (w0Var.getContext().checkSelfPermission(str) != 0) {
                w0Var.W = new iv0(w0Var, aVar, strArr, 9);
                Activity activity = w0Var.a0;
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
        String S = S(K0);
        if (T0 == null) {
            T0 = new HashMap();
        }
        T0.put(S, K0);
        return sf.c.w(Uri.parse(str), "https", null, S, null);
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
        d4 d4Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int L = org.telegram.messenger.g0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d4Var.requestLayout();
    }

    private void setupWebView(t0 t0Var) {
        W(t0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (T0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.g0.K0(str, false);
        if (K0 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(hp.s1(h10.t0).U5);
        return (K0.endsWith(sb2.toString()) && (str2 = (String) T0.get(K0)) != null) ? sf.c.w(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void w(int i3, t0 t0Var, p7 p7Var, String str, JSONObject jSONObject) {
        if (t0Var == null) {
            return;
        }
        hs.f(i3).d(new ih0(t0Var, p7Var, str, jSONObject, 26));
    }

    public final boolean C() {
        if (this.a == null || !this.S) {
            return false;
        }
        y("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x07c4, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x07c7, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:394:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x11e5  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x11f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final p7 p7Var, String str, String str2) {
        char c2;
        p2 p2Var;
        final int i3;
        int i10;
        int i11;
        n9 n9Var;
        final w0 w0Var;
        final w0 w0Var2;
        p7 p7Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j10;
        int i12;
        TLRPC.User user;
        JSONObject jSONObject;
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
        String g7;
        long j12;
        String str11;
        boolean z16;
        if (this.p0) {
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
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1898902656:
                    if (str.equals("web_app_close_scan_qr_popup")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1736707758:
                    if (str.equals("web_app_biometry_get_info")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1717314938:
                    if (str.equals("web_app_open_link")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1715704462:
                    if (str.equals("web_app_request_file_download")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1693280352:
                    if (str.equals("web_app_open_popup")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1390641887:
                    if (str.equals("web_app_open_invoice")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1385387727:
                    if (str.equals("web_app_set_emoji_status")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1353432696:
                    if (str.equals("web_app_setup_secondary_button")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1341039673:
                    if (str.equals("web_app_setup_closing_behavior")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1309122684:
                    if (str.equals("web_app_open_scan_qr_popup")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1263619595:
                    if (str.equals("web_app_request_phone")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1259935152:
                    if (str.equals("web_app_request_theme")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1229296877:
                    if (str.equals("web_app_secure_storage_get_key")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1183558219:
                    if (str.equals("web_app_check_location")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1093591555:
                    if (str.equals("web_app_biometry_open_settings")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -921083201:
                    if (str.equals("web_app_request_viewport")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -907261345:
                    if (str.equals("web_app_request_emoji_status_access")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -620103109:
                    if (str.equals("web_app_stop_device_orientation")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -585008607:
                    if (str.equals("web_app_device_storage_save_key")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -581005326:
                    if (str.equals("web_app_device_storage_get_key")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -512688845:
                    if (str.equals("web_app_biometry_request_auth")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -498118340:
                    if (str.equals("web_app_toggle_orientation_lock")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -474676372:
                    if (str.equals("web_app_allow_scroll")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -439770054:
                    if (str.equals("web_app_open_tg_link")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -293897269:
                    if (str.equals("web_app_secure_storage_restore_key")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -244584646:
                    if (str.equals("web_app_share_to_story")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -216725042:
                    if (str.equals("web_app_request_location")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -111186465:
                    if (str.equals("web_app_start_gyroscope")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -71726289:
                    if (str.equals("web_app_close")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -58095910:
                    if (str.equals("web_app_ready")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 22015443:
                    if (str.equals("web_app_read_text_from_clipboard")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 127735931:
                    if (str.equals("web_app_hide_keyboard")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 189207985:
                    if (str.equals("web_app_stop_gyroscope")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 267846314:
                    if (str.equals("web_app_secure_storage_clear")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 348967753:
                    if (str.equals("web_app_device_storage_clear")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 420328489:
                    if (str.equals("web_app_start_accelerometer")) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 475603707:
                    if (str.equals("web_app_stop_accelerometer")) {
                        c2 = '%';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 622108947:
                    if (str.equals("web_app_send_prepared_message")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 668142772:
                    if (str.equals("web_app_data_send")) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 671811520:
                    if (str.equals("web_app_request_content_safe_area")) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 721956751:
                    if (str.equals("web_app_add_to_home_screen")) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 748864404:
                    if (str.equals("web_app_request_fullscreen")) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 751292356:
                    if (str.equals("web_app_switch_inline_query")) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 792789792:
                    if (str.equals("web_app_secure_storage_save_key")) {
                        c2 = ',';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 796110323:
                    if (str.equals("web_app_exit_fullscreen")) {
                        c2 = '-';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 880626018:
                    if (str.equals("web_app_verify_age")) {
                        c2 = '.';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 909476449:
                    if (str.equals("web_app_open_location_settings")) {
                        c2 = '/';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1011447167:
                    if (str.equals("web_app_setup_back_button")) {
                        c2 = '0';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1210129967:
                    if (str.equals("web_app_biometry_request_access")) {
                        c2 = '1';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1273834781:
                    if (str.equals("web_app_trigger_haptic_feedback")) {
                        c2 = '2';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1398490221:
                    if (str.equals("web_app_setup_main_button")) {
                        c2 = '3';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1453051298:
                    if (str.equals("web_app_setup_swipe_behavior")) {
                        c2 = '4';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1455972419:
                    if (str.equals("web_app_setup_settings_button")) {
                        c2 = '5';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1495787980:
                    if (str.equals("web_app_check_home_screen")) {
                        c2 = '6';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1759965681:
                    if (str.equals("web_app_request_chat")) {
                        c2 = '7';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812395469:
                    if (str.equals("web_app_start_device_orientation")) {
                        c2 = '8';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1882780382:
                    if (str.equals("web_app_biometry_update_token")) {
                        c2 = '9';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1899078473:
                    if (str.equals("web_app_set_bottom_bar_color")) {
                        c2 = ':';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1917103703:
                    if (str.equals("web_app_set_header_color")) {
                        c2 = ';';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1937068806:
                    if (str.equals("web_app_request_safe_area")) {
                        c2 = '<';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2001330488:
                    if (str.equals("web_app_set_background_color")) {
                        c2 = '=';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2036090717:
                    if (str.equals("web_app_request_write_access")) {
                        c2 = '>';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2139805763:
                    if (str.equals("web_app_expand")) {
                        c2 = '?';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            char c10 = c2;
            r rVar = this.L0;
            long j13 = 1000;
            e6 e6Var = this.e;
            p2 p2Var2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            a3 a3Var = null;
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
            switch (c10) {
                case 0:
                    if (this.V == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        String string = jSONObject2.getString("req_id");
                        String string2 = jSONObject2.getString("method");
                        String obj = jSONObject2.get("params").toString();
                        int i13 = this.N;
                        t0 t0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = hp.s1(i13).o1(this.V.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i13).sendRequest(invokewebviewcustommethod, new cg.j0(this, string, i13, t0Var, p7Var, 14));
                        return;
                    } catch (Exception e10) {
                        a8.f(e10);
                        if (e10 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            Y(null);
                            return;
                        }
                    }
                case 1:
                    if (!this.i0 || (n9Var = this.h0) == null) {
                        return;
                    }
                    n9Var.dismiss();
                    return;
                case 2:
                    v(p7Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject3.optString("url"));
                        String optString = jSONObject3.optString("try_browser");
                        if (hp.s1(this.N).B4 == null || !hp.s1(this.N).B4.contains(parse.getScheme())) {
                            return;
                        }
                        G(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                        return;
                    } catch (Exception e11) {
                        a8.f(e11);
                        return;
                    }
                case 4:
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    if (this.m0 == null) {
                        this.m0 = ii.i0.c(getContext(), this.N, this.V.id);
                    }
                    try {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        String string3 = jSONObject4.getString("url");
                        String string4 = jSONObject4.getString("file_name");
                        if (this.m0.d(string3) != null) {
                            this.m0.b(string3, string4);
                            x(p7Var, "file_download_requested", A("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = hp.s1(this.N).q1(this.V);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.N).sendRequest(checkdownloadfileparams, new ai.q1(this, p7Var, string3, string4, 19));
                        return;
                    } catch (Exception e12) {
                        a8.f(e12);
                        x(p7Var, "file_download_requested", A("cancelled", "status"));
                        return;
                    }
                case 5:
                    w0Var = this;
                    try {
                        if (w0Var.d0 == null) {
                            if (System.currentTimeMillis() - w0Var.f0 <= 150) {
                                int i14 = w0Var.e0 + 1;
                                w0Var.e0 = i14;
                                if (i14 >= 3) {
                                    w0Var.e0 = 0;
                                    w0Var.g0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - w0Var.g0 > 3000) {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                String optString2 = jSONObject5.optString("title", null);
                                String string5 = jSONObject5.getString("message");
                                JSONArray jSONArray = jSONObject5.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w0Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                                    arrayList.add(new u0(jSONArray.getJSONObject(i15)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final u0 u0Var = (u0) arrayList.get(0);
                                            final int i16 = 0;
                                            alertDialog$Builder.k(u0Var.b, new org.telegram.ui.ActionBar.p1(w0Var) { // from class: org.telegram.ui.web.o
                                                public final /* synthetic */ w0 b;

                                                {
                                                    this.b = w0Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.p1
                                                public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i17) {
                                                    switch (i16) {
                                                        case 0:
                                                            w0 w0Var3 = this.b;
                                                            p7 p7Var3 = p7Var;
                                                            u0 u0Var2 = u0Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            s1Var.dismiss();
                                                            try {
                                                                w0Var3.Q = System.currentTimeMillis();
                                                                w0Var3.x(p7Var3, "popup_closed", new JSONObject().put("button_id", u0Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                a8.g(e13, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            w0 w0Var4 = this.b;
                                                            p7 p7Var4 = p7Var;
                                                            u0 u0Var3 = u0Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            s1Var.dismiss();
                                                            try {
                                                                w0Var4.Q = System.currentTimeMillis();
                                                                w0Var4.x(p7Var4, "popup_closed", new JSONObject().put("button_id", u0Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                a8.g(e14, true);
                                                                return;
                                                            }
                                                        default:
                                                            w0 w0Var5 = this.b;
                                                            p7 p7Var5 = p7Var;
                                                            u0 u0Var4 = u0Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            s1Var.dismiss();
                                                            try {
                                                                w0Var5.Q = System.currentTimeMillis();
                                                                w0Var5.x(p7Var5, "popup_closed", new JSONObject().put("button_id", u0Var4.a));
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
                                        final u0 u0Var2 = (u0) arrayList.get(1);
                                        final int i17 = 1;
                                        alertDialog$Builder.h(u0Var2.b, new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.o
                                            public final /* synthetic */ w0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i172) {
                                                switch (i17) {
                                                    case 0:
                                                        w0 w0Var3 = this.b;
                                                        p7 p7Var3 = p7Var;
                                                        u0 u0Var22 = u0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        s1Var.dismiss();
                                                        try {
                                                            w0Var3.Q = System.currentTimeMillis();
                                                            w0Var3.x(p7Var3, "popup_closed", new JSONObject().put("button_id", u0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        w0 w0Var4 = this.b;
                                                        p7 p7Var4 = p7Var;
                                                        u0 u0Var3 = u0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        s1Var.dismiss();
                                                        try {
                                                            w0Var4.Q = System.currentTimeMillis();
                                                            w0Var4.x(p7Var4, "popup_closed", new JSONObject().put("button_id", u0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            a8.g(e14, true);
                                                            return;
                                                        }
                                                    default:
                                                        w0 w0Var5 = this.b;
                                                        p7 p7Var5 = p7Var;
                                                        u0 u0Var4 = u0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        s1Var.dismiss();
                                                        try {
                                                            w0Var5.Q = System.currentTimeMillis();
                                                            w0Var5.x(p7Var5, "popup_closed", new JSONObject().put("button_id", u0Var4.a));
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
                                        final u0 u0Var3 = (u0) arrayList.get(2);
                                        String str15 = u0Var3.b;
                                        final int i18 = 2;
                                        w0Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(w0Var2) { // from class: org.telegram.ui.web.o
                                                public final /* synthetic */ w0 b;

                                                {
                                                    this.b = w0Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.p1
                                                public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i172) {
                                                    switch (i18) {
                                                        case 0:
                                                            w0 w0Var3 = this.b;
                                                            p7 p7Var3 = p7Var;
                                                            u0 u0Var22 = u0Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            s1Var.dismiss();
                                                            try {
                                                                w0Var3.Q = System.currentTimeMillis();
                                                                w0Var3.x(p7Var3, "popup_closed", new JSONObject().put("button_id", u0Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e132) {
                                                                a8.g(e132, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            w0 w0Var4 = this.b;
                                                            p7 p7Var4 = p7Var;
                                                            u0 u0Var32 = u0Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            s1Var.dismiss();
                                                            try {
                                                                w0Var4.Q = System.currentTimeMillis();
                                                                w0Var4.x(p7Var4, "popup_closed", new JSONObject().put("button_id", u0Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                a8.g(e14, true);
                                                                return;
                                                            }
                                                        default:
                                                            w0 w0Var5 = this.b;
                                                            p7 p7Var5 = p7Var;
                                                            u0 u0Var4 = u0Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            s1Var.dismiss();
                                                            try {
                                                                w0Var5.Q = System.currentTimeMillis();
                                                                w0Var5.x(p7Var5, "popup_closed", new JSONObject().put("button_id", u0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e15) {
                                                                a8.g(e15, true);
                                                            }
                                                    }
                                                }
                                            };
                                            p7Var2 = p7Var;
                                            alertDialog$Builder.i(str15, p1Var);
                                        } catch (JSONException e14) {
                                            e = e14;
                                            a8.f(e);
                                            return;
                                        }
                                    } else {
                                        w0Var2 = this;
                                        p7Var2 = p7Var;
                                    }
                                    alertDialog$Builder.j(new ai.o(w0Var2, atomicBoolean, p7Var2, 6));
                                    w0Var2.d0 = alertDialog$Builder.p();
                                    if (arrayList.size() >= 1) {
                                        u0 u0Var4 = (u0) arrayList.get(0);
                                        if (u0Var4.c >= 0 && (textView3 = (TextView) w0Var2.d0.d(-1)) != null) {
                                            textView3.setTextColor(w0Var2.j(u0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        u0 u0Var5 = (u0) arrayList.get(1);
                                        if (u0Var5.c >= 0 && (textView2 = (TextView) w0Var2.d0.d(-2)) != null) {
                                            textView2.setTextColor(w0Var2.j(u0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        u0 u0Var6 = (u0) arrayList.get(2);
                                        if (u0Var6.c < 0 || (textView = (TextView) w0Var2.d0.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(w0Var2.j(u0Var6.c));
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
                    w0Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (w0Var.c0 != null) {
                            w0Var.F(optString3, "cancelled", true);
                            return;
                        }
                        w0Var.c0 = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(w0Var.N).sendRequest(tL_payments_getPaymentForm, new ai.r6(w0Var, optString3, tL_inputInvoiceSlug, 20));
                        return;
                    } catch (JSONException e16) {
                        a8.f(e16);
                        break;
                    }
                case 7:
                    w0Var = this;
                    long j14 = 0;
                    if (w0Var.V != null && System.currentTimeMillis() - w0Var.Q <= 10000) {
                        try {
                            jSONObject = new JSONObject(str2);
                            j10 = Long.parseLong(jSONObject.getString("custom_emoji_id"));
                        } catch (Exception unused) {
                        }
                        try {
                            i12 = jSONObject.getInt("duration");
                        } catch (Exception unused2) {
                            j14 = j10;
                            j10 = j14;
                            i12 = 0;
                            user = w0Var.V;
                            if (user != null) {
                            }
                        }
                        user = w0Var.V;
                        if (user != null) {
                            w0Var.x(p7Var, "emoji_status_failed", A("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            o4.f(w0Var.N, user, j10, i12, new p(w0Var, p7Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    w0Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", w0Var.K).trim();
                        boolean z17 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : w0Var.I;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : w0Var.J;
                        boolean z18 = jSONObject6.optBoolean("is_progress_visible", false) && z17;
                        boolean z19 = jSONObject6.optBoolean("has_shine_effect", false) && z17;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : w0Var.L;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        w0Var.I = parseColor;
                        w0Var.J = parseColor2;
                        w0Var.K = trim;
                        w0Var.L = optString4;
                        w0Var.M = str2;
                        w0Var.c.l(z17, optBoolean, trim, j11, parseColor, parseColor2, z18, z19, optString4);
                        break;
                    } catch (Exception e17) {
                        a8.f(e17);
                        break;
                    }
                    break;
                case '\t':
                    w0Var = this;
                    try {
                        w0Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e18) {
                        a8.f(e18);
                        break;
                    }
                case '\n':
                    w0Var = this;
                    try {
                        if (!w0Var.i0 && w0Var.a0 != null) {
                            w0Var.j0 = new JSONObject(str2).optString("text");
                            w0Var.i0 = true;
                            if (w0Var.a0.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = w0Var.a0;
                                if (activity != null) {
                                    w0Var.h0 = s9.j0(activity, 3, new y00(w0Var));
                                    return;
                                }
                                break;
                            } else {
                                hs.e().a(new gs(w0Var, p7Var, 2));
                                w0Var.a0.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
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
                    final int i19 = this.N;
                    final t0 t0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), e6Var);
                    alertDialog$Builder2.l(bd.L0(2131745430));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String p10 = l10.p(this.V);
                    if (TextUtils.isEmpty(p10)) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.L0(2131754069)));
                    } else {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.Z(2131754066, p10)));
                    }
                    final boolean z20 = hp.s1(this.N).H0.indexOfKey(this.V.id) >= 0;
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) bd.L0(2131754068));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(bd.L0(2131745471), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.web.u
                        @Override // org.telegram.ui.ActionBar.p1
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i20) {
                            strArr[0] = null;
                            s1Var.dismiss();
                            w0 w0Var3 = w0.this;
                            boolean z21 = z20;
                            int i21 = i19;
                            t0 t0Var3 = t0Var2;
                            p7 p7Var3 = p7Var;
                            if (z21) {
                                hp.s1(w0Var3.N).f5(new zo0(w0Var3, i21, t0Var3, p7Var3, 21), w0Var3.V.id);
                                return;
                            }
                            yy.C(w0Var3.N).r0(wy.g(h10.i(w0Var3.N).f(), w0Var3.V.id, null, null, null, null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                w0.w(i21, t0Var3, p7Var3, "phone_requested", jSONObject8);
                            } catch (Exception e21) {
                                a8.g(e21, true);
                            }
                        }
                    });
                    alertDialog$Builder2.h(bd.L0(2131752589), new u70(21));
                    X(4, alertDialog$Builder2.a(), new v(strArr, i19, t0Var2, p7Var, 0));
                    return;
                case '\f':
                    z();
                    return;
                case '\r':
                    if (this.V == null) {
                        return;
                    }
                    if (this.o0 == null) {
                        getContext();
                        int i20 = this.N;
                        this.o0 = new ii.n1(i20, h10.i(i20).e(), this.V.id, true);
                    }
                    l(p7Var, this.o0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.l0 == null) {
                        ii.s0 e21 = ii.s0.e(getContext(), this.N, this.V.id);
                        this.l0 = e21;
                        e21.f.add(rVar);
                    }
                    this.K0 = p7Var;
                    rVar.run();
                    return;
                case 15:
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    this.Q = 0L;
                    d2 T = LaunchActivity.T();
                    if (T == null || T.getParentLayout() == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.q4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.A4(this.V.id));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionBiometry");
                    d0 d0Var = this.c;
                    if (d0Var != null) {
                        d0Var.b();
                        return;
                    }
                    return;
                case 16:
                    n(!((getParent() instanceof c4) && ((c4) getParent()).d()), true);
                    return;
                case 17:
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    o4.a(this.N, this.V.id, new p(this, p7Var, 0));
                    return;
                case 18:
                    ii.w0 A = this.c.A();
                    if (A == null || !A.h()) {
                        x(p7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.V == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i21 = this.N;
                        this.n0 = new ii.n1(i21, h10.i(i21).e(), this.V.id, false);
                    }
                    U(p7Var, this.n0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.V == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i22 = this.N;
                        this.n0 = new ii.n1(i22, h10.i(i22).e(), this.V.id, false);
                    }
                    l(p7Var, this.n0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    e();
                    ii.r rVar2 = this.k0;
                    if (rVar2 == null) {
                        return;
                    }
                    if (rVar2.e) {
                        rVar2.j(str3, true, null, new ei.d0(2, rVar2, new p(this, p7Var, 3)));
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
                            if (getParent() instanceof c4) {
                            }
                        }
                    } catch (Exception unused7) {
                        z11 = true;
                    }
                    g("allowScroll " + z11 + " " + z12);
                    if (getParent() instanceof c4) {
                        return;
                    }
                    ((c4) getParent()).a(z11, z12);
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
                    } catch (JSONException e23) {
                        a8.f(e23);
                        return;
                    }
                case 25:
                    if (this.V == null) {
                        return;
                    }
                    if (this.o0 == null) {
                        getContext();
                        int i23 = this.N;
                        this.o0 = new ii.n1(i23, h10.i(i23).e(), this.V.id, true);
                    }
                    R(p7Var, this.o0, str2);
                    return;
                case 26:
                    if (System.currentTimeMillis() - this.Q > 10000 || System.currentTimeMillis() - this.R < 2000) {
                        return;
                    }
                    this.Q = 0L;
                    this.R = System.currentTimeMillis();
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
                        if (!hp.s1(this.N).W4()) {
                            new vg.v0((d2) new c7(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(this.a0);
                        new HttpGetFileTask(new w(this, s1Var, str8, str10, str9), null).execute(str7);
                        s1Var.r(250L);
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
                    if (this.V == null) {
                        return;
                    }
                    if (this.l0 == null) {
                        ii.s0 e28 = ii.s0.e(getContext(), this.N, this.V.id);
                        this.l0 = e28;
                        e28.f.add(rVar);
                    }
                    this.K0 = p7Var;
                    if (this.l0.g()) {
                        this.l0.j(new q(this, p7Var, 0));
                        return;
                    } else {
                        this.l0.i(new p(this, p7Var, 1));
                        return;
                    }
                case 28:
                    ii.w0 A2 = this.c.A();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long k10 = Utilities.k(j13, 1000L, 20L);
                    if (A2 == null || !A2.d(k10)) {
                        x(p7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "gyroscope_started", null);
                        return;
                    }
                case 29:
                    try {
                        z13 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e29) {
                        a8.f(e29);
                        z13 = false;
                    }
                    this.c.z();
                    if (z13) {
                        if (this.F0 && LaunchActivity.K1 != null) {
                            Activity W = org.telegram.messenger.g0.W(getContext());
                            if (W == null) {
                                W = LaunchActivity.K1;
                            }
                            if (W == null || W.isFinishing()) {
                                return;
                            }
                            W.moveTaskToBack(true);
                            return;
                        }
                        if (this.G0 == null || (launchActivity = LaunchActivity.K1) == null || launchActivity.O() == null) {
                            return;
                        }
                        b3 O = LaunchActivity.K1.O();
                        ArrayList<a3> tabs = O.getTabs();
                        int i24 = 0;
                        while (true) {
                            if (i24 < tabs.size()) {
                                a3 a3Var2 = tabs.get(i24);
                                if (!this.G0.equals(a3Var2.a) || a3Var2.b == this.a) {
                                    i24++;
                                } else {
                                    a3Var = a3Var2;
                                }
                            }
                        }
                        if (a3Var != null) {
                            O.e(a3Var);
                            return;
                        }
                        return;
                    }
                    return;
                case hs.T /* 30 */:
                    T(this.a.getUrl(), true);
                    return;
                case hs.U /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.Q <= 10000) {
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
                        W2 = LaunchActivity.K1;
                    }
                    if (W2 != null) {
                        org.telegram.messenger.g0.v1(W2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    ii.w0 A3 = this.c.A();
                    if (A3 == null || !A3.g()) {
                        x(p7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.V == null) {
                        return;
                    }
                    if (this.o0 == null) {
                        getContext();
                        int i25 = this.N;
                        this.o0 = new ii.n1(i25, h10.i(i25).e(), this.V.id, true);
                    }
                    d(p7Var, this.o0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.V == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i26 = this.N;
                        this.n0 = new ii.n1(i26, h10.i(i26).e(), this.V.id, false);
                    }
                    d(p7Var, this.n0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    ii.w0 A4 = this.c.A();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long k11 = Utilities.k(j13, 1000L, 20L);
                    if (A4 == null || !A4.c(k11)) {
                        x(p7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    ii.w0 A5 = this.c.A();
                    if (A5 == null || !A5.f()) {
                        x(p7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            x(p7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            ii.j1.e1(getContext(), this.N, this.V.id, string7, this.e, new r(this, 0), new ai.n0(this, p7Var, botWebViewContainer$BotWebViewProxy, 8));
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
                    O(this.J0, true);
                    return;
                case ')':
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    li.b0(this.N);
                    long j15 = this.V.id;
                    int i27 = li.d2;
                    if (li.z0(i27, j15)) {
                        x(p7Var, "home_screen_added", null);
                        return;
                    } else {
                        li.b0(this.N).y0(this.V.id, i27, new q(this, p7Var, 2));
                        return;
                    }
                case '*':
                    try {
                        z14 = true;
                        try {
                            z15 = new JSONObject(str2).optBoolean("blur", true);
                        } catch (Exception unused10) {
                            z15 = z14;
                            g7 = this.c.g(z14, z15);
                            if (g7 != null) {
                            }
                        }
                    } catch (Exception unused11) {
                        z14 = true;
                    }
                    g7 = this.c.g(z14, z15);
                    if (g7 != null) {
                        x(p7Var, "fullscreen_changed", B("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z15)));
                        return;
                    } else {
                        x(p7Var, "fullscreen_failed", A(g7, "error"));
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
                        this.c.v(this.V, jSONObject11.getString("query"), arrayList2);
                        return;
                    } catch (JSONException e33) {
                        a8.f(e33);
                        return;
                    }
                case ',':
                    if (this.V == null) {
                        return;
                    }
                    if (this.o0 == null) {
                        getContext();
                        int i29 = this.N;
                        this.o0 = new ii.n1(i29, h10.i(i29).e(), this.V.id, true);
                    }
                    U(p7Var, this.o0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case '-':
                    String g10 = this.c.g(false, true);
                    if (g10 == null) {
                        x(p7Var, "fullscreen_changed", A(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        x(p7Var, "fullscreen_failed", A(g10, "error"));
                        return;
                    }
                case '.':
                    if (this.Q0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z21 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.web.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    w0.this.Q0.a(Boolean.valueOf(z21), Double.valueOf(d), optString6, Double.valueOf(optDouble));
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
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    this.Q = 0L;
                    d2 T2 = LaunchActivity.T();
                    if (T2 == null || T2.getParentLayout() == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.q4 parentLayout2 = T2.getParentLayout();
                    T2.presentFragment(ProfileActivity.A4(this.V.id));
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
                        if (optBoolean3 != this.S) {
                            this.S = optBoolean3;
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
                    ii.r rVar3 = this.k0;
                    if (rVar3 == null) {
                        return;
                    }
                    boolean z22 = rVar3.f;
                    if (z22) {
                        v(p7Var);
                        return;
                    }
                    if (rVar3.e) {
                        if (!z22) {
                            rVar3.f = true;
                            rVar3.k();
                        }
                        v(p7Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new hc1(4, this, p7Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), e6Var);
                    if (TextUtils.isEmpty(str12)) {
                        alertDialog$Builder3.l(bd.L0(2131753141));
                        i3 = 0;
                        alertDialog$Builder3.g(org.telegram.messenger.g0.X2(bd.Z(2131753142, l10.p(this.V))));
                    } else {
                        i3 = 0;
                        alertDialog$Builder3.l(org.telegram.messenger.g0.X2(bd.Z(2131753142, l10.p(this.V))));
                        alertDialog$Builder3.g(str12);
                    }
                    alertDialog$Builder3.k(bd.L0(2131754284), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.x
                        public final /* synthetic */ w0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.p1
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i30) {
                            switch (i3) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    w0 w0Var3 = this.b;
                                    ii.r rVar4 = w0Var3.k0;
                                    rVar4.f = true;
                                    rVar4.k();
                                    ii.r rVar5 = w0Var3.k0;
                                    p pVar = new p(w0Var3, p7Var, 2);
                                    rVar5.getClass();
                                    rVar5.j(null, true, null, new ei.d0(2, rVar5, pVar));
                                    break;
                                default:
                                    w0 w0Var4 = this.b;
                                    w0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    ii.r rVar6 = w0Var4.k0;
                                    rVar6.f = true;
                                    rVar6.d = true;
                                    rVar6.k();
                                    w0Var4.v(p7Var);
                                    break;
                            }
                        }
                    });
                    final int i30 = 1;
                    alertDialog$Builder3.h(bd.L0(2131752589), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.web.x
                        public final /* synthetic */ w0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.p1
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i302) {
                            switch (i30) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    w0 w0Var3 = this.b;
                                    ii.r rVar4 = w0Var3.k0;
                                    rVar4.f = true;
                                    rVar4.k();
                                    ii.r rVar5 = w0Var3.k0;
                                    p pVar = new p(w0Var3, p7Var, 2);
                                    rVar5.getClass();
                                    rVar5.j(null, true, null, new ei.d0(2, rVar5, pVar));
                                    break;
                                default:
                                    w0 w0Var4 = this.b;
                                    w0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    ii.r rVar6 = w0Var4.k0;
                                    rVar6.f = true;
                                    rVar6.d = true;
                                    rVar6.k();
                                    w0Var4.v(p7Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new ba(runnableArr, 10));
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
                case hs.o0 /* 51 */:
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.G).trim();
                        boolean z23 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.E;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.F;
                        boolean z24 = jSONObject14.optBoolean("is_progress_visible", false) && z23;
                        boolean z25 = jSONObject14.optBoolean("has_shine_effect", false) && z23;
                        try {
                            j12 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused13) {
                            j12 = 0;
                        }
                        this.E = parseColor3;
                        this.F = parseColor4;
                        this.G = trim2;
                        this.H = str2;
                        this.c.q(z23, optBoolean4, trim2, j12, parseColor3, parseColor4, z24, z25);
                        return;
                    } catch (Exception e37) {
                        a8.f(e37);
                        return;
                    }
                case hs.p0 /* 52 */:
                    try {
                        this.c.y(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        return;
                    } catch (JSONException e38) {
                        a8.f(e38);
                        return;
                    }
                case hs.q0 /* 53 */:
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.T) {
                            this.T = optBoolean5;
                            this.c.t(optBoolean5);
                            return;
                        }
                        return;
                    } catch (JSONException e39) {
                        a8.f(e39);
                        return;
                    }
                case hs.r0 /* 54 */:
                    if (this.V == null || Build.VERSION.SDK_INT < 26) {
                        str11 = "unsupported";
                    } else {
                        li.b0(this.N);
                        str11 = li.z0(li.d2, this.V.id) ? "added" : "missed";
                    }
                    x(p7Var, "home_screen_checked", A(str11, "status"));
                    return;
                case hs.s0 /* 55 */:
                    try {
                        str13 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e40) {
                        a8.f(e40);
                    }
                    if (str13 == null) {
                        return;
                    }
                    TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                    getrequestedwebviewbutton.bot = hp.s1(this.N).q1(this.V);
                    getrequestedwebviewbutton.webapp_req_id = str13;
                    ConnectionsManager.getInstance(this.N).sendRequestTyped(getrequestedwebviewbutton, new c3.b(2), new t(this, p7Var, str13, 0));
                    return;
                case hs.t0 /* 56 */:
                    ii.w0 A6 = this.c.A();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        z16 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused14) {
                        z16 = false;
                    }
                    long k12 = Utilities.k(j13, 1000L, 20L);
                    if (A6 == null || !A6.e(k12, z16)) {
                        x(p7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(p7Var, "device_orientation_started", null);
                        return;
                    }
                case hs.u0 /* 57 */:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str14 = jSONObject16.getString("reason");
                        } catch (Exception unused15) {
                        }
                        e();
                        ii.r rVar4 = this.k0;
                        if (rVar4 == null) {
                            return;
                        }
                        if (rVar4.e) {
                            rVar4.l(str14, string8, new ai.m(this, string8, p7Var, 12));
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
                            Y(null);
                            return;
                        }
                    }
                case hs.v0 /* 58 */:
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        boolean isEmpty = TextUtils.isEmpty(optString10);
                        int w02 = isEmpty ? k6.w0(k6.a7, e6Var) : Color.parseColor(optString10);
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
                case hs.w0 /* 59 */:
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
                                i10 = k6.a7;
                                i11 = i10;
                            }
                            i11 = -1;
                        } else {
                            if (optString12.equals("bg_color")) {
                                i10 = k6.d6;
                                i11 = i10;
                            }
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            this.c.u(i11, k6.w0(i11, e6Var), false);
                            return;
                        }
                        return;
                    } catch (Exception e44) {
                        a8.f(e44);
                        return;
                    }
                case hs.x0 /* 60 */:
                    P(this.I0, true);
                    return;
                case hs.y0 /* 61 */:
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        return;
                    } catch (Exception e45) {
                        a8.f(e45);
                        return;
                    }
                case hs.z0 /* 62 */:
                    if (!m(3)) {
                        int i31 = this.N;
                        t0 t0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = hp.s1(this.N).q1(this.V);
                        ConnectionsManager.getInstance(this.N).sendRequest(cansendmessage, new i8(this, i31, t0Var3, p7Var, 8));
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
                case hs.A0 /* 63 */:
                    this.c.s();
                    return;
                default:
                    a8.b("unknown webapp event ".concat(str));
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
            a8.b("invoice_closed " + jSONObject);
            if (z10 || !Objects.equals(this.c0, str)) {
                return;
            }
            this.c0 = null;
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.Q <= 10000 || !z11) {
            this.Q = 0L;
            boolean[] zArr = {false};
            if (sf.c.g(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            sf.c.s(getContext(), uri, true, z10, false, null, str, false, true, z12, false);
        }
    }

    public abstract void J(t0 t0Var);

    public final void L() {
        g("preserveWebView");
        this.C0 = true;
        if (this.p0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.t0++;
        }
        t0 t0Var = this.a;
        if (t0Var != null) {
            t0Var.f(null, null);
            this.a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.s0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.v0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.a = null;
        }
    }

    public final void N(int i3, t0 t0Var, Object obj, String str, boolean z10) {
        this.N = i3;
        this.C0 = false;
        boolean z11 = this.p0;
        if (z11) {
            this.t0++;
            this.u0 = z10;
            this.H0 = z10 ? k(str) : null;
        }
        W(t0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i3, boolean z10) {
        JSONObject jSONObject;
        if (z10 || i3 != this.J0) {
            Float valueOf = Float.valueOf(i3 / org.telegram.messenger.g0.p);
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
            this.J0 = i3;
        }
    }

    public final void P(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z10 || !rect2.equals(rect)) {
                Float valueOf = Float.valueOf(rect.left / org.telegram.messenger.g0.p);
                Float valueOf2 = Float.valueOf(rect.top / org.telegram.messenger.g0.p);
                Float valueOf3 = Float.valueOf(rect.right / org.telegram.messenger.g0.p);
                Float valueOf4 = Float.valueOf(rect.bottom / org.telegram.messenger.g0.p);
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
            if (this.H != null) {
                E(this.s0, f(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                E(this.s0, f(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void R(p7 p7Var, ii.n1 n1Var, String str) {
        if (n1Var == null || this.V == null) {
            return;
        }
        boolean z10 = true;
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
                    ArrayList h = n1Var.h(optString);
                    if (h.isEmpty()) {
                        x(p7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    w wVar = new w(this, p7Var, string, n1Var, optString);
                    d2 T = LaunchActivity.T();
                    e6 resourceProvider = T != null ? T.getResourceProvider() : null;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    t2 l10 = k5.l(1, context, resourceProvider, false);
                    LinearLayout f10 = k5.f(context, 1);
                    k9 k9Var = new k9(context);
                    TLRPC.User a22 = hp.s1(n1Var.a).a2(Long.valueOf(n1Var.b));
                    u8 u8Var = new u8((e6) null);
                    u8Var.r(a22);
                    k9Var.e(a22, u8Var);
                    f10.addView(k9Var, mf.t(80, 80, 49, 0, 21, 0, 13));
                    int i3 = k6.G6;
                    Context context2 = context;
                    TextView b10 = rf.b(context2, 20.0f, i3, true, null);
                    b10.setText(bd.M0(2131752990, null));
                    b10.setGravity(17);
                    f10.addView(b10, mf.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = rf.b(context2, 14.0f, i3, false, null);
                    k5.r(null, null, 2131752991, new Object[]{m5.H(null, null, a22)}, b11);
                    b11.setGravity(17);
                    f10.addView(b11, mf.t(-1, -2, 7, 32, 0, 32, 19));
                    y8 y8Var = new y8(context2, resourceProvider);
                    ColorDrawable colorDrawable = new ColorDrawable(-1);
                    y8Var.setBackground(new xp(colorDrawable, k6.X0(context2, R.drawable.greydivider, k6.w0(k6.b7, resourceProvider))));
                    r6.y(y8Var, colorDrawable, k6.a7, resourceProvider, PorterDuff.Mode.SRC_IN);
                    y8Var.setFixedSize(12);
                    f10.addView(y8Var, mf.t(-1, 12, 7, 0, 0, 0, 0));
                    n4 n4Var = new n4(context2, resourceProvider);
                    n4Var.setText(bd.M0(2131752992, null));
                    f10.addView(n4Var, mf.t(-1, -2, 7, 0, 0, 0, 0));
                    gi.d dVar = new gi.d(context2, resourceProvider, true);
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < h.size()) {
                        ii.m1 m1Var = (ii.m1) h.get(i10);
                        boolean z11 = z10;
                        ii.l1 l1Var = new ii.l1(m1Var, i10 < h.size() + (-1) ? z11 : false, context2);
                        int i11 = k6.i6;
                        w wVar2 = wVar;
                        org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i11, resourceProvider), 2, -1);
                        n6 N = r6.N(i11);
                        l1Var.setBackground(h02);
                        r6.k(l1Var, h02, null, N, resourceProvider);
                        LinearLayout linearLayout = f10;
                        l1Var.setOnClickListener(new r4(strArr, m1Var, arrayList, dVar, 3));
                        linearLayout.addView(l1Var, mf.o(-1, 56));
                        arrayList.add(l1Var);
                        i10++;
                        context2 = context2;
                        f10 = linearLayout;
                        z10 = z11;
                        wVar = wVar2;
                        zArr = zArr;
                    }
                    w wVar3 = wVar;
                    boolean[] zArr2 = zArr;
                    LinearLayout linearLayout2 = f10;
                    dVar.i(bd.M0(2131752994, null), false, z10);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, mf.t(-1, 48, 7, 8, 8, 8, 4));
                    l10.O = linearLayout2;
                    l10.P(k6.h5);
                    dVar.setOnClickListener(new r4(zArr2, wVar3, strArr, l10, 4));
                    l10.setOnDismissListener(new h3(3, zArr2, wVar3));
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

    public void T(String str, boolean z10) {
        t0 t0Var = this.a;
        if (t0Var != null) {
            boolean z11 = t0Var.F;
        }
        boolean z12 = t0Var == null || !t0Var.canGoBack();
        t0 t0Var2 = this.a;
        I(z12, t0Var2 == null || !t0Var2.canGoForward());
        t0 t0Var3 = this.a;
        if (t0Var3 != null) {
            t0Var3.b = true;
        }
        if (this.O) {
            g("setPageLoaded: already loaded");
            return;
        }
        d4 d4Var = this.s;
        if (!z10 || t0Var3 == null || d4Var == null) {
            if (t0Var3 != null) {
                t0Var3.setAlpha(1.0f);
            }
            if (d4Var != null) {
                d4Var.setAlpha(0.0f);
                d4Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<t0, Float>) property, 1.0f), ObjectAnimator.ofFloat(d4Var, (Property<d4, Float>) property, 0.0f));
            animatorSet.addListener(new i81(this, 13));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.c.getClass();
    }

    public final void U(p7 p7Var, ii.n1 n1Var, String str, String str2, String str3) {
        if (n1Var == null || this.V == null) {
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
                        n1Var.n(optString, jSONObject.optString("value"));
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

    public final void V() {
        t0 t0Var = this.a;
        if (t0Var == null || !this.p0) {
            return;
        }
        t0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!p9.a("WEB_MESSAGE_LISTENER")) {
            g("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        t0 t0Var2 = this.a;
        if (!t0Var2.S) {
            c5.a.a(t0Var2, "TelegramWebviewProxyMessage", singleton, new e3(t0Var2, 4));
            this.a.S = true;
        }
        if (p9.a("DOCUMENT_START_SCRIPT")) {
            t0 t0Var3 = this.a;
            if (t0Var3.T == null) {
                boolean z10 = c5.a.a;
                if (!d5.l.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                d5.n c2 = c5.a.c(t0Var3);
                t0Var3.T = new c6.i((ScriptHandlerBoundaryInterface) xe.b.a(ScriptHandlerBoundaryInterface.class, c2.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 14);
            }
        }
    }

    public final void W(t0 t0Var, Object obj) {
        t0 t0Var2;
        TLRPC.User user;
        String str = "";
        t0 t0Var3 = this.a;
        if (t0Var3 != null) {
            t0Var3.destroy();
            removeView(this.a);
        }
        if (t0Var != null) {
            org.telegram.messenger.g0.E2(t0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(az.J0 && !r());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (t0Var == null) {
            Context context = getContext();
            boolean z10 = this.p0;
            long j10 = 0;
            if (z10 && (user = this.V) != null) {
                j10 = user.id;
            }
            t0Var2 = new t0(context, z10, j10);
        } else {
            t0Var2 = t0Var;
        }
        this.a = t0Var2;
        if (this.p0) {
            t0Var2.setBackgroundColor(j(k6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.w0;
        }
        if (!hp.s1(this.N).G6) {
            this.a.setLayerType(2, null);
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.E0);
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
        if (!this.p0) {
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
            if (this.p0) {
                PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                int o10 = az.o();
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
        if (t0Var == null && this.p0) {
            this.a.setAlpha(0.0f);
        }
        addView(this.a);
        if (this.p0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.s0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.s0 == null) {
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = new BotWebViewContainer$BotWebViewProxy();
                botWebViewContainer$BotWebViewProxy.a = this;
                this.s0 = botWebViewContainer$BotWebViewProxy;
            }
            this.s0.a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.v0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.v0;
            if (botWebViewContainer$WebViewProxy == null) {
                t0 t0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(t0Var4, this);
                this.v0 = botWebViewContainer$WebViewProxy2;
                t0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (t0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.v0.a = this;
        }
        J(this.a);
        R0 = false;
    }

    public final void X(int i3, org.telegram.ui.ActionBar.s1 s1Var, Runnable runnable) {
        if (s1Var == null || m(i3)) {
            return;
        }
        s1Var.setOnDismissListener(new h3(16, this, runnable));
        this.d0 = s1Var;
        s1Var.k0 = false;
        s1Var.show();
        if (this.M0 != i3) {
            this.M0 = i3;
            this.N0 = 0;
            this.O0 = 0L;
        }
        this.N0++;
    }

    public final void Y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bd.M0(2131743889, "UnknownError"));
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
            t0 t0Var = this.a;
            if (t0Var != null) {
                removeView(t0Var);
            }
        }
    }

    public final void d(p7 p7Var, ii.n1 n1Var, String str, String str2, String str3) {
        if (n1Var == null || this.V == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                n1Var.m(new JSONObject());
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        iv0 iv0Var;
        Uri[] uriArr;
        if (i3 == hs.n4) {
            t0 t0Var = this.a;
            if (t0Var != null) {
                t0Var.setBackgroundColor(j(k6.d6));
            }
            if (!this.r0) {
                int i11 = k6.yj;
                int j10 = j(i11);
                this.q0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                d4 d4Var = this.s;
                d4Var.setColorFilter(porterDuffColorFilter);
                jz jzVar = this.r;
                if (jzVar != null) {
                    jzVar.n = Integer.valueOf(this.q0);
                    this.r.f(i11, this.e, 1.0f, false);
                }
                d4Var.invalidate();
            }
            z();
            return;
        }
        if (i3 != hs.c5) {
            if (i3 == hs.d5) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (iv0Var = this.W) == null) {
                    return;
                }
                iv0Var.run();
                this.W = null;
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.s) {
            if (this.w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
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
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
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
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.V == null) {
            return;
        }
        ii.r rVar = this.k0;
        if (rVar == null) {
            this.k0 = ii.r.c(getContext(), this.N, this.V.id);
        } else {
            rVar.h();
        }
    }

    public final p7 f() {
        t0 t0Var = this.a;
        long j10 = this.t0;
        boolean z10 = this.u0;
        String str = this.H0;
        p7 p7Var = new p7();
        p7Var.c = this;
        p7Var.d = t0Var;
        p7Var.a = j10;
        p7Var.b = z10;
        p7Var.e = str;
        return p7Var;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.s0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof c4)) {
            return 0;
        }
        c4 c4Var = (c4) getParent();
        if (c4Var.K) {
            return (int) ((c4Var.getMeasuredHeight() - c4Var.getOffsetY()) + this.A0);
        }
        return 0;
    }

    public String getOriginHost() {
        t0 t0Var = this.a;
        if (t0Var == null) {
            return null;
        }
        return k(t0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.v0;
    }

    public String getTrustedOrigin() {
        return this.H0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public t0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.C0);
        t0 t0Var = this.a;
        if (t0Var != null) {
            if (t0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.C0) {
                this.a.destroy();
                K(this.a);
            }
            this.O = false;
            if (this.k0 != null) {
                this.k0 = null;
            }
            if (this.n0 != null) {
                this.n0 = null;
            }
            if (this.o0 != null) {
                this.o0 = null;
            }
            ii.s0 s0Var = this.l0;
            if (s0Var != null) {
                s0Var.f.remove(this.L0);
                this.l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void i(String str) {
        new fc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i3) {
        e6 e6Var = this.e;
        return e6Var != null ? e6Var.h(i3) : k6.x0(null, i3, false);
    }

    public final void l(p7 p7Var, ii.n1 n1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (n1Var == null || this.V == null) {
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
                    Pair f10 = n1Var.f(optString);
                    if (!n1Var.d || (obj = f10.first) != null) {
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

    public final boolean m(int i3) {
        if (this.d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
            return true;
        }
        if (this.M0 != i3 || this.N0 <= 3) {
            return false;
        }
        this.O0 = System.currentTimeMillis() + 3000;
        this.N0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.O || z11) && (z12 = this.p0) && (getParent() instanceof c4)) {
            c4 c4Var = (c4) getParent();
            if (z10) {
                this.P = c4Var.getSwipeOffsetY() == c4Var.getTopActionBarOffsetY() + (-c4Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (c4Var.getTopActionBarOffsetY() + ((c4Var.getMeasuredHeight() - c4Var.getOffsetY()) - c4Var.getSwipeOffsetY()) + this.A0));
            if (!z11 && max == this.x0 && this.y0 == z10 && this.z0 == this.P) {
                return;
            }
            this.x0 = max;
            this.y0 = z10;
            this.z0 = this.P;
            String str = "{height:" + (max / org.telegram.messenger.g0.p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.P + "}";
            if (!z12 || q()) {
                hs.f(this.N).d(new a0(this, a1.g.q("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
            } else {
                g("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    public final boolean o(p7 p7Var) {
        boolean z10;
        if (p7Var == null) {
            return false;
        }
        String str = (String) p7Var.e;
        if (((w0) p7Var.c) != this || ((t0) p7Var.d) != this.a || p7Var.a != this.t0 || (z10 = p7Var.b) != this.u0) {
            return false;
        }
        if (z10) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.H0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        hs.e().c(this, hs.n4);
        hs.e().c(this, hs.c5);
        hs.e().c(this, hs.d5);
        setTag(R.id.bulletin_delegate_tag, new ai.h1(this, 11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        hs.e().n(this, hs.n4);
        hs.e().n(this, hs.c5);
        hs.e().n(this, hs.d5);
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = this.B0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        super.onMeasure(i3, i10);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (this.b0) {
            return;
        }
        n(true, false);
    }

    public final boolean q() {
        if (this.a == null) {
            return false;
        }
        if (this.u0) {
            return !TextUtils.isEmpty(this.H0) && TextUtils.equals(this.H0, getOriginHost());
        }
        return true;
    }

    public final boolean r() {
        return this.Q0 != null;
    }

    public final void s(int i3, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
        TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
        String n4 = l10.n(a22);
        d4 d4Var = this.s;
        if (n4 != null && n4.equals("DurgerKingBot")) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            d4Var.h(null, null, kz.h(R.raw.durgerking_placeholder, Integer.valueOf(j(k6.a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(i3).b.bots;
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
            if (tL_attachMenuBot.bot_id == j10) {
                break;
            }
        }
        boolean z10 = true;
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
                tL_attachMenuBotIcon = li.k0(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                d4Var.setVisibility(0);
                d4Var.setAlpha(1.0f);
                d4Var.j(ac.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        e6 e6Var = this.e;
        if (b22 != null && (botInfo = b22.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            jz j11 = kz.j(512, 512, b22.bot_info.app_settings.placeholder_svg_path);
            this.r = j11;
            if (j11 != null) {
                j11.n = Integer.valueOf(this.q0);
                this.r.f(k6.yj, e6Var, 1.0f, false);
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
        jz j12 = kz.j(512, 512, path);
        this.r = j12;
        if (j12 != null) {
            j12.n = Integer.valueOf(this.q0);
            this.r.f(k6.yj, e6Var, 1.0f, false);
        }
        d4Var.h(null, null, this.r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(d0 d0Var) {
        this.c = d0Var;
    }

    public void setFlickerViewColor(int i3) {
        int b10 = org.telegram.messenger.g0.B(i3) > 0.7f ? k6.b(0.0f, -0.15f, i3) : k6.b(0.025f, 0.15f, i3);
        if (this.q0 == b10) {
            return;
        }
        this.q0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        d4 d4Var = this.s;
        d4Var.setColorFilter(porterDuffColorFilter);
        jz jzVar = this.r;
        if (jzVar != null) {
            jzVar.n = Integer.valueOf(this.q0);
            this.r.f(k6.yj, this.e, 1.0f, false);
        }
        this.r0 = true;
        d4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i3) {
        if (this.B0 == i3) {
            return;
        }
        this.B0 = i3;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.S = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.E0 = runnable;
        t0 t0Var = this.a;
        if (t0Var != null) {
            t0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(r10 r10Var) {
        this.Q0 = r10Var;
    }

    public void setOpener(t0 t0Var) {
        t0 t0Var2;
        this.w0 = t0Var;
        if (this.p0 || (t0Var2 = this.a) == null) {
            return;
        }
        t0Var2.f = t0Var;
    }

    public void setParentActivity(Activity activity) {
        this.a0 = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.b0 = z10;
    }

    public void setViewPortHeightOffset(float f10) {
        this.A0 = f10;
    }

    public void setWasOpenedByBot(q4 q4Var) {
        this.G0 = q4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.F0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.x = aVar;
    }

    public void setWebViewScrollListener(v0 v0Var) {
        this.d = v0Var;
        t0 t0Var = this.a;
        if (t0Var != null) {
            t0Var.f(this, v0Var);
        }
    }

    public final void t(int i3, String str, boolean z10) {
        this.N = i3;
        if (this.p0) {
            this.t0++;
            this.u0 = z10;
            this.H0 = z10 ? k(str) : null;
            if (this.a != null) {
                V();
            }
        }
        hs.f(i3).d(new a0(this, str, 1));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        d4 d4Var;
        int j10;
        try {
            if (this.a != null && (j10 = j(k6.d6)) != this.D0) {
                this.D0 = j10;
                this.a.setBackgroundColor(j10);
            }
            if (this.r0 || (d4Var = this.s) == null) {
                return;
            }
            int i3 = this.q0;
            int i10 = k6.yj;
            if (i3 != j(i10)) {
                int j11 = j(i10);
                this.q0 = j11;
                d4Var.setColorFilter(new PorterDuffColorFilter(j11, PorterDuff.Mode.SRC_IN));
                jz jzVar = this.r;
                if (jzVar != null) {
                    jzVar.n = Integer.valueOf(this.q0);
                }
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(p7 p7Var) {
        if (this.V == null) {
            return;
        }
        e();
        ii.r rVar = this.k0;
        if (rVar == null) {
            return;
        }
        try {
            x(p7Var, "biometry_info_received", rVar.f());
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
        if (this.p0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        hs.f(this.N).d(new a0(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = ii.a3.u(this.e, true);
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

    public void H() {
    }

    public void K(t0 t0Var) {
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void D(boolean z10, String str) {
    }

    public void I(boolean z10, boolean z11) {
    }
}
