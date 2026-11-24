// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qk0 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public qk0(int i, int i2) {
        if (i < 1 || i2 < 1) {
            u36.j("Both dimensions must be greater than 0");
            throw null;
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] ^ (1 << (i & 31));
    }

    public final boolean b(int i, int i2) {
        return ((this.d[(i / 32) + (i2 * this.c)] >>> (i & 31)) & 1) != 0;
    }

    public final void c(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] | (1 << (i & 31));
    }

    public final Object clone() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int[] iArr = (int[]) this.d.clone();
        qk0 qk0Var = new qk0();
        qk0Var.a = i;
        qk0Var.b = i2;
        qk0Var.c = i3;
        qk0Var.d = iArr;
        return qk0Var;
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            u36.j("Left and top must be nonnegative");
            return;
        }
        if (i4 < 1 || i3 < 1) {
            u36.j("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.b || i5 > this.a) {
            u36.j("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qk0)) {
            return false;
        }
        qk0 qk0Var = (qk0) obj;
        return this.a == qk0Var.a && this.b == qk0Var.b && this.c == qk0Var.c && Arrays.equals(this.d, qk0Var.d);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.d) + (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(b(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
