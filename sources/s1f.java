// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s1f {
    public static final s1f f = new s1f(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public s1f(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static s1f b() {
        return new s1f(0, new int[8], new Object[8], true);
    }

    public final void a(int i, Object obj) {
        if (!this.e) {
            gxc.b();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void c(eod eodVar) {
        if (this.a != 0) {
            eodVar.getClass();
            nle nleVar = (nle) eodVar.b;
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    long longValue = ((Long) obj).longValue();
                    nleVar.c(i3, 0);
                    nleVar.d(longValue);
                } else if (i4 == 1) {
                    long longValue2 = ((Long) obj).longValue();
                    nleVar.c(i3, 1);
                    nleVar.j(longValue2);
                } else if (i4 == 2) {
                    eodVar.b(i3, (tke) obj);
                } else if (i4 == 3) {
                    nleVar.c(i3, 3);
                    ((s1f) obj).c(eodVar);
                    nleVar.c(i3, 4);
                } else if (i4 != 5) {
                    rjb.m(new yre("Protocol message tag had invalid wire type."));
                    return;
                } else {
                    int intValue = ((Integer) obj).intValue();
                    nleVar.c(i3, 5);
                    nleVar.l(intValue);
                }
            }
        }
    }

    public final int d() {
        int n;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                n = nle.n(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.c[i3]).getClass();
                n = nle.r(i5);
            } else if (i6 == 2) {
                n = nle.i(i5, (tke) this.c[i3]);
            } else if (i6 == 3) {
                i2 = ((s1f) this.c[i3]).d() + (nle.m(i5) << 1) + i2;
            } else {
                if (i6 != 5) {
                    dq9.o(new yre("Protocol message tag had invalid wire type."));
                    return 0;
                }
                ((Integer) this.c[i3]).getClass();
                n = nle.v(i5);
            }
            i2 = n + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s1f)) {
            return false;
        }
        s1f s1fVar = (s1f) obj;
        int i = this.a;
        if (i == s1fVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = s1fVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = s1fVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
