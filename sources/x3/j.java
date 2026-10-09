package x3;

import a4.l;
import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import b2.s0;
import c3.j0;
import c3.z;
import e0.g0;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import n6.t;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j extends i {
    public g0 n;
    public int o;
    public boolean p;
    public z q;
    public l r;

    @Override // x3.i
    public final void a(long j3) {
        this.g = j3;
        this.p = j3 != 0;
        z zVar = this.q;
        this.o = zVar != null ? zVar.e : 0;
    }

    @Override // x3.i
    public final long b(v vVar) {
        byte b10 = vVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        g0 g0Var = this.n;
        e2.d.h(g0Var);
        int i10 = g0Var.a;
        z zVar = (z) g0Var.b;
        int i11 = !((j0[]) g0Var.e)[(b10 >> 1) & (255 >>> (8 - i10))].b ? zVar.e : zVar.f;
        long j3 = this.p ? (this.o + i11) / 4 : 0;
        byte[] bArr = vVar.a;
        int length = bArr.length;
        int i12 = vVar.c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            vVar.H(copyOf.length, copyOf);
        } else {
            vVar.I(i12);
        }
        byte[] bArr2 = vVar.a;
        int i13 = vVar.c;
        bArr2[i13 - 4] = (byte) (j3 & 255);
        bArr2[i13 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j3 >>> 24) & 255);
        this.p = true;
        this.o = i11;
        return j3;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // x3.i
    public final boolean c(v vVar, long j3, t tVar) {
        g0 g0Var;
        if (this.n != null) {
            ((s) tVar.b).getClass();
            return false;
        }
        z zVar = this.q;
        int i10 = 4;
        if (zVar == null) {
            c3.b.x(1, vVar, false);
            vVar.p();
            int x10 = vVar.x();
            int p5 = vVar.p();
            int l4 = vVar.l();
            if (l4 <= 0) {
                l4 = -1;
            }
            int l10 = vVar.l();
            int i11 = l10 > 0 ? l10 : -1;
            vVar.l();
            int x11 = vVar.x();
            int pow = (int) Math.pow(2.0d, x11 & 15);
            int pow2 = (int) Math.pow(2.0d, (x11 & 240) >> 4);
            vVar.x();
            ?? copyOf = Arrays.copyOf(vVar.a, vVar.c);
            z zVar2 = new z();
            zVar2.a = x10;
            zVar2.b = p5;
            zVar2.c = l4;
            zVar2.d = i11;
            zVar2.e = pow;
            zVar2.f = pow2;
            zVar2.g = copyOf;
            this.q = zVar2;
        } else {
            l lVar = this.r;
            if (lVar == null) {
                this.r = c3.b.v(vVar, true, true);
            } else {
                int i12 = vVar.c;
                byte[] bArr = new byte[i12];
                System.arraycopy(vVar.a, 0, bArr, 0, i12);
                int i13 = zVar.a;
                int i14 = 5;
                c3.b.x(5, vVar, false);
                int x12 = vVar.x() + 1;
                a4.g gVar = new a4.g(vVar.a);
                int i15 = 8;
                gVar.t(vVar.b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < x12) {
                        int i18 = i15;
                        if (gVar.i(24) != 5653314) {
                            throw s0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((gVar.d * 8) + gVar.e));
                        }
                        int i19 = gVar.i(16);
                        int i20 = gVar.i(24);
                        if (gVar.h()) {
                            gVar.t(i14);
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
                                    gVar.t(i14);
                                } else if (gVar.h()) {
                                    gVar.t(i14);
                                }
                            }
                        }
                        int i25 = gVar.i(4);
                        if (i25 > 2) {
                            throw s0.a(null, "lookup type greater than 2 not decodable: " + i25);
                        }
                        if (i25 == 1 || i25 == 2) {
                            gVar.t(32);
                            gVar.t(32);
                            int i26 = gVar.i(4) + 1;
                            gVar.t(1);
                            gVar.t((int) ((i25 == 1 ? i19 != 0 ? (long) Math.floor(Math.pow(i20, 1.0d / i19)) : 0L : i20 * i19) * i26));
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
                                throw s0.a(null, "placeholder of time domain transforms not zeroed out");
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
                                    gVar.t(i36);
                                    gVar.t(16);
                                    gVar.t(16);
                                    gVar.t(6);
                                    gVar.t(i36);
                                    int i37 = gVar.i(4) + 1;
                                    int i38 = 0;
                                    while (i38 < i37) {
                                        gVar.t(i36);
                                        i38++;
                                        i36 = 8;
                                    }
                                } else {
                                    if (i35 != i31) {
                                        throw s0.a(null, "floor type greater than 1 not decodable: " + i35);
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
                                            gVar.t(i46);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i47 = 0;
                                        for (int i48 = 1; i47 < (i48 << i45); i48 = 1) {
                                            gVar.t(i46);
                                            i47++;
                                            i46 = 8;
                                        }
                                        i44++;
                                        iArr2 = iArr3;
                                        i27 = 8;
                                        i34 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    gVar.t(2);
                                    int i49 = gVar.i(4);
                                    int i50 = 0;
                                    int i51 = 0;
                                    for (int i52 = 0; i52 < i39; i52++) {
                                        i50 += iArr4[iArr[i52]];
                                        while (i51 < i50) {
                                            gVar.t(i49);
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
                                        throw s0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    gVar.t(24);
                                    gVar.t(24);
                                    gVar.t(24);
                                    int i55 = gVar.i(i28) + 1;
                                    int i56 = 8;
                                    gVar.t(8);
                                    int[] iArr5 = new int[i55];
                                    for (int i57 = 0; i57 < i55; i57++) {
                                        iArr5[i57] = ((gVar.h() ? gVar.i(5) : 0) * 8) + gVar.i(3);
                                    }
                                    int i58 = 0;
                                    while (i58 < i55) {
                                        int i59 = 0;
                                        while (i59 < i56) {
                                            if ((iArr5[i58] & (1 << i59)) != 0) {
                                                gVar.t(i56);
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
                                        e2.a.e("VorbisUtil", "mapping type other than 0 not supported: " + i62);
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
                                                gVar.t(i67);
                                                int i69 = 0;
                                                while (i66 > 0) {
                                                    i69++;
                                                    i66 >>>= 1;
                                                }
                                                gVar.t(i69);
                                            }
                                        }
                                        if (gVar.i(2) != 0) {
                                            throw s0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i63 > 1) {
                                            for (int i70 = 0; i70 < i13; i70++) {
                                                gVar.t(4);
                                            }
                                        }
                                        for (int i71 = 0; i71 < i63; i71++) {
                                            gVar.t(8);
                                            gVar.t(8);
                                            gVar.t(8);
                                        }
                                    }
                                }
                                int i72 = gVar.i(6);
                                int i73 = i72 + 1;
                                j0[] j0VarArr = new j0[i73];
                                for (int i74 = 0; i74 < i73; i74++) {
                                    boolean h10 = gVar.h();
                                    gVar.i(16);
                                    gVar.i(16);
                                    gVar.i(8);
                                    j0VarArr[i74] = new j0(h10);
                                }
                                if (!gVar.h()) {
                                    throw s0.a(null, "framing bit after modes not set as expected");
                                }
                                int i75 = 0;
                                while (i72 > 0) {
                                    i75++;
                                    i72 >>>= 1;
                                }
                                g0Var = new g0(zVar, lVar, bArr, j0VarArr, i75);
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
        p0 r10 = c3.b.r(i0.w((String[]) ((l) g0Var.c).b));
        r rVar = new r();
        rVar.p = r0.n("audio/ogg");
        rVar.q = r0.n("audio/vorbis");
        rVar.h = zVar3.d;
        rVar.i = zVar3.c;
        rVar.I = zVar3.a;
        rVar.J = zVar3.b;
        rVar.t = arrayList;
        rVar.k = r10;
        tVar.b = new s(rVar);
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
