package x3;

import b2.u0;
import b2.w;
import b2.w0;
import b2.x0;
import c3.k0;
import c3.z;
import e0.g0;
import e2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class j extends i {
    public g0 n;
    public int o;
    public boolean p;
    public z q;
    public k0 r;

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
        g0 g0Var = this.n;
        g0Var.getClass();
        int i10 = g0Var.a;
        z zVar = (z) g0Var.b;
        int i11 = !((ai.a[]) g0Var.e)[(b10 >> 1) & (255 >>> (8 - i10))].a ? zVar.e : zVar.f;
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
    public final boolean c(x xVar, long j10, n3.b bVar) {
        g0 g0Var;
        if (this.n != null) {
            ((b2.x) bVar.b).getClass();
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
            int pow2 = (int) Math.pow(2.0d, (A2 & 240) >> 4);
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
            k0 k0Var = this.r;
            if (k0Var == null) {
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
                gVar.o(xVar.b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < A3) {
                        int i18 = i15;
                        if (gVar.g(24) != 5653314) {
                            throw x0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
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
                            throw x0.a(null, "lookup type greater than 2 not decodable: " + g12);
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
                                throw x0.a(null, "placeholder of time domain transforms not zeroed out");
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
                                        throw x0.a(null, "floor type greater than 1 not decodable: " + g16);
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
                                        throw x0.a(null, "residueType greater than 2 is not decodable");
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
                                            throw x0.a(null, "to reserved bits must be zero after mapping coupling steps");
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
                                ai.a[] aVarArr = new ai.a[i54];
                                for (int i55 = 0; i55 < i54; i55++) {
                                    boolean f10 = gVar.f();
                                    gVar.g(16);
                                    gVar.g(16);
                                    gVar.g(8);
                                    ai.a aVar = new ai.a();
                                    aVar.a = f10;
                                    aVarArr[i55] = aVar;
                                }
                                if (!gVar.f()) {
                                    throw x0.a(null, "framing bit after modes not set as expected");
                                }
                                int i56 = 0;
                                while (g28 > 0) {
                                    i56++;
                                    g28 >>>= 1;
                                }
                                g0Var = new g0(zVar, k0Var, bArr, aVarArr, i56);
                            }
                        }
                    }
                }
            }
        }
        g0Var = null;
        this.n = g0Var;
        if (g0Var == null) {
            return true;
        }
        z zVar3 = (z) g0Var.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar3.g);
        arrayList.add((byte[]) g0Var.d);
        u0 r10 = c3.b.r(n0.v(((k0) g0Var.c).a));
        w wVar = new w();
        wVar.q = w0.n("audio/ogg");
        wVar.r = w0.n("audio/vorbis");
        wVar.h = zVar3.d;
        wVar.i = zVar3.c;
        wVar.J = zVar3.a;
        wVar.K = zVar3.b;
        wVar.u = arrayList;
        wVar.k = r10;
        bVar.b = new b2.x(wVar);
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
