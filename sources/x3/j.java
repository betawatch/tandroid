package x3;

import a4.l;
import b2.u0;
import b2.v0;
import b2.w;
import b2.w0;
import c3.m0;
import c3.z;
import e2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends i {
    public cc.f n;
    public int o;
    public boolean p;
    public z q;
    public l r;

    @Override // x3.i
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        z zVar = this.q;
        this.o = zVar != null ? zVar.e : 0;
    }

    @Override // x3.i
    public final long b(x xVar) {
        byte b10 = xVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        cc.f fVar = this.n;
        fVar.getClass();
        int i10 = fVar.b;
        z zVar = (z) fVar.c;
        int i11 = !((m0[]) fVar.f)[(b10 >> 1) & (zs.e4 >>> (8 - i10))].a ? zVar.e : zVar.f;
        long j10 = this.p ? (this.o + i11) / 4 : 0;
        byte[] bArr = xVar.a;
        int length = bArr.length;
        int i12 = xVar.c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            xVar.L(copyOf.length, copyOf);
        } else {
            xVar.M(i12);
        }
        byte[] bArr2 = xVar.a;
        int i13 = xVar.c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.p = true;
        this.o = i11;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // x3.i
    public final boolean c(x xVar, long j10, m5.e eVar) {
        cc.f fVar;
        if (this.n != null) {
            ((b2.x) eVar.b).getClass();
            return false;
        }
        z zVar = this.q;
        int i10 = 4;
        if (zVar == null) {
            c3.b.w(1, xVar, false);
            xVar.s();
            int A = xVar.A();
            int s10 = xVar.s();
            int o10 = xVar.o();
            if (o10 <= 0) {
                o10 = -1;
            }
            int o11 = xVar.o();
            int i11 = o11 > 0 ? o11 : -1;
            xVar.o();
            int A2 = xVar.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & zs.P3) >> 4);
            xVar.A();
            ?? copyOf = Arrays.copyOf(xVar.a, xVar.c);
            z zVar2 = new z();
            zVar2.a = A;
            zVar2.b = s10;
            zVar2.c = o10;
            zVar2.d = i11;
            zVar2.e = pow;
            zVar2.f = pow2;
            zVar2.g = copyOf;
            this.q = zVar2;
        } else {
            l lVar = this.r;
            if (lVar == null) {
                this.r = c3.b.u(xVar, true, true);
            } else {
                int i12 = xVar.c;
                byte[] bArr = new byte[i12];
                System.arraycopy(xVar.a, 0, bArr, 0, i12);
                int i13 = zVar.a;
                int i14 = 5;
                c3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                a4.g gVar = new a4.g(xVar.a);
                int i15 = 8;
                gVar.f0(xVar.b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < A3) {
                        int i18 = i15;
                        if (gVar.i(24) != 5653314) {
                            throw w0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
                        }
                        int i19 = gVar.i(16);
                        int i20 = gVar.i(24);
                        if (gVar.h()) {
                            gVar.f0(i14);
                            int i21 = 0;
                            while (i21 < i20) {
                                int i22 = 0;
                                for (int i23 = i20 - i21; i23 > 0; i23 >>>= 1) {
                                    i22++;
                                }
                                i21 += gVar.i(i22);
                            }
                        } else {
                            boolean h = gVar.h();
                            for (int i24 = 0; i24 < i20; i24++) {
                                if (!h) {
                                    gVar.f0(i14);
                                } else if (gVar.h()) {
                                    gVar.f0(i14);
                                }
                            }
                        }
                        int i25 = gVar.i(4);
                        if (i25 > 2) {
                            throw w0.a(null, "lookup type greater than 2 not decodable: " + i25);
                        }
                        if (i25 == 1 || i25 == 2) {
                            gVar.f0(32);
                            gVar.f0(32);
                            int i26 = gVar.i(4) + 1;
                            gVar.f0(1);
                            gVar.f0((int) ((i25 == 1 ? i19 != 0 ? (long) Math.floor(Math.pow(i20, 1.0d / i19)) : 0L : i20 * i19) * i26));
                        }
                        i16++;
                        i15 = i18;
                        i14 = 5;
                    } else {
                        int i27 = i15;
                        int i28 = 6;
                        int i29 = gVar.i(6) + 1;
                        for (int i30 = 0; i30 < i29; i30++) {
                            if (gVar.i(16) != 0) {
                                throw w0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i31 = 1;
                        int i32 = gVar.i(6) + 1;
                        int i33 = 0;
                        while (true) {
                            int i34 = 3;
                            if (i33 < i32) {
                                int i35 = gVar.i(i17);
                                if (i35 == 0) {
                                    int i36 = i27;
                                    gVar.f0(i36);
                                    gVar.f0(16);
                                    gVar.f0(16);
                                    gVar.f0(6);
                                    gVar.f0(i36);
                                    int i37 = gVar.i(4) + 1;
                                    int i38 = 0;
                                    while (i38 < i37) {
                                        gVar.f0(i36);
                                        i38++;
                                        i36 = 8;
                                    }
                                } else {
                                    if (i35 != i31) {
                                        throw w0.a(null, "floor type greater than 1 not decodable: " + i35);
                                    }
                                    int i39 = gVar.i(5);
                                    int[] iArr = new int[i39];
                                    int i40 = -1;
                                    for (int i41 = 0; i41 < i39; i41++) {
                                        int i42 = gVar.i(i10);
                                        iArr[i41] = i42;
                                        if (i42 > i40) {
                                            i40 = i42;
                                        }
                                    }
                                    int i43 = i40 + 1;
                                    int[] iArr2 = new int[i43];
                                    int i44 = 0;
                                    while (i44 < i43) {
                                        iArr2[i44] = gVar.i(i34) + 1;
                                        int i45 = gVar.i(2);
                                        int i46 = i27;
                                        if (i45 > 0) {
                                            gVar.f0(i46);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i47 = 0;
                                        for (int i48 = 1; i47 < (i48 << i45); i48 = 1) {
                                            gVar.f0(i46);
                                            i47++;
                                            i46 = 8;
                                        }
                                        i44++;
                                        iArr2 = iArr3;
                                        i27 = 8;
                                        i34 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    gVar.f0(2);
                                    int i49 = gVar.i(4);
                                    int i50 = 0;
                                    int i51 = 0;
                                    for (int i52 = 0; i52 < i39; i52++) {
                                        i50 += iArr4[iArr[i52]];
                                        while (i51 < i50) {
                                            gVar.f0(i49);
                                            i51++;
                                        }
                                    }
                                }
                                i33++;
                                i27 = 8;
                                i28 = 6;
                                i10 = 4;
                                i17 = 16;
                                i31 = 1;
                            } else {
                                int i53 = gVar.i(i28) + 1;
                                int i54 = 0;
                                while (i54 < i53) {
                                    if (gVar.i(16) > 2) {
                                        throw w0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    gVar.f0(24);
                                    gVar.f0(24);
                                    gVar.f0(24);
                                    int i55 = gVar.i(i28) + 1;
                                    int i56 = 8;
                                    gVar.f0(8);
                                    int[] iArr5 = new int[i55];
                                    for (int i57 = 0; i57 < i55; i57++) {
                                        iArr5[i57] = ((gVar.h() ? gVar.i(5) : 0) * 8) + gVar.i(3);
                                    }
                                    int i58 = 0;
                                    while (i58 < i55) {
                                        int i59 = 0;
                                        while (i59 < i56) {
                                            if ((iArr5[i58] & (1 << i59)) != 0) {
                                                gVar.f0(i56);
                                            }
                                            i59++;
                                            i56 = 8;
                                        }
                                        i58++;
                                        i56 = 8;
                                    }
                                    i54++;
                                    i28 = 6;
                                }
                                int i60 = gVar.i(i28) + 1;
                                for (int i61 = 0; i61 < i60; i61++) {
                                    int i62 = gVar.i(16);
                                    if (i62 != 0) {
                                        e2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + i62);
                                    } else {
                                        int i63 = gVar.h() ? gVar.i(4) + 1 : 1;
                                        if (gVar.h()) {
                                            int i64 = gVar.i(8) + 1;
                                            for (int i65 = 0; i65 < i64; i65++) {
                                                int i66 = i13 - 1;
                                                int i67 = 0;
                                                for (int i68 = i66; i68 > 0; i68 >>>= 1) {
                                                    i67++;
                                                }
                                                gVar.f0(i67);
                                                int i69 = 0;
                                                while (i66 > 0) {
                                                    i69++;
                                                    i66 >>>= 1;
                                                }
                                                gVar.f0(i69);
                                            }
                                        }
                                        if (gVar.i(2) != 0) {
                                            throw w0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i63 > 1) {
                                            for (int i70 = 0; i70 < i13; i70++) {
                                                gVar.f0(4);
                                            }
                                        }
                                        for (int i71 = 0; i71 < i63; i71++) {
                                            gVar.f0(8);
                                            gVar.f0(8);
                                            gVar.f0(8);
                                        }
                                    }
                                }
                                int i72 = gVar.i(6);
                                int i73 = i72 + 1;
                                m0[] m0VarArr = new m0[i73];
                                for (int i74 = 0; i74 < i73; i74++) {
                                    boolean h10 = gVar.h();
                                    gVar.i(16);
                                    gVar.i(16);
                                    gVar.i(8);
                                    m0 m0Var = new m0();
                                    m0Var.a = h10;
                                    m0VarArr[i74] = m0Var;
                                }
                                if (!gVar.h()) {
                                    throw w0.a(null, "framing bit after modes not set as expected");
                                }
                                int i75 = 0;
                                while (i72 > 0) {
                                    i75++;
                                    i72 >>>= 1;
                                }
                                fVar = new cc.f(zVar, lVar, bArr, m0VarArr, i75);
                            }
                        }
                    }
                }
            }
        }
        fVar = null;
        this.n = fVar;
        if (fVar == null) {
            return true;
        }
        z zVar3 = (z) fVar.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar3.g);
        arrayList.add((byte[]) fVar.e);
        u0 r10 = c3.b.r(n0.v((String[]) ((l) fVar.d).b));
        w wVar = new w();
        wVar.q = v0.n("audio/ogg");
        wVar.r = v0.n("audio/vorbis");
        wVar.h = zVar3.d;
        wVar.i = zVar3.c;
        wVar.J = zVar3.a;
        wVar.K = zVar3.b;
        wVar.u = arrayList;
        wVar.k = r10;
        eVar.b = new b2.x(wVar);
        return true;
    }

    @Override // x3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
