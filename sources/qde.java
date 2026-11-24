// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qde {
    public static final a8d a;

    static {
        kce kceVar = kce.c;
        a = new a8d();
    }

    public static void a(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = 0;
        if (!(list instanceof k4e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    fydVar.n(i, (intValue << 1) ^ (intValue >> 31));
                    i2++;
                }
                return;
            }
            fydVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += fyd.b((intValue2 << 1) ^ (intValue2 >> 31));
            }
            fydVar.o(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                fydVar.o((intValue3 << 1) ^ (intValue3 >> 31));
                i2++;
            }
            return;
        }
        k4e k4eVar = (k4e) list;
        if (!z) {
            while (i2 < k4eVar.c) {
                int i5 = k4eVar.i(i2);
                fydVar.n(i, (i5 << 1) ^ (i5 >> 31));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < k4eVar.c; i7++) {
            int i8 = k4eVar.i(i7);
            i6 += fyd.b((i8 << 1) ^ (i8 >> 31));
        }
        fydVar.o(i6);
        while (i2 < k4eVar.c) {
            int i9 = k4eVar.i(i2);
            fydVar.o((i9 << 1) ^ (i9 >> 31));
            i2++;
        }
    }

    public static void b(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof o8e) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                fydVar.p(i, (longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += fyd.c((longValue2 << 1) ^ (longValue2 >> 63));
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            fydVar.q((longValue3 << 1) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public static void c(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = 0;
        if (!(list instanceof k4e)) {
            if (!z) {
                while (i2 < list.size()) {
                    fydVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fydVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += fyd.b(((Integer) list.get(i4)).intValue());
            }
            fydVar.o(i3);
            while (i2 < list.size()) {
                fydVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        k4e k4eVar = (k4e) list;
        if (!z) {
            while (i2 < k4eVar.c) {
                fydVar.n(i, k4eVar.i(i2));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k4eVar.c; i6++) {
            i5 += fyd.b(k4eVar.i(i6));
        }
        fydVar.o(i5);
        while (i2 < k4eVar.c) {
            fydVar.o(k4eVar.i(i2));
            i2++;
        }
    }

    public static void d(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof o8e) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fydVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += fyd.c(((Long) list.get(i4)).longValue());
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            fydVar.q(((Long) list.get(i2)).longValue());
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
        if (!(list instanceof k4e)) {
            int i2 = 0;
            while (i < size) {
                i2 += fyd.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k4e k4eVar = (k4e) list;
        int i3 = 0;
        while (i < size) {
            i3 += fyd.c(k4eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fyd.b(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fyd.b(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k4e)) {
            int i2 = 0;
            while (i < size) {
                i2 += fyd.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k4e k4eVar = (k4e) list;
        int i3 = 0;
        while (i < size) {
            i3 += fyd.c(k4eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8e) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += fyd.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k4e)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += fyd.b((intValue << 1) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        k4e k4eVar = (k4e) list;
        int i3 = 0;
        while (i < size) {
            int i4 = k4eVar.i(i);
            i3 += fyd.b((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8e) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += fyd.c((longValue << 1) ^ (longValue >> 63));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k4e)) {
            int i2 = 0;
            while (i < size) {
                i2 += fyd.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k4e k4eVar = (k4e) list;
        int i3 = 0;
        while (i < size) {
            i3 += fyd.b(k4eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8e) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += fyd.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        f4e f4eVar = (f4e) obj;
        jge jgeVar = f4eVar.zzc;
        jge jgeVar2 = ((f4e) obj2).zzc;
        jge jgeVar3 = jge.f;
        if (!jgeVar3.equals(jgeVar2)) {
            if (jgeVar3.equals(jgeVar)) {
                int i = jgeVar.a + jgeVar2.a;
                int[] copyOf = Arrays.copyOf(jgeVar.b, i);
                System.arraycopy(jgeVar2.b, 0, copyOf, jgeVar.a, jgeVar2.a);
                Object[] copyOf2 = Arrays.copyOf(jgeVar.c, i);
                System.arraycopy(jgeVar2.c, 0, copyOf2, jgeVar.a, jgeVar2.a);
                jgeVar = new jge(i, copyOf, copyOf2, true);
            } else {
                jgeVar.getClass();
                if (!jgeVar2.equals(jgeVar3)) {
                    if (!jgeVar.e) {
                        gxc.b();
                        return;
                    }
                    int i2 = jgeVar.a + jgeVar2.a;
                    jgeVar.e(i2);
                    System.arraycopy(jgeVar2.b, 0, jgeVar.b, jgeVar.a, jgeVar2.a);
                    System.arraycopy(jgeVar2.c, 0, jgeVar.c, jgeVar.a, jgeVar2.a);
                    jgeVar.a = i2;
                }
            }
        }
        f4eVar.zzc = jgeVar;
    }

    public static void p(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = fydVar.c;
        byte[] bArr = fydVar.b;
        if (list instanceof wud) {
            rjb.p();
            return;
        }
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                fydVar.o(i << 3);
                int i4 = fydVar.d;
                int i5 = i4 + 1;
                try {
                    bArr[i4] = booleanValue;
                    fydVar.d = i5;
                    i3++;
                } catch (IndexOutOfBoundsException e) {
                    throw new ol2(i5, i2, 1, e);
                }
            }
            return;
        }
        fydVar.m(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        fydVar.o(i6);
        while (i3 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i8 = fydVar.d;
            int i9 = i8 + 1;
            try {
                bArr[i8] = booleanValue2;
                fydVar.d = i9;
                i3++;
            } catch (IndexOutOfBoundsException e2) {
                throw new ol2(i9, i2, 1, e2);
            }
        }
    }

    public static void q(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof czd) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fydVar.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            fydVar.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = 0;
        if (!(list instanceof k4e)) {
            if (!z) {
                while (i2 < list.size()) {
                    fydVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fydVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += fyd.c(((Integer) list.get(i4)).intValue());
            }
            fydVar.o(i3);
            while (i2 < list.size()) {
                fydVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        k4e k4eVar = (k4e) list;
        if (!z) {
            while (i2 < k4eVar.c) {
                fydVar.j(i, k4eVar.i(i2));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k4eVar.c; i6++) {
            i5 += fyd.c(k4eVar.i(i6));
        }
        fydVar.o(i5);
        while (i2 < k4eVar.c) {
            fydVar.k(k4eVar.i(i2));
            i2++;
        }
    }

    public static void s(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = 0;
        if (!(list instanceof k4e)) {
            if (!z) {
                while (i2 < list.size()) {
                    fydVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fydVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            fydVar.o(i3);
            while (i2 < list.size()) {
                fydVar.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        k4e k4eVar = (k4e) list;
        if (!z) {
            while (i2 < k4eVar.c) {
                fydVar.f(i, k4eVar.i(i2));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k4eVar.c; i6++) {
            k4eVar.i(i6);
            i5 += 4;
        }
        fydVar.o(i5);
        while (i2 < k4eVar.c) {
            fydVar.g(k4eVar.i(i2));
            i2++;
        }
    }

    public static void t(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof o8e) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fydVar.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            fydVar.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof n1e) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fydVar.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            fydVar.g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = 0;
        if (!(list instanceof k4e)) {
            if (!z) {
                while (i2 < list.size()) {
                    fydVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fydVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += fyd.c(((Integer) list.get(i4)).intValue());
            }
            fydVar.o(i3);
            while (i2 < list.size()) {
                fydVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        k4e k4eVar = (k4e) list;
        if (!z) {
            while (i2 < k4eVar.c) {
                fydVar.j(i, k4eVar.i(i2));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k4eVar.c; i6++) {
            i5 += fyd.c(k4eVar.i(i6));
        }
        fydVar.o(i5);
        while (i2 < k4eVar.c) {
            fydVar.k(k4eVar.i(i2));
            i2++;
        }
    }

    public static void w(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof o8e) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fydVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += fyd.c(((Long) list.get(i4)).longValue());
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            fydVar.q(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        int i2 = 0;
        if (!(list instanceof k4e)) {
            if (!z) {
                while (i2 < list.size()) {
                    fydVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fydVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            fydVar.o(i3);
            while (i2 < list.size()) {
                fydVar.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        k4e k4eVar = (k4e) list;
        if (!z) {
            while (i2 < k4eVar.c) {
                fydVar.f(i, k4eVar.i(i2));
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k4eVar.c; i6++) {
            k4eVar.i(i6);
            i5 += 4;
        }
        fydVar.o(i5);
        while (i2 < k4eVar.c) {
            fydVar.g(k4eVar.i(i2));
            i2++;
        }
    }

    public static void y(int i, List list, cf9 cf9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fyd fydVar = (fyd) cf9Var.b;
        if (list instanceof o8e) {
            rjb.p();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fydVar.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fydVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        fydVar.o(i3);
        while (i2 < list.size()) {
            fydVar.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
