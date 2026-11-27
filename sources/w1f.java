// default package

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class w1f {
    public static final Class a;
    public static final d4f b;
    public static final d4f c;
    public static final d4f d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = d(false);
        c = d(true);
        d = new d4f();
    }

    public static int A(List list) {
        return list.size() << 2;
    }

    public static void B(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                coeVar.c(i, 0);
                coeVar.b(intValue);
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += coe.p(((Integer) list.get(i4)).intValue());
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            coeVar.b(((Integer) list.get(i5)).intValue());
        }
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return coe.r(i) * size;
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static void E(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                coeVar.c(i, 0);
                coeVar.g(intValue);
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += coe.t(((Integer) list.get(i4)).intValue());
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            coeVar.g(((Integer) list.get(i5)).intValue());
        }
    }

    public static void F(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                coeVar.c(i, 0);
                coeVar.g((intValue << 1) ^ (intValue >> 31));
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += coe.t((intValue2 << 1) ^ (intValue2 >> 31));
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            coeVar.g((intValue3 << 1) ^ (intValue3 >> 31));
        }
    }

    public static void G(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                coeVar.c(i, 5);
                coeVar.l(intValue);
                i2++;
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        coeVar.g(i3);
        while (i2 < list.size()) {
            coeVar.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void H(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                coeVar.c(i, 5);
                coeVar.l(intValue);
                i2++;
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        coeVar.g(i3);
        while (i2 < list.size()) {
            coeVar.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void I(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                coeVar.c(i, 0);
                coeVar.b(intValue);
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += coe.p(((Integer) list.get(i4)).intValue());
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            coeVar.b(((Integer) list.get(i5)).intValue());
        }
    }

    public static void J(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                coeVar.c(i, 0);
                coeVar.a(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            coeVar.a(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static int a(int i, Object obj, o1f o1fVar) {
        hie hieVar = (hie) obj;
        int t = coe.t(i << 3);
        int c2 = hieVar.c();
        if (c2 == -1) {
            c2 = o1fVar.zzb(hieVar);
            hieVar.b(c2);
        }
        return xnb.A(c2, c2, t);
    }

    public static int b(int i, List list, o1f o1fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = coe.m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            hie hieVar = (hie) list.get(i2);
            int c2 = hieVar.c();
            if (c2 == -1) {
                c2 = o1fVar.zzb(hieVar);
                hieVar.b(c2);
            }
            m = xnb.A(c2, c2, m);
        }
        return m;
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof iwe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += coe.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static d4f d(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (d4f) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void e(int i, List list, g9d g9dVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        byte[] bArr = coeVar.b;
        if (!(list instanceof vve)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                coeVar.c(i, 2);
                int i3 = coeVar.d;
                try {
                    int t = coe.t(str.length() * 3);
                    int t2 = coe.t(str.length());
                    if (t2 == t) {
                        int i4 = i3 + t2;
                        coeVar.d = i4;
                        int b2 = h5f.a.b(str, bArr, i4, coeVar.e());
                        coeVar.d = i3;
                        coeVar.g((b2 - i3) - t2);
                        coeVar.d = b2;
                    } else {
                        coeVar.g(h5f.a(str));
                        coeVar.d = h5f.a.b(str, bArr, coeVar.d, coeVar.e());
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new doe(e);
                } catch (q5f e2) {
                    coeVar.d = i3;
                    coe.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(xse.a);
                    try {
                        coeVar.g(bytes.length);
                        coeVar.k(bytes, 0, bytes.length);
                    } catch (doe e3) {
                        throw e3;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new doe(e4);
                    }
                }
            }
            return;
        }
        vve vveVar = (vve) list;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object d2 = vveVar.d(i5);
            if (d2 instanceof String) {
                String str2 = (String) d2;
                coeVar.c(i, 2);
                int i6 = coeVar.d;
                try {
                    int t3 = coe.t(str2.length() * 3);
                    int t4 = coe.t(str2.length());
                    if (t4 == t3) {
                        int i7 = i6 + t4;
                        coeVar.d = i7;
                        int b3 = h5f.a.b(str2, bArr, i7, coeVar.e());
                        coeVar.d = i6;
                        coeVar.g((b3 - i6) - t4);
                        coeVar.d = b3;
                    } else {
                        coeVar.g(h5f.a(str2));
                        coeVar.d = h5f.a.b(str2, bArr, coeVar.d, coeVar.e());
                    }
                } catch (IndexOutOfBoundsException e5) {
                    throw new doe(e5);
                } catch (q5f e6) {
                    coeVar.d = i6;
                    coe.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
                    byte[] bytes2 = str2.getBytes(xse.a);
                    try {
                        coeVar.g(bytes2.length);
                        coeVar.k(bytes2, 0, bytes2.length);
                    } catch (doe e7) {
                        throw e7;
                    } catch (IndexOutOfBoundsException e8) {
                        throw new doe(e8);
                    }
                }
            } else {
                jne jneVar = (jne) d2;
                coeVar.c(i, 2);
                coeVar.g(jneVar.i());
                coeVar.k(jneVar.b, jneVar.m(), jneVar.i());
            }
        }
    }

    public static void f(int i, List list, g9d g9dVar, o1f o1fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9dVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            g9dVar.a(i, list.get(i2), o1fVar);
        }
    }

    public static void g(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                coeVar.c(i, 1);
                coeVar.j(doubleToRawLongBits);
                i2++;
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        coeVar.g(i3);
        while (i2 < list.size()) {
            coeVar.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void h(d4f d4fVar, ese eseVar, ese eseVar2) {
        d4fVar.getClass();
        h4f h4fVar = eseVar.zzb;
        h4f h4fVar2 = eseVar2.zzb;
        if (!h4fVar2.equals(h4f.f)) {
            int i = h4fVar.a + h4fVar2.a;
            int[] copyOf = Arrays.copyOf(h4fVar.b, i);
            System.arraycopy(h4fVar2.b, 0, copyOf, h4fVar.a, h4fVar2.a);
            Object[] copyOf2 = Arrays.copyOf(h4fVar.c, i);
            System.arraycopy(h4fVar2.c, 0, copyOf2, h4fVar.a, h4fVar2.a);
            h4fVar = new h4f(i, copyOf, copyOf2, true);
        }
        eseVar.zzb = h4fVar;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int j(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m = coe.m(i) * size;
        if (!(list instanceof vve)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof jne) {
                    int i3 = ((jne) obj).i();
                    m = xnb.A(i3, i3, m);
                } else {
                    m = coe.f((String) obj) + m;
                }
                i2++;
            }
            return m;
        }
        vve vveVar = (vve) list;
        while (i2 < size) {
            Object d2 = vveVar.d(i2);
            if (d2 instanceof jne) {
                int i4 = ((jne) d2).i();
                m = xnb.A(i4, i4, m);
            } else {
                m = coe.f((String) d2) + m;
            }
            i2++;
        }
        return m;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof iwe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += coe.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void l(int i, List list, g9d g9dVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9dVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            coe coeVar = (coe) g9dVar.b;
            jne jneVar = (jne) list.get(i2);
            coeVar.c(i, 2);
            coeVar.g(jneVar.i());
            coeVar.k(jneVar.b, jneVar.m(), jneVar.i());
        }
    }

    public static void m(int i, List list, g9d g9dVar, o1f o1fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9dVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            g9dVar.c(i, list.get(i2), o1fVar);
        }
    }

    public static void n(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int floatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                coeVar.c(i, 5);
                coeVar.l(floatToRawIntBits);
                i2++;
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        coeVar.g(i3);
        while (i2 < list.size()) {
            coeVar.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = coe.m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = ((jne) list.get(i2)).i();
            m = xnb.A(i3, i3, m);
        }
        return m;
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof iwe)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += coe.o((longValue << 1) ^ (longValue >> 63));
                }
                return i;
            }
            bs2.u(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static void q(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long longValue = ((Long) list.get(i2)).longValue();
                coeVar.c(i, 0);
                coeVar.d(longValue);
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += coe.o(((Long) list.get(i4)).longValue());
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            coeVar.d(((Long) list.get(i5)).longValue());
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nse)) {
            int i2 = 0;
            while (i < size) {
                i2 += coe.p(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        nse nseVar = (nse) list;
        int i3 = 0;
        while (i < size) {
            nseVar.j(i);
            i3 += coe.p(nseVar.b[i]);
            i++;
        }
        return i3;
    }

    public static void s(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long longValue = ((Long) list.get(i2)).longValue();
                coeVar.c(i, 0);
                coeVar.d(longValue);
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += coe.o(((Long) list.get(i4)).longValue());
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            coeVar.d(((Long) list.get(i5)).longValue());
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nse)) {
            int i2 = 0;
            while (i < size) {
                i2 += coe.p(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        nse nseVar = (nse) list;
        int i3 = 0;
        while (i < size) {
            nseVar.j(i);
            i3 += coe.p(nseVar.b[i]);
            i++;
        }
        return i3;
    }

    public static void u(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long longValue = ((Long) list.get(i2)).longValue();
                coeVar.c(i, 0);
                coeVar.d((longValue << 1) ^ (longValue >> 63));
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += coe.o((longValue2 << 1) ^ (longValue2 >> 63));
        }
        coeVar.g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            coeVar.d((longValue3 << 1) ^ (longValue3 >> 63));
        }
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nse)) {
            int i2 = 0;
            while (i < size) {
                i2 += coe.t(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        nse nseVar = (nse) list;
        int i3 = 0;
        while (i < size) {
            nseVar.j(i);
            i3 += coe.t(nseVar.b[i]);
            i++;
        }
        return i3;
    }

    public static void w(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                coeVar.c(i, 1);
                coeVar.j(longValue);
                i2++;
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        coeVar.g(i3);
        while (i2 < list.size()) {
            coeVar.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nse)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += coe.t((intValue << 1) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        nse nseVar = (nse) list;
        int i3 = 0;
        while (i < size) {
            nseVar.j(i);
            int i4 = nseVar.b[i];
            i3 += coe.t((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static void y(int i, List list, g9d g9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        coe coeVar = (coe) g9dVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                coeVar.c(i, 1);
                coeVar.j(longValue);
                i2++;
            }
            return;
        }
        coeVar.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        coeVar.g(i3);
        while (i2 < list.size()) {
            coeVar.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return coe.v(i) * size;
    }
}
