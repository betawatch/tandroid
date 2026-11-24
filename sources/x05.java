// default package

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class x05 {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static boolean b(Context context) {
        try {
            if (!c) {
                PackageInfo b2 = s0d.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                b15.a(context);
                if (b2 == null || b15.b(b2, false) || !b15.b(b2, true)) {
                    b = false;
                } else {
                    b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            c = true;
        }
        return b || !"user".equals(Build.TYPE);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(Context context, int i) {
        boolean z;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (ggd.a) {
                if (!ggd.b) {
                    ggd.b = true;
                    try {
                        bundle = s0d.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e2);
                    }
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        ggd.c = bundle.getInt("com.google.android.gms.version");
                    }
                }
            }
            int i2 = ggd.c;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                int i3 = e05.a;
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + nm7.o1 + String.valueOf(i2).length() + nm7.X2);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i3);
                sb.append(" but found ");
                sb.append(i2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        try {
            if (!nfe.a(context)) {
                Boolean bool = nfe.c;
                if (bool == null) {
                    bool = Boolean.valueOf(ate.a() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
                    nfe.c = bool;
                }
                if (!bool.booleanValue()) {
                    z = true;
                    ite.b(i < 0);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                    b15.a(context);
                    if (!b15.b(packageInfo2, true)) {
                        if (z) {
                            ite.h(packageInfo);
                            if (!b15.b(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            } else if (!packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                            }
                        }
                        int i4 = packageInfo2.versionCode;
                        if ((i4 == -1 ? -1 : i4 / 1000) >= (i != -1 ? i / 1000 : -1)) {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e3) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e3);
                                    return 1;
                                }
                            }
                            return !applicationInfo.enabled ? 3 : 0;
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i4).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i);
                        sb2.append(" but found ");
                        sb2.append(i4);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        return 2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
            b15.a(context);
            if (!b15.b(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z = false;
        ite.b(i < 0);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z) {
        }
    }

    public static boolean d(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", TLObject.FLAG_13).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
