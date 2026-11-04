package za;

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
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(77:0|1|2|3|(1:5)|231|7|8|(3:207|208|(73:210|(66:212|(1:214)|11|(1:13)|14|(1:16)|17|(57:19|(1:193)|23|(1:25)|26|(1:28)(2:183|(1:188)(1:187))|29|(1:31)|32|(1:34)(5:171|(1:173)|174|(1:176)(1:182)|(1:178)(2:179|(1:181)))|35|(1:37)(6:153|(4:156|(2:164|165)(1:162)|163|154)|166|167|(1:169)|170)|38|(1:40)(1:152)|(1:42)|43|(39:148|149|(1:49)|50|(1:52)|53|(33:139|(1:143)|(1:57)|58|(29:134|(1:138)|(1:62)|63|(25:131|(1:133)|(1:67)|68|(21:127|128|(1:72)|73|(3:117|118|(18:120|(1:122)|123|(1:77)|78|(4:102|103|104|(2:106|(12:108|(3:82|(1:85)|86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|100)(2:109|110))(2:111|112))|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(2:124|125))|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|45|(39:144|145|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|194|(2:202|203)|(1:201)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|215|(69:217|(1:219)|11|(0)|14|(0)|17|(0)|194|(1:196)|202|203|(1:199)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(1:227)|220|(3:222|(1:224)(1:226)|225)|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100))|10|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x015d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x015e, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0535  */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(FirebaseMessagingService firebaseMessagingService, y00 y00Var) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String t10;
        String t11;
        String u10;
        int i3;
        String u11;
        Uri defaultUri;
        String u12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String u13;
        Integer valueOf;
        String u14;
        Integer o10;
        Integer o11;
        Integer o12;
        String u15;
        Long valueOf2;
        JSONArray p10;
        long[] jArr;
        JSONArray p11;
        int[] iArr;
        ?? r02;
        String u16;
        int i10;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String u17 = y00Var.u("gcm.n.android_channel_id");
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(u17)) {
                    if (notificationManager.getNotificationChannel(u17) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + u17 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar = new e0.q(firebaseMessagingService, u17);
                    t10 = y00Var.t(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(t10)) {
                        qVar.g(t10);
                    }
                    t11 = y00Var.t(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(t11)) {
                        qVar.f(t11);
                        e0.l lVar = new e0.l(false);
                        lVar.f = e0.q.d(t11);
                        qVar.n(lVar);
                    }
                    u10 = y00Var.u("gcm.n.icon");
                    if (!TextUtils.isEmpty(u10)) {
                        i3 = resources.getIdentifier(u10, "drawable", packageName);
                        if ((i3 == 0 || !b(resources, i3)) && ((i3 = resources.getIdentifier(u10, "mipmap", packageName)) == 0 || !b(resources, i3))) {
                            Log.w("FirebaseMessaging", "Icon resource " + u10 + " not found. Notification will use default icon.");
                        }
                        qVar.F.icon = i3;
                        u11 = y00Var.u("gcm.n.sound2");
                        if (TextUtils.isEmpty(u11)) {
                            u11 = y00Var.u("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(u11)) {
                            defaultUri = null;
                        } else if ("default".equals(u11) || resources.getIdentifier(u11, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + u11);
                        }
                        if (defaultUri != null) {
                            Notification notification = qVar.F;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.p.a(e0.p.e(e0.p.c(e0.p.b(), 4), 5));
                        }
                        u12 = y00Var.u("gcm.n.click_action");
                        if (TextUtils.isEmpty(u12)) {
                            String u18 = y00Var.u("gcm.n.link_android");
                            if (TextUtils.isEmpty(u18)) {
                                u18 = y00Var.u("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(u18) ? Uri.parse(u18) : null;
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
                            launchIntentForPackage = new Intent(u12);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) y00Var.a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (y00Var.j("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", y00Var.z());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        qVar.g = activity;
                        broadcast = !y00Var.j("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(y00Var.z())), 1140850688);
                        if (broadcast != null) {
                            qVar.F.deleteIntent = broadcast;
                        }
                        u13 = y00Var.u("gcm.n.color");
                        if (!TextUtils.isEmpty(u13)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(u13));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + u13 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                qVar.w = valueOf.intValue();
                            }
                            qVar.h(16, !y00Var.j("gcm.n.sticky"));
                            qVar.t = y00Var.j("gcm.n.local_only");
                            u14 = y00Var.u("gcm.n.ticker");
                            if (u14 != null) {
                                qVar.p(u14);
                            }
                            o10 = y00Var.o("gcm.n.notification_priority");
                            if (o10 != null) {
                                if (o10.intValue() < -2 || o10.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + o10 + ". Skipping setting notificationPriority.");
                                }
                                if (o10 != null) {
                                    qVar.j = o10.intValue();
                                }
                                o11 = y00Var.o("gcm.n.visibility");
                                if (o11 != null) {
                                    if (o11.intValue() < -1 || o11.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + o11 + ". Skipping setting visibility.");
                                    }
                                    if (o11 != null) {
                                        qVar.x = o11.intValue();
                                    }
                                    o12 = y00Var.o("gcm.n.notification_count");
                                    if (o12 != null) {
                                        if (o12.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + o12 + ". Skipping setting notificationCount.");
                                        }
                                        if (o12 != null) {
                                            qVar.i = o12.intValue();
                                        }
                                        u15 = y00Var.u("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(u15)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(u15));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + y00.C("gcm.n.event_time") + "(" + u15 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                qVar.k = true;
                                                qVar.F.when = valueOf2.longValue();
                                            }
                                            p10 = y00Var.p("gcm.n.vibrate_timings");
                                            if (p10 != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + p10 + ". Skipping setting vibrateTimings.");
                                                }
                                                if (p10.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = p10.length();
                                                jArr = new long[length];
                                                for (int i12 = 0; i12 < length; i12++) {
                                                    jArr[i12] = p10.optLong(i12);
                                                }
                                                if (jArr != null) {
                                                    qVar.F.vibrate = jArr;
                                                }
                                                p11 = y00Var.p("gcm.n.light_settings");
                                                if (p11 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e11) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + p11 + ". " + e11.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + p11 + ". Skipping setting LightSettings");
                                                    }
                                                    if (p11.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(p11.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = p11.optInt(1);
                                                    iArr2[2] = p11.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i13 = iArr[0];
                                                        int i14 = iArr[1];
                                                        int i15 = iArr[2];
                                                        Notification notification2 = qVar.F;
                                                        notification2.ledARGB = i13;
                                                        notification2.ledOnMS = i14;
                                                        notification2.ledOffMS = i15;
                                                        if (i14 != 0 && i15 != 0) {
                                                            i11 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i11;
                                                    }
                                                    boolean j10 = y00Var.j("gcm.n.default_sound");
                                                    boolean z10 = j10;
                                                    if (y00Var.j("gcm.n.default_vibrate_timings")) {
                                                        z10 = (j10 ? 1 : 0) | 2;
                                                    }
                                                    r02 = z10;
                                                    if (y00Var.j("gcm.n.default_light_settings")) {
                                                        r02 = (z10 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = qVar.F;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    u16 = y00Var.u("gcm.n.tag");
                                                    if (TextUtils.isEmpty(u16)) {
                                                        u16 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new g(qVar, u16);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean j102 = y00Var.j("gcm.n.default_sound");
                                                boolean z102 = j102;
                                                if (y00Var.j("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z102;
                                                if (y00Var.j("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = qVar.F;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                u16 = y00Var.u("gcm.n.tag");
                                                if (TextUtils.isEmpty(u16)) {
                                                }
                                                return new g(qVar, u16);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            p11 = y00Var.p("gcm.n.light_settings");
                                            if (p11 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean j1022 = y00Var.j("gcm.n.default_sound");
                                            boolean z1022 = j1022;
                                            if (y00Var.j("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z1022;
                                            if (y00Var.j("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = qVar.F;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            u16 = y00Var.u("gcm.n.tag");
                                            if (TextUtils.isEmpty(u16)) {
                                            }
                                            return new g(qVar, u16);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        p10 = y00Var.p("gcm.n.vibrate_timings");
                                        if (p10 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        p11 = y00Var.p("gcm.n.light_settings");
                                        if (p11 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean j10222 = y00Var.j("gcm.n.default_sound");
                                        boolean z10222 = j10222;
                                        if (y00Var.j("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z10222;
                                        if (y00Var.j("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = qVar.F;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        u16 = y00Var.u("gcm.n.tag");
                                        if (TextUtils.isEmpty(u16)) {
                                        }
                                        return new g(qVar, u16);
                                    }
                                    o12 = null;
                                    if (o12 != null) {
                                    }
                                    u15 = y00Var.u("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(u15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    p10 = y00Var.p("gcm.n.vibrate_timings");
                                    if (p10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    p11 = y00Var.p("gcm.n.light_settings");
                                    if (p11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean j102222 = y00Var.j("gcm.n.default_sound");
                                    boolean z102222 = j102222;
                                    if (y00Var.j("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (y00Var.j("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = qVar.F;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    u16 = y00Var.u("gcm.n.tag");
                                    if (TextUtils.isEmpty(u16)) {
                                    }
                                    return new g(qVar, u16);
                                }
                                o11 = null;
                                if (o11 != null) {
                                }
                                o12 = y00Var.o("gcm.n.notification_count");
                                if (o12 != null) {
                                }
                                o12 = null;
                                if (o12 != null) {
                                }
                                u15 = y00Var.u("gcm.n.event_time");
                                if (!TextUtils.isEmpty(u15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                p10 = y00Var.p("gcm.n.vibrate_timings");
                                if (p10 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                p11 = y00Var.p("gcm.n.light_settings");
                                if (p11 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean j1022222 = y00Var.j("gcm.n.default_sound");
                                boolean z1022222 = j1022222;
                                if (y00Var.j("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (y00Var.j("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = qVar.F;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                u16 = y00Var.u("gcm.n.tag");
                                if (TextUtils.isEmpty(u16)) {
                                }
                                return new g(qVar, u16);
                            }
                            o10 = null;
                            if (o10 != null) {
                            }
                            o11 = y00Var.o("gcm.n.visibility");
                            if (o11 != null) {
                            }
                            o11 = null;
                            if (o11 != null) {
                            }
                            o12 = y00Var.o("gcm.n.notification_count");
                            if (o12 != null) {
                            }
                            o12 = null;
                            if (o12 != null) {
                            }
                            u15 = y00Var.u("gcm.n.event_time");
                            if (!TextUtils.isEmpty(u15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            p10 = y00Var.p("gcm.n.vibrate_timings");
                            if (p10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            p11 = y00Var.p("gcm.n.light_settings");
                            if (p11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean j10222222 = y00Var.j("gcm.n.default_sound");
                            boolean z10222222 = j10222222;
                            if (y00Var.j("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z10222222;
                            if (y00Var.j("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = qVar.F;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            u16 = y00Var.u("gcm.n.tag");
                            if (TextUtils.isEmpty(u16)) {
                            }
                            return new g(qVar, u16);
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i10));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            qVar.h(16, !y00Var.j("gcm.n.sticky"));
                            qVar.t = y00Var.j("gcm.n.local_only");
                            u14 = y00Var.u("gcm.n.ticker");
                            if (u14 != null) {
                            }
                            o10 = y00Var.o("gcm.n.notification_priority");
                            if (o10 != null) {
                            }
                            o10 = null;
                            if (o10 != null) {
                            }
                            o11 = y00Var.o("gcm.n.visibility");
                            if (o11 != null) {
                            }
                            o11 = null;
                            if (o11 != null) {
                            }
                            o12 = y00Var.o("gcm.n.notification_count");
                            if (o12 != null) {
                            }
                            o12 = null;
                            if (o12 != null) {
                            }
                            u15 = y00Var.u("gcm.n.event_time");
                            if (!TextUtils.isEmpty(u15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            p10 = y00Var.p("gcm.n.vibrate_timings");
                            if (p10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            p11 = y00Var.p("gcm.n.light_settings");
                            if (p11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean j102222222 = y00Var.j("gcm.n.default_sound");
                            boolean z102222222 = j102222222;
                            if (y00Var.j("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z102222222;
                            if (y00Var.j("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = qVar.F;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            u16 = y00Var.u("gcm.n.tag");
                            if (TextUtils.isEmpty(u16)) {
                            }
                            return new g(qVar, u16);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        qVar.h(16, !y00Var.j("gcm.n.sticky"));
                        qVar.t = y00Var.j("gcm.n.local_only");
                        u14 = y00Var.u("gcm.n.ticker");
                        if (u14 != null) {
                        }
                        o10 = y00Var.o("gcm.n.notification_priority");
                        if (o10 != null) {
                        }
                        o10 = null;
                        if (o10 != null) {
                        }
                        o11 = y00Var.o("gcm.n.visibility");
                        if (o11 != null) {
                        }
                        o11 = null;
                        if (o11 != null) {
                        }
                        o12 = y00Var.o("gcm.n.notification_count");
                        if (o12 != null) {
                        }
                        o12 = null;
                        if (o12 != null) {
                        }
                        u15 = y00Var.u("gcm.n.event_time");
                        if (!TextUtils.isEmpty(u15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        p10 = y00Var.p("gcm.n.vibrate_timings");
                        if (p10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        p11 = y00Var.p("gcm.n.light_settings");
                        if (p11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean j1022222222 = y00Var.j("gcm.n.default_sound");
                        boolean z1022222222 = j1022222222;
                        if (y00Var.j("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z1022222222;
                        if (y00Var.j("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = qVar.F;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        u16 = y00Var.u("gcm.n.tag");
                        if (TextUtils.isEmpty(u16)) {
                        }
                        return new g(qVar, u16);
                    }
                    i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i3 != 0 || !b(resources, i3)) {
                        i3 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i3 != 0 || !b(resources, i3)) {
                        i3 = 17301651;
                    }
                    qVar.F.icon = i3;
                    u11 = y00Var.u("gcm.n.sound2");
                    if (TextUtils.isEmpty(u11)) {
                    }
                    if (TextUtils.isEmpty(u11)) {
                    }
                    if (defaultUri != null) {
                    }
                    u12 = y00Var.u("gcm.n.click_action");
                    if (TextUtils.isEmpty(u12)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar.g = activity;
                    if (!y00Var.j("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    u13 = y00Var.u("gcm.n.color");
                    if (!TextUtils.isEmpty(u13)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar.h(16, !y00Var.j("gcm.n.sticky"));
                    qVar.t = y00Var.j("gcm.n.local_only");
                    u14 = y00Var.u("gcm.n.ticker");
                    if (u14 != null) {
                    }
                    o10 = y00Var.o("gcm.n.notification_priority");
                    if (o10 != null) {
                    }
                    o10 = null;
                    if (o10 != null) {
                    }
                    o11 = y00Var.o("gcm.n.visibility");
                    if (o11 != null) {
                    }
                    o11 = null;
                    if (o11 != null) {
                    }
                    o12 = y00Var.o("gcm.n.notification_count");
                    if (o12 != null) {
                    }
                    o12 = null;
                    if (o12 != null) {
                    }
                    u15 = y00Var.u("gcm.n.event_time");
                    if (!TextUtils.isEmpty(u15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    p10 = y00Var.p("gcm.n.vibrate_timings");
                    if (p10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    p11 = y00Var.p("gcm.n.light_settings");
                    if (p11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean j10222222222 = y00Var.j("gcm.n.default_sound");
                    boolean z10222222222 = j10222222222;
                    if (y00Var.j("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z10222222222;
                    if (y00Var.j("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = qVar.F;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    u16 = y00Var.u("gcm.n.tag");
                    if (TextUtils.isEmpty(u16)) {
                    }
                    return new g(qVar, u16);
                }
                u17 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(u17)) {
                    if (notificationManager.getNotificationChannel(u17) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar2 = new e0.q(firebaseMessagingService, u17);
                    t10 = y00Var.t(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(t10)) {
                    }
                    t11 = y00Var.t(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(t11)) {
                    }
                    u10 = y00Var.u("gcm.n.icon");
                    if (!TextUtils.isEmpty(u10)) {
                    }
                    i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i3 != 0) {
                    }
                    i3 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i3 != 0) {
                    }
                    i3 = 17301651;
                    qVar2.F.icon = i3;
                    u11 = y00Var.u("gcm.n.sound2");
                    if (TextUtils.isEmpty(u11)) {
                    }
                    if (TextUtils.isEmpty(u11)) {
                    }
                    if (defaultUri != null) {
                    }
                    u12 = y00Var.u("gcm.n.click_action");
                    if (TextUtils.isEmpty(u12)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar2.g = activity;
                    if (!y00Var.j("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    u13 = y00Var.u("gcm.n.color");
                    if (!TextUtils.isEmpty(u13)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar2.h(16, !y00Var.j("gcm.n.sticky"));
                    qVar2.t = y00Var.j("gcm.n.local_only");
                    u14 = y00Var.u("gcm.n.ticker");
                    if (u14 != null) {
                    }
                    o10 = y00Var.o("gcm.n.notification_priority");
                    if (o10 != null) {
                    }
                    o10 = null;
                    if (o10 != null) {
                    }
                    o11 = y00Var.o("gcm.n.visibility");
                    if (o11 != null) {
                    }
                    o11 = null;
                    if (o11 != null) {
                    }
                    o12 = y00Var.o("gcm.n.notification_count");
                    if (o12 != null) {
                    }
                    o12 = null;
                    if (o12 != null) {
                    }
                    u15 = y00Var.u("gcm.n.event_time");
                    if (!TextUtils.isEmpty(u15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    p10 = y00Var.p("gcm.n.vibrate_timings");
                    if (p10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    p11 = y00Var.p("gcm.n.light_settings");
                    if (p11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean j102222222222 = y00Var.j("gcm.n.default_sound");
                    boolean z102222222222 = j102222222222;
                    if (y00Var.j("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z102222222222;
                    if (y00Var.j("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = qVar2.F;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    u16 = y00Var.u("gcm.n.tag");
                    if (TextUtils.isEmpty(u16)) {
                    }
                    return new g(qVar2, u16);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                u17 = "fcm_fallback_notification_channel";
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
                e0.q qVar22 = new e0.q(firebaseMessagingService, u17);
                t10 = y00Var.t(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(t10)) {
                }
                t11 = y00Var.t(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(t11)) {
                }
                u10 = y00Var.u("gcm.n.icon");
                if (!TextUtils.isEmpty(u10)) {
                }
                i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i3 != 0) {
                }
                i3 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i3 != 0) {
                }
                i3 = 17301651;
                qVar22.F.icon = i3;
                u11 = y00Var.u("gcm.n.sound2");
                if (TextUtils.isEmpty(u11)) {
                }
                if (TextUtils.isEmpty(u11)) {
                }
                if (defaultUri != null) {
                }
                u12 = y00Var.u("gcm.n.click_action");
                if (TextUtils.isEmpty(u12)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                qVar22.g = activity;
                if (!y00Var.j("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                u13 = y00Var.u("gcm.n.color");
                if (!TextUtils.isEmpty(u13)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                qVar22.h(16, !y00Var.j("gcm.n.sticky"));
                qVar22.t = y00Var.j("gcm.n.local_only");
                u14 = y00Var.u("gcm.n.ticker");
                if (u14 != null) {
                }
                o10 = y00Var.o("gcm.n.notification_priority");
                if (o10 != null) {
                }
                o10 = null;
                if (o10 != null) {
                }
                o11 = y00Var.o("gcm.n.visibility");
                if (o11 != null) {
                }
                o11 = null;
                if (o11 != null) {
                }
                o12 = y00Var.o("gcm.n.notification_count");
                if (o12 != null) {
                }
                o12 = null;
                if (o12 != null) {
                }
                u15 = y00Var.u("gcm.n.event_time");
                if (!TextUtils.isEmpty(u15)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                p10 = y00Var.p("gcm.n.vibrate_timings");
                if (p10 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                p11 = y00Var.p("gcm.n.light_settings");
                if (p11 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean j1022222222222 = y00Var.j("gcm.n.default_sound");
                boolean z1022222222222 = j1022222222222;
                if (y00Var.j("gcm.n.default_vibrate_timings")) {
                }
                r02 = z1022222222222;
                if (y00Var.j("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = qVar22.F;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                u16 = y00Var.u("gcm.n.tag");
                if (TextUtils.isEmpty(u16)) {
                }
                return new g(qVar22, u16);
            }
        }
        u17 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.q qVar222 = new e0.q(firebaseMessagingService, u17);
        t10 = y00Var.t(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(t10)) {
        }
        t11 = y00Var.t(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(t11)) {
        }
        u10 = y00Var.u("gcm.n.icon");
        if (!TextUtils.isEmpty(u10)) {
        }
        i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i3 != 0) {
        }
        i3 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i3 != 0) {
        }
        i3 = 17301651;
        qVar222.F.icon = i3;
        u11 = y00Var.u("gcm.n.sound2");
        if (TextUtils.isEmpty(u11)) {
        }
        if (TextUtils.isEmpty(u11)) {
        }
        if (defaultUri != null) {
        }
        u12 = y00Var.u("gcm.n.click_action");
        if (TextUtils.isEmpty(u12)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        qVar222.g = activity;
        if (!y00Var.j("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        u13 = y00Var.u("gcm.n.color");
        if (!TextUtils.isEmpty(u13)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        qVar222.h(16, !y00Var.j("gcm.n.sticky"));
        qVar222.t = y00Var.j("gcm.n.local_only");
        u14 = y00Var.u("gcm.n.ticker");
        if (u14 != null) {
        }
        o10 = y00Var.o("gcm.n.notification_priority");
        if (o10 != null) {
        }
        o10 = null;
        if (o10 != null) {
        }
        o11 = y00Var.o("gcm.n.visibility");
        if (o11 != null) {
        }
        o11 = null;
        if (o11 != null) {
        }
        o12 = y00Var.o("gcm.n.notification_count");
        if (o12 != null) {
        }
        o12 = null;
        if (o12 != null) {
        }
        u15 = y00Var.u("gcm.n.event_time");
        if (!TextUtils.isEmpty(u15)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        p10 = y00Var.p("gcm.n.vibrate_timings");
        if (p10 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        p11 = y00Var.p("gcm.n.light_settings");
        if (p11 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean j10222222222222 = y00Var.j("gcm.n.default_sound");
        boolean z10222222222222 = j10222222222222;
        if (y00Var.j("gcm.n.default_vibrate_timings")) {
        }
        r02 = z10222222222222;
        if (y00Var.j("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = qVar222.F;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        u16 = y00Var.u("gcm.n.tag");
        if (TextUtils.isEmpty(u16)) {
        }
        return new g(qVar222, u16);
    }

    public static boolean b(Resources resources, int i3) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i3, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i3);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i3 + ", treating it as an invalid icon");
            return false;
        }
    }
}
