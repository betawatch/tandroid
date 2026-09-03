package pb;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i10;
        this.b = i11;
        int i12 = (i10 + 31) / 32;
        this.c = i12;
        this.d = new int[i12 * i11];
    }

    public final void a(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.c);
        int[] iArr = this.d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public final boolean b(int i10, int i11) {
        return ((this.d[(i10 / 32) + (i11 * this.c)] >>> (i10 & 31)) & 1) != 0;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.b || i14 > this.a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public final Object clone() {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.c;
        int[] iArr = (int[]) this.d.clone();
        b bVar = new b();
        bVar.a = i10;
        bVar.b = i11;
        bVar.c = i12;
        bVar.d = iArr;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        int i10 = this.a;
        return Arrays.hashCode(this.d) + (((((((i10 * 31) + i10) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        int i10 = this.b;
        int i11 = this.a;
        StringBuilder sb = new StringBuilder((i11 + 1) * i10);
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                sb.append(b(i13, i12) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
