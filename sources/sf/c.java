package sf;

import ag.e;
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
import k2.p1;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.f2;
import org.telegram.ui.h0;
import org.telegram.ui.i4;
import org.telegram.ui.l3;
import org.telegram.ui.y2;
import p4.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c {
    public static tf.b a;
    public static q b;
    public static bg.a c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        boolean z11 = false;
        for (String str2 : str.split("&", -1)) {
            int indexOf = str2.indexOf(61);
            String substring = indexOf < 0 ? str2 : str2.substring(0, indexOf);
            int i3 = 0;
            while (i3 < 4) {
                String decode = Uri.decode(substring);
                if (TextUtils.equals(decode, substring)) {
                    break;
                }
                i3++;
                substring = decode;
            }
            while (substring.startsWith("?")) {
                substring = substring.substring(1);
            }
            String lowerCase = substring.toLowerCase();
            if (lowerCase.startsWith("tgwebauth") || lowerCase.equals("autologin_token")) {
                z11 = true;
            } else {
                if (!z10) {
                    sb2.append('&');
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (z11) {
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
                int i3 = 0;
                while (i3 < decode.length()) {
                    int codePointAt = decode.codePointAt(i3);
                    int charCount = Character.charCount(codePointAt);
                    if (Character.isISOControl(codePointAt) || Character.getType(codePointAt) == 16) {
                        sb2.append(Uri.encode(decode.substring(i3, i3 + charCount)));
                    } else {
                        sb2.append((CharSequence) decode, i3, i3 + charCount);
                    }
                    i3 += charCount;
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
            Matcher matcher = LaunchActivity.F1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static String d(String str, boolean z10) {
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
            sb2.append(z10 ? a(parse.getHost()) : parse.getHost());
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

    public static tf.b e() {
        q qVar = b;
        tf.b bVar = null;
        if (qVar == null) {
            a = null;
        } else if (a == null) {
            nb.a aVar = new nb.a(23);
            e eVar = (e) qVar.a;
            ag.b bVar2 = new ag.b(aVar);
            try {
                if (((ag.c) eVar).H0(bVar2)) {
                    bVar = new tf.b(bVar2, (ComponentName) qVar.b);
                }
            } catch (RemoteException unused) {
            }
            a = bVar;
            new WeakReference(bVar);
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
            for (int i3 = 0; i3 < queryIntentActivities.size(); i3++) {
                try {
                    strArr[i3] = queryIntentActivities.get(i3).activityInfo.packageName;
                    if (r2.a) {
                        a8.b("default browser name = " + strArr[i3]);
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

    public static boolean g(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        Typeface typeface = g0.a;
        String K0 = uri == null ? null : g0.K0(uri.toString(), false);
        String lowerCase = K0 != null ? K0.toLowerCase() : "";
        if (!hp.s1(h10.t0).f4.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.F1.matcher(lowerCase);
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
                        if (!z10) {
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
                        if (!z10) {
                            String lowerCase3 = path2.substring(1).toLowerCase();
                            if (lowerCase3.equals("iv") || lowerCase3.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    }
                } else if ((!"telegram.org".equals(lowerCase) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z10 || (!lowerCase.endsWith("telegram.org") && !lowerCase.endsWith("telegra.ph") && !lowerCase.endsWith("telesco.pe")))) {
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
            return TextUtils.equals(g0.K0(str, false), hp.s1(h10.t0).V2);
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean i(String str, boolean z10, boolean z11) {
        if (z10) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z11 ? "" : "?");
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

    public static boolean l(Context context, String str, boolean z10, boolean z11, b bVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (g0.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) g0.W(context);
        } else {
            launchActivity = LaunchActivity.K1;
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
        intent.putExtra("force_not_internal_apps", z10);
        intent.putExtra("force_request", z11);
        launchActivity.f0(intent, bVar);
        return true;
    }

    public static boolean m(Context context, String str, boolean z10) {
        Intent intent;
        if (str != null) {
            try {
                if (!j(str) && !g(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String w10 = w(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getEncodedPath()) ? "/" : parse.getEncodedPath());
                    Uri parse2 = Uri.parse(w10);
                    boolean z11 = w10.startsWith("intent://") || (parse2.getScheme() != null && parse2.getScheme().equalsIgnoreCase("intent"));
                    if (!z11 || z10) {
                        if (z11) {
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
                        if (!z11 && Build.VERSION.SDK_INT >= 30) {
                            intent.addCategory("android.intent.category.BROWSABLE");
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.addFlags(TLObject.FLAG_28);
                            intent.addFlags(1024);
                        } else if (!z11 && !f(context, w10)) {
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

    public static boolean n(Context context, String str, boolean z10, String str2) {
        Intent intent;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                boolean z11 = parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent");
                if (!z11 || z10) {
                    if (z11) {
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
        b3 O;
        a3 a3Var;
        l3[] l3VarArr;
        l3 l3Var;
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<a3> tabs = O.getTabs();
                for (int i3 = 0; i3 < tabs.size(); i3++) {
                    a3Var = tabs.get(i3);
                    i4 i4Var = a3Var.J;
                    if (i4Var != null && !i4Var.e0.isEmpty()) {
                        Object h = p1.h(1, a3Var.J.e0);
                        if (h instanceof y2) {
                            org.telegram.ui.web.t0 t0Var = ((y2) h).b;
                            if (t0Var == null && (l3VarArr = a3Var.J.v0) != null && (l3Var = l3VarArr[0]) != null) {
                                t0Var = l3Var.getWebView();
                            }
                            if (t0Var != null) {
                                if (TextUtils.equals(b3.p(t0Var.canGoBack() ? t0Var.getUrl() : t0Var.getOpenURL()), b3.p(str))) {
                                    O.e(a3Var);
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
            a3Var = null;
            if (a3Var != null) {
                return;
            }
        }
        d2 T = LaunchActivity.T();
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

    public static void p(Activity activity, String str, boolean z10) {
        if (activity == null || str == null) {
            return;
        }
        q(activity, Uri.parse(str), z10, true);
    }

    public static void q(Context context, Uri uri, boolean z10, boolean z11) {
        s(context, uri, z10, z11, false, null, null, false, true, false, false);
    }

    public static void r(Context context, Uri uri, boolean z10, boolean z11, b bVar) {
        s(context, uri, z10, z11, false, bVar, null, false, true, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:4|(4:6|(9:274|(3:291|(1:293)(2:294|(6:(1:298)|299|(1:301)|302|(1:304)(1:306)|305))|(5:279|(3:281|(1:283)|284)|(3:286|(1:288)|289)|290|11))|276|(0)|279|(0)|(0)|290|11)|10|11)(1:307)|12|(10:192|193|260|(1:16)(1:191)|(5:162|163|(1:165)(1:189)|166|(5:178|179|180|181|(2:183|184)(2:185|186)))|18|19|20|(1:22)|(22:29|(2:155|156)|33|34|35|36|37|38|39|40|(1:42)|(3:(2:45|(1:47))|48|(3:62|63|(2:65|66)(22:67|68|69|70|71|72|73|(1:75)|76|(1:78)(1:95)|79|80|81|82|83|84|85|86|87|88|89|91)))|152|(3:129|130|(1:(2:133|(2:135|(7:137|(1:145)|103|104|105|(1:107)|(1:(2:114|(4:116|(2:120|(1:122))|123|124)(1:125))(2:126|127))(2:111|112))))))|101|(6:128|104|105|(0)|(1:109)|(0)(0))|103|104|105|(0)|(0)|(0)(0))(2:26|27))|14|(0)(0)|(0)|18|19|20|(0)|(1:24)|29|(1:31)|155|156|33|34|35|36|37|38|39|40|(0)|(0)|152|(0)|101|(0)|103|104|105|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x047a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0477, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f5, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04e3 A[Catch: Exception -> 0x04ca, TRY_ENTER, TryCatch #2 {Exception -> 0x04ca, blocks: (B:130:0x0489, B:133:0x048f, B:135:0x049d, B:137:0x04a3, B:139:0x04a9, B:141:0x04b3, B:143:0x04bd, B:104:0x04db, B:107:0x04e3, B:109:0x04ed, B:111:0x04f1, B:114:0x04ff, B:116:0x0509, B:118:0x050f, B:120:0x0519, B:122:0x052e, B:123:0x0532, B:126:0x053a, B:101:0x04ce), top: B:129:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ed A[Catch: Exception -> 0x04ca, TryCatch #2 {Exception -> 0x04ca, blocks: (B:130:0x0489, B:133:0x048f, B:135:0x049d, B:137:0x04a3, B:139:0x04a9, B:141:0x04b3, B:143:0x04bd, B:104:0x04db, B:107:0x04e3, B:109:0x04ed, B:111:0x04f1, B:114:0x04ff, B:116:0x0509, B:118:0x050f, B:120:0x0519, B:122:0x052e, B:123:0x0532, B:126:0x053a, B:101:0x04ce), top: B:129:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04ff A[Catch: Exception -> 0x04ca, TryCatch #2 {Exception -> 0x04ca, blocks: (B:130:0x0489, B:133:0x048f, B:135:0x049d, B:137:0x04a3, B:139:0x04a9, B:141:0x04b3, B:143:0x04bd, B:104:0x04db, B:107:0x04e3, B:109:0x04ed, B:111:0x04f1, B:114:0x04ff, B:116:0x0509, B:118:0x050f, B:120:0x0519, B:122:0x052e, B:123:0x0532, B:126:0x053a, B:101:0x04ce), top: B:129:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x053a A[Catch: Exception -> 0x04ca, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ca, blocks: (B:130:0x0489, B:133:0x048f, B:135:0x049d, B:137:0x04a3, B:139:0x04a9, B:141:0x04b3, B:143:0x04bd, B:104:0x04db, B:107:0x04e3, B:109:0x04ed, B:111:0x04f1, B:114:0x04ff, B:116:0x0509, B:118:0x050f, B:120:0x0519, B:122:0x052e, B:123:0x0532, B:126:0x053a, B:101:0x04ce), top: B:129:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c8 A[Catch: Exception -> 0x02d1, TryCatch #8 {Exception -> 0x02d1, blocks: (B:20:0x02c2, B:22:0x02c8, B:24:0x02d8, B:29:0x02e2, B:31:0x02e8, B:33:0x02f8, B:37:0x0305, B:40:0x030f, B:42:0x0317, B:45:0x033e, B:48:0x0350, B:51:0x035c, B:53:0x0364, B:58:0x0373, B:60:0x037d, B:62:0x0387, B:65:0x0397, B:67:0x03a6, B:71:0x03c6, B:81:0x03f5, B:83:0x040e, B:87:0x0421, B:160:0x02f5, B:156:0x02ee), top: B:19:0x02c2, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0317 A[Catch: Exception -> 0x02d1, TryCatch #8 {Exception -> 0x02d1, blocks: (B:20:0x02c2, B:22:0x02c8, B:24:0x02d8, B:29:0x02e2, B:31:0x02e8, B:33:0x02f8, B:37:0x0305, B:40:0x030f, B:42:0x0317, B:45:0x033e, B:48:0x0350, B:51:0x035c, B:53:0x0364, B:58:0x0373, B:60:0x037d, B:62:0x0387, B:65:0x0397, B:67:0x03a6, B:71:0x03c6, B:81:0x03f5, B:83:0x040e, B:87:0x0421, B:160:0x02f5, B:156:0x02ee), top: B:19:0x02c2, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Uri uri, boolean z10, boolean z11, boolean z12, b bVar, String str, boolean z13, boolean z14, boolean z15, boolean z16) {
        Uri uri2;
        String str2;
        String str3;
        boolean z17;
        boolean z18;
        String str4;
        boolean z19;
        b bVar2;
        boolean z20;
        LaunchActivity launchActivity;
        String lowerCase;
        String K0;
        PendingIntent broadcast;
        tf.b e10;
        String sb2;
        Uri build;
        if (context == null || uri == null) {
            return;
        }
        if (z16) {
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
        int i3 = h10.t0;
        boolean[] zArr = {false};
        boolean g7 = g(uri2, false, zArr);
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
                z18 = false;
                z17 = false;
            } else {
                z17 = z10;
                z18 = z11;
            }
            if (z18) {
                try {
                    Typeface typeface = g0.a;
                    String K02 = uri2 == null ? null : g0.K0(uri2.toString(), false);
                    if (h10.i(h10.t0).f() != null && (i(K02, true, false) || ("telegram.org".equalsIgnoreCase(K02) && (uri2.toString().toLowerCase().contains("telegram.org/faq") || uri2.toString().toLowerCase().contains("telegram.org/privacy") || uri2.toString().toLowerCase().contains("telegram.org/blog"))))) {
                        s1[] s1VarArr = {new s1(3, context, null)};
                        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                        getwebpagepreview.message = uri2.toString();
                        str4 = str3;
                        z19 = z17;
                        int i10 = 7;
                        bVar2 = bVar;
                        try {
                            int sendRequest = ConnectionsManager.getInstance(h10.t0).sendRequest(getwebpagepreview, new h0(bVar2, s1VarArr, i3, uri2, context, z19));
                            if (bVar2 != null) {
                                bVar2.d();
                                return;
                            } else {
                                g0.i3(new f2(s1VarArr, sendRequest, i10), 1000L);
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
            z19 = z17;
            lowerCase = uri2.getScheme() != null ? uri2.getScheme().toLowerCase() : "";
            if (lowerCase == null && lowerCase.contains(".")) {
                return;
            }
            if (!"http".equals(lowerCase) || "https".equals(lowerCase)) {
                uri2 = uri2.normalizeScheme();
            }
            boolean z21 = false;
            K0 = g0.K0(uri2.toString().toLowerCase(), false);
            if (hp.s1(org.telegram.messenger.c.a(i3).a).e4.contains(K0)) {
                uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(hp.s1(org.telegram.messenger.c.a(h10.t0).a).g4, "UTF-8")).build();
            }
            if (z19) {
                if (uri2 == null) {
                    if (!hp.s1(i3).N2(uri2.toString())) {
                    }
                }
                if (hp.s1(i3).O2() && !g7 && !lowerCase.equals("tel") && !j(uri2.toString()) && (zArr[0] || !m(context, uri2.toString(), false) || !f(context, uri2.toString()))) {
                    if (hp.s1(i3).f4.contains(K0)) {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.addFlags(TLObject.FLAG_28);
                        t0.b.startActivity(intent);
                        return;
                    }
                    Intent intent2 = new Intent(t0.b, (Class<?>) ShareBroadcastReceiver.class);
                    intent2.setAction("android.intent.action.SEND");
                    boolean z22 = false;
                    try {
                        broadcast = PendingIntent.getBroadcast(t0.b, 0, new Intent(t0.b, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                        e10 = e();
                    } catch (Exception e11) {
                        e = e11;
                        z21 = z22;
                        a8.g(e, true);
                        if (z14) {
                        }
                        if (!j(uri2.toString())) {
                        }
                        z20 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!g7) {
                        }
                        if (!z20) {
                        }
                    }
                    try {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        if (e10 != null) {
                            intent3.setPackage(((ComponentName) e10.b).getPackageName());
                        }
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", e10 == null ? null : (ag.b) e10.a);
                        intent3.putExtras(bundle);
                        String M0 = bd.M0(2131751762, null);
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", M0);
                        bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                        arrayList.add(bundle2);
                        z22 = false;
                        intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", k6.x0(null, k6.S8, false));
                        intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                        String M02 = bd.M0(2131745469, null);
                        z21 = false;
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
                        z21 = false;
                        a8.g(e, true);
                        if (z14) {
                        }
                        if (!j(uri2.toString())) {
                        }
                        z20 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!g7) {
                        }
                        if (!z20) {
                        }
                    }
                }
            }
            z21 = false;
            if (z14) {
                try {
                    if (BubbleActivity.b0 == null) {
                        if (uri2 != null) {
                            if (hp.s1(i3).N2(uri2.toString())) {
                                if (TextUtils.isEmpty(str4)) {
                                    if (uri2.getScheme() != null && !"https".equals(uri2.getScheme()) && !"http".equals(uri2.getScheme()) && !"tonsite".equals(uri2.getScheme())) {
                                    }
                                    z20 = true;
                                    if (uri2.getScheme() != null) {
                                        uri2.getScheme().equalsIgnoreCase("intent");
                                    }
                                    if (!g7 && (launchActivity = LaunchActivity.K1) != null) {
                                        l(launchActivity, uri2.toString(), z12, z15, bVar2);
                                        return;
                                    }
                                    if (!z20) {
                                        n(context, uri2.toString(), z13, str4);
                                        return;
                                    }
                                    if (m(context, uri2.toString(), z13)) {
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
                z20 = z21;
                if (uri2.getScheme() != null) {
                }
                if (!g7) {
                }
                if (!z20) {
                }
            }
            z20 = true;
            if (uri2.getScheme() != null) {
            }
            if (!g7) {
            }
            if (!z20) {
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (z18) {
        }
        bVar2 = bVar;
        str4 = str3;
        z19 = z17;
        if (uri2.getScheme() != null) {
        }
        if (lowerCase == null) {
        }
        if (!"http".equals(lowerCase)) {
        }
        uri2 = uri2.normalizeScheme();
        boolean z212 = false;
        K0 = g0.K0(uri2.toString().toLowerCase(), false);
        if (hp.s1(org.telegram.messenger.c.a(i3).a).e4.contains(K0)) {
        }
        if (z19) {
        }
        z212 = false;
        if (z14) {
        }
        if (!j(uri2.toString())) {
        }
        z20 = true;
        if (uri2.getScheme() != null) {
        }
        if (!g7) {
        }
        if (!z20) {
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

    public static void v(Context context, String str, boolean z10) {
        if (str == null) {
            return;
        }
        s(context, Uri.parse(str), false, true, false, null, null, false, false, false, z10);
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
