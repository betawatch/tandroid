// default package

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yn2 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(75:0|1|(3:2|3|(1:5))|233|7|8|(3:209|210|(73:212|(66:214|(1:216)|11|(1:13)|14|(1:16)|17|(57:19|(1:195)|23|(1:25)|26|(1:28)(2:185|(1:190)(1:189))|29|(1:31)|32|(1:34)(5:173|(1:175)|176|(1:178)(1:184)|(1:180)(2:181|(1:183)))|35|(1:37)(6:152|(4:155|(2:162|163)(1:165)|164|153)|168|169|(1:171)|172)|38|(1:40)(1:151)|(1:42)|43|(39:147|148|(1:49)|50|(1:52)|53|(33:138|(1:142)|(1:57)|58|(29:133|(1:137)|(1:62)|63|(25:130|(1:132)|(1:67)|68|(21:126|127|(1:72)|73|(3:116|117|(18:119|(1:121)|122|(1:77)|78|(4:80|81|82|(2:84|(12:86|(3:88|(1:91)|92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|106)(2:108|109))(2:110|111))|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)(2:123|124))|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|45|(39:143|144|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|196|(2:204|205)|(1:203)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|217|(69:219|(1:221)|11|(0)|14|(0)|17|(0)|196|(1:198)|204|205|(1:201)|203|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)(1:229)|222|(3:224|(1:226)(1:228)|227)|11|(0)|14|(0)|17|(0)|196|(0)|204|205|(0)|203|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106))|10|11|(0)|14|(0)|17|(0)|196|(0)|204|205|(0)|203|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0156, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0157, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0423 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0503  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lx6 a(FirebaseMessagingService firebaseMessagingService, ai4 ai4Var) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String x;
        String x2;
        String y;
        int i;
        String y2;
        Uri defaultUri;
        String y3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String y4;
        Integer valueOf;
        String y5;
        Integer r;
        Integer r2;
        Integer r3;
        String y6;
        Long valueOf2;
        JSONArray t;
        long[] jArr;
        JSONArray t2;
        int[] iArr;
        ?? r0;
        String y7;
        int i2;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String y8 = ai4Var.y("gcm.n.android_channel_id");
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(y8)) {
                    if (notificationManager.getNotificationChannel(y8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + y8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    an7 an7Var = new an7(firebaseMessagingService, y8);
                    x = ai4Var.x(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(x)) {
                        an7Var.e(x);
                    }
                    x2 = ai4Var.x(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(x2)) {
                        an7Var.d(x2);
                        vm7 vm7Var = new vm7((byte) 0);
                        vm7Var.f = an7.c(x2);
                        an7Var.i(vm7Var);
                    }
                    y = ai4Var.y("gcm.n.icon");
                    if (!TextUtils.isEmpty(y)) {
                        i = resources.getIdentifier(y, "drawable", packageName);
                        if ((i == 0 || !b(resources, i)) && ((i = resources.getIdentifier(y, "mipmap", packageName)) == 0 || !b(resources, i))) {
                            Log.w("FirebaseMessaging", "Icon resource " + y + " not found. Notification will use default icon.");
                        }
                        Notification notification = an7Var.F;
                        notification.icon = i;
                        y2 = ai4Var.y("gcm.n.sound2");
                        if (TextUtils.isEmpty(y2)) {
                            y2 = ai4Var.y("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(y2)) {
                            defaultUri = null;
                        } else if ("default".equals(y2) || resources.getIdentifier(y2, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + y2);
                        }
                        if (defaultUri != null) {
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = zm7.a(zm7.e(zm7.c(zm7.b(), 4), 5));
                        }
                        y3 = ai4Var.y("gcm.n.click_action");
                        if (TextUtils.isEmpty(y3)) {
                            String y9 = ai4Var.y("gcm.n.link_android");
                            if (TextUtils.isEmpty(y9)) {
                                y9 = ai4Var.y("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(y9) ? Uri.parse(y9) : null;
                            if (parse != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(parse);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
                            launchIntentForPackage = new Intent(y3);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) ai4Var.b;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (ai4Var.q("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", ai4Var.J());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        an7Var.g = activity;
                        broadcast = !ai4Var.q("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(ai4Var.J())), 1140850688);
                        if (broadcast != null) {
                            notification.deleteIntent = broadcast;
                        }
                        y4 = ai4Var.y("gcm.n.color");
                        if (!TextUtils.isEmpty(y4)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(y4));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + y4 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                an7Var.w = valueOf.intValue();
                            }
                            an7Var.f(16, !ai4Var.q("gcm.n.sticky"));
                            an7Var.t = ai4Var.q("gcm.n.local_only");
                            y5 = ai4Var.y("gcm.n.ticker");
                            if (y5 != null) {
                                an7Var.k(y5);
                            }
                            r = ai4Var.r("gcm.n.notification_priority");
                            if (r != null) {
                                if (r.intValue() < -2 || r.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + r + ". Skipping setting notificationPriority.");
                                }
                                if (r != null) {
                                    an7Var.j = r.intValue();
                                }
                                r2 = ai4Var.r("gcm.n.visibility");
                                if (r2 != null) {
                                    if (r2.intValue() < -1 || r2.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + r2 + ". Skipping setting visibility.");
                                    }
                                    if (r2 != null) {
                                        an7Var.x = r2.intValue();
                                    }
                                    r3 = ai4Var.r("gcm.n.notification_count");
                                    if (r3 != null) {
                                        if (r3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + r3 + ". Skipping setting notificationCount.");
                                        }
                                        if (r3 != null) {
                                            an7Var.i = r3.intValue();
                                        }
                                        y6 = ai4Var.y("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(y6)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(y6));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + ai4.Z("gcm.n.event_time") + "(" + y6 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                an7Var.k = true;
                                                notification.when = valueOf2.longValue();
                                            }
                                            t = ai4Var.t("gcm.n.vibrate_timings");
                                            if (t != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + t + ". Skipping setting vibrateTimings.");
                                                }
                                                if (t.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = t.length();
                                                jArr = new long[length];
                                                for (int i4 = 0; i4 < length; i4++) {
                                                    jArr[i4] = t.optLong(i4);
                                                }
                                                if (jArr != null) {
                                                    notification.vibrate = jArr;
                                                }
                                                t2 = ai4Var.t("gcm.n.light_settings");
                                                if (t2 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e2) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + t2 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + t2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (t2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(t2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = t2.optInt(1);
                                                    iArr2[2] = t2.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i5 = iArr[0];
                                                        int i6 = iArr[1];
                                                        int i7 = iArr[2];
                                                        notification.ledARGB = i5;
                                                        notification.ledOnMS = i6;
                                                        notification.ledOffMS = i7;
                                                        if (i6 != 0 && i7 != 0) {
                                                            i3 = 1;
                                                        }
                                                        notification.flags = (notification.flags & (-2)) | i3;
                                                    }
                                                    boolean q = ai4Var.q("gcm.n.default_sound");
                                                    boolean z = q;
                                                    if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                                                        z = (q ? 1 : 0) | 2;
                                                    }
                                                    r0 = z;
                                                    if (ai4Var.q("gcm.n.default_light_settings")) {
                                                        r0 = (z ? 1 : 0) | 4;
                                                    }
                                                    notification.defaults = r0;
                                                    if ((r0 & 4) != 0) {
                                                        notification.flags |= 1;
                                                    }
                                                    y7 = ai4Var.y("gcm.n.tag");
                                                    if (TextUtils.isEmpty(y7)) {
                                                        y7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new lx6(an7Var, y7, (byte) 15);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean q2 = ai4Var.q("gcm.n.default_sound");
                                                boolean z2 = q2;
                                                if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                                                }
                                                r0 = z2;
                                                if (ai4Var.q("gcm.n.default_light_settings")) {
                                                }
                                                notification.defaults = r0;
                                                if ((r0 & 4) != 0) {
                                                }
                                                y7 = ai4Var.y("gcm.n.tag");
                                                if (TextUtils.isEmpty(y7)) {
                                                }
                                                return new lx6(an7Var, y7, (byte) 15);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            t2 = ai4Var.t("gcm.n.light_settings");
                                            if (t2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean q22 = ai4Var.q("gcm.n.default_sound");
                                            boolean z22 = q22;
                                            if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                                            }
                                            r0 = z22;
                                            if (ai4Var.q("gcm.n.default_light_settings")) {
                                            }
                                            notification.defaults = r0;
                                            if ((r0 & 4) != 0) {
                                            }
                                            y7 = ai4Var.y("gcm.n.tag");
                                            if (TextUtils.isEmpty(y7)) {
                                            }
                                            return new lx6(an7Var, y7, (byte) 15);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        t = ai4Var.t("gcm.n.vibrate_timings");
                                        if (t != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        t2 = ai4Var.t("gcm.n.light_settings");
                                        if (t2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean q222 = ai4Var.q("gcm.n.default_sound");
                                        boolean z222 = q222;
                                        if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                                        }
                                        r0 = z222;
                                        if (ai4Var.q("gcm.n.default_light_settings")) {
                                        }
                                        notification.defaults = r0;
                                        if ((r0 & 4) != 0) {
                                        }
                                        y7 = ai4Var.y("gcm.n.tag");
                                        if (TextUtils.isEmpty(y7)) {
                                        }
                                        return new lx6(an7Var, y7, (byte) 15);
                                    }
                                    r3 = null;
                                    if (r3 != null) {
                                    }
                                    y6 = ai4Var.y("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(y6)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    t = ai4Var.t("gcm.n.vibrate_timings");
                                    if (t != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    t2 = ai4Var.t("gcm.n.light_settings");
                                    if (t2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean q2222 = ai4Var.q("gcm.n.default_sound");
                                    boolean z2222 = q2222;
                                    if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                                    }
                                    r0 = z2222;
                                    if (ai4Var.q("gcm.n.default_light_settings")) {
                                    }
                                    notification.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                    }
                                    y7 = ai4Var.y("gcm.n.tag");
                                    if (TextUtils.isEmpty(y7)) {
                                    }
                                    return new lx6(an7Var, y7, (byte) 15);
                                }
                                r2 = null;
                                if (r2 != null) {
                                }
                                r3 = ai4Var.r("gcm.n.notification_count");
                                if (r3 != null) {
                                }
                                r3 = null;
                                if (r3 != null) {
                                }
                                y6 = ai4Var.y("gcm.n.event_time");
                                if (!TextUtils.isEmpty(y6)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                t = ai4Var.t("gcm.n.vibrate_timings");
                                if (t != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                t2 = ai4Var.t("gcm.n.light_settings");
                                if (t2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean q22222 = ai4Var.q("gcm.n.default_sound");
                                boolean z22222 = q22222;
                                if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z22222;
                                if (ai4Var.q("gcm.n.default_light_settings")) {
                                }
                                notification.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                y7 = ai4Var.y("gcm.n.tag");
                                if (TextUtils.isEmpty(y7)) {
                                }
                                return new lx6(an7Var, y7, (byte) 15);
                            }
                            r = null;
                            if (r != null) {
                            }
                            r2 = ai4Var.r("gcm.n.visibility");
                            if (r2 != null) {
                            }
                            r2 = null;
                            if (r2 != null) {
                            }
                            r3 = ai4Var.r("gcm.n.notification_count");
                            if (r3 != null) {
                            }
                            r3 = null;
                            if (r3 != null) {
                            }
                            y6 = ai4Var.y("gcm.n.event_time");
                            if (!TextUtils.isEmpty(y6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            t = ai4Var.t("gcm.n.vibrate_timings");
                            if (t != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            t2 = ai4Var.t("gcm.n.light_settings");
                            if (t2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean q222222 = ai4Var.q("gcm.n.default_sound");
                            boolean z222222 = q222222;
                            if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z222222;
                            if (ai4Var.q("gcm.n.default_light_settings")) {
                            }
                            notification.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            y7 = ai4Var.y("gcm.n.tag");
                            if (TextUtils.isEmpty(y7)) {
                            }
                            return new lx6(an7Var, y7, (byte) 15);
                        }
                        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i2 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i2));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            an7Var.f(16, !ai4Var.q("gcm.n.sticky"));
                            an7Var.t = ai4Var.q("gcm.n.local_only");
                            y5 = ai4Var.y("gcm.n.ticker");
                            if (y5 != null) {
                            }
                            r = ai4Var.r("gcm.n.notification_priority");
                            if (r != null) {
                            }
                            r = null;
                            if (r != null) {
                            }
                            r2 = ai4Var.r("gcm.n.visibility");
                            if (r2 != null) {
                            }
                            r2 = null;
                            if (r2 != null) {
                            }
                            r3 = ai4Var.r("gcm.n.notification_count");
                            if (r3 != null) {
                            }
                            r3 = null;
                            if (r3 != null) {
                            }
                            y6 = ai4Var.y("gcm.n.event_time");
                            if (!TextUtils.isEmpty(y6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            t = ai4Var.t("gcm.n.vibrate_timings");
                            if (t != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            t2 = ai4Var.t("gcm.n.light_settings");
                            if (t2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean q2222222 = ai4Var.q("gcm.n.default_sound");
                            boolean z2222222 = q2222222;
                            if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z2222222;
                            if (ai4Var.q("gcm.n.default_light_settings")) {
                            }
                            notification.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            y7 = ai4Var.y("gcm.n.tag");
                            if (TextUtils.isEmpty(y7)) {
                            }
                            return new lx6(an7Var, y7, (byte) 15);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        an7Var.f(16, !ai4Var.q("gcm.n.sticky"));
                        an7Var.t = ai4Var.q("gcm.n.local_only");
                        y5 = ai4Var.y("gcm.n.ticker");
                        if (y5 != null) {
                        }
                        r = ai4Var.r("gcm.n.notification_priority");
                        if (r != null) {
                        }
                        r = null;
                        if (r != null) {
                        }
                        r2 = ai4Var.r("gcm.n.visibility");
                        if (r2 != null) {
                        }
                        r2 = null;
                        if (r2 != null) {
                        }
                        r3 = ai4Var.r("gcm.n.notification_count");
                        if (r3 != null) {
                        }
                        r3 = null;
                        if (r3 != null) {
                        }
                        y6 = ai4Var.y("gcm.n.event_time");
                        if (!TextUtils.isEmpty(y6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        t = ai4Var.t("gcm.n.vibrate_timings");
                        if (t != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        t2 = ai4Var.t("gcm.n.light_settings");
                        if (t2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean q22222222 = ai4Var.q("gcm.n.default_sound");
                        boolean z22222222 = q22222222;
                        if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z22222222;
                        if (ai4Var.q("gcm.n.default_light_settings")) {
                        }
                        notification.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        y7 = ai4Var.y("gcm.n.tag");
                        if (TextUtils.isEmpty(y7)) {
                        }
                        return new lx6(an7Var, y7, (byte) 15);
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0 || !b(resources, i)) {
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i != 0 || !b(resources, i)) {
                        i = 17301651;
                    }
                    Notification notification2 = an7Var.F;
                    notification2.icon = i;
                    y2 = ai4Var.y("gcm.n.sound2");
                    if (TextUtils.isEmpty(y2)) {
                    }
                    if (TextUtils.isEmpty(y2)) {
                    }
                    if (defaultUri != null) {
                    }
                    y3 = ai4Var.y("gcm.n.click_action");
                    if (TextUtils.isEmpty(y3)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    an7Var.g = activity;
                    if (!ai4Var.q("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    y4 = ai4Var.y("gcm.n.color");
                    if (!TextUtils.isEmpty(y4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    an7Var.f(16, !ai4Var.q("gcm.n.sticky"));
                    an7Var.t = ai4Var.q("gcm.n.local_only");
                    y5 = ai4Var.y("gcm.n.ticker");
                    if (y5 != null) {
                    }
                    r = ai4Var.r("gcm.n.notification_priority");
                    if (r != null) {
                    }
                    r = null;
                    if (r != null) {
                    }
                    r2 = ai4Var.r("gcm.n.visibility");
                    if (r2 != null) {
                    }
                    r2 = null;
                    if (r2 != null) {
                    }
                    r3 = ai4Var.r("gcm.n.notification_count");
                    if (r3 != null) {
                    }
                    r3 = null;
                    if (r3 != null) {
                    }
                    y6 = ai4Var.y("gcm.n.event_time");
                    if (!TextUtils.isEmpty(y6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    t = ai4Var.t("gcm.n.vibrate_timings");
                    if (t != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    t2 = ai4Var.t("gcm.n.light_settings");
                    if (t2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean q222222222 = ai4Var.q("gcm.n.default_sound");
                    boolean z222222222 = q222222222;
                    if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z222222222;
                    if (ai4Var.q("gcm.n.default_light_settings")) {
                    }
                    notification2.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    y7 = ai4Var.y("gcm.n.tag");
                    if (TextUtils.isEmpty(y7)) {
                    }
                    return new lx6(an7Var, y7, (byte) 15);
                }
                y8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(y8)) {
                    if (notificationManager.getNotificationChannel(y8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    an7 an7Var2 = new an7(firebaseMessagingService, y8);
                    x = ai4Var.x(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(x)) {
                    }
                    x2 = ai4Var.x(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(x2)) {
                    }
                    y = ai4Var.y("gcm.n.icon");
                    if (!TextUtils.isEmpty(y)) {
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0) {
                    }
                    i = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i != 0) {
                    }
                    i = 17301651;
                    Notification notification22 = an7Var2.F;
                    notification22.icon = i;
                    y2 = ai4Var.y("gcm.n.sound2");
                    if (TextUtils.isEmpty(y2)) {
                    }
                    if (TextUtils.isEmpty(y2)) {
                    }
                    if (defaultUri != null) {
                    }
                    y3 = ai4Var.y("gcm.n.click_action");
                    if (TextUtils.isEmpty(y3)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    an7Var2.g = activity;
                    if (!ai4Var.q("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    y4 = ai4Var.y("gcm.n.color");
                    if (!TextUtils.isEmpty(y4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    an7Var2.f(16, !ai4Var.q("gcm.n.sticky"));
                    an7Var2.t = ai4Var.q("gcm.n.local_only");
                    y5 = ai4Var.y("gcm.n.ticker");
                    if (y5 != null) {
                    }
                    r = ai4Var.r("gcm.n.notification_priority");
                    if (r != null) {
                    }
                    r = null;
                    if (r != null) {
                    }
                    r2 = ai4Var.r("gcm.n.visibility");
                    if (r2 != null) {
                    }
                    r2 = null;
                    if (r2 != null) {
                    }
                    r3 = ai4Var.r("gcm.n.notification_count");
                    if (r3 != null) {
                    }
                    r3 = null;
                    if (r3 != null) {
                    }
                    y6 = ai4Var.y("gcm.n.event_time");
                    if (!TextUtils.isEmpty(y6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    t = ai4Var.t("gcm.n.vibrate_timings");
                    if (t != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    t2 = ai4Var.t("gcm.n.light_settings");
                    if (t2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean q2222222222 = ai4Var.q("gcm.n.default_sound");
                    boolean z2222222222 = q2222222222;
                    if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z2222222222;
                    if (ai4Var.q("gcm.n.default_light_settings")) {
                    }
                    notification22.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    y7 = ai4Var.y("gcm.n.tag");
                    if (TextUtils.isEmpty(y7)) {
                    }
                    return new lx6(an7Var2, y7, (byte) 15);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                y8 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                an7 an7Var22 = new an7(firebaseMessagingService, y8);
                x = ai4Var.x(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(x)) {
                }
                x2 = ai4Var.x(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(x2)) {
                }
                y = ai4Var.y("gcm.n.icon");
                if (!TextUtils.isEmpty(y)) {
                }
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i != 0) {
                }
                i = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i != 0) {
                }
                i = 17301651;
                Notification notification222 = an7Var22.F;
                notification222.icon = i;
                y2 = ai4Var.y("gcm.n.sound2");
                if (TextUtils.isEmpty(y2)) {
                }
                if (TextUtils.isEmpty(y2)) {
                }
                if (defaultUri != null) {
                }
                y3 = ai4Var.y("gcm.n.click_action");
                if (TextUtils.isEmpty(y3)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                an7Var22.g = activity;
                if (!ai4Var.q("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                y4 = ai4Var.y("gcm.n.color");
                if (!TextUtils.isEmpty(y4)) {
                }
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                an7Var22.f(16, !ai4Var.q("gcm.n.sticky"));
                an7Var22.t = ai4Var.q("gcm.n.local_only");
                y5 = ai4Var.y("gcm.n.ticker");
                if (y5 != null) {
                }
                r = ai4Var.r("gcm.n.notification_priority");
                if (r != null) {
                }
                r = null;
                if (r != null) {
                }
                r2 = ai4Var.r("gcm.n.visibility");
                if (r2 != null) {
                }
                r2 = null;
                if (r2 != null) {
                }
                r3 = ai4Var.r("gcm.n.notification_count");
                if (r3 != null) {
                }
                r3 = null;
                if (r3 != null) {
                }
                y6 = ai4Var.y("gcm.n.event_time");
                if (!TextUtils.isEmpty(y6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                t = ai4Var.t("gcm.n.vibrate_timings");
                if (t != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                t2 = ai4Var.t("gcm.n.light_settings");
                if (t2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean q22222222222 = ai4Var.q("gcm.n.default_sound");
                boolean z22222222222 = q22222222222;
                if (ai4Var.q("gcm.n.default_vibrate_timings")) {
                }
                r0 = z22222222222;
                if (ai4Var.q("gcm.n.default_light_settings")) {
                }
                notification222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                y7 = ai4Var.y("gcm.n.tag");
                if (TextUtils.isEmpty(y7)) {
                }
                return new lx6(an7Var22, y7, (byte) 15);
            }
        }
        y8 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        an7 an7Var222 = new an7(firebaseMessagingService, y8);
        x = ai4Var.x(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(x)) {
        }
        x2 = ai4Var.x(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(x2)) {
        }
        y = ai4Var.y("gcm.n.icon");
        if (!TextUtils.isEmpty(y)) {
        }
        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        Notification notification2222 = an7Var222.F;
        notification2222.icon = i;
        y2 = ai4Var.y("gcm.n.sound2");
        if (TextUtils.isEmpty(y2)) {
        }
        if (TextUtils.isEmpty(y2)) {
        }
        if (defaultUri != null) {
        }
        y3 = ai4Var.y("gcm.n.click_action");
        if (TextUtils.isEmpty(y3)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        an7Var222.g = activity;
        if (!ai4Var.q("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        y4 = ai4Var.y("gcm.n.color");
        if (!TextUtils.isEmpty(y4)) {
        }
        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        an7Var222.f(16, !ai4Var.q("gcm.n.sticky"));
        an7Var222.t = ai4Var.q("gcm.n.local_only");
        y5 = ai4Var.y("gcm.n.ticker");
        if (y5 != null) {
        }
        r = ai4Var.r("gcm.n.notification_priority");
        if (r != null) {
        }
        r = null;
        if (r != null) {
        }
        r2 = ai4Var.r("gcm.n.visibility");
        if (r2 != null) {
        }
        r2 = null;
        if (r2 != null) {
        }
        r3 = ai4Var.r("gcm.n.notification_count");
        if (r3 != null) {
        }
        r3 = null;
        if (r3 != null) {
        }
        y6 = ai4Var.y("gcm.n.event_time");
        if (!TextUtils.isEmpty(y6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        t = ai4Var.t("gcm.n.vibrate_timings");
        if (t != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        t2 = ai4Var.t("gcm.n.light_settings");
        if (t2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean q222222222222 = ai4Var.q("gcm.n.default_sound");
        boolean z222222222222 = q222222222222;
        if (ai4Var.q("gcm.n.default_vibrate_timings")) {
        }
        r0 = z222222222222;
        if (ai4Var.q("gcm.n.default_light_settings")) {
        }
        notification2222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        y7 = ai4Var.y("gcm.n.tag");
        if (TextUtils.isEmpty(y7)) {
        }
        return new lx6(an7Var222, y7, (byte) 15);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
