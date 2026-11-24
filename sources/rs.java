// default package

import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Insets;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class rs {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            ul1.n();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (u36.e(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && qqe.a == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int d2 = d(true);
                    if (i5 < 35) {
                        qqe.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    } else {
                        qqe.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    }
                }
                z = false;
                qqe.a = Boolean.valueOf(z);
                if (!z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static int b(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new sn7(context).a() ? 0 : -1;
        }
        gxc.d("permission must be non-null");
        return 0;
    }

    public static LocusId c(String str) {
        return new LocusId(str);
    }

    public static int d(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            fo4 fo4Var = new fo4();
            fo4Var.s = wf7.n("video/avc");
            go4 go4Var = new go4(fo4Var);
            if (go4Var.t != null) {
                y79 g = tm6.g(go4Var, z, false);
                for (int i = 0; i < g.d; i++) {
                    if (((lm6) g.get(i)).d != null && (videoCapabilities = ((lm6) g.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        ul1.n();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (u36.e(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (qm6 unused) {
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
    
        if (r6 == r8.hashCode()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList e(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ic9 ic9Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        jc9 jc9Var = new jc9(resources, theme);
        synchronized (kc9.c) {
            SparseArray sparseArray = (SparseArray) kc9.b.get(jc9Var);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (ic9Var = (ic9) sparseArray.get(i)) != null) {
                if (ic9Var.b.equals(resources.getConfiguration())) {
                    int i2 = ic9Var.c;
                    if (theme == null) {
                        if (i2 != 0) {
                        }
                        colorStateList2 = ic9Var.a;
                    }
                }
                sparseArray.remove(i);
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = kc9.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = nn2.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        kc9.a(jc9Var, i, colorStateList, theme);
        return colorStateList;
    }

    public static y79 f(o00 o00Var) {
        jo5 p = mo5.p();
        qo5 qo5Var = r00.h;
        yo5 yo5Var = qo5Var.b;
        if (yo5Var == null) {
            yo5Var = qo5Var.d();
            qo5Var.b = yo5Var;
        }
        v7c it = yo5Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= hac.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), o00Var.b())) {
                p.c(num);
            }
        }
        p.c(2);
        return p.f();
    }

    public static Executor g(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? fp.i(context) : new yj0(new Handler(context.getMainLooper()), (byte) 2);
    }

    public static int h(int i, int i2, o00 o00Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = hac.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), o00Var.b())) {
                return i3;
            }
        }
        return 0;
    }

    public static String i(Context context) {
        return context.getOpPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (vte.a(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                Tasks.forResult(null);
                return;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                    SharedPreferences.Editor edit = vte.a(context).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } else {
                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                }
                taskCompletionSource.trySetResult(null);
                taskCompletionSource.getTask();
                return;
            } catch (Throwable th) {
                taskCompletionSource.trySetResult(null);
                throw th;
            }
        }
        z = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean k(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static String l(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (tse.b(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (tse.b(context, str) == 0) {
                return str;
            }
        }
        zo4.k(kt6.o("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static Insets m(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            nq5.g(context, broadcastReceiver, intentFilter, 2);
        } else if (i >= 26) {
            i10.h(context, broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    public static void o(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void p(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    public static void q(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void r(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void s(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void t(AudioAttributes.Builder builder, boolean z) {
        builder.setHapticChannelsMuted(z);
    }

    public static void u(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
