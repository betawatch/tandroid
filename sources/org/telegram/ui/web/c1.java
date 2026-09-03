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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.b6;
import kh.t3;
import lh.m5;
import nh.b8;
import nh.j7;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cl0;
import org.telegram.ui.dy0;
import org.telegram.ui.et;
import org.telegram.ui.sg1;
import org.telegram.ui.ss0;
import org.telegram.ui.t9;
import org.telegram.ui.tb0;
import org.telegram.ui.x9;
import rh.p2;
import rh.w3;
import rh.y3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class c1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean M0 = true;
    public static int N0;
    public static HashMap O0;
    public boolean A0;
    public int B;
    public y3 B0;
    public String C;
    public String C0;
    public String D;
    public final Rect D0;
    public int E;
    public int E0;
    public int F;
    public j7 F0;
    public String G;
    public final t G0;
    public String H;
    public int H0;
    public String I;
    public int I0;
    public int J;
    public long J0;
    public boolean K;
    public final int K0;
    public boolean L;
    public Utilities.Callback4 L0;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public TLRPC.User R;
    public m71 S;
    public Activity T;
    public boolean U;
    public String V;
    public org.telegram.ui.ActionBar.d2 W;
    public y0 a;
    public int a0;
    public String b;
    public long b0;
    public g0 c;
    public long c0;
    public b1 d;
    public t9 d0;
    public final f6 e;
    public boolean e0;
    public final TextView f;
    public String f0;
    public rh.p g0;
    public boolean h;
    public rh.q0 h0;
    public rh.h0 i0;
    public rh.i1 j0;
    public rh.i1 k0;
    public final boolean l0;
    public int m0;
    public final org.telegram.ui.Components.voip.h n;
    public boolean n0;
    public BotWebViewContainer$BotWebViewProxy o0;
    public long p0;
    public boolean q0;
    public SvgHelper.SvgDrawable r;
    public BotWebViewContainer$WebViewProxy r0;
    public final nh.y3 s;
    public y0 s0;
    public int t0;
    public boolean u0;
    public boolean v;
    public boolean v0;
    public q0.a w;
    public float w0;
    public ValueCallback x;
    public int x0;
    public int y;
    public boolean y0;
    public Runnable z0;

    public c1(int i10, Context context, f6 f6Var, boolean z4) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n = hVar;
        int i11 = j6.Oh;
        this.y = k(i11);
        int i12 = j6.Sh;
        this.B = k(i12);
        this.C = "";
        this.E = k(i11);
        this.F = k(i12);
        this.G = "";
        this.H = "";
        this.J = UserConfig.selectedAccount;
        this.x0 = -1;
        this.D0 = new Rect(0, 0, 0, 0);
        this.E0 = 0;
        this.G0 = new t(this, 1);
        this.H0 = -1;
        this.I0 = 0;
        int i13 = N0;
        N0 = i13 + 1;
        this.K0 = i13;
        this.l0 = z4;
        this.e = f6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.T = (Activity) context;
        }
        hVar.k = false;
        hVar.b(i10, 153);
        nh.y3 y3Var = new nh.y3(this, context);
        this.s = y3Var;
        int k10 = k(j6.Ki);
        this.m0 = k10;
        y3Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        y3Var.getImageReceiver().setAspectFit(true);
        addView(y3Var, b6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(j6.y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, b6.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ze.d.v(Uri.parse(str2), "https", null, T(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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

    public static String T(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
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

    public static void a(c1 c1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            c1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else {
            if (c1Var.d(strArr)) {
                aVar.accept(Boolean.TRUE);
                return;
            }
            c1Var.S = new m71(c1Var, aVar, strArr, 3);
            Activity activity = c1Var.T;
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
        if (O0 == null) {
            O0 = new HashMap();
        }
        O0.put(T, hostAuthority);
        return ze.d.v(Uri.parse(str), "https", null, T, null);
    }

    public static String l(String str) {
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
                if (port != -1 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb.append(":");
                    sb.append(port);
                }
                return sb.toString();
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

    private void setupFlickerParams(boolean z4) {
        this.v = z4;
        nh.y3 y3Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y3Var.getLayoutParams();
        layoutParams.gravity = z4 ? 17 : 48;
        if (z4) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        y3Var.requestLayout();
    }

    private void setupWebView(y0 y0Var) {
        X(y0Var, null);
    }

    public static String v(String str) {
        String str2;
        if (O0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb.toString()) && (str2 = (String) O0.get(hostAuthority)) != null) ? ze.d.v(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static void x(int i10, y0 y0Var, j7 j7Var, String str, JSONObject jSONObject) {
        if (y0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new dy0((Object) y0Var, (Object) j7Var, str, (Object) jSONObject, 12));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p10;
        try {
            p10 = p2.p(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (p10 != null) {
            jSONObject = new JSONObject().put("theme_params", p10);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public final boolean D() {
        if (this.a == null || !this.O) {
            return false;
        }
        y("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:912:0x07b8, code lost:
    
        r5.vibrate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x07bb, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0d33  */
    /* JADX WARN: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0e13  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x11eb  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x11f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final j7 j7Var, String str, String str2) {
        char c3;
        int i10;
        int i11;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        final int i12;
        t9 t9Var;
        final c1 c1Var;
        final c1 c1Var2;
        j7 j7Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j10;
        int i13;
        TLRPC.User user;
        JSONObject jSONObject;
        long j11;
        String str3;
        boolean z4;
        boolean z10;
        boolean z11;
        JSONArray jSONArray;
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
        long j12;
        boolean z14;
        if (this.l0) {
            if (this.a == null || this.c == null) {
                h("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!p(j7Var)) {
                h("onEventReceived ignore " + str + " after document change");
                return;
            }
            h("onEventReceived " + str);
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
            t tVar = this.G0;
            long j13 = 1000;
            f6 f6Var = this.e;
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
            switch (c10) {
                case 0:
                    if (this.R == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        String string = jSONObject2.getString("req_id");
                        String string2 = jSONObject2.getString("method");
                        String obj = jSONObject2.get("params").toString();
                        int i14 = this.J;
                        y0 y0Var = this.a;
                        TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                        invokewebviewcustommethod.bot = MessagesController.getInstance(i14).getInputUser(this.R.id);
                        invokewebviewcustommethod.custom_method = string2;
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        invokewebviewcustommethod.params = tL_dataJSON;
                        tL_dataJSON.data = obj;
                        ConnectionsManager.getInstance(i14).sendRequest(invokewebviewcustommethod, new kf.i0(this, string, i14, y0Var, j7Var, 13));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (e instanceof JSONException) {
                            j("JSON Parse error");
                            return;
                        } else {
                            Z(null);
                            return;
                        }
                    }
                case 1:
                    if (!this.e0 || (t9Var = this.d0) == null) {
                        return;
                    }
                    t9Var.dismiss();
                    return;
                case 2:
                    w(j7Var);
                    return;
                case 3:
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject3.optString("url"));
                        String optString = jSONObject3.optString("try_browser");
                        if (MessagesController.getInstance(this.J).webAppAllowedProtocols == null || !MessagesController.getInstance(this.J).webAppAllowedProtocols.contains(parse.getScheme())) {
                            return;
                        }
                        H(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                case 4:
                    if (this.R == null || System.currentTimeMillis() - this.M > 10000) {
                        return;
                    }
                    if (this.i0 == null) {
                        this.i0 = rh.h0.c(getContext(), this.J, this.R.id);
                    }
                    try {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        String string3 = jSONObject4.getString("url");
                        String string4 = jSONObject4.getString("file_name");
                        if (this.i0.d(string3) != null) {
                            this.i0.b(string3, string4);
                            z(j7Var, "file_download_requested", B("downloading", "status"));
                            return;
                        }
                        TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                        checkdownloadfileparams.bot = MessagesController.getInstance(this.J).getInputUser(this.R);
                        checkdownloadfileparams.file_name = string4;
                        checkdownloadfileparams.url = string3;
                        ConnectionsManager.getInstance(this.J).sendRequest(checkdownloadfileparams, new kh.b1(this, j7Var, string3, string4, 16));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        z(j7Var, "file_download_requested", B("cancelled", "status"));
                        return;
                    }
                case 5:
                    c1Var = this;
                    try {
                        if (c1Var.W == null) {
                            if (System.currentTimeMillis() - c1Var.b0 <= 150) {
                                int i15 = c1Var.a0 + 1;
                                c1Var.a0 = i15;
                                if (i15 >= 3) {
                                    c1Var.a0 = 0;
                                    c1Var.c0 = System.currentTimeMillis();
                                    return;
                                }
                            }
                            if (System.currentTimeMillis() - c1Var.c0 > 3000) {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                String optString2 = jSONObject5.optString("title", null);
                                String string5 = jSONObject5.getString("message");
                                JSONArray jSONArray2 = jSONObject5.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                                    arrayList.add(new z0(jSONArray2.getJSONObject(i16)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        try {
                                            final z0 z0Var = (z0) arrayList.get(0);
                                            final int i17 = 0;
                                            alertDialog$Builder.k(z0Var.b, new org.telegram.ui.ActionBar.c2(c1Var) { // from class: org.telegram.ui.web.q
                                                public final /* synthetic */ c1 b;

                                                {
                                                    this.b = c1Var;
                                                }

                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i18) {
                                                    switch (i17) {
                                                        case 0:
                                                            j7 j7Var3 = j7Var;
                                                            z0 z0Var2 = z0Var;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            c1 c1Var3 = this.b;
                                                            c1Var3.getClass();
                                                            d2Var.dismiss();
                                                            try {
                                                                c1Var3.M = System.currentTimeMillis();
                                                                c1Var3.z(j7Var3, "popup_closed", new JSONObject().put("button_id", z0Var2.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e11) {
                                                                FileLog.e(e11);
                                                                return;
                                                            }
                                                        case 1:
                                                            j7 j7Var4 = j7Var;
                                                            z0 z0Var3 = z0Var;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            c1 c1Var4 = this.b;
                                                            c1Var4.getClass();
                                                            d2Var.dismiss();
                                                            try {
                                                                c1Var4.M = System.currentTimeMillis();
                                                                c1Var4.z(j7Var4, "popup_closed", new JSONObject().put("button_id", z0Var3.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                FileLog.e(e12);
                                                                return;
                                                            }
                                                        default:
                                                            j7 j7Var5 = j7Var;
                                                            z0 z0Var4 = z0Var;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            c1 c1Var5 = this.b;
                                                            c1Var5.getClass();
                                                            d2Var.dismiss();
                                                            try {
                                                                c1Var5.M = System.currentTimeMillis();
                                                                c1Var5.z(j7Var5, "popup_closed", new JSONObject().put("button_id", z0Var4.a));
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
                                        final z0 z0Var2 = (z0) arrayList.get(1);
                                        final int i18 = 1;
                                        alertDialog$Builder.h(z0Var2.b, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.q
                                            public final /* synthetic */ c1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.c2
                                            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i182) {
                                                switch (i18) {
                                                    case 0:
                                                        j7 j7Var3 = j7Var;
                                                        z0 z0Var22 = z0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        c1 c1Var3 = this.b;
                                                        c1Var3.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            c1Var3.M = System.currentTimeMillis();
                                                            c1Var3.z(j7Var3, "popup_closed", new JSONObject().put("button_id", z0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e112) {
                                                            FileLog.e(e112);
                                                            return;
                                                        }
                                                    case 1:
                                                        j7 j7Var4 = j7Var;
                                                        z0 z0Var3 = z0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        c1 c1Var4 = this.b;
                                                        c1Var4.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            c1Var4.M = System.currentTimeMillis();
                                                            c1Var4.z(j7Var4, "popup_closed", new JSONObject().put("button_id", z0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    default:
                                                        j7 j7Var5 = j7Var;
                                                        z0 z0Var4 = z0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        c1 c1Var5 = this.b;
                                                        c1Var5.getClass();
                                                        d2Var.dismiss();
                                                        try {
                                                            c1Var5.M = System.currentTimeMillis();
                                                            c1Var5.z(j7Var5, "popup_closed", new JSONObject().put("button_id", z0Var4.a));
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
                                        final z0 z0Var3 = (z0) arrayList.get(2);
                                        String str14 = z0Var3.b;
                                        final int i19 = 2;
                                        c1Var2 = this;
                                        try {
                                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c1Var2) { // from class: org.telegram.ui.web.q
                                                public final /* synthetic */ c1 b;

                                                {
                                                    this.b = c1Var2;
                                                }

                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i182) {
                                                    switch (i19) {
                                                        case 0:
                                                            j7 j7Var3 = j7Var;
                                                            z0 z0Var22 = z0Var3;
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            c1 c1Var3 = this.b;
                                                            c1Var3.getClass();
                                                            d2Var.dismiss();
                                                            try {
                                                                c1Var3.M = System.currentTimeMillis();
                                                                c1Var3.z(j7Var3, "popup_closed", new JSONObject().put("button_id", z0Var22.a));
                                                                atomicBoolean2.set(true);
                                                                break;
                                                            } catch (JSONException e112) {
                                                                FileLog.e(e112);
                                                                return;
                                                            }
                                                        case 1:
                                                            j7 j7Var4 = j7Var;
                                                            z0 z0Var32 = z0Var3;
                                                            AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                            c1 c1Var4 = this.b;
                                                            c1Var4.getClass();
                                                            d2Var.dismiss();
                                                            try {
                                                                c1Var4.M = System.currentTimeMillis();
                                                                c1Var4.z(j7Var4, "popup_closed", new JSONObject().put("button_id", z0Var32.a));
                                                                atomicBoolean3.set(true);
                                                                break;
                                                            } catch (JSONException e12) {
                                                                FileLog.e(e12);
                                                                return;
                                                            }
                                                        default:
                                                            j7 j7Var5 = j7Var;
                                                            z0 z0Var4 = z0Var3;
                                                            AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                            c1 c1Var5 = this.b;
                                                            c1Var5.getClass();
                                                            d2Var.dismiss();
                                                            try {
                                                                c1Var5.M = System.currentTimeMillis();
                                                                c1Var5.z(j7Var5, "popup_closed", new JSONObject().put("button_id", z0Var4.a));
                                                                atomicBoolean4.set(true);
                                                                break;
                                                            } catch (JSONException e13) {
                                                                FileLog.e(e13);
                                                            }
                                                    }
                                                }
                                            };
                                            j7Var2 = j7Var;
                                            alertDialog$Builder.i(str14, c2Var);
                                        } catch (JSONException e12) {
                                            e = e12;
                                            FileLog.e(e);
                                            return;
                                        }
                                    } else {
                                        c1Var2 = this;
                                        j7Var2 = j7Var;
                                    }
                                    alertDialog$Builder.j(new kh.i(c1Var2, atomicBoolean, j7Var2, 4));
                                    c1Var2.W = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        z0 z0Var4 = (z0) arrayList.get(0);
                                        if (z0Var4.c >= 0 && (textView3 = (TextView) c1Var2.W.d(-1)) != null) {
                                            textView3.setTextColor(c1Var2.k(z0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        z0 z0Var5 = (z0) arrayList.get(1);
                                        if (z0Var5.c >= 0 && (textView2 = (TextView) c1Var2.W.d(-2)) != null) {
                                            textView2.setTextColor(c1Var2.k(z0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        z0 z0Var6 = (z0) arrayList.get(2);
                                        if (z0Var6.c < 0 || (textView = (TextView) c1Var2.W.d(-3)) == null) {
                                            return;
                                        }
                                        textView.setTextColor(c1Var2.k(z0Var6.c));
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
                    c1Var = this;
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (c1Var.V != null) {
                            c1Var.G(optString3, "cancelled", true);
                            return;
                        }
                        c1Var.V = optString3;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = optString3;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        ConnectionsManager.getInstance(c1Var.J).sendRequest(tL_payments_getPaymentForm, new gg.y(c1Var, optString3, tL_inputInvoiceSlug, 19));
                        return;
                    } catch (JSONException e14) {
                        FileLog.e(e14);
                        break;
                    }
                case 7:
                    c1Var = this;
                    if (c1Var.R != null && System.currentTimeMillis() - c1Var.M <= 10000) {
                        try {
                            jSONObject = new JSONObject(str2);
                            j10 = Long.parseLong(jSONObject.getString("custom_emoji_id"));
                        } catch (Exception unused) {
                            j10 = 0;
                        }
                        try {
                            i13 = jSONObject.getInt("duration");
                        } catch (Exception unused2) {
                            i13 = 0;
                            user = c1Var.R;
                            if (user != null) {
                            }
                        }
                        user = c1Var.R;
                        if (user != null) {
                            c1Var.z(j7Var, "emoji_status_failed", B("UNKNOWN_ERROR", "error"));
                            return;
                        } else {
                            w3.f(c1Var.J, user, j10, i13, new r(c1Var, j7Var, 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    c1Var = this;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", c1Var.G).trim();
                        boolean z15 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : c1Var.E;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : c1Var.F;
                        boolean z16 = jSONObject6.optBoolean("is_progress_visible", false) && z15;
                        boolean z17 = jSONObject6.optBoolean("has_shine_effect", false) && z15;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : c1Var.H;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        c1Var.E = parseColor;
                        c1Var.F = parseColor2;
                        c1Var.G = trim;
                        c1Var.H = optString4;
                        c1Var.I = str2;
                        c1Var.c.l(z15, optBoolean, trim, j11, parseColor, parseColor2, z16, z17, optString4);
                        break;
                    } catch (Exception e15) {
                        FileLog.e(e15);
                        break;
                    }
                    break;
                case '\t':
                    c1Var = this;
                    try {
                        c1Var.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        return;
                    } catch (JSONException e16) {
                        FileLog.e(e16);
                        break;
                    }
                case '\n':
                    c1Var = this;
                    try {
                        if (!c1Var.e0 && c1Var.T != null) {
                            c1Var.f0 = new JSONObject(str2).optString("text");
                            c1Var.e0 = true;
                            if (Build.VERSION.SDK_INT < 23 || c1Var.T.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = c1Var.T;
                                if (activity != null) {
                                    c1Var.d0 = x9.e0(activity, 3, new o3.c(c1Var, 8));
                                    return;
                                }
                                break;
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new d0(c1Var, j7Var), NotificationCenter.onRequestPermissionResultReceived);
                                c1Var.T.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                return;
                            }
                        }
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        break;
                    }
                    break;
                case 11:
                    if (n(4)) {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            z(j7Var, "phone_requested", jSONObject7);
                            return;
                        } catch (Exception e18) {
                            FileLog.e(e18);
                            return;
                        }
                    }
                    final int i20 = this.J;
                    final y0 y0Var2 = this.a;
                    final String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), f6Var);
                    alertDialog$Builder2.l(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String userName = UserObject.getUserName(this.R);
                    if (TextUtils.isEmpty(userName)) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                    }
                    final boolean z18 = MessagesController.getInstance(this.J).blockePeers.indexOfKey(this.R.id) >= 0;
                    if (z18) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                    }
                    alertDialog$Builder2.g(spannableStringBuilder);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.web.w
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i21) {
                            strArr[0] = null;
                            d2Var.dismiss();
                            c1 c1Var3 = c1.this;
                            boolean z19 = z18;
                            int i22 = i20;
                            y0 y0Var3 = y0Var2;
                            j7 j7Var3 = j7Var;
                            if (z19) {
                                MessagesController.getInstance(c1Var3.J).unblockPeer(c1Var3.R.id, new et(c1Var3, i22, y0Var3, j7Var3, 12));
                                return;
                            }
                            SendMessagesHelper.getInstance(c1Var3.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(c1Var3.J).getCurrentUser(), c1Var3.R.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "sent");
                                c1.x(i22, y0Var3, j7Var3, "phone_requested", jSONObject8);
                            } catch (Exception e19) {
                                FileLog.e(e19);
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new cl0(10));
                    Y(4, alertDialog$Builder2.a(), new x(strArr, i20, y0Var2, j7Var, 0));
                    return;
                case '\f':
                    A();
                    return;
                case '\r':
                    if (this.R == null) {
                        return;
                    }
                    if (this.k0 == null) {
                        getContext();
                        int i21 = this.J;
                        this.k0 = new rh.i1(UserConfig.getInstance(i21).getClientUserId(), this.R.id, i21, true);
                    }
                    m(j7Var, this.k0, str2, "secure_storage_key_received", "secure_storage_failed");
                    return;
                case 14:
                    if (this.h0 == null) {
                        rh.q0 e19 = rh.q0.e(getContext(), this.J, this.R.id);
                        this.h0 = e19;
                        e19.f.add(tVar);
                    }
                    this.F0 = j7Var;
                    tVar.run();
                    return;
                case 15:
                    if (this.R == null || System.currentTimeMillis() - this.M > 10000) {
                        return;
                    }
                    this.M = 0L;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null || U.getParentLayout() == null) {
                        return;
                    }
                    e5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(this.R.id));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                    g0 g0Var = this.c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                case 16:
                    o(!((getParent() instanceof rh.m3) && ((rh.m3) getParent()).d()), true);
                    return;
                case 17:
                    if (this.R == null || System.currentTimeMillis() - this.M > 10000) {
                        return;
                    }
                    w3.a(this.J, this.R.id, new r(this, j7Var, 0));
                    return;
                case 18:
                    rh.u0 z19 = this.c.z();
                    if (z19 == null || !z19.h()) {
                        z(j7Var, "device_orientation_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        z(j7Var, "device_orientation_stopped", null);
                        return;
                    }
                case 19:
                    if (this.R == null) {
                        return;
                    }
                    if (this.j0 == null) {
                        getContext();
                        int i22 = this.J;
                        this.j0 = new rh.i1(UserConfig.getInstance(i22).getClientUserId(), this.R.id, i22, false);
                    }
                    V(j7Var, this.j0, str2, "device_storage_key_saved", "device_storage_failed");
                    return;
                case 20:
                    if (this.R == null) {
                        return;
                    }
                    if (this.j0 == null) {
                        getContext();
                        int i23 = this.J;
                        this.j0 = new rh.i1(UserConfig.getInstance(i23).getClientUserId(), this.R.id, i23, false);
                    }
                    m(j7Var, this.j0, str2, "device_storage_key_received", "device_storage_failed");
                    return;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        str3 = null;
                    }
                    f();
                    rh.p pVar = this.g0;
                    if (pVar == null) {
                        return;
                    }
                    if (pVar.e) {
                        pVar.j(str3, true, null, new nh.a0(2, pVar, new r(this, j7Var, 3)));
                        return;
                    }
                    try {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("status", "failed");
                        z(j7Var, "biometry_auth_requested", jSONObject8);
                        return;
                    } catch (Exception e20) {
                        FileLog.e(e20);
                        return;
                    }
                case 22:
                    try {
                        z4 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z4 = false;
                    }
                    g0 g0Var2 = this.c;
                    if (g0Var2 != null) {
                        g0Var2.p(z4);
                        return;
                    }
                    return;
                case 23:
                    try {
                        jSONArray = new JSONArray(str2);
                        z10 = jSONArray.optBoolean(0, true);
                    } catch (Exception unused6) {
                        z10 = true;
                    }
                    try {
                        z11 = jSONArray.optBoolean(1, true);
                    } catch (Exception unused7) {
                        z11 = true;
                        h("allowScroll " + z10 + " " + z11);
                        if (getParent() instanceof rh.m3) {
                        }
                    }
                    h("allowScroll " + z10 + " " + z11);
                    if (getParent() instanceof rh.m3) {
                        return;
                    }
                    ((rh.m3) getParent()).a(z10, z11);
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
                    } catch (JSONException e21) {
                        FileLog.e(e21);
                        return;
                    }
                case 25:
                    if (this.R == null) {
                        return;
                    }
                    if (this.k0 == null) {
                        getContext();
                        int i24 = this.J;
                        this.k0 = new rh.i1(UserConfig.getInstance(i24).getClientUserId(), this.R.id, i24, true);
                    }
                    S(j7Var, this.k0, str2);
                    return;
                case 26:
                    if (System.currentTimeMillis() - this.M > 10000 || System.currentTimeMillis() - this.N < 2000) {
                        return;
                    }
                    this.M = 0L;
                    this.N = System.currentTimeMillis();
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
                        if (!MessagesController.getInstance(this.J).storiesEnabled()) {
                            new eg.o1((org.telegram.ui.ActionBar.p2) new eg.y1(this), 14, true).show();
                            return;
                        }
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.T);
                        new HttpGetFileTask(new a0(this, d2Var, str8, str10, str9), null).execute(str7);
                        d2Var.q(250L);
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
                    if (this.R == null) {
                        return;
                    }
                    if (this.h0 == null) {
                        rh.q0 e26 = rh.q0.e(getContext(), this.J, this.R.id);
                        this.h0 = e26;
                        e26.f.add(tVar);
                    }
                    this.F0 = j7Var;
                    if (this.h0.g()) {
                        this.h0.k(new s(this, j7Var, 0));
                        return;
                    } else {
                        this.h0.j(new r(this, j7Var, 1));
                        return;
                    }
                case 28:
                    rh.u0 z20 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long clamp = Utilities.clamp(j13, 1000L, 20L);
                    if (z20 == null || !z20.d(clamp)) {
                        z(j7Var, "gyroscope_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        z(j7Var, "gyroscope_started", null);
                        return;
                    }
                case 29:
                    try {
                        z12 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e27) {
                        FileLog.e(e27);
                        z12 = false;
                    }
                    this.c.y();
                    if (z12) {
                        if (this.A0 && LaunchActivity.D1 != null) {
                            Activity findActivity = AndroidUtilities.findActivity(getContext());
                            if (findActivity == null) {
                                findActivity = LaunchActivity.D1;
                            }
                            if (findActivity == null || findActivity.isFinishing()) {
                                return;
                            }
                            findActivity.moveTaskToBack(true);
                            return;
                        }
                        if (this.B0 == null || (launchActivity = LaunchActivity.D1) == null || launchActivity.P() == null) {
                            return;
                        }
                        n3 P = LaunchActivity.D1.P();
                        ArrayList<m3> tabs = P.getTabs();
                        int i25 = 0;
                        while (true) {
                            if (i25 < tabs.size()) {
                                m3 m3Var2 = tabs.get(i25);
                                if (!this.B0.equals(m3Var2.a) || m3Var2.b == this.a) {
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
                    U(this.a.getUrl(), true);
                    return;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.c.h() && System.currentTimeMillis() - this.M <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            z(j7Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            return;
                        }
                        z(j7Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                        return;
                    } catch (JSONException e28) {
                        FileLog.e(e28);
                        return;
                    }
                case ' ':
                    Activity findActivity2 = AndroidUtilities.findActivity(getContext());
                    if (findActivity2 == null) {
                        findActivity2 = LaunchActivity.D1;
                    }
                    if (findActivity2 != null) {
                        AndroidUtilities.hideKeyboard(findActivity2.getCurrentFocus());
                        return;
                    }
                    return;
                case '!':
                    rh.u0 z21 = this.c.z();
                    if (z21 == null || !z21.g()) {
                        z(j7Var, "gyroscope_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        z(j7Var, "gyroscope_stopped", null);
                        return;
                    }
                case '\"':
                    if (this.R == null) {
                        return;
                    }
                    if (this.k0 == null) {
                        getContext();
                        int i26 = this.J;
                        this.k0 = new rh.i1(UserConfig.getInstance(i26).getClientUserId(), this.R.id, i26, true);
                    }
                    e(j7Var, this.k0, str2, "secure_storage_cleared", "secure_storage_cleared");
                    return;
                case '#':
                    if (this.R == null) {
                        return;
                    }
                    if (this.j0 == null) {
                        getContext();
                        int i27 = this.J;
                        this.j0 = new rh.i1(UserConfig.getInstance(i27).getClientUserId(), this.R.id, i27, false);
                    }
                    e(j7Var, this.j0, str2, "device_storage_cleared", "device_storage_failed");
                    return;
                case '$':
                    rh.u0 z22 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long clamp2 = Utilities.clamp(j13, 1000L, 20L);
                    if (z22 == null || !z22.c(clamp2)) {
                        z(j7Var, "accelerometer_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        z(j7Var, "accelerometer_started", null);
                        return;
                    }
                case '%':
                    rh.u0 z23 = this.c.z();
                    if (z23 == null || !z23.f()) {
                        z(j7Var, "accelerometer_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        z(j7Var, "accelerometer_stopped", null);
                        return;
                    }
                case '&':
                    if (this.R == null || System.currentTimeMillis() - this.M > 10000) {
                        return;
                    }
                    try {
                        String string7 = new JSONObject(str2).getString("id");
                        if (TextUtils.isEmpty(string7)) {
                            z(j7Var, "prepared_message_failed", B("MESSAGE_EXPIRED", "error"));
                            return;
                        } else {
                            rh.e1.Q(getContext(), this.J, this.R.id, string7, this.e, new t(this, 0), new kh.a0(this, j7Var, botWebViewContainer$BotWebViewProxy, 8));
                            return;
                        }
                    } catch (Exception e29) {
                        FileLog.e(e29);
                        z(j7Var, "prepared_message_failed", B("MESSAGE_EXPIRED", "error"));
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
                    P(this.E0, true);
                    return;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    if (this.R == null || System.currentTimeMillis() - this.M > 10000) {
                        return;
                    }
                    if (MediaDataController.getInstance(this.J).isShortcutAdded(this.R.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                        z(j7Var, "home_screen_added", null);
                        return;
                    } else {
                        MediaDataController.getInstance(this.J).installShortcut(this.R.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new s(this, j7Var, 2));
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    try {
                        z13 = new JSONObject(str2).optBoolean("blur", true);
                    } catch (Exception unused10) {
                        z13 = true;
                    }
                    String g10 = this.c.g(true, z13);
                    if (g10 == null) {
                        z(j7Var, "fullscreen_changed", C("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z13)));
                        return;
                    } else {
                        z(j7Var, "fullscreen_failed", B(g10, "error"));
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
                        this.c.v(this.R, jSONObject11.getString("query"), arrayList2);
                        return;
                    } catch (JSONException e31) {
                        FileLog.e(e31);
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    if (this.R == null) {
                        return;
                    }
                    if (this.k0 == null) {
                        getContext();
                        int i29 = this.J;
                        this.k0 = new rh.i1(UserConfig.getInstance(i29).getClientUserId(), this.R.id, i29, true);
                    }
                    V(j7Var, this.k0, str2, "secure_storage_key_saved", "secure_storage_failed");
                    return;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    String g11 = this.c.g(false, true);
                    if (g11 == null) {
                        z(j7Var, "fullscreen_changed", B(Boolean.FALSE, "is_fullscreen"));
                        return;
                    } else {
                        z(j7Var, "fullscreen_failed", B(g11, "error"));
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    if (this.L0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z24 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c1.this.L0.run(Boolean.valueOf(z24), Double.valueOf(d), optString6, Double.valueOf(optDouble));
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
                    if (this.R == null || System.currentTimeMillis() - this.M > 10000) {
                        return;
                    }
                    this.M = 0L;
                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                    if (U2 == null || U2.getParentLayout() == null) {
                        return;
                    }
                    e5 parentLayout2 = U2.getParentLayout();
                    U2.presentFragment(ProfileActivity.m4(this.R.id));
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
                        if (optBoolean3 != this.O) {
                            this.O = optBoolean3;
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
                    } catch (Exception unused11) {
                    }
                    f();
                    rh.p pVar2 = this.g0;
                    if (pVar2 == null) {
                        return;
                    }
                    boolean z25 = pVar2.f;
                    if (z25) {
                        w(j7Var);
                        return;
                    }
                    if (pVar2.e) {
                        if (!z25) {
                            pVar2.f = true;
                            pVar2.k();
                        }
                        w(j7Var);
                        return;
                    }
                    final Runnable[] runnableArr = {new sg1(8, this, j7Var)};
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), f6Var);
                    if (TextUtils.isEmpty(str12)) {
                        alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                        i12 = 0;
                        alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.R))));
                    } else {
                        i12 = 0;
                        alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.R))));
                        alertDialog$Builder3.g(str12);
                    }
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.z
                        public final /* synthetic */ c1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.c2
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i30) {
                            switch (i12) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    c1 c1Var3 = this.b;
                                    rh.p pVar3 = c1Var3.g0;
                                    pVar3.f = true;
                                    pVar3.k();
                                    rh.p pVar4 = c1Var3.g0;
                                    r rVar = new r(c1Var3, j7Var, 2);
                                    pVar4.getClass();
                                    pVar4.j(null, true, null, new nh.a0(2, pVar4, rVar));
                                    break;
                                default:
                                    c1 c1Var4 = this.b;
                                    c1Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    rh.p pVar5 = c1Var4.g0;
                                    pVar5.f = true;
                                    pVar5.d = true;
                                    pVar5.k();
                                    c1Var4.w(j7Var);
                                    break;
                            }
                        }
                    });
                    final int i30 = 1;
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.web.z
                        public final /* synthetic */ c1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.c2
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i302) {
                            switch (i30) {
                                case 0:
                                    Runnable[] runnableArr2 = runnableArr;
                                    if (runnableArr2[0] != null) {
                                        runnableArr2[0] = null;
                                    }
                                    c1 c1Var3 = this.b;
                                    rh.p pVar3 = c1Var3.g0;
                                    pVar3.f = true;
                                    pVar3.k();
                                    rh.p pVar4 = c1Var3.g0;
                                    r rVar = new r(c1Var3, j7Var, 2);
                                    pVar4.getClass();
                                    pVar4.j(null, true, null, new nh.a0(2, pVar4, rVar));
                                    break;
                                default:
                                    c1 c1Var4 = this.b;
                                    c1Var4.getClass();
                                    Runnable[] runnableArr3 = runnableArr;
                                    if (runnableArr3[0] != null) {
                                        runnableArr3[0] = null;
                                    }
                                    rh.p pVar5 = c1Var4.g0;
                                    pVar5.f = true;
                                    pVar5.d = true;
                                    pVar5.k();
                                    c1Var4.w(j7Var);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder3.j(new eg.d0(runnableArr, 8));
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
                        if (optBoolean5 != this.P) {
                            this.P = optBoolean5;
                            this.c.t(optBoolean5);
                            return;
                        }
                        return;
                    } catch (JSONException e37) {
                        FileLog.e(e37);
                        return;
                    }
                case '6':
                    z(j7Var, "home_screen_checked", B((this.R == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.J).isShortcutAdded(this.R.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
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
                    getrequestedwebviewbutton.bot = MessagesController.getInstance(this.J).getInputUser(this.R);
                    getrequestedwebviewbutton.webapp_req_id = str11;
                    int i31 = 0;
                    ConnectionsManager.getInstance(this.J).sendRequestTyped(getrequestedwebviewbutton, new tb0(i31), new v(this, j7Var, str11, i31));
                    return;
                case '8':
                    rh.u0 z29 = this.c.z();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        z14 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        z14 = false;
                    }
                    long clamp3 = Utilities.clamp(j13, 1000L, 20L);
                    if (z29 == null || !z29.e(clamp3, z14)) {
                        z(j7Var, "device_orientation_failed", B("UNSUPPORTED", "error"));
                        return;
                    } else {
                        z(j7Var, "device_orientation_started", null);
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
                        rh.p pVar3 = this.g0;
                        if (pVar3 == null) {
                            return;
                        }
                        if (pVar3.e) {
                            pVar3.l(str13, string8, new kh.h(this, string8, j7Var, 11));
                            return;
                        }
                        try {
                            JSONObject jSONObject17 = new JSONObject();
                            jSONObject17.put("status", "failed");
                            z(j7Var, "biometry_token_updated", jSONObject17);
                            return;
                        } catch (Exception e39) {
                            FileLog.e(e39);
                            return;
                        }
                    } catch (Exception e40) {
                        FileLog.e(e40);
                        if (e40 instanceof JSONException) {
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
                        g0 g0Var4 = this.c;
                        if (g0Var4 != null) {
                            g0Var4.r(v02);
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
                    } catch (Exception e42) {
                        FileLog.e(e42);
                        return;
                    }
                case '<':
                    Q(this.D0, true);
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
                    if (!n(3)) {
                        int i32 = this.J;
                        y0 y0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.J).getInputUser(this.R);
                        ConnectionsManager.getInstance(this.J).sendRequest(cansendmessage, new b8(this, i32, y0Var3, j7Var, 7));
                        return;
                    }
                    try {
                        JSONObject jSONObject19 = new JSONObject();
                        jSONObject19.put("status", "cancelled");
                        z(j7Var, "write_access_requested", jSONObject19);
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

    public final void G(String str, String str2, boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z4 || !Objects.equals(this.V, str)) {
                return;
            }
            this.V = null;
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public final void H(Uri uri, String str, boolean z4, boolean z10, boolean z11) {
        if (System.currentTimeMillis() - this.M <= 10000 || !z10) {
            this.M = 0L;
            boolean[] zArr = {false};
            if (ze.d.f(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            ze.d.r(getContext(), uri, true, z4, false, null, str, false, true, z11);
        }
    }

    public abstract void K(y0 y0Var);

    public final void M() {
        h("preserveWebView");
        this.y0 = true;
        if (this.l0) {
            y("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.p0++;
        }
        y0 y0Var = this.a;
        if (y0Var != null) {
            y0Var.f(null, null);
            this.a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.o0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.r0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.a = null;
        }
    }

    public final void O(int i10, y0 y0Var, Object obj, String str, boolean z4) {
        this.J = i10;
        this.y0 = false;
        boolean z10 = this.l0;
        if (z10) {
            this.p0++;
            this.q0 = z4;
            this.C0 = z4 ? l(str) : null;
        }
        X(y0Var, obj);
        if (z10) {
            y("visibility_changed", B(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i10, boolean z4) {
        JSONObject jSONObject;
        if (z4 || i10 != this.E0) {
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
            this.E0 = i10;
        }
    }

    public final void Q(Rect rect, boolean z4) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.D0;
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
                y("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.D != null) {
                F(this.o0, g(), "web_app_setup_main_button", this.D);
            }
            if (this.I != null) {
                F(this.o0, g(), "web_app_setup_secondary_button", this.I);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void S(j7 j7Var, rh.i1 i1Var, String str) {
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    z(j7Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = i1Var.h(optString);
                    if (h.isEmpty()) {
                        z(j7Var, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    a0 a0Var = new a0(this, j7Var, string, i1Var, optString);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    f6 resourceProvider = U != null ? U.getResourceProvider() : null;
                    int i10 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    g3 o10 = org.telegram.messenger.y3.o(context, resourceProvider, false, false);
                    LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                    p9 p9Var = new p9(context);
                    ArrayList arrayList = h;
                    TLRPC.User user = MessagesController.getInstance(i1Var.a).getUser(Long.valueOf(i1Var.b));
                    z8 z8Var = new z8((f6) null);
                    z8Var.r(user);
                    p9Var.e(user, z8Var);
                    f10.addView(p9Var, b6.t(80, 80, 49, 0, 21, 0, 13));
                    int i11 = j6.G6;
                    TextView b10 = k7.f6.b(context, 20.0f, i11, true, null);
                    org.telegram.messenger.y3.r(R.string.BotRestoreStorageTitle, b10, 17);
                    f10.addView(b10, b6.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = k7.f6.b(context, 14.0f, i11, false, null);
                    b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    b11.setGravity(17);
                    f10.addView(b11, b6.t(-1, -2, 7, 32, 0, 32, 19));
                    org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, resourceProvider);
                    z8Var2.setBackground(new mq(new ColorDrawable(j6.v0(j6.a7, resourceProvider)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.b7, resourceProvider))));
                    z8Var2.setFixedSize(12);
                    f10.addView(z8Var2, b6.t(-1, 12, 7, 0, 0, 0, 0));
                    l4 l4Var = new l4(context, resourceProvider);
                    l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    f10.addView(l4Var, b6.t(-1, -2, 7, 0, 0, 0, 0));
                    ph.d dVar = new ph.d(context, resourceProvider, true);
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        ArrayList arrayList3 = arrayList;
                        rh.h1 h1Var = (rh.h1) arrayList3.get(i12);
                        rh.g1 g1Var = new rh.g1(h1Var, i12 < arrayList3.size() - i10, context);
                        g1Var.setBackground(j6.f0(j6.v0(j6.i6, resourceProvider), 2, -1));
                        LinearLayout linearLayout = f10;
                        g1Var.setOnClickListener(new t3(strArr, h1Var, arrayList2, dVar, 15));
                        linearLayout.addView(g1Var, b6.n(-1, 56));
                        arrayList2.add(g1Var);
                        i12++;
                        o10 = o10;
                        arrayList = arrayList3;
                        f10 = linearLayout;
                        a0Var = a0Var;
                        i10 = 1;
                    }
                    a0 a0Var2 = a0Var;
                    g3 g3Var = o10;
                    LinearLayout linearLayout2 = f10;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, b6.t(-1, 48, 7, 8, 8, 8, 4));
                    g3Var.customView = linearLayout2;
                    g3Var.fixNavigationBar(j6.v0(j6.h5, resourceProvider));
                    dVar.setOnClickListener(new t3(zArr, a0Var2, strArr, g3Var, 16));
                    g3Var.setOnDismissListener(new gg.g(15, zArr, a0Var2));
                    g3Var.show();
                } catch (Exception e) {
                    z(j7Var, "secure_storage_failed", C("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
                z(j7Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            if (TextUtils.isEmpty("")) {
                return;
            }
            z(j7Var, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void U(String str, boolean z4) {
        y0 y0Var = this.a;
        if (y0Var != null) {
            boolean z10 = y0Var.B;
        }
        boolean z11 = y0Var == null || !y0Var.canGoBack();
        y0 y0Var2 = this.a;
        J(z11, y0Var2 == null || !y0Var2.canGoForward());
        y0 y0Var3 = this.a;
        if (y0Var3 != null) {
            y0Var3.b = true;
        }
        if (this.K) {
            h("setPageLoaded: already loaded");
            return;
        }
        nh.y3 y3Var = this.s;
        if (!z4 || y0Var3 == null || y3Var == null) {
            if (y0Var3 != null) {
                y0Var3.setAlpha(1.0f);
            }
            if (y3Var != null) {
                y3Var.setAlpha(0.0f);
                y3Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<y0, Float>) property, 1.0f), ObjectAnimator.ofFloat(y3Var, (Property<nh.y3, Float>) property, 0.0f));
            animatorSet.addListener(new ss0(this, 27));
            animatorSet.start();
        }
        this.b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.K = true;
        this.c.getClass();
    }

    public final void V(j7 j7Var, rh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        i1Var.n(optString, jSONObject.optString("value"));
                        z(j7Var, str2, B(string, "req_id"));
                    } catch (RuntimeException e) {
                        z(j7Var, str3, C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    z(j7Var, str3, C("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            if (TextUtils.isEmpty("")) {
                return;
            }
            z(j7Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void W() {
        y0 y0Var = this.a;
        if (y0Var == null || !this.l0) {
            return;
        }
        y0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!k7.x.a("WEB_MESSAGE_LISTENER")) {
            h("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        y0 y0Var2 = this.a;
        if (!y0Var2.O) {
            n2.b.a(y0Var2, "TelegramWebviewProxyMessage", singleton, new m5(y0Var2, 22));
            this.a.O = true;
        }
        if (k7.x.a("DOCUMENT_START_SCRIPT")) {
            y0 y0Var3 = this.a;
            if (y0Var3.P == null) {
                boolean z4 = n2.b.a;
                if (!o2.l.d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                o2.n c3 = n2.b.c(y0Var3);
                y0Var3.P = new bb.b((ScriptHandlerBoundaryInterface) ee.b.a(ScriptHandlerBoundaryInterface.class, c3.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 29);
            }
        }
    }

    public final void X(y0 y0Var, Object obj) {
        y0 y0Var2;
        TLRPC.User user;
        String str = "";
        y0 y0Var3 = this.a;
        if (y0Var3 != null) {
            y0Var3.destroy();
            removeView(this.a);
        }
        if (y0Var != null) {
            AndroidUtilities.removeFromParent(y0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !s());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (y0Var == null) {
            Context context = getContext();
            boolean z4 = this.l0;
            long j10 = 0;
            if (z4 && (user = this.R) != null) {
                j10 = user.id;
            }
            y0Var2 = new y0(context, z4, j10);
        } else {
            y0Var2 = y0Var;
        }
        this.a = y0Var2;
        if (this.l0) {
            y0Var2.setBackgroundColor(k(j6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.s0;
        }
        if (!MessagesController.getInstance(this.J).disableBotFullscreenBlur) {
            this.a.setLayerType(2, null);
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.z0);
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
        if (s()) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (y0Var == null && this.l0) {
            this.a.setAlpha(0.0f);
        }
        addView(this.a);
        if (this.l0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.o0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.o0 == null) {
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = new BotWebViewContainer$BotWebViewProxy();
                botWebViewContainer$BotWebViewProxy.a = this;
                this.o0 = botWebViewContainer$BotWebViewProxy;
            }
            this.o0.a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.r0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.r0;
            if (botWebViewContainer$WebViewProxy == null) {
                y0 y0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(y0Var4, this);
                this.r0 = botWebViewContainer$WebViewProxy2;
                y0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (y0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.r0.a = this;
        }
        K(this.a);
        M0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        if (d2Var == null || n(i10)) {
            return;
        }
        d2Var.setOnDismissListener(new gg.g(12, this, runnable));
        this.W = d2Var;
        d2Var.e0 = false;
        d2Var.show();
        if (this.H0 != i10) {
            this.H0 = i10;
            this.I0 = 0;
            this.J0 = 0L;
        }
        this.I0++;
    }

    public final void Z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        sb.append(str != null ? ": ".concat(str) : "");
        j(sb.toString());
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
            y0 y0Var = this.a;
            if (y0Var != null) {
                removeView(y0Var);
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
        m71 m71Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            y0 y0Var = this.a;
            if (y0Var != null) {
                y0Var.setBackgroundColor(k(j6.d6));
            }
            if (!this.n0) {
                int i12 = j6.Ki;
                int k10 = k(i12);
                this.m0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                nh.y3 y3Var = this.s;
                y3Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.m0);
                    this.r.setupGradient(i12, this.e, 1.0f, false);
                }
                y3Var.invalidate();
            }
            A();
            return;
        }
        if (i10 != NotificationCenter.onActivityResultReceived) {
            if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (m71Var = this.S) == null) {
                    return;
                }
                m71Var.run();
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

    public final void e(j7 j7Var, rh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var == null || this.R == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                i1Var.m(new JSONObject());
                z(j7Var, str2, B(string, "req_id"));
            } catch (RuntimeException e) {
                z(j7Var, str3, C("req_id", string, "error", e.getMessage()));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            if (TextUtils.isEmpty("")) {
                return;
            }
            z(j7Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void f() {
        if (this.R == null) {
            return;
        }
        rh.p pVar = this.g0;
        if (pVar == null) {
            this.g0 = rh.p.c(getContext(), this.J, this.R.id);
        } else {
            pVar.h();
        }
    }

    public final j7 g() {
        y0 y0Var = this.a;
        long j10 = this.p0;
        boolean z4 = this.q0;
        String str = this.C0;
        j7 j7Var = new j7();
        j7Var.c = this;
        j7Var.d = y0Var;
        j7Var.a = j10;
        j7Var.b = z4;
        j7Var.e = str;
        return j7Var;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.o0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof rh.m3)) {
            return 0;
        }
        rh.m3 m3Var = (rh.m3) getParent();
        if (m3Var.G) {
            return (int) ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) + this.w0);
        }
        return 0;
    }

    public String getOriginHost() {
        y0 y0Var = this.a;
        if (y0Var == null) {
            return null;
        }
        return l(y0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.r0;
    }

    public String getTrustedOrigin() {
        return this.C0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public y0 getWebView() {
        return this.a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.K0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.y0);
        y0 y0Var = this.a;
        if (y0Var != null) {
            if (y0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.y0) {
                this.a.destroy();
                L(this.a);
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
            rh.q0 q0Var = this.h0;
            if (q0Var != null) {
                q0Var.f.remove(this.G0);
                this.h0 = null;
                this.F0 = null;
            }
        }
    }

    public final void j(String str) {
        new qc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        f6 f6Var = this.e;
        return f6Var != null ? f6Var.x0(i10) : j6.w0(null, i10, false);
    }

    public final void m(j7 j7Var, rh.i1 i1Var, String str, String str2, String str3) {
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
                    z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
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
                        z(j7Var, str2, jSONObject);
                    } else {
                        z(j7Var, str2, C("req_id", string, "value", f10.first));
                    }
                } catch (RuntimeException e) {
                    z(j7Var, str3, C("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused2) {
                z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            if (TextUtils.isEmpty("")) {
                return;
            }
            z(j7Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean n(int i10) {
        if (this.W != null || (this.J0 > 0 && System.currentTimeMillis() < this.J0)) {
            return true;
        }
        if (this.H0 != i10 || this.I0 <= 3) {
            return false;
        }
        this.J0 = System.currentTimeMillis() + 3000;
        this.I0 = 0;
        return true;
    }

    public final void o(boolean z4, boolean z10) {
        boolean z11;
        invalidate();
        if ((this.K || z10) && (z11 = this.l0) && (getParent() instanceof rh.m3)) {
            rh.m3 m3Var = (rh.m3) getParent();
            if (z4) {
                this.L = m3Var.getSwipeOffsetY() == m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (m3Var.getTopActionBarOffsetY() + ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) - m3Var.getSwipeOffsetY()) + this.w0));
            if (!z10 && max == this.t0 && this.u0 == z4 && this.v0 == this.L) {
                return;
            }
            this.t0 = max;
            this.u0 = z4;
            this.v0 = this.L;
            String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z4 + ",is_expanded:" + this.L + "}";
            if (!z11 || r()) {
                NotificationCenter.getInstance(this.J).doOnIdle(new y(this, android.support.v4.media.a.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
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
        ic.a(this, new kh.t0(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ic.h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.x0;
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
        o(true, false);
    }

    public final boolean p(j7 j7Var) {
        boolean z4;
        if (j7Var == null) {
            return false;
        }
        String str = (String) j7Var.e;
        if (((c1) j7Var.c) != this || ((y0) j7Var.d) != this.a || j7Var.a != this.p0 || (z4 = j7Var.b) != this.q0) {
            return false;
        }
        if (z4) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.C0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    public final boolean r() {
        if (this.a == null) {
            return false;
        }
        if (this.q0) {
            return !TextUtils.isEmpty(this.C0) && TextUtils.equals(this.C0, getOriginHost());
        }
        return true;
    }

    public final boolean s() {
        return this.L0 != null;
    }

    public void setBotUser(TLRPC.User user) {
        this.R = user;
    }

    public void setDelegate(g0 g0Var) {
        this.c = g0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10 = AndroidUtilities.computePerceivedBrightness(i10) > 0.7f ? j6.b(0.0f, -0.15f, i10) : j6.b(0.025f, 0.15f, i10);
        if (this.m0 == b10) {
            return;
        }
        this.m0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        nh.y3 y3Var = this.s;
        y3Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.m0);
            this.r.setupGradient(j6.Ki, this.e, 1.0f, false);
        }
        this.n0 = true;
        y3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.x0 == i10) {
            return;
        }
        this.x0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z4) {
        this.O = z4;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.z0 = runnable;
        y0 y0Var = this.a;
        if (y0Var != null) {
            y0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.L0 = callback4;
    }

    public void setOpener(y0 y0Var) {
        y0 y0Var2;
        this.s0 = y0Var;
        if (this.l0 || (y0Var2 = this.a) == null) {
            return;
        }
        y0Var2.f = y0Var;
    }

    public void setParentActivity(Activity activity) {
        this.T = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z4) {
        this.U = z4;
    }

    public void setViewPortHeightOffset(float f10) {
        this.w0 = f10;
    }

    public void setWasOpenedByBot(y3 y3Var) {
        this.B0 = y3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z4) {
        this.A0 = z4;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.w = aVar;
    }

    public void setWebViewScrollListener(b1 b1Var) {
        this.d = b1Var;
        y0 y0Var = this.a;
        if (y0Var != null) {
            y0Var.f(this, b1Var);
        }
    }

    public final void t(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        nh.y3 y3Var = this.s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            y3Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(j6.a7))));
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
                y3Var.setVisibility(0);
                y3Var.setAlpha(1.0f);
                y3Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z4);
                return;
            }
            return;
        }
        f6 f6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.m0);
                this.r.setupGradient(j6.Ki, f6Var, 1.0f, false);
            }
            y3Var.f(null, null, this.r);
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
        y3Var.setVisibility(0);
        y3Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.m0);
            this.r.setupGradient(j6.Ki, f6Var, 1.0f, false);
        }
        y3Var.f(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z4) {
        this.J = i10;
        if (this.l0) {
            this.p0++;
            this.q0 = z4;
            this.C0 = z4 ? l(str) : null;
            if (this.a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void w(j7 j7Var) {
        if (this.R == null) {
            return;
        }
        f();
        rh.p pVar = this.g0;
        if (pVar == null) {
            return;
        }
        try {
            z(j7Var, "biometry_info_received", pVar.f());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.l0 && !r()) {
            h("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        h("notifyEvent " + str);
        NotificationCenter.getInstance(this.J).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z(j7 j7Var, String str, JSONObject jSONObject) {
        if (p(j7Var)) {
            y(str, jSONObject);
            return;
        }
        h("notifyEvent " + str + " dropped after document change");
    }

    public void I() {
    }

    public void L(y0 y0Var) {
    }

    public void setKeyboardFocusable(boolean z4) {
    }

    public void E(String str, boolean z4) {
    }

    public void J(boolean z4, boolean z10) {
    }
}
