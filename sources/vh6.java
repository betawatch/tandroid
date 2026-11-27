// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vh6 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public Serializable e;

    /* JADX WARN: Multi-variable type inference failed */
    public vh6(byte[] bArr, int i, int i2) {
        this.e = bArr;
        this.b = i;
        this.c = i;
        this.a = i2;
        a();
    }

    public final void a() {
        int i;
        int i2 = this.c;
        yve.p(i2 >= 0 && (i2 < (i = this.a) || (i2 == i && this.d == 0)));
    }

    public final boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.a) {
                break;
            }
            if (i(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.a;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public final boolean c() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.a && !d()) {
            i3++;
        }
        boolean z = this.c == this.a;
        this.c = i;
        this.d = i2;
        return !z && b((i3 << 1) + 1);
    }

    public final boolean d() {
        boolean z = (((byte[]) this.e)[this.c] & (128 >> this.d)) != 0;
        j();
        return z;
    }

    public final int e(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.d = i4;
            byte[] bArr = (byte[]) this.e;
            int i5 = this.c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!i(i5 + 1)) {
                r3 = 1;
            }
            this.c = i5 + r3;
        }
        byte[] bArr2 = (byte[]) this.e;
        int i6 = this.c;
        int i7 = (i3 | ((bArr2[i6] & 255) >> (8 - i2))) & ((-1) >>> (32 - i));
        if (i2 == 8) {
            this.d = 0;
            this.c = i6 + (i(i6 + 1) ? 2 : 1);
        }
        a();
        return i7;
    }

    public final int f() {
        int i = 0;
        while (!d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e(i) : 0);
    }

    public final int g() {
        int f = f();
        return ((f + 1) / 2) * (f % 2 == 0 ? -1 : 1);
    }

    public final long h() {
        int i = this.c;
        if (i == 0) {
            lq5.n();
            return 0L;
        }
        long[] jArr = (long[]) this.e;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = (i2 + 1) & this.d;
        this.c = i - 1;
        return j;
    }

    public final boolean i(int i) {
        int i2 = i - 2;
        if (this.b > i2 || i >= this.a) {
            return false;
        }
        byte[] bArr = (byte[]) this.e;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public final void j() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (i(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public final void k(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = (i - (i3 << 3)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                a();
                return;
            } else if (i(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }
}
