package ve;

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
import d7.u;
import j3.r0;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c3;
import org.telegram.ui.i0;
import org.telegram.ui.l4;
import org.telegram.ui.p3;
import org.telegram.ui.qy;
import org.telegram.ui.web.v0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static we.b a;
    public static we.b b;
    public static df.a c;
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

    public static we.b c() {
        we.b bVar = b;
        we.b bVar2 = null;
        if (bVar == null) {
            a = null;
        } else if (a == null) {
            u uVar = new u(25);
            cf.e eVar = (cf.e) bVar.b;
            cf.b bVar3 = new cf.b(uVar);
            try {
                if (((cf.c) eVar).E0(bVar3)) {
                    bVar2 = new we.b(bVar3, (ComponentName) bVar.c, false, 11);
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
            for (int i9 = 0; i9 < queryIntentActivities.size(); i9++) {
                try {
                    strArr[i9] = queryIntentActivities.get(i9).activityInfo.packageName;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("default browser name = " + strArr[i9]);
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
                    if (lowerCase == null || (!lowerCase.contains("browser") && !lowerCase.contains("chrome") && !lowerCase.contains("firefox") && !"com.microsoft.emmx".equals(lowerCase) && !"com.opera.mini.native".equals(lowerCase) && !"com.duckduckgo.mobile.android".equals(lowerCase) && !"com.UCMobile.intl".equals(lowerCase))) {
                        z10 = false;
                        if (!z10) {
                            list.remove(i12);
                            i12--;
                        }
                        i12++;
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    i12++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    FileLog.d("device has " + list.get(i13).activityInfo.packageName + " to open " + str);
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
        qy sheetFragment;
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

    public static boolean k(Context context, String str, boolean z10, boolean z11, d dVar) {
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
        launchActivity.e0(intent, dVar);
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
        p3[] p3VarArr;
        p3 p3Var;
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<l3> tabs = P.getTabs();
                for (int i9 = 0; i9 < tabs.size(); i9++) {
                    l3Var = tabs.get(i9);
                    l4 l4Var = l3Var.H;
                    if (l4Var != null && !l4Var.Z.isEmpty()) {
                        Object j10 = r0.j(1, l3Var.H.Z);
                        if (j10 instanceof c3) {
                            v0 v0Var = ((c3) j10).b;
                            if (v0Var == null && (p3VarArr = l3Var.H.q0) != null && (p3Var = p3VarArr[0]) != null) {
                                v0Var = p3Var.getWebView();
                            }
                            if (v0Var != null) {
                                if (TextUtils.equals(m3.p(v0Var.canGoBack() ? v0Var.getUrl() : v0Var.getOpenURL()), m3.p(str))) {
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

    public static void q(Context context, Uri uri, boolean z10, boolean z11, d dVar) {
        r(context, uri, z10, z11, false, dVar, null, false, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:4|(12:177|178|245|(1:8)(1:176)|(3:139|140|(10:142|(2:144|(2:146|(2:148|(2:150|(1:152)))))(1:174)|153|154|155|156|157|158|159|(2:161|162)(5:163|164|165|166|167)))|10|11|12|13|(2:135|136)(1:15)|16|(19:22|(1:24)|128|129|130|27|28|(1:30)|(3:(2:33|(1:35))|36|(3:51|52|(2:54|55)(9:56|(1:58)|59|(1:61)(1:120)|62|63|64|65|67)))|121|(3:99|100|(2:(1:103)|115))|71|(5:98|74|75|(1:77)|(1:(2:84|(4:86|(2:90|(1:92))|93|94)(1:95))(2:96|97))(2:81|82))|73|74|75|(0)|(1:79)|(0)(0))(1:20))|6|(0)(0)|(0)|10|11|12|13|(0)(0)|16|(1:18)|22|(0)|128|129|130|27|28|(0)|(0)|121|(0)|71|(0)|73|74|75|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0408, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r21).isWebBrowserOpenInApp(r3.toString()) != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0414, code lost:
    
        if (android.text.TextUtils.isEmpty(r20) == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x041a, code lost:
    
        if (r3.getScheme() != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0424, code lost:
    
        if ("https".equals(r3.getScheme()) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x042e, code lost:
    
        if ("http".equals(r3.getScheme()) == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x043b, code lost:
    
        if ("tonsite".equals(r3.getScheme()) == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x040e, code lost:
    
        if (e() != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0268, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0269, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ed, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ee, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0260, code lost:
    
        if ("https".equals(r2) != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x026c, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025c A[Catch: Exception -> 0x0241, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0241, blocks: (B:136:0x0237, B:18:0x024c, B:24:0x025c), top: B:135:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028a A[Catch: Exception -> 0x02ab, TryCatch #3 {Exception -> 0x02ab, blocks: (B:28:0x026e, B:30:0x028a, B:33:0x02b1, B:36:0x02c3, B:38:0x02c9, B:41:0x02d5, B:43:0x02de, B:45:0x02e8, B:47:0x02ed, B:49:0x02f7, B:51:0x0301, B:54:0x0311, B:56:0x0320, B:58:0x034b, B:59:0x0356, B:62:0x0365, B:120:0x0361), top: B:27:0x026e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0452 A[Catch: Exception -> 0x04b3, TRY_ENTER, TryCatch #7 {Exception -> 0x04b3, blocks: (B:100:0x03f6, B:103:0x03fc, B:105:0x0410, B:107:0x0416, B:109:0x041c, B:111:0x0426, B:113:0x0430, B:74:0x044a, B:77:0x0452, B:79:0x045c, B:81:0x0460, B:84:0x046e, B:86:0x0478, B:88:0x047e, B:90:0x0488, B:92:0x049d, B:93:0x04a1, B:96:0x04a9, B:115:0x040a, B:71:0x043d), top: B:99:0x03f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x045c A[Catch: Exception -> 0x04b3, TryCatch #7 {Exception -> 0x04b3, blocks: (B:100:0x03f6, B:103:0x03fc, B:105:0x0410, B:107:0x0416, B:109:0x041c, B:111:0x0426, B:113:0x0430, B:74:0x044a, B:77:0x0452, B:79:0x045c, B:81:0x0460, B:84:0x046e, B:86:0x0478, B:88:0x047e, B:90:0x0488, B:92:0x049d, B:93:0x04a1, B:96:0x04a9, B:115:0x040a, B:71:0x043d), top: B:99:0x03f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x046e A[Catch: Exception -> 0x04b3, TryCatch #7 {Exception -> 0x04b3, blocks: (B:100:0x03f6, B:103:0x03fc, B:105:0x0410, B:107:0x0416, B:109:0x041c, B:111:0x0426, B:113:0x0430, B:74:0x044a, B:77:0x0452, B:79:0x045c, B:81:0x0460, B:84:0x046e, B:86:0x0478, B:88:0x047e, B:90:0x0488, B:92:0x049d, B:93:0x04a1, B:96:0x04a9, B:115:0x040a, B:71:0x043d), top: B:99:0x03f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a9 A[Catch: Exception -> 0x04b3, TRY_LEAVE, TryCatch #7 {Exception -> 0x04b3, blocks: (B:100:0x03f6, B:103:0x03fc, B:105:0x0410, B:107:0x0416, B:109:0x041c, B:111:0x0426, B:113:0x0430, B:74:0x044a, B:77:0x0452, B:79:0x045c, B:81:0x0460, B:84:0x046e, B:86:0x0478, B:88:0x047e, B:90:0x0488, B:92:0x049d, B:93:0x04a1, B:96:0x04a9, B:115:0x040a, B:71:0x043d), top: B:99:0x03f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context, Uri uri, boolean z10, boolean z11, boolean z12, d dVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        char c10;
        String str4;
        int i9;
        d dVar2;
        Uri uri2;
        boolean z18;
        LaunchActivity launchActivity;
        String lowerCase;
        String str5;
        String hostAuthority;
        if (context == null || uri == null) {
            return;
        }
        int i10 = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean f10 = f(uri, false, zArr);
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
                    String hostAuthority2 = AndroidUtilities.getHostAuthority(uri);
                    if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                        if (h(hostAuthority2, true, false)) {
                            c10 = 0;
                        } else {
                            c10 = 0;
                            if ("telegram.org".equalsIgnoreCase(hostAuthority2)) {
                                if (!uri.toString().toLowerCase().contains("telegram.org/faq")) {
                                    if (!uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                                        if (uri.toString().toLowerCase().contains("telegram.org/blog")) {
                                        }
                                    }
                                }
                            }
                        }
                        String str6 = str3;
                        try {
                            c2[] c2VarArr = new c2[1];
                            c2VarArr[c10] = new c2(context, 3, null);
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = uri.toString();
                            str4 = str6;
                            dVar2 = dVar;
                            try {
                                int sendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new i0(dVar2, c2VarArr, i10, uri, context, z16));
                                if (dVar2 != null) {
                                    dVar2.d();
                                    return;
                                } else {
                                    i9 = i10;
                                    try {
                                        AndroidUtilities.runOnUIThread(new a(c2VarArr, sendRequest, 0), 1000L);
                                        return;
                                    } catch (Exception unused) {
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            str4 = str6;
                            i9 = i10;
                            dVar2 = dVar;
                        }
                    }
                } catch (Exception unused4) {
                }
            }
            dVar2 = dVar;
            str4 = str3;
            i9 = i10;
            if (uri.getScheme() == null) {
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
                    if (!f10) {
                    }
                    if (!z18) {
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
            hostAuthority = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
            if (AccountInstance.getInstance(i9).getMessagesController().autologinDomains.contains(hostAuthority)) {
                uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
            }
            if (z16) {
                if (uri2 == null) {
                    if (!MessagesController.getInstance(i9).isWebBrowserOpenInApp(uri2.toString())) {
                    }
                }
                if (!e() && MessagesController.getInstance(i9).isWebBrowserUseCustomTabs() && !f10 && !str5.equals("tel") && !i(uri2.toString()) && (zArr[0] || !l(context, uri2.toString(), false) || !d(context, uri2.toString()))) {
                    if (MessagesController.getInstance(i9).authDomains.contains(hostAuthority)) {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.addFlags(TLObject.FLAG_28);
                        ApplicationLoader.applicationContext.startActivity(intent);
                        return;
                    }
                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                    intent2.setAction("android.intent.action.SEND");
                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                    we.b c11 = c();
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    if (c11 != null) {
                        intent3.setPackage(((ComponentName) c11.c).getPackageName());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", c11 == null ? null : (cf.b) c11.b);
                    intent3.putExtras(bundle);
                    String string = LocaleController.getString(R.string.CopyLink);
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                    bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                    arrayList.add(bundle2);
                    intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", f6.w0(null, f6.S8, false));
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
                        if (!f10) {
                        }
                        if (!z18) {
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
                if (!f10 && (launchActivity = LaunchActivity.C1) != null) {
                    k(launchActivity, uri2.toString(), z12, z15, dVar2);
                    return;
                }
                if (!z18) {
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
            if (!f10) {
            }
            if (!z18) {
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (z17) {
        }
        dVar2 = dVar;
        str4 = str3;
        i9 = i10;
        if (uri.getScheme() == null) {
        }
        str5 = lowerCase;
        if (str5 == null) {
        }
        if (!"http".equals(str5)) {
        }
        uri2 = uri.normalizeScheme();
        hostAuthority = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
        if (AccountInstance.getInstance(i9).getMessagesController().autologinDomains.contains(hostAuthority)) {
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
        if (!f10) {
        }
        if (!z18) {
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
