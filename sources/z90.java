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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z90 {
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
    public final void a(ra0 ra0Var, int i) {
        byte[] bArr;
        long j;
        v70 v70Var;
        String str;
        v70 v70Var2;
        int i2;
        jd1 r;
        String str2;
        Integer num;
        z90 z90Var;
        String str3;
        final z90 z90Var2 = this;
        final ra0 ra0Var2 = ra0Var;
        byte[] bArr2 = ra0Var2.b;
        lo9 lo9Var = (lo9) z90Var2.f;
        e1c a = ((md7) z90Var2.b).a(ra0Var2.a);
        long j2 = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) lo9Var.f(new xcb(z90Var2) { // from class: p6c
                public final /* synthetic */ z90 b;

                {
                    this.b = z90Var2;
                }

                @Override // xcb
                public final Object m() {
                    Boolean bool;
                    byte b2 = b;
                    ra0 ra0Var3 = ra0Var2;
                    z90 z90Var3 = this.b;
                    switch (b2) {
                        case 0:
                            lo9 lo9Var2 = (lo9) z90Var3.c;
                            SQLiteDatabase a2 = lo9Var2.a();
                            a2.beginTransaction();
                            try {
                                Long b3 = lo9.b(a2, ra0Var3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = lo9Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
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
                            lo9 lo9Var3 = (lo9) z90Var3.c;
                            lo9Var3.getClass();
                            return (Iterable) lo9Var3.c(new kq8(lo9Var3, ra0Var3, (byte) 13));
                    }
                }
            })).booleanValue()) {
                lo9Var.f(new hs0((Object) z90Var2, (Object) ra0Var2, j2, (byte) 10));
                return;
            }
            final byte b2 = 1;
            Iterable iterable = (Iterable) lo9Var.f(new xcb(z90Var2) { // from class: p6c
                public final /* synthetic */ z90 b;

                {
                    this.b = z90Var2;
                }

                @Override // xcb
                public final Object m() {
                    Boolean bool;
                    byte b22 = b2;
                    ra0 ra0Var3 = ra0Var2;
                    z90 z90Var3 = this.b;
                    switch (b22) {
                        case 0:
                            lo9 lo9Var2 = (lo9) z90Var3.c;
                            SQLiteDatabase a2 = lo9Var2.a();
                            a2.beginTransaction();
                            try {
                                Long b3 = lo9.b(a2, ra0Var3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = lo9Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
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
                            lo9 lo9Var3 = (lo9) z90Var3.c;
                            lo9Var3.getClass();
                            return (Iterable) lo9Var3.c(new kq8(lo9Var3, ra0Var3, (byte) 13));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                xne.a(ra0Var2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                v70Var2 = new v70(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ea0) it.next()).c);
                }
                if (bArr2 != null) {
                    lo9 lo9Var2 = (lo9) z90Var2.i;
                    Objects.requireNonNull(lo9Var2);
                    mi2 mi2Var = (mi2) lo9Var.f(new o6c(lo9Var2, b));
                    o90 o90Var = new o90();
                    o90Var.h = new HashMap();
                    o90Var.f = Long.valueOf(((ti2) z90Var2.g).e());
                    o90Var.g = Long.valueOf(((ti2) z90Var2.h).e());
                    o90Var.a = "GDT_CLIENT_METRICS";
                    s24 s24Var = new s24("proto");
                    mi2Var.getClass();
                    it8 it8Var = bt8.a;
                    it8Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        it8Var.b(mi2Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    o90Var.e = new o24(s24Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((kd1) a).a(o90Var.b()));
                }
                kd1 kd1Var = (kd1) a;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    p90 p90Var = (p90) obj;
                    String str4 = p90Var.a;
                    if (hashMap.containsKey(str4)) {
                        ((List) hashMap.get(str4)).add(p90Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(p90Var);
                        hashMap.put(str4, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    p90 p90Var2 = (p90) ((List) entry.getValue()).get(0);
                    ev8 ev8Var = ev8.a;
                    long e = kd1Var.f.e();
                    long e2 = kd1Var.e.e();
                    x70 x70Var = new x70(new u70(Integer.valueOf(p90Var2.b("sdk-version")), p90Var2.a("model"), p90Var2.a("hardware"), p90Var2.a("device"), p90Var2.a("product"), p90Var2.a("os-uild"), p90Var2.a("manufacturer"), p90Var2.a("fingerprint"), p90Var2.a("locale"), p90Var2.a("country"), p90Var2.a("mcc_mnc"), p90Var2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (p90 p90Var3 : (List) entry.getValue()) {
                        o24 o24Var = p90Var3.c;
                        byte[] bArr3 = bArr2;
                        byte[] bArr4 = p90Var3.j;
                        s24 s24Var2 = o24Var.a;
                        byte[] bArr5 = o24Var.b;
                        long j3 = j2;
                        if (s24Var2.equals(new s24("proto"))) {
                            z90Var = new z90();
                            z90Var.f = bArr5;
                        } else if (s24Var2.equals(new s24("json"))) {
                            String str5 = new String(bArr5, Charset.forName("UTF-8"));
                            z90 z90Var3 = new z90();
                            z90Var3.g = str5;
                            z90Var = z90Var3;
                        } else {
                            String c = xne.c("CctTransportBackend");
                            if (Log.isLoggable(c, 5)) {
                                Log.w(c, "Received event of unsupported encoding " + s24Var2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        z90Var.a = Long.valueOf(p90Var3.d);
                        z90Var.b = Long.valueOf(p90Var3.e);
                        String str6 = (String) p90Var3.f.get("tz-offset");
                        z90Var.c = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        z90Var.h = new da0((xi7) xi7.a.get(p90Var3.b("net-type")), (wi7) wi7.a.get(p90Var3.b("mobile-subtype")));
                        Integer num2 = p90Var3.b;
                        if (num2 != null) {
                            z90Var.d = num2;
                        }
                        Integer num3 = p90Var3.g;
                        if (num3 != null) {
                            t90 t90Var = new t90(new s90(num3));
                            hp2 hp2Var = hp2.a;
                            z90Var.e = new y70(t90Var);
                        }
                        byte[] bArr6 = p90Var3.i;
                        if (bArr6 == null) {
                            if (bArr4 != null) {
                                bArr6 = null;
                            }
                            str3 = ((Long) z90Var.a) != null ? " eventTimeMs" : "";
                            if (((Long) z90Var.b) == null) {
                                str3 = str3.concat(" eventUptimeMs");
                            }
                            if (((Long) z90Var.c) == null) {
                                str3 = str3.concat(" timezoneOffsetSeconds");
                            }
                            if (str3.isEmpty()) {
                                sc8.j("Missing required properties:".concat(str3));
                                return;
                            } else {
                                arrayList4.add(new aa0(((Long) z90Var.a).longValue(), (Integer) z90Var.d, (y70) z90Var.e, ((Long) z90Var.b).longValue(), (byte[]) z90Var.f, (String) z90Var.g, ((Long) z90Var.c).longValue(), (da0) z90Var.h, (r90) z90Var.i));
                                bArr2 = bArr3;
                                j2 = j3;
                            }
                        }
                        z90Var.i = new r90(bArr6, bArr4 != null ? bArr4 : null);
                        if (((Long) z90Var.a) != null) {
                        }
                        if (((Long) z90Var.b) == null) {
                        }
                        if (((Long) z90Var.c) == null) {
                        }
                        if (str3.isEmpty()) {
                        }
                    }
                    arrayList3.add(new ba0(e, e2, x70Var, num, str2, arrayList4));
                }
                bArr = bArr2;
                j = j2;
                w70 w70Var = new w70(arrayList3);
                URL url = kd1Var.d;
                if (bArr != null) {
                    try {
                        i51 a2 = i51.a(bArr);
                        String str7 = a2.b;
                        if (str7 == null) {
                            str7 = null;
                        }
                        String str8 = a2.a;
                        if (str8 != null) {
                            url = kd1.b(str8);
                        }
                        str = str7;
                    } catch (IllegalArgumentException unused3) {
                        v70Var = new v70(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    mv6 mv6Var = new mv6(url, w70Var, str, false, (byte) 16);
                    sg0 sg0Var = new sg0(kd1Var, (byte) 28);
                    mv6 mv6Var2 = mv6Var;
                    int i4 = 5;
                    do {
                        r = sg0Var.r(mv6Var2);
                        URL url2 = (URL) r.c;
                        if (url2 != null) {
                            xne.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            mv6Var2 = new mv6(url2, (w70) mv6Var2.c, (String) mv6Var2.d, false, (byte) 16);
                        } else {
                            mv6Var2 = null;
                        }
                        if (mv6Var2 == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = r.a;
                    if (i5 == 200) {
                        v70Var2 = new v70(1, r.b);
                    } else {
                        v70Var = (i5 >= 500 || i5 == 404) ? new v70(2, -1L) : i5 == 400 ? new v70(4, -1L) : new v70(3, -1L);
                        v70Var2 = v70Var;
                    }
                } catch (IOException e3) {
                    xne.b("CctTransportBackend", "Could not make request to the backend", e3);
                    i2 = 2;
                    v70Var2 = new v70(2, -1L);
                }
            }
            i2 = 2;
            int i6 = v70Var2.a;
            if (i6 == i2) {
                lo9Var.f(new qm1((Object) this, (Object) iterable, (Object) ra0Var, j, (byte) 9));
                ((xl3) this.d).F(ra0Var, i + 1, true);
                return;
            }
            z90Var2 = this;
            ra0Var2 = ra0Var;
            j2 = j;
            lo9Var.f(new cwb(z90Var2, iterable, (byte) 4));
            if (i6 == 1) {
                j2 = Math.max(j2, v70Var2.b);
                if (bArr != null) {
                    lo9Var.f(new hza(z90Var2, (byte) 22));
                }
            } else if (i6 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str9 = ((ea0) it2.next()).c.a;
                    if (hashMap2.containsKey(str9)) {
                        hashMap2.put(str9, Integer.valueOf(((Integer) hashMap2.get(str9)).intValue() + 1));
                    } else {
                        hashMap2.put(str9, 1);
                    }
                }
                lo9Var.f(new cwb(z90Var2, hashMap2, (byte) 5));
            }
            bArr2 = bArr;
        }
    }
}
