// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class pbe {
    public static final y5d a;

    static {
        jae jaeVar = jae.c;
        a = new y5d();
    }

    public static void a(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = 0;
        if (!(list instanceof h2e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    cwdVar.n(i, (intValue << 1) ^ (intValue >> 31));
                    i2++;
                }
                return;
            }
            cwdVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += cwd.b((intValue2 << 1) ^ (intValue2 >> 31));
            }
            cwdVar.o(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                cwdVar.o((intValue3 << 1) ^ (intValue3 >> 31));
                i2++;
            }
            return;
        }
        h2e h2eVar = (h2e) list;
        if (!z) {
            while (i2 < h2eVar.c) {
                int i5 = h2eVar.i(i2);
                cwdVar.n(i, (i5 << 1) ^ (i5 >> 31));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < h2eVar.c; i7++) {
            int i8 = h2eVar.i(i7);
            i6 += cwd.b((i8 << 1) ^ (i8 >> 31));
        }
        cwdVar.o(i6);
        while (i2 < h2eVar.c) {
            int i9 = h2eVar.i(i2);
            cwdVar.o((i9 << 1) ^ (i9 >> 31));
            i2++;
        }
    }

    public static void b(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof n6e) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                cwdVar.p(i, (longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += cwd.c((longValue2 << 1) ^ (longValue2 >> 63));
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            cwdVar.q((longValue3 << 1) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public static void c(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = 0;
        if (!(list instanceof h2e)) {
            if (!z) {
                while (i2 < list.size()) {
                    cwdVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cwdVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cwd.b(((Integer) list.get(i4)).intValue());
            }
            cwdVar.o(i3);
            while (i2 < list.size()) {
                cwdVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h2e h2eVar = (h2e) list;
        if (!z) {
            while (i2 < h2eVar.c) {
                cwdVar.n(i, h2eVar.i(i2));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h2eVar.c; i6++) {
            i5 += cwd.b(h2eVar.i(i6));
        }
        cwdVar.o(i5);
        while (i2 < h2eVar.c) {
            cwdVar.o(h2eVar.i(i2));
            i2++;
        }
    }

    public static void d(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof n6e) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cwdVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += cwd.c(((Long) list.get(i4)).longValue());
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            cwdVar.q(((Long) list.get(i2)).longValue());
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
        if (!(list instanceof h2e)) {
            int i2 = 0;
            while (i < size) {
                i2 += cwd.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h2e h2eVar = (h2e) list;
        int i3 = 0;
        while (i < size) {
            i3 += cwd.c(h2eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (cwd.b(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (cwd.b(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h2e)) {
            int i2 = 0;
            while (i < size) {
                i2 += cwd.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h2e h2eVar = (h2e) list;
        int i3 = 0;
        while (i < size) {
            i3 += cwd.c(h2eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n6e) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += cwd.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h2e)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += cwd.b((intValue << 1) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        h2e h2eVar = (h2e) list;
        int i3 = 0;
        while (i < size) {
            int i4 = h2eVar.i(i);
            i3 += cwd.b((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n6e) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += cwd.c((longValue << 1) ^ (longValue >> 63));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h2e)) {
            int i2 = 0;
            while (i < size) {
                i2 += cwd.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h2e h2eVar = (h2e) list;
        int i3 = 0;
        while (i < size) {
            i3 += cwd.b(h2eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n6e) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += cwd.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        c2e c2eVar = (c2e) obj;
        iee ieeVar = c2eVar.zzc;
        iee ieeVar2 = ((c2e) obj2).zzc;
        iee ieeVar3 = iee.f;
        if (!ieeVar3.equals(ieeVar2)) {
            if (ieeVar3.equals(ieeVar)) {
                int i = ieeVar.a + ieeVar2.a;
                int[] copyOf = Arrays.copyOf(ieeVar.b, i);
                System.arraycopy(ieeVar2.b, 0, copyOf, ieeVar.a, ieeVar2.a);
                Object[] copyOf2 = Arrays.copyOf(ieeVar.c, i);
                System.arraycopy(ieeVar2.c, 0, copyOf2, ieeVar.a, ieeVar2.a);
                ieeVar = new iee(i, copyOf, copyOf2, true);
            } else {
                ieeVar.getClass();
                if (!ieeVar2.equals(ieeVar3)) {
                    if (!ieeVar.e) {
                        fvc.b();
                        return;
                    }
                    int i2 = ieeVar.a + ieeVar2.a;
                    ieeVar.e(i2);
                    System.arraycopy(ieeVar2.b, 0, ieeVar.b, ieeVar.a, ieeVar2.a);
                    System.arraycopy(ieeVar2.c, 0, ieeVar.c, ieeVar.a, ieeVar2.a);
                    ieeVar.a = i2;
                }
            }
        }
        c2eVar.zzc = ieeVar;
    }

    public static void p(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = cwdVar.c;
        byte[] bArr = cwdVar.b;
        if (list instanceof tsd) {
            fyb.g();
            return;
        }
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                cwdVar.o(i << 3);
                int i4 = cwdVar.d;
                int i5 = i4 + 1;
                try {
                    bArr[i4] = booleanValue;
                    cwdVar.d = i5;
                    i3++;
                } catch (IndexOutOfBoundsException e) {
                    throw new bk2(i5, i2, 1, e);
                }
            }
            return;
        }
        cwdVar.m(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        cwdVar.o(i6);
        while (i3 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i8 = cwdVar.d;
            int i9 = i8 + 1;
            try {
                bArr[i8] = booleanValue2;
                cwdVar.d = i9;
                i3++;
            } catch (IndexOutOfBoundsException e2) {
                throw new bk2(i9, i2, 1, e2);
            }
        }
    }

    public static void q(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof zwd) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cwdVar.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            cwdVar.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = 0;
        if (!(list instanceof h2e)) {
            if (!z) {
                while (i2 < list.size()) {
                    cwdVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cwdVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cwd.c(((Integer) list.get(i4)).intValue());
            }
            cwdVar.o(i3);
            while (i2 < list.size()) {
                cwdVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h2e h2eVar = (h2e) list;
        if (!z) {
            while (i2 < h2eVar.c) {
                cwdVar.j(i, h2eVar.i(i2));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h2eVar.c; i6++) {
            i5 += cwd.c(h2eVar.i(i6));
        }
        cwdVar.o(i5);
        while (i2 < h2eVar.c) {
            cwdVar.k(h2eVar.i(i2));
            i2++;
        }
    }

    public static void s(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = 0;
        if (!(list instanceof h2e)) {
            if (!z) {
                while (i2 < list.size()) {
                    cwdVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cwdVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            cwdVar.o(i3);
            while (i2 < list.size()) {
                cwdVar.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h2e h2eVar = (h2e) list;
        if (!z) {
            while (i2 < h2eVar.c) {
                cwdVar.f(i, h2eVar.i(i2));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h2eVar.c; i6++) {
            h2eVar.i(i6);
            i5 += 4;
        }
        cwdVar.o(i5);
        while (i2 < h2eVar.c) {
            cwdVar.g(h2eVar.i(i2));
            i2++;
        }
    }

    public static void t(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof n6e) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cwdVar.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            cwdVar.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof kzd) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cwdVar.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            cwdVar.g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = 0;
        if (!(list instanceof h2e)) {
            if (!z) {
                while (i2 < list.size()) {
                    cwdVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cwdVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cwd.c(((Integer) list.get(i4)).intValue());
            }
            cwdVar.o(i3);
            while (i2 < list.size()) {
                cwdVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h2e h2eVar = (h2e) list;
        if (!z) {
            while (i2 < h2eVar.c) {
                cwdVar.j(i, h2eVar.i(i2));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h2eVar.c; i6++) {
            i5 += cwd.c(h2eVar.i(i6));
        }
        cwdVar.o(i5);
        while (i2 < h2eVar.c) {
            cwdVar.k(h2eVar.i(i2));
            i2++;
        }
    }

    public static void w(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof n6e) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cwdVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += cwd.c(((Long) list.get(i4)).longValue());
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            cwdVar.q(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        int i2 = 0;
        if (!(list instanceof h2e)) {
            if (!z) {
                while (i2 < list.size()) {
                    cwdVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cwdVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            cwdVar.o(i3);
            while (i2 < list.size()) {
                cwdVar.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h2e h2eVar = (h2e) list;
        if (!z) {
            while (i2 < h2eVar.c) {
                cwdVar.f(i, h2eVar.i(i2));
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h2eVar.c; i6++) {
            h2eVar.i(i6);
            i5 += 4;
        }
        cwdVar.o(i5);
        while (i2 < h2eVar.c) {
            cwdVar.g(h2eVar.i(i2));
            i2++;
        }
    }

    public static void y(int i, List list, xdd xddVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cwd cwdVar = (cwd) xddVar.a;
        if (list instanceof n6e) {
            fyb.g();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                cwdVar.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cwdVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        cwdVar.o(i3);
        while (i2 < list.size()) {
            cwdVar.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
