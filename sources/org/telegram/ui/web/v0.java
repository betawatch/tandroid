package org.telegram.ui.web;

import a8.r9;
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
import bi.e9;
import bi.m2;
import bi.s6;
import c8.na;
import c8.wa;
import di.u9;
import fi.f7;
import fi.t3;
import fi.y7;
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
import ki.d4;
import ki.f4;
import ki.s3;
import ki.t2;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.js;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.q2;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i71;
import org.telegram.ui.l60;
import org.telegram.ui.p9;
import org.telegram.ui.t9;
import org.telegram.ui.yd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class v0 extends FrameLayout implements fs, c6 {
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
    public f4 G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public f7 K0;
    public String L;
    public final q L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public t10 Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public as0 W;
    public s0 a;
    public Activity a0;
    public String b;
    public boolean b0;
    public c0 c;
    public String c0;
    public u0 d;
    public org.telegram.ui.ActionBar.t1 d0;
    public final i6 e;
    public int e0;
    public final TextView f;
    public long f0;
    public long g0;
    public boolean h;
    public p9 h0;
    public boolean i0;
    public String j0;
    public ki.p k0;
    public ki.r0 l0;
    public ki.g0 m0;
    public final org.telegram.ui.Components.voip.n n;
    public ki.k1 n0;
    public ki.k1 o0;
    public final boolean p0;
    public int q0;
    public kz r;
    public boolean r0;
    public final t3 s;
    public BotWebViewContainer$BotWebViewProxy s0;
    public long t0;
    public boolean u0;
    public BotWebViewContainer$WebViewProxy v0;
    public boolean w;
    public s0 w0;
    public q0.a x;
    public int x0;
    public ValueCallback y;
    public boolean y0;
    public boolean z0;

    public v0(int i7, Context context, i6 i6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.n = nVar;
        int i10 = n6.Fi;
        this.E = j(i10);
        int i11 = n6.Ji;
        this.F = j(i11);
        this.G = "";
        this.I = j(i10);
        this.J = j(i11);
        this.K = "";
        this.L = "";
        this.N = i10.t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new q(this, 2);
        this.M0 = -1;
        this.N0 = 0;
        int i12 = S0;
        S0 = i12 + 1;
        this.P0 = i12;
        this.p0 = z10;
        this.e = i6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.a0 = (Activity) context;
        }
        nVar.k = false;
        nVar.b(i7, ks.j2);
        t3 t3Var = new t3(this, context);
        this.s = t3Var;
        int j3 = j(n6.Bj);
        this.q0 = j3;
        t3Var.setColorFilter(new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN));
        t3Var.getImageReceiver().S0 = true;
        addView(t3Var, na.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(gd.N0(2131752901, null));
        u6.U(textView, n6.y6, i6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, na.e(-1, -2, 17));
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
        sb2.append(mp.u1(i10.t0).X5);
        return sb2.toString();
    }

    public static void a(v0 v0Var, String[] strArr, q0.a aVar) {
        v0Var.getClass();
        for (String str : strArr) {
            if (v0Var.getContext().checkSelfPermission(str) != 0) {
                v0Var.W = new as0(v0Var, aVar, strArr, 12);
                Activity activity = v0Var.a0;
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
        if (T0 == null) {
            T0 = new HashMap();
        }
        T0.put(T, K0);
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

    private void setupFlickerParams(boolean z10) {
        this.w = z10;
        t3 t3Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t3Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int L = org.telegram.messenger.g0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        t3Var.requestLayout();
    }

    private void setupWebView(s0 s0Var) {
        X(s0Var, null);
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
        sb2.append(mp.u1(i10.t0).X5);
        return (K0.endsWith(sb2.toString()) && (str2 = (String) T0.get(K0)) != null) ? vf.c.w(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void w(int i7, s0 s0Var, f7 f7Var, String str, JSONObject jSONObject) {
        if (s0Var == null) {
            return;
        }
        ks.f(i7).d(new yd0((Object) s0Var, (Object) f7Var, str, (Object) jSONObject, 28));
    }

    public final boolean D() {
        if (this.a == null || !this.S) {
            return false;
        }
        y("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x07bf, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x07c2, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0e0c  */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x11db  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x11e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final f7 f7Var, String str, String str2) {
        char c10;
        final int i7;
        int i10;
        int i11;
        q2 q2Var;
        p9 p9Var;
        final v0 v0Var;
        final v0 v0Var2;
        f7 f7Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j3;
        int i12;
        TLRPC.User user;
        long j10;
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
        long j11;
        String str11;
        boolean z16;
        if (this.p0) {
            if (this.a == null || this.c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!o(f7Var)) {
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
            q qVar = this.L0;
            long j12 = 1000;
            i6 i6Var = this.e;
            q2 q2Var2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            e3 e3Var = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            q2Var2 = null;
            switch (c11) {
                case 0:
                    if (this.V == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        String string = jSONObject.getString("req_id");
                        String string2 = jSONObject.getString("method");
                        String obj = jSONObject.get("params").toString();
                        int i13 = this.N;
                        s0 s0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = mp.u1(i13).q1(this.V.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i13).sendRequest(invokewebviewcustommethod, new bg.l0(this, string, i13, s0Var, f7Var, 14));
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
                    if (!this.i0 || (p9Var = this.h0) == null) {
                        return;
                    }
                    p9Var.dismiss();
                    return;
                case 2:
                    v(f7Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject2.optString("url"));
                        String optString = jSONObject2.optString("try_browser");
                        if (mp.u1(this.N).E4 == null || !mp.u1(this.N).E4.contains(parse.getScheme())) {
                            return;
                        }
                        H(parse, optString, jSONObject2.optBoolean("try_instant_view"), true, false);
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
                        this.m0 = ki.g0.c(getContext(), this.N, this.V.id);
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        String string3 = jSONObject3.getString("url");
                        String string4 = jSONObject3.getString("file_name");
                        if (this.m0.d(string3) != null) {
                            this.m0.b(string3, string4);
                            x(f7Var, "file_download_requested", A("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = mp.u1(this.N).s1(this.V);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.N).sendRequest(checkdownloadfileparams, new m2(this, f7Var, string3, string4, 19));
                        return;
                    } catch (Exception e12) {
                        a8.f(e12);
                        x(f7Var, "file_download_requested", A("cancelled", "status"));
                        return;
                    }
                case 5:
                    v0Var = this;
                    try {
                        if (v0Var.d0 == null) {
                            if (System.currentTimeMillis() - v0Var.f0 <= 150) {
                                int i14 = v0Var.e0 + 1;
                                v0Var.e0 = i14;
                                if (i14 >= 3) {
                                    v0Var.e0 = 0;
                                    v0Var.g0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - v0Var.g0 > 3000) {
                                JSONObject jSONObject4 = new JSONObject(str2);
                                String optString2 = jSONObject4.optString("title", null);
                                String string5 = jSONObject4.getString("message");
                                JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                                    arrayList.add(new t0(jSONArray.getJSONObject(i15)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final t0 t0Var = (t0) arrayList.get(0);
                                            final int i16 = 0;
                                            alertDialog$Builder.k(t0Var.b, new org.telegram.ui.ActionBar.q1(v0Var) { // from class: org.telegram.ui.web.n
                                                public final /* synthetic */ v0 b;

                                                {
                                                    this.b = v0Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.q1
                                                public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i17) {
                                                    switch (i16) {
                                                        case 0:
                                                            v0 v0Var3 = this.b;
                                                            f7 f7Var3 = f7Var;
                                                            t0 t0Var2 = t0Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            t1Var.dismiss();
                                                            try {
                                                                v0Var3.Q = System.currentTimeMillis();
                                                                v0Var3.x(f7Var3, "popup_closed", new JSONObject().put("button_id", t0Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                a8.g(e13, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            v0 v0Var4 = this.b;
                                                            f7 f7Var4 = f7Var;
                                                            t0 t0Var3 = t0Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            t1Var.dismiss();
                                                            try {
                                                                v0Var4.Q = System.currentTimeMillis();
                                                                v0Var4.x(f7Var4, "popup_closed", new JSONObject().put("button_id", t0Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                a8.g(e14, true);
                                                                return;
                                                            }
                                                        default:
                                                            v0 v0Var5 = this.b;
                                                            f7 f7Var5 = f7Var;
                                                            t0 t0Var4 = t0Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            t1Var.dismiss();
                                                            try {
                                                                v0Var5.Q = System.currentTimeMillis();
                                                                v0Var5.x(f7Var5, "popup_closed", new JSONObject().put("button_id", t0Var4.a));
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
                                        final t0 t0Var2 = (t0) arrayList.get(1);
                                        final int i17 = 1;
                                        alertDialog$Builder.h(t0Var2.b, new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.n
                                            public final /* synthetic */ v0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i172) {
                                                switch (i17) {
                                                    case 0:
                                                        v0 v0Var3 = this.b;
                                                        f7 f7Var3 = f7Var;
                                                        t0 t0Var22 = t0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        t1Var.dismiss();
                                                        try {
                                                            v0Var3.Q = System.currentTimeMillis();
                                                            v0Var3.x(f7Var3, "popup_closed", new JSONObject().put("button_id", t0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        v0 v0Var4 = this.b;
                                                        f7 f7Var4 = f7Var;
                                                        t0 t0Var3 = t0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        t1Var.dismiss();
                                                        try {
                                                            v0Var4.Q = System.currentTimeMillis();
                                                            v0Var4.x(f7Var4, "popup_closed", new JSONObject().put("button_id", t0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            a8.g(e14, true);
                                                            return;
                                                        }
                                                    default:
                                                        v0 v0Var5 = this.b;
                                                        f7 f7Var5 = f7Var;
                                                        t0 t0Var4 = t0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        t1Var.dismiss();
                                                        try {
                                                            v0Var5.Q = System.currentTimeMillis();
                                                            v0Var5.x(f7Var5, "popup_closed", new JSONObject().put("button_id", t0Var4.a));
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
                                        final t0 t0Var3 = (t0) arrayList.get(2);
                                        String str15 = t0Var3.b;
                                        final int i18 = 2;
                                        v0Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.q1 q1Var = new org.telegram.ui.ActionBar.q1(v0Var2) { // from class: org.telegram.ui.web.n
                                                public final /* synthetic */ v0 b;

                                                {
                                                    this.b = v0Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.q1
                                                public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i172) {
                                                    switch (i18) {
                                                        case 0:
                                                            v0 v0Var3 = this.b;
                                                            f7 f7Var3 = f7Var;
                                                            t0 t0Var22 = t0Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            t1Var.dismiss();
                                                            try {
                                                                v0Var3.Q = System.currentTimeMillis();
                                                                v0Var3.x(f7Var3, "popup_closed", new JSONObject().put("button_id", t0Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e132) {
                                                                a8.g(e132, true);
                                                                return;
                                                            }
                                                        case 1:
                                                            v0 v0Var4 = this.b;
                                                            f7 f7Var4 = f7Var;
                                                            t0 t0Var32 = t0Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            t1Var.dismiss();
                                                            try {
                                                                v0Var4.Q = System.currentTimeMillis();
                                                                v0Var4.x(f7Var4, "popup_closed", new JSONObject().put("button_id", t0Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e14) {
                                                                a8.g(e14, true);
                                                                return;
                                                            }
                                                        default:
                                                            v0 v0Var5 = this.b;
                                                            f7 f7Var5 = f7Var;
                                                            t0 t0Var4 = t0Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            t1Var.dismiss();
                                                            try {
                                                                v0Var5.Q = System.currentTimeMillis();
                                                                v0Var5.x(f7Var5, "popup_closed", new JSONObject().put("button_id", t0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e15) {
                                                                a8.g(e15, true);
                                                            }
                                                    }
                                                }
                                            };
                                            f7Var2 = f7Var;
                                            alertDialog$Builder.i(str15, q1Var);
                                        } catch (JSONException e14) {
                                            e = e14;
                                            a8.f(e);
                                            return;
                                        }
                                    } else {
                                        v0Var2 = this;
                                        f7Var2 = f7Var;
                                    }
                                    alertDialog$Builder.j(new bi.k(v0Var2, atomicBoolean, f7Var2, 6));
                                    v0Var2.d0 = alertDialog$Builder.p();
                                    if (arrayList.size() >= 1) {
                                        t0 t0Var4 = (t0) arrayList.get(0);
                                        if (t0Var4.c >= 0 && (textView3 = (TextView) v0Var2.d0.d(-1)) != null) {
                                            textView3.setTextColor(v0Var2.j(t0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        t0 t0Var5 = (t0) arrayList.get(1);
                                        if (t0Var5.c >= 0 && (textView2 = (TextView) v0Var2.d0.d(-2)) != null) {
                                            textView2.setTextColor(v0Var2.j(t0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        t0 t0Var6 = (t0) arrayList.get(2);
                                        if (t0Var6.c < 0 || (textView = (TextView) v0Var2.d0.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(v0Var2.j(t0Var6.c));
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
                    v0Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (v0Var.c0 != null) {
                            v0Var.G(optString3, "cancelled", true);
                            return;
                        }
                        v0Var.c0 = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(v0Var.N).sendRequest(tL_payments_getPaymentForm, new bi.q1(v0Var, optString3, tL_inputInvoiceSlug, 22));
                        return;
                    } catch (JSONException e16) {
                        a8.f(e16);
                        break;
                    }
                case 7:
                    v0Var = this;
                    if (v0Var.V != null && System.currentTimeMillis() - v0Var.Q <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j3 = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            try {
                                i12 = jSONObject5.getInt("duration");
                            } catch (Exception unused) {
                                i12 = 0;
                                user = v0Var.V;
                                if (user != null) {
                                }
                            }
                        } catch (Exception unused2) {
                            j3 = 0;
                        }
                        user = v0Var.V;
                        if (user != null) {
                            v0Var.x(f7Var, "emoji_status_failed", A("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            d4.f(v0Var.N, user, j3, i12, new o(v0Var, f7Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    v0Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", v0Var.K).trim();
                        boolean z17 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : v0Var.I;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : v0Var.J;
                        boolean z18 = jSONObject6.optBoolean("is_progress_visible", false) && z17;
                        boolean z19 = jSONObject6.optBoolean("has_shine_effect", false) && z17;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : v0Var.L;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j10 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j10 = 0;
                        }
                        v0Var.I = parseColor;
                        v0Var.J = parseColor2;
                        v0Var.K = trim;
                        v0Var.L = optString4;
                        v0Var.M = str2;
                        v0Var.c.l(z17, optBoolean, trim, j10, parseColor, parseColor2, z18, z19, optString4);
                        break;
                    } catch (Exception e17) {
                        a8.f(e17);
                        break;
                    }
                    break;
                case '\t':
                    v0Var = this;
                    try {
                        v0Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e18) {
                        a8.f(e18);
                        break;
                    }
                case '\n':
                    v0Var = this;
                    try {
                        if (!v0Var.i0 && v0Var.a0 != null) {
                            v0Var.j0 = new JSONObject(str2).optString("text");
                            v0Var.i0 = true;
                            if (v0Var.a0.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = v0Var.a0;
                                if (activity != null) {
                                    v0Var.h0 = t9.j0(activity, 3, new i5(v0Var));
                                    return;
                                }
                                break;
                            } else {
                                ks.e().a(new js(v0Var, f7Var, 2));
                                v0Var.a0.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
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
                            x(f7Var, "phone_requested", jSONObject7);
                            return;
                        } catch (Exception e20) {
                            a8.f(e20);
                            return;
                        }
                    }
                    final int i19 = this.N;
                    final s0 s0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), i6Var);
                    alertDialog$Builder2.l(gd.M0(2131745224));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String q10 = n10.q(this.V);
                    if (TextUtils.isEmpty(q10)) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131754066)));
                    } else {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.Z(2131754063, q10)));
                    }
                    final boolean z20 = mp.u1(this.N).H0.indexOfKey(this.V.id) >= 0;
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) gd.M0(2131754065));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(gd.M0(2131745265), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.web.t
                        @Override // org.telegram.ui.ActionBar.q1
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i20) {
                            strArr[0] = null;
                            t1Var.dismiss();
                            v0 v0Var3 = v0.this;
                            boolean z21 = z20;
                            int i21 = i19;
                            s0 s0Var3 = s0Var2;
                            f7 f7Var3 = f7Var;
                            if (z21) {
                                mp.u1(v0Var3.N).r5(new kp0(v0Var3, i21, s0Var3, f7Var3, 22), v0Var3.V.id);
                                return;
                            }
                            zy.C(v0Var3.N).r0(xy.g(i10.i(v0Var3.N).f(), v0Var3.V.id, null, null, null, null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                v0.w(i21, s0Var3, f7Var3, "phone_requested", jSONObject8);
                            } catch (Exception e21) {
                                a8.g(e21, true);
                            }
                        }
                    });
                    alertDialog$Builder2.h(gd.M0(2131752577), new l60(22));
                    Y(4, alertDialog$Builder2.a(), new u(strArr, i19, s0Var2, f7Var, 0));
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
                        this.o0 = new ki.k1(i20, i10.i(i20).e(), this.V.id, true);
                    }
                    l(f7Var, this.o0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.l0 == null) {
                        ki.r0 e21 = ki.r0.e(getContext(), this.N, this.V.id);
                        this.l0 = e21;
                        e21.f.add(qVar);
                    }
                    this.K0 = f7Var;
                    qVar.run();
                    return;
                case 15:
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    this.Q = 0L;
                    g2 T = LaunchActivity.T();
                    if (T == null || T.getParentLayout() == null) {
                        return;
                    }
                    r4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(this.V.id));
                    org.telegram.messenger.g0.j3(parentLayout, "botPermissionBiometry");
                    c0 c0Var = this.c;
                    if (c0Var != null) {
                        c0Var.b();
                        return;
                    }
                    return;
                case 16:
                    n(!((getParent() instanceof s3) && ((s3) getParent()).d()), true);
                    return;
                case 17:
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    d4.a(this.N, this.V.id, new o(this, f7Var, 0));
                    return;
                case 18:
                    ki.v0 A = this.c.A();
                    if (A == null || !A.h()) {
                        x(f7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(f7Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.V == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i21 = this.N;
                        this.n0 = new ki.k1(i21, i10.i(i21).e(), this.V.id, false);
                    }
                    V(f7Var, this.n0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.V == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i22 = this.N;
                        this.n0 = new ki.k1(i22, i10.i(i22).e(), this.V.id, false);
                    }
                    l(f7Var, this.n0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    e();
                    ki.p pVar = this.k0;
                    if (pVar == null) {
                        return;
                    }
                    if (pVar.e) {
                        pVar.j(str3, true, null, new fi.b0(2, pVar, new o(this, f7Var, 3)));
                        return;
                    }
                    try {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("status", "failed");
                        x(f7Var, "biometry_auth_requested", jSONObject8);
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
                    c0 c0Var2 = this.c;
                    if (c0Var2 != null) {
                        c0Var2.p(z10);
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
                            if (getParent() instanceof s3) {
                            }
                        }
                    } catch (Exception unused7) {
                        z11 = true;
                    }
                    g("allowScroll " + z11 + " " + z12);
                    if (getParent() instanceof s3) {
                        return;
                    }
                    ((s3) getParent()).a(z11, z12);
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
                    if (this.V == null) {
                        return;
                    }
                    if (this.o0 == null) {
                        getContext();
                        int i23 = this.N;
                        this.o0 = new ki.k1(i23, i10.i(i23).e(), this.V.id, true);
                    }
                    S(f7Var, this.o0, str2);
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
                        if (!mp.u1(this.N).i5()) {
                            new ug.y0((g2) new e9(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(this.a0);
                        new HttpGetFileTask(new v(this, t1Var, str8, str10, str9), null).execute(str7);
                        t1Var.r(250L);
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
                        ki.r0 e28 = ki.r0.e(getContext(), this.N, this.V.id);
                        this.l0 = e28;
                        e28.f.add(qVar);
                    }
                    this.K0 = f7Var;
                    if (this.l0.g()) {
                        this.l0.j(new p(this, f7Var, 0));
                        return;
                    } else {
                        this.l0.i(new o(this, f7Var, 1));
                        return;
                    }
                case 28:
                    ki.v0 A2 = this.c.A();
                    try {
                        j12 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long k10 = Utilities.k(j12, 1000L, 20L);
                    if (A2 == null || !A2.d(k10)) {
                        x(f7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(f7Var, "gyroscope_started", null);
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
                        if (this.F0 && LaunchActivity.H1 != null) {
                            Activity W = org.telegram.messenger.g0.W(getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W == null || W.isFinishing()) {
                                return;
                            }
                            W.moveTaskToBack(true);
                            return;
                        }
                        if (this.G0 == null || (launchActivity = LaunchActivity.H1) == null || launchActivity.N() == null) {
                            return;
                        }
                        f3 N = LaunchActivity.H1.N();
                        ArrayList<e3> tabs = N.getTabs();
                        int i24 = 0;
                        while (true) {
                            if (i24 < tabs.size()) {
                                e3 e3Var2 = tabs.get(i24);
                                if (!this.G0.equals(e3Var2.a) || e3Var2.b == this.a) {
                                    i24++;
                                } else {
                                    e3Var = e3Var2;
                                }
                            }
                        }
                        if (e3Var != null) {
                            N.e(e3Var);
                            return;
                        }
                        return;
                    }
                    return;
                case ks.T /* 30 */:
                    U(this.a.getUrl(), true);
                    return;
                case ks.U /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.Q <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            x(f7Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            return;
                        }
                        x(f7Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                        return;
                    } catch (JSONException e30) {
                        a8.f(e30);
                        return;
                    }
                case ' ':
                    Activity W2 = org.telegram.messenger.g0.W(getContext());
                    if (W2 == null) {
                        W2 = LaunchActivity.H1;
                    }
                    if (W2 != null) {
                        org.telegram.messenger.g0.v1(W2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    ki.v0 A3 = this.c.A();
                    if (A3 == null || !A3.g()) {
                        x(f7Var, "gyroscope_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(f7Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.V == null) {
                        return;
                    }
                    if (this.o0 == null) {
                        getContext();
                        int i25 = this.N;
                        this.o0 = new ki.k1(i25, i10.i(i25).e(), this.V.id, true);
                    }
                    d(f7Var, this.o0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.V == null) {
                        return;
                    }
                    if (this.n0 == null) {
                        getContext();
                        int i26 = this.N;
                        this.n0 = new ki.k1(i26, i10.i(i26).e(), this.V.id, false);
                    }
                    d(f7Var, this.n0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    ki.v0 A4 = this.c.A();
                    try {
                        j12 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long k11 = Utilities.k(j12, 1000L, 20L);
                    if (A4 == null || !A4.c(k11)) {
                        x(f7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(f7Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    ki.v0 A5 = this.c.A();
                    if (A5 == null || !A5.f()) {
                        x(f7Var, "accelerometer_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(f7Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            x(f7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            ki.g1.f1(getContext(), this.N, this.V.id, string7, this.e, new q(this, 0), new bi.h0(this, f7Var, botWebViewContainer$BotWebViewProxy, 9));
                            return;
                        }
                    } catch (Exception e31) {
                        a8.f(e31);
                        x(f7Var, "prepared_message_failed", A("MESSAGE_EXPIRED", "error"));
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
                    P(this.J0, true);
                    return;
                case ')':
                    if (this.V == null || System.currentTimeMillis() - this.Q > 10000) {
                        return;
                    }
                    ri.d0(this.N);
                    long j13 = this.V.id;
                    int i27 = ri.f2;
                    if (ri.C0(i27, j13)) {
                        x(f7Var, "home_screen_added", null);
                        return;
                    } else {
                        ri.d0(this.N).A0(this.V.id, i27, new p(this, f7Var, 2));
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
                        x(f7Var, "fullscreen_changed", B("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z15)));
                        return;
                    } else {
                        x(f7Var, "fullscreen_failed", A(g10, "error"));
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
                        this.o0 = new ki.k1(i29, i10.i(i29).e(), this.V.id, true);
                    }
                    V(f7Var, this.o0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case '-':
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        x(f7Var, "fullscreen_changed", A(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        x(f7Var, "fullscreen_failed", A(g11, "error"));
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
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.web.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    v0.this.Q0.a(Boolean.valueOf(z21), Double.valueOf(d), optString6, Double.valueOf(optDouble));
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
                    g2 T2 = LaunchActivity.T();
                    if (T2 == null || T2.getParentLayout() == null) {
                        return;
                    }
                    r4 parentLayout2 = T2.getParentLayout();
                    T2.presentFragment(ProfileActivity.D4(this.V.id));
                    org.telegram.messenger.g0.j3(parentLayout2, "botPermissionLocation");
                    c0 c0Var3 = this.c;
                    if (c0Var3 != null) {
                        c0Var3.b();
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
                    ki.p pVar2 = this.k0;
                    if (pVar2 == null) {
                        return;
                    }
                    boolean z22 = pVar2.f;
                    if (z22) {
                        v(f7Var);
                        return;
                    }
                    if (pVar2.e) {
                        if (!z22) {
                            pVar2.f = true;
                            pVar2.k();
                        }
                        v(f7Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new org.telegram.ui.Wallet.r(23, this, f7Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), i6Var);
                    if (TextUtils.isEmpty(str12)) {
                        alertDialog$Builder3.l(gd.M0(2131753138));
                        i7 = 0;
                        alertDialog$Builder3.g(org.telegram.messenger.g0.W2(gd.Z(2131753139, n10.q(this.V))));
                    } else {
                        i7 = 0;
                        alertDialog$Builder3.l(org.telegram.messenger.g0.W2(gd.Z(2131753139, n10.q(this.V))));
                        alertDialog$Builder3.g(str12);
                    }
                    alertDialog$Builder3.k(gd.M0(2131754281), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.w
                        public final /* synthetic */ v0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.q1
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i30) {
                            switch (i7) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    v0 v0Var3 = this.b;
                                    ki.p pVar3 = v0Var3.k0;
                                    pVar3.f = true;
                                    pVar3.k();
                                    ki.p pVar4 = v0Var3.k0;
                                    o oVar = new o(v0Var3, f7Var, 2);
                                    pVar4.getClass();
                                    pVar4.j(null, true, null, new fi.b0(2, pVar4, oVar));
                                    break;
                                default:
                                    v0 v0Var4 = this.b;
                                    v0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    ki.p pVar5 = v0Var4.k0;
                                    pVar5.f = true;
                                    pVar5.d = true;
                                    pVar5.k();
                                    v0Var4.v(f7Var);
                                    break;
                            }
                        }
                    });
                    final int i30 = 1;
                    alertDialog$Builder3.h(gd.M0(2131752577), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.web.w
                        public final /* synthetic */ v0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.q1
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i302) {
                            switch (i30) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    v0 v0Var3 = this.b;
                                    ki.p pVar3 = v0Var3.k0;
                                    pVar3.f = true;
                                    pVar3.k();
                                    ki.p pVar4 = v0Var3.k0;
                                    o oVar = new o(v0Var3, f7Var, 2);
                                    pVar4.getClass();
                                    pVar4.j(null, true, null, new fi.b0(2, pVar4, oVar));
                                    break;
                                default:
                                    v0 v0Var4 = this.b;
                                    v0Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    ki.p pVar5 = v0Var4.k0;
                                    pVar5.f = true;
                                    pVar5.d = true;
                                    pVar5.k();
                                    v0Var4.v(f7Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new u9(runnableArr, 10));
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
                                    q2Var2 = q2.y;
                                    break;
                                }
                            } else if (hashCode == 595233003 && optString7.equals("notification")) {
                                String optString8 = jSONObject13.optString("notification_type");
                                int hashCode2 = optString8.hashCode();
                                if (hashCode2 != -1867169789) {
                                    if (hashCode2 != 96784904) {
                                        if (hashCode2 == 1124446108 && optString8.equals("warning")) {
                                            q2Var = q2.x;
                                            q2Var2 = q2Var;
                                            break;
                                        }
                                    } else if (optString8.equals("error")) {
                                        q2Var = q2.s;
                                        q2Var2 = q2Var;
                                    }
                                } else if (optString8.equals("success")) {
                                    q2Var = q2.w;
                                    q2Var2 = q2Var;
                                }
                            }
                            return;
                        }
                        if (optString7.equals("impact")) {
                            String optString9 = jSONObject13.optString("impact_style");
                            switch (optString9.hashCode()) {
                                case -1078030475:
                                    if (optString9.equals("medium")) {
                                        q2Var = q2.f;
                                        q2Var2 = q2Var;
                                        break;
                                    }
                                    break;
                                case 3535914:
                                    if (optString9.equals("soft")) {
                                        q2Var = q2.r;
                                        q2Var2 = q2Var;
                                        break;
                                    }
                                    break;
                                case 99152071:
                                    if (optString9.equals("heavy")) {
                                        q2Var = q2.h;
                                        q2Var2 = q2Var;
                                        break;
                                    }
                                    break;
                                case 102970646:
                                    if (optString9.equals("light")) {
                                        q2Var = q2.e;
                                        q2Var2 = q2Var;
                                        break;
                                    }
                                    break;
                                case 108511787:
                                    if (optString9.equals("rigid")) {
                                        q2Var = q2.n;
                                        q2Var2 = q2Var;
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
                case ks.o0 /* 51 */:
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
                            j11 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused13) {
                            j11 = 0;
                        }
                        this.E = parseColor3;
                        this.F = parseColor4;
                        this.G = trim2;
                        this.H = str2;
                        this.c.q(z23, optBoolean4, trim2, j11, parseColor3, parseColor4, z24, z25);
                        return;
                    } catch (Exception e37) {
                        a8.f(e37);
                        return;
                    }
                case ks.p0 /* 52 */:
                    try {
                        this.c.y(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        return;
                    } catch (JSONException e38) {
                        a8.f(e38);
                        return;
                    }
                case ks.q0 /* 53 */:
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
                case ks.r0 /* 54 */:
                    if (this.V == null || Build.VERSION.SDK_INT < 26) {
                        str11 = "unsupported";
                    } else {
                        ri.d0(this.N);
                        str11 = ri.C0(ri.f2, this.V.id) ? "added" : "missed";
                    }
                    x(f7Var, "home_screen_checked", A(str11, "status"));
                    return;
                case ks.s0 /* 55 */:
                    try {
                        str13 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e40) {
                        a8.f(e40);
                    }
                    if (str13 == null) {
                        return;
                    }
                    TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                    getrequestedwebviewbutton.bot = mp.u1(this.N).s1(this.V);
                    getrequestedwebviewbutton.webapp_req_id = str13;
                    ConnectionsManager.getInstance(this.N).sendRequestTyped(getrequestedwebviewbutton, new d3.b(2), new s(this, f7Var, str13, 0));
                    return;
                case ks.t0 /* 56 */:
                    ki.v0 A6 = this.c.A();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j12 = jSONObject15.getLong("refresh_rate");
                        z16 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused14) {
                        z16 = false;
                    }
                    long k12 = Utilities.k(j12, 1000L, 20L);
                    if (A6 == null || !A6.e(k12, z16)) {
                        x(f7Var, "device_orientation_failed", A("UNSUPPORTED", "error"));
                        return;
                    } else {
                        x(f7Var, "device_orientation_started", null);
                        return;
                    }
                case ks.u0 /* 57 */:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str14 = jSONObject16.getString("reason");
                        } catch (Exception unused15) {
                        }
                        e();
                        ki.p pVar3 = this.k0;
                        if (pVar3 == null) {
                            return;
                        }
                        if (pVar3.e) {
                            pVar3.l(str14, string8, new bi.j(this, string8, f7Var, 15));
                            return;
                        }
                        try {
                            JSONObject jSONObject17 = new JSONObject();
                            jSONObject17.put("status", "failed");
                            x(f7Var, "biometry_token_updated", jSONObject17);
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
                case ks.v0 /* 58 */:
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        boolean isEmpty = TextUtils.isEmpty(optString10);
                        int w02 = isEmpty ? n6.w0(n6.a7, i6Var) : Color.parseColor(optString10);
                        c0 c0Var4 = this.c;
                        if (c0Var4 != null) {
                            if (isEmpty) {
                                c0Var4.x(w02);
                                return;
                            } else {
                                c0Var4.r(w02);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e43) {
                        a8.f(e43);
                        return;
                    }
                case ks.w0 /* 59 */:
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
                                i10 = n6.a7;
                                i11 = i10;
                            }
                            i11 = -1;
                        } else {
                            if (optString12.equals("bg_color")) {
                                i10 = n6.d6;
                                i11 = i10;
                            }
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            this.c.u(i11, n6.w0(i11, i6Var), false);
                            return;
                        }
                        return;
                    } catch (Exception e44) {
                        a8.f(e44);
                        return;
                    }
                case ks.x0 /* 60 */:
                    Q(this.I0, true);
                    return;
                case ks.y0 /* 61 */:
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        return;
                    } catch (Exception e45) {
                        a8.f(e45);
                        return;
                    }
                case ks.z0 /* 62 */:
                    if (!m(3)) {
                        int i31 = this.N;
                        s0 s0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = mp.u1(this.N).s1(this.V);
                        ConnectionsManager.getInstance(this.N).sendRequest(cansendmessage, new y7(this, i31, s0Var3, f7Var, 8));
                        return;
                    }
                    try {
                        JSONObject jSONObject19 = new JSONObject();
                        jSONObject19.put("status", "cancelled");
                        x(f7Var, "write_access_requested", jSONObject19);
                        return;
                    } catch (Exception e46) {
                        a8.f(e46);
                        return;
                    }
                case ks.A0 /* 63 */:
                    this.c.s();
                    return;
                default:
                    a8.b("unknown webapp event ".concat(str));
                    return;
            }
        }
    }

    public final void G(String str, String str2, boolean z10) {
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

    public final void H(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.Q <= 10000 || !z11) {
            this.Q = 0L;
            boolean[] zArr = {false};
            if (vf.c.g(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            vf.c.s(getContext(), uri, true, z10, false, null, str, false, true, z12, false);
        }
    }

    public abstract void K(s0 s0Var);

    public final void M() {
        g("preserveWebView");
        this.C0 = true;
        if (this.p0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.t0++;
        }
        s0 s0Var = this.a;
        if (s0Var != null) {
            s0Var.f(null, null);
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

    public final void O(int i7, s0 s0Var, Object obj, String str, boolean z10) {
        this.N = i7;
        this.C0 = false;
        boolean z11 = this.p0;
        if (z11) {
            this.t0++;
            this.u0 = z10;
            this.H0 = z10 ? k(str) : null;
        }
        X(s0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i7, boolean z10) {
        if (z10 || i7 != this.J0) {
            y("content_safe_area_changed", C("left", 0, "top", Float.valueOf(i7 / org.telegram.messenger.g0.p), "right", 0, "bottom", 0));
            this.J0 = i7;
        }
    }

    public final void Q(Rect rect, boolean z10) {
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z10 || !rect2.equals(rect)) {
                y("safe_area_changed", C("left", Float.valueOf(rect.left / org.telegram.messenger.g0.p), "top", Float.valueOf(rect.top / org.telegram.messenger.g0.p), "right", Float.valueOf(rect.right / org.telegram.messenger.g0.p), "bottom", Float.valueOf(rect.bottom / org.telegram.messenger.g0.p)));
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.H != null) {
                F(this.s0, f(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                F(this.s0, f(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(f7 f7Var, ki.k1 k1Var, String str) {
        if (k1Var == null || this.V == null) {
            return;
        }
        boolean z10 = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    x(f7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = k1Var.h(optString);
                    if (h.isEmpty()) {
                        x(f7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    v vVar = new v(this, f7Var, string, k1Var, optString);
                    g2 T = LaunchActivity.T();
                    i6 resourceProvider = T != null ? T.getResourceProvider() : null;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    w2 j3 = org.telegram.messenger.f3.j(1, context, resourceProvider, false);
                    LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                    TLRPC.User c22 = mp.u1(k1Var.a).c2(Long.valueOf(k1Var.b));
                    a9 a9Var = new a9((i6) null);
                    a9Var.r(c22);
                    p9Var.f(c22, a9Var);
                    g10.addView(p9Var, na.t(80, 80, 49, 0, 21, 0, 13));
                    int i7 = n6.G6;
                    Context context2 = context;
                    TextView b10 = wa.b(context2, 20.0f, i7, true, null);
                    b10.setText(gd.N0(2131752978, null));
                    b10.setGravity(17);
                    g10.addView(b10, na.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = wa.b(context2, 14.0f, i7, false, null);
                    org.telegram.messenger.f3.q(null, null, 2131752979, new Object[]{n5.H(null, null, c22)}, b11);
                    b11.setGravity(17);
                    g10.addView(b11, na.t(-1, -2, 7, 32, 0, 32, 19));
                    z8 z8Var = new z8(context2, resourceProvider);
                    ColorDrawable colorDrawable = new ColorDrawable(-1);
                    z8Var.setBackground(new lq(colorDrawable, n6.X0(context2, R.drawable.greydivider, n6.w0(n6.b7, resourceProvider))));
                    u6.x(z8Var, colorDrawable, n6.a7, resourceProvider, PorterDuff.Mode.SRC_IN);
                    z8Var.setFixedSize(12);
                    g10.addView(z8Var, na.t(-1, 12, 7, 0, 0, 0, 0));
                    o4 o4Var = new o4(context2, resourceProvider);
                    o4Var.setText(gd.N0(2131752980, null));
                    g10.addView(o4Var, na.t(-1, -2, 7, 0, 0, 0, 0));
                    hi.e eVar = new hi.e(context2, resourceProvider, true);
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < h.size()) {
                        ki.j1 j1Var = (ki.j1) h.get(i10);
                        boolean z11 = z10;
                        ki.i1 i1Var = new ki.i1(j1Var, i10 < h.size() + (-1) ? z11 : false, context2);
                        int i11 = n6.i6;
                        v vVar2 = vVar;
                        org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i11, resourceProvider), 2, -1);
                        q6 M = u6.M(i11);
                        i1Var.setBackground(h02);
                        u6.j(i1Var, h02, null, M, resourceProvider);
                        LinearLayout linearLayout = g10;
                        i1Var.setOnClickListener(new s6(strArr, j1Var, arrayList, eVar, 3));
                        linearLayout.addView(i1Var, na.o(-1, 56));
                        arrayList.add(i1Var);
                        i10++;
                        context2 = context2;
                        g10 = linearLayout;
                        z10 = z11;
                        vVar = vVar2;
                        zArr = zArr;
                    }
                    v vVar3 = vVar;
                    boolean[] zArr2 = zArr;
                    LinearLayout linearLayout2 = g10;
                    eVar.i(gd.N0(2131752982, null), false, z10);
                    eVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(eVar, na.t(-1, 48, 7, 8, 8, 8, 4));
                    j3.O = linearLayout2;
                    j3.Q(n6.h5);
                    eVar.setOnClickListener(new s6(zArr2, vVar3, strArr, j3, 4));
                    j3.setOnDismissListener(new di.u1(5, zArr2, vVar3));
                    j3.show();
                } catch (Exception e10) {
                    x(f7Var, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception unused) {
                x(f7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(f7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void U(String str, boolean z10) {
        s0 s0Var = this.a;
        if (s0Var != null) {
            boolean z11 = s0Var.F;
        }
        boolean z12 = s0Var == null || !s0Var.canGoBack();
        s0 s0Var2 = this.a;
        J(z12, s0Var2 == null || !s0Var2.canGoForward());
        s0 s0Var3 = this.a;
        if (s0Var3 != null) {
            s0Var3.b = true;
        }
        if (this.O) {
            g("setPageLoaded: already loaded");
            return;
        }
        t3 t3Var = this.s;
        if (!z10 || s0Var3 == null || t3Var == null) {
            if (s0Var3 != null) {
                s0Var3.setAlpha(1.0f);
            }
            if (t3Var != null) {
                t3Var.setAlpha(0.0f);
                t3Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<s0, Float>) property, 1.0f), ObjectAnimator.ofFloat(t3Var, (Property<t3, Float>) property, 0.0f));
            animatorSet.addListener(new i71(this, 14));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.c.getClass();
    }

    public final void V(f7 f7Var, ki.k1 k1Var, String str, String str2, String str3) {
        if (k1Var == null || this.V == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        k1Var.n(optString, jSONObject.optString("value"));
                        x(f7Var, str2, A(string, "req_id"));
                    } catch (RuntimeException e10) {
                        x(f7Var, str3, B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(f7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(f7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void W() {
        s0 s0Var = this.a;
        if (s0Var == null || !this.p0) {
            return;
        }
        s0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!r9.a("WEB_MESSAGE_LISTENER")) {
            g("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        s0 s0Var2 = this.a;
        if (!s0Var2.S) {
            d5.b.a(s0Var2, "TelegramWebviewProxyMessage", singleton, new org.telegram.tgnet.g(s0Var2, 12));
            this.a.S = true;
        }
        if (r9.a("DOCUMENT_START_SCRIPT")) {
            s0 s0Var3 = this.a;
            if (s0Var3.T == null) {
                boolean z10 = d5.b.a;
                if (!e5.k.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                e5.m c10 = d5.b.c(s0Var3);
                s0Var3.T = new cb.c((ScriptHandlerBoundaryInterface) af.b.a(ScriptHandlerBoundaryInterface.class, c10.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 18);
            }
        }
    }

    public final void X(s0 s0Var, Object obj) {
        s0 s0Var2;
        TLRPC.User user;
        String str = "";
        s0 s0Var3 = this.a;
        if (s0Var3 != null) {
            s0Var3.destroy();
            removeView(this.a);
        }
        if (s0Var != null) {
            org.telegram.messenger.g0.E2(s0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(bz.J0 && !r());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (s0Var == null) {
            Context context = getContext();
            boolean z10 = this.p0;
            long j3 = 0;
            if (z10 && (user = this.V) != null) {
                j3 = user.id;
            }
            s0Var2 = new s0(context, z10, j3);
        } else {
            s0Var2 = s0Var;
        }
        this.a = s0Var2;
        if (this.p0) {
            s0Var2.setBackgroundColor(j(n6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.w0;
        }
        if (!mp.u1(this.N).J6) {
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
                int o4 = bz.o();
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
        if (s0Var == null && this.p0) {
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
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.v0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.v0;
            if (botWebViewContainer$WebViewProxy == null) {
                s0 s0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(s0Var4, this);
                this.v0 = botWebViewContainer$WebViewProxy2;
                s0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (s0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.v0.a = this;
        }
        K(this.a);
        R0 = false;
    }

    public final void Y(int i7, org.telegram.ui.ActionBar.t1 t1Var, Runnable runnable) {
        if (t1Var == null || m(i7)) {
            return;
        }
        t1Var.setOnDismissListener(new di.u1(14, this, runnable));
        this.d0 = t1Var;
        t1Var.k0 = false;
        t1Var.show();
        if (this.M0 != i7) {
            this.M0 = i7;
            this.N0 = 0;
            this.O0 = 0L;
        }
        this.N0++;
    }

    public final void Z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gd.N0(2131743632, "UnknownError"));
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
            s0 s0Var = this.a;
            if (s0Var != null) {
                removeView(s0Var);
            }
        }
    }

    public final void d(f7 f7Var, ki.k1 k1Var, String str, String str2, String str3) {
        if (k1Var == null || this.V == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                k1Var.m(new JSONObject());
                x(f7Var, str2, A(string, "req_id"));
            } catch (RuntimeException e10) {
                x(f7Var, str3, B("req_id", string, "error", e10.getMessage()));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(f7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        as0 as0Var;
        Uri[] uriArr;
        if (i7 == ks.q4) {
            s0 s0Var = this.a;
            if (s0Var != null) {
                s0Var.setBackgroundColor(j(n6.d6));
            }
            if (!this.r0) {
                int i11 = n6.Bj;
                int j3 = j(i11);
                this.q0 = j3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN);
                t3 t3Var = this.s;
                t3Var.setColorFilter(porterDuffColorFilter);
                kz kzVar = this.r;
                if (kzVar != null) {
                    kzVar.n = Integer.valueOf(this.q0);
                    this.r.f(i11, this.e, 1.0f, false);
                }
                t3Var.invalidate();
            }
            z();
            return;
        }
        if (i7 != ks.f5) {
            if (i7 == ks.g5) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (as0Var = this.W) == null) {
                    return;
                }
                as0Var.run();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.s) {
            if (this.w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
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
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
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
        if (this.V == null) {
            return;
        }
        ki.p pVar = this.k0;
        if (pVar == null) {
            this.k0 = ki.p.c(getContext(), this.N, this.V.id);
        } else {
            pVar.h();
        }
    }

    public final f7 f() {
        s0 s0Var = this.a;
        long j3 = this.t0;
        boolean z10 = this.u0;
        String str = this.H0;
        f7 f7Var = new f7();
        f7Var.c = this;
        f7Var.d = s0Var;
        f7Var.a = j3;
        f7Var.b = z10;
        f7Var.e = str;
        return f7Var;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.s0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof s3)) {
            return 0;
        }
        s3 s3Var = (s3) getParent();
        if (s3Var.K) {
            return (int) ((s3Var.getMeasuredHeight() - s3Var.getOffsetY()) + this.A0);
        }
        return 0;
    }

    public String getOriginHost() {
        s0 s0Var = this.a;
        if (s0Var == null) {
            return null;
        }
        return k(s0Var.getUrl());
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

    public s0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.C0);
        s0 s0Var = this.a;
        if (s0Var != null) {
            if (s0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.C0) {
                this.a.destroy();
                L(this.a);
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
            ki.r0 r0Var = this.l0;
            if (r0Var != null) {
                r0Var.f.remove(this.L0);
                this.l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void i(String str) {
        new kc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i7) {
        i6 i6Var = this.e;
        return i6Var != null ? i6Var.i(i7) : n6.x0(null, i7, false);
    }

    public final void l(f7 f7Var, ki.k1 k1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (k1Var == null || this.V == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f10 = k1Var.f(optString);
                    if (!k1Var.d || (obj = f10.first) != null) {
                        x(f7Var, str2, B("req_id", string, "value", f10.first));
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
                    x(f7Var, str2, jSONObject);
                } catch (RuntimeException e10) {
                    x(f7Var, str3, B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception unused2) {
                x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            if (TextUtils.isEmpty("")) {
                return;
            }
            x(f7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean m(int i7) {
        if (this.d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
            return true;
        }
        if (this.M0 != i7 || this.N0 <= 3) {
            return false;
        }
        this.O0 = System.currentTimeMillis() + 3000;
        this.N0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.O || z11) && (z12 = this.p0) && (getParent() instanceof s3)) {
            s3 s3Var = (s3) getParent();
            if (z10) {
                this.P = s3Var.getSwipeOffsetY() == s3Var.getTopActionBarOffsetY() + (-s3Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (s3Var.getTopActionBarOffsetY() + ((s3Var.getMeasuredHeight() - s3Var.getOffsetY()) - s3Var.getSwipeOffsetY()) + this.A0));
            if (!z11 && max == this.x0 && this.y0 == z10 && this.z0 == this.P) {
                return;
            }
            this.x0 = max;
            this.y0 = z10;
            this.z0 = this.P;
            String str = "{height:" + (max / org.telegram.messenger.g0.p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.P + "}";
            if (!z12 || q()) {
                ks.f(this.N).d(new z(this, a8.p0.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
            } else {
                g("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    public final boolean o(f7 f7Var) {
        boolean z10;
        if (f7Var == null) {
            return false;
        }
        String str = (String) f7Var.e;
        if (((v0) f7Var.c) != this || ((s0) f7Var.d) != this.a || f7Var.a != this.t0 || (z10 = f7Var.b) != this.u0) {
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
        ks.e().c(this, ks.q4);
        ks.e().c(this, ks.f5);
        ks.e().c(this, ks.g5);
        setTag(R.id.bulletin_delegate_tag, new bi.i1(this, 11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        ks.e().n(this, ks.q4);
        ks.e().n(this, ks.f5);
        ks.e().n(this, ks.g5);
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.B0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
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

    public final void s(int i7, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
        TLRPC.UserFull d2 = mp.u1(i7).d2(j3);
        String o4 = n10.o(c22);
        t3 t3Var = this.s;
        if (o4 != null && o4.equals("DurgerKingBot")) {
            t3Var.setVisibility(0);
            t3Var.setAlpha(1.0f);
            t3Var.h(null, null, lz.h(R.raw.durgerking_placeholder, Integer.valueOf(j(n6.a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(i7).b.bots;
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
                tL_attachMenuBotIcon = ri.m0(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                t3Var.setVisibility(0);
                t3Var.setAlpha(1.0f);
                t3Var.j(fc.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        i6 i6Var = this.e;
        if (d2 != null && (botInfo = d2.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            t3Var.setVisibility(0);
            t3Var.setAlpha(1.0f);
            kz j10 = lz.j(512, 512, d2.bot_info.app_settings.placeholder_svg_path);
            this.r = j10;
            if (j10 != null) {
                j10.n = Integer.valueOf(this.q0);
                this.r.f(n6.Bj, i6Var, 1.0f, false);
            }
            t3Var.h(null, null, this.r);
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
        t3Var.setVisibility(0);
        t3Var.setAlpha(1.0f);
        kz j11 = lz.j(512, 512, path);
        this.r = j11;
        if (j11 != null) {
            j11.n = Integer.valueOf(this.q0);
            this.r.f(n6.Bj, i6Var, 1.0f, false);
        }
        t3Var.h(null, null, this.r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(c0 c0Var) {
        this.c = c0Var;
    }

    public void setFlickerViewColor(int i7) {
        int b10 = org.telegram.messenger.g0.B(i7) > 0.7f ? n6.b(0.0f, -0.15f, i7) : n6.b(0.025f, 0.15f, i7);
        if (this.q0 == b10) {
            return;
        }
        this.q0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        t3 t3Var = this.s;
        t3Var.setColorFilter(porterDuffColorFilter);
        kz kzVar = this.r;
        if (kzVar != null) {
            kzVar.n = Integer.valueOf(this.q0);
            this.r.f(n6.Bj, this.e, 1.0f, false);
        }
        this.r0 = true;
        t3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i7) {
        if (this.B0 == i7) {
            return;
        }
        this.B0 = i7;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.S = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.E0 = runnable;
        s0 s0Var = this.a;
        if (s0Var != null) {
            s0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(t10 t10Var) {
        this.Q0 = t10Var;
    }

    public void setOpener(s0 s0Var) {
        s0 s0Var2;
        this.w0 = s0Var;
        if (this.p0 || (s0Var2 = this.a) == null) {
            return;
        }
        s0Var2.f = s0Var;
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

    public void setWasOpenedByBot(f4 f4Var) {
        this.G0 = f4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.F0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.x = aVar;
    }

    public void setWebViewScrollListener(u0 u0Var) {
        this.d = u0Var;
        s0 s0Var = this.a;
        if (s0Var != null) {
            s0Var.f(this, u0Var);
        }
    }

    public final void t(int i7, String str, boolean z10) {
        this.N = i7;
        if (this.p0) {
            this.t0++;
            this.u0 = z10;
            this.H0 = z10 ? k(str) : null;
            if (this.a != null) {
                W();
            }
        }
        ks.f(i7).d(new z(this, str, 1));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        t3 t3Var;
        int j3;
        try {
            if (this.a != null && (j3 = j(n6.d6)) != this.D0) {
                this.D0 = j3;
                this.a.setBackgroundColor(j3);
            }
            if (this.r0 || (t3Var = this.s) == null) {
                return;
            }
            int i7 = this.q0;
            int i10 = n6.Bj;
            if (i7 != j(i10)) {
                int j10 = j(i10);
                this.q0 = j10;
                t3Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
                kz kzVar = this.r;
                if (kzVar != null) {
                    kzVar.n = Integer.valueOf(this.q0);
                }
                t3Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(f7 f7Var) {
        if (this.V == null) {
            return;
        }
        e();
        ki.p pVar = this.k0;
        if (pVar == null) {
            return;
        }
        try {
            x(f7Var, "biometry_info_received", pVar.f());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void x(f7 f7Var, String str, JSONObject jSONObject) {
        if (o(f7Var)) {
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
        ks.f(this.N).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = t2.u(this.e, true);
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

    public void L(s0 s0Var) {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void E(boolean z10, String str) {
    }

    public void J(boolean z10, boolean z11) {
    }
}
