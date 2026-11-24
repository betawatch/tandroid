// default package

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
import android.view.KeyEvent;
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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class qw0 extends FrameLayout implements jm7, vlb {
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
    public rwc G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public ow0 K0;
    public String L;
    public final bv0 L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public nac Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public op6 W;
    public mw0 a;
    public Activity a0;
    public String b;
    public boolean b0;
    public uv0 c;
    public String c0;
    public pw0 d;
    public he d0;
    public final ylb e;
    public int e0;
    public final TextView f;
    public long f0;
    public long g0;
    public boolean h;
    public hb1 h0;
    public boolean i0;
    public String j0;
    public up0 k0;
    public tr0 l0;
    public mq0 m0;
    public final ef1 n;
    public ou0 n0;
    public ou0 o0;
    public final boolean p0;
    public int q0;
    public meb r;
    public boolean r0;
    public final kc0 s;
    public BotWebViewContainer$BotWebViewProxy s0;
    public long t0;
    public boolean u0;
    public BotWebViewContainer$WebViewProxy v0;
    public boolean w;
    public mw0 w0;
    public gu2 x;
    public int x0;
    public ValueCallback y;
    public boolean y0;
    public boolean z0;

    public qw0(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        ef1 ef1Var = new ef1();
        this.n = ef1Var;
        int i2 = cmb.Ei;
        this.E = h(i2);
        int i3 = cmb.Ii;
        this.F = h(i3);
        this.G = "";
        this.I = h(i2);
        this.J = h(i3);
        this.K = "";
        this.L = "";
        this.N = z8c.t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new bv0(this, (byte) 2);
        this.M0 = -1;
        this.N0 = 0;
        int i4 = S0;
        S0 = i4 + 1;
        this.P0 = i4;
        this.p0 = z;
        this.e = ylbVar;
        e("created new webview container");
        if (context instanceof Activity) {
            this.a0 = (Activity) context;
        }
        ef1Var.k = false;
        ef1Var.b(i, nm7.i2);
        kc0 kc0Var = new kc0(this, context);
        this.s = kc0Var;
        int h = h(cmb.Aj);
        this.q0 = h;
        kc0Var.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
        kc0Var.getImageReceiver().S0 = true;
        addView(kc0Var, qoe.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(jb6.M0(2131752866, null));
        anb.X(textView, cmb.x6, ylbVar);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = gm.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, qoe.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse K(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(l11.x(Uri.parse(str2), "https", null, Q(gm.J0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static String Q(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                sb.append("-d");
            }
            sb.append(split[i].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(oc7.r1(z8c.t0).l4.t2.f);
        return sb.toString();
    }

    public static String X(String str) {
        if (str == null) {
            return str;
        }
        if (!n(Uri.parse(str))) {
            return str;
        }
        String J0 = gm.J0(str, false);
        try {
            J0 = IDN.toASCII(J0, 1);
        } catch (Exception unused) {
        }
        String Q = Q(J0);
        HashMap hashMap = T0;
        if (hashMap == null) {
            hashMap = new HashMap();
            T0 = hashMap;
        }
        hashMap.put(Q, J0);
        return l11.x(Uri.parse(str), "https", null, Q, null);
    }

    public static String i(String str) {
        if (str != null && !str.isEmpty()) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (scheme != null && host != null) {
                StringBuilder p = wi8.p(scheme, "://", host);
                if (port != -1 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    p.append(":");
                    p.append(port);
                }
                return p.toString();
            }
        }
        return null;
    }

    public static boolean n(Uri uri) {
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

    public static String r(String str) {
        String str2;
        if (T0 == null || str == null) {
            return str;
        }
        String J0 = gm.J0(str, false);
        if (J0 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(".");
        sb.append(oc7.r1(z8c.t0).l4.t2.f);
        return (!J0.endsWith(sb.toString()) || (str2 = (String) T0.get(J0)) == null) ? str : l11.x(Uri.parse(str), "tonsite", null, str2, null);
    }

    private void setupFlickerParams(boolean z) {
        this.w = z;
        kc0 kc0Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kc0Var.getLayoutParams();
        layoutParams.gravity = z ? 17 : 48;
        if (z) {
            int L = gm.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        kc0Var.requestLayout();
    }

    private void setupWebView(mw0 mw0Var) {
        V(mw0Var, null);
    }

    public static void t(int i, mw0 mw0Var, ow0 ow0Var, String str, JSONObject jSONObject) {
        if (mw0Var == null) {
            return;
        }
        nm7.f(i).d(new l97(mw0Var, ow0Var, str, jSONObject, (byte) 15));
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

    public static JSONObject z(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
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

    public final boolean A() {
        if (this.a == null || !this.S) {
            return false;
        }
        v("back_button_pressed", null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0d60  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, final ow0 ow0Var, String str, String str2) {
        char c;
        int i;
        final byte b;
        hb1 hb1Var;
        qw0 qw0Var;
        ow0 ow0Var2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        int i2;
        ou0 ou0Var;
        ou0 ou0Var2;
        ou0 ou0Var3;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z4;
        LaunchActivity launchActivity;
        ou0 ou0Var4;
        boolean z5;
        boolean z6;
        String g;
        ou0 ou0Var5;
        long j;
        String str9;
        boolean z7;
        if (this.p0) {
            if (this.a == null || this.c == null) {
                e("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (!m(ow0Var)) {
                e("onEventReceived ignore " + str + " after document change");
            }
            e("onEventReceived " + str);
            str.getClass();
            switch (str.hashCode()) {
                case -2016939055:
                    if (str.equals("web_app_invoke_custom_method")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1898902656:
                    if (str.equals("web_app_close_scan_qr_popup")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1736707758:
                    if (str.equals("web_app_biometry_get_info")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1717314938:
                    if (str.equals("web_app_open_link")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1715704462:
                    if (str.equals("web_app_request_file_download")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1693280352:
                    if (str.equals("web_app_open_popup")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1390641887:
                    if (str.equals("web_app_open_invoice")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1385387727:
                    if (str.equals("web_app_set_emoji_status")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1353432696:
                    if (str.equals("web_app_setup_secondary_button")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1341039673:
                    if (str.equals("web_app_setup_closing_behavior")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1309122684:
                    if (str.equals("web_app_open_scan_qr_popup")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1263619595:
                    if (str.equals("web_app_request_phone")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1259935152:
                    if (str.equals("web_app_request_theme")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1229296877:
                    if (str.equals("web_app_secure_storage_get_key")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1183558219:
                    if (str.equals("web_app_check_location")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1093591555:
                    if (str.equals("web_app_biometry_open_settings")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -921083201:
                    if (str.equals("web_app_request_viewport")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -907261345:
                    if (str.equals("web_app_request_emoji_status_access")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -620103109:
                    if (str.equals("web_app_stop_device_orientation")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -585008607:
                    if (str.equals("web_app_device_storage_save_key")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -581005326:
                    if (str.equals("web_app_device_storage_get_key")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -512688845:
                    if (str.equals("web_app_biometry_request_auth")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -498118340:
                    if (str.equals("web_app_toggle_orientation_lock")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -474676372:
                    if (str.equals("web_app_allow_scroll")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -439770054:
                    if (str.equals("web_app_open_tg_link")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -293897269:
                    if (str.equals("web_app_secure_storage_restore_key")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -244584646:
                    if (str.equals("web_app_share_to_story")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -216725042:
                    if (str.equals("web_app_request_location")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -111186465:
                    if (str.equals("web_app_start_gyroscope")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -71726289:
                    if (str.equals("web_app_close")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -58095910:
                    if (str.equals("web_app_ready")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 22015443:
                    if (str.equals("web_app_read_text_from_clipboard")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 127735931:
                    if (str.equals("web_app_hide_keyboard")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 189207985:
                    if (str.equals("web_app_stop_gyroscope")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 267846314:
                    if (str.equals("web_app_secure_storage_clear")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 348967753:
                    if (str.equals("web_app_device_storage_clear")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 420328489:
                    if (str.equals("web_app_start_accelerometer")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 475603707:
                    if (str.equals("web_app_stop_accelerometer")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case 622108947:
                    if (str.equals("web_app_send_prepared_message")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case 668142772:
                    if (str.equals("web_app_data_send")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case 671811520:
                    if (str.equals("web_app_request_content_safe_area")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 721956751:
                    if (str.equals("web_app_add_to_home_screen")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case 748864404:
                    if (str.equals("web_app_request_fullscreen")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 751292356:
                    if (str.equals("web_app_switch_inline_query")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case 792789792:
                    if (str.equals("web_app_secure_storage_save_key")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case 796110323:
                    if (str.equals("web_app_exit_fullscreen")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case 880626018:
                    if (str.equals("web_app_verify_age")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case 909476449:
                    if (str.equals("web_app_open_location_settings")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case 1011447167:
                    if (str.equals("web_app_setup_back_button")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1210129967:
                    if (str.equals("web_app_biometry_request_access")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 1273834781:
                    if (str.equals("web_app_trigger_haptic_feedback")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 1398490221:
                    if (str.equals("web_app_setup_main_button")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case 1453051298:
                    if (str.equals("web_app_setup_swipe_behavior")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 1455972419:
                    if (str.equals("web_app_setup_settings_button")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 1495787980:
                    if (str.equals("web_app_check_home_screen")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case 1759965681:
                    if (str.equals("web_app_request_chat")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1812395469:
                    if (str.equals("web_app_start_device_orientation")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1882780382:
                    if (str.equals("web_app_biometry_update_token")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case 1899078473:
                    if (str.equals("web_app_set_bottom_bar_color")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 1917103703:
                    if (str.equals("web_app_set_header_color")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case 1937068806:
                    if (str.equals("web_app_request_safe_area")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case 2001330488:
                    if (str.equals("web_app_set_background_color")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case 2036090717:
                    if (str.equals("web_app_request_write_access")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case 2139805763:
                    if (str.equals("web_app_expand")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            char c2 = c;
            bv0 bv0Var = this.L0;
            long j2 = 1000;
            ylb ylbVar = this.e;
            xx0 xx0Var = null;
            CharSequence charSequence = null;
            String str10 = null;
            String str11 = null;
            wy0 wy0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            xx0Var = null;
            switch (c2) {
                case 0:
                    if (this.V != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            String string = jSONObject.getString("req_id");
                            String string2 = jSONObject.getString("method");
                            String obj = jSONObject.get("params").toString();
                            int i3 = this.N;
                            mw0 mw0Var = this.a;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = oc7.r1(i3).n1(this.V.id);
                            invokewebviewcustommethod.custom_method = string2;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = obj;
                            ConnectionsManager.getInstance(i3).sendRequest(invokewebviewcustommethod, new ev0((KeyEvent.Callback) this, (Object) string, i3, (Object) mw0Var, (Object) ow0Var, (byte) 0));
                            break;
                        } catch (Exception e) {
                            fc4.f(e);
                            if (e instanceof JSONException) {
                                g("JSON Parse error");
                                return;
                            } else {
                                Y(null);
                                return;
                            }
                        }
                    }
                    break;
                case 1:
                    if (this.i0 && (hb1Var = this.h0) != null) {
                        hb1Var.dismiss();
                        break;
                    }
                    break;
                case 2:
                    s(ow0Var);
                    break;
                case 3:
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject2.optString("url"));
                        String optString = jSONObject2.optString("try_browser");
                        if (oc7.r1(this.N).J3 != null && oc7.r1(this.N).J3.contains(parse.getScheme())) {
                            E(parse, optString, jSONObject2.optBoolean("try_instant_view"), true, false);
                            break;
                        }
                    } catch (Exception e2) {
                        fc4.f(e2);
                        return;
                    }
                    break;
                case 4:
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        if (this.m0 == null) {
                            this.m0 = mq0.c(getContext(), this.N, this.V.id);
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(str2);
                            String string3 = jSONObject3.getString("url");
                            String string4 = jSONObject3.getString("file_name");
                            if (this.m0.d(string3) != null) {
                                this.m0.b(string3, string4);
                                u(ow0Var, "file_download_requested", x("downloading", "status"));
                                break;
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = oc7.r1(this.N).p1(this.V);
                                checkdownloadfileparams.file_name = string4;
                                checkdownloadfileparams.url = string3;
                                ConnectionsManager.getInstance(this.N).sendRequest(checkdownloadfileparams, new av0((Object) this, (Object) ow0Var, (Object) string3, (Object) string4, (byte) 0));
                                break;
                            }
                        } catch (Exception e3) {
                            fc4.f(e3);
                            u(ow0Var, "file_download_requested", x("cancelled", "status"));
                            return;
                        }
                    }
                    break;
                case 5:
                    try {
                        if (this.d0 == null) {
                            if (System.currentTimeMillis() - this.f0 <= 150) {
                                int i4 = this.e0 + 1;
                                this.e0 = i4;
                                if (i4 >= 3) {
                                    this.e0 = 0;
                                    this.g0 = System.currentTimeMillis();
                                    break;
                                }
                            }
                            if (System.currentTimeMillis() - this.g0 > 3000) {
                                JSONObject jSONObject4 = new JSONObject(str2);
                                String optString2 = jSONObject4.optString("title", null);
                                String string5 = jSONObject4.getString("message");
                                JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                                alertDialog$Builder.k(optString2);
                                alertDialog$Builder.f(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                    arrayList.add(new nw0(jSONArray.getJSONObject(i5)));
                                }
                                if (arrayList.size() <= 3) {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final nw0 nw0Var = (nw0) arrayList.get(0);
                                        final byte b2 = 0;
                                        alertDialog$Builder.j(nw0Var.b, new ee(this) { // from class: xu0
                                            public final /* synthetic */ qw0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // ee
                                            public final void r(he heVar, int i6) {
                                                byte b3 = b2;
                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                nw0 nw0Var2 = nw0Var;
                                                ow0 ow0Var3 = ow0Var;
                                                qw0 qw0Var2 = this.b;
                                                switch (b3) {
                                                    case 0:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var2.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e4) {
                                                            fc4.g(e4, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var2.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e5) {
                                                            fc4.g(e5, true);
                                                            return;
                                                        }
                                                    default:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var2.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e6) {
                                                            fc4.g(e6, true);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() >= 2) {
                                        final nw0 nw0Var2 = (nw0) arrayList.get(1);
                                        final byte b3 = 1;
                                        alertDialog$Builder.g(nw0Var2.b, new ee(this) { // from class: xu0
                                            public final /* synthetic */ qw0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // ee
                                            public final void r(he heVar, int i6) {
                                                byte b32 = b3;
                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                nw0 nw0Var22 = nw0Var2;
                                                ow0 ow0Var3 = ow0Var;
                                                qw0 qw0Var2 = this.b;
                                                switch (b32) {
                                                    case 0:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e4) {
                                                            fc4.g(e4, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e5) {
                                                            fc4.g(e5, true);
                                                            return;
                                                        }
                                                    default:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e6) {
                                                            fc4.g(e6, true);
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final nw0 nw0Var3 = (nw0) arrayList.get(2);
                                        String str12 = nw0Var3.b;
                                        final byte b4 = 2;
                                        ee eeVar = new ee(this) { // from class: xu0
                                            public final /* synthetic */ qw0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // ee
                                            public final void r(he heVar, int i6) {
                                                byte b32 = b4;
                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                nw0 nw0Var22 = nw0Var3;
                                                ow0 ow0Var3 = ow0Var;
                                                qw0 qw0Var2 = this.b;
                                                switch (b32) {
                                                    case 0:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e4) {
                                                            fc4.g(e4, true);
                                                            return;
                                                        }
                                                    case 1:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e5) {
                                                            fc4.g(e5, true);
                                                            return;
                                                        }
                                                    default:
                                                        heVar.dismiss();
                                                        try {
                                                            qw0Var2.Q = System.currentTimeMillis();
                                                            qw0Var2.u(ow0Var3, "popup_closed", new JSONObject().put("button_id", nw0Var22.a));
                                                            atomicBoolean2.set(true);
                                                            break;
                                                        } catch (JSONException e6) {
                                                            fc4.g(e6, true);
                                                        }
                                                }
                                            }
                                        };
                                        ow0Var2 = ow0Var;
                                        qw0Var = this;
                                        alertDialog$Builder.h(str12, eeVar);
                                    } else {
                                        qw0Var = this;
                                        ow0Var2 = ow0Var;
                                    }
                                    alertDialog$Builder.i(new ah(qw0Var, atomicBoolean, ow0Var2, (byte) 4));
                                    qw0Var.d0 = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        nw0 nw0Var4 = (nw0) arrayList.get(0);
                                        if (nw0Var4.c >= 0 && (textView3 = (TextView) qw0Var.d0.c(-1)) != null) {
                                            textView3.setTextColor(qw0Var.h(nw0Var4.c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        nw0 nw0Var5 = (nw0) arrayList.get(1);
                                        if (nw0Var5.c >= 0 && (textView2 = (TextView) qw0Var.d0.c(-2)) != null) {
                                            textView2.setTextColor(qw0Var.h(nw0Var5.c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        nw0 nw0Var6 = (nw0) arrayList.get(2);
                                        if (nw0Var6.c >= 0 && (textView = (TextView) qw0Var.d0.c(-3)) != null) {
                                            textView.setTextColor(qw0Var.h(nw0Var6.c));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e4) {
                        fc4.f(e4);
                        return;
                    }
                    break;
                case 6:
                    try {
                        String optString3 = new JSONObject(str2).optString("slug");
                        if (this.c0 != null) {
                            D(optString3, "cancelled", true);
                            break;
                        } else {
                            this.c0 = optString3;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = optString3;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.N).sendRequest(tL_payments_getPaymentForm, new eo0((Object) this, (Object) optString3, (Object) tL_inputInvoiceSlug, (byte) 7));
                            break;
                        }
                    } catch (JSONException e5) {
                        fc4.f(e5);
                        return;
                    }
                case 7:
                    long j3 = 0;
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j3 = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            i2 = jSONObject5.getInt("duration");
                        } catch (Exception unused) {
                            i2 = 0;
                        }
                        long j4 = j3;
                        TLRPC.User user = this.V;
                        if (user == null) {
                            u(ow0Var, "emoji_status_failed", x("UNKNOWN_ERROR", "error"));
                            break;
                        } else {
                            yaa.f(this.N, user, j4, i2, new yu0(this, ow0Var, (byte) 4));
                            break;
                        }
                    }
                    break;
                case '\b':
                    long j5 = 0;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean optBoolean = jSONObject6.optBoolean("is_active", false);
                        String trim = jSONObject6.optString("text", this.K).trim();
                        boolean z8 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : this.I;
                        int parseColor2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : this.J;
                        boolean z9 = jSONObject6.optBoolean("is_progress_visible", false) && z8;
                        boolean z10 = jSONObject6.optBoolean("has_shine_effect", false) && z8;
                        String optString4 = jSONObject6.has("position") ? jSONObject6.optString("position") : this.L;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        try {
                            j5 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused2) {
                        }
                        long j6 = j5;
                        this.I = parseColor;
                        this.J = parseColor2;
                        this.K = trim;
                        this.L = optString4;
                        this.M = str2;
                        this.c.l(z8, optBoolean, trim, j6, parseColor, parseColor2, z9, z10, optString4);
                        break;
                    } catch (Exception e6) {
                        fc4.f(e6);
                        return;
                    }
                case '\t':
                    try {
                        this.c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                        break;
                    } catch (JSONException e7) {
                        fc4.f(e7);
                        return;
                    }
                case '\n':
                    try {
                        if (!this.i0 && this.a0 != null) {
                            this.j0 = new JSONObject(str2).optString("text");
                            this.i0 = true;
                            if (this.a0.checkSelfPermission("android.permission.CAMERA") != 0) {
                                nm7.e().a(new ov0(this, ow0Var, (byte) 0), nm7.h5);
                                this.a0.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                break;
                            } else {
                                Activity activity = this.a0;
                                if (activity != null) {
                                    this.h0 = lb1.j0(activity, 3, new ni6(this, (byte) 11));
                                    break;
                                }
                            }
                        }
                    } catch (JSONException e8) {
                        fc4.f(e8);
                        return;
                    }
                    break;
                case 11:
                    if (!k(4)) {
                        final int i6 = this.N;
                        final mw0 mw0Var2 = this.a;
                        final String[] strArr = {"cancelled"};
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), ylbVar);
                        alertDialog$Builder2.k(jb6.L0(2131745154));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String r = m9c.r(this.V);
                        if (TextUtils.isEmpty(r)) {
                            spannableStringBuilder.append((CharSequence) gm.S2(jb6.L0(2131754034)));
                        } else {
                            spannableStringBuilder.append((CharSequence) gm.S2(jb6.Z(2131754031, r)));
                        }
                        final boolean z11 = oc7.r1(this.N).x0.indexOfKey(this.V.id) >= 0;
                        if (z11) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) jb6.L0(2131754033));
                        }
                        alertDialog$Builder2.f(spannableStringBuilder);
                        alertDialog$Builder2.j(jb6.L0(2131745195), new ee() { // from class: fv0
                            @Override // ee
                            public final void r(he heVar, int i7) {
                                strArr[0] = null;
                                heVar.dismiss();
                                qw0 qw0Var2 = qw0.this;
                                int i8 = qw0Var2.N;
                                boolean z12 = z11;
                                int i9 = i6;
                                mw0 mw0Var3 = mw0Var2;
                                ow0 ow0Var3 = ow0Var;
                                if (z12) {
                                    oc7.r1(i8).n5(new up6((Object) qw0Var2, i9, (Object) mw0Var3, (Object) ow0Var3, (byte) 8), qw0Var2.V.id);
                                    return;
                                }
                                a6a.B(i8).q0(y5a.g(z8c.h(qw0Var2.N).f(), qw0Var2.V.id, null, null, null, null, true, 0, 0));
                                try {
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put("status", "sent");
                                    qw0.t(i9, mw0Var3, ow0Var3, "phone_requested", jSONObject7);
                                } catch (Exception e9) {
                                    fc4.g(e9, true);
                                }
                            }
                        });
                        alertDialog$Builder2.g(jb6.L0(2131752542), new qn0((byte) 5));
                        W(4, alertDialog$Builder2.a, new gv0(strArr, i6, mw0Var2, ow0Var, (byte) 0));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            u(ow0Var, "phone_requested", jSONObject7);
                            break;
                        } catch (Exception e9) {
                            fc4.f(e9);
                            return;
                        }
                    }
                case '\f':
                    w();
                    break;
                case '\r':
                    if (this.V != null) {
                        ou0 ou0Var6 = this.o0;
                        if (ou0Var6 == null) {
                            getContext();
                            int i7 = this.N;
                            ou0 ou0Var7 = new ou0(i7, z8c.h(i7).e(), this.V.id, true);
                            this.o0 = ou0Var7;
                            ou0Var = ou0Var7;
                        } else {
                            ou0Var = ou0Var6;
                        }
                        j(ow0Var, ou0Var, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.l0 == null) {
                        tr0 d = tr0.d(getContext(), this.N, this.V.id);
                        this.l0 = d;
                        d.f.add(bv0Var);
                    }
                    this.K0 = ow0Var;
                    bv0Var.run();
                    break;
                case 15:
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        this.Q = 0L;
                        d S = LaunchActivity.S();
                        if (S != null && S.getParentLayout() != null) {
                            tk5 parentLayout = S.getParentLayout();
                            S.presentFragment(ProfileActivity.S2(this.V.id));
                            gm.f3(parentLayout, "botPermissionBiometry");
                            uv0 uv0Var = this.c;
                            if (uv0Var != null) {
                                uv0Var.b();
                                break;
                            }
                        }
                    }
                    break;
                case 16:
                    l(!((getParent() instanceof d32) && ((d32) getParent()).c), true);
                    break;
                case 17:
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        yaa.a(this.N, this.V.id, new yu0(this, ow0Var, (byte) 0));
                        break;
                    }
                    break;
                case 18:
                    ws0 A = this.c.A();
                    if (A == null || !A.h()) {
                        u(ow0Var, "device_orientation_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        u(ow0Var, "device_orientation_stopped", null);
                        break;
                    }
                case 19:
                    if (this.V != null) {
                        ou0 ou0Var8 = this.n0;
                        if (ou0Var8 == null) {
                            getContext();
                            int i8 = this.N;
                            ou0 ou0Var9 = new ou0(i8, z8c.h(i8).e(), this.V.id, false);
                            this.n0 = ou0Var9;
                            ou0Var2 = ou0Var9;
                        } else {
                            ou0Var2 = ou0Var8;
                        }
                        T(ow0Var, ou0Var2, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.V != null) {
                        ou0 ou0Var10 = this.n0;
                        if (ou0Var10 == null) {
                            getContext();
                            int i9 = this.N;
                            ou0 ou0Var11 = new ou0(i9, z8c.h(i9).e(), this.V.id, false);
                            this.n0 = ou0Var11;
                            ou0Var3 = ou0Var11;
                        } else {
                            ou0Var3 = ou0Var10;
                        }
                        j(ow0Var, ou0Var3, str2, "device_storage_key_received", "device_storage_failed");
                        break;
                    }
                    break;
                case 21:
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused3) {
                        str3 = null;
                    }
                    c();
                    up0 up0Var = this.k0;
                    if (up0Var != null) {
                        if (up0Var.e) {
                            up0Var.h(str3, true, null, new qp0(up0Var, new yu0(this, ow0Var, (byte) 3), (byte) 0));
                            break;
                        } else {
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "failed");
                                u(ow0Var, "biometry_auth_requested", jSONObject8);
                                break;
                            } catch (Exception e10) {
                                fc4.f(e10);
                                return;
                            }
                        }
                    }
                    break;
                case 22:
                    try {
                        z = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused4) {
                        z = false;
                    }
                    uv0 uv0Var2 = this.c;
                    if (uv0Var2 != null) {
                        uv0Var2.p(z);
                        break;
                    }
                    break;
                case 23:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        z2 = jSONArray2.optBoolean(0, true);
                        try {
                            z3 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused5) {
                            z3 = true;
                            e("allowScroll " + z2 + " " + z3);
                            if (!(getParent() instanceof d32)) {
                                return;
                            }
                        }
                    } catch (Exception unused6) {
                        z2 = true;
                    }
                    e("allowScroll " + z2 + " " + z3);
                    if (!(getParent() instanceof d32)) {
                        ((d32) getParent()).a(z2, z3);
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
                        E(Uri.parse("https://t.me/".concat(optString5)), null, false, true, optBoolean2);
                        break;
                    } catch (JSONException e11) {
                        fc4.f(e11);
                        return;
                    }
                case 25:
                    if (this.V != null) {
                        ou0 ou0Var12 = this.o0;
                        if (ou0Var12 == null) {
                            getContext();
                            int i10 = this.N;
                            ou0 ou0Var13 = new ou0(i10, z8c.h(i10).e(), this.V.id, true);
                            this.o0 = ou0Var13;
                            ou0Var12 = ou0Var13;
                        }
                        P(ow0Var, ou0Var12, str2);
                        break;
                    }
                    break;
                case 26:
                    if (System.currentTimeMillis() - this.Q <= 10000 && System.currentTimeMillis() - this.R >= 2000) {
                        this.Q = 0L;
                        this.R = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject10 = new JSONObject(str2);
                            str5 = jSONObject10.optString("media_url");
                            try {
                                str6 = jSONObject10.optString("text");
                                try {
                                    JSONObject optJSONObject = jSONObject10.optJSONObject("widget_link");
                                    if (optJSONObject != null) {
                                        str4 = optJSONObject.optString("url");
                                        try {
                                            str7 = optJSONObject.optString("name");
                                        } catch (Exception e12) {
                                            e = e12;
                                            fc4.f(e);
                                            str7 = null;
                                            str8 = str5;
                                            String str13 = str6;
                                            String str14 = str4;
                                            if (str8 == null) {
                                                return;
                                            }
                                        }
                                    } else {
                                        str7 = null;
                                        str4 = null;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    str4 = null;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                str4 = null;
                                str6 = null;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                        }
                        str8 = str5;
                        String str132 = str6;
                        String str142 = str4;
                        if (str8 == null) {
                            if (oc7.r1(this.N).e5()) {
                                he heVar = new he(this.a0);
                                new HttpGetFileTask(new hv0(this, heVar, str132, str142, str7, (byte) 1), null).execute(str8);
                                heVar.q(250L);
                                break;
                            } else {
                                new kj8((d) new qv0(this), 14, true).show();
                                break;
                            }
                        }
                    }
                    break;
                case 27:
                    if (this.V != null) {
                        if (this.l0 == null) {
                            tr0 d2 = tr0.d(getContext(), this.N, this.V.id);
                            this.l0 = d2;
                            d2.f.add(bv0Var);
                        }
                        this.K0 = ow0Var;
                        boolean f = this.l0.f();
                        tr0 tr0Var = this.l0;
                        if (f) {
                            tr0Var.i(new zu0(this, ow0Var, (byte) 0));
                            break;
                        } else {
                            tr0Var.h(new yu0(this, ow0Var, (byte) 1));
                            break;
                        }
                    }
                    break;
                case 28:
                    ws0 A2 = this.c.A();
                    try {
                        j2 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused7) {
                    }
                    long k = Utilities.k(j2, 1000L, 20L);
                    if (A2 == null || !A2.d(k)) {
                        u(ow0Var, "gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        u(ow0Var, "gyroscope_started", null);
                        break;
                    }
                case 29:
                    try {
                        z4 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e16) {
                        fc4.f(e16);
                        z4 = false;
                    }
                    this.c.z();
                    if (z4) {
                        if (this.F0 && LaunchActivity.H1 != null) {
                            Activity W = gm.W(getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W != null && !W.isFinishing()) {
                                W.moveTaskToBack(true);
                                break;
                            }
                        } else if (this.G0 != null && (launchActivity = LaunchActivity.H1) != null && launchActivity.O() != null) {
                            xy0 O = LaunchActivity.H1.O();
                            ArrayList<wy0> tabs = O.getTabs();
                            int i11 = 0;
                            while (true) {
                                if (i11 < tabs.size()) {
                                    wy0 wy0Var2 = tabs.get(i11);
                                    if (!this.G0.equals(wy0Var2.a) || wy0Var2.b == this.a) {
                                        i11++;
                                    } else {
                                        wy0Var = wy0Var2;
                                    }
                                }
                            }
                            if (wy0Var != null) {
                                O.e(wy0Var);
                                break;
                            }
                        }
                    }
                    break;
                case nm7.S /* 30 */:
                    S(this.a.getUrl(), true);
                    break;
                case 31:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (!this.c.h() || System.currentTimeMillis() - this.Q > 10000) {
                            u(ow0Var, "clipboard_text_received", new JSONObject().put("req_id", string6));
                            break;
                        } else {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            u(ow0Var, "clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            break;
                        }
                    } catch (JSONException e17) {
                        fc4.f(e17);
                        return;
                    }
                case ' ':
                    Activity W2 = gm.W(getContext());
                    if (W2 == null) {
                        W2 = LaunchActivity.H1;
                    }
                    if (W2 != null) {
                        gm.t1(W2.getCurrentFocus());
                        break;
                    }
                    break;
                case '!':
                    ws0 A3 = this.c.A();
                    if (A3 == null || !A3.g()) {
                        u(ow0Var, "gyroscope_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        u(ow0Var, "gyroscope_stopped", null);
                        break;
                    }
                    break;
                case '\"':
                    if (this.V != null) {
                        ou0 ou0Var14 = this.o0;
                        if (ou0Var14 == null) {
                            getContext();
                            int i12 = this.N;
                            ou0 ou0Var15 = new ou0(i12, z8c.h(i12).e(), this.V.id, true);
                            this.o0 = ou0Var15;
                            ou0Var4 = ou0Var15;
                        } else {
                            ou0Var4 = ou0Var14;
                        }
                        b(ow0Var, ou0Var4, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case '#':
                    if (this.V != null) {
                        ou0 ou0Var16 = this.n0;
                        if (ou0Var16 == null) {
                            getContext();
                            int i13 = this.N;
                            ou0 ou0Var17 = new ou0(i13, z8c.h(i13).e(), this.V.id, false);
                            this.n0 = ou0Var17;
                            ou0Var16 = ou0Var17;
                        }
                        b(ow0Var, ou0Var16, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case '$':
                    ws0 A4 = this.c.A();
                    try {
                        j2 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused8) {
                    }
                    long k2 = Utilities.k(j2, 1000L, 20L);
                    if (A4 == null || !A4.c(k2)) {
                        u(ow0Var, "accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        u(ow0Var, "accelerometer_started", null);
                        break;
                    }
                case '%':
                    ws0 A5 = this.c.A();
                    if (A5 == null || !A5.f()) {
                        u(ow0Var, "accelerometer_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        u(ow0Var, "accelerometer_stopped", null);
                        break;
                    }
                    break;
                case '&':
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        try {
                            String string7 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string7)) {
                                u(ow0Var, "prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                                break;
                            } else {
                                lt0.Z0(getContext(), this.N, this.V.id, string7, this.e, new bv0(this, (byte) 0), new p((Object) this, (Object) ow0Var, (Object) botWebViewContainer$BotWebViewProxy, (byte) 4));
                                break;
                            }
                        } catch (Exception e18) {
                            fc4.f(e18);
                            u(ow0Var, "prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                            return;
                        }
                    }
                    break;
                case '\'':
                    try {
                        this.c.e(new JSONObject(str2).optString("data"));
                        break;
                    } catch (JSONException e19) {
                        fc4.f(e19);
                        return;
                    }
                case '(':
                    M(this.J0, true);
                    break;
                case ')':
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        hs6.d0(this.N);
                        long j7 = this.V.id;
                        boolean z12 = hs6.f2;
                        if (hs6.B0(z12 ? 1 : 0, j7)) {
                            u(ow0Var, "home_screen_added", null);
                            break;
                        } else {
                            hs6.d0(this.N).z0(this.V.id, z12 ? 1 : 0, new zu0(this, ow0Var, (byte) 2));
                            break;
                        }
                    }
                    break;
                case '*':
                    try {
                        z5 = true;
                        try {
                            z6 = new JSONObject(str2).optBoolean("blur", true);
                        } catch (Exception unused9) {
                            z6 = z5;
                            g = this.c.g(z5, z6);
                            if (g != null) {
                            }
                        }
                    } catch (Exception unused10) {
                        z5 = true;
                    }
                    g = this.c.g(z5, z6);
                    if (g != null) {
                        u(ow0Var, "fullscreen_changed", y("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(z6)));
                        break;
                    } else {
                        u(ow0Var, "fullscreen_failed", x(g, "error"));
                        break;
                    }
                case '+':
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i14 = 0; i14 < jSONArray3.length(); i14++) {
                            arrayList2.add(jSONArray3.getString(i14));
                        }
                        this.c.v(this.V, jSONObject11.getString("query"), arrayList2);
                        break;
                    } catch (JSONException e20) {
                        fc4.f(e20);
                        return;
                    }
                case ',':
                    if (this.V != null) {
                        ou0 ou0Var18 = this.o0;
                        if (ou0Var18 == null) {
                            getContext();
                            int i15 = this.N;
                            ou0 ou0Var19 = new ou0(i15, z8c.h(i15).e(), this.V.id, true);
                            this.o0 = ou0Var19;
                            ou0Var5 = ou0Var19;
                        } else {
                            ou0Var5 = ou0Var18;
                        }
                        T(ow0Var, ou0Var5, str2, "secure_storage_key_saved", "secure_storage_failed");
                        break;
                    }
                    break;
                case '-':
                    String g2 = this.c.g(false, true);
                    if (g2 == null) {
                        u(ow0Var, "fullscreen_changed", x(Boolean.FALSE, "is_fullscreen"));
                        break;
                    } else {
                        u(ow0Var, "fullscreen_failed", x(g2, "error"));
                        break;
                    }
                case '.':
                    if (this.Q0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z13 = jSONObject12.getBoolean("passed");
                            final double d3 = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            gm.c3(new Runnable() { // from class: cv0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qw0.this.Q0.a(Boolean.valueOf(z13), Double.valueOf(d3), optString6, Double.valueOf(optDouble));
                                }
                            });
                            break;
                        } catch (Exception e21) {
                            fc4.f(e21);
                            return;
                        }
                    }
                    break;
                case '/':
                    if (this.V != null && System.currentTimeMillis() - this.Q <= 10000) {
                        this.Q = 0L;
                        d S2 = LaunchActivity.S();
                        if (S2 != null && S2.getParentLayout() != null) {
                            tk5 parentLayout2 = S2.getParentLayout();
                            S2.presentFragment(ProfileActivity.S2(this.V.id));
                            gm.f3(parentLayout2, "botPermissionLocation");
                            uv0 uv0Var3 = this.c;
                            if (uv0Var3 != null) {
                                uv0Var3.b();
                                break;
                            }
                        }
                    }
                    break;
                case '0':
                    try {
                        boolean optBoolean3 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean3 != this.S) {
                            this.S = optBoolean3;
                            this.c.i(optBoolean3);
                            break;
                        }
                    } catch (JSONException e22) {
                        fc4.f(e22);
                        return;
                    }
                    break;
                case '1':
                    try {
                        charSequence = new JSONObject(str2).getString("reason");
                    } catch (Exception unused11) {
                    }
                    c();
                    up0 up0Var2 = this.k0;
                    if (up0Var2 != null) {
                        boolean z14 = up0Var2.f;
                        if (z14) {
                            s(ow0Var);
                            break;
                        } else if (up0Var2.e) {
                            if (!z14) {
                                up0Var2.f = true;
                                up0Var2.i();
                            }
                            s(ow0Var);
                            break;
                        } else {
                            final Runnable[] runnableArr = {new x30(this, ow0Var, (byte) 19)};
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), ylbVar);
                            if (TextUtils.isEmpty(charSequence)) {
                                alertDialog$Builder3.k(jb6.L0(2131753106));
                                b = 0;
                                alertDialog$Builder3.f(gm.S2(jb6.Z(2131753107, m9c.r(this.V))));
                            } else {
                                b = 0;
                                alertDialog$Builder3.k(gm.S2(jb6.Z(2131753107, m9c.r(this.V))));
                                alertDialog$Builder3.f(charSequence);
                            }
                            alertDialog$Builder3.j(jb6.L0(2131754249), new ee(this) { // from class: iv0
                                public final /* synthetic */ qw0 b;

                                {
                                    this.b = this;
                                }

                                @Override // ee
                                public final void r(he heVar2, int i16) {
                                    byte b5 = b;
                                    ow0 ow0Var3 = ow0Var;
                                    Runnable[] runnableArr2 = runnableArr;
                                    qw0 qw0Var2 = this.b;
                                    byte b6 = 0;
                                    switch (b5) {
                                        case 0:
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            up0 up0Var3 = qw0Var2.k0;
                                            up0Var3.f = true;
                                            up0Var3.i();
                                            up0 up0Var4 = qw0Var2.k0;
                                            yu0 yu0Var = new yu0(qw0Var2, ow0Var3, (byte) 2);
                                            up0Var4.getClass();
                                            up0Var4.h(null, true, null, new qp0(up0Var4, yu0Var, b6));
                                            break;
                                        default:
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            up0 up0Var5 = qw0Var2.k0;
                                            up0Var5.f = true;
                                            up0Var5.d = true;
                                            up0Var5.i();
                                            qw0Var2.s(ow0Var3);
                                            break;
                                    }
                                }
                            });
                            final byte b5 = 1;
                            alertDialog$Builder3.g(jb6.L0(2131752542), new ee(this) { // from class: iv0
                                public final /* synthetic */ qw0 b;

                                {
                                    this.b = this;
                                }

                                @Override // ee
                                public final void r(he heVar2, int i16) {
                                    byte b52 = b5;
                                    ow0 ow0Var3 = ow0Var;
                                    Runnable[] runnableArr2 = runnableArr;
                                    qw0 qw0Var2 = this.b;
                                    byte b6 = 0;
                                    switch (b52) {
                                        case 0:
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            up0 up0Var3 = qw0Var2.k0;
                                            up0Var3.f = true;
                                            up0Var3.i();
                                            up0 up0Var4 = qw0Var2.k0;
                                            yu0 yu0Var = new yu0(qw0Var2, ow0Var3, (byte) 2);
                                            up0Var4.getClass();
                                            up0Var4.h(null, true, null, new qp0(up0Var4, yu0Var, b6));
                                            break;
                                        default:
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            up0 up0Var5 = qw0Var2.k0;
                                            up0Var5.f = true;
                                            up0Var5.d = true;
                                            up0Var5.i();
                                            qw0Var2.s(ow0Var3);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.i(new n1(runnableArr, (byte) 6));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                    break;
                case '2':
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
                                            xx0Var = xx0.f;
                                            break;
                                        }
                                        break;
                                    case 3535914:
                                        if (optString8.equals("soft")) {
                                            xx0Var = xx0.r;
                                            break;
                                        }
                                        break;
                                    case 99152071:
                                        if (optString8.equals("heavy")) {
                                            xx0Var = xx0.h;
                                            break;
                                        }
                                        break;
                                    case 102970646:
                                        if (optString8.equals("light")) {
                                            xx0Var = xx0.e;
                                            break;
                                        }
                                        break;
                                    case 108511787:
                                        if (optString8.equals("rigid")) {
                                            xx0Var = xx0.n;
                                            break;
                                        }
                                        break;
                                }
                            }
                        } else if (hashCode != 193071555) {
                            if (hashCode == 595233003 && optString7.equals("notification")) {
                                String optString9 = jSONObject13.optString("notification_type");
                                int hashCode2 = optString9.hashCode();
                                if (hashCode2 != -1867169789) {
                                    if (hashCode2 != 96784904) {
                                        if (hashCode2 == 1124446108 && optString9.equals("warning")) {
                                            xx0Var = xx0.x;
                                        }
                                    } else if (optString9.equals("error")) {
                                        xx0Var = xx0.s;
                                    }
                                } else if (optString9.equals("success")) {
                                    xx0Var = xx0.w;
                                }
                            }
                        } else if (optString7.equals("selection_change")) {
                            xx0Var = xx0.y;
                        }
                        if (xx0Var != null) {
                            xx0Var.a();
                            break;
                        }
                    } catch (Exception e23) {
                        fc4.f(e23);
                        return;
                    }
                    break;
                case nm7.n0 /* 51 */:
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.G).trim();
                        boolean z15 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.E;
                        int parseColor4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.F;
                        boolean z16 = jSONObject14.optBoolean("is_progress_visible", false) && z15;
                        boolean z17 = jSONObject14.optBoolean("has_shine_effect", false) && z15;
                        try {
                            j = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j = 0;
                        }
                        this.E = parseColor3;
                        this.F = parseColor4;
                        this.G = trim2;
                        this.H = str2;
                        this.c.q(z15, optBoolean4, trim2, j, parseColor3, parseColor4, z16, z17);
                        break;
                    } catch (Exception e24) {
                        fc4.f(e24);
                        return;
                    }
                case nm7.o0 /* 52 */:
                    try {
                        this.c.y(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        break;
                    } catch (JSONException e25) {
                        fc4.f(e25);
                        return;
                    }
                case nm7.p0 /* 53 */:
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.T) {
                            this.T = optBoolean5;
                            this.c.t(optBoolean5);
                            break;
                        }
                    } catch (JSONException e26) {
                        fc4.f(e26);
                        return;
                    }
                    break;
                case nm7.q0 /* 54 */:
                    if (this.V == null || Build.VERSION.SDK_INT < 26) {
                        str9 = "unsupported";
                    } else {
                        hs6.d0(this.N);
                        str9 = hs6.B0(hs6.f2 ? 1 : 0, this.V.id) ? "added" : "missed";
                    }
                    u(ow0Var, "home_screen_checked", x(str9, "status"));
                    break;
                case nm7.r0 /* 55 */:
                    try {
                        str10 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e27) {
                        fc4.f(e27);
                    }
                    if (str10 != null) {
                        TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                        getrequestedwebviewbutton.bot = oc7.r1(this.N).p1(this.V);
                        getrequestedwebviewbutton.webapp_req_id = str10;
                        byte b6 = 0;
                        ConnectionsManager.getInstance(this.N).sendRequestTyped(getrequestedwebviewbutton, new kc(b6), new dv0(this, ow0Var, str10, b6));
                        break;
                    }
                    break;
                case '8':
                    ws0 A6 = this.c.A();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j2 = jSONObject15.getLong("refresh_rate");
                        z7 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        z7 = false;
                    }
                    long k3 = Utilities.k(j2, 1000L, 20L);
                    if (A6 == null || !A6.e(k3, z7)) {
                        u(ow0Var, "device_orientation_failed", x("UNSUPPORTED", "error"));
                        break;
                    } else {
                        u(ow0Var, "device_orientation_started", null);
                        break;
                    }
                case nm7.t0 /* 57 */:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string8 = jSONObject16.getString("token");
                        try {
                            str11 = jSONObject16.getString("reason");
                        } catch (Exception unused14) {
                        }
                        c();
                        up0 up0Var3 = this.k0;
                        if (up0Var3 != null) {
                            if (up0Var3.e) {
                                up0Var3.j(str11, string8, new iu(this, string8, ow0Var, (byte) 5));
                                break;
                            } else {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    u(ow0Var, "biometry_token_updated", jSONObject17);
                                    break;
                                } catch (Exception e28) {
                                    fc4.f(e28);
                                    return;
                                }
                            }
                        }
                    } catch (Exception e29) {
                        fc4.f(e29);
                        if (e29 instanceof JSONException) {
                            g("JSON Parse error");
                            return;
                        } else {
                            Y(null);
                            return;
                        }
                    }
                    break;
                case nm7.u0 /* 58 */:
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        boolean isEmpty = TextUtils.isEmpty(optString10);
                        int v0 = isEmpty ? cmb.v0(cmb.Z6, ylbVar) : Color.parseColor(optString10);
                        uv0 uv0Var4 = this.c;
                        if (uv0Var4 != null) {
                            if (isEmpty) {
                                uv0Var4.x(v0);
                                break;
                            } else {
                                uv0Var4.r(v0);
                                break;
                            }
                        }
                    } catch (Exception e30) {
                        fc4.f(e30);
                        return;
                    }
                    break;
                case nm7.v0 /* 59 */:
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String optString11 = jSONObject18.optString("color", null);
                        if (TextUtils.isEmpty(optString11)) {
                            String optString12 = jSONObject18.optString("color_key");
                            int hashCode3 = optString12.hashCode();
                            if (hashCode3 != -1265068311) {
                                if (hashCode3 == -210781868 && optString12.equals("secondary_bg_color")) {
                                    i = cmb.Z6;
                                }
                                i = -1;
                            } else {
                                if (optString12.equals("bg_color")) {
                                    i = cmb.c6;
                                }
                                i = -1;
                            }
                            if (i >= 0) {
                                this.c.u(i, cmb.v0(i, ylbVar), false);
                                break;
                            }
                        } else {
                            int parseColor5 = Color.parseColor(optString11);
                            if (parseColor5 != 0) {
                                this.c.u(-1, parseColor5, true);
                                break;
                            }
                        }
                    } catch (Exception e31) {
                        fc4.f(e31);
                        return;
                    }
                    break;
                case nm7.w0 /* 60 */:
                    N(this.I0, true);
                    break;
                case nm7.x0 /* 61 */:
                    try {
                        this.c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        break;
                    } catch (Exception e32) {
                        fc4.f(e32);
                        return;
                    }
                case nm7.y0 /* 62 */:
                    if (!k(3)) {
                        int i16 = this.N;
                        mw0 mw0Var3 = this.a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = oc7.r1(this.N).p1(this.V);
                        ConnectionsManager.getInstance(this.N).sendRequest(cansendmessage, new af((Object) this, i16, (Object) mw0Var3, (Object) ow0Var, (byte) 2));
                        break;
                    } else {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            u(ow0Var, "write_access_requested", jSONObject19);
                            break;
                        } catch (Exception e33) {
                            fc4.f(e33);
                            return;
                        }
                    }
                case nm7.z0 /* 63 */:
                    this.c.s();
                    break;
                default:
                    fc4.b("unknown webapp event ".concat(str));
                    break;
            }
        }
    }

    public final void D(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            fc4.b("invoice_closed " + jSONObject);
            if (z || !Objects.equals(this.c0, str)) {
                return;
            }
            this.c0 = null;
        } catch (JSONException e) {
            fc4.g(e, true);
        }
    }

    public final void E(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (System.currentTimeMillis() - this.Q <= 10000 || !z2) {
            this.Q = 0L;
            boolean[] zArr = {false};
            if (l11.g(uri, false, zArr) && !zArr[0] && this.c != null) {
                setKeyboardFocusable(false);
            }
            l11.t(getContext(), uri, true, z, false, null, str, false, true, z3, false);
        }
    }

    public abstract void H(mw0 mw0Var);

    public final void J() {
        e("preserveWebView");
        this.C0 = true;
        if (this.p0) {
            v("visibility_changed", x(Boolean.FALSE, "is_visible"));
            this.t0++;
        }
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            mw0Var.f(null, null);
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

    public final void L(int i, mw0 mw0Var, Object obj, String str, boolean z) {
        this.N = i;
        this.C0 = false;
        boolean z2 = this.p0;
        if (z2) {
            this.t0++;
            this.u0 = z;
            this.H0 = z ? i(str) : null;
        }
        V(mw0Var, obj);
        if (z2) {
            v("visibility_changed", x(Boolean.TRUE, "is_visible"));
        }
    }

    public final void M(int i, boolean z) {
        if (z || i != this.J0) {
            v("content_safe_area_changed", z("left", 0, "top", Float.valueOf(i / gm.p), "right", 0, "bottom", 0));
            this.J0 = i;
        }
    }

    public final void N(Rect rect, boolean z) {
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z || !rect2.equals(rect)) {
                v("safe_area_changed", z("left", Float.valueOf(rect.left / gm.p), "top", Float.valueOf(rect.top / gm.p), "right", Float.valueOf(rect.right / gm.p), "bottom", Float.valueOf(rect.bottom / gm.p)));
                rect2.set(rect);
            }
        }
    }

    public final void O() {
        try {
            if (this.H != null) {
                C(this.s0, d(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                C(this.s0, d(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void P(ow0 ow0Var, ou0 ou0Var, String str) {
        if (ou0Var == null || this.V == null) {
            return;
        }
        boolean z = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    u(ow0Var, "secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList h = ou0Var.h(optString);
                    if (h.isEmpty()) {
                        u(ow0Var, "secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    hv0 hv0Var = new hv0(this, ow0Var, string, ou0Var, optString);
                    d S = LaunchActivity.S();
                    ylb resourceProvider = S != null ? S.getResourceProvider() : null;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    my0 h2 = hg9.h(1, resourceProvider, context, false);
                    LinearLayout i = hg9.i(context, 1);
                    bf0 bf0Var = new bf0(context);
                    TLRPC.User W1 = oc7.r1(ou0Var.a).W1(Long.valueOf(ou0Var.b));
                    pc0 pc0Var = new pc0((ylb) null);
                    pc0Var.q(W1);
                    bf0Var.f(W1, pc0Var);
                    i.addView(bf0Var, qoe.t(80, 80, 49, 0, 21, 0, 13));
                    int i2 = cmb.F6;
                    TextView b = jxe.b(context, 20.0f, i2, true, null);
                    b.setText(jb6.M0(2131752943, null));
                    b.setGravity(17);
                    i.addView(b, qoe.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView b2 = jxe.b(context, 14.0f, i2, false, null);
                    hg9.q(null, null, 2131752944, new Object[]{pg3.G(null, null, W1)}, b2);
                    b2.setGravity(17);
                    i.addView(b2, qoe.t(-1, -2, 7, 32, 0, 32, 19));
                    njb njbVar = new njb(context, resourceProvider);
                    int i3 = -1;
                    ColorDrawable colorDrawable = new ColorDrawable(-1);
                    njbVar.setBackground(new sn2(colorDrawable, cmb.V0(context, R.drawable.greydivider, cmb.v0(cmb.a7, resourceProvider))));
                    anb.x(njbVar, colorDrawable, cmb.Z6, resourceProvider, PorterDuff.Mode.SRC_IN);
                    njbVar.setFixedSize(12);
                    i.addView(njbVar, qoe.t(-1, 12, 7, 0, 0, 0, 0));
                    jf5 jf5Var = new jf5(context, resourceProvider);
                    jf5Var.setText(jb6.M0(2131752945, null));
                    i.addView(jf5Var, qoe.t(-1, -2, 7, 0, 0, 0, 0));
                    b61 b61Var = new b61(resourceProvider, context, true);
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < h.size()) {
                        nu0 nu0Var = (nu0) h.get(i4);
                        boolean z2 = z;
                        mu0 mu0Var = new mu0(nu0Var, i4 < h.size() + (-1) ? z2 : false, context);
                        int i5 = cmb.h6;
                        hv0 hv0Var2 = hv0Var;
                        fg0 f0 = cmb.f0(cmb.v0(i5, resourceProvider), 2, i3);
                        wmb M = anb.M(i5);
                        mu0Var.setBackground(f0);
                        anb.j(mu0Var, f0, null, M, resourceProvider);
                        int i6 = i3;
                        mu0Var.setOnClickListener(new ef((Object) strArr, (Object) nu0Var, (Object) arrayList, (Object) b61Var, (byte) 5));
                        i.addView(mu0Var, qoe.o(i6, 56));
                        arrayList.add(mu0Var);
                        i4++;
                        hv0Var = hv0Var2;
                        i3 = i6;
                        z = z2;
                    }
                    hv0 hv0Var3 = hv0Var;
                    b61Var.i(jb6.M0(2131752947, null), false, z);
                    b61Var.setEnabled(strArr[0] != null);
                    i.addView(b61Var, qoe.t(-1, 48, 7, 8, 8, 8, 4));
                    h2.O = i;
                    h2.L(cmb.g5);
                    b61Var.setOnClickListener(new ef((Object) zArr, (Object) hv0Var3, (Object) strArr, (Object) h2, (byte) 6));
                    h2.setOnDismissListener(new dg(zArr, hv0Var3, (byte) 6));
                    h2.show();
                } catch (Exception e) {
                    u(ow0Var, "secure_storage_failed", y("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
                u(ow0Var, "secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void R(String[] strArr, gu2 gu2Var) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                this.W = new op6((Object) this, (Object) gu2Var, (Object) strArr, (byte) 29);
                Activity activity = this.a0;
                if (activity != null) {
                    activity.requestPermissions(strArr, 4000);
                    return;
                }
                return;
            }
        }
        gu2Var.accept(Boolean.TRUE);
    }

    public void S(String str, boolean z) {
        mw0 mw0Var = this.a;
        boolean z2 = mw0Var == null || !mw0Var.canGoBack();
        mw0 mw0Var2 = this.a;
        G(z2, mw0Var2 == null || !mw0Var2.canGoForward());
        mw0 mw0Var3 = this.a;
        if (mw0Var3 != null) {
            mw0Var3.b = true;
        }
        if (this.O) {
            e("setPageLoaded: already loaded");
            return;
        }
        kc0 kc0Var = this.s;
        if (!z || mw0Var3 == null || kc0Var == null) {
            if (mw0Var3 != null) {
                mw0Var3.setAlpha(1.0f);
            }
            if (kc0Var != null) {
                kc0Var.setAlpha(0.0f);
                kc0Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<mw0, Float>) property, 1.0f), ObjectAnimator.ofFloat(kc0Var, (Property<kc0, Float>) property, 0.0f));
            animatorSet.addListener(new g0(this, (byte) 26));
            animatorSet.start();
        }
        this.b = str;
        e("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.c.getClass();
    }

    public final void T(ow0 ow0Var, ou0 ou0Var, String str, String str2, String str3) {
        if (ou0Var == null || this.V == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        ou0Var.n(optString, jSONObject.optString("value"));
                        u(ow0Var, str2, x(string, "req_id"));
                    } catch (RuntimeException e) {
                        u(ow0Var, str3, y("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    u(ow0Var, str3, y("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void U() {
        mw0 mw0Var = this.a;
        if (mw0Var == null || !this.p0) {
            return;
        }
        mw0Var.removeJavascriptInterface("TelegramWebviewProxy");
        if (!nwc.a("WEB_MESSAGE_LISTENER")) {
            e("Bot WebMessageListener is unsupported; native bridge disabled");
            return;
        }
        Set singleton = Collections.singleton("*");
        mw0 mw0Var2 = this.a;
        if (!mw0Var2.S) {
            kwc.a(mw0Var2, "TelegramWebviewProxyMessage", singleton, new xg0(mw0Var2, (byte) 15));
            this.a.S = true;
        }
        if (nwc.a("DOCUMENT_START_SCRIPT")) {
            mw0 mw0Var3 = this.a;
            if (mw0Var3.T == null) {
                boolean z = kwc.a;
                if (!nwc.d.b()) {
                    rjb.j("This method is not supported by the current version of the framework and the current WebView APK");
                    return;
                }
                pwc c = kwc.c(mw0Var3);
                mw0Var3.T = new cf9(oz0.a(ScriptHandlerBoundaryInterface.class, c.a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), (byte) 4);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|1|(1:3)|(1:5)|6|(2:7|8)|(3:10|(1:12)(1:93)|(23:14|15|(3:17|(1:21)|22)(1:91)|23|(1:25)(1:90)|26|(1:28)|29|(2:31|(1:33))|34|(1:36)|37|38|(5:40|(1:42)(1:(1:51)(1:52))|43|(2:45|(1:47)(1:48))|49)|53|54|(1:58)|59|(1:63)|64|(5:66|(1:68)|69|(1:71)|72)(5:76|(1:78)|79|(1:81)(1:(1:84))|82)|73|74))|94|15|(0)(0)|23|(0)(0)|26|(0)|29|(0)|34|(0)|37|38|(0)|53|54|(8:56|58|59|(2:61|63)|64|(0)(0)|73|74)|85|58|59|(0)|64|(0)(0)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ae, code lost:
    
        fc4.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116 A[Catch: Exception -> 0x01ad, TryCatch #0 {Exception -> 0x01ad, blocks: (B:38:0x00e9, B:40:0x0116, B:43:0x0136, B:45:0x0151, B:47:0x0157, B:48:0x015c, B:49:0x017b, B:53:0x01a9), top: B:37:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(mw0 mw0Var, Object obj) {
        mw0 mw0Var2;
        WebSettings settings;
        File file;
        TLRPC.User user;
        boolean z;
        String str = "";
        mw0 mw0Var3 = this.a;
        if (mw0Var3 != null) {
            mw0Var3.destroy();
            removeView(this.a);
        }
        if (mw0Var != null) {
            gm.B2(mw0Var);
        }
        try {
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (gda.F0) {
            if (!(this.Q0 != null)) {
                z = true;
                WebView.setWebContentsDebuggingEnabled(z);
                if (mw0Var != null) {
                    Context context = getContext();
                    boolean z2 = this.p0;
                    long j = 0;
                    if (z2 && (user = this.V) != null) {
                        j = user.id;
                    }
                    mw0Var2 = new mw0(context, z2, j);
                } else {
                    mw0Var2 = mw0Var;
                }
                this.a = mw0Var2;
                if (this.p0) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.setAcceptCookie(true);
                    cookieManager.setAcceptThirdPartyCookies(this.a, true);
                    CookieManager.getInstance().flush();
                    this.a.f = this.w0;
                } else {
                    mw0Var2.setBackgroundColor(h(cmb.c6));
                }
                if (!oc7.r1(this.N).l4.F1.f) {
                    this.a.setLayerType(2, null);
                }
                this.a.f(this, this.d);
                this.a.setCloseListener(this.E0);
                settings = this.a.getSettings();
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
                if (this.Q0 != null) {
                    settings.setMediaPlaybackRequiresUserGesture(false);
                }
                String replace = settings.getUserAgentString().replace("; wv)", ")");
                StringBuilder sb = new StringBuilder("(Linux; Android ");
                String str2 = Build.VERSION.RELEASE;
                sb.append(str2);
                sb.append("; K)");
                String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb.toString()).replaceAll("Version/[\\d\\.]+ ", "");
                if (this.p0) {
                    PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                    int o = gda.o();
                    String str3 = o == 0 ? "LOW" : o == 1 ? "AVERAGE" : "HIGH";
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
                settings.setTextSize(WebSettings.TextSize.NORMAL);
                file = new File(a.h(), "webview_database");
                if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
                    settings.setDatabasePath(file.getAbsolutePath());
                }
                GeolocationPermissions.getInstance().clearAll();
                this.a.setVerticalScrollBarEnabled(false);
                if (mw0Var == null && this.p0) {
                    this.a.setAlpha(0.0f);
                }
                addView(this.a);
                if (this.p0) {
                    if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                        this.s0 = (BotWebViewContainer$BotWebViewProxy) obj;
                    }
                    BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.s0;
                    if (botWebViewContainer$BotWebViewProxy == null) {
                        botWebViewContainer$BotWebViewProxy = new BotWebViewContainer$BotWebViewProxy();
                        botWebViewContainer$BotWebViewProxy.a = this;
                        this.s0 = botWebViewContainer$BotWebViewProxy;
                    }
                    botWebViewContainer$BotWebViewProxy.a = this;
                    U();
                } else {
                    if (obj instanceof BotWebViewContainer$WebViewProxy) {
                        this.v0 = (BotWebViewContainer$WebViewProxy) obj;
                    }
                    BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.v0;
                    if (botWebViewContainer$WebViewProxy == null) {
                        mw0 mw0Var4 = this.a;
                        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(mw0Var4, this);
                        this.v0 = botWebViewContainer$WebViewProxy2;
                        mw0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
                    } else if (mw0Var == null) {
                        this.a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
                    }
                    this.v0.a = this;
                }
                H(this.a);
                R0 = false;
            }
        }
        z = false;
        WebView.setWebContentsDebuggingEnabled(z);
        if (mw0Var != null) {
        }
        this.a = mw0Var2;
        if (this.p0) {
        }
        if (!oc7.r1(this.N).l4.F1.f) {
        }
        this.a.f(this, this.d);
        this.a.setCloseListener(this.E0);
        settings = this.a.getSettings();
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
        }
        if (this.Q0 != null) {
        }
        String replace2 = settings.getUserAgentString().replace("; wv)", ")");
        StringBuilder sb3 = new StringBuilder("(Linux; Android ");
        String str22 = Build.VERSION.RELEASE;
        sb3.append(str22);
        sb3.append("; K)");
        String replaceAll2 = replace2.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb3.toString()).replaceAll("Version/[\\d\\.]+ ", "");
        if (this.p0) {
        }
        settings.setUserAgentString(replaceAll2);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        file = new File(a.h(), "webview_database");
        if (file.exists()) {
            settings.setDatabasePath(file.getAbsolutePath());
            GeolocationPermissions.getInstance().clearAll();
            this.a.setVerticalScrollBarEnabled(false);
            if (mw0Var == null) {
                this.a.setAlpha(0.0f);
            }
            addView(this.a);
            if (this.p0) {
            }
            H(this.a);
            R0 = false;
        }
        settings.setDatabasePath(file.getAbsolutePath());
        GeolocationPermissions.getInstance().clearAll();
        this.a.setVerticalScrollBarEnabled(false);
        if (mw0Var == null) {
        }
        addView(this.a);
        if (this.p0) {
        }
        H(this.a);
        R0 = false;
    }

    public final void W(int i, he heVar, Runnable runnable) {
        if (heVar == null || k(i)) {
            return;
        }
        heVar.setOnDismissListener(new dg(this, runnable, (byte) 7));
        this.d0 = heVar;
        heVar.k0 = false;
        heVar.show();
        if (this.M0 != i) {
            this.M0 = i;
            this.N0 = 0;
            this.O0 = 0L;
        }
        this.N0++;
    }

    public final void Y(String str) {
        g(jb6.M0(2131743566, "UnknownError").concat(str != null ? ": ".concat(str) : ""));
    }

    public final void a() {
        if (this.a != null || this.h) {
            return;
        }
        try {
            setupWebView(null);
        } catch (Throwable th) {
            fc4.g(th, true);
            this.s.setVisibility(8);
            this.h = true;
            this.f.setVisibility(0);
            mw0 mw0Var = this.a;
            if (mw0Var != null) {
                removeView(mw0Var);
            }
        }
    }

    public final void b(ow0 ow0Var, ou0 ou0Var, String str, String str2, String str3) {
        if (ou0Var == null || this.V == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                ou0Var.m(new JSONObject());
                u(ow0Var, str2, x(string, "req_id"));
            } catch (RuntimeException e) {
                u(ow0Var, str3, y("req_id", string, "error", e.getMessage()));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void c() {
        if (this.V == null) {
            return;
        }
        up0 up0Var = this.k0;
        if (up0Var == null) {
            this.k0 = up0.b(getContext(), this.N, this.V.id);
        } else {
            up0Var.f();
        }
    }

    public final ow0 d() {
        mw0 mw0Var = this.a;
        long j = this.t0;
        boolean z = this.u0;
        String str = this.H0;
        ow0 ow0Var = new ow0();
        ow0Var.c = this;
        ow0Var.d = mw0Var;
        ow0Var.a = j;
        ow0Var.b = z;
        ow0Var.e = str;
        return ow0Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        op6 op6Var;
        Uri[] uriArr;
        if (i == nm7.r4) {
            mw0 mw0Var = this.a;
            if (mw0Var != null) {
                mw0Var.setBackgroundColor(h(cmb.c6));
            }
            if (!this.r0) {
                int i3 = cmb.Aj;
                int h = h(i3);
                this.q0 = h;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN);
                kc0 kc0Var = this.s;
                kc0Var.setColorFilter(porterDuffColorFilter);
                meb mebVar = this.r;
                if (mebVar != null) {
                    mebVar.n = Integer.valueOf(this.q0);
                    this.r.e(i3, this.e, 1.0f, false);
                }
                kc0Var.invalidate();
            }
            w();
            return;
        }
        if (i != nm7.g5) {
            if (i == nm7.h5) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue != 4000 || (op6Var = this.W) == null) {
                    return;
                }
                op6Var.run();
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
                for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                    uriArr[i4] = clipData.getItemAt(i4).getUri();
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.s) {
            if (this.w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            if (this.w) {
                canvas.restore();
            }
            if (!this.w) {
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        }
        if (view == this.f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        }
        if (view == this.a) {
            if (gm.m0) {
                return true;
            }
            if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                return true;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(String str) {
        fc4.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public final void f() {
        e("destroyWebView preserving=" + this.C0);
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            if (mw0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.C0) {
                this.a.destroy();
                I(this.a);
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
            tr0 tr0Var = this.l0;
            if (tr0Var != null) {
                tr0Var.f.remove(this.L0);
                this.l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void g(String str) {
        new c41(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.s0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof d32)) {
            return 0;
        }
        d32 d32Var = (d32) getParent();
        if (d32Var.K) {
            return (int) ((d32Var.getMeasuredHeight() - d32Var.getOffsetY()) + this.A0);
        }
        return 0;
    }

    public String getOriginHost() {
        mw0 mw0Var = this.a;
        if (mw0Var == null) {
            return null;
        }
        return i(mw0Var.getUrl());
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

    public mw0 getWebView() {
        return this.a;
    }

    public final int h(int i) {
        ylb ylbVar = this.e;
        return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
    }

    public final void j(ow0 ow0Var, ou0 ou0Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (ou0Var == null || this.V == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String optString = jSONObject2.optString("key");
                if (optString == null) {
                    u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair f = ou0Var.f(optString);
                    if (!ou0Var.d || (obj = f.first) != null) {
                        u(ow0Var, str2, y("req_id", string, "value", f.first));
                        return;
                    }
                    Object obj2 = f.second;
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("req_id", string);
                        jSONObject.put("value", obj);
                        jSONObject.put("can_restore", obj2);
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    u(ow0Var, str2, jSONObject);
                } catch (RuntimeException e) {
                    u(ow0Var, str3, y("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused2) {
                u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final boolean k(int i) {
        if (this.d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
            return true;
        }
        if (this.M0 != i || this.N0 <= 3) {
            return false;
        }
        this.O0 = System.currentTimeMillis() + 3000;
        this.N0 = 0;
        return true;
    }

    public final void l(boolean z, boolean z2) {
        boolean z3;
        invalidate();
        if ((this.O || z2) && (z3 = this.p0) && (getParent() instanceof d32)) {
            d32 d32Var = (d32) getParent();
            byte b = 0;
            if (z) {
                this.P = d32Var.getSwipeOffsetY() == d32Var.getTopActionBarOffsetY() + (-d32Var.getOffsetY());
            }
            int max = Math.max(getMinHeight(), (int) (d32Var.getTopActionBarOffsetY() + ((d32Var.getMeasuredHeight() - d32Var.getOffsetY()) - d32Var.getSwipeOffsetY()) + this.A0));
            if (!z2 && max == this.x0 && this.y0 == z && this.z0 == this.P) {
                return;
            }
            this.x0 = max;
            this.y0 = z;
            this.z0 = this.P;
            String str = "{height:" + (max / gm.p) + ",is_state_stable:" + z + ",is_expanded:" + this.P + "}";
            if (!z3 || o()) {
                nm7.f(this.N).d(new mv0(this, kt6.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), b));
            } else {
                e("notifyEvent viewport_changed dropped for untrusted document");
            }
        }
    }

    public final boolean m(ow0 ow0Var) {
        boolean z;
        if (ow0Var == null) {
            return false;
        }
        String str = (String) ow0Var.e;
        if (((qw0) ow0Var.c) != this || ((mw0) ow0Var.d) != this.a || ow0Var.a != this.t0 || (z = ow0Var.b) != this.u0) {
            return false;
        }
        if (z) {
            return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.H0) && TextUtils.equals(str, getOriginHost());
        }
        return true;
    }

    public final boolean o() {
        if (this.a == null) {
            return false;
        }
        if (this.u0) {
            return !TextUtils.isEmpty(this.H0) && TextUtils.equals(this.H0, getOriginHost());
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e("attached");
        nm7.e().b(this, nm7.r4);
        nm7.e().b(this, nm7.g5);
        nm7.e().b(this, nm7.h5);
        setTag(R.id.bulletin_delegate_tag, new s20(this, (byte) 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e("detached");
        nm7.e().n(this, nm7.r4);
        nm7.e().n(this, nm7.g5);
        nm7.e().n(this, nm7.h5);
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.B0;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
        this.n.f = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.b0) {
            return;
        }
        l(true, false);
    }

    public final void p(int i, long j) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
        TLRPC.UserFull X1 = oc7.r1(i).X1(j);
        String p = m9c.p(W1);
        kc0 kc0Var = this.s;
        if (p != null && p.equals("DurgerKingBot")) {
            kc0Var.setVisibility(0);
            kc0Var.setAlpha(1.0f);
            kc0Var.o(null, null, neb.g(R.raw.durgerking_placeholder, Integer.valueOf(h(cmb.Z6))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(i).b.bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
            i2++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == j) {
                break;
            }
        }
        boolean z = true;
        if (tL_attachMenuBot != null) {
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = tL_attachMenuBot.icons;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList2.get(i3);
                i3++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals("placeholder_static")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = hs6.l0(tL_attachMenuBot);
            } else {
                z = false;
            }
            if (tL_attachMenuBotIcon != null) {
                kc0Var.setVisibility(0);
                kc0Var.setAlpha(1.0f);
                kc0Var.m(gn5.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        ylb ylbVar = this.e;
        if (X1 != null && (botInfo = X1.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            kc0Var.setVisibility(0);
            kc0Var.setAlpha(1.0f);
            meb i4 = neb.i(512, 512, X1.bot_info.app_settings.placeholder_svg_path);
            this.r = i4;
            if (i4 != null) {
                i4.n = Integer.valueOf(this.q0);
                this.r.e(cmb.Aj, ylbVar, 1.0f, false);
            }
            kc0Var.o(null, null, this.r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = gm.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        kc0Var.setVisibility(0);
        kc0Var.setAlpha(1.0f);
        meb i5 = neb.i(512, 512, path);
        this.r = i5;
        if (i5 != null) {
            i5.n = Integer.valueOf(this.q0);
            this.r.e(cmb.Aj, ylbVar, 1.0f, false);
        }
        kc0Var.o(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void q(int i, String str, boolean z) {
        this.N = i;
        if (this.p0) {
            this.t0++;
            this.u0 = z;
            this.H0 = z ? i(str) : null;
            if (this.a != null) {
                U();
            }
        }
        nm7.f(i).d(new mv0(this, str, (byte) 1));
    }

    public final void s(ow0 ow0Var) {
        if (this.V != null) {
            c();
            up0 up0Var = this.k0;
            if (up0Var == null) {
                return;
            }
            try {
                u(ow0Var, "biometry_info_received", up0Var.e());
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(uv0 uv0Var) {
        this.c = uv0Var;
    }

    public void setFlickerViewColor(int i) {
        int a = gm.B(i) > 0.7f ? cmb.a(0.0f, -0.15f, i) : cmb.a(0.025f, 0.15f, i);
        if (this.q0 == a) {
            return;
        }
        this.q0 = a;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a, PorterDuff.Mode.SRC_IN);
        kc0 kc0Var = this.s;
        kc0Var.setColorFilter(porterDuffColorFilter);
        meb mebVar = this.r;
        if (mebVar != null) {
            mebVar.n = Integer.valueOf(this.q0);
            this.r.e(cmb.Aj, this.e, 1.0f, false);
        }
        this.r0 = true;
        kc0Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i) {
        if (this.B0 == i) {
            return;
        }
        this.B0 = i;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z) {
        this.S = z;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.E0 = runnable;
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            mw0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(nac nacVar) {
        this.Q0 = nacVar;
    }

    public void setOpener(mw0 mw0Var) {
        mw0 mw0Var2;
        this.w0 = mw0Var;
        if (this.p0 || (mw0Var2 = this.a) == null) {
            return;
        }
        mw0Var2.f = mw0Var;
    }

    public void setParentActivity(Activity activity) {
        this.a0 = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.b0 = z;
    }

    public void setViewPortHeightOffset(float f) {
        this.A0 = f;
    }

    public void setWasOpenedByBot(rwc rwcVar) {
        this.G0 = rwcVar;
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        this.F0 = z;
    }

    public void setWebViewProgressListener(gu2 gu2Var) {
        this.x = gu2Var;
    }

    public void setWebViewScrollListener(pw0 pw0Var) {
        this.d = pw0Var;
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            mw0Var.f(this, pw0Var);
        }
    }

    public final void u(ow0 ow0Var, String str, JSONObject jSONObject) {
        if (m(ow0Var)) {
            v(str, jSONObject);
            return;
        }
        e("notifyEvent " + str + " dropped after document change");
    }

    @Override // vlb
    public final void updateColors() {
        kc0 kc0Var;
        int h;
        try {
            if (this.a != null && (h = h(cmb.c6)) != this.D0) {
                this.D0 = h;
                this.a.setBackgroundColor(h);
            }
            if (this.r0 || (kc0Var = this.s) == null) {
                return;
            }
            int i = this.q0;
            int i2 = cmb.Aj;
            if (i != h(i2)) {
                int h2 = h(i2);
                this.q0 = h2;
                kc0Var.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
                meb mebVar = this.r;
                if (mebVar != null) {
                    mebVar.n = Integer.valueOf(this.q0);
                }
                kc0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        if (this.p0 && !o()) {
            e("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        e("notifyEvent " + str);
        nm7.f(this.N).d(new mv0(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", (byte) 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject u;
        try {
            u = wx0.u(this.e, true);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (u != null) {
            jSONObject = new JSONObject().put("theme_params", u);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public void F() {
    }

    public void I(mw0 mw0Var) {
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z) {
    }

    public void B(boolean z, String str) {
    }

    public void G(boolean z, boolean z2) {
    }
}
