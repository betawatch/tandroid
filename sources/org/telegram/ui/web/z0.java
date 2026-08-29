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
import i7.f6;
import i7.j6;
import ih.u3;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.b8;
import lh.y3;
import nh.d6;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.ib0;
import org.telegram.ui.n9;
import org.telegram.ui.r9;
import org.telegram.ui.xx0;
import org.telegram.ui.yu0;
import ph.m3;
import ph.p2;
import ph.w3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class z0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean I0 = true;
    public static int J0;
    public static HashMap K0;
    public int A;
    public final Rect A0;
    public String B;
    public int B0;
    public String C;
    public final u C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public String F;
    public long F0;
    public String G;
    public final int G0;
    public String H;
    public Utilities.Callback4 H0;
    public int I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;
    public boolean N;
    public boolean O;
    public boolean P;
    public TLRPC.User Q;
    public yw0 R;
    public Activity S;
    public boolean T;
    public String U;
    public org.telegram.ui.ActionBar.c2 V;
    public int W;
    public w0 a;
    public long a0;
    public String b;
    public long b0;
    public f0 c;
    public n9 c0;
    public y0 d;
    public boolean d0;
    public final c6 e;
    public String e0;
    public final TextView f;
    public ph.p f0;
    public ph.q0 g0;
    public boolean h;
    public ph.h0 h0;
    public ph.i1 i0;
    public ph.i1 j0;
    public final boolean k0;
    public int l0;
    public boolean m0;
    public final org.telegram.ui.Components.voip.h n;
    public BotWebViewContainer$BotWebViewProxy n0;
    public BotWebViewContainer$WebViewProxy o0;
    public w0 p0;
    public int q0;
    public SvgHelper.SvgDrawable r;
    public boolean r0;
    public final y3 s;
    public boolean s0;
    public float t0;
    public int u0;
    public boolean v;
    public boolean v0;
    public q0.a w;
    public Runnable w0;
    public ValueCallback x;
    public boolean x0;
    public int y;
    public ph.y3 y0;
    public String z0;

    public z0(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n = hVar;
        int i11 = g6.Oh;
        this.y = j(i11);
        int i12 = g6.Sh;
        this.A = j(i12);
        this.B = "";
        this.D = j(i11);
        this.E = j(i12);
        this.F = "";
        this.G = "";
        this.I = UserConfig.selectedAccount;
        this.u0 = -1;
        this.A0 = new Rect(0, 0, 0, 0);
        this.B0 = 0;
        this.C0 = new u(this, 1);
        this.D0 = -1;
        this.E0 = 0;
        int i13 = J0;
        J0 = i13 + 1;
        this.G0 = i13;
        this.k0 = z10;
        this.e = c6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.S = (Activity) context;
        }
        hVar.k = false;
        hVar.b(i10, 153);
        y3 y3Var = new y3(this, context);
        this.s = y3Var;
        int j10 = j(g6.Ki);
        this.l0 = j10;
        y3Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        y3Var.getImageReceiver().setAspectFit(true);
        addView(y3Var, f6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(g6.y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, f6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ye.d.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static String N(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
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

    public static void a(z0 z0Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            z0Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else {
            if (z0Var.d(strArr)) {
                aVar.accept(Boolean.TRUE);
                return;
            }
            z0Var.R = new yw0(z0Var, aVar, strArr, 10);
            Activity activity = z0Var.S;
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
        if (K0 == null) {
            K0 = new HashMap();
        }
        K0.put(N, hostAuthority);
        return ye.d.v(Uri.parse(str), "https", null, N, null);
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
                if (port != 0 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb2.append(":");
                    sb2.append(port);
                }
                return sb2.toString();
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
        if (K0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb2.toString()) && (str2 = (String) K0.get(hostAuthority)) != null) ? ye.d.v(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    private void setupFlickerParams(boolean z10) {
        this.v = z10;
        y3 y3Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y3Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        y3Var.requestLayout();
    }

    private void setupWebView(w0 w0Var) {
        Q(w0Var, null);
    }

    public static void u(int i10, w0 w0Var, String str, JSONObject jSONObject) {
        if (w0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new yw0(w0Var, str, jSONObject, 9));
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
    /* JADX WARN: Code restructure failed: missing block: B:927:0x07b9, code lost:
    
        r15.vibrate();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x11c9  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x0dfc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, String str, String str2) {
        char c3;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        boolean z10;
        boolean z11;
        LaunchActivity launchActivity;
        boolean z12;
        boolean z13;
        JSONArray jSONArray;
        final int i10;
        int i11;
        int i12;
        String str3;
        TextView textView;
        TextView textView2;
        TextView textView3;
        n9 n9Var;
        long j10;
        int i13;
        TLRPC.User user;
        JSONObject jSONObject;
        long j11;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z14;
        long j12;
        boolean z15;
        if (this.k0) {
            if (this.a == null || this.c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (this.z0 != null && !TextUtils.equals(getOriginHost(), this.z0)) {
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
            char c6 = c3;
            u uVar = this.C0;
            long j13 = 1000;
            c6 c6Var = this.e;
            BotWebViewVibrationEffect botWebViewVibrationEffect2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            l3 l3Var = null;
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
            switch (c6) {
                case 0:
                    if (this.Q != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            String string = jSONObject2.getString("req_id");
                            String string2 = jSONObject2.getString("method");
                            String obj = jSONObject2.get("params").toString();
                            int i14 = this.I;
                            w0 w0Var = this.a;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i14).getInputUser(this.Q.id);
                            invokewebviewcustommethod.custom_method = string2;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = obj;
                            ConnectionsManager.getInstance(i14).sendRequest(invokewebviewcustommethod, new b8(this, string, i14, w0Var, 7));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            if (e10 instanceof JSONException) {
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
                    if (this.d0 && (n9Var = this.c0) != null) {
                        n9Var.dismiss();
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
                        if (MessagesController.getInstance(this.I).webAppAllowedProtocols != null && MessagesController.getInstance(this.I).webAppAllowedProtocols.contains(parse.getScheme())) {
                            D(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                            break;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                    break;
                case 4:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        if (this.h0 == null) {
                            this.h0 = ph.h0.c(getContext(), this.I, this.Q.id);
                        }
                        try {
                            JSONObject jSONObject4 = new JSONObject(str2);
                            String string3 = jSONObject4.getString("url");
                            String string4 = jSONObject4.getString("file_name");
                            if (this.h0.d(string3) != null) {
                                this.h0.b(string3, string4);
                                v("file_download_requested", x("downloading", "status"));
                                break;
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                                checkdownloadfileparams.file_name = string4;
                                checkdownloadfileparams.url = string3;
                                ConnectionsManager.getInstance(this.I).sendRequest(checkdownloadfileparams, new eg.z(this, string3, string4, 20));
                                break;
                            }
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            v("file_download_requested", x("cancelled", "status"));
                            return;
                        }
                    }
                    break;
                case 5:
                    try {
                        if (this.V != null) {
                            break;
                        } else {
                            if (System.currentTimeMillis() - this.a0 <= 150) {
                                int i15 = this.W + 1;
                                this.W = i15;
                                if (i15 >= 3) {
                                    this.W = 0;
                                    this.b0 = System.currentTimeMillis();
                                    break;
                                }
                            }
                            if (System.currentTimeMillis() - this.b0 <= 3000) {
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
                                    arrayList.add(new x0(jSONArray2.getJSONObject(i16)));
                                }
                                if (arrayList.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final x0 x0Var = (x0) arrayList.get(0);
                                        final int i17 = 2;
                                        alertDialog$Builder.k(x0Var.b, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.t
                                            public final /* synthetic */ z0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.b2
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i18) {
                                                switch (i17) {
                                                    case 0:
                                                        x0 x0Var2 = x0Var;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        z0 z0Var = this.b;
                                                        z0Var.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var.L = System.currentTimeMillis();
                                                            z0Var.v("popup_closed", new JSONObject().put("button_id", x0Var2.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    case 1:
                                                        x0 x0Var3 = x0Var;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        z0 z0Var2 = this.b;
                                                        z0Var2.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var2.L = System.currentTimeMillis();
                                                            z0Var2.v("popup_closed", new JSONObject().put("button_id", x0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                            return;
                                                        }
                                                    default:
                                                        x0 x0Var4 = x0Var;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        z0 z0Var3 = this.b;
                                                        z0Var3.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var3.L = System.currentTimeMillis();
                                                            z0Var3.v("popup_closed", new JSONObject().put("button_id", x0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e15) {
                                                            FileLog.e(e15);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() >= 2) {
                                        final x0 x0Var2 = (x0) arrayList.get(1);
                                        final int i18 = 0;
                                        alertDialog$Builder.h(x0Var2.b, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.t
                                            public final /* synthetic */ z0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.b2
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i182) {
                                                switch (i18) {
                                                    case 0:
                                                        x0 x0Var22 = x0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        z0 z0Var = this.b;
                                                        z0Var.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var.L = System.currentTimeMillis();
                                                            z0Var.v("popup_closed", new JSONObject().put("button_id", x0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    case 1:
                                                        x0 x0Var3 = x0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        z0 z0Var2 = this.b;
                                                        z0Var2.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var2.L = System.currentTimeMillis();
                                                            z0Var2.v("popup_closed", new JSONObject().put("button_id", x0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                            return;
                                                        }
                                                    default:
                                                        x0 x0Var4 = x0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        z0 z0Var3 = this.b;
                                                        z0Var3.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var3.L = System.currentTimeMillis();
                                                            z0Var3.v("popup_closed", new JSONObject().put("button_id", x0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e15) {
                                                            FileLog.e(e15);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final x0 x0Var3 = (x0) arrayList.get(2);
                                        final int i19 = 1;
                                        alertDialog$Builder.i(x0Var3.b, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.t
                                            public final /* synthetic */ z0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.b2
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i182) {
                                                switch (i19) {
                                                    case 0:
                                                        x0 x0Var22 = x0Var3;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        z0 z0Var = this.b;
                                                        z0Var.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var.L = System.currentTimeMillis();
                                                            z0Var.v("popup_closed", new JSONObject().put("button_id", x0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    case 1:
                                                        x0 x0Var32 = x0Var3;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        z0 z0Var2 = this.b;
                                                        z0Var2.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var2.L = System.currentTimeMillis();
                                                            z0Var2.v("popup_closed", new JSONObject().put("button_id", x0Var32.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                            return;
                                                        }
                                                    default:
                                                        x0 x0Var4 = x0Var3;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        z0 z0Var3 = this.b;
                                                        z0Var3.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            z0Var3.L = System.currentTimeMillis();
                                                            z0Var3.v("popup_closed", new JSONObject().put("button_id", x0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e15) {
                                                            FileLog.e(e15);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    alertDialog$Builder.j(new eg.g(this, atomicBoolean));
                                    this.V = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        x0 x0Var4 = (x0) arrayList.get(0);
                                        if (x0Var4.c >= 0 && (textView3 = (TextView) this.V.d(-1)) != null) {
                                            textView3.setTextColor(j(x0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        x0 x0Var5 = (x0) arrayList.get(1);
                                        if (x0Var5.c >= 0 && (textView2 = (TextView) this.V.d(-2)) != null) {
                                            textView2.setTextColor(j(x0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        x0 x0Var6 = (x0) arrayList.get(2);
                                        if (x0Var6.c >= 0 && (textView = (TextView) this.V.d(-3)) != null) {
                                            textView.setTextColor(j(x0Var6.c));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e13) {
                        FileLog.e(e13);
                        return;
                    }
                    break;
                case 6:
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (this.U != null) {
                            C(optString3, "cancelled", true);
                            break;
                        } else {
                            this.U = optString3;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = optString3;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.I).sendRequest(tL_payments_getPaymentForm, new eg.z(this, optString3, tL_inputInvoiceSlug, 21));
                            break;
                        }
                    } catch (JSONException e14) {
                        FileLog.e(e14);
                        return;
                    }
                case 7:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
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
                            long j14 = j10;
                            user = this.Q;
                            if (user != null) {
                            }
                        }
                        long j142 = j10;
                        user = this.Q;
                        if (user != null) {
                            v("emoji_status_failed", x("UNKNOWN_ERROR", "error"));
                            break;
                        } else {
                            w3.f(this.I, user, j142, i13, new s(this, 0));
                            break;
                        }
                    }
                    break;
                case '\b':
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", this.F).trim();
                        boolean z16 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : this.D;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : this.E;
                        boolean z17 = jSONObject6.optBoolean("is_progress_visible", false) && z16;
                        boolean z18 = jSONObject6.optBoolean("has_shine_effect", false) && z16;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : this.G;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        this.D = parseColor;
                        this.E = parseColor2;
                        this.F = trim;
                        this.G = optString4;
                        this.H = str2;
                        this.c.l(z16, optBoolean, trim, j11, parseColor, parseColor2, z17, z18, optString4);
                        break;
                    } catch (Exception e15) {
                        FileLog.e(e15);
                        return;
                    }
                case '\t':
                    try {
                        this.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        break;
                    } catch (JSONException e16) {
                        FileLog.e(e16);
                        return;
                    }
                case '\n':
                    try {
                        if (!this.d0 && this.S != null) {
                            this.e0 = new JSONObject(str2).optString("text");
                            this.d0 = true;
                            if (Build.VERSION.SDK_INT < 23 || this.S.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = this.S;
                                if (activity == null) {
                                    break;
                                } else {
                                    this.c0 = r9.e0(activity, 3, new d6(this, 11));
                                    break;
                                }
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new c0(this), NotificationCenter.onRequestPermissionResultReceived);
                                this.S.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                break;
                            }
                        }
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        return;
                    }
                    break;
                case 11:
                    if (!m(4)) {
                        int i20 = this.I;
                        w0 w0Var2 = this.a;
                        String[] strArr = {"cancelled"};
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), c6Var);
                        alertDialog$Builder2.l(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String userName = UserObject.getUserName(this.Q);
                        if (TextUtils.isEmpty(userName)) {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                        } else {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                        }
                        boolean z19 = MessagesController.getInstance(this.I).blockePeers.indexOfKey(this.Q.id) >= 0;
                        if (z19) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                        }
                        alertDialog$Builder2.g(spannableStringBuilder);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new org.telegram.messenger.j2(this, strArr, z19, i20, w0Var2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new xx0(5));
                        R(4, alertDialog$Builder2.a(), new x(strArr, i20, w0Var2, 0));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            v("phone_requested", jSONObject7);
                            break;
                        } catch (Exception e18) {
                            FileLog.e(e18);
                            return;
                        }
                    }
                case '\f':
                    w();
                    break;
                case '\r':
                    if (this.Q != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i21 = this.I;
                            this.j0 = new ph.i1(UserConfig.getInstance(i21).getClientUserId(), this.Q.id, i21, true);
                        }
                        l(this.j0, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.g0 == null) {
                        ph.q0 e19 = ph.q0.e(getContext(), this.I, this.Q.id);
                        this.g0 = e19;
                        e19.f.add(uVar);
                    }
                    uVar.run();
                    break;
                case 15:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        this.L = 0L;
                        o2 U = LaunchActivity.U();
                        if (U != null && U.getParentLayout() != null) {
                            b5 parentLayout = U.getParentLayout();
                            U.presentFragment(ProfileActivity.m4(this.Q.id));
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
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        w3.a(this.I, this.Q.id, new s(this, 1));
                        break;
                    }
                    break;
                case 18:
                    ph.u0 z20 = this.c.z();
                    if (z20 == null || !z20.h()) {
                        v("device_orientation_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("device_orientation_stopped", null);
                        break;
                    }
                case 19:
                    if (this.Q != null) {
                        if (this.i0 == null) {
                            getContext();
                            int i22 = this.I;
                            this.i0 = new ph.i1(UserConfig.getInstance(i22).getClientUserId(), this.Q.id, i22, false);
                        }
                        P(this.i0, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.Q != null) {
                        if (this.i0 == null) {
                            getContext();
                            int i23 = this.I;
                            this.i0 = new ph.i1(UserConfig.getInstance(i23).getClientUserId(), this.Q.id, i23, false);
                        }
                        l(this.i0, str2, "device_storage_key_received", "device_storage_failed");
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
                    ph.p pVar = this.f0;
                    if (pVar != null) {
                        if (pVar.e) {
                            pVar.j(str3, true, null, new lh.z(2, pVar, new s(this, 4)));
                            break;
                        } else {
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "failed");
                                v("biometry_auth_requested", jSONObject8);
                                break;
                            } catch (Exception e20) {
                                FileLog.e(e20);
                                return;
                            }
                        }
                    }
                    break;
                case 22:
                    try {
                        z10 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z10 = false;
                    }
                    f0 f0Var2 = this.c;
                    if (f0Var2 != null) {
                        f0Var2.p(z10);
                        break;
                    }
                    break;
                case 23:
                    try {
                        jSONArray = new JSONArray(str2);
                        z12 = jSONArray.optBoolean(0, true);
                    } catch (Exception unused6) {
                        z12 = true;
                    }
                    try {
                        z13 = jSONArray.optBoolean(1, true);
                    } catch (Exception unused7) {
                        z13 = true;
                        g("allowScroll " + z12 + " " + z13);
                        if (!(getParent() instanceof m3)) {
                            return;
                        }
                    }
                    g("allowScroll " + z12 + " " + z13);
                    if (!(getParent() instanceof m3)) {
                        ((m3) getParent()).a(z12, z13);
                        break;
                    }
                case 24:
                    try {
                        JSONObject jSONObject9 = new JSONObject(str2);
                        String optString5 = jSONObject9.optString("path_full");
                        boolean optBoolean2 = jSONObject9.optBoolean("force_request", false);
                        if (optString5.startsWith("/")) {
                            optString5 = optString5.substring(1);
                        }
                        D(Uri.parse("https://t.me/" + optString5), null, false, true, optBoolean2);
                        break;
                    } catch (JSONException e21) {
                        FileLog.e(e21);
                        return;
                    }
                case 25:
                    if (this.Q != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i24 = this.I;
                            this.j0 = new ph.i1(UserConfig.getInstance(i24).getClientUserId(), this.Q.id, i24, true);
                        }
                        M(this.j0, str2);
                        break;
                    }
                    break;
                case 26:
                    if (System.currentTimeMillis() - this.L <= 10000 && System.currentTimeMillis() - this.M >= 2000) {
                        this.L = 0L;
                        this.M = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject10 = new JSONObject(str2);
                            str4 = jSONObject10.optString("media_url");
                            try {
                                str5 = jSONObject10.optString("text");
                                try {
                                    JSONObject optJSONObject = jSONObject10.optJSONObject("widget_link");
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
                        } catch (Exception e25) {
                            e = e25;
                            str4 = null;
                            str5 = null;
                        }
                        if (str7 == null) {
                            if (MessagesController.getInstance(this.I).storiesEnabled()) {
                                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.S);
                                new HttpGetFileTask(new x1(this, c2Var, str5, str6, str8, 2), null).execute(str7);
                                c2Var.q(250L);
                                break;
                            } else {
                                new cg.p1((o2) new cg.z1(this), 14, true).show();
                                break;
                            }
                        }
                    }
                    break;
                case 27:
                    if (this.Q != null) {
                        if (this.g0 == null) {
                            ph.q0 e26 = ph.q0.e(getContext(), this.I, this.Q.id);
                            this.g0 = e26;
                            e26.f.add(uVar);
                        }
                        if (this.g0.g()) {
                            this.g0.k(new r(this, 1));
                            break;
                        } else {
                            this.g0.j(new s(this, 2));
                            break;
                        }
                    }
                    break;
                case 28:
                    ph.u0 z21 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long clamp = Utilities.clamp(j13, 1000L, 20L);
                    if (z21 == null || !z21.d(clamp)) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("gyroscope_started", null);
                        break;
                    }
                    break;
                case 29:
                    try {
                        z11 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e27) {
                        FileLog.e(e27);
                        z11 = false;
                    }
                    this.c.y();
                    if (z11) {
                        if (this.x0 && LaunchActivity.C1 != null) {
                            Activity findActivity = AndroidUtilities.findActivity(getContext());
                            if (findActivity == null) {
                                findActivity = LaunchActivity.C1;
                            }
                            if (findActivity != null && !findActivity.isFinishing()) {
                                findActivity.moveTaskToBack(true);
                                break;
                            }
                        } else if (this.y0 != null && (launchActivity = LaunchActivity.C1) != null && launchActivity.P() != null) {
                            org.telegram.ui.ActionBar.m3 P = LaunchActivity.C1.P();
                            ArrayList<l3> tabs = P.getTabs();
                            int i25 = 0;
                            while (true) {
                                if (i25 < tabs.size()) {
                                    l3 l3Var2 = tabs.get(i25);
                                    if (!this.y0.equals(l3Var2.a) || l3Var2.b == this.a) {
                                        i25++;
                                    } else {
                                        l3Var = l3Var2;
                                    }
                                }
                            }
                            if (l3Var != null) {
                                P.e(l3Var);
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
                        if (this.c.h() && System.currentTimeMillis() - this.L <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            v("clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            break;
                        }
                        v("clipboard_text_received", new JSONObject().put("req_id", string6));
                    } catch (JSONException e28) {
                        FileLog.e(e28);
                        return;
                    }
                    break;
                case ' ':
                    Activity findActivity2 = AndroidUtilities.findActivity(getContext());
                    if (findActivity2 == null) {
                        findActivity2 = LaunchActivity.C1;
                    }
                    if (findActivity2 != null) {
                        AndroidUtilities.hideKeyboard(findActivity2.getCurrentFocus());
                        break;
                    }
                    break;
                case '!':
                    ph.u0 z22 = this.c.z();
                    if (z22 == null || !z22.g()) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("gyroscope_stopped", null);
                        break;
                    }
                    break;
                case '\"':
                    if (this.Q != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i26 = this.I;
                            this.j0 = new ph.i1(UserConfig.getInstance(i26).getClientUserId(), this.Q.id, i26, true);
                        }
                        e(this.j0, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case '#':
                    if (this.Q != null) {
                        if (this.i0 == null) {
                            getContext();
                            int i27 = this.I;
                            this.i0 = new ph.i1(UserConfig.getInstance(i27).getClientUserId(), this.Q.id, i27, false);
                        }
                        e(this.i0, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case '$':
                    ph.u0 z23 = this.c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused9) {
                    }
                    long clamp2 = Utilities.clamp(j13, 1000L, 20L);
                    if (z23 == null || !z23.c(clamp2)) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("accelerometer_started", null);
                        break;
                    }
                case '%':
                    ph.u0 z24 = this.c.z();
                    if (z24 == null || !z24.f()) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("accelerometer_stopped", null);
                        break;
                    }
                    break;
                case '&':
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        try {
                            String string7 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string7)) {
                                v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                                break;
                            } else {
                                ph.e1.Q(getContext(), this.I, this.Q.id, string7, this.e, new u(this, 0), new bh.v(26, this, botWebViewContainer$BotWebViewProxy));
                                break;
                            }
                        } catch (Exception e29) {
                            FileLog.e(e29);
                            v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                            return;
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        break;
                    } catch (JSONException e30) {
                        FileLog.e(e30);
                        return;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    J(this.B0, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        if (MediaDataController.getInstance(this.I).isShortcutAdded(this.Q.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                            v("home_screen_added", null);
                            break;
                        } else {
                            MediaDataController.getInstance(this.I).installShortcut(this.Q.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new r(this, 0));
                            break;
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    try {
                        z14 = new JSONObject(str2).optBoolean("blur", true);
                    } catch (Exception unused10) {
                        z14 = true;
                    }
                    String g10 = this.c.g(true, z14);
                    if (g10 == null) {
                        v("fullscreen_changed", y("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z14)));
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
                        this.c.v(this.Q, jSONObject11.getString("query"), arrayList2);
                        break;
                    } catch (JSONException e31) {
                        FileLog.e(e31);
                        return;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    if (this.Q != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i29 = this.I;
                            this.j0 = new ph.i1(UserConfig.getInstance(i29).getClientUserId(), this.Q.id, i29, true);
                        }
                        P(this.j0, str2, "secure_storage_key_saved", "secure_storage_failed");
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
                    if (this.H0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z25 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z0.this.H0.run(Boolean.valueOf(z25), Double.valueOf(d), optString6, Double.valueOf(optDouble));
                                }
                            });
                            break;
                        } catch (Exception e32) {
                            FileLog.e(e32);
                            return;
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        this.L = 0L;
                        o2 U2 = LaunchActivity.U();
                        if (U2 != null && U2.getParentLayout() != null) {
                            b5 parentLayout2 = U2.getParentLayout();
                            U2.presentFragment(ProfileActivity.m4(this.Q.id));
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
                        if (optBoolean3 != this.N) {
                            this.N = optBoolean3;
                            this.c.i(optBoolean3);
                            break;
                        }
                    } catch (JSONException e33) {
                        FileLog.e(e33);
                        return;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    try {
                        str9 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused11) {
                    }
                    f();
                    ph.p pVar2 = this.f0;
                    if (pVar2 != null) {
                        boolean z26 = pVar2.f;
                        if (z26) {
                            t();
                            break;
                        } else if (pVar2.e) {
                            if (!z26) {
                                pVar2.f = true;
                                pVar2.k();
                            }
                            t();
                            break;
                        } else {
                            final Runnable[] runnableArr = {new u(this, 3)};
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), c6Var);
                            if (TextUtils.isEmpty(str9)) {
                                alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                i10 = 0;
                                alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.Q))));
                            } else {
                                i10 = 0;
                                alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.Q))));
                                alertDialog$Builder3.g(str9);
                            }
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.b0
                                public final /* synthetic */ z0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.b2
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i30) {
                                    switch (i10) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            z0 z0Var = this.b;
                                            ph.p pVar3 = z0Var.f0;
                                            pVar3.f = true;
                                            pVar3.k();
                                            ph.p pVar4 = z0Var.f0;
                                            s sVar = new s(z0Var, 3);
                                            pVar4.getClass();
                                            pVar4.j(null, true, null, new lh.z(2, pVar4, sVar));
                                            break;
                                        default:
                                            z0 z0Var2 = this.b;
                                            z0Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            ph.p pVar5 = z0Var2.f0;
                                            pVar5.f = true;
                                            pVar5.d = true;
                                            pVar5.k();
                                            z0Var2.t();
                                            break;
                                    }
                                }
                            });
                            final int i30 = 1;
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.b0
                                public final /* synthetic */ z0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.b2
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i302) {
                                    switch (i30) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            z0 z0Var = this.b;
                                            ph.p pVar3 = z0Var.f0;
                                            pVar3.f = true;
                                            pVar3.k();
                                            ph.p pVar4 = z0Var.f0;
                                            s sVar = new s(z0Var, 3);
                                            pVar4.getClass();
                                            pVar4.j(null, true, null, new lh.z(2, pVar4, sVar));
                                            break;
                                        default:
                                            z0 z0Var2 = this.b;
                                            z0Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            ph.p pVar5 = z0Var2.f0;
                                            pVar5.f = true;
                                            pVar5.d = true;
                                            pVar5.k();
                                            z0Var2.t();
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.j(new cg.d0(runnableArr, 8));
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
                    } catch (Exception e34) {
                        FileLog.e(e34);
                        return;
                    }
                    break;
                case '3':
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.B).trim();
                        boolean z27 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.y;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.A;
                        boolean z28 = jSONObject14.optBoolean("is_progress_visible", false) && z27;
                        boolean z29 = jSONObject14.optBoolean("has_shine_effect", false) && z27;
                        try {
                            j12 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j12 = 0;
                        }
                        this.y = parseColor3;
                        this.A = parseColor4;
                        this.B = trim2;
                        this.C = str2;
                        this.c.q(z27, optBoolean4, trim2, j12, parseColor3, parseColor4, z28, z29);
                        break;
                    } catch (Exception e35) {
                        FileLog.e(e35);
                        return;
                    }
                    break;
                case '4':
                    try {
                        this.c.x(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        break;
                    } catch (JSONException e36) {
                        FileLog.e(e36);
                        return;
                    }
                case '5':
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.O) {
                            this.O = optBoolean5;
                            this.c.t(optBoolean5);
                            break;
                        }
                    } catch (JSONException e37) {
                        FileLog.e(e37);
                        return;
                    }
                    break;
                case '6':
                    v("home_screen_checked", x((this.Q == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.I).isShortcutAdded(this.Q.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
                    break;
                case '7':
                    try {
                        str10 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e38) {
                        FileLog.e(e38);
                    }
                    if (str10 != null) {
                        TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                        getrequestedwebviewbutton.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                        getrequestedwebviewbutton.webapp_req_id = str10;
                        int i31 = 0;
                        ConnectionsManager.getInstance(this.I).sendRequestTyped(getrequestedwebviewbutton, new ib0(i31), new w(this, str10, i31));
                        break;
                    }
                    break;
                case '8':
                    ph.u0 z30 = this.c.z();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        z15 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        z15 = false;
                    }
                    long clamp3 = Utilities.clamp(j13, 1000L, 20L);
                    if (z30 == null || !z30.e(clamp3, z15)) {
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
                        ph.p pVar3 = this.f0;
                        if (pVar3 != null) {
                            if (pVar3.e) {
                                pVar3.l(str11, string8, new yu0(7, this, string8));
                                break;
                            } else {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    v("biometry_token_updated", jSONObject17);
                                    break;
                                } catch (Exception e39) {
                                    FileLog.e(e39);
                                    return;
                                }
                            }
                        }
                    } catch (Exception e40) {
                        FileLog.e(e40);
                        if (e40 instanceof JSONException) {
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
                        int v02 = TextUtils.isEmpty(optString10) ? g6.v0(g6.a7, c6Var) : Color.parseColor(optString10);
                        f0 f0Var4 = this.c;
                        if (f0Var4 != null) {
                            f0Var4.r(v02);
                            break;
                        }
                    } catch (Exception e41) {
                        FileLog.e(e41);
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
                                    i11 = g6.a7;
                                    i12 = i11;
                                }
                                i12 = -1;
                            } else {
                                if (optString12.equals("bg_color")) {
                                    i11 = g6.d6;
                                    i12 = i11;
                                }
                                i12 = -1;
                            }
                            if (i12 >= 0) {
                                this.c.u(i12, g6.v0(i12, c6Var), false);
                                break;
                            }
                        } else {
                            int parseColor5 = Color.parseColor(optString11);
                            if (parseColor5 != 0) {
                                this.c.u(-1, parseColor5, true);
                                break;
                            }
                        }
                    } catch (Exception e42) {
                        FileLog.e(e42);
                        return;
                    }
                    break;
                case '<':
                    K(this.A0, true);
                    break;
                case '=':
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        break;
                    } catch (Exception e43) {
                        FileLog.e(e43);
                        return;
                    }
                case '>':
                    if (!m(3)) {
                        int i32 = this.I;
                        w0 w0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                        ConnectionsManager.getInstance(this.I).sendRequest(cansendmessage, new eg.m0(this, i32, w0Var3, 9));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            v("write_access_requested", jSONObject19);
                            break;
                        } catch (Exception e44) {
                            FileLog.e(e44);
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

    public final void C(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z10 || !Objects.equals(this.U, str)) {
                return;
            }
            this.U = null;
        } catch (JSONException e10) {
            FileLog.e(e10);
        }
    }

    public final void D(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.L <= 10000 || !z11) {
            this.L = 0L;
            boolean[] zArr = {false};
            if (ye.d.f(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            ye.d.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
        }
    }

    public abstract void G(w0 w0Var);

    public final void J(int i10, boolean z10) {
        JSONObject jSONObject;
        if (z10 || i10 != this.B0) {
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
            this.B0 = i10;
        }
    }

    public final void K(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.A0;
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
                v("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void L() {
        try {
            String str = this.C;
            if (str != null) {
                B(this.n0, "web_app_setup_main_button", str);
            }
            String str2 = this.H;
            if (str2 != null) {
                B(this.n0, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void M(ph.i1 i1Var, String str) {
        if (i1Var == null || this.Q == null) {
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
                    eg.d1 d1Var = new eg.d1((Object) this, string, (Object) i1Var, (Object) optString, 15);
                    o2 U = LaunchActivity.U();
                    c6 resourceProvider = U != null ? U.getResourceProvider() : null;
                    int i10 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    f3 q6 = x3.q(context, resourceProvider, false, false);
                    LinearLayout g10 = x3.g(context, 1);
                    t9 t9Var = new t9(context);
                    ArrayList arrayList = h;
                    TLRPC.User user = MessagesController.getInstance(i1Var.a).getUser(Long.valueOf(i1Var.b));
                    e9 e9Var = new e9((c6) null);
                    e9Var.r(user);
                    t9Var.e(user, e9Var);
                    g10.addView(t9Var, f6.t(80, 80, 49, 0, 21, 0, 13));
                    int i11 = g6.G6;
                    TextView b10 = j6.b(context, 20.0f, i11, true, null);
                    org.telegram.ui.b.i(R.string.BotRestoreStorageTitle, b10, 17);
                    g10.addView(b10, f6.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = j6.b(context, 14.0f, i11, false, null);
                    b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    b11.setGravity(17);
                    g10.addView(b11, f6.t(-1, -2, 7, 32, 0, 32, 19));
                    y8 y8Var = new y8(context, resourceProvider);
                    y8Var.setBackground(new jq(new ColorDrawable(g6.v0(g6.a7, resourceProvider)), g6.U0(context, R.drawable.greydivider, g6.v0(g6.b7, resourceProvider))));
                    y8Var.setFixedSize(12);
                    g10.addView(y8Var, f6.t(-1, 12, 7, 0, 0, 0, 0));
                    k4 k4Var = new k4(context, resourceProvider);
                    k4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    g10.addView(k4Var, f6.t(-1, -2, 7, 0, 0, 0, 0));
                    nh.d dVar = new nh.d(context, resourceProvider, true);
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        ArrayList arrayList3 = arrayList;
                        ph.h1 h1Var = (ph.h1) arrayList3.get(i12);
                        ph.g1 g1Var = new ph.g1(h1Var, i12 < arrayList3.size() - i10, context);
                        g1Var.setBackground(g6.f0(g6.v0(g6.i6, resourceProvider), 2, -1));
                        LinearLayout linearLayout = g10;
                        g1Var.setOnClickListener(new u3(strArr, h1Var, arrayList2, dVar, 15));
                        linearLayout.addView(g1Var, f6.n(-1, 56));
                        arrayList2.add(g1Var);
                        i12++;
                        arrayList = arrayList3;
                        q6 = q6;
                        g10 = linearLayout;
                        d1Var = d1Var;
                        i10 = 1;
                    }
                    eg.d1 d1Var2 = d1Var;
                    f3 f3Var = q6;
                    LinearLayout linearLayout2 = g10;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, f6.t(-1, 48, 7, 8, 8, 8, 4));
                    f3Var.customView = linearLayout2;
                    f3Var.fixNavigationBar(g6.v0(g6.h5, resourceProvider));
                    dVar.setOnClickListener(new u3(zArr, d1Var2, strArr, f3Var, 16));
                    f3Var.setOnDismissListener(new eg.g(16, zArr, d1Var2));
                    f3Var.show();
                } catch (Exception e10) {
                    v("secure_storage_failed", y("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception unused) {
                v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v("secure_storage_failed", y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void O(String str, boolean z10) {
        w0 w0Var = this.a;
        if (w0Var != null) {
            boolean z11 = w0Var.A;
        }
        boolean z12 = w0Var == null || !w0Var.canGoBack();
        w0 w0Var2 = this.a;
        F(z12, w0Var2 == null || !w0Var2.canGoForward());
        w0 w0Var3 = this.a;
        if (w0Var3 != null) {
            w0Var3.b = true;
        }
        if (this.J) {
            g("setPageLoaded: already loaded");
            return;
        }
        y3 y3Var = this.s;
        if (!z10 || w0Var3 == null || y3Var == null) {
            if (w0Var3 != null) {
                w0Var3.setAlpha(1.0f);
            }
            if (y3Var != null) {
                y3Var.setAlpha(0.0f);
                y3Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<w0, Float>) property, 1.0f), ObjectAnimator.ofFloat(y3Var, (Property<y3, Float>) property, 0.0f));
            animatorSet.addListener(new cc1(this, 6));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.J = true;
        this.c.getClass();
    }

    public final void P(ph.i1 i1Var, String str, String str2, String str3) {
        if (i1Var == null || this.Q == null) {
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
                    } catch (RuntimeException e10) {
                        v(str3, y("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    v(str3, y("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                v(str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void Q(w0 w0Var, Object obj) {
        w0 w0Var2;
        TLRPC.User user;
        String str = "";
        w0 w0Var3 = this.a;
        if (w0Var3 != null) {
            w0Var3.destroy();
            removeView(this.a);
        }
        if (w0Var != null) {
            AndroidUtilities.removeFromParent(w0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !p());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (w0Var == null) {
            Context context = getContext();
            boolean z10 = this.k0;
            long j10 = 0;
            if (z10 && (user = this.Q) != null) {
                j10 = user.id;
            }
            w0Var2 = new w0(context, z10, j10);
        } else {
            w0Var2 = w0Var;
        }
        this.a = w0Var2;
        if (this.k0) {
            w0Var2.setBackgroundColor(j(g6.d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.a, true);
            CookieManager.getInstance().flush();
            this.a.f = this.p0;
        }
        if (!MessagesController.getInstance(this.I).disableBotFullscreenBlur) {
            this.a.setLayerType(2, null);
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.w0);
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
        if (!this.k0) {
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
            StringBuilder sb2 = new StringBuilder("(Linux; Android ");
            String str2 = Build.VERSION.RELEASE;
            sb2.append(str2);
            sb2.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb2.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.k0) {
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
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (w0Var == null && this.k0) {
            this.a.setAlpha(0.0f);
        }
        addView(this.a);
        if (this.k0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.n0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.n0;
            if (botWebViewContainer$BotWebViewProxy == null) {
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy2 = new BotWebViewContainer$BotWebViewProxy();
                botWebViewContainer$BotWebViewProxy2.a = this;
                this.n0 = botWebViewContainer$BotWebViewProxy2;
                this.a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy2, "TelegramWebviewProxy");
            } else if (w0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.n0.a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.o0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.o0;
            if (botWebViewContainer$WebViewProxy == null) {
                w0 w0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(w0Var4, this);
                this.o0 = botWebViewContainer$WebViewProxy2;
                w0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (w0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.o0.a = this;
        }
        G(this.a);
        I0 = false;
    }

    public final void R(int i10, org.telegram.ui.ActionBar.c2 c2Var, Runnable runnable) {
        if (c2Var == null || m(i10)) {
            return;
        }
        c2Var.setOnDismissListener(new eg.g(13, this, runnable));
        this.V = c2Var;
        c2Var.d0 = false;
        c2Var.show();
        if (this.D0 != i10) {
            this.D0 = i10;
            this.E0 = 0;
            this.F0 = 0L;
        }
        this.E0++;
    }

    public final void S(String str) {
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
            w0 w0Var = this.a;
            if (w0Var != null) {
                removeView(w0Var);
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
        yw0 yw0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            w0 w0Var = this.a;
            if (w0Var != null) {
                w0Var.setBackgroundColor(j(g6.d6));
            }
            if (!this.m0) {
                int i12 = g6.Ki;
                int j10 = j(i12);
                this.l0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                y3 y3Var = this.s;
                y3Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.l0);
                    this.r.setupGradient(i12, this.e, 1.0f, false);
                }
                y3Var.invalidate();
            }
            w();
            return;
        }
        if (i10 != NotificationCenter.onActivityResultReceived) {
            if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (yw0Var = this.R) == null) {
                    return;
                }
                yw0Var.run();
                this.R = null;
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
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
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
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
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

    public final void e(ph.i1 i1Var, String str, String str2, String str3) {
        if (i1Var == null || this.Q == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                i1Var.m(new JSONObject());
                v(str2, x(string, "req_id"));
            } catch (RuntimeException e10) {
                v(str3, y("req_id", string, "error", e10.getMessage()));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void f() {
        if (this.Q == null) {
            return;
        }
        ph.p pVar = this.f0;
        if (pVar == null) {
            this.f0 = ph.p.c(getContext(), this.I, this.Q.id);
        } else {
            pVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.G0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.n0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof m3)) {
            return 0;
        }
        m3 m3Var = (m3) getParent();
        if (m3Var.F) {
            return (int) ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) + this.t0);
        }
        return 0;
    }

    public String getOriginHost() {
        w0 w0Var = this.a;
        if (w0Var == null) {
            return null;
        }
        return k(w0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.o0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public w0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.v0);
        w0 w0Var = this.a;
        if (w0Var != null) {
            if (w0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.v0) {
                this.a.destroy();
                H(this.a);
            }
            this.J = false;
            if (this.f0 != null) {
                this.f0 = null;
            }
            if (this.i0 != null) {
                this.i0 = null;
            }
            if (this.j0 != null) {
                this.j0 = null;
            }
            ph.q0 q0Var = this.g0;
            if (q0Var != null) {
                q0Var.f.remove(this.C0);
                this.g0 = null;
            }
        }
    }

    public final void i(String str) {
        new tc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        c6 c6Var = this.e;
        return c6Var != null ? c6Var.C0(i10) : g6.w0(null, i10, false);
    }

    public final void l(ph.i1 i1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (i1Var == null || this.Q == null) {
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
                    Pair f9 = i1Var.f(optString);
                    if (i1Var.d && (obj = f9.first) == null) {
                        Object obj2 = f9.second;
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
                        v(str2, y("req_id", string, "value", f9.first));
                    }
                } catch (RuntimeException e10) {
                    v(str3, y("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception unused2) {
                v(str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final boolean m(int i10) {
        if (this.V != null || (this.F0 > 0 && System.currentTimeMillis() < this.F0)) {
            return true;
        }
        if (this.D0 != i10 || this.E0 <= 3) {
            return false;
        }
        this.F0 = System.currentTimeMillis() + 3000;
        this.E0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        invalidate();
        if ((this.J || z11) && this.k0 && (getParent() instanceof m3)) {
            m3 m3Var = (m3) getParent();
            if (z10) {
                this.K = m3Var.getSwipeOffsetY() == m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (m3Var.getTopActionBarOffsetY() + ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) - m3Var.getSwipeOffsetY()) + this.t0));
            if (!z11 && max == this.q0 && this.r0 == z10 && this.s0 == this.K) {
                return;
            }
            this.q0 = max;
            this.r0 = z10;
            this.s0 = this.K;
            NotificationCenter.getInstance(this.I).doOnIdle(new q(this, a4.w.n("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.K + "}", ");"), 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        mc.a(this, new ih.u0(this, 11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        mc.h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.u0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.T) {
            return;
        }
        n(true, false);
    }

    public final boolean p() {
        return this.H0 != null;
    }

    public final void q(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        y3 y3Var = this.s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            y3Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(g6.a7))));
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
                y3Var.setVisibility(0);
                y3Var.setAlpha(1.0f);
                y3Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        c6 c6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.l0);
                this.r.setupGradient(g6.Ki, c6Var, 1.0f, false);
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
            drawableByPath2.setColor(this.l0);
            this.r.setupGradient(g6.Ki, c6Var, 1.0f, false);
        }
        y3Var.f(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void r(int i10, String str) {
        this.I = i10;
        NotificationCenter.getInstance(i10).doOnIdle(new q(this, str, 1));
    }

    public void setBotUser(TLRPC.User user) {
        this.Q = user;
    }

    public void setDelegate(f0 f0Var) {
        this.c = f0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10 = AndroidUtilities.computePerceivedBrightness(i10) > 0.7f ? g6.b(0.0f, -0.15f, i10) : g6.b(0.025f, 0.15f, i10);
        if (this.l0 == b10) {
            return;
        }
        this.l0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        y3 y3Var = this.s;
        y3Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.l0);
            this.r.setupGradient(g6.Ki, this.e, 1.0f, false);
        }
        this.m0 = true;
        y3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.u0 == i10) {
            return;
        }
        this.u0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.N = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.w0 = runnable;
        w0 w0Var = this.a;
        if (w0Var != null) {
            w0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.H0 = callback4;
    }

    public void setOpener(w0 w0Var) {
        w0 w0Var2;
        this.p0 = w0Var;
        if (this.k0 || (w0Var2 = this.a) == null) {
            return;
        }
        w0Var2.f = w0Var;
    }

    public void setParentActivity(Activity activity) {
        this.S = activity;
    }

    public void setTrustedOrigin(String str) {
        this.z0 = k(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.T = z10;
    }

    public void setViewPortHeightOffset(float f9) {
        this.t0 = f9;
    }

    public void setWasOpenedByBot(ph.y3 y3Var) {
        this.y0 = y3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.x0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.w = aVar;
    }

    public void setWebViewScrollListener(y0 y0Var) {
        this.d = y0Var;
        w0 w0Var = this.a;
        if (w0Var != null) {
            w0Var.f(this, y0Var);
        }
    }

    public final void t() {
        if (this.Q == null) {
            return;
        }
        f();
        ph.p pVar = this.f0;
        if (pVar == null) {
            return;
        }
        try {
            v("biometry_info_received", pVar.f());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.I).doOnIdle(new q(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject p10;
        try {
            p10 = p2.p(this.e, true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (p10 != null) {
            jSONObject = new JSONObject().put("theme_params", p10);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public final boolean z() {
        if (this.a == null || !this.N) {
            return false;
        }
        v("back_button_pressed", null);
        return true;
    }

    public void E() {
    }

    public void H(w0 w0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void A(String str, boolean z10) {
    }

    public void F(boolean z10, boolean z11) {
    }
}
