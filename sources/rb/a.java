package rb;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public static final a h;
    public final int[] a;
    public final int[] b;
    public final b c;
    public final b d;
    public final int e;
    public final int f;
    public final int g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i10, int i11, int i12) {
        this.f = i10;
        this.e = i11;
        this.g = i12;
        this.a = new int[i11];
        this.b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.b[this.a[i15]] = i15;
        }
        this.c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public final int b(int i10) {
        if (i10 == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i10]) - 1];
    }

    public final int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i10] + iArr[i11]) % (this.e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
