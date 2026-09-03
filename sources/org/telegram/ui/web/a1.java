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
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.c6;
import lh.u3;
import oh.a4;
import oh.b8;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cl0;
import org.telegram.ui.r9;
import org.telegram.ui.sb0;
import org.telegram.ui.ss0;
import org.telegram.ui.v9;
import sh.m3;
import sh.w3;
import sh.y3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class a1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean J0 = true;
    public static int K0;
    public static HashMap L0;
    public String A0;
    public int B;
    public final Rect B0;
    public String C;
    public int C0;
    public String D;
    public final u D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public String G;
    public long G0;
    public String H;
    public final int H0;
    public String I;
    public Utilities.Callback4 I0;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public TLRPC.User R;
    public n71 S;
    public Activity T;
    public boolean U;
    public String V;
    public org.telegram.ui.ActionBar.d2 W;
    public x0 a;
    public int a0;
    public String b;
    public long b0;
    public f0 c;
    public long c0;
    public z0 d;
    public r9 d0;
    public final g6 e;
    public boolean e0;
    public final TextView f;
    public String f0;
    public sh.p g0;
    public boolean h;
    public sh.q0 h0;
    public sh.h0 i0;
    public sh.i1 j0;
    public sh.i1 k0;
    public final boolean l0;
    public int m0;
    public final org.telegram.ui.Components.voip.h n;
    public boolean n0;
    public BotWebViewContainer$BotWebViewProxy o0;
    public BotWebViewContainer$WebViewProxy p0;
    public x0 q0;
    public SvgHelper.SvgDrawable r;
    public int r0;
    public final a4 s;
    public boolean s0;
    public boolean t0;
    public float u0;
    public boolean v;
    public int v0;
    public q0.a w;
    public boolean w0;
    public ValueCallback x;
    public Runnable x0;
    public int y;
    public boolean y0;
    public y3 z0;

    public a1(int i10, Context context, g6 g6Var, boolean z4) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n = hVar;
        int i11 = k6.Oh;
        this.y = j(i11);
        int i12 = k6.Sh;
        this.B = j(i12);
        this.C = "";
        this.E = j(i11);
        this.F = j(i12);
        this.G = "";
        this.H = "";
        this.J = UserConfig.selectedAccount;
        this.v0 = -1;
        this.B0 = new Rect(0, 0, 0, 0);
        this.C0 = 0;
        this.D0 = new u(this, 1);
        this.E0 = -1;
        this.F0 = 0;
        int i13 = K0;
        K0 = i13 + 1;
        this.H0 = i13;
        this.l0 = z4;
        this.e = g6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.T = (Activity) context;
        }
        hVar.k = false;
        hVar.b(i10, 153);
        a4 a4Var = new a4(this, context);
        this.s = a4Var;
        int j10 = j(k6.Ki);
        this.m0 = j10;
        a4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        a4Var.getImageReceiver().setAspectFit(true);
        addView(a4Var, c6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(k6.y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, c6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(af.g.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static String N(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < split.length; i10++) {
            if (i10 > 0) {
                sb.append("-d");
            }
            sb.append(split[i10].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb.toString();
    }

    public static void a(a1 a1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            a1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else {
            if (a1Var.d(strArr)) {
                aVar.accept(Boolean.TRUE);
                return;
            }
            a1Var.S = new n71(a1Var, aVar, strArr, 3);
            Activity activity = a1Var.T;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        if (!o(Uri.parse(str))) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        try {
            hostAuthority = IDN.toASCII(hostAuthority, 1);
        } catch (Exception unused) {
        }
        String N = N(hostAuthority);
        if (L0 == null) {
            L0 = new HashMap();
        }
        L0.put(N, hostAuthority);
        return af.g.v(Uri.parse(str), "https", null, N, null);
    }

    public static String k(String str) {
        if (str != null && !str.isEmpty()) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (scheme != null && host != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append("://");
                sb.append(host);
                if (port != 0 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb.append(":");
                    sb.append(port);
                }
                return sb.toString();
            }
        }
        return null;
    }

    public static boolean o(Uri uri) {
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

    public static String s(String str) {
        String str2;
        if (L0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb.toString()) && (str2 = (String) L0.get(hostAuthority)) != null) ? af.g.v(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    private void setupFlickerParams(boolean z4) {
        this.v = z4;
        a4 a4Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a4Var.getLayoutParams();
        layoutParams.gravity = z4 ? 17 : 48;
        if (z4) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        a4Var.requestLayout();
    }

    private void setupWebView(x0 x0Var) {
        Q(x0Var, null);
    }

    public static void u(int i10, x0 x0Var, String str, JSONObject jSONObject) {
        if (x0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new n71(x0Var, str, jSONObject, 2));
    }

    public static JSONObject x(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject y(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x07ba, code lost:
    
        r13.vibrate();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x11ba  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x11c6  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x0df7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, String str, String str2) {
        char c3;
        boolean z4;
        boolean z10;
        JSONArray jSONArray;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        final int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        LaunchActivity launchActivity;
        String str3;
        TextView textView;
        TextView textView2;
        TextView textView3;
        r9 r9Var;
        long j10;
        int i13;
        TLRPC.User user;
        long j11;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        JSONObject jSONObject;
        boolean z13;
        long j12;
        boolean z14;
        if (this.l0) {
            if (this.a == null || this.c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (this.A0 != null && !TextUtils.equals(getOriginHost(), this.A0)) {
                g("onEventReceived ignore " + str);
            }
            g("onEventReceived " + str);
            str.getClass();
            switch (str.hashCode()) {
                case -2016939055:
                    if (str.equals("web_app_invoke_custom_method")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1898902656:
                    if (str.equals("web_app_close_scan_qr_popup")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1736707758:
                    if (str.equals("web_app_biometry_get_info")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1717314938:
                    if (str.equals("web_app_open_link")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1715704462:
                    if (str.equals("web_app_request_file_download")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1693280352:
                    if (str.equals("web_app_open_popup")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1390641887:
                    if (str.equals("web_app_open_invoice")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1385387727:
                    if (str.equals("web_app_set_emoji_status")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1353432696:
                    if (str.equals("web_app_setup_secondary_button")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1341039673:
                    if (str.equals("web_app_setup_closing_behavior")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1309122684:
                    if (str.equals("web_app_open_scan_qr_popup")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1263619595:
                    if (str.equals("web_app_request_phone")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1259935152:
                    if (str.equals("web_app_request_theme")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1229296877:
                    if (str.equals("web_app_secure_storage_get_key")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1183558219:
                    if (str.equals("web_app_check_location")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1093591555:
                    if (str.equals("web_app_biometry_open_settings")) {
                        c3 = 15;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -921083201:
                    if (str.equals("web_app_request_viewport")) {
                        c3 = 16;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -907261345:
                    if (str.equals("web_app_request_emoji_status_access")) {
                        c3 = 17;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -620103109:
                    if (str.equals("web_app_stop_device_orientation")) {
                        c3 = 18;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -585008607:
                    if (str.equals("web_app_device_storage_save_key")) {
                        c3 = 19;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -581005326:
                    if (str.equals("web_app_device_storage_get_key")) {
                        c3 = 20;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -512688845:
                    if (str.equals("web_app_biometry_request_auth")) {
                        c3 = 21;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -498118340:
                    if (str.equals("web_app_toggle_orientation_lock")) {
                        c3 = 22;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -474676372:
                    if (str.equals("web_app_allow_scroll")) {
                        c3 = 23;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -439770054:
                    if (str.equals("web_app_open_tg_link")) {
                        c3 = 24;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -293897269:
                    if (str.equals("web_app_secure_storage_restore_key")) {
                        c3 = 25;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -244584646:
                    if (str.equals("web_app_share_to_story")) {
                        c3 = 26;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -216725042:
                    if (str.equals("web_app_request_location")) {
                        c3 = 27;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -111186465:
                    if (str.equals("web_app_start_gyroscope")) {
                        c3 = 28;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -71726289:
                    if (str.equals("web_app_close")) {
                        c3 = 29;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -58095910:
                    if (str.equals("web_app_ready")) {
                        c3 = 30;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 22015443:
                    if (str.equals("web_app_read_text_from_clipboard")) {
                        c3 = 31;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 127735931:
                    if (str.equals("web_app_hide_keyboard")) {
                        c3 = ' ';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 189207985:
                    if (str.equals("web_app_stop_gyroscope")) {
                        c3 = '!';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 267846314:
                    if (str.equals("web_app_secure_storage_clear")) {
                        c3 = '\"';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 348967753:
                    if (str.equals("web_app_device_storage_clear")) {
                        c3 = '#';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 420328489:
                    if (str.equals("web_app_start_accelerometer")) {
                        c3 = '$';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 475603707:
                    if (str.equals("web_app_stop_accelerometer")) {
                        c3 = '%';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 622108947:
                    if (str.equals("web_app_send_prepared_message")) {
                        c3 = '&';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 668142772:
                    if (str.equals("web_app_data_send")) {
                        c3 = '\'';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 671811520:
                    if (str.equals("web_app_request_content_safe_area")) {
                        c3 = '(';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 721956751:
                    if (str.equals("web_app_add_to_home_screen")) {
                        c3 = ')';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 748864404:
                    if (str.equals("web_app_request_fullscreen")) {
                        c3 = '*';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 751292356:
                    if (str.equals("web_app_switch_inline_query")) {
                        c3 = '+';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 792789792:
                    if (str.equals("web_app_secure_storage_save_key")) {
                        c3 = ',';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 796110323:
                    if (str.equals("web_app_exit_fullscreen")) {
                        c3 = '-';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 880626018:
                    if (str.equals("web_app_verify_age")) {
                        c3 = '.';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 909476449:
                    if (str.equals("web_app_open_location_settings")) {
                        c3 = '/';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1011447167:
                    if (str.equals("web_app_setup_back_button")) {
                        c3 = '0';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1210129967:
                    if (str.equals("web_app_biometry_request_access")) {
                        c3 = '1';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1273834781:
                    if (str.equals("web_app_trigger_haptic_feedback")) {
                        c3 = '2';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1398490221:
                    if (str.equals("web_app_setup_main_button")) {
                        c3 = '3';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1453051298:
                    if (str.equals("web_app_setup_swipe_behavior")) {
                        c3 = '4';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1455972419:
                    if (str.equals("web_app_setup_settings_button")) {
                        c3 = '5';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1495787980:
                    if (str.equals("web_app_check_home_screen")) {
                        c3 = '6';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1759965681:
                    if (str.equals("web_app_request_chat")) {
                        c3 = '7';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1812395469:
                    if (str.equals("web_app_start_device_orientation")) {
                        c3 = '8';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1882780382:
                    if (str.equals("web_app_biometry_update_token")) {
                        c3 = '9';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1899078473:
                    if (str.equals("web_app_set_bottom_bar_color")) {
                        c3 = ':';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1917103703:
                    if (str.equals("web_app_set_header_color")) {
                        c3 = ';';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1937068806:
                    if (str.equals("web_app_request_safe_area")) {
                        c3 = '<';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2001330488:
                    if (str.equals("web_app_set_background_color")) {
                        c3 = '=';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2036090717:
                    if (str.equals("web_app_request_write_access")) {
                        c3 = '>';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2139805763:
                    if (str.equals("web_app_expand")) {
                        c3 = '?';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            char c10 = c3;
            u uVar = this.D0;
            long j13 = 1000;
            g6 g6Var = this.e;
            BotWebViewVibrationEffect botWebViewVibrationEffect2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
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
            switch (c10) {
                case 0:
                    if (this.R != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            String string = jSONObject2.getString("req_id");
                            String string2 = jSONObject2.getString("method");
                            String obj = jSONObject2.get("params").toString();
                            int i14 = this.J;
                            x0 x0Var = this.a;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i14).getInputUser(this.R.id);
                            invokewebviewcustommethod.custom_method = string2;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = obj;
                            ConnectionsManager.getInstance(i14).sendRequest(invokewebviewcustommethod, new b8(this, string, i14, x0Var, 7));
                            break;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            if (e6 instanceof JSONException) {
                                i("JSON Parse error");
                                return;
                            } else {
                                S(null);
                                return;
                            }
                        }
                    }
                    break;
                case 1:
                    if (this.e0 && (r9Var = this.d0) != null) {
                        r9Var.dismiss();
                        break;
                    }
                    break;
                case 2:
                    t();
                    break;
                case 3:
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject3.optString("url"));
                        String optString = jSONObject3.optString("try_browser");
                        if (MessagesController.getInstance(this.J).webAppAllowedProtocols != null && MessagesController.getInstance(this.J).webAppAllowedProtocols.contains(parse.getScheme())) {
                            D(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                            break;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                    break;
                case 4:
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        if (this.i0 == null) {
                            this.i0 = sh.h0.c(getContext(), this.J, this.R.id);
                        }
                        try {
                            JSONObject jSONObject4 = new JSONObject(str2);
                            String string3 = jSONObject4.getString("url");
                            String string4 = jSONObject4.getString("file_name");
                            if (this.i0.d(string3) != null) {
                                this.i0.b(string3, string4);
                                v("file_download_requested", x("downloading", "status"));
                                break;
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.J).getInputUser(this.R);
                                checkdownloadfileparams.file_name = string4;
                                checkdownloadfileparams.url = string3;
                                ConnectionsManager.getInstance(this.J).sendRequest(checkdownloadfileparams, new hg.y(this, string3, string4, 19));
                                break;
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            v("file_download_requested", x("cancelled", "status"));
                            return;
                        }
                    }
                    break;
                case 5:
                    try {
                        if (this.W != null) {
                            break;
                        } else {
                            if (System.currentTimeMillis() - this.b0 <= 150) {
                                int i15 = this.a0 + 1;
                                this.a0 = i15;
                                if (i15 >= 3) {
                                    this.a0 = 0;
                                    this.c0 = System.currentTimeMillis();
                                    break;
                                }
                            }
                            if (System.currentTimeMillis() - this.c0 <= 3000) {
                                break;
                            } else {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                String optString2 = jSONObject5.optString("title", null);
                                String string5 = jSONObject5.getString("message");
                                JSONArray jSONArray2 = jSONObject5.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                                    arrayList.add(new y0(jSONArray2.getJSONObject(i16)));
                                }
                                if (arrayList.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final y0 y0Var = (y0) arrayList.get(0);
                                        final int i17 = 2;
                                        alertDialog$Builder.k(y0Var.b, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.t
                                            public final /* synthetic */ a1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.c2
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i18) {
                                                switch (i17) {
                                                    case 0:
                                                        y0 y0Var2 = y0Var;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        a1 a1Var = this.b;
                                                        a1Var.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var.M = System.currentTimeMillis();
                                                            a1Var.v("popup_closed", new JSONObject().put("button_id", y0Var2.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    case 1:
                                                        y0 y0Var3 = y0Var;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        a1 a1Var2 = this.b;
                                                        a1Var2.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var2.M = System.currentTimeMillis();
                                                            a1Var2.v("popup_closed", new JSONObject().put("button_id", y0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    default:
                                                        y0 y0Var4 = y0Var;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        a1 a1Var3 = this.b;
                                                        a1Var3.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var3.M = System.currentTimeMillis();
                                                            a1Var3.v("popup_closed", new JSONObject().put("button_id", y0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() >= 2) {
                                        final y0 y0Var2 = (y0) arrayList.get(1);
                                        final int i18 = 0;
                                        alertDialog$Builder.h(y0Var2.b, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.t
                                            public final /* synthetic */ a1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.c2
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i182) {
                                                switch (i18) {
                                                    case 0:
                                                        y0 y0Var22 = y0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        a1 a1Var = this.b;
                                                        a1Var.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var.M = System.currentTimeMillis();
                                                            a1Var.v("popup_closed", new JSONObject().put("button_id", y0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    case 1:
                                                        y0 y0Var3 = y0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        a1 a1Var2 = this.b;
                                                        a1Var2.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var2.M = System.currentTimeMillis();
                                                            a1Var2.v("popup_closed", new JSONObject().put("button_id", y0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    default:
                                                        y0 y0Var4 = y0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        a1 a1Var3 = this.b;
                                                        a1Var3.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var3.M = System.currentTimeMillis();
                                                            a1Var3.v("popup_closed", new JSONObject().put("button_id", y0Var4.a));
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
                                        final y0 y0Var3 = (y0) arrayList.get(2);
                                        final int i19 = 1;
                                        alertDialog$Builder.i(y0Var3.b, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.t
                                            public final /* synthetic */ a1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.c2
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i182) {
                                                switch (i19) {
                                                    case 0:
                                                        y0 y0Var22 = y0Var3;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        a1 a1Var = this.b;
                                                        a1Var.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var.M = System.currentTimeMillis();
                                                            a1Var.v("popup_closed", new JSONObject().put("button_id", y0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    case 1:
                                                        y0 y0Var32 = y0Var3;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        a1 a1Var2 = this.b;
                                                        a1Var2.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var2.M = System.currentTimeMillis();
                                                            a1Var2.v("popup_closed", new JSONObject().put("button_id", y0Var32.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    default:
                                                        y0 y0Var4 = y0Var3;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        a1 a1Var3 = this.b;
                                                        a1Var3.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            a1Var3.M = System.currentTimeMillis();
                                                            a1Var3.v("popup_closed", new JSONObject().put("button_id", y0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    alertDialog$Builder.j(new hg.g(this, atomicBoolean));
                                    this.W = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        y0 y0Var4 = (y0) arrayList.get(0);
                                        if (y0Var4.c >= 0 && (textView3 = (TextView) this.W.d(-1)) != null) {
                                            textView3.setTextColor(j(y0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        y0 y0Var5 = (y0) arrayList.get(1);
                                        if (y0Var5.c >= 0 && (textView2 = (TextView) this.W.d(-2)) != null) {
                                            textView2.setTextColor(j(y0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        y0 y0Var6 = (y0) arrayList.get(2);
                                        if (y0Var6.c >= 0 && (textView = (TextView) this.W.d(-3)) != null) {
                                            textView.setTextColor(j(y0Var6.c));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e12) {
                        FileLog.e(e12);
                        return;
                    }
                    break;
                case 6:
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (this.V != null) {
                            C(optString3, "cancelled", true);
                            break;
                        } else {
                            this.V = optString3;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = optString3;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.J).sendRequest(tL_payments_getPaymentForm, new hg.y(this, optString3, tL_inputInvoiceSlug, 20));
                            break;
                        }
                    } catch (JSONException e13) {
                        FileLog.e(e13);
                        return;
                    }
                case 7:
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        try {
                            JSONObject jSONObject6 = new JSONObject(str2);
                            j10 = Long.parseLong(jSONObject6.getString("custom_emoji_id"));
                            try {
                                i13 = jSONObject6.getInt("duration");
                            } catch (Exception unused) {
                                i13 = 0;
                                long j14 = j10;
                                user = this.R;
                                if (user != null) {
                                }
                            }
                        } catch (Exception unused2) {
                            j10 = 0;
                        }
                        long j142 = j10;
                        user = this.R;
                        if (user != null) {
                            v("emoji_status_failed", x("UNKNOWN_ERROR", "error"));
                            break;
                        } else {
                            w3.f(this.J, user, j142, i13, new s(this, 0));
                            break;
                        }
                    }
                    break;
                case '\b':
                    try {
                        JSONObject jSONObject7 = new JSONObject(str2);
                        boolean optBoolean = jSONObject7.optBoolean("is_active", false);
                        String trim = jSONObject7.optString("text", this.G).trim();
                        boolean z15 = jSONObject7.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject7.has("color") ? Color.parseColor(jSONObject7.optString("color")) : this.E;
                        int parseColor2 = jSONObject7.has("text_color") ? Color.parseColor(jSONObject7.optString("text_color")) : this.F;
                        boolean z16 = jSONObject7.optBoolean("is_progress_visible", false) && z15;
                        boolean z17 = jSONObject7.optBoolean("has_shine_effect", false) && z15;
                        String optString4 = jSONObject7.has("position") ? jSONObject7.optString("position") : this.H;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject7.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        this.E = parseColor;
                        this.F = parseColor2;
                        this.G = trim;
                        this.H = optString4;
                        this.I = str2;
                        this.c.l(z15, optBoolean, trim, j11, parseColor, parseColor2, z16, z17, optString4);
                        break;
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        return;
                    }
                case '\t':
                    try {
                        this.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        break;
                    } catch (JSONException e15) {
                        FileLog.e(e15);
                        return;
                    }
                case '\n':
                    try {
                        if (!this.e0 && this.T != null) {
                            this.f0 = new JSONObject(str2).optString("text");
                            this.e0 = true;
                            if (Build.VERSION.SDK_INT < 23 || this.T.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = this.T;
                                if (activity == null) {
                                    break;
                                } else {
                                    this.d0 = v9.e0(activity, 3, new e0(this, 0));
                                    break;
                                }
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new b0(this), NotificationCenter.onRequestPermissionResultReceived);
                                this.T.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                break;
                            }
                        }
                    } catch (JSONException e16) {
                        FileLog.e(e16);
                        return;
                    }
                    break;
                case 11:
                    if (!m(4)) {
                        int i20 = this.J;
                        x0 x0Var2 = this.a;
                        String[] strArr = {"cancelled"};
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), g6Var);
                        alertDialog$Builder2.l(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String userName = UserObject.getUserName(this.R);
                        if (TextUtils.isEmpty(userName)) {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                        } else {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                        }
                        boolean z18 = MessagesController.getInstance(this.J).blockePeers.indexOfKey(this.R.id) >= 0;
                        if (z18) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                        }
                        alertDialog$Builder2.g(spannableStringBuilder);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new org.telegram.messenger.k2(this, strArr, z18, i20, x0Var2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new cl0(10));
                        R(4, alertDialog$Builder2.a(), new x(strArr, i20, x0Var2, 0));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("status", "cancelled");
                            v("phone_requested", jSONObject8);
                            break;
                        } catch (Exception e17) {
                            FileLog.e(e17);
                            return;
                        }
                    }
                case '\f':
                    w();
                    break;
                case '\r':
                    if (this.R != null) {
                        if (this.k0 == null) {
                            getContext();
                            int i21 = this.J;
                            this.k0 = new sh.i1(UserConfig.getInstance(i21).getClientUserId(), this.R.id, i21, true);
                        }
                        l(this.k0, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.h0 == null) {
                        sh.q0 e18 = sh.q0.e(getContext(), this.J, this.R.id);
                        this.h0 = e18;
                        e18.f.add(uVar);
                    }
                    uVar.run();
                    break;
                case 15:
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        this.M = 0L;
                        p2 U = LaunchActivity.U();
                        if (U != null && U.getParentLayout() != null) {
                            f5 parentLayout = U.getParentLayout();
                            U.presentFragment(ProfileActivity.m4(this.R.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                            f0 f0Var = this.c;
                            if (f0Var != null) {
                                f0Var.b();
                                break;
                            }
                        }
                    }
                    break;
                case 16:
                    n(!((getParent() instanceof m3) && ((m3) getParent()).d()), true);
                    break;
                case 17:
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        w3.a(this.J, this.R.id, new s(this, 1));
                        break;
                    }
                    break;
                case 18:
                    sh.u0 z19 = this.c.z();
                    if (z19 == null || !z19.h()) {
                        v("device_orientation_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("device_orientation_stopped", null);
                        break;
                    }
                case 19:
                    if (this.R != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i22 = this.J;
                            this.j0 = new sh.i1(UserConfig.getInstance(i22).getClientUserId(), this.R.id, i22, false);
                        }
                        P(this.j0, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.R != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i23 = this.J;
                            this.j0 = new sh.i1(UserConfig.getInstance(i23).getClientUserId(), this.R.id, i23, false);
                        }
                        l(this.j0, str2, "device_storage_key_received", "device_storage_failed");
                        break;
                    }
                    break;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    f();
                    sh.p pVar = this.g0;
                    if (pVar != null) {
                        if (pVar.e) {
                            pVar.j(str3, true, null, new oh.z(2, pVar, new s(this, 4)));
                            break;
                        } else {
                            try {
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("status", "failed");
                                v("biometry_auth_requested", jSONObject9);
                                break;
                            } catch (Exception e19) {
                                FileLog.e(e19);
                                return;
                            }
                        }
                    }
                    break;
                case 22:
                    try {
                        z11 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z11 = false;
                    }
                    f0 f0Var2 = this.c;
                    if (f0Var2 != null) {
                        f0Var2.p(z11);
                        break;
                    }
                    break;
                case 23:
                    try {
                        jSONArray = new JSONArray(str2);
                        z4 = jSONArray.optBoolean(0, true);
                    } catch (Exception unused6) {
                        z4 = true;
                    }
                    try {
                        z10 = jSONArray.optBoolean(1, true);
                    } catch (Exception unused7) {
                        z10 = true;
                        g("allowScroll " + z4 + " " + z10);
                        if (!(getParent() instanceof m3)) {
                            return;
                        }
                    }
                    g("allowScroll " + z4 + " " + z10);
                    if (!(getParent() instanceof m3)) {
                        ((m3) getParent()).a(z4, z10);
                        break;
                    }
                case 24:
                    try {
                        JSONObject jSONObject10 = new JSONObject(str2);
                        String optString5 = jSONObject10.optString("path_full");
                        boolean optBoolean2 = jSONObject10.optBoolean("force_request", false);
                        if (optString5.startsWith("/")) {
                            optString5 = optString5.substring(1);
                        }
                        D(Uri.parse("https://t.me/" + optString5), null, false, true, optBoolean2);
                        break;
                    } catch (JSONException e20) {
                        FileLog.e(e20);
                        return;
                    }
                case 25:
                    if (this.R != null) {
                        if (this.k0 == null) {
                            getContext();
                            int i24 = this.J;
                            this.k0 = new sh.i1(UserConfig.getInstance(i24).getClientUserId(), this.R.id, i24, true);
                        }
                        M(this.k0, str2);
                        break;
                    }
                    break;
                case 26:
                    if (System.currentTimeMillis() - this.M <= 10000 && System.currentTimeMillis() - this.N >= 2000) {
                        this.M = 0L;
                        this.N = System.currentTimeMillis();
                        try {
                            jSONObject = new JSONObject(str2);
                            str4 = jSONObject.optString("media_url");
                        } catch (Exception e21) {
                            e = e21;
                            str4 = null;
                            str5 = null;
                        }
                        try {
                            str5 = jSONObject.optString("text");
                            try {
                                JSONObject optJSONObject = jSONObject.optJSONObject("widget_link");
                                if (optJSONObject != null) {
                                    str6 = optJSONObject.optString("url");
                                    try {
                                        str8 = optJSONObject.optString("name");
                                        str7 = str4;
                                    } catch (Exception e22) {
                                        e = e22;
                                        FileLog.e(e);
                                        str7 = str4;
                                        str8 = null;
                                        if (str7 == null) {
                                        }
                                    }
                                } else {
                                    str7 = str4;
                                    str6 = null;
                                    str8 = null;
                                }
                            } catch (Exception e23) {
                                e = e23;
                                str6 = null;
                            }
                        } catch (Exception e24) {
                            e = e24;
                            str5 = null;
                            str6 = str5;
                            FileLog.e(e);
                            str7 = str4;
                            str8 = null;
                            if (str7 == null) {
                                return;
                            }
                        }
                        if (str7 == null) {
                            if (MessagesController.getInstance(this.J).storiesEnabled()) {
                                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.T);
                                new HttpGetFileTask(new y1(this, d2Var, str5, str6, str8, 2), null).execute(str7);
                                d2Var.q(250L);
                                break;
                            } else {
                                new fg.n1((p2) new fg.x1(this), 14, true).show();
                                break;
                            }
                        }
                    }
                    break;
                case 27:
                    if (this.R != null) {
                        if (this.h0 == null) {
                            sh.q0 e25 = sh.q0.e(getContext(), this.J, this.R.id);
                            this.h0 = e25;
                            e25.f.add(uVar);
                        }
                        if (this.h0.g()) {
                            this.h0.k(new r(this, 1));
                            break;
                        } else {
                            this.h0.j(new s(this, 2));
                            break;
                        }
                    }
                    break;
                case 28:
                    sh.u0 z20 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long clamp = Utilities.clamp(j13, 1000L, 20L);
                    if (z20 == null || !z20.d(clamp)) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("gyroscope_started", null);
                        break;
                    }
                case 29:
                    try {
                        z12 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e26) {
                        FileLog.e(e26);
                        z12 = false;
                    }
                    this.c.y();
                    if (z12) {
                        if (this.y0 && LaunchActivity.D1 != null) {
                            Activity findActivity = AndroidUtilities.findActivity(getContext());
                            if (findActivity == null) {
                                findActivity = LaunchActivity.D1;
                            }
                            if (findActivity != null && !findActivity.isFinishing()) {
                                findActivity.moveTaskToBack(true);
                                break;
                            }
                        } else if (this.z0 != null && (launchActivity = LaunchActivity.D1) != null && launchActivity.P() != null) {
                            o3 P = LaunchActivity.D1.P();
                            ArrayList<n3> tabs = P.getTabs();
                            int i25 = 0;
                            while (true) {
                                if (i25 < tabs.size()) {
                                    n3 n3Var2 = tabs.get(i25);
                                    if (!this.z0.equals(n3Var2.a) || n3Var2.b == this.a) {
                                        i25++;
                                    } else {
                                        n3Var = n3Var2;
                                    }
                                }
                            }
                            if (n3Var != null) {
                                P.e(n3Var);
                                break;
                            }
                        }
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    O(this.a.getUrl(), true);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.M <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            v("clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            break;
                        }
                        v("clipboard_text_received", new JSONObject().put("req_id", string6));
                    } catch (JSONException e27) {
                        FileLog.e(e27);
                        return;
                    }
                    break;
                case ' ':
                    Activity findActivity2 = AndroidUtilities.findActivity(getContext());
                    if (findActivity2 == null) {
                        findActivity2 = LaunchActivity.D1;
                    }
                    if (findActivity2 != null) {
                        AndroidUtilities.hideKeyboard(findActivity2.getCurrentFocus());
                        break;
                    }
                    break;
                case '!':
                    sh.u0 z21 = this.c.z();
                    if (z21 == null || !z21.g()) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("gyroscope_stopped", null);
                        break;
                    }
                case '\"':
                    if (this.R != null) {
                        if (this.k0 == null) {
                            getContext();
                            int i26 = this.J;
                            this.k0 = new sh.i1(UserConfig.getInstance(i26).getClientUserId(), this.R.id, i26, true);
                        }
                        e(this.k0, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case '#':
                    if (this.R != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i27 = this.J;
                            this.j0 = new sh.i1(UserConfig.getInstance(i27).getClientUserId(), this.R.id, i27, false);
                        }
                        e(this.j0, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case '$':
                    sh.u0 z22 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long clamp2 = Utilities.clamp(j13, 1000L, 20L);
                    if (z22 == null || !z22.c(clamp2)) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("accelerometer_started", null);
                        break;
                    }
                    break;
                case '%':
                    sh.u0 z23 = this.c.z();
                    if (z23 == null || !z23.f()) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("accelerometer_stopped", null);
                        break;
                    }
                case '&':
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        try {
                            String string7 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string7)) {
                                v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                                break;
                            } else {
                                sh.e1.Q(getContext(), this.J, this.R.id, string7, this.e, new u(this, 0), new eh.w(25, this, botWebViewContainer$BotWebViewProxy));
                                break;
                            }
                        } catch (Exception e28) {
                            FileLog.e(e28);
                            v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                            return;
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        break;
                    } catch (JSONException e29) {
                        FileLog.e(e29);
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    J(this.C0, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        if (MediaDataController.getInstance(this.J).isShortcutAdded(this.R.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                            v("home_screen_added", null);
                            break;
                        } else {
                            MediaDataController.getInstance(this.J).installShortcut(this.R.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new r(this, 0));
                            break;
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    try {
                        z13 = new JSONObject(str2).optBoolean("blur", true);
                    } catch (Exception unused10) {
                        z13 = true;
                    }
                    String g10 = this.c.g(true, z13);
                    if (g10 == null) {
                        v("fullscreen_changed", y("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z13)));
                        break;
                    } else {
                        v("fullscreen_failed", x(g10, "error"));
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i28 = 0; i28 < jSONArray3.length(); i28++) {
                            arrayList2.add(jSONArray3.getString(i28));
                        }
                        this.c.v(this.R, jSONObject11.getString("query"), arrayList2);
                        break;
                    } catch (JSONException e30) {
                        FileLog.e(e30);
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    if (this.R != null) {
                        if (this.k0 == null) {
                            getContext();
                            int i29 = this.J;
                            this.k0 = new sh.i1(UserConfig.getInstance(i29).getClientUserId(), this.R.id, i29, true);
                        }
                        P(this.k0, str2, "secure_storage_key_saved", "secure_storage_failed");
                        break;
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        v("fullscreen_changed", x(Boolean.FALSE, "is_fullscreen"));
                        break;
                    } else {
                        v("fullscreen_failed", x(g11, "error"));
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    if (this.I0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z24 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a1.this.I0.run(Boolean.valueOf(z24), Double.valueOf(d), optString6, Double.valueOf(optDouble));
                                }
                            });
                            break;
                        } catch (Exception e31) {
                            FileLog.e(e31);
                            return;
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    if (this.R != null && System.currentTimeMillis() - this.M <= 10000) {
                        this.M = 0L;
                        p2 U2 = LaunchActivity.U();
                        if (U2 != null && U2.getParentLayout() != null) {
                            f5 parentLayout2 = U2.getParentLayout();
                            U2.presentFragment(ProfileActivity.m4(this.R.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout2, "botPermissionLocation");
                            f0 f0Var3 = this.c;
                            if (f0Var3 != null) {
                                f0Var3.b();
                                break;
                            }
                        }
                    }
                    break;
                case '0':
                    try {
                        boolean optBoolean3 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean3 != this.O) {
                            this.O = optBoolean3;
                            this.c.i(optBoolean3);
                            break;
                        }
                    } catch (JSONException e32) {
                        FileLog.e(e32);
                        return;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    try {
                        str9 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused11) {
                    }
                    f();
                    sh.p pVar2 = this.g0;
                    if (pVar2 != null) {
                        boolean z25 = pVar2.f;
                        if (z25) {
                            t();
                            break;
                        } else if (pVar2.e) {
                            if (!z25) {
                                pVar2.f = true;
                                pVar2.k();
                            }
                            t();
                            break;
                        } else {
                            final Runnable[] runnableArr = {new u(this, 3)};
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), g6Var);
                            if (TextUtils.isEmpty(str9)) {
                                alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                i10 = 0;
                                alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.R))));
                            } else {
                                i10 = 0;
                                alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.R))));
                                alertDialog$Builder3.g(str9);
                            }
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.a0
                                public final /* synthetic */ a1 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.c2
                                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i30) {
                                    switch (i10) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            a1 a1Var = this.b;
                                            sh.p pVar3 = a1Var.g0;
                                            pVar3.f = true;
                                            pVar3.k();
                                            sh.p pVar4 = a1Var.g0;
                                            s sVar = new s(a1Var, 3);
                                            pVar4.getClass();
                                            pVar4.j(null, true, null, new oh.z(2, pVar4, sVar));
                                            break;
                                        default:
                                            a1 a1Var2 = this.b;
                                            a1Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            sh.p pVar5 = a1Var2.g0;
                                            pVar5.f = true;
                                            pVar5.d = true;
                                            pVar5.k();
                                            a1Var2.t();
                                            break;
                                    }
                                }
                            });
                            final int i30 = 1;
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.a0
                                public final /* synthetic */ a1 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.c2
                                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i302) {
                                    switch (i30) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            a1 a1Var = this.b;
                                            sh.p pVar3 = a1Var.g0;
                                            pVar3.f = true;
                                            pVar3.k();
                                            sh.p pVar4 = a1Var.g0;
                                            s sVar = new s(a1Var, 3);
                                            pVar4.getClass();
                                            pVar4.j(null, true, null, new oh.z(2, pVar4, sVar));
                                            break;
                                        default:
                                            a1 a1Var2 = this.b;
                                            a1Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            sh.p pVar5 = a1Var2.g0;
                                            pVar5.f = true;
                                            pVar5.d = true;
                                            pVar5.k();
                                            a1Var2.t();
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.j(new fg.d0(runnableArr, 8));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    try {
                        JSONObject jSONObject13 = new JSONObject(str2);
                        String optString7 = jSONObject13.optString(TeXSymbolParser.TYPE_ATTR);
                        int hashCode = optString7.hashCode();
                        if (hashCode == -1184809658) {
                            if (optString7.equals("impact")) {
                                String optString8 = jSONObject13.optString("impact_style");
                                switch (optString8.hashCode()) {
                                    case -1078030475:
                                        if (optString8.equals("medium")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_MEDIUM;
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                            break;
                                        }
                                        break;
                                    case 3535914:
                                        if (optString8.equals("soft")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_SOFT;
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                            break;
                                        }
                                        break;
                                    case 99152071:
                                        if (optString8.equals("heavy")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_HEAVY;
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                            break;
                                        }
                                        break;
                                    case 102970646:
                                        if (optString8.equals("light")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_LIGHT;
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                            break;
                                        }
                                        break;
                                    case 108511787:
                                        if (optString8.equals("rigid")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_RIGID;
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                            break;
                                        }
                                        break;
                                }
                            }
                        } else if (hashCode == 193071555) {
                            if (optString7.equals("selection_change")) {
                                botWebViewVibrationEffect2 = BotWebViewVibrationEffect.SELECTION_CHANGE;
                                break;
                            }
                        } else if (hashCode == 595233003 && optString7.equals("notification")) {
                            String optString9 = jSONObject13.optString("notification_type");
                            int hashCode2 = optString9.hashCode();
                            if (hashCode2 != -1867169789) {
                                if (hashCode2 != 96784904) {
                                    if (hashCode2 == 1124446108 && optString9.equals("warning")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_WARNING;
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        break;
                                    }
                                } else if (optString9.equals("error")) {
                                    botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_ERROR;
                                    botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                }
                            } else if (optString9.equals("success")) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_SUCCESS;
                                botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                            }
                        }
                    } catch (Exception e33) {
                        FileLog.e(e33);
                        return;
                    }
                    break;
                case '3':
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.C).trim();
                        boolean z26 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.y;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.B;
                        boolean z27 = jSONObject14.optBoolean("is_progress_visible", false) && z26;
                        boolean z28 = jSONObject14.optBoolean("has_shine_effect", false) && z26;
                        try {
                            j12 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j12 = 0;
                        }
                        this.y = parseColor3;
                        this.B = parseColor4;
                        this.C = trim2;
                        this.D = str2;
                        this.c.q(z26, optBoolean4, trim2, j12, parseColor3, parseColor4, z27, z28);
                        break;
                    } catch (Exception e34) {
                        FileLog.e(e34);
                        return;
                    }
                    break;
                case '4':
                    try {
                        this.c.x(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        break;
                    } catch (JSONException e35) {
                        FileLog.e(e35);
                        return;
                    }
                case '5':
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.P) {
                            this.P = optBoolean5;
                            this.c.t(optBoolean5);
                            break;
                        }
                    } catch (JSONException e36) {
                        FileLog.e(e36);
                        return;
                    }
                    break;
                case '6':
                    v("home_screen_checked", x((this.R == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.J).isShortcutAdded(this.R.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
                    break;
                case '7':
                    try {
                        str10 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e37) {
                        FileLog.e(e37);
                    }
                    if (str10 != null) {
                        TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                        getrequestedwebviewbutton.bot = MessagesController.getInstance(this.J).getInputUser(this.R);
                        getrequestedwebviewbutton.webapp_req_id = str10;
                        int i31 = 0;
                        ConnectionsManager.getInstance(this.J).sendRequestTyped(getrequestedwebviewbutton, new sb0(i31), new w(this, str10, i31));
                        break;
                    }
                    break;
                case '8':
                    sh.u0 z29 = this.c.z();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        z14 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        z14 = false;
                    }
                    long clamp3 = Utilities.clamp(j13, 1000L, 20L);
                    if (z29 == null || !z29.e(clamp3, z14)) {
                        v("device_orientation_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("device_orientation_started", null);
                        break;
                    }
                case '9':
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str11 = jSONObject16.getString("reason");
                        } catch (Exception unused14) {
                        }
                        f();
                        sh.p pVar3 = this.g0;
                        if (pVar3 != null) {
                            if (pVar3.e) {
                                pVar3.l(str11, string8, new xk(28, this, string8));
                                break;
                            } else {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    v("biometry_token_updated", jSONObject17);
                                    break;
                                } catch (Exception e38) {
                                    FileLog.e(e38);
                                    return;
                                }
                            }
                        }
                    } catch (Exception e39) {
                        FileLog.e(e39);
                        if (e39 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            S(null);
                            return;
                        }
                    }
                    break;
                case ':':
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        int v02 = TextUtils.isEmpty(optString10) ? k6.v0(k6.a7, g6Var) : Color.parseColor(optString10);
                        f0 f0Var4 = this.c;
                        if (f0Var4 != null) {
                            f0Var4.r(v02);
                            break;
                        }
                    } catch (Exception e40) {
                        FileLog.e(e40);
                        return;
                    }
                    break;
                case ';':
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String optString11 = jSONObject18.optString("color", null);
                        if (TextUtils.isEmpty(optString11)) {
                            String optString12 = jSONObject18.optString("color_key");
                            int hashCode3 = optString12.hashCode();
                            if (hashCode3 != -1265068311) {
                                if (hashCode3 == -210781868 && optString12.equals("secondary_bg_color")) {
                                    i11 = k6.a7;
                                    i12 = i11;
                                }
                                i12 = -1;
                            } else {
                                if (optString12.equals("bg_color")) {
                                    i11 = k6.d6;
                                    i12 = i11;
                                }
                                i12 = -1;
                            }
                            if (i12 >= 0) {
                                this.c.u(i12, k6.v0(i12, g6Var), false);
                                break;
                            }
                        } else {
                            int parseColor5 = Color.parseColor(optString11);
                            if (parseColor5 != 0) {
                                this.c.u(-1, parseColor5, true);
                                break;
                            }
                        }
                    } catch (Exception e41) {
                        FileLog.e(e41);
                        return;
                    }
                    break;
                case '<':
                    K(this.B0, true);
                    break;
                case '=':
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        break;
                    } catch (Exception e42) {
                        FileLog.e(e42);
                        return;
                    }
                case '>':
                    if (!m(3)) {
                        int i32 = this.J;
                        x0 x0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.J).getInputUser(this.R);
                        ConnectionsManager.getInstance(this.J).sendRequest(cansendmessage, new hg.l0(this, i32, x0Var3, 9));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            v("write_access_requested", jSONObject19);
                            break;
                        } catch (Exception e43) {
                            FileLog.e(e43);
                            return;
                        }
                    }
                case '?':
                    this.c.s();
                    break;
                default:
                    FileLog.d("unknown webapp event ".concat(str));
                    break;
            }
        }
    }

    public final void C(String str, String str2, boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z4 || !Objects.equals(this.V, str)) {
                return;
            }
            this.V = null;
        } catch (JSONException e6) {
            FileLog.e(e6);
        }
    }

    public final void D(Uri uri, String str, boolean z4, boolean z10, boolean z11) {
        if (System.currentTimeMillis() - this.M <= 10000 || !z10) {
            this.M = 0L;
            boolean[] zArr = {false};
            if (af.g.f(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            af.g.r(getContext(), uri, true, z4, false, null, str, false, true, z11);
        }
    }

    public abstract void G(x0 x0Var);

    public final void J(int i10, boolean z4) {
        JSONObject jSONObject;
        if (z4 || i10 != this.C0) {
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
            v("content_safe_area_changed", jSONObject);
            this.C0 = i10;
        }
    }

    public final void K(Rect rect, boolean z4) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.B0;
            if (z4 || !rect2.equals(rect)) {
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
                v("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void L() {
        try {
            String str = this.D;
            if (str != null) {
                B(this.o0, "web_app_setup_main_button", str);
            }
            String str2 = this.I;
            if (str2 != null) {
                B(this.o0, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void M(sh.i1 i1Var, String str) {
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = i1Var.h(optString);
                    if (h.isEmpty()) {
                        v("secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    hg.c1 c1Var = new hg.c1(15, this, i1Var, optString, string);
                    p2 U = LaunchActivity.U();
                    g6 resourceProvider = U != null ? U.getResourceProvider() : null;
                    int i10 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    h3 o10 = org.telegram.messenger.y3.o(context, resourceProvider, false, false);
                    LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                    p9 p9Var = new p9(context);
                    ArrayList arrayList = h;
                    TLRPC.User user = MessagesController.getInstance(i1Var.a).getUser(Long.valueOf(i1Var.b));
                    z8 z8Var = new z8((g6) null);
                    z8Var.r(user);
                    p9Var.e(user, z8Var);
                    f10.addView(p9Var, c6.t(80, 80, 49, 0, 21, 0, 13));
                    int i11 = k6.G6;
                    TextView b10 = k7.g6.b(context, 20.0f, i11, true, null);
                    org.telegram.messenger.y3.r(R.string.BotRestoreStorageTitle, b10, 17);
                    f10.addView(b10, c6.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = k7.g6.b(context, 14.0f, i11, false, null);
                    b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    b11.setGravity(17);
                    f10.addView(b11, c6.t(-1, -2, 7, 32, 0, 32, 19));
                    a9 a9Var = new a9(context, resourceProvider);
                    a9Var.setBackground(new pq(new ColorDrawable(k6.v0(k6.a7, resourceProvider)), k6.U0(context, R.drawable.greydivider, k6.v0(k6.b7, resourceProvider))));
                    a9Var.setFixedSize(12);
                    f10.addView(a9Var, c6.t(-1, 12, 7, 0, 0, 0, 0));
                    m4 m4Var = new m4(context, resourceProvider);
                    m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    f10.addView(m4Var, c6.t(-1, -2, 7, 0, 0, 0, 0));
                    qh.d dVar = new qh.d(context, resourceProvider, true);
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        ArrayList arrayList3 = arrayList;
                        sh.h1 h1Var = (sh.h1) arrayList3.get(i12);
                        sh.g1 g1Var = new sh.g1(h1Var, i12 < arrayList3.size() - i10, context);
                        g1Var.setBackground(k6.f0(k6.v0(k6.i6, resourceProvider), 2, -1));
                        LinearLayout linearLayout = f10;
                        g1Var.setOnClickListener(new u3(strArr, h1Var, arrayList2, dVar, 15));
                        linearLayout.addView(g1Var, c6.n(-1, 56));
                        arrayList2.add(g1Var);
                        i12++;
                        arrayList = arrayList3;
                        o10 = o10;
                        f10 = linearLayout;
                        c1Var = c1Var;
                        i10 = 1;
                    }
                    hg.c1 c1Var2 = c1Var;
                    h3 h3Var = o10;
                    LinearLayout linearLayout2 = f10;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, c6.t(-1, 48, 7, 8, 8, 8, 4));
                    h3Var.customView = linearLayout2;
                    h3Var.fixNavigationBar(k6.v0(k6.h5, resourceProvider));
                    dVar.setOnClickListener(new u3(zArr, c1Var2, strArr, h3Var, 16));
                    h3Var.setOnDismissListener(new hg.g(16, zArr, c1Var2));
                    h3Var.show();
                } catch (Exception e6) {
                    v("secure_storage_failed", y("req_id", string, "error", e6.getMessage()));
                }
            } catch (Exception unused) {
                v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v("secure_storage_failed", y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void O(String str, boolean z4) {
        x0 x0Var = this.a;
        if (x0Var != null) {
            boolean z10 = x0Var.B;
        }
        boolean z11 = x0Var == null || !x0Var.canGoBack();
        x0 x0Var2 = this.a;
        F(z11, x0Var2 == null || !x0Var2.canGoForward());
        x0 x0Var3 = this.a;
        if (x0Var3 != null) {
            x0Var3.b = true;
        }
        if (this.K) {
            g("setPageLoaded: already loaded");
            return;
        }
        a4 a4Var = this.s;
        if (!z4 || x0Var3 == null || a4Var == null) {
            if (x0Var3 != null) {
                x0Var3.setAlpha(1.0f);
            }
            if (a4Var != null) {
                a4Var.setAlpha(0.0f);
                a4Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<x0, Float>) property, 1.0f), ObjectAnimator.ofFloat(a4Var, (Property<a4, Float>) property, 0.0f));
            animatorSet.addListener(new ss0(this, 27));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.K = true;
        this.c.getClass();
    }

    public final void P(sh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        i1Var.n(optString, jSONObject.optString("value"));
                        v(str2, x(string, "req_id"));
                    } catch (RuntimeException e6) {
                        v(str3, y("req_id", string, "error", e6.getMessage()));
                    }
                } catch (Exception unused) {
                    v(str3, y("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                v(str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void Q(x0 x0Var, Object obj) {
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
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !p());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (x0Var == null) {
            Context context = getContext();
            boolean z4 = this.l0;
            long j10 = 0;
            if (z4 && (user = this.R) != null) {
                j10 = user.id;
            }
            x0Var2 = new x0(context, z4, j10);
        } else {
            x0Var2 = x0Var;
        }
        this.a = x0Var2;
        if (this.l0) {
            x0Var2.setBackgroundColor(j(k6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.q0;
        }
        if (!MessagesController.getInstance(this.J).disableBotFullscreenBlur) {
            this.a.setLayerType(2, null);
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.x0);
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
        if (!this.l0) {
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
        if (p()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb = new StringBuilder("(Linux; Android ");
            String str2 = Build.VERSION.RELEASE;
            sb.append(str2);
            sb.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.l0) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                String str3 = devicePerformanceClass == 0 ? "LOW" : devicePerformanceClass == 1 ? "AVERAGE" : "HIGH";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceAll);
                sb2.append(" Telegram-Android/");
                sb2.append(packageInfo.versionName);
                sb2.append(" (");
                String str4 = Build.MANUFACTURER;
                if (str4 != null) {
                    if (str4.length() <= 1) {
                        str = str4.toUpperCase();
                    } else {
                        str = str4.substring(0, 1).toUpperCase() + str4.substring(1).toLowerCase();
                    }
                }
                sb2.append(str);
                sb2.append(" ");
                sb2.append(Build.MODEL);
                sb2.append("; Android ");
                sb2.append(str2);
                sb2.append("; SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append("; ");
                sb2.append(str3);
                sb2.append(")");
                replaceAll = sb2.toString();
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
        if (x0Var == null && this.l0) {
            this.a.setAlpha(0.0f);
        }
        addView(this.a);
        if (this.l0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.o0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.o0;
            if (botWebViewContainer$BotWebViewProxy == null) {
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy2 = new BotWebViewContainer$BotWebViewProxy();
                botWebViewContainer$BotWebViewProxy2.a = this;
                this.o0 = botWebViewContainer$BotWebViewProxy2;
                this.a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.o0.a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.p0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.p0;
            if (botWebViewContainer$WebViewProxy == null) {
                x0 x0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(x0Var4, this);
                this.p0 = botWebViewContainer$WebViewProxy2;
                x0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.p0.a = this;
        }
        G(this.a);
        J0 = false;
    }

    public final void R(int i10, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        if (d2Var == null || m(i10)) {
            return;
        }
        d2Var.setOnDismissListener(new hg.g(13, this, runnable));
        this.W = d2Var;
        d2Var.e0 = false;
        d2Var.show();
        if (this.E0 != i10) {
            this.E0 = i10;
            this.F0 = 0;
            this.G0 = 0L;
        }
        this.F0++;
    }

    public final void S(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        sb.append(str != null ? ": ".concat(str) : "");
        i(sb.toString());
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
        n71 n71Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            x0 x0Var = this.a;
            if (x0Var != null) {
                x0Var.setBackgroundColor(j(k6.d6));
            }
            if (!this.n0) {
                int i12 = k6.Ki;
                int j10 = j(i12);
                this.m0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                a4 a4Var = this.s;
                a4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.m0);
                    this.r.setupGradient(i12, this.e, 1.0f, false);
                }
                a4Var.invalidate();
            }
            w();
            return;
        }
        if (i10 != NotificationCenter.onActivityResultReceived) {
            if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (n71Var = this.S) == null) {
                    return;
                }
                n71Var.run();
                this.S = null;
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

    public final void e(sh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                i1Var.m(new JSONObject());
                v(str2, x(string, "req_id"));
            } catch (RuntimeException e6) {
                v(str3, y("req_id", string, "error", e6.getMessage()));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void f() {
        if (this.R == null) {
            return;
        }
        sh.p pVar = this.g0;
        if (pVar == null) {
            this.g0 = sh.p.c(getContext(), this.J, this.R.id);
        } else {
            pVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.H0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.o0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof m3)) {
            return 0;
        }
        m3 m3Var = (m3) getParent();
        if (m3Var.G) {
            return (int) ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) + this.u0);
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
        return this.p0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public x0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.w0);
        x0 x0Var = this.a;
        if (x0Var != null) {
            if (x0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.w0) {
                this.a.destroy();
                H(this.a);
            }
            this.K = false;
            if (this.g0 != null) {
                this.g0 = null;
            }
            if (this.j0 != null) {
                this.j0 = null;
            }
            if (this.k0 != null) {
                this.k0 = null;
            }
            sh.q0 q0Var = this.h0;
            if (q0Var != null) {
                q0Var.f.remove(this.D0);
                this.h0 = null;
            }
        }
    }

    public final void i(String str) {
        new qc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        g6 g6Var = this.e;
        return g6Var != null ? g6Var.B0(i10) : k6.w0(null, i10, false);
    }

    public final void l(sh.i1 i1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f10 = i1Var.f(optString);
                    if (i1Var.d && (obj = f10.first) == null) {
                        Object obj2 = f10.second;
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("req_id", string);
                            jSONObject.put("value", obj);
                            jSONObject.put("can_restore", obj2);
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                        v(str2, jSONObject);
                    } else {
                        v(str2, y("req_id", string, "value", f10.first));
                    }
                } catch (RuntimeException e6) {
                    v(str3, y("req_id", string, "error", e6.getMessage()));
                }
            } catch (Exception unused2) {
                v(str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean m(int i10) {
        if (this.W != null || (this.G0 > 0 && System.currentTimeMillis() < this.G0)) {
            return true;
        }
        if (this.E0 != i10 || this.F0 <= 3) {
            return false;
        }
        this.G0 = System.currentTimeMillis() + 3000;
        this.F0 = 0;
        return true;
    }

    public final void n(boolean z4, boolean z10) {
        invalidate();
        if ((this.K || z10) && this.l0 && (getParent() instanceof m3)) {
            m3 m3Var = (m3) getParent();
            if (z4) {
                this.L = m3Var.getSwipeOffsetY() == m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (m3Var.getTopActionBarOffsetY() + ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) - m3Var.getSwipeOffsetY()) + this.u0));
            if (!z10 && max == this.r0 && this.s0 == z4 && this.t0 == this.L) {
                return;
            }
            this.r0 = max;
            this.s0 = z4;
            this.t0 = this.L;
            NotificationCenter.getInstance(this.J).doOnIdle(new q(this, android.support.v4.media.a.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z4 + ",is_expanded:" + this.L + "}", ");"), 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ic.a(this, new lh.t0(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ic.h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.v0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.U) {
            return;
        }
        n(true, false);
    }

    public final boolean p() {
        return this.I0 != null;
    }

    public final void q(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        a4 a4Var = this.s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            a4Var.setVisibility(0);
            a4Var.setAlpha(1.0f);
            a4Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(k6.a7))));
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
        boolean z4 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z4 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                a4Var.setVisibility(0);
                a4Var.setAlpha(1.0f);
                a4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z4);
                return;
            }
            return;
        }
        g6 g6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            a4Var.setVisibility(0);
            a4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.m0);
                this.r.setupGradient(k6.Ki, g6Var, 1.0f, false);
            }
            a4Var.f(null, null, this.r);
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
        a4Var.setVisibility(0);
        a4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.m0);
            this.r.setupGradient(k6.Ki, g6Var, 1.0f, false);
        }
        a4Var.f(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void r(int i10, String str) {
        this.J = i10;
        NotificationCenter.getInstance(i10).doOnIdle(new q(this, str, 1));
    }

    public void setBotUser(TLRPC.User user) {
        this.R = user;
    }

    public void setDelegate(f0 f0Var) {
        this.c = f0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10 = AndroidUtilities.computePerceivedBrightness(i10) > 0.7f ? k6.b(0.0f, -0.15f, i10) : k6.b(0.025f, 0.15f, i10);
        if (this.m0 == b10) {
            return;
        }
        this.m0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        a4 a4Var = this.s;
        a4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.m0);
            this.r.setupGradient(k6.Ki, this.e, 1.0f, false);
        }
        this.n0 = true;
        a4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.v0 == i10) {
            return;
        }
        this.v0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z4) {
        this.O = z4;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.x0 = runnable;
        x0 x0Var = this.a;
        if (x0Var != null) {
            x0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.I0 = callback4;
    }

    public void setOpener(x0 x0Var) {
        x0 x0Var2;
        this.q0 = x0Var;
        if (this.l0 || (x0Var2 = this.a) == null) {
            return;
        }
        x0Var2.f = x0Var;
    }

    public void setParentActivity(Activity activity) {
        this.T = activity;
    }

    public void setTrustedOrigin(String str) {
        this.A0 = k(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z4) {
        this.U = z4;
    }

    public void setViewPortHeightOffset(float f10) {
        this.u0 = f10;
    }

    public void setWasOpenedByBot(y3 y3Var) {
        this.z0 = y3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z4) {
        this.y0 = z4;
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

    public final void t() {
        if (this.R == null) {
            return;
        }
        f();
        sh.p pVar = this.g0;
        if (pVar == null) {
            return;
        }
        try {
            v("biometry_info_received", pVar.f());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.J).doOnIdle(new q(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject p10;
        try {
            p10 = sh.p2.p(this.e, true);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (p10 != null) {
            jSONObject = new JSONObject().put("theme_params", p10);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public final boolean z() {
        if (this.a == null || !this.O) {
            return false;
        }
        v("back_button_pressed", null);
        return true;
    }

    public void E() {
    }

    public void H(x0 x0Var) {
    }

    public void setKeyboardFocusable(boolean z4) {
    }

    public void A(String str, boolean z4) {
    }

    public void F(boolean z4, boolean z10) {
    }
}
