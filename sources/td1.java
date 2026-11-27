// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class td1 implements d5c {
    public final kj4 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final pj2 e;
    public final pj2 f;

    public td1(Context context, pj2 pj2Var, pj2 pj2Var2) {
        vw5 vw5Var = new vw5();
        i50 i50Var = i50.a;
        vw5Var.a(bh0.class, i50Var);
        vw5Var.a(y70.class, i50Var);
        p50 p50Var = p50.a;
        vw5Var.a(de6.class, p50Var);
        vw5Var.a(da0.class, p50Var);
        j50 j50Var = j50.a;
        vw5Var.a(hj2.class, j50Var);
        vw5Var.a(z70.class, j50Var);
        h50 h50Var = h50.a;
        vw5Var.a(ck.class, h50Var);
        vw5Var.a(w70.class, h50Var);
        o50 o50Var = o50.a;
        vw5Var.a(ae6.class, o50Var);
        vw5Var.a(ca0.class, o50Var);
        k50 k50Var = k50.a;
        vw5Var.a(bq2.class, k50Var);
        vw5Var.a(a80.class, k50Var);
        n50 n50Var = n50.a;
        vw5Var.a(d84.class, n50Var);
        vw5Var.a(v90.class, n50Var);
        m50 m50Var = m50.a;
        vw5Var.a(c84.class, m50Var);
        vw5Var.a(u90.class, m50Var);
        q50 q50Var = q50.a;
        vw5Var.a(hl7.class, q50Var);
        vw5Var.a(fa0.class, q50Var);
        l50 l50Var = l50.a;
        vw5Var.a(f74.class, l50Var);
        vw5Var.a(t90.class, l50Var);
        vw5Var.d = true;
        this.a = new kj4((Object) vw5Var, (byte) 10);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(q51.c);
        this.e = pj2Var2;
        this.f = pj2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(c00.i("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (((fl7) fl7.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r90 a(r90 r90Var) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        q90 c = r90Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.h;
        if (hashMap2 == null) {
            grb.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.a("model", Build.MODEL);
        c.a("hardware", Build.HARDWARE);
        c.a("device", Build.DEVICE);
        c.a("product", Build.PRODUCT);
        c.a("os-uild", Build.ID);
        c.a("manufacturer", Build.MANUFACTURER);
        c.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.h;
        if (hashMap3 == null) {
            grb.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = gl7.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.h;
        if (hashMap4 == null) {
            grb.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = fl7.a;
                subtype = 100;
            }
            hashMap = (HashMap) c.h;
            if (hashMap != null) {
                grb.i("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.a("country", Locale.getDefault().getCountry());
            c.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c.a("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                pse.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.a("application_build", Integer.toString(i2));
            return c.b();
        }
        SparseArray sparseArray3 = fl7.a;
        subtype = 0;
        hashMap = (HashMap) c.h;
        if (hashMap != null) {
        }
    }
}
