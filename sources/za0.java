// default package

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class za0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(rb0 rb0Var, int i) {
        byte[] bArr;
        long j;
        v80 v80Var;
        String str;
        v80 v80Var2;
        int i2;
        re1 d;
        String str2;
        Integer num;
        za0 za0Var;
        String str3;
        final za0 za0Var2 = this;
        final rb0 rb0Var2 = rb0Var;
        byte[] bArr2 = rb0Var2.b;
        mq9 mq9Var = (mq9) za0Var2.f;
        e3c a = ((of7) za0Var2.b).a(rb0Var2.a);
        long j2 = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) mq9Var.f(new yeb(za0Var2) { // from class: q8c
                public final /* synthetic */ za0 b;

                {
                    this.b = za0Var2;
                }

                @Override // yeb
                public final Object e() {
                    Boolean bool;
                    byte b2 = b;
                    rb0 rb0Var3 = rb0Var2;
                    za0 za0Var3 = this.b;
                    switch (b2) {
                        case 0:
                            mq9 mq9Var2 = (mq9) za0Var3.c;
                            SQLiteDatabase a2 = mq9Var2.a();
                            a2.beginTransaction();
                            try {
                                Long b3 = mq9.b(a2, rb0Var3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = mq9Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            mq9 mq9Var3 = (mq9) za0Var3.c;
                            mq9Var3.getClass();
                            return (Iterable) mq9Var3.c(new xr8(mq9Var3, rb0Var3, (byte) 14));
                    }
                }
            })).booleanValue()) {
                mq9Var.f(new pt0((Object) za0Var2, (Object) rb0Var2, j2, (byte) 10));
                return;
            }
            final byte b2 = 1;
            Iterable iterable = (Iterable) mq9Var.f(new yeb(za0Var2) { // from class: q8c
                public final /* synthetic */ za0 b;

                {
                    this.b = za0Var2;
                }

                @Override // yeb
                public final Object e() {
                    Boolean bool;
                    byte b22 = b2;
                    rb0 rb0Var3 = rb0Var2;
                    za0 za0Var3 = this.b;
                    switch (b22) {
                        case 0:
                            mq9 mq9Var2 = (mq9) za0Var3.c;
                            SQLiteDatabase a2 = mq9Var2.a();
                            a2.beginTransaction();
                            try {
                                Long b3 = mq9.b(a2, rb0Var3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = mq9Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            mq9 mq9Var3 = (mq9) za0Var3.c;
                            mq9Var3.getClass();
                            return (Iterable) mq9Var3.c(new xr8(mq9Var3, rb0Var3, (byte) 14));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                aqe.a(rb0Var2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                v80Var2 = new v80(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((eb0) it.next()).c);
                }
                if (bArr2 != null) {
                    mq9 mq9Var2 = (mq9) za0Var2.i;
                    Objects.requireNonNull(mq9Var2);
                    ak2 ak2Var = (ak2) mq9Var.f(new p8c(mq9Var2, b));
                    oa0 oa0Var = new oa0();
                    oa0Var.h = new HashMap();
                    oa0Var.f = Long.valueOf(((hk2) za0Var2.g).a());
                    oa0Var.g = Long.valueOf(((hk2) za0Var2.h).a());
                    oa0Var.a = "GDT_CLIENT_METRICS";
                    d44 d44Var = new d44("proto");
                    ak2Var.getClass();
                    jv8 jv8Var = cv8.a;
                    jv8Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jv8Var.b(ak2Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    oa0Var.e = new z34(d44Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((se1) a).a(oa0Var.b()));
                }
                se1 se1Var = (se1) a;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    pa0 pa0Var = (pa0) obj;
                    String str4 = pa0Var.a;
                    if (hashMap.containsKey(str4)) {
                        ((List) hashMap.get(str4)).add(pa0Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(pa0Var);
                        hashMap.put(str4, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    pa0 pa0Var2 = (pa0) ((List) entry.getValue()).get(0);
                    fx8 fx8Var = fx8.a;
                    long a2 = se1Var.f.a();
                    long a3 = se1Var.e.a();
                    x80 x80Var = new x80(new u80(Integer.valueOf(pa0Var2.b("sdk-version")), pa0Var2.a("model"), pa0Var2.a("hardware"), pa0Var2.a("device"), pa0Var2.a("product"), pa0Var2.a("os-uild"), pa0Var2.a("manufacturer"), pa0Var2.a("fingerprint"), pa0Var2.a("locale"), pa0Var2.a("country"), pa0Var2.a("mcc_mnc"), pa0Var2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (pa0 pa0Var3 : (List) entry.getValue()) {
                        z34 z34Var = pa0Var3.c;
                        byte[] bArr3 = bArr2;
                        byte[] bArr4 = pa0Var3.j;
                        d44 d44Var2 = z34Var.a;
                        byte[] bArr5 = z34Var.b;
                        long j3 = j2;
                        if (d44Var2.equals(new d44("proto"))) {
                            za0Var = new za0();
                            za0Var.f = bArr5;
                        } else if (d44Var2.equals(new d44("json"))) {
                            String str5 = new String(bArr5, Charset.forName("UTF-8"));
                            za0 za0Var3 = new za0();
                            za0Var3.g = str5;
                            za0Var = za0Var3;
                        } else {
                            String c = aqe.c("CctTransportBackend");
                            if (Log.isLoggable(c, 5)) {
                                Log.w(c, "Received event of unsupported encoding " + d44Var2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        za0Var.a = Long.valueOf(pa0Var3.d);
                        za0Var.b = Long.valueOf(pa0Var3.e);
                        String str6 = (String) pa0Var3.f.get("tz-offset");
                        za0Var.c = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        za0Var.h = new db0((zk7) zk7.a.get(pa0Var3.b("net-type")), (yk7) yk7.a.get(pa0Var3.b("mobile-subtype")));
                        Integer num2 = pa0Var3.b;
                        if (num2 != null) {
                            za0Var.d = num2;
                        }
                        Integer num3 = pa0Var3.g;
                        if (num3 != null) {
                            ta0 ta0Var = new ta0(new sa0(num3));
                            sq2 sq2Var = sq2.a;
                            za0Var.e = new y80(ta0Var);
                        }
                        byte[] bArr6 = pa0Var3.i;
                        if (bArr6 == null) {
                            if (bArr4 != null) {
                                bArr6 = null;
                            }
                            str3 = ((Long) za0Var.a) != null ? " eventTimeMs" : "";
                            if (((Long) za0Var.b) == null) {
                                str3 = str3.concat(" eventUptimeMs");
                            }
                            if (((Long) za0Var.c) == null) {
                                str3 = str3.concat(" timezoneOffsetSeconds");
                            }
                            if (str3.isEmpty()) {
                                dq9.m("Missing required properties:".concat(str3));
                                return;
                            } else {
                                arrayList4.add(new ab0(((Long) za0Var.a).longValue(), (Integer) za0Var.d, (y80) za0Var.e, ((Long) za0Var.b).longValue(), (byte[]) za0Var.f, (String) za0Var.g, ((Long) za0Var.c).longValue(), (db0) za0Var.h, (ra0) za0Var.i));
                                bArr2 = bArr3;
                                j2 = j3;
                            }
                        }
                        za0Var.i = new ra0(bArr6, bArr4 != null ? bArr4 : null);
                        if (((Long) za0Var.a) != null) {
                        }
                        if (((Long) za0Var.b) == null) {
                        }
                        if (((Long) za0Var.c) == null) {
                        }
                        if (str3.isEmpty()) {
                        }
                    }
                    arrayList3.add(new bb0(a2, a3, x80Var, num, str2, arrayList4));
                }
                bArr = bArr2;
                j = j2;
                w80 w80Var = new w80(arrayList3);
                URL url = se1Var.d;
                if (bArr != null) {
                    try {
                        p61 a4 = p61.a(bArr);
                        String str7 = a4.b;
                        if (str7 == null) {
                            str7 = null;
                        }
                        String str8 = a4.a;
                        if (str8 != null) {
                            url = se1.b(str8);
                        }
                        str = str7;
                    } catch (IllegalArgumentException unused3) {
                        v80Var = new v80(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    mx6 mx6Var = new mx6(url, w80Var, str, false, (byte) 16);
                    cd1 cd1Var = new cd1((Object) se1Var, (byte) 1);
                    mx6 mx6Var2 = mx6Var;
                    int i4 = 5;
                    do {
                        d = cd1Var.d(mx6Var2);
                        URL url2 = (URL) d.c;
                        if (url2 != null) {
                            aqe.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            mx6Var2 = new mx6(url2, (w80) mx6Var2.c, (String) mx6Var2.d, false, (byte) 16);
                        } else {
                            mx6Var2 = null;
                        }
                        if (mx6Var2 == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = d.a;
                    if (i5 == 200) {
                        v80Var2 = new v80(1, d.b);
                    } else {
                        v80Var = (i5 >= 500 || i5 == 404) ? new v80(2, -1L) : i5 == 400 ? new v80(4, -1L) : new v80(3, -1L);
                        v80Var2 = v80Var;
                    }
                } catch (IOException e) {
                    aqe.b("CctTransportBackend", "Could not make request to the backend", e);
                    i2 = 2;
                    v80Var2 = new v80(2, -1L);
                }
            }
            i2 = 2;
            int i6 = v80Var2.a;
            if (i6 == i2) {
                mq9Var.f(new zn1((Object) this, (Object) iterable, (Object) rb0Var, j, (byte) 9));
                ((in3) this.d).E(rb0Var, i + 1, true);
                return;
            }
            za0Var2 = this;
            rb0Var2 = rb0Var;
            j2 = j;
            mq9Var.f(new uxb(za0Var2, iterable, (byte) 5));
            if (i6 == 1) {
                j2 = Math.max(j2, v80Var2.b);
                if (bArr != null) {
                    mq9Var.f(new wta(za0Var2, (byte) 26));
                }
            } else if (i6 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str9 = ((eb0) it2.next()).c.a;
                    if (hashMap2.containsKey(str9)) {
                        hashMap2.put(str9, Integer.valueOf(((Integer) hashMap2.get(str9)).intValue() + 1));
                    } else {
                        hashMap2.put(str9, 1);
                    }
                }
                mq9Var.f(new uxb(za0Var2, hashMap2, (byte) 6));
            }
            bArr2 = bArr;
        }
    }
}
