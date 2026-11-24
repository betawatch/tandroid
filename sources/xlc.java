// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xlc extends yab {
    public e7a n;
    public int o;
    public boolean p;
    public ylc q;
    public cf9 r;

    @Override // yab
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        ylc ylcVar = this.q;
        this.o = ylcVar != null ? ylcVar.e : 0;
    }

    @Override // yab
    public final long b(yw7 yw7Var) {
        if ((yw7Var.a[0] & 1) == 1) {
            return -1L;
        }
        e7a e7aVar = this.n;
        e7aVar.getClass();
        byte b = yw7Var.a[0];
        ylc ylcVar = (ylc) e7aVar.a;
        gp5[] gp5VarArr = (gp5[]) e7aVar.d;
        int i = gp5VarArr[(b >> 1) & (nm7.d4 >>> (8 - c0f.a(gp5VarArr.length - 1)))].b ? ylcVar.f : ylcVar.e;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = yw7Var.a;
        int length = bArr.length;
        int i2 = yw7Var.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            yw7Var.L(copyOf.length, copyOf);
        } else {
            yw7Var.M(i2);
        }
        byte[] bArr2 = yw7Var.a;
        int i3 = yw7Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // yab
    public final boolean c(yw7 yw7Var, long j, xab xabVar) {
        e7a e7aVar;
        if (this.n != null) {
            ((go4) xabVar.b).getClass();
            return false;
        }
        ylc ylcVar = this.q;
        int i = 4;
        if (ylcVar == null) {
            c0f.c(1, yw7Var, false);
            yw7Var.s();
            int A = yw7Var.A();
            int s = yw7Var.s();
            int o = yw7Var.o();
            int i2 = o <= 0 ? -1 : o;
            int o2 = yw7Var.o();
            int i3 = o2 <= 0 ? -1 : o2;
            yw7Var.o();
            int A2 = yw7Var.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & nm7.O3) >> 4);
            yw7Var.A();
            this.q = new ylc(A, s, i2, i3, pow, pow2, Arrays.copyOf(yw7Var.a, yw7Var.c));
        } else {
            cf9 cf9Var = this.r;
            if (cf9Var == null) {
                this.r = c0f.b(yw7Var, true, true);
            } else {
                int i4 = yw7Var.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(yw7Var.a, 0, bArr, 0, i4);
                short s2 = ylcVar.a;
                int i5 = 5;
                c0f.c(5, yw7Var, false);
                int A3 = yw7Var.A() + 1;
                ye1 ye1Var = new ye1(yw7Var.a);
                int i6 = 3;
                ye1Var.n(yw7Var.b << 3);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    int i10 = i6;
                    if (i7 >= A3) {
                        int i11 = 6;
                        int f = ye1Var.f(6) + 1;
                        for (int i12 = 0; i12 < f; i12++) {
                            if (ye1Var.f(16) != 0) {
                                throw bx7.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i13 = 1;
                        int f2 = ye1Var.f(6) + 1;
                        int i14 = 0;
                        while (i14 < f2) {
                            int f3 = ye1Var.f(i9);
                            if (f3 == 0) {
                                int i15 = 8;
                                ye1Var.n(8);
                                ye1Var.n(16);
                                ye1Var.n(16);
                                ye1Var.n(6);
                                ye1Var.n(8);
                                int f4 = ye1Var.f(4) + 1;
                                int i16 = 0;
                                while (i16 < f4) {
                                    ye1Var.n(i15);
                                    i16++;
                                    i15 = 8;
                                }
                            } else {
                                if (f3 != i13) {
                                    throw bx7.a("floor type greater than 1 not decodable: " + f3, null);
                                }
                                int f5 = ye1Var.f(i5);
                                int[] iArr = new int[f5];
                                int i17 = -1;
                                for (int i18 = 0; i18 < f5; i18++) {
                                    int f6 = ye1Var.f(i);
                                    iArr[i18] = f6;
                                    if (f6 > i17) {
                                        i17 = f6;
                                    }
                                }
                                int i19 = i17 + 1;
                                int[] iArr2 = new int[i19];
                                int i20 = 0;
                                while (i20 < i19) {
                                    iArr2[i20] = ye1Var.f(i10) + 1;
                                    int f7 = ye1Var.f(i8);
                                    if (f7 > 0) {
                                        ye1Var.n(8);
                                    }
                                    int i21 = 0;
                                    for (int i22 = 1; i21 < (i22 << f7); i22 = 1) {
                                        ye1Var.n(8);
                                        i21++;
                                    }
                                    i20++;
                                    i10 = 3;
                                    i8 = 2;
                                }
                                ye1Var.n(i8);
                                int f8 = ye1Var.f(4);
                                int i23 = 0;
                                int i24 = 0;
                                for (int i25 = 0; i25 < f5; i25++) {
                                    i23 += iArr2[iArr[i25]];
                                    while (i24 < i23) {
                                        ye1Var.n(f8);
                                        i24++;
                                    }
                                }
                            }
                            i14++;
                            i10 = 3;
                            i11 = 6;
                            i8 = 2;
                            i = 4;
                            i9 = 16;
                            i5 = 5;
                            i13 = 1;
                        }
                        int f9 = ye1Var.f(i11) + 1;
                        int i26 = 0;
                        while (i26 < f9) {
                            if (ye1Var.f(16) > 2) {
                                throw bx7.a("residueType greater than 2 is not decodable", null);
                            }
                            ye1Var.n(24);
                            ye1Var.n(24);
                            ye1Var.n(24);
                            int f10 = ye1Var.f(i11) + 1;
                            ye1Var.n(8);
                            int[] iArr3 = new int[f10];
                            for (int i27 = 0; i27 < f10; i27++) {
                                iArr3[i27] = ((ye1Var.e() ? ye1Var.f(5) : 0) << 3) + ye1Var.f(3);
                            }
                            for (int i28 = 0; i28 < f10; i28++) {
                                for (int i29 = 0; i29 < 8; i29++) {
                                    if ((iArr3[i28] & (1 << i29)) != 0) {
                                        ye1Var.n(8);
                                    }
                                }
                            }
                            i26++;
                            i11 = 6;
                        }
                        int f11 = ye1Var.f(i11) + 1;
                        for (int i30 = 0; i30 < f11; i30++) {
                            int f12 = ye1Var.f(16);
                            if (f12 != 0) {
                                ncd.c("VorbisUtil", "mapping type other than 0 not supported: " + f12);
                            } else {
                                int f13 = ye1Var.e() ? ye1Var.f(4) + 1 : 1;
                                if (ye1Var.e()) {
                                    int f14 = ye1Var.f(8) + 1;
                                    for (int i31 = 0; i31 < f14; i31++) {
                                        int i32 = s2 - 1;
                                        ye1Var.n(c0f.a(i32));
                                        ye1Var.n(c0f.a(i32));
                                    }
                                }
                                if (ye1Var.f(2) != 0) {
                                    throw bx7.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (f13 > 1) {
                                    for (int i33 = 0; i33 < s2; i33++) {
                                        ye1Var.n(4);
                                    }
                                }
                                for (int i34 = 0; i34 < f13; i34++) {
                                    ye1Var.n(8);
                                    ye1Var.n(8);
                                    ye1Var.n(8);
                                }
                            }
                        }
                        int f15 = ye1Var.f(6) + 1;
                        gp5[] gp5VarArr = new gp5[f15];
                        for (int i35 = 0; i35 < f15; i35++) {
                            boolean e = ye1Var.e();
                            ye1Var.f(16);
                            ye1Var.f(16);
                            ye1Var.f(8);
                            gp5VarArr[i35] = new gp5((byte) 4, e);
                        }
                        if (!ye1Var.e()) {
                            throw bx7.a("framing bit after modes not set as expected", null);
                        }
                        e7aVar = new e7a(ylcVar, cf9Var, bArr, gp5VarArr);
                    } else {
                        if (ye1Var.f(24) != 5653314) {
                            throw bx7.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((ye1Var.d << 3) + ye1Var.e), null);
                        }
                        int f16 = ye1Var.f(16);
                        int f17 = ye1Var.f(24);
                        if (ye1Var.e()) {
                            ye1Var.n(5);
                            for (int i36 = 0; i36 < f17; i36 += ye1Var.f(c0f.a(f17 - i36))) {
                            }
                        } else {
                            boolean e2 = ye1Var.e();
                            for (int i37 = 0; i37 < f17; i37++) {
                                if (!e2) {
                                    ye1Var.n(5);
                                } else if (ye1Var.e()) {
                                    ye1Var.n(5);
                                }
                            }
                        }
                        int f18 = ye1Var.f(4);
                        if (f18 > 2) {
                            throw bx7.a("lookup type greater than 2 not decodable: " + f18, null);
                        }
                        if (f18 == 1 || f18 == 2) {
                            ye1Var.n(32);
                            ye1Var.n(32);
                            int f19 = ye1Var.f(4) + 1;
                            ye1Var.n(1);
                            ye1Var.n((int) ((f18 == 1 ? f16 != 0 ? (long) Math.floor(Math.pow(f17, 1.0d / f16)) : 0L : f16 * f17) * f19));
                        }
                        i7++;
                        i6 = i10;
                    }
                }
            }
        }
        e7aVar = null;
        this.n = e7aVar;
        if (e7aVar == null) {
            return true;
        }
        ylc ylcVar2 = (ylc) e7aVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ylcVar2.g);
        arrayList.add((byte[]) e7aVar.c);
        nf7 a = zlc.a(mo5.r((String[]) ((cf9) e7aVar.b).b));
        fo4 fo4Var = new fo4();
        fo4Var.r = wf7.n("audio/ogg");
        fo4Var.s = wf7.n("audio/vorbis");
        fo4Var.i = ylcVar2.d;
        fo4Var.j = ylcVar2.c;
        fo4Var.M = ylcVar2.a;
        fo4Var.O = ylcVar2.b;
        fo4Var.v = arrayList;
        fo4Var.l = a;
        xabVar.b = new go4(fo4Var);
        return true;
    }

    @Override // yab
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
