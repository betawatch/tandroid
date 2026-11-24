// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class vif {
    public static final Class a;
    public static final ejf b;
    public static final ejf c;

    static {
        Class<?> cls;
        Class<?> cls2;
        ejf ejfVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                ejfVar = (ejf) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = ejfVar;
        c = new ejf();
    }

    public static void a(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                igfVar.j(i << 3);
                igfVar.j((intValue << 1) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += igf.o((intValue2 << 1) ^ (intValue2 >> 31));
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            igfVar.j((intValue3 << 1) ^ (intValue3 >> 31));
            i2++;
        }
    }

    public static void b(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                igfVar.k(i, (longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += igf.p((longValue2 << 1) ^ (longValue2 >> 63));
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            igfVar.l((longValue3 << 1) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public static void c(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                igfVar.j(i << 3);
                igfVar.j(intValue);
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += igf.o(((Integer) list.get(i4)).intValue());
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.j(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void d(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += igf.p(((Long) list.get(i4)).longValue());
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.l(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xgf)) {
            int i2 = 0;
            while (i < size) {
                i2 += igf.m(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        xgf xgfVar = (xgf) list;
        int i3 = 0;
        while (i < size) {
            xgfVar.i(i);
            i3 += igf.m(xgfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (igf.o(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (igf.o(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xgf)) {
            int i2 = 0;
            while (i < size) {
                i2 += igf.m(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        xgf xgfVar = (xgf) list;
        int i3 = 0;
        while (i < size) {
            xgfVar.i(i);
            i3 += igf.m(xgfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aif)) {
            int i2 = 0;
            while (i < size) {
                i2 += igf.p(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        aif aifVar = (aif) list;
        int i3 = 0;
        while (i < size) {
            aifVar.i(i);
            i3 += igf.p(aifVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xgf)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += igf.o((intValue << 1) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        xgf xgfVar = (xgf) list;
        int i3 = 0;
        while (i < size) {
            xgfVar.i(i);
            int i4 = xgfVar.b[i];
            i3 += igf.o((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aif)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += igf.p((longValue << 1) ^ (longValue >> 63));
                i++;
            }
            return i2;
        }
        aif aifVar = (aif) list;
        int i3 = 0;
        while (i < size) {
            aifVar.i(i);
            long j = aifVar.b[i];
            i3 += igf.p((j << 1) ^ (j >> 63));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xgf)) {
            int i2 = 0;
            while (i < size) {
                i2 += igf.o(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        xgf xgfVar = (xgf) list;
        int i3 = 0;
        while (i < size) {
            xgfVar.i(i);
            i3 += igf.o(xgfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aif)) {
            int i2 = 0;
            while (i < size) {
                i2 += igf.p(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        aif aifVar = (aif) list;
        int i3 = 0;
        while (i < size) {
            aifVar.i(i);
            i3 += igf.p(aifVar.b[i]);
            i++;
        }
        return i3;
    }

    public static void o(ejf ejfVar, Object obj, Object obj2) {
        ejfVar.getClass();
        wgf wgfVar = (wgf) obj;
        djf djfVar = wgfVar.zzc;
        djf djfVar2 = ((wgf) obj2).zzc;
        djf djfVar3 = djf.e;
        if (!djfVar3.equals(djfVar2)) {
            if (djfVar3.equals(djfVar)) {
                djfVar.getClass();
                djfVar2.getClass();
                int[] copyOf = Arrays.copyOf(djfVar.a, 0);
                System.arraycopy(djfVar2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(djfVar.b, 0);
                System.arraycopy(djfVar2.b, 0, copyOf2, 0, 0);
                djfVar = new djf(copyOf, copyOf2, true);
            } else {
                djfVar.getClass();
                if (!djfVar2.equals(djfVar3)) {
                    if (!djfVar.d) {
                        gxc.b();
                        return;
                    } else {
                        System.arraycopy(djfVar2.a, 0, djfVar.a, 0, 0);
                        System.arraycopy(djfVar2.b, 0, djfVar.b, 0, 0);
                    }
                }
            }
        }
        wgfVar.zzc = djfVar;
    }

    public static void p(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                igfVar.j(i << 3);
                igfVar.a(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                igfVar.j(i << 3);
                if (intValue >= 0) {
                    igfVar.j(intValue);
                } else {
                    igfVar.l(intValue);
                }
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += igf.m(((Integer) list.get(i4)).intValue());
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            int intValue2 = ((Integer) list.get(i2)).intValue();
            if (intValue2 >= 0) {
                igfVar.j(intValue2);
            } else {
                igfVar.l(intValue2);
            }
            i2++;
        }
    }

    public static void s(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                igfVar.j(i << 3);
                if (intValue >= 0) {
                    igfVar.j(intValue);
                } else {
                    igfVar.l(intValue);
                }
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += igf.m(((Integer) list.get(i4)).intValue());
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            int intValue2 = ((Integer) list.get(i2)).intValue();
            if (intValue2 >= 0) {
                igfVar.j(intValue2);
            } else {
                igfVar.l(intValue2);
            }
            i2++;
        }
    }

    public static void w(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += igf.p(((Long) list.get(i4)).longValue());
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.l(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void y(int i, List list, hoe hoeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        igf igfVar = (igf) hoeVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                igfVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        igfVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        igfVar.j(i3);
        while (i2 < list.size()) {
            igfVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
