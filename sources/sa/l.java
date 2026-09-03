package sa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l extends xa.a {
    public static final k F = new k();
    public static final Object G = new Object();
    public Object[] B;
    public int C;
    public String[] D;
    public int[] E;

    @Override // xa.a
    public final void C() {
        int c3 = m1.j.c(x());
        if (c3 == 1) {
            e();
            return;
        }
        if (c3 != 9) {
            if (c3 == 3) {
                f();
                return;
            }
            if (c3 == 4) {
                I(true);
                return;
            }
            K();
            int i10 = this.C;
            if (i10 > 0) {
                int[] iArr = this.E;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    public final void F(int i10) {
        if (x() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + w.c.m(i10) + " but was " + w.c.m(x()) + H());
    }

    public final String G(boolean z4) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.C;
            if (i10 >= i11) {
                return sb.toString();
            }
            Object[] objArr = this.B;
            Object obj = objArr[i10];
            if (obj instanceof pa.h) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.E[i10];
                    if (z4 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb.append('[');
                    sb.append(i12);
                    sb.append(']');
                }
            } else if ((obj instanceof pa.l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb.append('.');
                String str = this.D[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z4) {
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str = (String) entry.getKey();
        this.D[this.C - 1] = z4 ? "<skipped>" : str;
        L(entry.getValue());
        return str;
    }

    public final Object J() {
        return this.B[this.C - 1];
    }

    public final Object K() {
        Object[] objArr = this.B;
        int i10 = this.C - 1;
        this.C = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i10 = this.C;
        Object[] objArr = this.B;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.B = Arrays.copyOf(objArr, i11);
            this.E = Arrays.copyOf(this.E, i11);
            this.D = (String[]) Arrays.copyOf(this.D, i11);
        }
        Object[] objArr2 = this.B;
        int i12 = this.C;
        this.C = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // xa.a
    public final void a() {
        F(1);
        L(((pa.h) J()).a.iterator());
        this.E[this.C - 1] = 0;
    }

    @Override // xa.a
    public final void b() {
        F(3);
        L(((ra.j) ((pa.l) J()).a.entrySet()).iterator());
    }

    @Override // xa.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = new Object[]{G};
        this.C = 1;
    }

    @Override // xa.a
    public final void e() {
        F(2);
        K();
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // xa.a
    public final void f() {
        F(4);
        this.D[this.C - 1] = null;
        K();
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // xa.a
    public final String h() {
        return G(false);
    }

    @Override // xa.a
    public final String j() {
        return G(true);
    }

    @Override // xa.a
    public final boolean k() {
        int x10 = x();
        return (x10 == 4 || x10 == 2 || x10 == 10) ? false : true;
    }

    @Override // xa.a
    public final boolean n() {
        F(8);
        boolean p10 = ((pa.m) K()).p();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p10;
    }

    @Override // xa.a
    public final double o() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + w.c.m(7) + " but was " + w.c.m(x10) + H());
        }
        double q10 = ((pa.m) J()).q();
        if (Double.isNaN(q10) || Double.isInfinite(q10)) {
            throw new xa.c("JSON forbids NaN and infinities: " + q10);
        }
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return q10;
    }

    @Override // xa.a
    public final int p() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + w.c.m(7) + " but was " + w.c.m(x10) + H());
        }
        pa.m mVar = (pa.m) J();
        int intValue = mVar.a instanceof Number ? mVar.r().intValue() : Integer.parseInt(mVar.n());
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return intValue;
    }

    @Override // xa.a
    public final long q() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + w.c.m(7) + " but was " + w.c.m(x10) + H());
        }
        pa.m mVar = (pa.m) J();
        long longValue = mVar.a instanceof Number ? mVar.r().longValue() : Long.parseLong(mVar.n());
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return longValue;
    }

    @Override // xa.a
    public final String r() {
        return I(false);
    }

    @Override // xa.a
    public final void t() {
        F(9);
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // xa.a
    public final String toString() {
        return l.class.getSimpleName() + H();
    }

    @Override // xa.a
    public final String v() {
        int x10 = x();
        if (x10 != 6 && x10 != 7) {
            throw new IllegalStateException("Expected " + w.c.m(6) + " but was " + w.c.m(x10) + H());
        }
        String n10 = ((pa.m) K()).n();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return n10;
    }

    @Override // xa.a
    public final int x() {
        if (this.C == 0) {
            return 10;
        }
        Object J = J();
        if (J instanceof Iterator) {
            boolean z4 = this.B[this.C - 2] instanceof pa.l;
            Iterator it = (Iterator) J;
            if (!it.hasNext()) {
                return z4 ? 4 : 2;
            }
            if (z4) {
                return 5;
            }
            L(it.next());
            return x();
        }
        if (J instanceof pa.l) {
            return 3;
        }
        if (J instanceof pa.h) {
            return 1;
        }
        if (J instanceof pa.m) {
            Serializable serializable = ((pa.m) J).a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (J instanceof pa.k) {
            return 9;
        }
        if (J == G) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new xa.c("Custom JsonElement subclass " + J.getClass().getName() + " is not supported");
    }
}
