// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xjc extends w8b {
    public wtc n;
    public int o;
    public boolean p;
    public yjc q;
    public ln8 r;

    @Override // w8b
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        yjc yjcVar = this.q;
        this.o = yjcVar != null ? yjcVar.e : 0;
    }

    @Override // w8b
    public final long b(xu7 xu7Var) {
        if ((xu7Var.a[0] & 1) == 1) {
            return -1L;
        }
        wtc wtcVar = this.n;
        wtcVar.getClass();
        byte b = xu7Var.a[0];
        yjc yjcVar = (yjc) wtcVar.a;
        gn5[] gn5VarArr = (gn5[]) wtcVar.d;
        int i = gn5VarArr[(b >> 1) & (kk7.d4 >>> (8 - aye.a(gn5VarArr.length - 1)))].b ? yjcVar.f : yjcVar.e;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = xu7Var.a;
        int length = bArr.length;
        int i2 = xu7Var.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            xu7Var.L(copyOf.length, copyOf);
        } else {
            xu7Var.M(i2);
        }
        byte[] bArr2 = xu7Var.a;
        int i3 = xu7Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // w8b
    public final boolean c(xu7 xu7Var, long j, v8b v8bVar) {
        wtc wtcVar;
        if (this.n != null) {
            ((fm4) v8bVar.b).getClass();
            return false;
        }
        yjc yjcVar = this.q;
        int i = 4;
        if (yjcVar == null) {
            aye.c(1, xu7Var, false);
            xu7Var.s();
            int A = xu7Var.A();
            int s = xu7Var.s();
            int o = xu7Var.o();
            int i2 = o <= 0 ? -1 : o;
            int o2 = xu7Var.o();
            int i3 = o2 <= 0 ? -1 : o2;
            xu7Var.o();
            int A2 = xu7Var.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & kk7.O3) >> 4);
            xu7Var.A();
            this.q = new yjc(A, s, i2, i3, pow, pow2, Arrays.copyOf(xu7Var.a, xu7Var.c));
        } else {
            ln8 ln8Var = this.r;
            if (ln8Var == null) {
                this.r = aye.b(xu7Var, true, true);
            } else {
                int i4 = xu7Var.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(xu7Var.a, 0, bArr, 0, i4);
                short s2 = yjcVar.a;
                int i5 = 5;
                aye.c(5, xu7Var, false);
                int A3 = xu7Var.A() + 1;
                qd1 qd1Var = new qd1(xu7Var.a);
                int i6 = 3;
                qd1Var.n(xu7Var.b << 3);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    int i10 = i6;
                    if (i7 >= A3) {
                        int i11 = 6;
                        int f = qd1Var.f(6) + 1;
                        for (int i12 = 0; i12 < f; i12++) {
                            if (qd1Var.f(16) != 0) {
                                throw av7.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i13 = 1;
                        int f2 = qd1Var.f(6) + 1;
                        int i14 = 0;
                        while (i14 < f2) {
                            int f3 = qd1Var.f(i9);
                            if (f3 == 0) {
                                int i15 = 8;
                                qd1Var.n(8);
                                qd1Var.n(16);
                                qd1Var.n(16);
                                qd1Var.n(6);
                                qd1Var.n(8);
                                int f4 = qd1Var.f(4) + 1;
                                int i16 = 0;
                                while (i16 < f4) {
                                    qd1Var.n(i15);
                                    i16++;
                                    i15 = 8;
                                }
                            } else {
                                if (f3 != i13) {
                                    throw av7.a("floor type greater than 1 not decodable: " + f3, null);
                                }
                                int f5 = qd1Var.f(i5);
                                int[] iArr = new int[f5];
                                int i17 = -1;
                                for (int i18 = 0; i18 < f5; i18++) {
                                    int f6 = qd1Var.f(i);
                                    iArr[i18] = f6;
                                    if (f6 > i17) {
                                        i17 = f6;
                                    }
                                }
                                int i19 = i17 + 1;
                                int[] iArr2 = new int[i19];
                                int i20 = 0;
                                while (i20 < i19) {
                                    iArr2[i20] = qd1Var.f(i10) + 1;
                                    int f7 = qd1Var.f(i8);
                                    if (f7 > 0) {
                                        qd1Var.n(8);
                                    }
                                    int i21 = 0;
                                    for (int i22 = 1; i21 < (i22 << f7); i22 = 1) {
                                        qd1Var.n(8);
                                        i21++;
                                    }
                                    i20++;
                                    i10 = 3;
                                    i8 = 2;
                                }
                                qd1Var.n(i8);
                                int f8 = qd1Var.f(4);
                                int i23 = 0;
                                int i24 = 0;
                                for (int i25 = 0; i25 < f5; i25++) {
                                    i23 += iArr2[iArr[i25]];
                                    while (i24 < i23) {
                                        qd1Var.n(f8);
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
                        int f9 = qd1Var.f(i11) + 1;
                        int i26 = 0;
                        while (i26 < f9) {
                            if (qd1Var.f(16) > 2) {
                                throw av7.a("residueType greater than 2 is not decodable", null);
                            }
                            qd1Var.n(24);
                            qd1Var.n(24);
                            qd1Var.n(24);
                            int f10 = qd1Var.f(i11) + 1;
                            qd1Var.n(8);
                            int[] iArr3 = new int[f10];
                            for (int i27 = 0; i27 < f10; i27++) {
                                iArr3[i27] = ((qd1Var.e() ? qd1Var.f(5) : 0) << 3) + qd1Var.f(3);
                            }
                            for (int i28 = 0; i28 < f10; i28++) {
                                for (int i29 = 0; i29 < 8; i29++) {
                                    if ((iArr3[i28] & (1 << i29)) != 0) {
                                        qd1Var.n(8);
                                    }
                                }
                            }
                            i26++;
                            i11 = 6;
                        }
                        int f11 = qd1Var.f(i11) + 1;
                        for (int i30 = 0; i30 < f11; i30++) {
                            int f12 = qd1Var.f(16);
                            if (f12 != 0) {
                                lad.c("VorbisUtil", "mapping type other than 0 not supported: " + f12);
                            } else {
                                int f13 = qd1Var.e() ? qd1Var.f(4) + 1 : 1;
                                if (qd1Var.e()) {
                                    int f14 = qd1Var.f(8) + 1;
                                    for (int i31 = 0; i31 < f14; i31++) {
                                        int i32 = s2 - 1;
                                        qd1Var.n(aye.a(i32));
                                        qd1Var.n(aye.a(i32));
                                    }
                                }
                                if (qd1Var.f(2) != 0) {
                                    throw av7.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (f13 > 1) {
                                    for (int i33 = 0; i33 < s2; i33++) {
                                        qd1Var.n(4);
                                    }
                                }
                                for (int i34 = 0; i34 < f13; i34++) {
                                    qd1Var.n(8);
                                    qd1Var.n(8);
                                    qd1Var.n(8);
                                }
                            }
                        }
                        int f15 = qd1Var.f(6) + 1;
                        gn5[] gn5VarArr = new gn5[f15];
                        for (int i35 = 0; i35 < f15; i35++) {
                            boolean e = qd1Var.e();
                            qd1Var.f(16);
                            qd1Var.f(16);
                            qd1Var.f(8);
                            gn5VarArr[i35] = new gn5((byte) 4, e);
                        }
                        if (!qd1Var.e()) {
                            throw av7.a("framing bit after modes not set as expected", null);
                        }
                        wtcVar = new wtc(yjcVar, ln8Var, bArr, gn5VarArr);
                    } else {
                        if (qd1Var.f(24) != 5653314) {
                            throw av7.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((qd1Var.d << 3) + qd1Var.e), null);
                        }
                        int f16 = qd1Var.f(16);
                        int f17 = qd1Var.f(24);
                        if (qd1Var.e()) {
                            qd1Var.n(5);
                            for (int i36 = 0; i36 < f17; i36 += qd1Var.f(aye.a(f17 - i36))) {
                            }
                        } else {
                            boolean e2 = qd1Var.e();
                            for (int i37 = 0; i37 < f17; i37++) {
                                if (!e2) {
                                    qd1Var.n(5);
                                } else if (qd1Var.e()) {
                                    qd1Var.n(5);
                                }
                            }
                        }
                        int f18 = qd1Var.f(4);
                        if (f18 > 2) {
                            throw av7.a("lookup type greater than 2 not decodable: " + f18, null);
                        }
                        if (f18 == 1 || f18 == 2) {
                            qd1Var.n(32);
                            qd1Var.n(32);
                            int f19 = qd1Var.f(4) + 1;
                            qd1Var.n(1);
                            qd1Var.n((int) ((f18 == 1 ? f16 != 0 ? (long) Math.floor(Math.pow(f17, 1.0d / f16)) : 0L : f16 * f17) * f19));
                        }
                        i7++;
                        i6 = i10;
                    }
                }
            }
        }
        wtcVar = null;
        this.n = wtcVar;
        if (wtcVar == null) {
            return true;
        }
        yjc yjcVar2 = (yjc) wtcVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yjcVar2.g);
        arrayList.add((byte[]) wtcVar.c);
        ld7 a = zjc.a(mm5.r((String[]) ((ln8) wtcVar.b).b));
        em4 em4Var = new em4();
        em4Var.r = ud7.n("audio/ogg");
        em4Var.s = ud7.n("audio/vorbis");
        em4Var.i = yjcVar2.d;
        em4Var.j = yjcVar2.c;
        em4Var.M = yjcVar2.a;
        em4Var.O = yjcVar2.b;
        em4Var.v = arrayList;
        em4Var.l = a;
        v8bVar.b = new fm4(em4Var);
        return true;
    }

    @Override // w8b
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
