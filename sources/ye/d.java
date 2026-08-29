package ye;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import ff.e;
import j7.l1;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d3;
import org.telegram.ui.j0;
import org.telegram.ui.m4;
import org.telegram.ui.q3;
import org.telegram.ui.sy;
import org.telegram.ui.web.w0;
import sf.p1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class d {
    public static ze.b a;
    public static ze.b b;
    public static gf.a c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        boolean startsWith;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
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
                    FileLog.e(e11);
                    return str;
                }
            }
        }
        startsWith = true;
        if (startsWith) {
        }
    }

    public static String b(String str) {
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
            Matcher matcher = LaunchActivity.x1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static ze.b c() {
        ze.b bVar = b;
        ze.b bVar2 = null;
        if (bVar == null) {
            a = null;
        } else if (a == null) {
            x9.d dVar = new x9.d(26);
            e eVar = (e) bVar.a;
            ff.b bVar3 = new ff.b(dVar);
            try {
                if (((ff.c) eVar).E0(bVar3)) {
                    bVar2 = new ze.b(bVar3, (ComponentName) bVar.b);
                }
            } catch (RemoteException unused) {
            }
            a = bVar2;
            new WeakReference(bVar2);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:57|(6:60|(3:83|(2:79|80)(1:82)|81)|77|(0)(0)|81|58)|84)|42|(3:44|(3:47|48|45)|49)|(1:55)(1:54))|89|23|24|25|(0)(0)|42|(0)|(2:52|55)(1:56)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[Catch: Exception -> 0x00e5, TryCatch #2 {Exception -> 0x00e5, blocks: (B:25:0x005a, B:28:0x006e, B:31:0x0075, B:33:0x0078, B:37:0x008a, B:35:0x0090, B:39:0x0093, B:42:0x00f3, B:45:0x00f8, B:47:0x00fe, B:58:0x0096, B:60:0x009c, B:62:0x00ac, B:64:0x00b4, B:66:0x00bc, B:68:0x00c4, B:70:0x00cc, B:72:0x00d4, B:74:0x00dc, B:79:0x00ec, B:81:0x00f1), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Context context, String str) {
        String[] strArr;
        boolean z10;
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
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                try {
                    strArr[i10] = queryIntentActivities.get(i10).activityInfo.packageName;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("default browser name = " + strArr[i10]);
                    }
                } catch (Exception unused2) {
                }
            }
            list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr == null) {
                int i11 = 0;
                while (i11 < list.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= strArr.length) {
                            break;
                        }
                        if (strArr[i12].equals(list.get(i11).activityInfo.packageName)) {
                            list.remove(i11);
                            i11--;
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
            } else {
                int i13 = 0;
                while (i13 < list.size()) {
                    String lowerCase = list.get(i13).activityInfo.packageName.toLowerCase();
                    if (lowerCase == null || (!lowerCase.contains("browser") && !lowerCase.contains("chrome") && !lowerCase.contains("firefox") && !"com.microsoft.emmx".equals(lowerCase) && !"com.opera.mini.native".equals(lowerCase) && !"com.duckduckgo.mobile.android".equals(lowerCase) && !"com.UCMobile.intl".equals(lowerCase))) {
                        z10 = false;
                        if (!z10) {
                            list.remove(i13);
                            i13--;
                        }
                        i13++;
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    i13++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i14 = 0; i14 < list.size(); i14++) {
                    FileLog.d("device has " + list.get(i14).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (strArr == null) {
        }
        if (BuildVars.LOGS_ENABLED) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean e() {
        sy sheetFragment;
        o2 U = LaunchActivity.U();
        if (U == null || !(U.getParentLayout() instanceof ActionBarLayout) || (sheetFragment = ((ActionBarLayout) U.getParentLayout()).getSheetFragment()) == null || sheetFragment.getArticleViewer() == null) {
            return (U == null || U.getArticleViewer() == null) ? false : true;
        }
        return true;
    }

    public static boolean f(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String lowerCase = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (!MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.x1.matcher(lowerCase);
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
                    List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
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

    public static boolean g(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static boolean h(String str, boolean z10, boolean z11) {
        if (z10) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z11 ? "" : "?");
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean i(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean j(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority == null || !(hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            matches = f.matcher(parse.getScheme()).matches();
        } else {
            matches = f.matcher(hostAuthority).matches();
        }
        return !matches;
    }

    public static boolean k(Context context, String str, boolean z10, boolean z11, c cVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.C1;
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
        launchActivity.e0(intent, cVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: Exception -> 0x0025, ActivityNotFoundException -> 0x0028, TryCatch #2 {ActivityNotFoundException -> 0x0028, Exception -> 0x0025, blocks: (B:6:0x0005, B:8:0x000b, B:11:0x0018, B:14:0x002f, B:16:0x0035, B:17:0x0042, B:20:0x0053, B:22:0x0064, B:24:0x006a, B:32:0x0081, B:34:0x0093, B:36:0x0099, B:37:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x004f, B:47:0x003e, B:48:0x002b), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[Catch: Exception -> 0x0025, ActivityNotFoundException -> 0x0028, TryCatch #2 {ActivityNotFoundException -> 0x0028, Exception -> 0x0025, blocks: (B:6:0x0005, B:8:0x000b, B:11:0x0018, B:14:0x002f, B:16:0x0035, B:17:0x0042, B:20:0x0053, B:22:0x0064, B:24:0x006a, B:32:0x0081, B:34:0x0093, B:36:0x0099, B:37:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x004f, B:47:0x003e, B:48:0x002b), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(Context context, String str, boolean z10) {
        boolean z11;
        if (str != null) {
            try {
                if (!i(str) && !f(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String v = v(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath());
                    Uri parse2 = Uri.parse(v);
                    if (!v.startsWith("intent://") && (parse2.getScheme() == null || !parse2.getScheme().equalsIgnoreCase("intent"))) {
                        z11 = false;
                        if (z11 || z10) {
                            Intent parseUri = !z11 ? Intent.parseUri(parse2.toString(), 1) : new Intent("android.intent.action.VIEW", parse2);
                            if (z11 && Build.VERSION.SDK_INT >= 30) {
                                parseUri.addCategory("android.intent.category.BROWSABLE");
                                parseUri.addCategory("android.intent.category.DEFAULT");
                                parseUri.addFlags(TLObject.FLAG_28);
                                parseUri.addFlags(1024);
                            } else if (!z11 && !d(context, v)) {
                            }
                            context.startActivity(parseUri);
                            return true;
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                    if (!z11) {
                    }
                    if (z11) {
                    }
                    if (!z11) {
                    }
                    context.startActivity(parseUri);
                    return true;
                }
            } catch (ActivityNotFoundException e10) {
                FileLog.e((Throwable) e10, false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return false;
    }

    public static boolean m(Context context, String str, boolean z10, String str2) {
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                boolean z11 = parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent");
                if (!z11 || z10) {
                    Intent parseUri = z11 ? Intent.parseUri(parse.toString(), 1) : new Intent("android.intent.action.VIEW", parse);
                    if (!TextUtils.isEmpty(str2)) {
                        parseUri.setPackage(str2);
                    }
                    parseUri.putExtra("create_new_tab", true);
                    parseUri.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(parseUri);
                    return true;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        return false;
    }

    public static void n(String str) {
        m3 P;
        l3 l3Var;
        q3[] q3VarArr;
        q3 q3Var;
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<l3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    l3Var = tabs.get(i10);
                    m4 m4Var = l3Var.H;
                    if (m4Var != null && !m4Var.Z.isEmpty()) {
                        Object i11 = l1.i(1, l3Var.H.Z);
                        if (i11 instanceof d3) {
                            w0 w0Var = ((d3) i11).b;
                            if (w0Var == null && (q3VarArr = l3Var.H.q0) != null && (q3Var = q3VarArr[0]) != null) {
                                w0Var = q3Var.getWebView();
                            }
                            if (w0Var != null) {
                                if (TextUtils.equals(m3.p(w0Var.canGoBack() ? w0Var.getUrl() : w0Var.getOpenURL()), m3.p(str))) {
                                    P.e(l3Var);
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
            l3Var = null;
            if (l3Var != null) {
                return;
            }
        }
        o2 U = LaunchActivity.U();
        if (U != null && U.getArticleViewer() != null) {
            U.getArticleViewer().N(null, null, null, str);
            return;
        }
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout)) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        if (U == null) {
            return;
        }
        U.createArticleViewer(false).N(null, null, null, str);
    }

    public static void o(Activity activity, String str, boolean z10) {
        if (activity == null || str == null) {
            return;
        }
        p(activity, Uri.parse(str), z10, true);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11) {
        r(context, uri, z10, z11, false, null, null, false, true, false);
    }

    public static void q(Context context, Uri uri, boolean z10, boolean z11, c cVar) {
        r(context, uri, z10, z11, false, cVar, null, false, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:4|(30:182|183|250|(1:8)(1:181)|(3:138|139|(10:141|(11:143|144|145|(2:147|(2:149|(2:151|(1:153))))|176|172|11|12|(2:134|135)(1:14)|15|(19:21|(1:23)|127|128|129|26|27|(1:29)|(3:(2:32|(1:34))|35|(3:50|51|(2:53|54)(9:55|(1:57)|58|(1:60)(1:119)|61|62|63|64|66)))|120|(3:98|99|(2:(1:102)|114))|70|(5:97|73|74|(1:76)|(1:(2:83|(4:85|(2:89|(1:91))|92|93)(1:94))(2:95|96))(2:80|81))|72|73|74|(0)|(1:78)|(0)(0))(1:19))(1:178)|154|155|156|157|158|159|160|(2:162|163)(5:164|165|166|167|168)))|10|11|12|(0)(0)|15|(1:17)|21|(0)|127|128|129|26|27|(0)|(0)|120|(0)|70|(0)|72|73|74|(0)|(0)|(0)(0))|6|(0)(0)|(0)|10|11|12|(0)(0)|15|(0)|21|(0)|127|128|129|26|27|(0)|(0)|120|(0)|70|(0)|72|73|74|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0412, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r21).isWebBrowserOpenInApp(r3.toString()) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x041e, code lost:
    
        if (android.text.TextUtils.isEmpty(r20) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0424, code lost:
    
        if (r3.getScheme() != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x042e, code lost:
    
        if ("https".equals(r3.getScheme()) == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0438, code lost:
    
        if ("http".equals(r3.getScheme()) == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0445, code lost:
    
        if ("tonsite".equals(r3.getScheme()) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0418, code lost:
    
        if (e() != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0271, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0272, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03f8, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0269, code lost:
    
        if ("https".equals(r2) != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0275, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0255 A[Catch: Exception -> 0x024a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x024a, blocks: (B:135:0x0240, B:17:0x0255, B:23:0x0265), top: B:134:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0265 A[Catch: Exception -> 0x024a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x024a, blocks: (B:135:0x0240, B:17:0x0255, B:23:0x0265), top: B:134:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0293 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:27:0x0277, B:29:0x0293, B:32:0x02ba, B:35:0x02cc, B:37:0x02d2, B:40:0x02de, B:42:0x02e7, B:44:0x02f1, B:46:0x02f5, B:48:0x0300, B:50:0x030a, B:53:0x031a, B:55:0x0329, B:57:0x0354, B:58:0x035f, B:61:0x036e, B:119:0x036a), top: B:26:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x045c A[Catch: Exception -> 0x04bd, TRY_ENTER, TryCatch #0 {Exception -> 0x04bd, blocks: (B:99:0x0400, B:102:0x0406, B:104:0x041a, B:106:0x0420, B:108:0x0426, B:110:0x0430, B:112:0x043a, B:73:0x0454, B:76:0x045c, B:78:0x0466, B:80:0x046a, B:83:0x0478, B:85:0x0482, B:87:0x0488, B:89:0x0492, B:91:0x04a7, B:92:0x04ab, B:95:0x04b3, B:114:0x0414, B:70:0x0447), top: B:98:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0466 A[Catch: Exception -> 0x04bd, TryCatch #0 {Exception -> 0x04bd, blocks: (B:99:0x0400, B:102:0x0406, B:104:0x041a, B:106:0x0420, B:108:0x0426, B:110:0x0430, B:112:0x043a, B:73:0x0454, B:76:0x045c, B:78:0x0466, B:80:0x046a, B:83:0x0478, B:85:0x0482, B:87:0x0488, B:89:0x0492, B:91:0x04a7, B:92:0x04ab, B:95:0x04b3, B:114:0x0414, B:70:0x0447), top: B:98:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0478 A[Catch: Exception -> 0x04bd, TryCatch #0 {Exception -> 0x04bd, blocks: (B:99:0x0400, B:102:0x0406, B:104:0x041a, B:106:0x0420, B:108:0x0426, B:110:0x0430, B:112:0x043a, B:73:0x0454, B:76:0x045c, B:78:0x0466, B:80:0x046a, B:83:0x0478, B:85:0x0482, B:87:0x0488, B:89:0x0492, B:91:0x04a7, B:92:0x04ab, B:95:0x04b3, B:114:0x0414, B:70:0x0447), top: B:98:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b3 A[Catch: Exception -> 0x04bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x04bd, blocks: (B:99:0x0400, B:102:0x0406, B:104:0x041a, B:106:0x0420, B:108:0x0426, B:110:0x0430, B:112:0x043a, B:73:0x0454, B:76:0x045c, B:78:0x0466, B:80:0x046a, B:83:0x0478, B:85:0x0482, B:87:0x0488, B:89:0x0492, B:91:0x04a7, B:92:0x04ab, B:95:0x04b3, B:114:0x0414, B:70:0x0447), top: B:98:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0400 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context, Uri uri, boolean z10, boolean z11, boolean z12, c cVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        String hostAuthority;
        char c3;
        c cVar2;
        String str4;
        int i10;
        Uri uri2;
        boolean z18;
        LaunchActivity launchActivity;
        String lowerCase;
        String str5;
        String hostAuthority2;
        if (context == null || uri == null) {
            return;
        }
        int i11 = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean f9 = f(uri, false, zArr);
        int i12 = 3;
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
                z16 = z10;
                z17 = z11;
            }
            if (z17) {
                try {
                    hostAuthority = AndroidUtilities.getHostAuthority(uri);
                } catch (Exception unused) {
                }
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    if (h(hostAuthority, true, false)) {
                        c3 = 0;
                    } else {
                        c3 = 0;
                        try {
                            if ("telegram.org".equalsIgnoreCase(hostAuthority)) {
                                if (!uri.toString().toLowerCase().contains("telegram.org/faq")) {
                                    if (!uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                                        if (uri.toString().toLowerCase().contains("telegram.org/blog")) {
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        cVar2 = cVar;
                        str4 = str3;
                        i10 = i11;
                        if (uri.getScheme() != null) {
                            try {
                                lowerCase = uri.getScheme().toLowerCase();
                            } catch (Exception e10) {
                                e = e10;
                                uri2 = uri;
                                FileLog.e(e);
                                if (z14) {
                                }
                                if (!i(uri2.toString())) {
                                }
                                z18 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!f9) {
                                }
                                if (z18) {
                                }
                            }
                        } else {
                            lowerCase = "";
                        }
                        str5 = lowerCase;
                        if (str5 == null && str5.contains(".")) {
                            return;
                        }
                        if (!"http".equals(str5)) {
                        }
                        uri2 = uri.normalizeScheme();
                        hostAuthority2 = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
                        if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority2)) {
                            uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                        }
                        if (z16) {
                            if (uri2 == null) {
                                if (!MessagesController.getInstance(i10).isWebBrowserOpenInApp(uri2.toString())) {
                                }
                            }
                            if (!e() && MessagesController.getInstance(i10).isWebBrowserUseCustomTabs() && !f9 && !str5.equals("tel") && !i(uri2.toString()) && (zArr[c3] || !l(context, uri2.toString(), false) || !d(context, uri2.toString()))) {
                                if (MessagesController.getInstance(i10).authDomains.contains(hostAuthority2)) {
                                    Intent intent = new Intent("android.intent.action.VIEW", uri2);
                                    intent.addFlags(TLObject.FLAG_28);
                                    ApplicationLoader.applicationContext.startActivity(intent);
                                    return;
                                }
                                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent2.setAction("android.intent.action.SEND");
                                PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                ze.b c6 = c();
                                Intent intent3 = new Intent("android.intent.action.VIEW");
                                if (c6 != null) {
                                    intent3.setPackage(((ComponentName) c6.b).getPackageName());
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBinder("android.support.customtabs.extra.SESSION", c6 == null ? null : (ff.b) c6.a);
                                intent3.putExtras(bundle);
                                String string = LocaleController.getString(R.string.CopyLink);
                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                arrayList.add(bundle2);
                                intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", g6.w0(null, g6.S8, false));
                                intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                String string2 = LocaleController.getString(R.string.ShareFile);
                                try {
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 33554432);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                    bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                    bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", string2);
                                    bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                    intent3.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                    intent3.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                    intent3.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                    intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                    intent3.addFlags(TLObject.FLAG_28);
                                    intent3.setData(uri2);
                                    context.startActivity(intent3, null);
                                    return;
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    if (z14) {
                                    }
                                    if (!i(uri2.toString())) {
                                    }
                                    z18 = true;
                                    if (uri2.getScheme() != null) {
                                    }
                                    if (!f9) {
                                    }
                                    if (z18) {
                                    }
                                }
                            }
                        }
                        if (z14) {
                            try {
                                if (BubbleActivity.W == null) {
                                    if (uri2 != null) {
                                    }
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                return;
                            }
                        }
                        if (!i(uri2.toString())) {
                            z18 = false;
                            if (uri2.getScheme() != null) {
                                uri2.getScheme().equalsIgnoreCase("intent");
                            }
                            if (!f9 && (launchActivity = LaunchActivity.C1) != null) {
                                k(launchActivity, uri2.toString(), z12, z15, cVar2);
                                return;
                            }
                            if (z18) {
                                m(context, uri2.toString(), z13, str4);
                                return;
                            }
                            if (l(context, uri2.toString(), z13)) {
                                return;
                            }
                            if (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent")) {
                                String stringExtra = Intent.parseUri(uri2.toString(), 1).getStringExtra("browser_fallback_url");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    uri2 = Uri.parse(stringExtra);
                                }
                            }
                            n(uri2.toString());
                            return;
                        }
                        z18 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!f9) {
                        }
                        if (z18) {
                        }
                    }
                    String str6 = str3;
                    try {
                        c2[] c2VarArr = new c2[1];
                        c2VarArr[c3] = new c2(context, 3, null);
                        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                        getwebpagepreview.message = uri.toString();
                        str4 = str6;
                        cVar2 = cVar;
                        try {
                            int sendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new j0(cVar2, c2VarArr, i11, uri, context, z16));
                            if (cVar2 != null) {
                                cVar2.d();
                                return;
                            } else {
                                i10 = i11;
                                try {
                                    AndroidUtilities.runOnUIThread(new p1(c2VarArr, sendRequest, i12), 1000L);
                                    return;
                                } catch (Exception unused3) {
                                }
                            }
                        } catch (Exception unused4) {
                        }
                    } catch (Exception unused5) {
                        cVar2 = cVar;
                        i10 = i11;
                        str4 = str6;
                    }
                }
            }
            cVar2 = cVar;
            str4 = str3;
            i10 = i11;
            c3 = 0;
            if (uri.getScheme() != null) {
            }
            str5 = lowerCase;
            if (str5 == null) {
            }
            if (!"http".equals(str5)) {
            }
            uri2 = uri.normalizeScheme();
            hostAuthority2 = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
            if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority2)) {
            }
            if (z16) {
            }
            if (z14) {
            }
            if (!i(uri2.toString())) {
            }
            z18 = true;
            if (uri2.getScheme() != null) {
            }
            if (!f9) {
            }
            if (z18) {
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (z17) {
        }
        cVar2 = cVar;
        str4 = str3;
        i10 = i11;
        c3 = 0;
        if (uri.getScheme() != null) {
        }
        str5 = lowerCase;
        if (str5 == null) {
        }
        if (!"http".equals(str5)) {
        }
        uri2 = uri.normalizeScheme();
        hostAuthority2 = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
        if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority2)) {
        }
        if (z16) {
        }
        if (z14) {
        }
        if (!i(uri2.toString())) {
        }
        z18 = true;
        if (uri2.getScheme() != null) {
        }
        if (!f9) {
        }
        if (z18) {
        }
    }

    public static void s(Context context, String str) {
        if (str == null) {
            return;
        }
        p(context, Uri.parse(str), true, true);
    }

    public static void t(LaunchActivity launchActivity, Uri uri) {
        p(launchActivity, uri, true, true);
    }

    public static void u(Context context, String str) {
        if (str == null) {
            return;
        }
        r(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String v(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb2.append(uri.getUserInfo());
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
        } else if (uri.getPath() != null) {
            sb2.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb2.append("?");
            sb2.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb2.append("#");
            sb2.append(uri.getFragment());
        }
        return sb2.toString();
    }

    public static String w(Uri uri, String str) {
        return v(uri, null, null, str, null);
    }

    public static void x(Activity activity) {
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

    public static boolean y(String str) {
        return h(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
