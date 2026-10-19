package x3;

import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.a0;
import c3.l0;
import e0.f0;
import e2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class j extends i {
    public f0 n;
    public int o;
    public boolean p;
    public a0 q;
    public l0 r;

    @Override // x3.i
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        a0 a0Var = this.q;
        this.o = a0Var != null ? a0Var.e : 0;
    }

    @Override // x3.i
    public final long b(x xVar) {
        byte b10 = xVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        f0 f0Var = this.n;
        f0Var.getClass();
        int i10 = f0Var.b;
        a0 a0Var = (a0) f0Var.c;
        int i11 = !((bi.a[]) f0Var.f)[(b10 >> 1) & (255 >>> (8 - i10))].a ? a0Var.e : a0Var.f;
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
    public final boolean c(x xVar, long j10, n2.e eVar) {
        f0 f0Var;
        if (this.n != null) {
            ((w) eVar.b).getClass();
            return false;
        }
        a0 a0Var = this.q;
        int i10 = 4;
        if (a0Var == null) {
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
            int pow2 = (int) Math.pow(2.0d, (A2 & 240) >> 4);
            xVar.A();
            ?? copyOf = Arrays.copyOf(xVar.a, xVar.c);
            a0 a0Var2 = new a0();
            a0Var2.a = A;
            a0Var2.b = s10;
            a0Var2.c = o10;
            a0Var2.d = i11;
            a0Var2.e = pow;
            a0Var2.f = pow2;
            a0Var2.g = copyOf;
            this.q = a0Var2;
        } else {
            l0 l0Var = this.r;
            if (l0Var == null) {
                this.r = c3.b.u(xVar, true, true);
            } else {
                int i12 = xVar.c;
                byte[] bArr = new byte[i12];
                System.arraycopy(xVar.a, 0, bArr, 0, i12);
                int i13 = a0Var.a;
                int i14 = 5;
                c3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                a4.g gVar = new a4.g(xVar.a);
                int i15 = 8;
                gVar.o(xVar.b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < A3) {
                        int i18 = i15;
                        if (gVar.g(24) != 5653314) {
                            throw w0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
                        }
                        int g10 = gVar.g(16);
                        int g11 = gVar.g(24);
                        if (gVar.f()) {
                            gVar.o(i14);
                            int i19 = 0;
                            while (i19 < g11) {
                                int i20 = 0;
                                for (int i21 = g11 - i19; i21 > 0; i21 >>>= 1) {
                                    i20++;
                                }
                                i19 += gVar.g(i20);
                            }
                        } else {
                            boolean f7 = gVar.f();
                            for (int i22 = 0; i22 < g11; i22++) {
                                if (!f7) {
                                    gVar.o(i14);
                                } else if (gVar.f()) {
                                    gVar.o(i14);
                                }
                            }
                        }
                        int g12 = gVar.g(4);
                        if (g12 > 2) {
                            throw w0.a(null, "lookup type greater than 2 not decodable: " + g12);
                        }
                        if (g12 == 1 || g12 == 2) {
                            gVar.o(32);
                            gVar.o(32);
                            int g13 = gVar.g(4) + 1;
                            gVar.o(1);
                            gVar.o((int) ((g12 == 1 ? g10 != 0 ? (long) Math.floor(Math.pow(g11, 1.0d / g10)) : 0L : g11 * g10) * g13));
                        }
                        i16++;
                        i15 = i18;
                        i14 = 5;
                    } else {
                        int i23 = i15;
                        int i24 = 6;
                        int g14 = gVar.g(6) + 1;
                        for (int i25 = 0; i25 < g14; i25++) {
                            if (gVar.g(16) != 0) {
                                throw w0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i26 = 1;
                        int g15 = gVar.g(6) + 1;
                        int i27 = 0;
                        while (true) {
                            int i28 = 3;
                            if (i27 < g15) {
                                int g16 = gVar.g(i17);
                                if (g16 == 0) {
                                    int i29 = i23;
                                    gVar.o(i29);
                                    gVar.o(16);
                                    gVar.o(16);
                                    gVar.o(6);
                                    gVar.o(i29);
                                    int g17 = gVar.g(4) + 1;
                                    int i30 = 0;
                                    while (i30 < g17) {
                                        gVar.o(i29);
                                        i30++;
                                        i29 = 8;
                                    }
                                } else {
                                    if (g16 != i26) {
                                        throw w0.a(null, "floor type greater than 1 not decodable: " + g16);
                                    }
                                    int g18 = gVar.g(5);
                                    int[] iArr = new int[g18];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < g18; i32++) {
                                        int g19 = gVar.g(i10);
                                        iArr[i32] = g19;
                                        if (g19 > i31) {
                                            i31 = g19;
                                        }
                                    }
                                    int i33 = i31 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = gVar.g(i28) + 1;
                                        int g20 = gVar.g(2);
                                        int i35 = i23;
                                        if (g20 > 0) {
                                            gVar.o(i35);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i36 = 0;
                                        for (int i37 = 1; i36 < (i37 << g20); i37 = 1) {
                                            gVar.o(i35);
                                            i36++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        iArr2 = iArr3;
                                        i23 = 8;
                                        i28 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    gVar.o(2);
                                    int g21 = gVar.g(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < g18; i40++) {
                                        i38 += iArr4[iArr[i40]];
                                        while (i39 < i38) {
                                            gVar.o(g21);
                                            i39++;
                                        }
                                    }
                                }
                                i27++;
                                i23 = 8;
                                i24 = 6;
                                i10 = 4;
                                i17 = 16;
                                i26 = 1;
                            } else {
                                int g22 = gVar.g(i24) + 1;
                                int i41 = 0;
                                while (i41 < g22) {
                                    if (gVar.g(16) > 2) {
                                        throw w0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    gVar.o(24);
                                    gVar.o(24);
                                    gVar.o(24);
                                    int g23 = gVar.g(i24) + 1;
                                    int i42 = 8;
                                    gVar.o(8);
                                    int[] iArr5 = new int[g23];
                                    for (int i43 = 0; i43 < g23; i43++) {
                                        iArr5[i43] = ((gVar.f() ? gVar.g(5) : 0) * 8) + gVar.g(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < g23) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr5[i44] & (1 << i45)) != 0) {
                                                gVar.o(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i41++;
                                    i24 = 6;
                                }
                                int g24 = gVar.g(i24) + 1;
                                for (int i46 = 0; i46 < g24; i46++) {
                                    int g25 = gVar.g(16);
                                    if (g25 != 0) {
                                        e2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + g25);
                                    } else {
                                        int g26 = gVar.f() ? gVar.g(4) + 1 : 1;
                                        if (gVar.f()) {
                                            int g27 = gVar.g(8) + 1;
                                            for (int i47 = 0; i47 < g27; i47++) {
                                                int i48 = i13 - 1;
                                                int i49 = 0;
                                                for (int i50 = i48; i50 > 0; i50 >>>= 1) {
                                                    i49++;
                                                }
                                                gVar.o(i49);
                                                int i51 = 0;
                                                while (i48 > 0) {
                                                    i51++;
                                                    i48 >>>= 1;
                                                }
                                                gVar.o(i51);
                                            }
                                        }
                                        if (gVar.g(2) != 0) {
                                            throw w0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (g26 > 1) {
                                            for (int i52 = 0; i52 < i13; i52++) {
                                                gVar.o(4);
                                            }
                                        }
                                        for (int i53 = 0; i53 < g26; i53++) {
                                            gVar.o(8);
                                            gVar.o(8);
                                            gVar.o(8);
                                        }
                                    }
                                }
                                int g28 = gVar.g(6);
                                int i54 = g28 + 1;
                                bi.a[] aVarArr = new bi.a[i54];
                                for (int i55 = 0; i55 < i54; i55++) {
                                    boolean f10 = gVar.f();
                                    gVar.g(16);
                                    gVar.g(16);
                                    gVar.g(8);
                                    bi.a aVar = new bi.a();
                                    aVar.a = f10;
                                    aVarArr[i55] = aVar;
                                }
                                if (!gVar.f()) {
                                    throw w0.a(null, "framing bit after modes not set as expected");
                                }
                                int i56 = 0;
                                while (g28 > 0) {
                                    i56++;
                                    g28 >>>= 1;
                                }
                                f0Var = new f0(a0Var, l0Var, bArr, aVarArr, i56);
                            }
                        }
                    }
                }
            }
        }
        f0Var = null;
        this.n = f0Var;
        if (f0Var == null) {
            return true;
        }
        a0 a0Var3 = (a0) f0Var.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) a0Var3.g);
        arrayList.add((byte[]) f0Var.e);
        t0 r10 = c3.b.r(n0.v(((l0) f0Var.d).a));
        v vVar = new v();
        vVar.q = v0.n("audio/ogg");
        vVar.r = v0.n("audio/vorbis");
        vVar.h = a0Var3.d;
        vVar.i = a0Var3.c;
        vVar.J = a0Var3.a;
        vVar.K = a0Var3.b;
        vVar.u = arrayList;
        vVar.k = r10;
        eVar.b = new w(vVar);
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
