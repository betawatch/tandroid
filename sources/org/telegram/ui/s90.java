package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Wallet.WalletEngine2;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s90 {
    public static final Pattern k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity a;
    public final int b;
    public final vf.b c;
    public final boolean d;
    public org.telegram.ui.ActionBar.u1 e;
    public boolean f;
    public boolean g;
    public int h = -1;
    public bi.ub i;
    public boolean j;

    public s90(LaunchActivity launchActivity, int i7, vf.b bVar, boolean z9) {
        this.a = launchActivity;
        this.b = i7;
        this.c = bVar;
        this.d = z9;
    }

    public static org.telegram.ui.Components.gc d() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        return T == null ? org.telegram.ui.Components.gc.X() : org.telegram.ui.Components.gc.a0(T);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2.equals("http") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(String str) {
        if ("back".equals(str) || "none".equals(str)) {
            return true;
        }
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme != null && !uri.getRawSchemeSpecificPart().isEmpty()) {
                String lowerCase = scheme.toLowerCase(Locale.ROOT);
                switch (lowerCase.hashCode()) {
                    case -1183762788:
                        if (lowerCase.equals("intent")) {
                            return false;
                        }
                        return true;
                    case 3695:
                        if (lowerCase.equals("tc")) {
                            return false;
                        }
                        return true;
                    case 3076010:
                        if (lowerCase.equals("data")) {
                            return false;
                        }
                        return true;
                    case 3143036:
                        if (lowerCase.equals("file")) {
                            return false;
                        }
                        return true;
                    case 3213448:
                        break;
                    case 99617003:
                        if (lowerCase.equals("https")) {
                            if (uri.getHost() == null || uri.getRawUserInfo() != null) {
                                return false;
                            }
                        }
                        return true;
                    case 188995949:
                        if (lowerCase.equals("javascript")) {
                            return false;
                        }
                        return true;
                    case 951530617:
                        if (lowerCase.equals("content")) {
                            return false;
                        }
                        return true;
                    default:
                        return true;
                }
            }
            return false;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0040, code lost:
    
        if (r3.equals("http") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:5:0x0006, B:8:0x0012, B:11:0x001a, B:18:0x002e, B:21:0x0042, B:24:0x004a, B:26:0x0064, B:28:0x006c, B:31:0x0076, B:34:0x0087, B:36:0x0093, B:37:0x0096, B:39:0x009c, B:41:0x00a3, B:44:0x00af, B:46:0x00b5, B:49:0x00c3, B:50:0x00c7, B:52:0x0154, B:55:0x0161, B:60:0x00cc, B:63:0x00d6, B:66:0x00e0, B:69:0x00ea, B:72:0x00f4, B:75:0x00fe, B:78:0x0108, B:81:0x0112, B:84:0x011c, B:87:0x0126, B:90:0x0130, B:93:0x0139, B:96:0x0142, B:99:0x014b, B:102:0x016b, B:104:0x0171, B:106:0x003a, B:108:0x017d, B:110:0x0185, B:112:0x018d, B:114:0x0195), top: B:4:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(String str) {
        String path;
        String str2;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (scheme != null && (path = parse.getPath()) != null) {
                    int hashCode = scheme.hashCode();
                    if (hashCode != 3699) {
                        if (hashCode != 3213448) {
                            if (hashCode == 99617003 && scheme.equals("https")) {
                                if (!path.isEmpty()) {
                                    String lowerCase = parse.getHost().toLowerCase();
                                    boolean find = LaunchActivity.C1.matcher(lowerCase).find();
                                    if (lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog") || find) {
                                        ArrayList arrayList = new ArrayList(parse.getPathSegments());
                                        if (arrayList.size() > 0 && ((String) arrayList.get(0)).equals("s")) {
                                            arrayList.remove(0);
                                        }
                                        if (arrayList.size() > 0 && (arrayList.size() < 3 || !"s".equals(arrayList.get(1)))) {
                                            if (arrayList.size() > 1) {
                                                String str3 = (String) arrayList.get(0);
                                                if (!TextUtils.isEmpty(str3)) {
                                                    switch (str3.hashCode()) {
                                                        case -1401304190:
                                                            if (str3.equals("joinchat")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2) && !str2.matches("^\\d+$")) {
                                                                return true;
                                                            }
                                                            break;
                                                        case -1268966290:
                                                            if (str3.equals("folder")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                                return true;
                                                            }
                                                        case -1230486459:
                                                            if (str3.equals("addemoji")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case -1216792120:
                                                            if (str3.equals("addtheme")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case -1147866945:
                                                            if (str3.equals("addlist")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case org.telegram.messenger.qs.k1 /* 99 */:
                                                            if (str3.equals("c")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 108417:
                                                            if (str3.equals("msg")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 93922211:
                                                            if (str3.equals("boost")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 103149417:
                                                            if (str3.equals("login")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 109400031:
                                                            if (str3.equals("share")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 311086522:
                                                            if (str3.equals("setlanguage")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 492791415:
                                                            if (str3.equals("addstickers")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 951526432:
                                                            if (str3.equals("contact")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 2112655022:
                                                            if (str3.equals("confirmphone")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        default:
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else if (arrayList.size() == 1) {
                                                return !TextUtils.isEmpty(parse.getQueryParameter("startapp"));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (scheme.equals("tg") && (str.startsWith("tg:resolve") || str.startsWith("tg://resolve"))) {
                        return !TextUtils.isEmpty(parse.getQueryParameter("appname"));
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return false;
            }
        }
        return false;
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i7 = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i7] & 192) == 128) {
            i7--;
        }
        return new String(bytes, 0, i7, StandardCharsets.UTF_8);
    }

    public static Uri s(Uri uri) {
        String schemeSpecificPart;
        if (uri == null || !uri.isOpaque()) {
            return uri;
        }
        String scheme = uri.getScheme();
        if (scheme == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
            return uri;
        }
        return Uri.parse(scheme + "://" + schemeSpecificPart);
    }

    public final boolean a() {
        if (this.j) {
            return false;
        }
        LaunchActivity launchActivity = this.a;
        return (launchActivity.isFinishing() || launchActivity.isDestroyed() || !LaunchActivity.F1 || org.telegram.messenger.iz.x || org.telegram.messenger.iz.C || org.telegram.messenger.p10.s0 != this.b) ? false : true;
    }

    public final void b() {
        this.j = true;
        bi.ub ubVar = this.i;
        if (ubVar != null) {
            org.telegram.messenger.g0.r(ubVar);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.g) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.e;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        vf.b bVar = this.c;
        if (bVar != null) {
            bVar.b();
        }
        this.g = true;
    }

    public final org.telegram.ui.ActionBar.r4 e() {
        return this.a.M();
    }

    public final org.telegram.messenger.p10 f() {
        return org.telegram.messenger.p10.i(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.s90] */
    /* JADX WARN: Type inference failed for: r4v21, types: [fi.o9, fi.p7] */
    public final boolean g(Uri uri) {
        String str;
        Uri s5;
        List<String> pathSegments;
        Long l10;
        Uri uri2 = uri;
        if (uri2 != null) {
            org.telegram.messenger.a8.b("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.a;
            if (equalsIgnoreCase) {
                vf.c.q(launchActivity, uri2, true, true);
                return true;
            }
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                String host = uri2.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.C1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str2 = "";
                            sb2.append(TextUtils.isEmpty(uri2.getPath()) ? "" : uri2.getPath());
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str2 = "?" + uri2.getQuery();
                            }
                            sb2.append(str2);
                            uri2 = Uri.parse(sb2.toString());
                        }
                        String path = uri2.getPath();
                        if (path != null && path.length() > 1) {
                            String substring = path.substring(1);
                            List<String> pathSegments2 = uri2.getPathSegments();
                            if (pathSegments2 != null && !pathSegments2.isEmpty()) {
                                String str3 = pathSegments2.get(0);
                                String str4 = pathSegments2.size() > 1 ? pathSegments2.get(1) : null;
                                if ("sendgrams".equalsIgnoreCase(str3)) {
                                    return l(uri2);
                                }
                                if ("getpremium".equalsIgnoreCase(str3)) {
                                    String queryParameter = uri2.getQueryParameter("ref");
                                    if (queryParameter != null) {
                                        String lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                                        if (k.matcher(lowerCase).matches()) {
                                            str = rf.b.i("tme_getpremium_", lowerCase);
                                            u(new PremiumPreviewFragment(0, str), false);
                                            return true;
                                        }
                                    }
                                    str = "tme_getpremium";
                                    u(new PremiumPreviewFragment(0, str), false);
                                    return true;
                                }
                                if ("$".equalsIgnoreCase(str3)) {
                                    return i(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str3)) {
                                    return i(str4);
                                }
                                if ("addstyle".equalsIgnoreCase(str3)) {
                                    return h(str4);
                                }
                                if ("oauth".equalsIgnoreCase(str3)) {
                                    return k(uri2, uri2.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str3)) {
                                    if (pathSegments2.size() >= 2) {
                                        j(str4, pathSegments2.size() >= 3 ? pathSegments2.get(2) : null, uri2.getQueryParameter("name"));
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                boolean equalsIgnoreCase2 = "tg".equalsIgnoreCase(scheme);
                int i7 = this.b;
                if (equalsIgnoreCase2) {
                    Uri s9 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments3 = s9.getPathSegments();
                    if (pathSegments3 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments3);
                        String authority = s9.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str5 = (String) arrayList.get(0);
                            String str6 = arrayList.size() > 1 ? (String) arrayList.get(1) : null;
                            if ("sendgrams".equalsIgnoreCase(str5)) {
                                return l(s9);
                            }
                            if ("newbot".equalsIgnoreCase(str5)) {
                                j(s9.getQueryParameter("manager"), s9.getQueryParameter("username"), s9.getQueryParameter("name"));
                                return true;
                            }
                            if ("resolve".equalsIgnoreCase(str5)) {
                                List<String> pathSegments4 = s9.getPathSegments();
                                if (pathSegments4 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments4);
                                    String authority2 = s9.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter2 = s9.getQueryParameter("domain");
                                        String queryParameter3 = s9.getQueryParameter("startapp");
                                        if ("sendgrams".equalsIgnoreCase(queryParameter2)) {
                                            return l(s9);
                                        }
                                        if ("oauth".equalsIgnoreCase(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
                                            return k(s9, queryParameter3);
                                        }
                                    }
                                }
                            } else {
                                if ("invoice".equalsIgnoreCase(str5)) {
                                    return i(s9.getQueryParameter("slug"));
                                }
                                if ("oauth".equalsIgnoreCase(str5)) {
                                    return k(s9, s9.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str5)) {
                                    return m(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str5)) {
                                    "search".equalsIgnoreCase(str6);
                                    "edit".equalsIgnoreCase(str6);
                                    "emoji-status".equalsIgnoreCase(str6);
                                }
                                if ("new".equalsIgnoreCase(str5)) {
                                    if ("group".equalsIgnoreCase(str6)) {
                                        u(new z40(new Bundle()), false);
                                        return true;
                                    }
                                    if ("contact".equalsIgnoreCase(str6)) {
                                        new dh0(launchActivity, LaunchActivity.T()).show();
                                        return true;
                                    }
                                    if (!"channel".equalsIgnoreCase(str6)) {
                                        u(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                                    boolean z9 = org.telegram.messenger.r2.a;
                                    u(new g(0), false);
                                    e12.edit().putBoolean("channel_intro", true).commit();
                                    return true;
                                }
                                if ("post".equalsIgnoreCase(str5)) {
                                    ?? r02 = MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(str6);
                                    if ("live".equalsIgnoreCase(str6)) {
                                        r02 = -1;
                                    }
                                    fi.va D = fi.va.D(launchActivity, i7);
                                    if (D.O1 != r02) {
                                        D.O1 = r02;
                                        ?? r42 = D.Q0;
                                        if (r42 != 0) {
                                            r42.a(r02);
                                        }
                                        D.h0(r02 == 1, true);
                                        fi.y yVar = D.I0;
                                        if (yVar != null) {
                                            yVar.a(false, true);
                                        }
                                        D.l0(false);
                                    }
                                    D.Q(null);
                                    return true;
                                }
                                if ("contacts".equalsIgnoreCase(str5)) {
                                    if ("new".equalsIgnoreCase(str6)) {
                                        new dh0(launchActivity, LaunchActivity.T()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    u(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str6);
                                    "sort".equalsIgnoreCase(str6);
                                    if ("invite".equalsIgnoreCase(str6)) {
                                        x("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                }
                                if ("addstyle".equalsIgnoreCase(str5)) {
                                    return h(s9.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                } else if ("ton".equalsIgnoreCase(scheme)) {
                    if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).x7.j0.b).c && (pathSegments = (s5 = s(uri2)).getPathSegments()) != null) {
                        ArrayList arrayList3 = new ArrayList(pathSegments);
                        String authority3 = s5.getAuthority();
                        if (!TextUtils.isEmpty(authority3)) {
                            arrayList3.add(0, authority3);
                        }
                        if (!arrayList3.isEmpty()) {
                            String str7 = (String) arrayList3.get(0);
                            String str8 = arrayList3.size() > 1 ? (String) arrayList3.get(1) : null;
                            if (!"transfer".equalsIgnoreCase(str7)) {
                                return false;
                            }
                            if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str8)) {
                                try {
                                    l10 = Long.valueOf(Long.parseLong(s5.getQueryParameter("amount")));
                                } catch (Throwable unused) {
                                    l10 = null;
                                }
                                String queryParameter4 = s5.getQueryParameter("text");
                                if (TextUtils.isEmpty(queryParameter4)) {
                                    queryParameter4 = s5.getQueryParameter("comment");
                                }
                                String r10 = r(queryParameter4);
                                boolean booleanQueryParameter = s5.getBooleanQueryParameter("encrypted", false);
                                try {
                                    org.telegram.ui.Wallet.o9 o9Var = new org.telegram.ui.Wallet.o9(str8);
                                    if (l10 != null && l10.longValue() > 0) {
                                        o9Var.s = l10.longValue();
                                    }
                                    if (!TextUtils.isEmpty(r10)) {
                                        o9Var.g0 = r10;
                                        o9Var.h0 = booleanQueryParameter;
                                    }
                                    o9Var.f0 = true;
                                    u(o9Var, false);
                                    return true;
                                } catch (Throwable th2) {
                                    org.telegram.messenger.a8.g(th2, true);
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                } else if ("tc".equalsIgnoreCase(scheme)) {
                    return n(uri);
                }
            }
        }
        return false;
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        o();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(gettone, new d3.b(1), new a5(this, 14));
        return true;
    }

    public final boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_payments_getPaymentForm, new z9((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
        return true;
    }

    public final void j(String str, String str2, String str3) {
        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = new TLRPC.TL_requestPeerTypeCreateBot();
        tL_requestPeerTypeCreateBot.bot_managed = true;
        if (!TextUtils.isEmpty(str3)) {
            tL_requestPeerTypeCreateBot.flags |= 2;
            tL_requestPeerTypeCreateBot.suggested_name = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            tL_requestPeerTypeCreateBot.flags |= 4;
            tL_requestPeerTypeCreateBot.suggested_username = str2;
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null || T.getContext() == null) {
            return;
        }
        o();
        TLRPC.User[] userArr = {null};
        org.telegram.messenger.qp.s1(this.b).d2().a(str, null, new y(this, userArr, new org.telegram.ui.Components.kn0(this, T, userArr, tL_requestPeerTypeCreateBot, 14), 10));
    }

    public final boolean k(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new bi.p5(18, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j3;
        int i7 = this.b;
        if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).x7.j0.b).c) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("startapp");
        if (queryParameter == null || !queryParameter.startsWith("tonconnect-")) {
            uri2 = null;
        } else {
            uri2 = Uri.parse("tc://connect?" + queryParameter.substring(11).replace("--", "%").replace("__", "=").replace("-", "&").replace("%5F", "_").replace("%2D", "-").replace("%2E", "."));
        }
        if (uri2 != null) {
            n(uri2);
            return true;
        }
        String queryParameter2 = uri.getQueryParameter("to");
        String queryParameter3 = uri.getQueryParameter("amount");
        String queryParameter4 = uri.getQueryParameter("text");
        if (TextUtils.isEmpty(queryParameter4)) {
            queryParameter4 = uri.getQueryParameter("comment");
        }
        String r10 = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j3 = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j3 = 0;
        long j10 = j3;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new org.telegram.ui.Wallet.z5(), false);
            return true;
        }
        if (queryParameter2.startsWith("@") || queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (queryParameter2.startsWith("@")) {
                queryParameter2 = queryParameter2.substring(1);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = queryParameter2;
                o();
                this.h = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.m(this, j10, r10, booleanQueryParameter));
                return true;
            }
        } else if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
            org.telegram.ui.Wallet.o9 o9Var = new org.telegram.ui.Wallet.o9(queryParameter2);
            o9Var.s = j10;
            o9Var.g0 = r10;
            o9Var.h0 = booleanQueryParameter;
            o9Var.f0 = true;
            u(o9Var, false);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:604:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0adf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(List list) {
        boolean z9;
        boolean z10;
        int i7;
        String str;
        String str2;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f2 T;
        me0 me0Var;
        if (list == null) {
            return false;
        }
        boolean z11 = true;
        if (list.isEmpty()) {
            t(new o31());
            return true;
        }
        String str3 = (String) list.get(0);
        String str4 = list.size() > 1 ? (String) list.get(1) : null;
        String str5 = list.size() > 2 ? (String) list.get(2) : null;
        String str6 = list.size() > 3 ? (String) list.get(3) : null;
        String str7 = list.size() > 4 ? (String) list.get(4) : null;
        if ("theme".equalsIgnoreCase(str3) || "themes".equalsIgnoreCase(str3)) {
            t(new ThemeActivity(0));
            return true;
        }
        if ("devices".equalsIgnoreCase(str3)) {
            SessionsActivity sessionsActivity = new SessionsActivity(0);
            if ("link-desktop".equalsIgnoreCase(str4)) {
                sessionsActivity.q0();
            }
            t(sessionsActivity);
            if ("terminate-sessions".equalsIgnoreCase(str4)) {
                x("terminateAllSessionsRow");
            }
            if ("auto-terminate".equalsIgnoreCase(str4)) {
                x("ttlRow");
                return true;
            }
        } else if ("folders".equalsIgnoreCase(str3)) {
            FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
            t(new FiltersSetupActivity());
            if ("create".equalsIgnoreCase(str4)) {
                org.telegram.messenger.g0.i3(new f10(21, this, filtersSetupActivity), 300L);
            }
            if ("show-tags".equalsIgnoreCase(str4)) {
                x("showTagsRow");
                return true;
            }
        } else {
            if ("change_number".equalsIgnoreCase(str3)) {
                u(new g(3), true);
                return true;
            }
            if (!"language".equalsIgnoreCase(str3)) {
                if ("auto_delete".equalsIgnoreCase(str3)) {
                    t(new p4());
                    return true;
                }
                if ("phone_privacy".equalsIgnoreCase(str3)) {
                    t(new PrivacyControlActivity(6));
                    return true;
                }
                if ("premium_sms".equalsIgnoreCase(str3)) {
                    org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
                }
                boolean equalsIgnoreCase = "login_email".equalsIgnoreCase(str3);
                int i12 = 11;
                int i13 = this.b;
                if (equalsIgnoreCase) {
                    o();
                    this.h = ConnectionsManager.getInstance(i13).sendRequest(new TL_account.getPassword(), new l(this, i12), 10);
                    return true;
                }
                if ("chats".equalsIgnoreCase(str3)) {
                    org.telegram.ui.ActionBar.r4 e10 = e();
                    int size = e10.getFragmentStack().size() - 1;
                    while (true) {
                        z9 = z11;
                        if (size < 0) {
                            me0Var = null;
                            break;
                        }
                        if (e10.getFragmentStack().get(size) instanceof me0) {
                            me0Var = (me0) e10.getFragmentStack().get(size);
                            break;
                        }
                        if (size > 0) {
                            ((ActionBarLayout) e10).b0(size);
                        }
                        size++;
                        z11 = z9;
                    }
                    if (me0Var != null && "search".equalsIgnoreCase(str4)) {
                        me0Var.c.E(2);
                        return z9;
                    }
                } else {
                    z9 = true;
                }
                if ("saved-messages".equalsIgnoreCase(str3)) {
                    t(cn.ta(f().e()));
                    return z9;
                }
                if ("calls".equalsIgnoreCase(str3)) {
                    if ("start-call".equalsIgnoreCase(str4)) {
                        boolean z12 = z9;
                        t(new p90(this, a8.p0.k("isCall", z12)));
                        return z12;
                    }
                    boolean z13 = z9;
                    t(new i9());
                    return z13;
                }
                if ("qr-code".equalsIgnoreCase(str3)) {
                    if ("scan".equalsIgnoreCase(str4) && (T = LaunchActivity.T()) != null) {
                        ai.s0.e0(T);
                        return z9;
                    }
                    if ("share".equalsIgnoreCase(str4)) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", f().e());
                        t(new q90(bundle));
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", f().e());
                    t(new ai.s0(bundle2));
                    return true;
                }
                String str8 = str7;
                if (!"chat".equalsIgnoreCase(str3) || !"browser".equalsIgnoreCase(str4)) {
                    String str9 = str5;
                    if ("edit".equalsIgnoreCase(str3)) {
                        t(new UserInfoActivity());
                        if ("first-name".equalsIgnoreCase(str4)) {
                            x("firstNameRow");
                        }
                        if ("last-name".equalsIgnoreCase(str4)) {
                            x("lastNameRow");
                        }
                        if ("bio".equalsIgnoreCase(str4)) {
                            x("bioRow");
                        }
                        if ("birthday".equalsIgnoreCase(str4)) {
                            x("birthdayRow");
                        }
                        if ("change-number".equalsIgnoreCase(str4)) {
                            x("numberRow");
                        }
                        if ("username".equalsIgnoreCase(str4)) {
                            x("usernameRow");
                        }
                        if ("channel".equalsIgnoreCase(str4)) {
                            x("channelRow");
                        }
                        if ("add-account".equalsIgnoreCase(str4)) {
                            x("addAccountRow");
                        }
                        if ("log-out".equalsIgnoreCase(str4)) {
                            x("logoutRow");
                            return true;
                        }
                        z10 = true;
                    } else {
                        if ("my-profile".equalsIgnoreCase(str3)) {
                            if ("edit".equalsIgnoreCase(str4)) {
                                t(new UserInfoActivity());
                                return true;
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("user_id", f().e());
                            bundle3.putBoolean("my_profile", true);
                            if ("gifts".equalsIgnoreCase(str4)) {
                                bundle3.putBoolean("open_gifts", true);
                            }
                            ProfileActivity profileActivity = new ProfileActivity(bundle3);
                            if ("gifts".equalsIgnoreCase(str4)) {
                                profileActivity.whenFullyVisible(new m90(profileActivity, 2));
                            }
                            if ("posts".equalsIgnoreCase(str4)) {
                                profileActivity.whenFullyVisible(new m90(profileActivity, 3));
                            }
                            t(profileActivity);
                            return true;
                        }
                        if ("notifications".equalsIgnoreCase(str3)) {
                            if (!TextUtils.isEmpty(str9) && ("private-chats".equalsIgnoreCase(str4) || "groups".equalsIgnoreCase(str4) || "channels".equalsIgnoreCase(str4) || "stories".equalsIgnoreCase(str4) || "reactions".equalsIgnoreCase(str4))) {
                                if ("private-chats".equalsIgnoreCase(str4)) {
                                    i11 = 1;
                                } else {
                                    if (!"groups".equalsIgnoreCase(str4)) {
                                        if ("channels".equalsIgnoreCase(str4)) {
                                            i11 = 2;
                                        } else if ("stories".equalsIgnoreCase(str4)) {
                                            i11 = 3;
                                        } else if ("reactions".equalsIgnoreCase(str4)) {
                                            i11 = 4;
                                        }
                                    }
                                    i11 = 0;
                                }
                                NotificationsSettingsActivity notificationsSettingsActivity = new NotificationsSettingsActivity();
                                o();
                                notificationsSettingsActivity.F0(new org.telegram.ui.Components.pp0(this, notificationsSettingsActivity, i11, str9, 9));
                                return true;
                            }
                            t(new NotificationsSettingsActivity());
                            if ("accounts".equalsIgnoreCase(str4)) {
                                x("accountsAllRow");
                            }
                            if ("private-chats".equalsIgnoreCase(str4)) {
                                x("privateRow");
                            }
                            if ("groups".equalsIgnoreCase(str4)) {
                                x("groupRow");
                            }
                            if ("channels".equalsIgnoreCase(str4)) {
                                x("channelsRow");
                            }
                            if ("stories".equalsIgnoreCase(str4)) {
                                x("storiesRow");
                            }
                            if ("reactions".equalsIgnoreCase(str4)) {
                                x("reactionsRow");
                            }
                            if ("in-app-sounds".equalsIgnoreCase(str4)) {
                                x("inappSoundRow");
                            }
                            if ("in-app-vibrate".equalsIgnoreCase(str4)) {
                                x("inappVibrateRow");
                            }
                            if ("in-app-preview".equalsIgnoreCase(str4)) {
                                x("inappPreviewRow");
                            }
                            if ("in-chat-sounds".equalsIgnoreCase(str4)) {
                                x("inchatSoundRow");
                            }
                            if ("in-app-popup".equalsIgnoreCase(str4)) {
                                x("inappPriorityRow");
                            }
                            if ("show-badge-icon".equalsIgnoreCase(str4)) {
                                x("badgeNumberShowRow");
                            }
                            if ("include-muted-chats".equalsIgnoreCase(str4)) {
                                x("badgeNumberMutedRow");
                            }
                            if ("count-unread-messages".equalsIgnoreCase(str4)) {
                                x("badgeNumberMessagesRow");
                            }
                            if ("new-contacts".equalsIgnoreCase(str4)) {
                                x("contactJoinedRow");
                            }
                            if ("pinned-messages".equalsIgnoreCase(str4)) {
                                x("pinnedMessageRow");
                            }
                            if ("reset".equalsIgnoreCase(str4)) {
                                x("resetNotificationsRow");
                                return true;
                            }
                        } else if ("privacy".equalsIgnoreCase(str3)) {
                            if ("data-settings".equalsIgnoreCase(str4) && "delete-cloud-drafts".equalsIgnoreCase(str9)) {
                                t(new DataSettingsActivity());
                                x("clearDraftsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str9) && "blocked".equalsIgnoreCase(str4)) {
                                t(new vt0());
                                return true;
                            }
                            if (!TextUtils.isEmpty(str9) && "active-websites".equalsIgnoreCase(str4)) {
                                t(new SessionsActivity(1));
                                if (!"disconnect-all".equalsIgnoreCase(str9)) {
                                    return true;
                                }
                                x("terminateAllSessionsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str9) && "passcode".equalsIgnoreCase(str4)) {
                                o90 o90Var = new o90(this, str9, 3);
                                org.telegram.ui.ActionBar.f2 p02 = PasscodeActivity.p0();
                                t(p02);
                                if (p02 instanceof g) {
                                    ((g) p02).e0(o90Var);
                                    return true;
                                }
                                if (p02 instanceof PasscodeActivity) {
                                    ((PasscodeActivity) p02).x0(o90Var);
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str9) && "2sv".equalsIgnoreCase(str4)) {
                                    o();
                                    this.h = ConnectionsManager.getInstance(i13).sendRequest(new TL_account.getPassword(), new k50(4, this, str9), 10);
                                    return true;
                                }
                                if (TextUtils.isEmpty(str9) || !"passkey".equalsIgnoreCase(str4)) {
                                    str = "data-settings";
                                    str2 = "birthdayRow";
                                } else {
                                    str = "data-settings";
                                    str2 = "birthdayRow";
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        o();
                                        this.h = ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new d3.b(2), new l90(this, str9, 0));
                                        return true;
                                    }
                                }
                                if (!TextUtils.isEmpty(str9) && "auto-delete".equalsIgnoreCase(str4) && f().h() >= 0) {
                                    t(new p4());
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str9) && ("phone-number".equalsIgnoreCase(str4) || "last-seen".equalsIgnoreCase(str4) || "profile-photos".equalsIgnoreCase(str4) || "bio".equalsIgnoreCase(str4) || "gifts".equalsIgnoreCase(str4) || "birthday".equalsIgnoreCase(str4) || "saved-music".equalsIgnoreCase(str4) || "forwards".equalsIgnoreCase(str4) || "calls".equalsIgnoreCase(str4) || "voice".equalsIgnoreCase(str4) || "messages".equalsIgnoreCase(str4) || "invites".equalsIgnoreCase(str4))) {
                                    if ("phone-number".equalsIgnoreCase(str4)) {
                                        i10 = 6;
                                    } else {
                                        if (!"last-seen".equalsIgnoreCase(str4)) {
                                            if ("profile-photos".equalsIgnoreCase(str4)) {
                                                i10 = 4;
                                            } else if ("bio".equalsIgnoreCase(str4)) {
                                                i10 = 9;
                                            } else if ("gifts".equalsIgnoreCase(str4)) {
                                                i10 = 12;
                                            } else if ("birthday".equalsIgnoreCase(str4)) {
                                                i10 = 11;
                                            } else if ("saved-music".equalsIgnoreCase(str4)) {
                                                i10 = 14;
                                            } else if ("forwards".equalsIgnoreCase(str4)) {
                                                i10 = 5;
                                            } else if ("calls".equalsIgnoreCase(str4)) {
                                                i10 = "p2p".equalsIgnoreCase(str9) ? 3 : 2;
                                            } else if ("voice".equalsIgnoreCase(str4)) {
                                                i10 = 8;
                                            } else if ("messages".equalsIgnoreCase(str4)) {
                                                i10 = 10;
                                            } else if ("invites".equalsIgnoreCase(str4)) {
                                                i10 = 1;
                                            }
                                        }
                                        i10 = 0;
                                    }
                                    t(new PrivacyControlActivity(i10));
                                    if ("birthday".equalsIgnoreCase(str4) && "add".equalsIgnoreCase(str9)) {
                                        x("setBirthdayRow");
                                    }
                                    if ("always-share".equalsIgnoreCase(str9) || "always-share".equalsIgnoreCase(str6) || "always".equalsIgnoreCase(str9) || "always".equalsIgnoreCase(str6)) {
                                        x("everybodyRow");
                                    }
                                    if ("never-share".equalsIgnoreCase(str9) || "never-share".equalsIgnoreCase(str6) || "never".equalsIgnoreCase(str9) || "never".equalsIgnoreCase(str6)) {
                                        x("nobodyRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str4) && "show-icon".equalsIgnoreCase(str9)) {
                                        x("showGiftIconRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str4) && "accepted-types".equalsIgnoreCase(str9)) {
                                        x("giftTypesHeaderRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str4) && "set-price".equalsIgnoreCase(str9)) {
                                        x("priceRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str4) && "remove-fee".equalsIgnoreCase(str9)) {
                                        x("alwaysShareRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str4) && "hide-read-time".equalsIgnoreCase(str9)) {
                                        x("readRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str4)) {
                                        if ("set-public".equalsIgnoreCase(str9)) {
                                            x("photoForRestRow");
                                        }
                                        if ("update-public".equalsIgnoreCase(str9)) {
                                            x("photoForRestRow");
                                        }
                                        if ("remove-public".equalsIgnoreCase(str9)) {
                                            x("currentPhotoForRestRow");
                                            return true;
                                        }
                                    }
                                } else if (org.telegram.messenger.qp.s1(i13).Y3 || !"archive-and-mute".equalsIgnoreCase(str4)) {
                                    t(new PrivacySettingsActivity());
                                    if ("blocked".equalsIgnoreCase(str4)) {
                                        x("blockedRow");
                                    }
                                    if ("active-websites".equalsIgnoreCase(str4)) {
                                        x("webSessionsRow");
                                    }
                                    if ("passcode".equalsIgnoreCase(str4)) {
                                        x("passcodeRow");
                                    }
                                    if ("2sv".equalsIgnoreCase(str4)) {
                                        x("passwordRow");
                                    }
                                    if ("passkey".equalsIgnoreCase(str4)) {
                                        x("passkeysRow");
                                    }
                                    if ("auto-delete".equalsIgnoreCase(str4)) {
                                        x("autoDeleteMesages");
                                    }
                                    if ("login-email".equalsIgnoreCase(str4)) {
                                        x("emailLoginRow");
                                    }
                                    if ("phone-number".equalsIgnoreCase(str4)) {
                                        x("phoneNumberRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str4)) {
                                        x("lastSeenRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str4)) {
                                        x("profilePhotoRow");
                                    }
                                    if ("bio".equalsIgnoreCase(str4)) {
                                        x("bioRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str4)) {
                                        x("giftsRow");
                                    }
                                    if ("birthday".equalsIgnoreCase(str4)) {
                                        x(str2);
                                    }
                                    if ("saved-music".equalsIgnoreCase(str4)) {
                                        x("musicRow");
                                    }
                                    if ("forwards".equalsIgnoreCase(str4)) {
                                        x("forwardsRow");
                                    }
                                    if ("calls".equalsIgnoreCase(str4)) {
                                        x("callsRow");
                                    }
                                    if ("voice".equalsIgnoreCase(str4)) {
                                        x("voicesRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str4)) {
                                        x("noncontactsRow");
                                    }
                                    if ("invites".equalsIgnoreCase(str4)) {
                                        x("groupsRow");
                                    }
                                    if ("self-destruct".equalsIgnoreCase(str4)) {
                                        x("deleteAccountRow");
                                    }
                                    if ("archive-and-mute".equalsIgnoreCase(str4)) {
                                        x("newChatsRow");
                                    }
                                    if (str.equalsIgnoreCase(str4)) {
                                        if ("sync-contacts".equalsIgnoreCase(str9)) {
                                            x("contactsSyncRow");
                                        }
                                        if ("delete-synced".equalsIgnoreCase(str9)) {
                                            x("contactsDeleteRow");
                                        }
                                        if ("suggest-contacts".equalsIgnoreCase(str9)) {
                                            x("contactsSuggestRow");
                                        }
                                        if ("clear-payment-info".equalsIgnoreCase(str9)) {
                                            x("paymentsClearRow");
                                        }
                                        if ("link-previews".equalsIgnoreCase(str9)) {
                                            x("secretWebpageRow");
                                        }
                                        if ("map-provider".equalsIgnoreCase(str9)) {
                                            x("secretMapRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if ("data".equalsIgnoreCase(str3)) {
                            if ("storage".equalsIgnoreCase(str4)) {
                                "clear-cache".equalsIgnoreCase(str9);
                                t(new y6());
                                return true;
                            }
                            if ("usage".equalsIgnoreCase(str4)) {
                                nt ntVar = new nt();
                                t(ntVar);
                                if ("mobile".equalsIgnoreCase(str9)) {
                                    ntVar.b.d(1, 1);
                                }
                                if ("wifi".equalsIgnoreCase(str9)) {
                                    ntVar.b.d(2, 2);
                                }
                                if ("roaming".equalsIgnoreCase(str9)) {
                                    ntVar.b.d(3, 3);
                                }
                                if ("reset".equalsIgnoreCase(str9)) {
                                    ntVar.x0();
                                    return true;
                                }
                            } else {
                                if ("auto-download".equalsIgnoreCase(str4)) {
                                    if ("mobile".equalsIgnoreCase(str9) || "wifi".equalsIgnoreCase(str9) || "roaming".equalsIgnoreCase(str9)) {
                                        if (!"mobile".equalsIgnoreCase(str9)) {
                                            if ("wifi".equalsIgnoreCase(str9)) {
                                                i7 = 1;
                                            } else if ("roaming".equalsIgnoreCase(str9)) {
                                                i7 = 2;
                                            }
                                            t(new DataAutoDownloadActivity(i7));
                                            if ("enable".equalsIgnoreCase(str6)) {
                                                x("autoDownloadRow");
                                            }
                                            if ("usage".equalsIgnoreCase(str6)) {
                                                x("usageProgressRow");
                                            }
                                            if ("photos".equalsIgnoreCase(str6)) {
                                                x("photosRow");
                                            }
                                            if ("stories".equalsIgnoreCase(str6)) {
                                                x("storiesRow");
                                            }
                                            if ("videos".equalsIgnoreCase(str6)) {
                                                x("videosRow");
                                            }
                                            if ("files".equalsIgnoreCase(str6)) {
                                                x("filesRow");
                                                return true;
                                            }
                                        }
                                        i7 = 0;
                                        t(new DataAutoDownloadActivity(i7));
                                        if ("enable".equalsIgnoreCase(str6)) {
                                        }
                                        if ("usage".equalsIgnoreCase(str6)) {
                                        }
                                        if ("photos".equalsIgnoreCase(str6)) {
                                        }
                                        if ("stories".equalsIgnoreCase(str6)) {
                                        }
                                        if ("videos".equalsIgnoreCase(str6)) {
                                        }
                                        if ("files".equalsIgnoreCase(str6)) {
                                        }
                                    } else if ("reset".equalsIgnoreCase(str9)) {
                                        t(new DataSettingsActivity());
                                        x("resetDownloadRow");
                                        return true;
                                    }
                                }
                                if (!TextUtils.isEmpty(str6) && "save-to-photos".equalsIgnoreCase(str4)) {
                                    t(new SaveToGallerySettingsActivity(rf.b.f("groups".equalsIgnoreCase(str9) ? 2 : "channels".equalsIgnoreCase(str9) ? 4 : 1, TeXSymbolParser.TYPE_ATTR)));
                                    if ("max-video-size".equalsIgnoreCase(str6)) {
                                        x("maxVideoSizeRow");
                                    }
                                    if ("add-exception".equalsIgnoreCase(str6)) {
                                        x("addExceptionRow");
                                    }
                                    if ("delete-all".equalsIgnoreCase(str6)) {
                                        x("deleteAllExceptionsRow");
                                        return true;
                                    }
                                } else if (!TextUtils.isEmpty(str9) && "proxy".equalsIgnoreCase(str4)) {
                                    t(new ProxyListActivity());
                                    if ("use-proxy".equalsIgnoreCase(str9)) {
                                        x("useProxyRow");
                                    }
                                    if ("add-proxy".equalsIgnoreCase(str9)) {
                                        x("proxyAddRow");
                                        return true;
                                    }
                                } else {
                                    if ("pause-music".equalsIgnoreCase(str4)) {
                                        t(new ThemeActivity(0));
                                        x("pauseOnMediaRow");
                                        return true;
                                    }
                                    if ("pause-music-on-record".equalsIgnoreCase(str4)) {
                                        t(new ThemeActivity(0));
                                        x("pauseOnRecordRow");
                                        return true;
                                    }
                                    if ("raise-to-listen".equalsIgnoreCase(str4)) {
                                        t(new ThemeActivity(0));
                                        x("raiseToListenRow");
                                        return true;
                                    }
                                    if ("raise-to-speak".equalsIgnoreCase(str4)) {
                                        t(new ThemeActivity(0));
                                        x("raiseToSpeakRow");
                                        return true;
                                    }
                                    if ("show-18-contnet".equalsIgnoreCase(str4)) {
                                        t(new ThemeActivity(0));
                                        x("sensitiveContentRow");
                                        return true;
                                    }
                                    t(new DataSettingsActivity());
                                    if ("save-to-photos".equalsIgnoreCase(str4)) {
                                        if ("chats".equalsIgnoreCase(str9)) {
                                            x("saveToGalleryPeerRow");
                                        }
                                        if ("groups".equalsIgnoreCase(str9)) {
                                            x("saveToGalleryGroupsRow");
                                        }
                                        if ("channels".equalsIgnoreCase(str9)) {
                                            x("saveToGalleryChannelsRow");
                                        }
                                    }
                                    if ("use-less-data".equalsIgnoreCase(str4)) {
                                        x("useLessDataForCallsRow");
                                    }
                                    if ("proxy".equalsIgnoreCase(str4)) {
                                        x("proxyRow");
                                        return true;
                                    }
                                }
                            }
                        } else if ("appearance".equalsIgnoreCase(str3)) {
                            if ("themes".equalsIgnoreCase(str4) || "theme".equalsIgnoreCase(str4)) {
                                t(new ThemeActivity(3));
                                if ("create".equalsIgnoreCase(str9)) {
                                    x("createNewThemeRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str9) && ("wallpaper".equalsIgnoreCase(str4) || "wallpapers".equalsIgnoreCase(str4))) {
                                t(new WallpapersListActivity(0));
                                if ("set".equalsIgnoreCase(str9) || "choose-photo".equalsIgnoreCase(str9)) {
                                    x("uploadImageRow");
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str9) && ("your-color".equalsIgnoreCase(str4) || "color".equalsIgnoreCase(str4))) {
                                    t(new km0());
                                    return true;
                                }
                                if (TextUtils.isEmpty(str9) || !"stickers-and-emoji".equalsIgnoreCase(str4)) {
                                    t(new ThemeActivity(0));
                                    if ("wallpaper".equalsIgnoreCase(str4) || "wallpapers".equalsIgnoreCase(str4)) {
                                        x("backgroundRow");
                                    }
                                    if ("your-color".equalsIgnoreCase(str4) || "color".equalsIgnoreCase(str4)) {
                                        x("changeUserColor");
                                    }
                                    if ("auto-night-mode".equalsIgnoreCase(str4)) {
                                        x("nightThemeRow");
                                    }
                                    if ("text-size".equalsIgnoreCase(str4)) {
                                        x("textSizeRow");
                                    }
                                    if ("message-corners".equalsIgnoreCase(str4)) {
                                        x("bubbleRadiusRow");
                                    }
                                    if ("animations".equalsIgnoreCase(str4)) {
                                        x("liteModeRow");
                                    }
                                    if ("stickers-and-emoji".equalsIgnoreCase(str4)) {
                                        x("stickersRow");
                                    }
                                    if ("app-icon".equalsIgnoreCase(str4)) {
                                        x("appIconSelectorRow");
                                    }
                                    if ("tap-for-next-media".equalsIgnoreCase(str4)) {
                                        x("nextMediaTapRow");
                                        return true;
                                    }
                                    z10 = true;
                                } else {
                                    if (!TextUtils.isEmpty(str6) && "archived".equalsIgnoreCase(str9)) {
                                        t(new o(0));
                                        return true;
                                    }
                                    if (!"emoji".equalsIgnoreCase(str9) || TextUtils.isEmpty(str6) || "large".equalsIgnoreCase(str6) || "dynamic-order".equalsIgnoreCase(str6)) {
                                        t(new StickersActivity(0, null));
                                        if ("trending".equalsIgnoreCase(str9)) {
                                            x("featuredRow");
                                        }
                                        if ("archived".equalsIgnoreCase(str9)) {
                                            x("archivedRow");
                                        }
                                        if ("emoji".equalsIgnoreCase(str9) && "large".equalsIgnoreCase(str6)) {
                                            x("largeEmojiRow");
                                            return true;
                                        }
                                        if ("emoji".equalsIgnoreCase(str9) && "dynamic-order".equalsIgnoreCase(str6)) {
                                            x("dynamicPackOrder");
                                            return true;
                                        }
                                        if ("emoji".equalsIgnoreCase(str9)) {
                                            x("emojiPacksRow");
                                            return true;
                                        }
                                    } else {
                                        if (!TextUtils.isEmpty(str8) && "archived".equalsIgnoreCase(str6)) {
                                            t(new o(5));
                                            return true;
                                        }
                                        t(new StickersActivity(5, null));
                                        if ("suggest".equalsIgnoreCase(str6)) {
                                            x("suggestRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!"power-saving".equalsIgnoreCase(str3)) {
                                boolean equalsIgnoreCase2 = "stars".equalsIgnoreCase(str3);
                                LaunchActivity launchActivity = this.a;
                                if (equalsIgnoreCase2) {
                                    if ("top-up".equalsIgnoreCase(str4)) {
                                        new bi.uc(launchActivity, null).show();
                                        return true;
                                    }
                                    if ("stats".equalsIgnoreCase(str4)) {
                                        t(new bi.z(0, f().e()));
                                        return true;
                                    }
                                    if ("gift".equalsIgnoreCase(str4)) {
                                        bi.ea.w(i13).u();
                                        wg.f1.l1(1, org.telegram.messenger.v1.a(i13).b());
                                        return true;
                                    }
                                    if ("earn".equalsIgnoreCase(str4)) {
                                        t(new hi.q3(f().e()));
                                        return true;
                                    }
                                    t(new bi.dd());
                                    return true;
                                }
                                if ("premium".equalsIgnoreCase(str3)) {
                                    t(new PremiumPreviewFragment());
                                    return true;
                                }
                                if ("business".equalsIgnoreCase(str3)) {
                                    t(new PremiumPreviewFragment(1, "link"));
                                    if (!"do-not-hide-ads".equalsIgnoreCase(str4)) {
                                        return true;
                                    }
                                    x("showAdsRow");
                                    return true;
                                }
                                if ("ton".equalsIgnoreCase(str3)) {
                                    t(new gi.f());
                                    return true;
                                }
                                if ("send-gift".equalsIgnoreCase(str3)) {
                                    if ("self".equalsIgnoreCase(str4)) {
                                        new zh.g1(this.a, this.b, f().e(), null, null).show();
                                        return true;
                                    }
                                    wg.f1.l1(0, org.telegram.messenger.v1.a(i13).b());
                                    return true;
                                }
                                if ("ask-question".equalsIgnoreCase(str3) || "ask-a-question".equalsIgnoreCase(str3)) {
                                    org.telegram.ui.Components.u4.R(LaunchActivity.T(), null).show();
                                    return true;
                                }
                                if ("faq".equalsIgnoreCase(str3)) {
                                    vf.c.t(launchActivity, org.telegram.messenger.id.L0(2131744240));
                                    return true;
                                }
                                if ("features".equalsIgnoreCase(str3)) {
                                    vf.c.t(launchActivity, org.telegram.messenger.id.L0(2131744238));
                                    return true;
                                }
                                if ("privacy-policy".equalsIgnoreCase(str3)) {
                                    vf.c.t(launchActivity, org.telegram.messenger.id.L0(2131746781));
                                    return true;
                                }
                                t(new o31());
                                return true;
                            }
                            z90 z90Var = new z90();
                            t(z90Var);
                            if ("videos".equalsIgnoreCase(str4)) {
                                z90Var.a0(1024);
                            }
                            if ("gifs".equalsIgnoreCase(str4)) {
                                z90Var.a0(2048);
                            }
                            if ("stickers".equalsIgnoreCase(str4)) {
                                z90Var.a0(3);
                            }
                            if ("emoji".equalsIgnoreCase(str4)) {
                                z90Var.a0(28700);
                            }
                            if ("effects".equalsIgnoreCase(str4)) {
                                z90Var.a0(360928);
                            }
                            if ("call-animations".equalsIgnoreCase(str4)) {
                                z90Var.a0(512);
                            }
                            if ("particles".equalsIgnoreCase(str4)) {
                                z90Var.a0(131072);
                            }
                            if ("transitions".equalsIgnoreCase(str4)) {
                                int i14 = 0;
                                while (true) {
                                    ArrayList arrayList = z90Var.s;
                                    if (i14 >= arrayList.size()) {
                                        break;
                                    }
                                    if (((u90) arrayList.get(i14)).f == 1) {
                                        z90Var.b.e1(new l2.q(z90Var, i14, 12), 700, true);
                                        return true;
                                    }
                                    i14++;
                                }
                            }
                        }
                    }
                    return z10;
                }
                if (TextUtils.isEmpty(str5)) {
                    t(new ThemeActivity(0));
                    x("browserRow");
                    return true;
                }
                t(new org.telegram.ui.web.o1(null));
                if ("enable-browser".equalsIgnoreCase(str5)) {
                    x("enableRow");
                }
                if ("clear-cookies".equalsIgnoreCase(str5)) {
                    x("clearCookiesRow");
                }
                if ("clear-cache".equalsIgnoreCase(str5)) {
                    x("clearCacheRow");
                }
                if ("history".equalsIgnoreCase(str5)) {
                    x("historyRow");
                }
                if ("clear-history".equalsIgnoreCase(str5)) {
                    x("clearHistoryRow");
                }
                if ("never-open".equalsIgnoreCase(str5)) {
                    x("neverOpenRow");
                }
                if ("clear-list".equalsIgnoreCase(str5)) {
                    x("clearListRow");
                }
                if ("search".equalsIgnoreCase(str5)) {
                    x("searchRow");
                    return true;
                }
                return true;
            }
            if ("do-not-translate".equalsIgnoreCase(str4)) {
                t(new uy0());
                return true;
            }
            t(new LanguageSelectActivity());
            if ("show-button".equalsIgnoreCase(str4)) {
                x("manualTranslationPosition");
            }
            if ("translate-chats".equalsIgnoreCase(str4)) {
                x("autoTranslationPosition");
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: Exception -> 0x006c, TryCatch #0 {Exception -> 0x006c, blocks: (B:12:0x0034, B:15:0x0043, B:17:0x0063, B:22:0x0074, B:24:0x007a, B:27:0x0081, B:30:0x0089), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #0 {Exception -> 0x006c, blocks: (B:12:0x0034, B:15:0x0043, B:17:0x0063, B:22:0x0074, B:24:0x007a, B:27:0x0081, B:30:0x0089), top: B:11:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Uri uri) {
        Uri s5 = s(uri);
        List<String> pathSegments = s5.getPathSegments();
        if (pathSegments != null) {
            ArrayList arrayList = new ArrayList(pathSegments);
            String authority = s5.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                arrayList.add(0, authority);
            }
            if (arrayList.isEmpty() || "connect".equalsIgnoreCase((String) arrayList.get(0))) {
                try {
                    if ("2".equals(s5.getQueryParameter("v"))) {
                        String queryParameter = s5.getQueryParameter("id");
                        String queryParameter2 = s5.getQueryParameter("r");
                        String queryParameter3 = s5.getQueryParameter("trace_id");
                        String queryParameter4 = s5.getQueryParameter("e");
                        String queryParameter5 = s5.getQueryParameter("ret");
                        if (queryParameter5 != null) {
                            if (!p(queryParameter5)) {
                            }
                            String str = queryParameter5;
                            if (queryParameter2 == null) {
                                String string = new JSONObject(queryParameter2).getString("manifestUrl");
                                o();
                                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(this.b);
                                x10.m0(new bi.n8(this, x10, queryParameter, string, queryParameter2, queryParameter3, queryParameter4, str, 4));
                                return false;
                            }
                            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter3)) {
                                o();
                                v(queryParameter, 0, queryParameter3, str);
                                return true;
                            }
                        }
                        queryParameter5 = "back";
                        String str2 = queryParameter5;
                        if (queryParameter2 == null) {
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void o() {
        if (this.f || this.g) {
            return;
        }
        vf.b bVar = this.c;
        if (bVar == null) {
            if (this.e == null) {
                this.e = new org.telegram.ui.ActionBar.u1(3, this.a, null);
            }
            this.e.setOnCancelListener(new vf(this, 3));
            this.e.r(300L);
        } else {
            bVar.b = new n90(this, 0);
            bVar.d();
        }
        this.f = true;
    }

    public final void t(org.telegram.ui.ActionBar.f2 f2Var) {
        u(f2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        LaunchActivity launchActivity = this.a;
        launchActivity.u0(f2Var, z9, false);
        if (org.telegram.messenger.g0.Q1()) {
            launchActivity.o0.X(true, true);
            launchActivity.q0.X(true, true);
        }
    }

    public final void v(String str, int i7, String str2, String str3) {
        if (!this.j) {
            LaunchActivity launchActivity = this.a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.b).sendRequestTyped(tonconnectgetpending, new d3.b(1), new o60(this, str, str2, str3, i7));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed() || "none".equals(str)) {
            return;
        }
        if (!"back".equals(str)) {
            vf.c.v(launchActivity, str, false);
        } else if (this.d) {
            launchActivity.moveTaskToBack(true);
        }
    }

    public final void x(String str) {
        org.telegram.messenger.g0.k3(this.a.M(), str);
    }
}
