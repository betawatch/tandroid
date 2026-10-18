package pf;

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
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.e;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.j;
import org.telegram.ui.b3;
import org.telegram.ui.h0;
import org.telegram.ui.l4;
import org.telegram.ui.o3;
import org.telegram.ui.web.y0;
import xf.f;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class d {
    public static e a;
    public static xf.c b;
    public static a9.d c;
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            Matcher matcher = LaunchActivity.C1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static e c() {
        xf.c cVar = b;
        e eVar = null;
        if (cVar == null) {
            a = null;
        } else if (a == null) {
            rb.b bVar = new rb.b(19);
            f fVar = (f) cVar.a;
            xf.b bVar2 = new xf.b(bVar);
            try {
                if (((xf.d) fVar).F0(bVar2)) {
                    eVar = new e(29, bVar2, (ComponentName) cVar.b);
                }
            } catch (RemoteException unused) {
            }
            a = eVar;
            new WeakReference(eVar);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:58|(5:61|(1:83)(1:77)|(2:79|80)(1:82)|81|59)|84)|42|(3:44|(3:47|48|45)|49)|(1:56)(2:54|55))|89|23|24|25|(0)(0)|42|(0)|(2:52|56)(1:57)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Context context, String str) {
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
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
                        list.remove(i13);
                        i13--;
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

    public static boolean e(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String lowerCase = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (!MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase)) {
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

    public static boolean f(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    public static boolean g(String str, boolean z10, boolean z11) {
        if (z10) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z11 ? "" : "?");
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean h(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean i(String str) {
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

    public static boolean j(Context context, String str, boolean z10, boolean z11, c cVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.H1;
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
        launchActivity.f0(intent, cVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: Exception -> 0x0025, ActivityNotFoundException -> 0x0028, TryCatch #2 {ActivityNotFoundException -> 0x0028, Exception -> 0x0025, blocks: (B:6:0x0005, B:8:0x000b, B:11:0x0018, B:14:0x002f, B:16:0x0035, B:17:0x0042, B:20:0x0053, B:22:0x0064, B:24:0x006a, B:32:0x0081, B:34:0x0093, B:36:0x0099, B:37:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x004f, B:47:0x003e, B:48:0x002b), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[Catch: Exception -> 0x0025, ActivityNotFoundException -> 0x0028, TryCatch #2 {ActivityNotFoundException -> 0x0028, Exception -> 0x0025, blocks: (B:6:0x0005, B:8:0x000b, B:11:0x0018, B:14:0x002f, B:16:0x0035, B:17:0x0042, B:20:0x0053, B:22:0x0064, B:24:0x006a, B:32:0x0081, B:34:0x0093, B:36:0x0099, B:37:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x004f, B:47:0x003e, B:48:0x002b), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(Context context, String str, boolean z10) {
        boolean z11;
        if (str != null) {
            try {
                if (!h(str) && !e(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String u10 = u(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath());
                    Uri parse2 = Uri.parse(u10);
                    if (!u10.startsWith("intent://") && (parse2.getScheme() == null || !parse2.getScheme().equalsIgnoreCase("intent"))) {
                        z11 = false;
                        if (z11 || z10) {
                            Intent parseUri = !z11 ? Intent.parseUri(parse2.toString(), 1) : new Intent("android.intent.action.VIEW", parse2);
                            if (z11 && Build.VERSION.SDK_INT >= 30) {
                                parseUri.addCategory("android.intent.category.BROWSABLE");
                                parseUri.addCategory("android.intent.category.DEFAULT");
                                parseUri.addFlags(TLObject.FLAG_28);
                                parseUri.addFlags(1024);
                            } else if (!z11 && !d(context, u10)) {
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
            } catch (ActivityNotFoundException e7) {
                FileLog.e((Throwable) e7, false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    public static boolean l(Context context, String str, boolean z10, String str2) {
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
            } catch (Exception e7) {
                FileLog.e(e7);
                return false;
            }
        }
        return false;
    }

    public static void m(String str) {
        n3 P;
        m3 m3Var;
        o3[] o3VarArr;
        o3 o3Var;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<m3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    m3Var = tabs.get(i10);
                    l4 l4Var = m3Var.J;
                    if (l4Var != null && !l4Var.d0.isEmpty()) {
                        Object h = i2.d.h(1, m3Var.J.d0);
                        if (h instanceof b3) {
                            y0 y0Var = ((b3) h).b;
                            if (y0Var == null && (o3VarArr = m3Var.J.u0) != null && (o3Var = o3VarArr[0]) != null) {
                                y0Var = o3Var.getWebView();
                            }
                            if (y0Var != null) {
                                if (TextUtils.equals(n3.p(y0Var.canGoBack() ? y0Var.getUrl() : y0Var.getOpenURL()), n3.p(str))) {
                                    P.e(m3Var);
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
            m3Var = null;
            if (m3Var != null) {
                return;
            }
        }
        n2 U = LaunchActivity.U();
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

    public static void n(Activity activity, String str, boolean z10) {
        if (activity == null || str == null) {
            return;
        }
        o(activity, Uri.parse(str), z10, true);
    }

    public static void o(Context context, Uri uri, boolean z10, boolean z11) {
        q(context, uri, z10, z11, false, null, null, false, true, false);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11, c cVar) {
        q(context, uri, z10, z11, false, cVar, null, false, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:4|(31:189|190|257|(1:8)(1:188)|(3:151|152|(7:154|(11:156|157|158|(2:160|(2:162|(2:164|(1:166))))|183|11|12|13|(2:147|148)(1:15)|16|(19:22|(1:24)|140|141|142|27|28|(1:30)|(3:(2:33|(1:35))|36|(5:43|(3:123|124|(10:129|(3:100|101|(1:(2:104|(2:106|(7:108|(2:110|(2:112|(1:114)))|74|75|76|(1:78)|(1:(2:85|(4:87|(2:91|(1:93))|94|95)(1:96))(2:97|98))(2:82|83))))))|72|(6:99|75|76|(0)|(1:80)|(0)(0))|74|75|76|(0)|(0)|(0)(0)))|45|46|(2:48|49)(16:50|51|52|53|54|(1:56)|57|(1:59)(1:120)|60|61|62|63|64|65|66|68)))|133|(0)|72|(0)|74|75|76|(0)|(0)|(0)(0))(1:20))(1:185)|167|168|169|170|(2:172|173)(5:174|175|176|177|178)))|10|11|12|13|(0)(0)|16|(1:18)|22|(0)|140|141|142|27|28|(0)|(0)|133|(0)|72|(0)|74|75|76|(0)|(0)|(0)(0))|6|(0)(0)|(0)|10|11|12|13|(0)(0)|16|(0)|22|(0)|140|141|142|27|28|(0)|(0)|133|(0)|72|(0)|74|75|76|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0453, code lost:
    
        if ("tonsite".equals(r3.getScheme()) != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x027d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x027e, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x040a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x040b, code lost:
    
        r2 = r17;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0275, code lost:
    
        if ("https".equals(r2) != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0281, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0414 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0261 A[Catch: Exception -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0255, blocks: (B:148:0x024b, B:18:0x0261, B:24:0x0271), top: B:147:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0271 A[Catch: Exception -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0255, blocks: (B:148:0x024b, B:18:0x0261, B:24:0x0271), top: B:147:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029f A[Catch: Exception -> 0x02c0, TryCatch #0 {Exception -> 0x02c0, blocks: (B:28:0x0283, B:30:0x029f, B:33:0x02c6, B:36:0x02d9, B:39:0x02e5, B:41:0x02ee, B:43:0x02f8), top: B:27:0x0283 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x046a A[Catch: Exception -> 0x04cb, TRY_ENTER, TryCatch #2 {Exception -> 0x04cb, blocks: (B:101:0x0414, B:104:0x041a, B:106:0x0428, B:108:0x042e, B:110:0x0434, B:112:0x043e, B:114:0x0448, B:75:0x0462, B:78:0x046a, B:80:0x0474, B:82:0x0478, B:85:0x0486, B:87:0x0490, B:89:0x0496, B:91:0x04a0, B:93:0x04b5, B:94:0x04b9, B:97:0x04c1, B:72:0x0455), top: B:100:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0474 A[Catch: Exception -> 0x04cb, TryCatch #2 {Exception -> 0x04cb, blocks: (B:101:0x0414, B:104:0x041a, B:106:0x0428, B:108:0x042e, B:110:0x0434, B:112:0x043e, B:114:0x0448, B:75:0x0462, B:78:0x046a, B:80:0x0474, B:82:0x0478, B:85:0x0486, B:87:0x0490, B:89:0x0496, B:91:0x04a0, B:93:0x04b5, B:94:0x04b9, B:97:0x04c1, B:72:0x0455), top: B:100:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0486 A[Catch: Exception -> 0x04cb, TryCatch #2 {Exception -> 0x04cb, blocks: (B:101:0x0414, B:104:0x041a, B:106:0x0428, B:108:0x042e, B:110:0x0434, B:112:0x043e, B:114:0x0448, B:75:0x0462, B:78:0x046a, B:80:0x0474, B:82:0x0478, B:85:0x0486, B:87:0x0490, B:89:0x0496, B:91:0x04a0, B:93:0x04b5, B:94:0x04b9, B:97:0x04c1, B:72:0x0455), top: B:100:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04c1 A[Catch: Exception -> 0x04cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x04cb, blocks: (B:101:0x0414, B:104:0x041a, B:106:0x0428, B:108:0x042e, B:110:0x0434, B:112:0x043e, B:114:0x0448, B:75:0x0462, B:78:0x046a, B:80:0x0474, B:82:0x0478, B:85:0x0486, B:87:0x0490, B:89:0x0496, B:91:0x04a0, B:93:0x04b5, B:94:0x04b9, B:97:0x04c1, B:72:0x0455), top: B:100:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0461  */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(Context context, Uri uri, boolean z10, boolean z11, boolean z12, c cVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        String hostAuthority;
        boolean z18;
        c cVar2;
        int i10;
        String str4;
        boolean z19;
        boolean z20;
        Uri uri2;
        boolean z21;
        LaunchActivity launchActivity;
        String lowerCase;
        String str5;
        String hostAuthority2;
        Intent intent;
        ArrayList<? extends Parcelable> arrayList;
        Bitmap decodeResource;
        String string;
        if (context == null || uri == null) {
            return;
        }
        int i11 = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean e7 = e(uri, false, zArr);
        int i12 = 6;
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
                    if (g(hostAuthority, true, false)) {
                        z18 = 0;
                    } else {
                        z18 = 0;
                        try {
                            if ("telegram.org".equalsIgnoreCase(hostAuthority)) {
                                z18 = z18;
                                if (!uri.toString().toLowerCase().contains("telegram.org/faq")) {
                                    z18 = z18;
                                    if (!uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                                        if (uri.toString().toLowerCase().contains("telegram.org/blog")) {
                                            z18 = z18;
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        cVar2 = cVar;
                        i10 = i11;
                        str4 = str3;
                        z18 = z18;
                        z19 = z16;
                        if (uri.getScheme() != null) {
                            try {
                                lowerCase = uri.getScheme().toLowerCase();
                            } catch (Exception e10) {
                                e = e10;
                                uri2 = uri;
                                z20 = z18;
                                FileLog.e(e);
                                if (z14) {
                                }
                                if (!h(uri2.toString())) {
                                }
                                z21 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!e7) {
                                }
                                if (z21) {
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
                        if (z19) {
                            if (uri2 == null) {
                                if (!MessagesController.getInstance(i10).isWebBrowserOpenInApp(uri2.toString())) {
                                }
                            }
                            if (MessagesController.getInstance(i10).isWebBrowserUseCustomTabs() && !e7 && !str5.equals("tel") && !h(uri2.toString())) {
                                if (!zArr[z18]) {
                                    try {
                                    } catch (Exception e11) {
                                        e = e11;
                                        z20 = false;
                                        FileLog.e(e);
                                        if (z14) {
                                        }
                                        if (!h(uri2.toString())) {
                                        }
                                        z21 = true;
                                        if (uri2.getScheme() != null) {
                                        }
                                        if (!e7) {
                                        }
                                        if (z21) {
                                        }
                                    }
                                    if (k(context, uri2.toString(), z18) && d(context, uri2.toString())) {
                                        z20 = false;
                                        if (z14) {
                                            try {
                                                if (BubbleActivity.a0 == null) {
                                                    if (uri2 != null) {
                                                        if (MessagesController.getInstance(i10).isWebBrowserOpenInApp(uri2.toString())) {
                                                            if (TextUtils.isEmpty(str4)) {
                                                                if (uri2.getScheme() != null) {
                                                                    if (!"https".equals(uri2.getScheme())) {
                                                                        if (!"http".equals(uri2.getScheme())) {
                                                                        }
                                                                    }
                                                                }
                                                                z21 = true;
                                                                if (uri2.getScheme() != null) {
                                                                    uri2.getScheme().equalsIgnoreCase("intent");
                                                                }
                                                                if (!e7 && (launchActivity = LaunchActivity.H1) != null) {
                                                                    j(launchActivity, uri2.toString(), z12, z15, cVar2);
                                                                    return;
                                                                }
                                                                if (z21) {
                                                                    l(context, uri2.toString(), z13, str4);
                                                                    return;
                                                                }
                                                                if (k(context, uri2.toString(), z13)) {
                                                                    return;
                                                                }
                                                                if (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent")) {
                                                                    String stringExtra = Intent.parseUri(uri2.toString(), 1).getStringExtra("browser_fallback_url");
                                                                    if (!TextUtils.isEmpty(stringExtra)) {
                                                                        uri2 = Uri.parse(stringExtra);
                                                                    }
                                                                }
                                                                m(uri2.toString());
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                FileLog.e(e12);
                                                return;
                                            }
                                        }
                                        if (!h(uri2.toString())) {
                                            z21 = z20;
                                            if (uri2.getScheme() != null) {
                                            }
                                            if (!e7) {
                                            }
                                            if (z21) {
                                            }
                                        }
                                        z21 = true;
                                        if (uri2.getScheme() != null) {
                                        }
                                        if (!e7) {
                                        }
                                        if (z21) {
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i10).authDomains.contains(hostAuthority2)) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", uri2);
                                    intent2.addFlags(TLObject.FLAG_28);
                                    ApplicationLoader.applicationContext.startActivity(intent2);
                                    return;
                                }
                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent3.setAction("android.intent.action.SEND");
                                boolean z22 = false;
                                try {
                                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                    e c10 = c();
                                    intent = new Intent("android.intent.action.VIEW");
                                    if (c10 != null) {
                                        intent.setPackage(((ComponentName) c10.c).getPackageName());
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBinder("android.support.customtabs.extra.SESSION", c10 == null ? null : (xf.b) c10.b);
                                    intent.putExtras(bundle);
                                    String string2 = LocaleController.getString(R.string.CopyLink);
                                    arrayList = new ArrayList<>();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string2);
                                    bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                    arrayList.add(bundle2);
                                    z22 = false;
                                    intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", h6.x0(null, h6.S8, false));
                                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                    decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                    string = LocaleController.getString(R.string.ShareFile);
                                    z20 = false;
                                } catch (Exception e13) {
                                    e = e13;
                                    z20 = z22;
                                }
                                try {
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 33554432);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                    bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                    bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", string);
                                    bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                    intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                    intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                    intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                    intent.addFlags(TLObject.FLAG_28);
                                    intent.setData(uri2);
                                    context.startActivity(intent, null);
                                    return;
                                } catch (Exception e14) {
                                    e = e14;
                                    FileLog.e(e);
                                    if (z14) {
                                    }
                                    if (!h(uri2.toString())) {
                                    }
                                    z21 = true;
                                    if (uri2.getScheme() != null) {
                                    }
                                    if (!e7) {
                                    }
                                    if (z21) {
                                    }
                                }
                            }
                        }
                        z20 = z18;
                        if (z14) {
                        }
                        if (!h(uri2.toString())) {
                        }
                        z21 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!e7) {
                        }
                        if (z21) {
                        }
                    }
                    b2[] b2VarArr = new b2[1];
                    b2VarArr[z18 == true ? 1 : 0] = new b2(context, 3, null);
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    cVar2 = cVar;
                    str4 = str3;
                    z19 = z16;
                    try {
                        int sendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new h0(cVar2, b2VarArr, i11, uri, context, z19));
                        if (cVar2 != null) {
                            cVar2.d();
                            return;
                        } else {
                            i10 = i11;
                            try {
                                AndroidUtilities.runOnUIThread(new j(b2VarArr, sendRequest, i12), 1000L);
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Exception unused4) {
                        i10 = i11;
                    }
                }
            }
            cVar2 = cVar;
            i10 = i11;
            str4 = str3;
            z18 = 0;
            z19 = z16;
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
            if (z19) {
            }
            z20 = z18;
            if (z14) {
            }
            if (!h(uri2.toString())) {
            }
            z21 = true;
            if (uri2.getScheme() != null) {
            }
            if (!e7) {
            }
            if (z21) {
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (z17) {
        }
        cVar2 = cVar;
        i10 = i11;
        str4 = str3;
        z18 = 0;
        z19 = z16;
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
        if (z19) {
        }
        z20 = z18;
        if (z14) {
        }
        if (!h(uri2.toString())) {
        }
        z21 = true;
        if (uri2.getScheme() != null) {
        }
        if (!e7) {
        }
        if (z21) {
        }
    }

    public static void r(Context context, String str) {
        if (str == null) {
            return;
        }
        o(context, Uri.parse(str), true, true);
    }

    public static void s(LaunchActivity launchActivity, Uri uri) {
        o(launchActivity, uri, true, true);
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String u(Uri uri, String str, String str2, String str3, String str4) {
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

    public static String v(Uri uri, String str) {
        return u(uri, null, null, str, null);
    }

    public static void w(Activity activity) {
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

    public static boolean x(String str) {
        return g(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
