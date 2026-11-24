// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class prc implements qrc {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, kk7.r1, kk7.C1, kk7.N1, kk7.Y1, kk7.m2, kk7.C2, kk7.T2, kk7.m3, kk7.F3, kk7.b4, kk7.B4, kk7.d5, kk7.H5, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final l74 a;
    public final wxb b;
    public final sk9 c;
    public final int d;
    public final byte[] e;
    public final xu7 f;
    public final int g;
    public final fm4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public prc(l74 l74Var, wxb wxbVar, sk9 sk9Var) {
        this.a = l74Var;
        this.b = wxbVar;
        this.c = sk9Var;
        int i = sk9Var.b;
        int max = Math.max(1, i / 10);
        this.g = max;
        xu7 xu7Var = new xu7((byte[]) sk9Var.f);
        xu7Var.t();
        int t = xu7Var.t();
        this.d = t;
        int i2 = sk9Var.a;
        int i3 = sk9Var.c;
        int i4 = (((i3 - (i2 << 2)) << 3) / (sk9Var.d * i2)) + 1;
        if (t != i4) {
            throw av7.a("Expected frames per block: " + i4 + "; got: " + t, null);
        }
        int g = g8c.g(max, t);
        this.e = new byte[g * i3];
        this.f = new xu7((t << 1) * i2 * g);
        int i5 = ((i3 * i) << 3) / t;
        em4 em4Var = new em4();
        em4Var.s = ud7.n("audio/raw");
        em4Var.i = i5;
        em4Var.j = i5;
        em4Var.t = (max << 1) * i2;
        em4Var.M = i2;
        int i6 = sk9Var.e;
        em4Var.N = i6 == 0 ? -1 : i6 << 2;
        em4Var.O = i;
        em4Var.P = 2;
        this.h = new fm4(em4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0021, code lost:
    
        r9 = true;
     */
    @Override // qrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ja3 ja3Var, long j) {
        boolean z;
        byte[] bArr;
        int i;
        xu7 xu7Var;
        int i2;
        int i3 = this.k;
        sk9 sk9Var = this.c;
        boolean z2 = true;
        int i4 = i3 / (sk9Var.a << 1);
        int i5 = this.g;
        int i6 = this.d;
        int g = g8c.g(i5 - i4, i6);
        int i7 = sk9Var.c;
        int i8 = g * i7;
        if (j != 0) {
            z = false;
            while (true) {
                bArr = this.e;
                if (z || (i2 = this.i) >= i8) {
                    break;
                }
                int read = ja3Var.read(bArr, this.i, (int) Math.min(i8 - i2, j));
                if (read != -1) {
                    this.i += read;
                }
            }
            int i9 = this.i / i7;
            if (i9 > 0) {
                int i10 = 0;
                while (true) {
                    xu7Var = this.f;
                    if (i10 >= i9) {
                        break;
                    }
                    int i11 = 0;
                    while (true) {
                        int i12 = sk9Var.a;
                        if (i11 < i12) {
                            byte[] bArr2 = xu7Var.a;
                            int i13 = (i10 * i7) + (i11 << 2);
                            int i14 = i13 + (i12 << 2);
                            int i15 = (i7 / i12) - 4;
                            boolean z3 = z2;
                            int i16 = (short) (((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255));
                            int min = Math.min(bArr[i13 + 2] & 255, 88);
                            int[] iArr = n;
                            int i17 = iArr[min];
                            int i18 = (((i10 * i6) * i12) + i11) << 1;
                            bArr2[i18] = (byte) (i16 & kk7.d4);
                            int i19 = i9;
                            bArr2[i18 + 1] = (byte) (i16 >> 8);
                            int i20 = 0;
                            while (i20 < (i15 << 1)) {
                                byte b = bArr[i14 + (((i20 / 8) * i12) << 2) + ((i20 / 2) % 4)];
                                int i21 = i20;
                                int i22 = i21 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                                int i23 = ((((i22 & 7) << 1) + 1) * i17) >> 3;
                                if ((i22 & 8) != 0) {
                                    i23 = -i23;
                                }
                                i16 = g8c.i(i16 + i23, -32768, 32767);
                                i18 += i12 << 1;
                                bArr2[i18] = (byte) (i16 & kk7.d4);
                                bArr2[i18 + 1] = (byte) (i16 >> 8);
                                min = g8c.i(min + m[i22], 0, 88);
                                i10 = i10;
                                i17 = iArr[min];
                                i20 = i21 + 1;
                            }
                            i11++;
                            i9 = i19;
                            z2 = z3;
                        }
                    }
                    i10++;
                }
                int i24 = i9;
                int i25 = ((i6 * i24) << 1) * sk9Var.a;
                xu7Var.N(0);
                xu7Var.M(i25);
                this.i -= i24 * i7;
                int i26 = xu7Var.c;
                this.b.e(i26, xu7Var);
                int i27 = this.k + i26;
                this.k = i27;
                if (i27 / (sk9Var.a << 1) >= i5) {
                    d(i5);
                }
            }
            if (z && (i = this.k / (sk9Var.a << 1)) > 0) {
                d(i);
            }
            return z;
        }
        z = true;
    }

    @Override // qrc
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // qrc
    public final void c(int i, long j) {
        urc urcVar = new urc(this.c, this.d, i, j);
        this.a.g0(urcVar);
        fm4 fm4Var = this.h;
        wxb wxbVar = this.b;
        wxbVar.g(fm4Var);
        wxbVar.d(urcVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        sk9 sk9Var = this.c;
        long j3 = sk9Var.b;
        String str = g8c.a;
        long b0 = j + g8c.b0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * sk9Var.a;
        this.b.a(b0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
