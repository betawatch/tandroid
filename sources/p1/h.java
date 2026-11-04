package p1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.z;
import b8.yf;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;
import l1.h1;
import l1.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements z0 {
    public static final h a = new h();

    @Override // l1.z0
    public final Object a() {
        return new b(true);
    }

    @Override // l1.z0
    public final void b(Object obj, h1 h1Var) {
        z a10;
        Map a11 = ((b) obj).a();
        o1.a n4 = o1.c.n();
        for (Map.Entry entry : a11.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.a;
            if (value instanceof Boolean) {
                o1.f D = o1.h.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.c();
                o1.h.q((o1.h) D.b, booleanValue);
                a10 = D.a();
            } else if (value instanceof Float) {
                o1.f D2 = o1.h.D();
                float floatValue = ((Number) value).floatValue();
                D2.c();
                o1.h.r((o1.h) D2.b, floatValue);
                a10 = D2.a();
            } else if (value instanceof Double) {
                o1.f D3 = o1.h.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.c();
                o1.h.o((o1.h) D3.b, doubleValue);
                a10 = D3.a();
            } else if (value instanceof Integer) {
                o1.f D4 = o1.h.D();
                int intValue = ((Number) value).intValue();
                D4.c();
                o1.h.s((o1.h) D4.b, intValue);
                a10 = D4.a();
            } else if (value instanceof Long) {
                o1.f D5 = o1.h.D();
                long longValue = ((Number) value).longValue();
                D5.c();
                o1.h.l((o1.h) D5.b, longValue);
                a10 = D5.a();
            } else if (value instanceof String) {
                o1.f D6 = o1.h.D();
                D6.c();
                o1.h.m((o1.h) D6.b, (String) value);
                a10 = D6.a();
            } else if (value instanceof Set) {
                o1.f D7 = o1.h.D();
                o1.d o10 = o1.e.o();
                o10.c();
                o1.e.l((o1.e) o10.b, (Set) value);
                D7.c();
                o1.h.n((o1.h) D7.b, (o1.e) o10.a());
                a10 = D7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                o1.f D8 = o1.h.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.h j10 = androidx.datastore.preferences.protobuf.h.j(0, bArr.length, bArr);
                D8.c();
                o1.h.p((o1.h) D8.b, j10);
                a10 = D8.a();
            }
            n4.getClass();
            str.getClass();
            n4.c();
            o1.c.l((o1.c) n4.b).put(str, (o1.h) a10);
        }
        o1.c cVar = (o1.c) n4.a();
        int a12 = cVar.a(null);
        Logger logger = m.f;
        if (a12 > 4096) {
            a12 = 4096;
        }
        m mVar = new m(h1Var, a12);
        cVar.b(mVar);
        if (mVar.d > 0) {
            mVar.l();
        }
    }

    @Override // l1.z0
    public final Object c(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            o1.c o10 = o1.c.o(fileInputStream);
            b bVar = new b(false);
            f[] pairs = (f[]) Arrays.copyOf(new f[0], 0);
            j.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                f fVar = pairs[0];
                throw null;
            }
            Map m10 = o10.m();
            j.d(m10, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m10.entrySet()) {
                String name = (String) entry.getKey();
                o1.h value = (o1.h) entry.getValue();
                j.d(name, "name");
                j.d(value, "value");
                int C = value.C();
                switch (C == 0 ? -1 : g.a[o1.g.c(C)]) {
                    case -1:
                        throw new l1.b("Value case is null.", null);
                    case 0:
                    default:
                        throw new androidx.car.app.j();
                    case 1:
                        bVar.e(new e(name), Boolean.valueOf(value.t()));
                        break;
                    case 2:
                        bVar.e(new e(name), Float.valueOf(value.x()));
                        break;
                    case 3:
                        bVar.e(new e(name), Double.valueOf(value.w()));
                        break;
                    case 4:
                        bVar.e(new e(name), Integer.valueOf(value.y()));
                        break;
                    case 5:
                        bVar.e(new e(name), Long.valueOf(value.z()));
                        break;
                    case 6:
                        e a10 = yf.a(name);
                        String A = value.A();
                        j.d(A, "value.string");
                        bVar.e(a10, A);
                        break;
                    case 7:
                        e b10 = yf.b(name);
                        b0 n4 = value.B().n();
                        j.d(n4, "value.stringSet.stringsList");
                        bVar.e(b10, ed.g.o(n4));
                        break;
                    case 8:
                        e eVar = new e(name);
                        androidx.datastore.preferences.protobuf.h u10 = value.u();
                        int size = u10.size();
                        if (size == 0) {
                            bArr = c0.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u10.k(size, bArr2);
                            bArr = bArr2;
                        }
                        j.d(bArr, "value.bytes.toByteArray()");
                        bVar.e(eVar, bArr);
                        break;
                    case 9:
                        throw new l1.b("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (e0 e10) {
            throw new l1.b("Unable to parse preferences proto.", e10);
        }
    }
}
