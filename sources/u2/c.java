package u2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.messaging.m;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import n2.b0;
import org.telegram.messenger.MediaDataController;
import t9.d;
import v2.f;
import v2.g;
import v2.h;
import v2.i;
import v2.j;
import v2.k;
import v2.l;
import v2.n;
import v2.o;
import v2.q;
import v2.r;
import v2.s;
import v2.t;
import v2.u;
import v2.v;
import x2.e;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements e {
    public final b0 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final f3.a e;
    public final f3.a f;
    public final int g;

    public c(Context context, f3.a aVar, f3.a aVar2) {
        d dVar = new d();
        v2.c cVar = v2.c.a;
        dVar.d(o.class, cVar);
        dVar.d(i.class, cVar);
        f fVar = f.a;
        dVar.d(s.class, fVar);
        dVar.d(l.class, fVar);
        v2.d dVar2 = v2.d.a;
        dVar.d(q.class, dVar2);
        dVar.d(j.class, dVar2);
        v2.b bVar = v2.b.a;
        dVar.d(v2.a.class, bVar);
        dVar.d(h.class, bVar);
        v2.e eVar = v2.e.a;
        dVar.d(r.class, eVar);
        dVar.d(k.class, eVar);
        g gVar = g.a;
        dVar.d(v.class, gVar);
        dVar.d(n.class, gVar);
        dVar.d = true;
        this.a = new b0(dVar, 22);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.c);
        this.e = aVar2;
        this.f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e9) {
            throw new IllegalArgumentException(s3.c.e("Invalid url: ", str), e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (((v2.t) v2.t.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w2.h a(w2.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        m c10 = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c10.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i10));
        c10.c("model", Build.MODEL);
        c10.c("hardware", Build.HARDWARE);
        c10.c("device", Build.DEVICE);
        c10.c("product", Build.PRODUCT);
        c10.c("os-uild", Build.ID);
        c10.c("manufacturer", Build.MANUFACTURER);
        c10.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        HashMap hashMap3 = (HashMap) c10.f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c10.f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.a;
                subtype = 100;
            }
            hashMap = (HashMap) c10.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c10.c("country", Locale.getDefault().getCountry());
            c10.c("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c10.c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e9) {
                a.a.b("CctTransportBackend", "Unable to find version code for package", e9);
            }
            c10.c("application_build", Integer.toString(i11));
            return c10.i();
        }
        SparseArray sparseArray3 = t.a;
        subtype = 0;
        hashMap = (HashMap) c10.f;
        if (hashMap != null) {
        }
    }
}
