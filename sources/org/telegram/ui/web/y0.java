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
import fh.g4;
import g7.e6;
import g7.i6;
import ih.d4;
import ih.f8;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mh.c3;
import mh.f4;
import mh.q4;
import mh.s4;
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
import org.telegram.messenger.j2;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.fk0;
import org.telegram.ui.gb0;
import org.telegram.ui.o9;
import org.telegram.ui.s9;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class y0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean I0 = true;
    public static int J0;
    public static HashMap K0;
    public int A;
    public final Rect A0;
    public String B;
    public int B0;
    public String C;
    public final t C0;
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
    public ue0 R;
    public Activity S;
    public boolean T;
    public String U;
    public org.telegram.ui.ActionBar.c2 V;
    public int W;
    public v0 a;
    public long a0;
    public String b;
    public long b0;
    public e0 c;
    public o9 c0;
    public x0 d;
    public boolean d0;
    public final b6 e;
    public String e0;
    public final TextView f;
    public mh.r f0;
    public mh.u0 g0;
    public boolean h;
    public mh.k0 h0;
    public mh.p1 i0;
    public mh.p1 j0;
    public final boolean k0;
    public int l0;
    public boolean m0;
    public final org.telegram.ui.Components.voip.h n;
    public BotWebViewContainer$BotWebViewProxy n0;
    public BotWebViewContainer$WebViewProxy o0;
    public v0 p0;
    public int q0;
    public SvgHelper.SvgDrawable r;
    public boolean r0;
    public final d4 s;
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
    public s4 y0;
    public String z0;

    public y0(int i9, Context context, b6 b6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n = hVar;
        int i10 = f6.Oh;
        this.y = j(i10);
        int i11 = f6.Sh;
        this.A = j(i11);
        this.B = "";
        this.D = j(i10);
        this.E = j(i11);
        this.F = "";
        this.G = "";
        this.I = UserConfig.selectedAccount;
        this.u0 = -1;
        this.A0 = new Rect(0, 0, 0, 0);
        this.B0 = 0;
        this.C0 = new t(this, 1);
        this.D0 = -1;
        this.E0 = 0;
        int i12 = J0;
        J0 = i12 + 1;
        this.G0 = i12;
        this.k0 = z10;
        this.e = b6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.S = (Activity) context;
        }
        hVar.k = false;
        hVar.b(i9, 153);
        d4 d4Var = new d4(this, context);
        this.s = d4Var;
        int j10 = j(f6.Ki);
        this.l0 = j10;
        d4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        d4Var.getImageReceiver().setAspectFit(true);
        addView(d4Var, e6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(f6.y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, e6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ve.e.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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
        for (int i9 = 0; i9 < split.length; i9++) {
            if (i9 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i9].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb2.toString();
    }

    public static void a(y0 y0Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            y0Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else {
            if (y0Var.d(strArr)) {
                aVar.accept(Boolean.TRUE);
                return;
            }
            y0Var.R = new ue0(y0Var, aVar, strArr, 21);
            Activity activity = y0Var.S;
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
        return ve.e.v(Uri.parse(str), "https", null, N, null);
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
        return (hostAuthority.endsWith(sb2.toString()) && (str2 = (String) K0.get(hostAuthority)) != null) ? ve.e.v(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    private void setupFlickerParams(boolean z10) {
        this.v = z10;
        d4 d4Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d4Var.requestLayout();
    }

    private void setupWebView(v0 v0Var) {
        Q(v0Var, null);
    }

    public static void u(int i9, v0 v0Var, String str, JSONObject jSONObject) {
        if (v0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i9).doOnIdle(new ue0(v0Var, str, jSONObject, 20));
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
    /* JADX WARN: Code restructure failed: missing block: B:888:0x07ba, code lost:
    
        r11.vibrate();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x11b8  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x11c4  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x0df6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, String str, String str2) {
        char c10;
        boolean z10;
        boolean z11;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        final int i9;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        LaunchActivity launchActivity;
        String str3;
        TextView textView;
        TextView textView2;
        TextView textView3;
        o9 o9Var;
        long j10;
        int i12;
        TLRPC.User user;
        JSONObject jSONObject;
        long j11;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        JSONObject jSONObject2;
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
            t tVar = this.C0;
            long j13 = 1000;
            b6 b6Var = this.e;
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
            switch (c11) {
                case 0:
                    if (this.Q != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(str2);
                            String string = jSONObject3.getString("req_id");
                            String string2 = jSONObject3.getString("method");
                            String obj = jSONObject3.get("params").toString();
                            int i13 = this.I;
                            v0 v0Var = this.a;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i13).getInputUser(this.Q.id);
                            invokewebviewcustommethod.custom_method = string2;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = obj;
                            ConnectionsManager.getInstance(i13).sendRequest(invokewebviewcustommethod, new f8(this, string, i13, v0Var, 8));
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
                    if (this.d0 && (o9Var = this.c0) != null) {
                        o9Var.dismiss();
                        break;
                    }
                    break;
                case 2:
                    t();
                    break;
                case 3:
                    try {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject4.optString("url"));
                        String optString = jSONObject4.optString("try_browser");
                        if (MessagesController.getInstance(this.I).webAppAllowedProtocols != null && MessagesController.getInstance(this.I).webAppAllowedProtocols.contains(parse.getScheme())) {
                            D(parse, optString, jSONObject4.optBoolean("try_instant_view"), true, false);
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
                            this.h0 = mh.k0.c(getContext(), this.I, this.Q.id);
                        }
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            String string3 = jSONObject5.getString("url");
                            String string4 = jSONObject5.getString("file_name");
                            if (this.h0.d(string3) != null) {
                                this.h0.b(string3, string4);
                                v("file_download_requested", x("downloading", "status"));
                                break;
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                                checkdownloadfileparams.file_name = string4;
                                checkdownloadfileparams.url = string3;
                                ConnectionsManager.getInstance(this.I).sendRequest(checkdownloadfileparams, new bg.b0(this, string3, string4, 22));
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
                                int i14 = this.W + 1;
                                this.W = i14;
                                if (i14 >= 3) {
                                    this.W = 0;
                                    this.b0 = System.currentTimeMillis();
                                    break;
                                }
                            }
                            if (System.currentTimeMillis() - this.b0 <= 3000) {
                                break;
                            } else {
                                JSONObject jSONObject6 = new JSONObject(str2);
                                String optString2 = jSONObject6.optString("title", null);
                                String string5 = jSONObject6.getString("message");
                                JSONArray jSONArray = jSONObject6.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                                alertDialog$Builder.l(optString2);
                                alertDialog$Builder.g(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                                    arrayList.add(new w0(jSONArray.getJSONObject(i15)));
                                }
                                if (arrayList.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final w0 w0Var = (w0) arrayList.get(0);
                                        final int i16 = 2;
                                        alertDialog$Builder.k(w0Var.b, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s
                                            public final /* synthetic */ y0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.b2
                                            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i17) {
                                                switch (i16) {
                                                    case 0:
                                                        w0 w0Var2 = w0Var;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        y0 y0Var = this.b;
                                                        y0Var.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var.L = System.currentTimeMillis();
                                                            y0Var.v("popup_closed", new JSONObject().put("button_id", w0Var2.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    case 1:
                                                        w0 w0Var3 = w0Var;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        y0 y0Var2 = this.b;
                                                        y0Var2.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var2.L = System.currentTimeMillis();
                                                            y0Var2.v("popup_closed", new JSONObject().put("button_id", w0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                            return;
                                                        }
                                                    default:
                                                        w0 w0Var4 = w0Var;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        y0 y0Var3 = this.b;
                                                        y0Var3.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var3.L = System.currentTimeMillis();
                                                            y0Var3.v("popup_closed", new JSONObject().put("button_id", w0Var4.a));
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
                                        final w0 w0Var2 = (w0) arrayList.get(1);
                                        final int i17 = 0;
                                        alertDialog$Builder.h(w0Var2.b, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s
                                            public final /* synthetic */ y0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.b2
                                            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                switch (i17) {
                                                    case 0:
                                                        w0 w0Var22 = w0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        y0 y0Var = this.b;
                                                        y0Var.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var.L = System.currentTimeMillis();
                                                            y0Var.v("popup_closed", new JSONObject().put("button_id", w0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    case 1:
                                                        w0 w0Var3 = w0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        y0 y0Var2 = this.b;
                                                        y0Var2.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var2.L = System.currentTimeMillis();
                                                            y0Var2.v("popup_closed", new JSONObject().put("button_id", w0Var3.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                            return;
                                                        }
                                                    default:
                                                        w0 w0Var4 = w0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        y0 y0Var3 = this.b;
                                                        y0Var3.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var3.L = System.currentTimeMillis();
                                                            y0Var3.v("popup_closed", new JSONObject().put("button_id", w0Var4.a));
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
                                        final w0 w0Var3 = (w0) arrayList.get(2);
                                        final int i18 = 1;
                                        alertDialog$Builder.i(w0Var3.b, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.s
                                            public final /* synthetic */ y0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.ui.ActionBar.b2
                                            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                switch (i18) {
                                                    case 0:
                                                        w0 w0Var22 = w0Var3;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        y0 y0Var = this.b;
                                                        y0Var.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var.L = System.currentTimeMillis();
                                                            y0Var.v("popup_closed", new JSONObject().put("button_id", w0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                    case 1:
                                                        w0 w0Var32 = w0Var3;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        y0 y0Var2 = this.b;
                                                        y0Var2.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var2.L = System.currentTimeMillis();
                                                            y0Var2.v("popup_closed", new JSONObject().put("button_id", w0Var32.a));
                                                            atomicBoolean3.set(true);
                                                            break;
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                            return;
                                                        }
                                                    default:
                                                        w0 w0Var4 = w0Var3;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        y0 y0Var3 = this.b;
                                                        y0Var3.getClass();
                                                        c2Var.dismiss();
                                                        try {
                                                            y0Var3.L = System.currentTimeMillis();
                                                            y0Var3.v("popup_closed", new JSONObject().put("button_id", w0Var4.a));
                                                            atomicBoolean4.set(true);
                                                            break;
                                                        } catch (JSONException e15) {
                                                            FileLog.e(e15);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    alertDialog$Builder.j(new bg.j(this, atomicBoolean));
                                    this.V = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        w0 w0Var4 = (w0) arrayList.get(0);
                                        if (w0Var4.c >= 0 && (textView3 = (TextView) this.V.d(-1)) != null) {
                                            textView3.setTextColor(j(w0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        w0 w0Var5 = (w0) arrayList.get(1);
                                        if (w0Var5.c >= 0 && (textView2 = (TextView) this.V.d(-2)) != null) {
                                            textView2.setTextColor(j(w0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        w0 w0Var6 = (w0) arrayList.get(2);
                                        if (w0Var6.c >= 0 && (textView = (TextView) this.V.d(-3)) != null) {
                                            textView.setTextColor(j(w0Var6.c));
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
                            ConnectionsManager.getInstance(this.I).sendRequest(tL_payments_getPaymentForm, new bg.b0(this, optString3, tL_inputInvoiceSlug, 23));
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
                            i12 = jSONObject.getInt("duration");
                        } catch (Exception unused2) {
                            i12 = 0;
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
                            q4.f(this.I, user, j142, i12, new r(this, 0));
                            break;
                        }
                    }
                    break;
                case '\b':
                    try {
                        JSONObject jSONObject7 = new JSONObject(str2);
                        boolean optBoolean = jSONObject7.optBoolean("is_active", false);
                        String trim = jSONObject7.optString("text", this.F).trim();
                        boolean z16 = jSONObject7.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject7.has("color") ? Color.parseColor(jSONObject7.optString("color")) : this.D;
                        int parseColor2 = jSONObject7.has("text_color") ? Color.parseColor(jSONObject7.optString("text_color")) : this.E;
                        boolean z17 = jSONObject7.optBoolean("is_progress_visible", false) && z16;
                        boolean z18 = jSONObject7.optBoolean("has_shine_effect", false) && z16;
                        String optString4 = jSONObject7.has("position") ? jSONObject7.optString("position") : this.G;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject7.getString("icon_custom_emoji_id"));
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
                                    this.c0 = s9.d0(activity, 3, new n5.a0(this, 11));
                                    break;
                                }
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new a0(this), NotificationCenter.onRequestPermissionResultReceived);
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
                        int i19 = this.I;
                        v0 v0Var2 = this.a;
                        String[] strArr = {"cancelled"};
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), b6Var);
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
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new j2(this, strArr, z19, i19, v0Var2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fk0(11));
                        R(4, alertDialog$Builder2.a(), new w(strArr, i19, v0Var2, 0));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("status", "cancelled");
                            v("phone_requested", jSONObject8);
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
                            int i20 = this.I;
                            this.j0 = new mh.p1(UserConfig.getInstance(i20).getClientUserId(), this.Q.id, i20, true);
                        }
                        l(this.j0, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.g0 == null) {
                        mh.u0 e19 = mh.u0.e(getContext(), this.I, this.Q.id);
                        this.g0 = e19;
                        e19.f.add(tVar);
                    }
                    tVar.run();
                    break;
                case 15:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        this.L = 0L;
                        o2 U = LaunchActivity.U();
                        if (U != null && U.getParentLayout() != null) {
                            b5 parentLayout = U.getParentLayout();
                            U.presentFragment(ProfileActivity.m4(this.Q.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                            e0 e0Var = this.c;
                            if (e0Var != null) {
                                e0Var.b();
                                break;
                            }
                        }
                    }
                    break;
                case 16:
                    n(!((getParent() instanceof f4) && ((f4) getParent()).d()), true);
                    break;
                case 17:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        q4.a(this.I, this.Q.id, new r(this, 1));
                        break;
                    }
                    break;
                case 18:
                    mh.y0 z20 = this.c.z();
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
                            int i21 = this.I;
                            this.i0 = new mh.p1(UserConfig.getInstance(i21).getClientUserId(), this.Q.id, i21, false);
                        }
                        P(this.i0, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.Q != null) {
                        if (this.i0 == null) {
                            getContext();
                            int i22 = this.I;
                            this.i0 = new mh.p1(UserConfig.getInstance(i22).getClientUserId(), this.Q.id, i22, false);
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
                    mh.r rVar = this.f0;
                    if (rVar != null) {
                        if (rVar.e) {
                            rVar.j(str3, true, null, new ih.b0(2, rVar, new r(this, 4)));
                            break;
                        } else {
                            try {
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("status", "failed");
                                v("biometry_auth_requested", jSONObject9);
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
                        z12 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z12 = false;
                    }
                    e0 e0Var2 = this.c;
                    if (e0Var2 != null) {
                        e0Var2.p(z12);
                        break;
                    }
                    break;
                case 23:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        z10 = jSONArray2.optBoolean(0, true);
                        try {
                            z11 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused6) {
                            z11 = true;
                            g("allowScroll " + z10 + " " + z11);
                            if (!(getParent() instanceof f4)) {
                                return;
                            }
                        }
                    } catch (Exception unused7) {
                        z10 = true;
                    }
                    g("allowScroll " + z10 + " " + z11);
                    if (!(getParent() instanceof f4)) {
                        ((f4) getParent()).a(z10, z11);
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
                    } catch (JSONException e21) {
                        FileLog.e(e21);
                        return;
                    }
                case 25:
                    if (this.Q != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i23 = this.I;
                            this.j0 = new mh.p1(UserConfig.getInstance(i23).getClientUserId(), this.Q.id, i23, true);
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
                            jSONObject2 = new JSONObject(str2);
                            str4 = jSONObject2.optString("media_url");
                        } catch (Exception e22) {
                            e = e22;
                            str4 = null;
                            str5 = null;
                        }
                        try {
                            str5 = jSONObject2.optString("text");
                            try {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("widget_link");
                                if (optJSONObject != null) {
                                    str6 = optJSONObject.optString("url");
                                    try {
                                        str8 = optJSONObject.optString("name");
                                        str7 = str4;
                                    } catch (Exception e23) {
                                        e = e23;
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
                            } catch (Exception e24) {
                                e = e24;
                                str6 = null;
                            }
                        } catch (Exception e25) {
                            e = e25;
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
                            if (MessagesController.getInstance(this.I).storiesEnabled()) {
                                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.S);
                                new HttpGetFileTask(new v1(this, c2Var, str5, str6, str8, 2), null).execute(str7);
                                c2Var.q(250L);
                                break;
                            } else {
                                new zf.x0((o2) new bg.i1(this), 14, true).show();
                                break;
                            }
                        }
                    }
                    break;
                case 27:
                    if (this.Q != null) {
                        if (this.g0 == null) {
                            mh.u0 e26 = mh.u0.e(getContext(), this.I, this.Q.id);
                            this.g0 = e26;
                            e26.f.add(tVar);
                        }
                        if (this.g0.g()) {
                            this.g0.k(new q(this, 1));
                            break;
                        } else {
                            this.g0.j(new r(this, 2));
                            break;
                        }
                    }
                    break;
                case 28:
                    mh.y0 z21 = this.c.z();
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
                case 29:
                    try {
                        z13 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e27) {
                        FileLog.e(e27);
                        z13 = false;
                    }
                    this.c.y();
                    if (z13) {
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
                            m3 P = LaunchActivity.C1.P();
                            ArrayList<l3> tabs = P.getTabs();
                            int i24 = 0;
                            while (true) {
                                if (i24 < tabs.size()) {
                                    l3 l3Var2 = tabs.get(i24);
                                    if (!this.y0.equals(l3Var2.a) || l3Var2.b == this.a) {
                                        i24++;
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
                    mh.y0 z22 = this.c.z();
                    if (z22 == null || !z22.g()) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("gyroscope_stopped", null);
                        break;
                    }
                case '\"':
                    if (this.Q != null) {
                        if (this.j0 == null) {
                            getContext();
                            int i25 = this.I;
                            this.j0 = new mh.p1(UserConfig.getInstance(i25).getClientUserId(), this.Q.id, i25, true);
                        }
                        e(this.j0, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case '#':
                    if (this.Q != null) {
                        if (this.i0 == null) {
                            getContext();
                            int i26 = this.I;
                            this.i0 = new mh.p1(UserConfig.getInstance(i26).getClientUserId(), this.Q.id, i26, false);
                        }
                        e(this.i0, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case '$':
                    mh.y0 z23 = this.c.z();
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
                    break;
                case '%':
                    mh.y0 z24 = this.c.z();
                    if (z24 == null || !z24.f()) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        v("accelerometer_stopped", null);
                        break;
                    }
                case '&':
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        try {
                            String string7 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string7)) {
                                v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                                break;
                            } else {
                                mh.l1.P(getContext(), this.I, this.Q.id, string7, this.e, new t(this, 0), new bg.y0(26, this, botWebViewContainer$BotWebViewProxy));
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
                            MediaDataController.getInstance(this.I).installShortcut(this.Q.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new q(this, 0));
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
                        for (int i27 = 0; i27 < jSONArray3.length(); i27++) {
                            arrayList2.add(jSONArray3.getString(i27));
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
                            int i28 = this.I;
                            this.j0 = new mh.p1(UserConfig.getInstance(i28).getClientUserId(), this.Q.id, i28, true);
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
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    y0.this.H0.run(Boolean.valueOf(z25), Double.valueOf(d), optString6, Double.valueOf(optDouble));
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
                            e0 e0Var3 = this.c;
                            if (e0Var3 != null) {
                                e0Var3.b();
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
                    mh.r rVar2 = this.f0;
                    if (rVar2 != null) {
                        boolean z26 = rVar2.f;
                        if (z26) {
                            t();
                            break;
                        } else if (rVar2.e) {
                            if (!z26) {
                                rVar2.f = true;
                                rVar2.k();
                            }
                            t();
                            break;
                        } else {
                            final Runnable[] runnableArr = {new t(this, 3)};
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), b6Var);
                            if (TextUtils.isEmpty(str9)) {
                                alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                i9 = 0;
                                alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.Q))));
                            } else {
                                i9 = 0;
                                alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.Q))));
                                alertDialog$Builder3.g(str9);
                            }
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.z
                                public final /* synthetic */ y0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.b2
                                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i29) {
                                    switch (i9) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            y0 y0Var = this.b;
                                            mh.r rVar3 = y0Var.f0;
                                            rVar3.f = true;
                                            rVar3.k();
                                            mh.r rVar4 = y0Var.f0;
                                            r rVar5 = new r(y0Var, 3);
                                            rVar4.getClass();
                                            rVar4.j(null, true, null, new ih.b0(2, rVar4, rVar5));
                                            break;
                                        default:
                                            y0 y0Var2 = this.b;
                                            y0Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            mh.r rVar6 = y0Var2.f0;
                                            rVar6.f = true;
                                            rVar6.d = true;
                                            rVar6.k();
                                            y0Var2.t();
                                            break;
                                    }
                                }
                            });
                            final int i29 = 1;
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.web.z
                                public final /* synthetic */ y0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.b2
                                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i292) {
                                    switch (i29) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            y0 y0Var = this.b;
                                            mh.r rVar3 = y0Var.f0;
                                            rVar3.f = true;
                                            rVar3.k();
                                            mh.r rVar4 = y0Var.f0;
                                            r rVar5 = new r(y0Var, 3);
                                            rVar4.getClass();
                                            rVar4.j(null, true, null, new ih.b0(2, rVar4, rVar5));
                                            break;
                                        default:
                                            y0 y0Var2 = this.b;
                                            y0Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            mh.r rVar6 = y0Var2.f0;
                                            rVar6.f = true;
                                            rVar6.d = true;
                                            rVar6.k();
                                            y0Var2.t();
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.j(new eh.l(runnableArr, 6));
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
                        int i30 = 0;
                        ConnectionsManager.getInstance(this.I).sendRequestTyped(getrequestedwebviewbutton, new gb0(i30), new v(this, str10, i30));
                        break;
                    }
                    break;
                case '8':
                    mh.y0 z30 = this.c.z();
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
                        mh.r rVar3 = this.f0;
                        if (rVar3 != null) {
                            if (rVar3.e) {
                                rVar3.l(str11, string8, new eb0(14, this, string8));
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
                        int v02 = TextUtils.isEmpty(optString10) ? f6.v0(f6.a7, b6Var) : Color.parseColor(optString10);
                        e0 e0Var4 = this.c;
                        if (e0Var4 != null) {
                            e0Var4.r(v02);
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
                                    i10 = f6.a7;
                                    i11 = i10;
                                }
                                i11 = -1;
                            } else {
                                if (optString12.equals("bg_color")) {
                                    i10 = f6.d6;
                                    i11 = i10;
                                }
                                i11 = -1;
                            }
                            if (i11 >= 0) {
                                this.c.u(i11, f6.v0(i11, b6Var), false);
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
                        int i31 = this.I;
                        v0 v0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                        ConnectionsManager.getInstance(this.I).sendRequest(cansendmessage, new bg.q0(this, i31, v0Var3, 10));
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
            if (ve.e.f(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            ve.e.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
        }
    }

    public abstract void G(v0 v0Var);

    public final void J(int i9, boolean z10) {
        JSONObject jSONObject;
        if (z10 || i9 != this.B0) {
            Float valueOf = Float.valueOf(i9 / AndroidUtilities.density);
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
            this.B0 = i9;
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

    public final void M(mh.p1 p1Var, String str) {
        if (p1Var == null || this.Q == null) {
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
                    ArrayList h = p1Var.h(optString);
                    if (h.isEmpty()) {
                        v("secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    bg.j1 j1Var = new bg.j1((Object) this, string, (Object) p1Var, (Object) optString, 15);
                    o2 U = LaunchActivity.U();
                    b6 resourceProvider = U != null ? U.getResourceProvider() : null;
                    int i9 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    f3 j10 = ll.j(context, resourceProvider, false, false);
                    LinearLayout f10 = ll.f(context, 1);
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                    ArrayList arrayList = h;
                    TLRPC.User user = MessagesController.getInstance(p1Var.a).getUser(Long.valueOf(p1Var.b));
                    z8 z8Var = new z8((b6) null);
                    z8Var.r(user);
                    o9Var.e(user, z8Var);
                    f10.addView(o9Var, e6.t(80, 80, 49, 0, 21, 0, 13));
                    int i10 = f6.G6;
                    TextView b10 = i6.b(context, 20.0f, i10, true, null);
                    ll.l(R.string.BotRestoreStorageTitle, b10, 17);
                    f10.addView(b10, e6.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b11 = i6.b(context, 14.0f, i10, false, null);
                    b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    b11.setGravity(17);
                    f10.addView(b11, e6.t(-1, -2, 7, 32, 0, 32, 19));
                    b9 b9Var = new b9(context, resourceProvider);
                    b9Var.setBackground(new fq(new ColorDrawable(f6.v0(f6.a7, resourceProvider)), f6.U0(context, R.drawable.greydivider, f6.v0(f6.b7, resourceProvider))));
                    b9Var.setFixedSize(12);
                    f10.addView(b9Var, e6.t(-1, 12, 7, 0, 0, 0, 0));
                    m4 m4Var = new m4(context, resourceProvider);
                    m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    f10.addView(m4Var, e6.t(-1, -2, 7, 0, 0, 0, 0));
                    kh.d dVar = new kh.d(context, resourceProvider, true);
                    ArrayList arrayList2 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        ArrayList arrayList3 = arrayList;
                        mh.o1 o1Var = (mh.o1) arrayList3.get(i11);
                        mh.n1 n1Var = new mh.n1(o1Var, i11 < arrayList3.size() - i9, context);
                        n1Var.setBackground(f6.f0(f6.v0(f6.i6, resourceProvider), 2, -1));
                        LinearLayout linearLayout = f10;
                        n1Var.setOnClickListener(new g4(strArr, o1Var, arrayList2, dVar, 3));
                        linearLayout.addView(n1Var, e6.n(-1, 56));
                        arrayList2.add(n1Var);
                        i11++;
                        arrayList = arrayList3;
                        j10 = j10;
                        f10 = linearLayout;
                        j1Var = j1Var;
                        i9 = 1;
                    }
                    bg.j1 j1Var2 = j1Var;
                    f3 f3Var = j10;
                    LinearLayout linearLayout2 = f10;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr[0] != null);
                    linearLayout2.addView(dVar, e6.t(-1, 48, 7, 8, 8, 8, 4));
                    f3Var.customView = linearLayout2;
                    f3Var.fixNavigationBar(f6.v0(f6.h5, resourceProvider));
                    dVar.setOnClickListener(new g4(zArr, j1Var2, strArr, f3Var, 4));
                    f3Var.setOnDismissListener(new bg.j(3, zArr, j1Var2));
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
        v0 v0Var = this.a;
        if (v0Var != null) {
            boolean z11 = v0Var.A;
        }
        boolean z12 = v0Var == null || !v0Var.canGoBack();
        v0 v0Var2 = this.a;
        F(z12, v0Var2 == null || !v0Var2.canGoForward());
        v0 v0Var3 = this.a;
        if (v0Var3 != null) {
            v0Var3.b = true;
        }
        if (this.J) {
            g("setPageLoaded: already loaded");
            return;
        }
        d4 d4Var = this.s;
        if (!z10 || v0Var3 == null || d4Var == null) {
            if (v0Var3 != null) {
                v0Var3.setAlpha(1.0f);
            }
            if (d4Var != null) {
                d4Var.setAlpha(0.0f);
                d4Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<v0, Float>) property, 1.0f), ObjectAnimator.ofFloat(d4Var, (Property<d4, Float>) property, 0.0f));
            animatorSet.addListener(new te1(this, 4));
            animatorSet.start();
        }
        this.b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.J = true;
        this.c.getClass();
    }

    public final void P(mh.p1 p1Var, String str, String str2, String str3) {
        if (p1Var == null || this.Q == null) {
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
                        p1Var.n(optString, jSONObject.optString("value"));
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

    public final void Q(v0 v0Var, Object obj) {
        v0 v0Var2;
        TLRPC.User user;
        String str = "";
        v0 v0Var3 = this.a;
        if (v0Var3 != null) {
            v0Var3.destroy();
            removeView(this.a);
        }
        if (v0Var != null) {
            AndroidUtilities.removeFromParent(v0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !p());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (v0Var == null) {
            Context context = getContext();
            boolean z10 = this.k0;
            long j10 = 0;
            if (z10 && (user = this.Q) != null) {
                j10 = user.id;
            }
            v0Var2 = new v0(context, z10, j10);
        } else {
            v0Var2 = v0Var;
        }
        this.a = v0Var2;
        if (this.k0) {
            v0Var2.setBackgroundColor(j(f6.d6));
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
        if (v0Var == null && this.k0) {
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
            } else if (v0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.n0.a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.o0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.o0;
            if (botWebViewContainer$WebViewProxy == null) {
                v0 v0Var4 = this.a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(v0Var4, this);
                this.o0 = botWebViewContainer$WebViewProxy2;
                v0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (v0Var == null) {
                this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.o0.a = this;
        }
        G(this.a);
        I0 = false;
    }

    public final void R(int i9, org.telegram.ui.ActionBar.c2 c2Var, Runnable runnable) {
        if (c2Var == null || m(i9)) {
            return;
        }
        c2Var.setOnDismissListener(new bg.j(16, this, runnable));
        this.V = c2Var;
        c2Var.d0 = false;
        c2Var.show();
        if (this.D0 != i9) {
            this.D0 = i9;
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
        } catch (Throwable th) {
            FileLog.e(th);
            this.s.setVisibility(8);
            this.h = true;
            this.f.setVisibility(0);
            v0 v0Var = this.a;
            if (v0Var != null) {
                removeView(v0Var);
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ue0 ue0Var;
        Uri[] uriArr;
        if (i9 == NotificationCenter.didSetNewTheme) {
            v0 v0Var = this.a;
            if (v0Var != null) {
                v0Var.setBackgroundColor(j(f6.d6));
            }
            if (!this.m0) {
                int i11 = f6.Ki;
                int j10 = j(i11);
                this.l0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                d4 d4Var = this.s;
                d4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.l0);
                    this.r.setupGradient(i11, this.e, 1.0f, false);
                }
                d4Var.invalidate();
            }
            w();
            return;
        }
        if (i9 != NotificationCenter.onActivityResultReceived) {
            if (i9 == NotificationCenter.onRequestPermissionResultReceived) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (ue0Var = this.R) == null) {
                    return;
                }
                ue0Var.run();
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
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    uriArr[i12] = clipData.getItemAt(i12).getUri();
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

    public final void e(mh.p1 p1Var, String str, String str2, String str3) {
        if (p1Var == null || this.Q == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                p1Var.m(new JSONObject());
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
        mh.r rVar = this.f0;
        if (rVar == null) {
            this.f0 = mh.r.c(getContext(), this.I, this.Q.id);
        } else {
            rVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.G0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.n0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof f4)) {
            return 0;
        }
        f4 f4Var = (f4) getParent();
        if (f4Var.F) {
            return (int) ((f4Var.getMeasuredHeight() - f4Var.getOffsetY()) + this.t0);
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
        return this.o0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public v0 getWebView() {
        return this.a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.v0);
        v0 v0Var = this.a;
        if (v0Var != null) {
            if (v0Var.getParent() != null) {
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
            mh.u0 u0Var = this.g0;
            if (u0Var != null) {
                u0Var.f.remove(this.C0);
                this.g0 = null;
            }
        }
    }

    public final void i(String str) {
        new oc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i9) {
        b6 b6Var = this.e;
        return b6Var != null ? b6Var.N0(i9) : f6.w0(null, i9, false);
    }

    public final void l(mh.p1 p1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (p1Var == null || this.Q == null) {
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
                    Pair f10 = p1Var.f(optString);
                    if (p1Var.d && (obj = f10.first) == null) {
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

    public final boolean m(int i9) {
        if (this.V != null || (this.F0 > 0 && System.currentTimeMillis() < this.F0)) {
            return true;
        }
        if (this.D0 != i9 || this.E0 <= 3) {
            return false;
        }
        this.F0 = System.currentTimeMillis() + 3000;
        this.E0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        invalidate();
        if ((this.J || z11) && this.k0 && (getParent() instanceof f4)) {
            f4 f4Var = (f4) getParent();
            if (z10) {
                this.K = f4Var.getSwipeOffsetY() == f4Var.getTopActionBarOffsetY() + (-f4Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (f4Var.getTopActionBarOffsetY() + ((f4Var.getMeasuredHeight() - f4Var.getOffsetY()) - f4Var.getSwipeOffsetY()) + this.t0));
            if (!z11 && max == this.q0 && this.r0 == z10 && this.s0 == this.K) {
                return;
            }
            this.q0 = max;
            this.r0 = z10;
            this.s0 = this.K;
            NotificationCenter.getInstance(this.I).doOnIdle(new p(this, aa.d.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.K + "}", ");"), 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        gc.a(this, new fh.y0(this, 11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        gc.h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.u0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        super.onMeasure(i9, i10);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.T) {
            return;
        }
        n(true, false);
    }

    public final boolean p() {
        return this.H0 != null;
    }

    public final void q(int i9, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        d4 d4Var = this.s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            d4Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(f6.a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i9).getAttachMenuBots().bots;
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
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                d4Var.setVisibility(0);
                d4Var.setAlpha(1.0f);
                d4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        b6 b6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.l0);
                this.r.setupGradient(f6.Ki, b6Var, 1.0f, false);
            }
            d4Var.f(null, null, this.r);
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
        d4Var.setVisibility(0);
        d4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.l0);
            this.r.setupGradient(f6.Ki, b6Var, 1.0f, false);
        }
        d4Var.f(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void r(int i9, String str) {
        this.I = i9;
        NotificationCenter.getInstance(i9).doOnIdle(new p(this, str, 1));
    }

    public void setBotUser(TLRPC.User user) {
        this.Q = user;
    }

    public void setDelegate(e0 e0Var) {
        this.c = e0Var;
    }

    public void setFlickerViewColor(int i9) {
        int b10 = AndroidUtilities.computePerceivedBrightness(i9) > 0.7f ? f6.b(0.0f, -0.15f, i9) : f6.b(0.025f, 0.15f, i9);
        if (this.l0 == b10) {
            return;
        }
        this.l0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        d4 d4Var = this.s;
        d4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.l0);
            this.r.setupGradient(f6.Ki, this.e, 1.0f, false);
        }
        this.m0 = true;
        d4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i9) {
        if (this.u0 == i9) {
            return;
        }
        this.u0 = i9;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.N = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.w0 = runnable;
        v0 v0Var = this.a;
        if (v0Var != null) {
            v0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.H0 = callback4;
    }

    public void setOpener(v0 v0Var) {
        v0 v0Var2;
        this.p0 = v0Var;
        if (this.k0 || (v0Var2 = this.a) == null) {
            return;
        }
        v0Var2.f = v0Var;
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

    public void setViewPortHeightOffset(float f10) {
        this.t0 = f10;
    }

    public void setWasOpenedByBot(s4 s4Var) {
        this.y0 = s4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.x0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.w = aVar;
    }

    public void setWebViewScrollListener(x0 x0Var) {
        this.d = x0Var;
        v0 v0Var = this.a;
        if (v0Var != null) {
            v0Var.f(this, x0Var);
        }
    }

    public final void t() {
        if (this.Q == null) {
            return;
        }
        f();
        mh.r rVar = this.f0;
        if (rVar == null) {
            return;
        }
        try {
            v("biometry_info_received", rVar.f());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.I).doOnIdle(new p(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject p6;
        try {
            p6 = c3.p(this.e, true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (p6 != null) {
            jSONObject = new JSONObject().put("theme_params", p6);
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

    public void H(v0 v0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void A(String str, boolean z10) {
    }

    public void F(boolean z10, boolean z11) {
    }
}
