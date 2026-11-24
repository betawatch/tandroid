// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rtc implements stc {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, nm7.r1, nm7.C1, nm7.N1, nm7.Y1, nm7.m2, nm7.C2, nm7.T2, nm7.m3, 230, nm7.b4, nm7.B4, nm7.d5, nm7.H5, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final u84 a;
    public final yzb b;
    public final tm9 c;
    public final int d;
    public final byte[] e;
    public final yw7 f;
    public final int g;
    public final go4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public rtc(u84 u84Var, yzb yzbVar, tm9 tm9Var) {
        this.a = u84Var;
        this.b = yzbVar;
        this.c = tm9Var;
        int i = tm9Var.b;
        int max = Math.max(1, i / 10);
        this.g = max;
        yw7 yw7Var = new yw7((byte[]) tm9Var.f);
        yw7Var.t();
        int t = yw7Var.t();
        this.d = t;
        int i2 = tm9Var.a;
        int i3 = tm9Var.c;
        int i4 = (((i3 - (i2 << 2)) << 3) / (tm9Var.d * i2)) + 1;
        if (t != i4) {
            throw bx7.a("Expected frames per block: " + i4 + "; got: " + t, null);
        }
        int g = hac.g(max, t);
        this.e = new byte[g * i3];
        this.f = new yw7((t << 1) * i2 * g);
        int i5 = ((i3 * i) << 3) / t;
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("audio/raw");
        fo4Var.i = i5;
        fo4Var.j = i5;
        fo4Var.t = (max << 1) * i2;
        fo4Var.M = i2;
        int i6 = tm9Var.e;
        fo4Var.N = i6 == 0 ? -1 : i6 << 2;
        fo4Var.O = i;
        fo4Var.P = 2;
        this.h = new go4(fo4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0021, code lost:
    
        r9 = true;
     */
    @Override // stc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(vb3 vb3Var, long j) {
        boolean z;
        byte[] bArr;
        int i;
        yw7 yw7Var;
        int i2;
        int i3 = this.k;
        tm9 tm9Var = this.c;
        boolean z2 = true;
        int i4 = i3 / (tm9Var.a << 1);
        int i5 = this.g;
        int i6 = this.d;
        int g = hac.g(i5 - i4, i6);
        int i7 = tm9Var.c;
        int i8 = g * i7;
        if (j != 0) {
            z = false;
            while (true) {
                bArr = this.e;
                if (z || (i2 = this.i) >= i8) {
                    break;
                }
                int read = vb3Var.read(bArr, this.i, (int) Math.min(i8 - i2, j));
                if (read != -1) {
                    this.i += read;
                }
            }
            int i9 = this.i / i7;
            if (i9 > 0) {
                int i10 = 0;
                while (true) {
                    yw7Var = this.f;
                    if (i10 >= i9) {
                        break;
                    }
                    int i11 = 0;
                    while (true) {
                        int i12 = tm9Var.a;
                        if (i11 < i12) {
                            byte[] bArr2 = yw7Var.a;
                            int i13 = (i10 * i7) + (i11 << 2);
                            int i14 = i13 + (i12 << 2);
                            int i15 = (i7 / i12) - 4;
                            boolean z3 = z2;
                            int i16 = (short) (((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255));
                            int min = Math.min(bArr[i13 + 2] & 255, 88);
                            int[] iArr = n;
                            int i17 = iArr[min];
                            int i18 = (((i10 * i6) * i12) + i11) << 1;
                            bArr2[i18] = (byte) (i16 & nm7.d4);
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
                                i16 = hac.i(i16 + i23, -32768, 32767);
                                i18 += i12 << 1;
                                bArr2[i18] = (byte) (i16 & nm7.d4);
                                bArr2[i18 + 1] = (byte) (i16 >> 8);
                                min = hac.i(min + m[i22], 0, 88);
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
                int i25 = ((i6 * i24) << 1) * tm9Var.a;
                yw7Var.N(0);
                yw7Var.M(i25);
                this.i -= i24 * i7;
                int i26 = yw7Var.c;
                this.b.e(i26, yw7Var);
                int i27 = this.k + i26;
                this.k = i27;
                if (i27 / (tm9Var.a << 1) >= i5) {
                    d(i5);
                }
            }
            if (z && (i = this.k / (tm9Var.a << 1)) > 0) {
                d(i);
            }
            return z;
        }
        z = true;
    }

    @Override // stc
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // stc
    public final void c(int i, long j) {
        wtc wtcVar = new wtc(this.c, this.d, i, j);
        this.a.f0(wtcVar);
        go4 go4Var = this.h;
        yzb yzbVar = this.b;
        yzbVar.g(go4Var);
        yzbVar.d(wtcVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        tm9 tm9Var = this.c;
        long j3 = tm9Var.b;
        String str = hac.a;
        long b0 = j + hac.b0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * tm9Var.a;
        this.b.a(b0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
