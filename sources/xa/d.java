package xa;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public static g a(FirebaseMessagingService firebaseMessagingService, r2.y yVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String W;
        String W2;
        String X;
        int i10;
        String X2;
        Uri defaultUri;
        String X3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String X4;
        Integer valueOf;
        String X5;
        Integer S;
        Integer S2;
        Integer S3;
        String X6;
        Long valueOf2;
        JSONArray T;
        long[] jArr;
        JSONArray T2;
        int[] iArr;
        ?? r02;
        String X7;
        int i11;
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
        String X8 = yVar.X("gcm.n.android_channel_id");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(X8)) {
                    if (notificationManager.getNotificationChannel(X8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + X8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.r rVar = new e0.r(firebaseMessagingService, X8);
                    W = yVar.W(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(W)) {
                        rVar.g(W);
                    }
                    W2 = yVar.W(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(W2)) {
                        rVar.f(W2);
                        e0.m mVar = new e0.m(false);
                        mVar.f = e0.r.d(W2);
                        rVar.n(mVar);
                    }
                    X = yVar.X("gcm.n.icon");
                    if (!TextUtils.isEmpty(X)) {
                        i10 = resources.getIdentifier(X, "drawable", packageName);
                        if ((i10 == 0 || !b(resources, i10)) && ((i10 = resources.getIdentifier(X, "mipmap", packageName)) == 0 || !b(resources, i10))) {
                            Log.w("FirebaseMessaging", "Icon resource " + X + " not found. Notification will use default icon.");
                        }
                        rVar.F.icon = i10;
                        X2 = yVar.X("gcm.n.sound2");
                        if (TextUtils.isEmpty(X2)) {
                            X2 = yVar.X("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(X2)) {
                            defaultUri = null;
                        } else if ("default".equals(X2) || resources.getIdentifier(X2, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + X2);
                        }
                        if (defaultUri != null) {
                            Notification notification = rVar.F;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.q.a(e0.q.e(e0.q.c(e0.q.b(), 4), 5));
                        }
                        X3 = yVar.X("gcm.n.click_action");
                        if (TextUtils.isEmpty(X3)) {
                            String X9 = yVar.X("gcm.n.link_android");
                            if (TextUtils.isEmpty(X9)) {
                                X9 = yVar.X("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(X9) ? Uri.parse(X9) : null;
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
                            launchIntentForPackage = new Intent(X3);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) yVar.b;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (yVar.R("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", yVar.Z());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        rVar.g = activity;
                        broadcast = !yVar.R("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(yVar.Z())), 1140850688);
                        if (broadcast != null) {
                            rVar.F.deleteIntent = broadcast;
                        }
                        X4 = yVar.X("gcm.n.color");
                        if (!TextUtils.isEmpty(X4)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(X4));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + X4 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                rVar.w = valueOf.intValue();
                            }
                            rVar.h(16, !yVar.R("gcm.n.sticky"));
                            rVar.t = yVar.R("gcm.n.local_only");
                            X5 = yVar.X("gcm.n.ticker");
                            if (X5 != null) {
                                rVar.p(X5);
                            }
                            S = yVar.S("gcm.n.notification_priority");
                            if (S != null) {
                                if (S.intValue() < -2 || S.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + S + ". Skipping setting notificationPriority.");
                                }
                                if (S != null) {
                                    rVar.j = S.intValue();
                                }
                                S2 = yVar.S("gcm.n.visibility");
                                if (S2 != null) {
                                    if (S2.intValue() < -1 || S2.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + S2 + ". Skipping setting visibility.");
                                    }
                                    if (S2 != null) {
                                        rVar.x = S2.intValue();
                                    }
                                    S3 = yVar.S("gcm.n.notification_count");
                                    if (S3 != null) {
                                        if (S3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + S3 + ". Skipping setting notificationCount.");
                                        }
                                        if (S3 != null) {
                                            rVar.i = S3.intValue();
                                        }
                                        X6 = yVar.X("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(X6)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(X6));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + r2.y.b0("gcm.n.event_time") + "(" + X6 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                rVar.k = true;
                                                rVar.F.when = valueOf2.longValue();
                                            }
                                            T = yVar.T("gcm.n.vibrate_timings");
                                            if (T != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + T + ". Skipping setting vibrateTimings.");
                                                }
                                                if (T.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = T.length();
                                                jArr = new long[length];
                                                for (int i13 = 0; i13 < length; i13++) {
                                                    jArr[i13] = T.optLong(i13);
                                                }
                                                if (jArr != null) {
                                                    rVar.F.vibrate = jArr;
                                                }
                                                T2 = yVar.T("gcm.n.light_settings");
                                                if (T2 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e7) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + T2 + ". " + e7.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + T2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (T2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(T2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = T2.optInt(1);
                                                    iArr2[2] = T2.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i14 = iArr[0];
                                                        int i15 = iArr[1];
                                                        int i16 = iArr[2];
                                                        Notification notification2 = rVar.F;
                                                        notification2.ledARGB = i14;
                                                        notification2.ledOnMS = i15;
                                                        notification2.ledOffMS = i16;
                                                        if (i15 != 0 && i16 != 0) {
                                                            i12 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i12;
                                                    }
                                                    boolean R = yVar.R("gcm.n.default_sound");
                                                    boolean z10 = R;
                                                    if (yVar.R("gcm.n.default_vibrate_timings")) {
                                                        z10 = (R ? 1 : 0) | 2;
                                                    }
                                                    r02 = z10;
                                                    if (yVar.R("gcm.n.default_light_settings")) {
                                                        r02 = (z10 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = rVar.F;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    X7 = yVar.X("gcm.n.tag");
                                                    if (TextUtils.isEmpty(X7)) {
                                                        X7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new g(rVar, X7);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean R2 = yVar.R("gcm.n.default_sound");
                                                boolean z102 = R2;
                                                if (yVar.R("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z102;
                                                if (yVar.R("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = rVar.F;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                X7 = yVar.X("gcm.n.tag");
                                                if (TextUtils.isEmpty(X7)) {
                                                }
                                                return new g(rVar, X7);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            T2 = yVar.T("gcm.n.light_settings");
                                            if (T2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean R22 = yVar.R("gcm.n.default_sound");
                                            boolean z1022 = R22;
                                            if (yVar.R("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z1022;
                                            if (yVar.R("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = rVar.F;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            X7 = yVar.X("gcm.n.tag");
                                            if (TextUtils.isEmpty(X7)) {
                                            }
                                            return new g(rVar, X7);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        T = yVar.T("gcm.n.vibrate_timings");
                                        if (T != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        T2 = yVar.T("gcm.n.light_settings");
                                        if (T2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean R222 = yVar.R("gcm.n.default_sound");
                                        boolean z10222 = R222;
                                        if (yVar.R("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z10222;
                                        if (yVar.R("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = rVar.F;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        X7 = yVar.X("gcm.n.tag");
                                        if (TextUtils.isEmpty(X7)) {
                                        }
                                        return new g(rVar, X7);
                                    }
                                    S3 = null;
                                    if (S3 != null) {
                                    }
                                    X6 = yVar.X("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(X6)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    T = yVar.T("gcm.n.vibrate_timings");
                                    if (T != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    T2 = yVar.T("gcm.n.light_settings");
                                    if (T2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean R2222 = yVar.R("gcm.n.default_sound");
                                    boolean z102222 = R2222;
                                    if (yVar.R("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (yVar.R("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = rVar.F;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    X7 = yVar.X("gcm.n.tag");
                                    if (TextUtils.isEmpty(X7)) {
                                    }
                                    return new g(rVar, X7);
                                }
                                S2 = null;
                                if (S2 != null) {
                                }
                                S3 = yVar.S("gcm.n.notification_count");
                                if (S3 != null) {
                                }
                                S3 = null;
                                if (S3 != null) {
                                }
                                X6 = yVar.X("gcm.n.event_time");
                                if (!TextUtils.isEmpty(X6)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                T = yVar.T("gcm.n.vibrate_timings");
                                if (T != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                T2 = yVar.T("gcm.n.light_settings");
                                if (T2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean R22222 = yVar.R("gcm.n.default_sound");
                                boolean z1022222 = R22222;
                                if (yVar.R("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (yVar.R("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = rVar.F;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                X7 = yVar.X("gcm.n.tag");
                                if (TextUtils.isEmpty(X7)) {
                                }
                                return new g(rVar, X7);
                            }
                            S = null;
                            if (S != null) {
                            }
                            S2 = yVar.S("gcm.n.visibility");
                            if (S2 != null) {
                            }
                            S2 = null;
                            if (S2 != null) {
                            }
                            S3 = yVar.S("gcm.n.notification_count");
                            if (S3 != null) {
                            }
                            S3 = null;
                            if (S3 != null) {
                            }
                            X6 = yVar.X("gcm.n.event_time");
                            if (!TextUtils.isEmpty(X6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            T = yVar.T("gcm.n.vibrate_timings");
                            if (T != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            T2 = yVar.T("gcm.n.light_settings");
                            if (T2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean R222222 = yVar.R("gcm.n.default_sound");
                            boolean z10222222 = R222222;
                            if (yVar.R("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z10222222;
                            if (yVar.R("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = rVar.F;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            X7 = yVar.X("gcm.n.tag");
                            if (TextUtils.isEmpty(X7)) {
                            }
                            return new g(rVar, X7);
                        }
                        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i11 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i11));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            rVar.h(16, !yVar.R("gcm.n.sticky"));
                            rVar.t = yVar.R("gcm.n.local_only");
                            X5 = yVar.X("gcm.n.ticker");
                            if (X5 != null) {
                            }
                            S = yVar.S("gcm.n.notification_priority");
                            if (S != null) {
                            }
                            S = null;
                            if (S != null) {
                            }
                            S2 = yVar.S("gcm.n.visibility");
                            if (S2 != null) {
                            }
                            S2 = null;
                            if (S2 != null) {
                            }
                            S3 = yVar.S("gcm.n.notification_count");
                            if (S3 != null) {
                            }
                            S3 = null;
                            if (S3 != null) {
                            }
                            X6 = yVar.X("gcm.n.event_time");
                            if (!TextUtils.isEmpty(X6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            T = yVar.T("gcm.n.vibrate_timings");
                            if (T != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            T2 = yVar.T("gcm.n.light_settings");
                            if (T2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean R2222222 = yVar.R("gcm.n.default_sound");
                            boolean z102222222 = R2222222;
                            if (yVar.R("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z102222222;
                            if (yVar.R("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = rVar.F;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            X7 = yVar.X("gcm.n.tag");
                            if (TextUtils.isEmpty(X7)) {
                            }
                            return new g(rVar, X7);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        rVar.h(16, !yVar.R("gcm.n.sticky"));
                        rVar.t = yVar.R("gcm.n.local_only");
                        X5 = yVar.X("gcm.n.ticker");
                        if (X5 != null) {
                        }
                        S = yVar.S("gcm.n.notification_priority");
                        if (S != null) {
                        }
                        S = null;
                        if (S != null) {
                        }
                        S2 = yVar.S("gcm.n.visibility");
                        if (S2 != null) {
                        }
                        S2 = null;
                        if (S2 != null) {
                        }
                        S3 = yVar.S("gcm.n.notification_count");
                        if (S3 != null) {
                        }
                        S3 = null;
                        if (S3 != null) {
                        }
                        X6 = yVar.X("gcm.n.event_time");
                        if (!TextUtils.isEmpty(X6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        T = yVar.T("gcm.n.vibrate_timings");
                        if (T != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        T2 = yVar.T("gcm.n.light_settings");
                        if (T2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean R22222222 = yVar.R("gcm.n.default_sound");
                        boolean z1022222222 = R22222222;
                        if (yVar.R("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z1022222222;
                        if (yVar.R("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = rVar.F;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        X7 = yVar.X("gcm.n.tag");
                        if (TextUtils.isEmpty(X7)) {
                        }
                        return new g(rVar, X7);
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = 17301651;
                    }
                    rVar.F.icon = i10;
                    X2 = yVar.X("gcm.n.sound2");
                    if (TextUtils.isEmpty(X2)) {
                    }
                    if (TextUtils.isEmpty(X2)) {
                    }
                    if (defaultUri != null) {
                    }
                    X3 = yVar.X("gcm.n.click_action");
                    if (TextUtils.isEmpty(X3)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    rVar.g = activity;
                    if (!yVar.R("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    X4 = yVar.X("gcm.n.color");
                    if (!TextUtils.isEmpty(X4)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    rVar.h(16, !yVar.R("gcm.n.sticky"));
                    rVar.t = yVar.R("gcm.n.local_only");
                    X5 = yVar.X("gcm.n.ticker");
                    if (X5 != null) {
                    }
                    S = yVar.S("gcm.n.notification_priority");
                    if (S != null) {
                    }
                    S = null;
                    if (S != null) {
                    }
                    S2 = yVar.S("gcm.n.visibility");
                    if (S2 != null) {
                    }
                    S2 = null;
                    if (S2 != null) {
                    }
                    S3 = yVar.S("gcm.n.notification_count");
                    if (S3 != null) {
                    }
                    S3 = null;
                    if (S3 != null) {
                    }
                    X6 = yVar.X("gcm.n.event_time");
                    if (!TextUtils.isEmpty(X6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    T = yVar.T("gcm.n.vibrate_timings");
                    if (T != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    T2 = yVar.T("gcm.n.light_settings");
                    if (T2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean R222222222 = yVar.R("gcm.n.default_sound");
                    boolean z10222222222 = R222222222;
                    if (yVar.R("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z10222222222;
                    if (yVar.R("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = rVar.F;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    X7 = yVar.X("gcm.n.tag");
                    if (TextUtils.isEmpty(X7)) {
                    }
                    return new g(rVar, X7);
                }
                X8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(X8)) {
                    if (notificationManager.getNotificationChannel(X8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.r rVar2 = new e0.r(firebaseMessagingService, X8);
                    W = yVar.W(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(W)) {
                    }
                    W2 = yVar.W(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(W2)) {
                    }
                    X = yVar.X("gcm.n.icon");
                    if (!TextUtils.isEmpty(X)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0) {
                    }
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 != 0) {
                    }
                    i10 = 17301651;
                    rVar2.F.icon = i10;
                    X2 = yVar.X("gcm.n.sound2");
                    if (TextUtils.isEmpty(X2)) {
                    }
                    if (TextUtils.isEmpty(X2)) {
                    }
                    if (defaultUri != null) {
                    }
                    X3 = yVar.X("gcm.n.click_action");
                    if (TextUtils.isEmpty(X3)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    rVar2.g = activity;
                    if (!yVar.R("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    X4 = yVar.X("gcm.n.color");
                    if (!TextUtils.isEmpty(X4)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    rVar2.h(16, !yVar.R("gcm.n.sticky"));
                    rVar2.t = yVar.R("gcm.n.local_only");
                    X5 = yVar.X("gcm.n.ticker");
                    if (X5 != null) {
                    }
                    S = yVar.S("gcm.n.notification_priority");
                    if (S != null) {
                    }
                    S = null;
                    if (S != null) {
                    }
                    S2 = yVar.S("gcm.n.visibility");
                    if (S2 != null) {
                    }
                    S2 = null;
                    if (S2 != null) {
                    }
                    S3 = yVar.S("gcm.n.notification_count");
                    if (S3 != null) {
                    }
                    S3 = null;
                    if (S3 != null) {
                    }
                    X6 = yVar.X("gcm.n.event_time");
                    if (!TextUtils.isEmpty(X6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    T = yVar.T("gcm.n.vibrate_timings");
                    if (T != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    T2 = yVar.T("gcm.n.light_settings");
                    if (T2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean R2222222222 = yVar.R("gcm.n.default_sound");
                    boolean z102222222222 = R2222222222;
                    if (yVar.R("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z102222222222;
                    if (yVar.R("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = rVar2.F;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    X7 = yVar.X("gcm.n.tag");
                    if (TextUtils.isEmpty(X7)) {
                    }
                    return new g(rVar2, X7);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                X8 = "fcm_fallback_notification_channel";
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
                e0.r rVar22 = new e0.r(firebaseMessagingService, X8);
                W = yVar.W(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(W)) {
                }
                W2 = yVar.W(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(W2)) {
                }
                X = yVar.X("gcm.n.icon");
                if (!TextUtils.isEmpty(X)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i10 != 0) {
                }
                i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i10 != 0) {
                }
                i10 = 17301651;
                rVar22.F.icon = i10;
                X2 = yVar.X("gcm.n.sound2");
                if (TextUtils.isEmpty(X2)) {
                }
                if (TextUtils.isEmpty(X2)) {
                }
                if (defaultUri != null) {
                }
                X3 = yVar.X("gcm.n.click_action");
                if (TextUtils.isEmpty(X3)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                rVar22.g = activity;
                if (!yVar.R("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                X4 = yVar.X("gcm.n.color");
                if (!TextUtils.isEmpty(X4)) {
                }
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                rVar22.h(16, !yVar.R("gcm.n.sticky"));
                rVar22.t = yVar.R("gcm.n.local_only");
                X5 = yVar.X("gcm.n.ticker");
                if (X5 != null) {
                }
                S = yVar.S("gcm.n.notification_priority");
                if (S != null) {
                }
                S = null;
                if (S != null) {
                }
                S2 = yVar.S("gcm.n.visibility");
                if (S2 != null) {
                }
                S2 = null;
                if (S2 != null) {
                }
                S3 = yVar.S("gcm.n.notification_count");
                if (S3 != null) {
                }
                S3 = null;
                if (S3 != null) {
                }
                X6 = yVar.X("gcm.n.event_time");
                if (!TextUtils.isEmpty(X6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                T = yVar.T("gcm.n.vibrate_timings");
                if (T != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                T2 = yVar.T("gcm.n.light_settings");
                if (T2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean R22222222222 = yVar.R("gcm.n.default_sound");
                boolean z1022222222222 = R22222222222;
                if (yVar.R("gcm.n.default_vibrate_timings")) {
                }
                r02 = z1022222222222;
                if (yVar.R("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = rVar22.F;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                X7 = yVar.X("gcm.n.tag");
                if (TextUtils.isEmpty(X7)) {
                }
                return new g(rVar22, X7);
            }
        }
        X8 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.r rVar222 = new e0.r(firebaseMessagingService, X8);
        W = yVar.W(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(W)) {
        }
        W2 = yVar.W(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(W2)) {
        }
        X = yVar.X("gcm.n.icon");
        if (!TextUtils.isEmpty(X)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 != 0) {
        }
        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i10 != 0) {
        }
        i10 = 17301651;
        rVar222.F.icon = i10;
        X2 = yVar.X("gcm.n.sound2");
        if (TextUtils.isEmpty(X2)) {
        }
        if (TextUtils.isEmpty(X2)) {
        }
        if (defaultUri != null) {
        }
        X3 = yVar.X("gcm.n.click_action");
        if (TextUtils.isEmpty(X3)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        rVar222.g = activity;
        if (!yVar.R("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        X4 = yVar.X("gcm.n.color");
        if (!TextUtils.isEmpty(X4)) {
        }
        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        rVar222.h(16, !yVar.R("gcm.n.sticky"));
        rVar222.t = yVar.R("gcm.n.local_only");
        X5 = yVar.X("gcm.n.ticker");
        if (X5 != null) {
        }
        S = yVar.S("gcm.n.notification_priority");
        if (S != null) {
        }
        S = null;
        if (S != null) {
        }
        S2 = yVar.S("gcm.n.visibility");
        if (S2 != null) {
        }
        S2 = null;
        if (S2 != null) {
        }
        S3 = yVar.S("gcm.n.notification_count");
        if (S3 != null) {
        }
        S3 = null;
        if (S3 != null) {
        }
        X6 = yVar.X("gcm.n.event_time");
        if (!TextUtils.isEmpty(X6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        T = yVar.T("gcm.n.vibrate_timings");
        if (T != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        T2 = yVar.T("gcm.n.light_settings");
        if (T2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean R222222222222 = yVar.R("gcm.n.default_sound");
        boolean z10222222222222 = R222222222222;
        if (yVar.R("gcm.n.default_vibrate_timings")) {
        }
        r02 = z10222222222222;
        if (yVar.R("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = rVar222.F;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        X7 = yVar.X("gcm.n.tag");
        if (TextUtils.isEmpty(X7)) {
        }
        return new g(rVar222, X7);
    }

    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
