package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import b2.s0;
import c3.j0;
import c3.z;
import e0.i0;
import e2.v;
import java.util.ArrayList;
import java.util.Arrays;
import n7.z0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j extends i {
    public i0 n;
    public int o;
    public boolean p;
    public z q;
    public j0 r;

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
        i0 i0Var = this.n;
        e2.d.h(i0Var);
        int i10 = i0Var.a;
        z zVar = (z) i0Var.b;
        int i11 = !((ai.a[]) i0Var.e)[(b10 >> 1) & (255 >>> (8 - i10))].b ? zVar.e : zVar.f;
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
    public final boolean c(v vVar, long j3, z0 z0Var) {
        i0 i0Var;
        if (this.n != null) {
            ((s) z0Var.b).getClass();
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
            j0 j0Var = this.r;
            if (j0Var == null) {
                this.r = c3.b.v(vVar, true, true);
            } else {
                int i12 = vVar.c;
                byte[] bArr = new byte[i12];
                System.arraycopy(vVar.a, 0, bArr, 0, i12);
                int i13 = zVar.a;
                int i14 = 5;
                c3.b.x(5, vVar, false);
                int x12 = vVar.x() + 1;
                a4.h hVar = new a4.h(vVar.a);
                hVar.t(vVar.b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 >= x12) {
                        int i17 = 6;
                        int i18 = hVar.i(6) + 1;
                        for (int i19 = 0; i19 < i18; i19++) {
                            if (hVar.i(16) != 0) {
                                throw s0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i20 = 1;
                        int i21 = hVar.i(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < i21) {
                                int i24 = hVar.i(i16);
                                if (i24 == 0) {
                                    int i25 = 8;
                                    hVar.t(8);
                                    hVar.t(16);
                                    hVar.t(16);
                                    hVar.t(6);
                                    hVar.t(8);
                                    int i26 = hVar.i(4) + 1;
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        hVar.t(i25);
                                        i27++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (i24 != i20) {
                                        throw s0.a(null, "floor type greater than 1 not decodable: " + i24);
                                    }
                                    int i28 = hVar.i(5);
                                    int[] iArr = new int[i28];
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < i28; i30++) {
                                        int i31 = hVar.i(i10);
                                        iArr[i30] = i31;
                                        if (i31 > i29) {
                                            i29 = i31;
                                        }
                                    }
                                    int i32 = i29 + 1;
                                    int[] iArr2 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr2[i33] = hVar.i(i23) + 1;
                                        int i34 = hVar.i(2);
                                        int i35 = 8;
                                        if (i34 > 0) {
                                            hVar.t(8);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i36 = 0;
                                        for (int i37 = 1; i36 < (i37 << i34); i37 = 1) {
                                            hVar.t(i35);
                                            i36++;
                                            i35 = 8;
                                        }
                                        i33++;
                                        iArr2 = iArr3;
                                        i23 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    hVar.t(2);
                                    int i38 = hVar.i(4);
                                    int i39 = 0;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < i28; i41++) {
                                        i39 += iArr4[iArr[i41]];
                                        while (i40 < i39) {
                                            hVar.t(i38);
                                            i40++;
                                        }
                                    }
                                }
                                i22++;
                                i17 = 6;
                                i10 = 4;
                                i16 = 16;
                                i20 = 1;
                            } else {
                                int i42 = hVar.i(i17) + 1;
                                int i43 = 0;
                                while (i43 < i42) {
                                    if (hVar.i(16) > 2) {
                                        throw s0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    hVar.t(24);
                                    hVar.t(24);
                                    hVar.t(24);
                                    int i44 = hVar.i(i17) + 1;
                                    int i45 = 8;
                                    hVar.t(8);
                                    int[] iArr5 = new int[i44];
                                    for (int i46 = 0; i46 < i44; i46++) {
                                        iArr5[i46] = ((hVar.h() ? hVar.i(5) : 0) * 8) + hVar.i(3);
                                    }
                                    int i47 = 0;
                                    while (i47 < i44) {
                                        int i48 = 0;
                                        while (i48 < i45) {
                                            if ((iArr5[i47] & (1 << i48)) != 0) {
                                                hVar.t(i45);
                                            }
                                            i48++;
                                            i45 = 8;
                                        }
                                        i47++;
                                        i45 = 8;
                                    }
                                    i43++;
                                    i17 = 6;
                                }
                                int i49 = hVar.i(i17) + 1;
                                for (int i50 = 0; i50 < i49; i50++) {
                                    int i51 = hVar.i(16);
                                    if (i51 != 0) {
                                        e2.a.e("VorbisUtil", "mapping type other than 0 not supported: " + i51);
                                    } else {
                                        int i52 = hVar.h() ? hVar.i(4) + 1 : 1;
                                        if (hVar.h()) {
                                            int i53 = hVar.i(8) + 1;
                                            for (int i54 = 0; i54 < i53; i54++) {
                                                int i55 = i13 - 1;
                                                int i56 = 0;
                                                for (int i57 = i55; i57 > 0; i57 >>>= 1) {
                                                    i56++;
                                                }
                                                hVar.t(i56);
                                                int i58 = 0;
                                                while (i55 > 0) {
                                                    i58++;
                                                    i55 >>>= 1;
                                                }
                                                hVar.t(i58);
                                            }
                                        }
                                        if (hVar.i(2) != 0) {
                                            throw s0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i52 > 1) {
                                            for (int i59 = 0; i59 < i13; i59++) {
                                                hVar.t(4);
                                            }
                                        }
                                        for (int i60 = 0; i60 < i52; i60++) {
                                            hVar.t(8);
                                            hVar.t(8);
                                            hVar.t(8);
                                        }
                                    }
                                }
                                int i61 = hVar.i(6);
                                int i62 = i61 + 1;
                                ai.a[] aVarArr = new ai.a[i62];
                                for (int i63 = 0; i63 < i62; i63++) {
                                    boolean h = hVar.h();
                                    hVar.i(16);
                                    hVar.i(16);
                                    hVar.i(8);
                                    aVarArr[i63] = new ai.a(h);
                                }
                                if (!hVar.h()) {
                                    throw s0.a(null, "framing bit after modes not set as expected");
                                }
                                int i64 = 0;
                                while (i61 > 0) {
                                    i64++;
                                    i61 >>>= 1;
                                }
                                i0Var = new i0(zVar, j0Var, bArr, aVarArr, i64);
                            }
                        }
                    } else {
                        if (hVar.i(24) != 5653314) {
                            throw s0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((hVar.d * 8) + hVar.e));
                        }
                        int i65 = hVar.i(16);
                        int i66 = hVar.i(24);
                        if (hVar.h()) {
                            hVar.t(i14);
                            int i67 = 0;
                            while (i67 < i66) {
                                int i68 = 0;
                                for (int i69 = i66 - i67; i69 > 0; i69 >>>= 1) {
                                    i68++;
                                }
                                i67 += hVar.i(i68);
                            }
                        } else {
                            boolean h10 = hVar.h();
                            for (int i70 = 0; i70 < i66; i70++) {
                                if (!h10) {
                                    hVar.t(i14);
                                } else if (hVar.h()) {
                                    hVar.t(i14);
                                }
                            }
                        }
                        int i71 = hVar.i(4);
                        if (i71 > 2) {
                            throw s0.a(null, "lookup type greater than 2 not decodable: " + i71);
                        }
                        if (i71 == 1 || i71 == 2) {
                            hVar.t(32);
                            hVar.t(32);
                            int i72 = hVar.i(4) + 1;
                            hVar.t(1);
                            hVar.t((int) ((i71 == 1 ? i65 != 0 ? (long) Math.floor(Math.pow(i66, 1.0d / i65)) : 0L : i66 * i65) * i72));
                        }
                        i15++;
                        i14 = 5;
                    }
                }
            }
        }
        i0Var = null;
        this.n = i0Var;
        if (i0Var == null) {
            return true;
        }
        z zVar3 = (z) i0Var.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar3.g);
        arrayList.add((byte[]) i0Var.d);
        p0 r10 = c3.b.r(e9.i0.w(((j0) i0Var.c).a));
        r rVar = new r();
        rVar.p = r0.n("audio/ogg");
        rVar.q = r0.n("audio/vorbis");
        rVar.h = zVar3.d;
        rVar.i = zVar3.c;
        rVar.I = zVar3.a;
        rVar.J = zVar3.b;
        rVar.t = arrayList;
        rVar.k = r10;
        z0Var.b = new s(rVar);
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
