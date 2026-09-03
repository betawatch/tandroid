package w2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import j7.j0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.ai;
import org.telegram.ui.yh;
import w9.d;
import x2.c;
import x2.e;
import x2.g;
import x2.h;
import x2.i;
import x2.j;
import x2.k;
import x2.l;
import x2.n;
import x2.o;
import x2.q;
import x2.r;
import x2.s;
import x2.t;
import x2.u;
import x2.v;
import z2.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements f {
    public final ai a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final h3.a e;
    public final h3.a f;
    public final int g;

    public b(Context context, h3.a aVar, h3.a aVar2) {
        d dVar = new d();
        c cVar = c.a;
        dVar.b(o.class, cVar);
        dVar.b(i.class, cVar);
        x2.f fVar = x2.f.a;
        dVar.b(s.class, fVar);
        dVar.b(l.class, fVar);
        x2.d dVar2 = x2.d.a;
        dVar.b(q.class, dVar2);
        dVar.b(j.class, dVar2);
        x2.b bVar = x2.b.a;
        dVar.b(x2.a.class, bVar);
        dVar.b(h.class, bVar);
        e eVar = e.a;
        dVar.b(r.class, eVar);
        dVar.b(k.class, eVar);
        g gVar = g.a;
        dVar.b(v.class, gVar);
        dVar.b(n.class, gVar);
        dVar.d = true;
        this.a = new ai(dVar, 19);
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
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(yh.k("Invalid url: ", str), e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (((x2.t) x2.t.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y2.h a(y2.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        a9.a c3 = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c3.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i10));
        c3.c("model", Build.MODEL);
        c3.c("hardware", Build.HARDWARE);
        c3.c("device", Build.DEVICE);
        c3.c("product", Build.PRODUCT);
        c3.c("os-uild", Build.ID);
        c3.c("manufacturer", Build.MANUFACTURER);
        c3.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        HashMap hashMap3 = (HashMap) c3.f;
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
        HashMap hashMap4 = (HashMap) c3.f;
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
            hashMap = (HashMap) c3.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c3.c("country", Locale.getDefault().getCountry());
            c3.c("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c3.c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e6) {
                j0.b("CctTransportBackend", "Unable to find version code for package", e6);
            }
            c3.c("application_build", Integer.toString(i11));
            return c3.j();
        }
        SparseArray sparseArray3 = t.a;
        subtype = 0;
        hashMap = (HashMap) c3.f;
        if (hashMap != null) {
        }
    }
}
