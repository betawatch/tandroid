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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class se1 implements e3c {
    public final lj4 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final hk2 e;
    public final hk2 f;

    public se1(Context context, hk2 hk2Var, hk2 hk2Var2) {
        qw5 qw5Var = new qw5();
        g60 g60Var = g60.a;
        qw5Var.a(ai0.class, g60Var);
        qw5Var.a(w80.class, g60Var);
        n60 n60Var = n60.a;
        qw5Var.a(yd6.class, n60Var);
        qw5Var.a(bb0.class, n60Var);
        h60 h60Var = h60.a;
        qw5Var.a(zj2.class, h60Var);
        qw5Var.a(x80.class, h60Var);
        f60 f60Var = f60.a;
        qw5Var.a(bl.class, f60Var);
        qw5Var.a(u80.class, f60Var);
        m60 m60Var = m60.a;
        qw5Var.a(vd6.class, m60Var);
        qw5Var.a(ab0.class, m60Var);
        i60 i60Var = i60.a;
        qw5Var.a(tq2.class, i60Var);
        qw5Var.a(y80.class, i60Var);
        l60 l60Var = l60.a;
        qw5Var.a(r84.class, l60Var);
        qw5Var.a(ta0.class, l60Var);
        k60 k60Var = k60.a;
        qw5Var.a(q84.class, k60Var);
        qw5Var.a(sa0.class, k60Var);
        o60 o60Var = o60.a;
        qw5Var.a(al7.class, o60Var);
        qw5Var.a(db0.class, o60Var);
        j60 j60Var = j60.a;
        qw5Var.a(u74.class, j60Var);
        qw5Var.a(ra0.class, j60Var);
        qw5Var.d = true;
        this.a = new lj4(qw5Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(p61.c);
        this.e = hk2Var2;
        this.f = hk2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(b10.h("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (((yk7) yk7.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pa0 a(pa0 pa0Var) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        oa0 c = pa0Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.h;
        if (hashMap2 == null) {
            dq9.m("Property \"autoMetadata\" has not been set");
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
            dq9.m("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = zk7.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.h;
        if (hashMap4 == null) {
            dq9.m("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = yk7.a;
                subtype = 100;
            }
            hashMap = (HashMap) c.h;
            if (hashMap != null) {
                dq9.m("Property \"autoMetadata\" has not been set");
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
                aqe.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.a("application_build", Integer.toString(i2));
            return c.b();
        }
        SparseArray sparseArray3 = yk7.a;
        subtype = 0;
        hashMap = (HashMap) c.h;
        if (hashMap != null) {
        }
    }
}
