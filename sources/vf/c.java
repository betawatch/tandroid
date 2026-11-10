package vf;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg.g;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
import org.telegram.ui.web.u0;
import org.telegram.ui.x2;
import sa.d;
import sg.i0;
import v6.e;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class c {
    public static i0 a;
    public static e b;
    public static ag.a c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z9 = true;
        boolean z10 = false;
        for (String str2 : str.split("&", -1)) {
            int indexOf = str2.indexOf(61);
            String substring = indexOf < 0 ? str2 : str2.substring(0, indexOf);
            int i7 = 0;
            while (i7 < 4) {
                String decode = Uri.decode(substring);
                if (TextUtils.equals(decode, substring)) {
                    break;
                }
                i7++;
                substring = decode;
            }
            while (substring.startsWith("?")) {
                substring = substring.substring(1);
            }
            String lowerCase = substring.toLowerCase();
            if (lowerCase.startsWith("tgwebauth") || lowerCase.equals("autologin_token")) {
                z10 = true;
            } else {
                if (!z9) {
                    sb2.append('&');
                }
                sb2.append(str2);
                z9 = false;
            }
        }
        if (z10) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        boolean startsWith;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (str != null) {
            String[] split = str.split("\\.");
            if (split.length > 0) {
                startsWith = split[split.length - 1].startsWith("xn--");
                if (startsWith) {
                    return str;
                }
                try {
                    return IDN.toUnicode(str, 1);
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return str;
                }
            }
        }
        startsWith = true;
        if (startsWith) {
        }
    }

    public static String b(String str) {
        if (str.indexOf(37) >= 0) {
            String decode = Uri.decode(str);
            if (decode.indexOf(65533) < 0) {
                StringBuilder sb2 = new StringBuilder(decode.length());
                int i7 = 0;
                while (i7 < decode.length()) {
                    int codePointAt = decode.codePointAt(i7);
                    int charCount = Character.charCount(codePointAt);
                    if (Character.isISOControl(codePointAt) || Character.getType(codePointAt) == 16) {
                        sb2.append(Uri.encode(decode.substring(i7, i7 + charCount)));
                    } else {
                        sb2.append((CharSequence) decode, i7, i7 + charCount);
                    }
                    i7 += charCount;
                }
                return sb2.toString();
            }
        }
        return str;
    }

    public static String c(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("@")) {
                return str.substring(1);
            }
            if (str.startsWith("t.me/")) {
                return str.substring(5);
            }
            if (str.startsWith("http://t.me/")) {
                return str.substring(12);
            }
            if (str.startsWith("https://t.me/")) {
                return str.substring(13);
            }
            Matcher matcher = LaunchActivity.C1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static String d(String str, boolean z9) {
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse.getHost() == null) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            if (parse.getScheme() != null) {
                sb2.append(parse.getScheme());
                sb2.append("://");
            }
            if (parse.getEncodedUserInfo() != null) {
                sb2.append(parse.getEncodedUserInfo());
                sb2.append("@");
            }
            sb2.append(z9 ? a(parse.getHost()) : parse.getHost());
            if (parse.getPort() != -1) {
                sb2.append(":");
                sb2.append(parse.getPort());
            }
            if (parse.getEncodedPath() != null) {
                sb2.append(b(parse.getEncodedPath()));
            }
            if (parse.getEncodedQuery() != null) {
                sb2.append("?");
                sb2.append(b(parse.getEncodedQuery()));
            }
            if (parse.getEncodedFragment() != null) {
                sb2.append("#");
                sb2.append(b(parse.getEncodedFragment()));
            }
            return sb2.toString();
        } catch (Exception e10) {
            a8.g(e10, false);
            return str;
        }
    }

    public static i0 e() {
        e eVar = b;
        i0 i0Var = null;
        if (eVar == null) {
            a = null;
        } else if (a == null) {
            d dVar = new d(26);
            zf.e eVar2 = (zf.e) eVar.a;
            zf.b bVar = new zf.b(dVar);
            try {
                if (((zf.c) eVar2).h1(bVar)) {
                    i0Var = new i0(14, bVar, (ComponentName) eVar.b);
                }
            } catch (RemoteException unused) {
            }
            a = i0Var;
            new WeakReference(i0Var);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(2:6|7)|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:58|(4:61|(2:79|80)|78|59)|82)|42|(3:44|(3:47|48|45)|49)|(1:56)(2:54|55))|87|23|24|25|(0)(0)|42|(0)|(2:52|56)(1:57)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(Context context, String str) {
        String[] strArr;
        List<ResolveInfo> queryIntentActivities;
        if (str == null) {
            return false;
        }
        List<ResolveInfo> list = null;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
        } catch (Exception unused) {
        }
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            strArr = new String[queryIntentActivities.size()];
            for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                try {
                    strArr[i7] = queryIntentActivities.get(i7).activityInfo.packageName;
                    if (r2.a) {
                        a8.b("default browser name = " + strArr[i7]);
                    }
                } catch (Exception unused2) {
                }
            }
            list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr == null) {
                int i10 = 0;
                while (i10 < list.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= strArr.length) {
                            break;
                        }
                        if (strArr[i11].equals(list.get(i10).activityInfo.packageName)) {
                            list.remove(i10);
                            i10--;
                            break;
                        }
                        i11++;
                    }
                    i10++;
                }
            } else {
                int i12 = 0;
                while (i12 < list.size()) {
                    String lowerCase = list.get(i12).activityInfo.packageName.toLowerCase();
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
                        list.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            if (r2.a) {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    a8.b("device has " + list.get(i13).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (strArr == null) {
        }
        if (r2.a) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean g(Uri uri, boolean z9, boolean[] zArr) {
        String str;
        String str2;
        Typeface typeface = g0.a;
        String K0 = uri == null ? null : g0.K0(uri.toString(), false);
        String lowerCase = K0 != null ? K0.toLowerCase() : "";
        if (!qp.s1(p10.s0).e4.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.C1.matcher(lowerCase);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder("https://t.me/");
                sb2.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str = "";
                } else {
                    str = "/" + uri.getPath();
                }
                sb2.append(str);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str2 = "";
                } else {
                    str2 = "?" + uri.getQuery();
                }
                sb2.append(str2);
                uri = Uri.parse(sb2.toString());
                String host = uri.getHost();
                lowerCase = host != null ? host.toLowerCase() : "";
            }
            if ("ton".equals(uri.getScheme())) {
                try {
                    List<ResolveInfo> queryIntentActivities = t0.b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                    if (queryIntentActivities != null) {
                        if (queryIntentActivities.size() >= 1) {
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
            if (!"tg".equals(uri.getScheme())) {
                if ("telegram.dog".equals(lowerCase)) {
                    String path = uri.getPath();
                    if (path != null && path.length() > 1) {
                        if (!z9) {
                            String lowerCase2 = path.substring(1).toLowerCase();
                            if (lowerCase2.startsWith("blog") || lowerCase2.equals("iv") || lowerCase2.startsWith("faq") || lowerCase2.equals("apps") || lowerCase2.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                    return false;
                                }
                            }
                        }
                    }
                } else if ("telegram.me".equals(lowerCase) || "t.me".equals(lowerCase)) {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z9) {
                            String lowerCase3 = path2.substring(1).toLowerCase();
                            if (lowerCase3.equals("iv") || lowerCase3.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    }
                } else if ((!"telegram.org".equals(lowerCase) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z9 || (!lowerCase.endsWith("telegram.org") && !lowerCase.endsWith("telegra.ph") && !lowerCase.endsWith("telesco.pe")))) {
                }
            }
            return true;
        }
        if (zArr != null) {
            zArr[0] = true;
            return false;
        }
        return false;
    }

    public static boolean h(String str) {
        try {
            return TextUtils.equals(g0.K0(str, false), qp.s1(p10.s0).U2);
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean i(String str, boolean z9, boolean z10) {
        if (z9) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z10 ? "" : "?");
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean j(String str) {
        String K0 = g0.K0(str, true);
        if (K0 != null && (K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean k(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String K0 = g0.K0(str, true);
        if (K0 == null || !(K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            matches = f.matcher(parse.getScheme()).matches();
        } else {
            matches = f.matcher(K0).matches();
        }
        return !matches;
    }

    public static boolean l(Context context, String str, boolean z9, boolean z10, b bVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (g0.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) g0.W(context);
        } else {
            launchActivity = LaunchActivity.G1;
            if (launchActivity == null) {
                return false;
            }
        }
        if (launchActivity == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("force_not_internal_apps", z9);
        intent.putExtra("force_request", z10);
        launchActivity.f0(intent, bVar);
        return true;
    }

    public static boolean m(Context context, String str, boolean z9) {
        Intent intent;
        if (str != null) {
            try {
                if (!j(str) && !g(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String w10 = w(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getEncodedPath()) ? "/" : parse.getEncodedPath());
                    Uri parse2 = Uri.parse(w10);
                    boolean z10 = w10.startsWith("intent://") || (parse2.getScheme() != null && parse2.getScheme().equalsIgnoreCase("intent"));
                    if (!z10 || z9) {
                        if (z10) {
                            intent = Intent.parseUri(parse2.toString(), 1);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            intent.setComponent(null);
                            Intent selector = intent.getSelector();
                            if (selector != null) {
                                selector.addCategory("android.intent.category.BROWSABLE");
                                selector.setComponent(null);
                            }
                        } else {
                            intent = new Intent("android.intent.action.VIEW", parse2);
                        }
                        if (!z10 && Build.VERSION.SDK_INT >= 30) {
                            intent.addCategory("android.intent.category.BROWSABLE");
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.addFlags(TLObject.FLAG_28);
                            intent.addFlags(1024);
                        } else if (!z10 && !f(context, w10)) {
                        }
                        context.startActivity(intent);
                        return true;
                    }
                }
            } catch (ActivityNotFoundException e10) {
                a8.g(e10, false);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        return false;
    }

    public static boolean n(Context context, String str, boolean z9, String str2) {
        Intent intent;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                boolean z10 = parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent");
                if (!z10 || z9) {
                    if (z10) {
                        intent = Intent.parseUri(parse.toString(), 1);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.setComponent(null);
                        Intent selector = intent.getSelector();
                        if (selector != null) {
                            selector.addCategory("android.intent.category.BROWSABLE");
                            selector.setComponent(null);
                        }
                    } else {
                        intent = new Intent("android.intent.action.VIEW", parse);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    intent.putExtra("create_new_tab", true);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(intent);
                    return true;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return false;
            }
        }
        return false;
    }

    public static void o(String str) {
        e3 O;
        d3 d3Var;
        k3[] k3VarArr;
        k3 k3Var;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<d3> tabs = O.getTabs();
                for (int i7 = 0; i7 < tabs.size(); i7++) {
                    d3Var = tabs.get(i7);
                    g4 g4Var = d3Var.J;
                    if (g4Var != null && !g4Var.d0.isEmpty()) {
                        Object i10 = g.i(1, d3Var.J.d0);
                        if (i10 instanceof x2) {
                            u0 u0Var = ((x2) i10).b;
                            if (u0Var == null && (k3VarArr = d3Var.J.u0) != null && (k3Var = k3VarArr[0]) != null) {
                                u0Var = k3Var.getWebView();
                            }
                            if (u0Var != null) {
                                if (TextUtils.equals(e3.p(u0Var.canGoBack() ? u0Var.getUrl() : u0Var.getOpenURL()), e3.p(str))) {
                                    O.e(d3Var);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            d3Var = null;
            if (d3Var != null) {
                return;
            }
        }
        f2 T = LaunchActivity.T();
        if (T != null && T.getArticleViewer() != null) {
            T.getArticleViewer().L(null, null, null, str);
            return;
        }
        if (T != null && (T.getParentLayout() instanceof ActionBarLayout)) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        if (T == null) {
            return;
        }
        T.createArticleViewer(false).L(null, null, null, str);
    }

    public static void p(Activity activity, String str, boolean z9) {
        if (activity == null || str == null) {
            return;
        }
        q(activity, Uri.parse(str), z9, true);
    }

    public static void q(Context context, Uri uri, boolean z9, boolean z10) {
        s(context, uri, z9, z10, false, null, null, false, true, false, false);
    }

    public static void r(Context context, Uri uri, boolean z9, boolean z10, b bVar) {
        s(context, uri, z9, z10, false, bVar, null, false, true, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:4|(4:6|(9:274|(3:291|(1:293)(2:294|(6:(1:298)|299|(1:301)|302|(1:304)(1:306)|305))|(5:279|(3:281|(1:283)|284)|(3:286|(1:288)|289)|290|11))|276|(0)|279|(0)|(0)|290|11)|10|11)(1:307)|12|(10:192|193|260|(1:16)(1:191)|(5:162|163|(1:165)(1:189)|166|(5:178|179|180|181|(2:183|184)(2:185|186)))|18|19|20|(1:22)|(22:29|(2:155|156)|33|34|35|36|37|38|39|40|(1:42)|(3:(2:45|(1:47))|48|(3:62|63|(2:65|66)(22:67|68|69|70|71|72|73|(1:75)|76|(1:78)(1:95)|79|80|81|82|83|84|85|86|87|88|89|91)))|152|(3:129|130|(1:(2:133|(2:135|(7:137|(1:145)|103|104|105|(1:107)|(1:(2:114|(4:116|(2:120|(1:122))|123|124)(1:125))(2:126|127))(2:111|112))))))|101|(6:128|104|105|(0)|(1:109)|(0)(0))|103|104|105|(0)|(0)|(0)(0))(2:26|27))|14|(0)(0)|(0)|18|19|20|(0)|(1:24)|29|(1:31)|155|156|33|34|35|36|37|38|39|40|(0)|(0)|152|(0)|101|(0)|103|104|105|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x047b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0478, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f6, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04e4 A[Catch: Exception -> 0x04cb, TRY_ENTER, TryCatch #2 {Exception -> 0x04cb, blocks: (B:130:0x048a, B:133:0x0490, B:135:0x049e, B:137:0x04a4, B:139:0x04aa, B:141:0x04b4, B:143:0x04be, B:104:0x04dc, B:107:0x04e4, B:109:0x04ee, B:111:0x04f2, B:114:0x0500, B:116:0x050a, B:118:0x0510, B:120:0x051a, B:122:0x052f, B:123:0x0533, B:126:0x053b, B:101:0x04cf), top: B:129:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ee A[Catch: Exception -> 0x04cb, TryCatch #2 {Exception -> 0x04cb, blocks: (B:130:0x048a, B:133:0x0490, B:135:0x049e, B:137:0x04a4, B:139:0x04aa, B:141:0x04b4, B:143:0x04be, B:104:0x04dc, B:107:0x04e4, B:109:0x04ee, B:111:0x04f2, B:114:0x0500, B:116:0x050a, B:118:0x0510, B:120:0x051a, B:122:0x052f, B:123:0x0533, B:126:0x053b, B:101:0x04cf), top: B:129:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0500 A[Catch: Exception -> 0x04cb, TryCatch #2 {Exception -> 0x04cb, blocks: (B:130:0x048a, B:133:0x0490, B:135:0x049e, B:137:0x04a4, B:139:0x04aa, B:141:0x04b4, B:143:0x04be, B:104:0x04dc, B:107:0x04e4, B:109:0x04ee, B:111:0x04f2, B:114:0x0500, B:116:0x050a, B:118:0x0510, B:120:0x051a, B:122:0x052f, B:123:0x0533, B:126:0x053b, B:101:0x04cf), top: B:129:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x053b A[Catch: Exception -> 0x04cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x04cb, blocks: (B:130:0x048a, B:133:0x0490, B:135:0x049e, B:137:0x04a4, B:139:0x04aa, B:141:0x04b4, B:143:0x04be, B:104:0x04dc, B:107:0x04e4, B:109:0x04ee, B:111:0x04f2, B:114:0x0500, B:116:0x050a, B:118:0x0510, B:120:0x051a, B:122:0x052f, B:123:0x0533, B:126:0x053b, B:101:0x04cf), top: B:129:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x048a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c9 A[Catch: Exception -> 0x02d2, TryCatch #8 {Exception -> 0x02d2, blocks: (B:20:0x02c3, B:22:0x02c9, B:24:0x02d9, B:29:0x02e3, B:31:0x02e9, B:33:0x02f9, B:37:0x0306, B:40:0x0310, B:42:0x0318, B:45:0x033f, B:48:0x0351, B:51:0x035d, B:53:0x0365, B:58:0x0374, B:60:0x037e, B:62:0x0388, B:65:0x0398, B:67:0x03a7, B:71:0x03c7, B:81:0x03f6, B:83:0x040f, B:87:0x0422, B:160:0x02f6, B:156:0x02ef), top: B:19:0x02c3, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0318 A[Catch: Exception -> 0x02d2, TryCatch #8 {Exception -> 0x02d2, blocks: (B:20:0x02c3, B:22:0x02c9, B:24:0x02d9, B:29:0x02e3, B:31:0x02e9, B:33:0x02f9, B:37:0x0306, B:40:0x0310, B:42:0x0318, B:45:0x033f, B:48:0x0351, B:51:0x035d, B:53:0x0365, B:58:0x0374, B:60:0x037e, B:62:0x0388, B:65:0x0398, B:67:0x03a7, B:71:0x03c7, B:81:0x03f6, B:83:0x040f, B:87:0x0422, B:160:0x02f6, B:156:0x02ef), top: B:19:0x02c3, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Uri uri, boolean z9, boolean z10, boolean z11, b bVar, String str, boolean z12, boolean z13, boolean z14, boolean z15) {
        Uri uri2;
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        String str4;
        boolean z18;
        b bVar2;
        boolean z19;
        LaunchActivity launchActivity;
        String lowerCase;
        String K0;
        PendingIntent broadcast;
        i0 e10;
        String sb2;
        Uri build;
        if (context == null || uri == null) {
            return;
        }
        if (z15) {
            uri2 = uri;
        } else {
            if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
                String A = A(uri.getEncodedQuery());
                String encodedFragment = uri.getEncodedFragment();
                if (encodedFragment != null) {
                    int indexOf = encodedFragment.indexOf(63);
                    if (indexOf < 0) {
                        sb2 = A(encodedFragment);
                    } else {
                        String substring = encodedFragment.substring(0, indexOf);
                        String substring2 = encodedFragment.substring(indexOf + 1);
                        String A2 = A(substring);
                        String A3 = A(substring2);
                        if (A2 != null || A3 != null) {
                            if (A3 != null) {
                                substring2 = A3;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            if (A2 != null) {
                                substring = A2;
                            }
                            sb3.append(substring);
                            sb3.append(substring2.isEmpty() ? "" : "?".concat(substring2));
                            sb2 = sb3.toString();
                        }
                    }
                    if (A == null || sb2 != null) {
                        Uri.Builder buildUpon = uri.buildUpon();
                        if (A != null) {
                            if (A.isEmpty()) {
                                A = null;
                            }
                            buildUpon.encodedQuery(A);
                        }
                        if (sb2 != null) {
                            if (sb2.isEmpty()) {
                                sb2 = null;
                            }
                            buildUpon.encodedFragment(sb2);
                        }
                        build = buildUpon.build();
                        uri2 = build;
                    }
                }
                sb2 = null;
                if (A == null) {
                }
                Uri.Builder buildUpon2 = uri.buildUpon();
                if (A != null) {
                }
                if (sb2 != null) {
                }
                build = buildUpon2.build();
                uri2 = build;
            }
            build = uri;
            uri2 = build;
        }
        int i7 = p10.s0;
        boolean[] zArr = {false};
        boolean g10 = g(uri2, false, zArr);
        if (str != null) {
            switch (str) {
                case "brave-browser":
                case "brave":
                    str2 = "com.brave.browser";
                    str3 = str2;
                    break;
                case "google-chrome":
                case "chrome":
                    str2 = "com.android.chrome";
                    str3 = str2;
                    break;
                case "microsoft-edge":
                case "edge":
                    str2 = "com.microsoft.emmx";
                    str3 = str2;
                    break;
                case "tor-browser":
                case "tor":
                    str2 = "org.torproject.torbrowser";
                    str3 = str2;
                    break;
                case "duckduckgo-browser":
                case "duckduckgo":
                    str2 = "com.duckduckgo.mobile.android";
                    str3 = str2;
                    break;
                case "firefox":
                case "mozilla-firefox":
                    str2 = "org.mozilla.firefox";
                    str3 = str2;
                    break;
                case "samsung-browser":
                case "samsung":
                    str2 = "com.sec.android.app.sbrowser";
                    str3 = str2;
                    break;
                case "kiwi-browser":
                case "kiwi":
                    str2 = "com.kiwibrowser.browser";
                    str3 = str2;
                    break;
                case "opera-mini":
                    str2 = "com.opera.mini.native";
                    str3 = str2;
                    break;
                case "uc":
                case "uc-browser":
                    str2 = "com.UCMobile.intl";
                    str3 = str2;
                    break;
                case "opera":
                    str2 = "com.opera.browser";
                    str3 = str2;
                    break;
                case "vivaldi":
                case "vivaldi-browser":
                    str2 = "com.vivaldi.browser";
                    str3 = str2;
                    break;
            }
            if (str3 == null) {
                z17 = false;
                z16 = false;
            } else {
                z16 = z9;
                z17 = z10;
            }
            if (z17) {
                try {
                    Typeface typeface = g0.a;
                    String K02 = uri2 == null ? null : g0.K0(uri2.toString(), false);
                    if (p10.i(p10.s0).f() != null && (i(K02, true, false) || ("telegram.org".equalsIgnoreCase(K02) && (uri2.toString().toLowerCase().contains("telegram.org/faq") || uri2.toString().toLowerCase().contains("telegram.org/privacy") || uri2.toString().toLowerCase().contains("telegram.org/blog"))))) {
                        u1[] u1VarArr = {new u1(3, context, null)};
                        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                        getwebpagepreview.message = uri2.toString();
                        str4 = str3;
                        z18 = z16;
                        int i10 = 9;
                        bVar2 = bVar;
                        try {
                            int sendRequest = ConnectionsManager.getInstance(p10.s0).sendRequest(getwebpagepreview, new org.telegram.ui.g0(bVar2, u1VarArr, i7, uri2, context, z18));
                            if (bVar2 != null) {
                                bVar2.d();
                                return;
                            } else {
                                g0.i3(new org.telegram.ui.Wallet.f2(u1VarArr, sendRequest, i10), 1000L);
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            bVar2 = bVar;
            str4 = str3;
            z18 = z16;
            lowerCase = uri2.getScheme() != null ? uri2.getScheme().toLowerCase() : "";
            if (lowerCase == null && lowerCase.contains(".")) {
                return;
            }
            if (!"http".equals(lowerCase) || "https".equals(lowerCase)) {
                uri2 = uri2.normalizeScheme();
            }
            boolean z20 = false;
            K0 = g0.K0(uri2.toString().toLowerCase(), false);
            if (qp.s1(org.telegram.messenger.c.a(i7).a).d4.contains(K0)) {
                uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(qp.s1(org.telegram.messenger.c.a(p10.s0).a).f4, "UTF-8")).build();
            }
            if (z18) {
                if (uri2 == null) {
                    if (!qp.s1(i7).N2(uri2.toString())) {
                    }
                }
                if (qp.s1(i7).O2() && !g10 && !lowerCase.equals("tel") && !j(uri2.toString()) && (zArr[0] || !m(context, uri2.toString(), false) || !f(context, uri2.toString()))) {
                    if (qp.s1(i7).e4.contains(K0)) {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.addFlags(TLObject.FLAG_28);
                        t0.b.startActivity(intent);
                        return;
                    }
                    Intent intent2 = new Intent(t0.b, (Class<?>) ShareBroadcastReceiver.class);
                    intent2.setAction("android.intent.action.SEND");
                    boolean z21 = false;
                    try {
                        broadcast = PendingIntent.getBroadcast(t0.b, 0, new Intent(t0.b, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                        e10 = e();
                    } catch (Exception e11) {
                        e = e11;
                        z20 = z21;
                        a8.g(e, true);
                        if (z13) {
                        }
                        if (!j(uri2.toString())) {
                        }
                        z19 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!g10) {
                        }
                        if (!z19) {
                        }
                    }
                    try {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        if (e10 != null) {
                            intent3.setPackage(((ComponentName) e10.c).getPackageName());
                        }
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", e10 == null ? null : (zf.b) e10.b);
                        intent3.putExtras(bundle);
                        String M0 = id.M0(2131751762, null);
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", M0);
                        bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                        arrayList.add(bundle2);
                        z21 = false;
                        intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", m6.x0(null, m6.S8, false));
                        intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                        String M02 = id.M0(2131745459, null);
                        z20 = false;
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(t0.b, 0, intent2, 33554432);
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                        bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                        bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", M02);
                        bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                        intent3.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                        intent3.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                        intent3.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                        intent3.addFlags(TLObject.FLAG_28);
                        intent3.setData(uri2);
                        context.startActivity(intent3, null);
                        return;
                    } catch (Exception e12) {
                        e = e12;
                        z20 = false;
                        a8.g(e, true);
                        if (z13) {
                        }
                        if (!j(uri2.toString())) {
                        }
                        z19 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!g10) {
                        }
                        if (!z19) {
                        }
                    }
                }
            }
            z20 = false;
            if (z13) {
                try {
                    if (BubbleActivity.a0 == null) {
                        if (uri2 != null) {
                            if (qp.s1(i7).N2(uri2.toString())) {
                                if (TextUtils.isEmpty(str4)) {
                                    if (uri2.getScheme() != null && !"https".equals(uri2.getScheme()) && !"http".equals(uri2.getScheme()) && !"tonsite".equals(uri2.getScheme())) {
                                    }
                                    z19 = true;
                                    if (uri2.getScheme() != null) {
                                        uri2.getScheme().equalsIgnoreCase("intent");
                                    }
                                    if (!g10 && (launchActivity = LaunchActivity.G1) != null) {
                                        l(launchActivity, uri2.toString(), z11, z14, bVar2);
                                        return;
                                    }
                                    if (!z19) {
                                        n(context, uri2.toString(), z12, str4);
                                        return;
                                    }
                                    if (m(context, uri2.toString(), z12)) {
                                        return;
                                    }
                                    if (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent")) {
                                        String stringExtra = Intent.parseUri(uri2.toString(), 1).getStringExtra("browser_fallback_url");
                                        if (!TextUtils.isEmpty(stringExtra)) {
                                            uri2 = Uri.parse(stringExtra);
                                        }
                                    }
                                    o(uri2.toString());
                                    return;
                                }
                            }
                        }
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            }
            if (!j(uri2.toString())) {
                z19 = z20;
                if (uri2.getScheme() != null) {
                }
                if (!g10) {
                }
                if (!z19) {
                }
            }
            z19 = true;
            if (uri2.getScheme() != null) {
            }
            if (!g10) {
            }
            if (!z19) {
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (z17) {
        }
        bVar2 = bVar;
        str4 = str3;
        z18 = z16;
        if (uri2.getScheme() != null) {
        }
        if (lowerCase == null) {
        }
        if (!"http".equals(lowerCase)) {
        }
        uri2 = uri2.normalizeScheme();
        boolean z202 = false;
        K0 = g0.K0(uri2.toString().toLowerCase(), false);
        if (qp.s1(org.telegram.messenger.c.a(i7).a).d4.contains(K0)) {
        }
        if (z18) {
        }
        z202 = false;
        if (z13) {
        }
        if (!j(uri2.toString())) {
        }
        z19 = true;
        if (uri2.getScheme() != null) {
        }
        if (!g10) {
        }
        if (!z19) {
        }
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), true, true);
    }

    public static void u(LaunchActivity launchActivity, Uri uri) {
        q(launchActivity, uri, true, true);
    }

    public static void v(Context context, String str, boolean z9) {
        if (str == null) {
            return;
        }
        s(context, Uri.parse(str), false, true, false, null, null, false, false, false, z9);
    }

    public static String w(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        }
        if (str2 == null) {
            if (uri.getEncodedUserInfo() != null) {
                sb2.append(uri.getEncodedUserInfo());
                sb2.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
            sb2.append("@");
        }
        if (str3 != null) {
            sb2.append(str3);
        } else if (uri.getHost() != null) {
            sb2.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb2.append(":");
            sb2.append(uri.getPort());
        }
        if (str4 != null) {
            sb2.append(str4);
        } else if (uri.getEncodedPath() != null) {
            sb2.append(uri.getEncodedPath());
        }
        if (uri.getEncodedQuery() != null) {
            sb2.append("?");
            sb2.append(uri.getEncodedQuery());
        }
        if (uri.getEncodedFragment() != null) {
            sb2.append("#");
            sb2.append(uri.getEncodedFragment());
        }
        return sb2.toString();
    }

    public static String x(Uri uri, String str) {
        return w(uri, null, null, str, null);
    }

    public static void y(Activity activity) {
        if (c == null) {
            return;
        }
        WeakReference weakReference = e;
        if ((weakReference == null ? null : (Activity) weakReference.get()) == activity) {
            e.clear();
        }
        try {
            activity.unbindService(c);
        } catch (Exception unused) {
        }
        b = null;
        a = null;
    }

    public static boolean z(String str) {
        return i(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
