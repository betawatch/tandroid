// default package

import android.util.SparseArray;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rj0 implements my0 {
    public final /* synthetic */ byte a = 2;
    public int b;
    public int c;
    public final Object d;

    public rj0(mf7 mf7Var, fm4 fm4Var) {
        xu7 xu7Var = mf7Var.e;
        this.d = xu7Var;
        xu7Var.N(12);
        int E = xu7Var.E();
        if ("audio/raw".equals(fm4Var.t)) {
            int u = g8c.u(fm4Var.Q) * fm4Var.N;
            if (E % u != 0) {
                lad.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u + ", stsz sample size: " + E);
                E = u;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = xu7Var.E();
    }

    @Override // my0
    public final int a() {
        return this.b;
    }

    @Override // my0
    public final int b() {
        return this.c;
    }

    @Override // my0
    public final int c() {
        int i = this.b;
        return i == -1 ? ((xu7) this.d).E() : i;
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
            w26.j(String.valueOf(i));
            return 0;
        }
        int i3 = this.c;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int min = Math.min(i, i4);
            int i5 = i4 - min;
            int i6 = (kk7.d4 >> (8 - min)) << i5;
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
        int i12 = (i2 << i) | ((bArr[this.b] & ((kk7.d4 >> i11) << i11)) >> i11);
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

    public rj0(byte[] bArr) {
        this.d = bArr;
    }

    public rj0(int i, int i2, SparseArray sparseArray) {
        this.b = i;
        this.c = i2;
        this.d = sparseArray;
    }

    public rj0(int i, int i2) {
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }
}
