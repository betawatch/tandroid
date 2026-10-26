package x3;

import b2.u0;
import b2.w;
import b2.w0;
import b2.x0;
import c3.l0;
import c3.m0;
import c3.z;
import e0.e0;
import e2.x;
import f9.i0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j extends i {
    public e0 n;
    public int o;
    public boolean p;
    public z q;
    public l0 r;

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
        e0 e0Var = this.n;
        e0Var.getClass();
        int i10 = e0Var.b;
        z zVar = (z) e0Var.c;
        int i11 = !((m0[]) e0Var.f)[(b10 >> 1) & (255 >>> (8 - i10))].a ? zVar.e : zVar.f;
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
    public final boolean c(x xVar, long j10, m4.c cVar) {
        e0 e0Var;
        if (this.n != null) {
            ((b2.x) cVar.b).getClass();
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
            l0 l0Var = this.r;
            if (l0Var == null) {
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
                        int g7 = gVar.g(16);
                        int g10 = gVar.g(24);
                        if (gVar.f()) {
                            gVar.o(i14);
                            int i19 = 0;
                            while (i19 < g10) {
                                int i20 = 0;
                                for (int i21 = g10 - i19; i21 > 0; i21 >>>= 1) {
                                    i20++;
                                }
                                i19 += gVar.g(i20);
                            }
                        } else {
                            boolean f7 = gVar.f();
                            for (int i22 = 0; i22 < g10; i22++) {
                                if (!f7) {
                                    gVar.o(i14);
                                } else if (gVar.f()) {
                                    gVar.o(i14);
                                }
                            }
                        }
                        int g11 = gVar.g(4);
                        if (g11 > 2) {
                            throw x0.a(null, "lookup type greater than 2 not decodable: " + g11);
                        }
                        if (g11 == 1 || g11 == 2) {
                            gVar.o(32);
                            gVar.o(32);
                            int g12 = gVar.g(4) + 1;
                            gVar.o(1);
                            gVar.o((int) ((g11 == 1 ? g7 != 0 ? (long) Math.floor(Math.pow(g10, 1.0d / g7)) : 0L : g10 * g7) * g12));
                        }
                        i16++;
                        i15 = i18;
                        i14 = 5;
                    } else {
                        int i23 = i15;
                        int i24 = 6;
                        int g13 = gVar.g(6) + 1;
                        for (int i25 = 0; i25 < g13; i25++) {
                            if (gVar.g(16) != 0) {
                                throw x0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i26 = 1;
                        int g14 = gVar.g(6) + 1;
                        int i27 = 0;
                        while (true) {
                            int i28 = 3;
                            if (i27 < g14) {
                                int g15 = gVar.g(i17);
                                if (g15 == 0) {
                                    int i29 = i23;
                                    gVar.o(i29);
                                    gVar.o(16);
                                    gVar.o(16);
                                    gVar.o(6);
                                    gVar.o(i29);
                                    int g16 = gVar.g(4) + 1;
                                    int i30 = 0;
                                    while (i30 < g16) {
                                        gVar.o(i29);
                                        i30++;
                                        i29 = 8;
                                    }
                                } else {
                                    if (g15 != i26) {
                                        throw x0.a(null, "floor type greater than 1 not decodable: " + g15);
                                    }
                                    int g17 = gVar.g(5);
                                    int[] iArr = new int[g17];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < g17; i32++) {
                                        int g18 = gVar.g(i10);
                                        iArr[i32] = g18;
                                        if (g18 > i31) {
                                            i31 = g18;
                                        }
                                    }
                                    int i33 = i31 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = gVar.g(i28) + 1;
                                        int g19 = gVar.g(2);
                                        int i35 = i23;
                                        if (g19 > 0) {
                                            gVar.o(i35);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i36 = 0;
                                        for (int i37 = 1; i36 < (i37 << g19); i37 = 1) {
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
                                    int g20 = gVar.g(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < g17; i40++) {
                                        i38 += iArr4[iArr[i40]];
                                        while (i39 < i38) {
                                            gVar.o(g20);
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
                                int g21 = gVar.g(i24) + 1;
                                int i41 = 0;
                                while (i41 < g21) {
                                    if (gVar.g(16) > 2) {
                                        throw x0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    gVar.o(24);
                                    gVar.o(24);
                                    gVar.o(24);
                                    int g22 = gVar.g(i24) + 1;
                                    int i42 = 8;
                                    gVar.o(8);
                                    int[] iArr5 = new int[g22];
                                    for (int i43 = 0; i43 < g22; i43++) {
                                        iArr5[i43] = ((gVar.f() ? gVar.g(5) : 0) * 8) + gVar.g(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < g22) {
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
                                int g23 = gVar.g(i24) + 1;
                                for (int i46 = 0; i46 < g23; i46++) {
                                    int g24 = gVar.g(16);
                                    if (g24 != 0) {
                                        e2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + g24);
                                    } else {
                                        int g25 = gVar.f() ? gVar.g(4) + 1 : 1;
                                        if (gVar.f()) {
                                            int g26 = gVar.g(8) + 1;
                                            for (int i47 = 0; i47 < g26; i47++) {
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
                                        if (g25 > 1) {
                                            for (int i52 = 0; i52 < i13; i52++) {
                                                gVar.o(4);
                                            }
                                        }
                                        for (int i53 = 0; i53 < g25; i53++) {
                                            gVar.o(8);
                                            gVar.o(8);
                                            gVar.o(8);
                                        }
                                    }
                                }
                                int g27 = gVar.g(6);
                                int i54 = g27 + 1;
                                m0[] m0VarArr = new m0[i54];
                                for (int i55 = 0; i55 < i54; i55++) {
                                    boolean f10 = gVar.f();
                                    gVar.g(16);
                                    gVar.g(16);
                                    gVar.g(8);
                                    m0 m0Var = new m0();
                                    m0Var.a = f10;
                                    m0VarArr[i55] = m0Var;
                                }
                                if (!gVar.f()) {
                                    throw x0.a(null, "framing bit after modes not set as expected");
                                }
                                int i56 = 0;
                                while (g27 > 0) {
                                    i56++;
                                    g27 >>>= 1;
                                }
                                e0Var = new e0(zVar, l0Var, bArr, m0VarArr, i56);
                            }
                        }
                    }
                }
            }
        }
        e0Var = null;
        this.n = e0Var;
        if (e0Var == null) {
            return true;
        }
        z zVar3 = (z) e0Var.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar3.g);
        arrayList.add((byte[]) e0Var.e);
        u0 r6 = c3.b.r(i0.v(((l0) e0Var.d).a));
        w wVar = new w();
        wVar.q = w0.n("audio/ogg");
        wVar.r = w0.n("audio/vorbis");
        wVar.h = zVar3.d;
        wVar.i = zVar3.c;
        wVar.J = zVar3.a;
        wVar.K = zVar3.b;
        wVar.u = arrayList;
        wVar.k = r6;
        cVar.b = new b2.x(wVar);
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
