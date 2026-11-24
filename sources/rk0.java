// default package

import android.util.SparseArray;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rk0 implements tz0 {
    public final /* synthetic */ byte a = 2;
    public int b;
    public int c;
    public final Object d;

    public rk0(ph7 ph7Var, go4 go4Var) {
        yw7 yw7Var = ph7Var.e;
        this.d = yw7Var;
        yw7Var.N(12);
        int E = yw7Var.E();
        if ("audio/raw".equals(go4Var.t)) {
            int u = hac.u(go4Var.Q) * go4Var.N;
            if (E % u != 0) {
                ncd.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u + ", stsz sample size: " + E);
                E = u;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = yw7Var.E();
    }

    @Override // tz0
    public final int a() {
        return this.b;
    }

    @Override // tz0
    public final int b() {
        return this.c;
    }

    @Override // tz0
    public final int c() {
        int i = this.b;
        return i == -1 ? ((yw7) this.d).E() : i;
    }

    public final int d() {
        return ((((byte[]) this.d).length - this.b) << 3) - this.c;
    }

    public final byte e(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public final int f(int i) {
        byte[] bArr = (byte[]) this.d;
        int i2 = 0;
        if (i < 1 || i > 32 || i > d()) {
            u36.j(String.valueOf(i));
            return 0;
        }
        int i3 = this.c;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int min = Math.min(i, i4);
            int i5 = i4 - min;
            int i6 = (nm7.d4 >> (8 - min)) << i5;
            int i7 = this.b;
            int i8 = (bArr[i7] & i6) >> i5;
            i -= min;
            int i9 = this.c + min;
            this.c = i9;
            if (i9 == 8) {
                this.c = 0;
                this.b = i7 + 1;
            }
            i2 = i8;
        }
        if (i <= 0) {
            return i2;
        }
        while (i >= 8) {
            int i10 = this.b;
            i2 = (i2 << 8) | (bArr[i10] & 255);
            this.b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i2;
        }
        int i11 = 8 - i;
        int i12 = (i2 << i) | ((bArr[this.b] & ((nm7.d4 >> i11) << i11)) >> i11);
        this.c += i;
        return i12;
    }

    public final void g(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder(((i << 1) * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public rk0(byte[] bArr) {
        this.d = bArr;
    }

    public rk0(int i, int i2, SparseArray sparseArray) {
        this.b = i;
        this.c = i2;
        this.d = sparseArray;
    }

    public rk0(int i, int i2) {
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }
}
