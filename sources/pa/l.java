package pa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends ua.a {
    public static final k E = new k();
    public static final Object F = new Object();
    public Object[] A;
    public int B;
    public String[] C;
    public int[] D;

    @Override // ua.a
    public final void C() {
        int b10 = m1.j.b(x());
        if (b10 == 1) {
            e();
            return;
        }
        if (b10 != 9) {
            if (b10 == 3) {
                f();
                return;
            }
            if (b10 == 4) {
                I(true);
                return;
            }
            K();
            int i10 = this.B;
            if (i10 > 0) {
                int[] iArr = this.D;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    public final void F(int i10) {
        if (x() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + s3.c.n(i10) + " but was " + s3.c.n(x()) + H());
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.B;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.A;
            Object obj = objArr[i10];
            if (obj instanceof ma.h) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.D[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof ma.l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.C[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z10) {
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str = (String) entry.getKey();
        this.C[this.B - 1] = z10 ? "<skipped>" : str;
        L(entry.getValue());
        return str;
    }

    public final Object J() {
        return this.A[this.B - 1];
    }

    public final Object K() {
        Object[] objArr = this.A;
        int i10 = this.B - 1;
        this.B = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i10 = this.B;
        Object[] objArr = this.A;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.A = Arrays.copyOf(objArr, i11);
            this.D = Arrays.copyOf(this.D, i11);
            this.C = (String[]) Arrays.copyOf(this.C, i11);
        }
        Object[] objArr2 = this.A;
        int i12 = this.B;
        this.B = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // ua.a
    public final void a() {
        F(1);
        L(((ma.h) J()).a.iterator());
        this.D[this.B - 1] = 0;
    }

    @Override // ua.a
    public final void b() {
        F(3);
        L(((oa.j) ((ma.l) J()).a.entrySet()).iterator());
    }

    @Override // ua.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A = new Object[]{F};
        this.B = 1;
    }

    @Override // ua.a
    public final void e() {
        F(2);
        K();
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ua.a
    public final void f() {
        F(4);
        this.C[this.B - 1] = null;
        K();
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ua.a
    public final String h() {
        return G(false);
    }

    @Override // ua.a
    public final String j() {
        return G(true);
    }

    @Override // ua.a
    public final boolean k() {
        int x8 = x();
        return (x8 == 4 || x8 == 2 || x8 == 10) ? false : true;
    }

    @Override // ua.a
    public final boolean n() {
        F(8);
        boolean p6 = ((ma.m) K()).p();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p6;
    }

    @Override // ua.a
    public final double o() {
        int x8 = x();
        if (x8 != 7 && x8 != 6) {
            throw new IllegalStateException("Expected " + s3.c.n(7) + " but was " + s3.c.n(x8) + H());
        }
        double q6 = ((ma.m) J()).q();
        if (Double.isNaN(q6) || Double.isInfinite(q6)) {
            throw new ua.c("JSON forbids NaN and infinities: " + q6);
        }
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return q6;
    }

    @Override // ua.a
    public final int p() {
        int x8 = x();
        if (x8 != 7 && x8 != 6) {
            throw new IllegalStateException("Expected " + s3.c.n(7) + " but was " + s3.c.n(x8) + H());
        }
        ma.m mVar = (ma.m) J();
        int intValue = mVar.a instanceof Number ? mVar.r().intValue() : Integer.parseInt(mVar.n());
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return intValue;
    }

    @Override // ua.a
    public final long q() {
        int x8 = x();
        if (x8 != 7 && x8 != 6) {
            throw new IllegalStateException("Expected " + s3.c.n(7) + " but was " + s3.c.n(x8) + H());
        }
        ma.m mVar = (ma.m) J();
        long longValue = mVar.a instanceof Number ? mVar.r().longValue() : Long.parseLong(mVar.n());
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return longValue;
    }

    @Override // ua.a
    public final String r() {
        return I(false);
    }

    @Override // ua.a
    public final void t() {
        F(9);
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ua.a
    public final String toString() {
        return l.class.getSimpleName() + H();
    }

    @Override // ua.a
    public final String v() {
        int x8 = x();
        if (x8 != 6 && x8 != 7) {
            throw new IllegalStateException("Expected " + s3.c.n(6) + " but was " + s3.c.n(x8) + H());
        }
        String n10 = ((ma.m) K()).n();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return n10;
    }

    @Override // ua.a
    public final int x() {
        if (this.B == 0) {
            return 10;
        }
        Object J = J();
        if (J instanceof Iterator) {
            boolean z10 = this.A[this.B - 2] instanceof ma.l;
            Iterator it = (Iterator) J;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            }
            if (z10) {
                return 5;
            }
            L(it.next());
            return x();
        }
        if (J instanceof ma.l) {
            return 3;
        }
        if (J instanceof ma.h) {
            return 1;
        }
        if (J instanceof ma.m) {
            Serializable serializable = ((ma.m) J).a;
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
        if (J instanceof ma.k) {
            return 9;
        }
        if (J == F) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new ua.c("Custom JsonElement subclass " + J.getClass().getName() + " is not supported");
    }
}
