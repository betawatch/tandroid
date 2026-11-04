package z3;

import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import d2.v0;
import e0.e0;
import e3.k0;
import e3.z;
import g2.y;
import g9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends i {
    public e0 n;
    public int o;
    public boolean p;
    public z q;
    public k0 r;

    @Override // z3.i
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        z zVar = this.q;
        this.o = zVar != null ? zVar.e : 0;
    }

    @Override // z3.i
    public final long b(y yVar) {
        byte b10 = yVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        e0 e0Var = this.n;
        e0Var.getClass();
        int i3 = e0Var.b;
        z zVar = (z) e0Var.c;
        int i10 = !((di.a[]) e0Var.f)[(b10 >> 1) & (hs.e4 >>> (8 - i3))].a ? zVar.e : zVar.f;
        long j10 = this.p ? (this.o + i10) / 4 : 0;
        byte[] bArr = yVar.a;
        int length = bArr.length;
        int i11 = yVar.c + 4;
        if (length < i11) {
            byte[] copyOf = Arrays.copyOf(bArr, i11);
            yVar.L(copyOf.length, copyOf);
        } else {
            yVar.M(i11);
        }
        byte[] bArr2 = yVar.a;
        int i12 = yVar.c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.p = true;
        this.o = i10;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // z3.i
    public final boolean c(y yVar, long j10, ua.b bVar) {
        e0 e0Var;
        if (this.n != null) {
            ((v) bVar.b).getClass();
            return false;
        }
        z zVar = this.q;
        int i3 = 4;
        if (zVar == null) {
            e3.b.w(1, yVar, false);
            yVar.s();
            int A = yVar.A();
            int s6 = yVar.s();
            int o10 = yVar.o();
            if (o10 <= 0) {
                o10 = -1;
            }
            int o11 = yVar.o();
            int i10 = o11 > 0 ? o11 : -1;
            yVar.o();
            int A2 = yVar.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & hs.P3) >> 4);
            yVar.A();
            ?? copyOf = Arrays.copyOf(yVar.a, yVar.c);
            z zVar2 = new z();
            zVar2.a = A;
            zVar2.b = s6;
            zVar2.c = o10;
            zVar2.d = i10;
            zVar2.e = pow;
            zVar2.f = pow2;
            zVar2.g = copyOf;
            this.q = zVar2;
        } else {
            k0 k0Var = this.r;
            if (k0Var == null) {
                this.r = e3.b.u(yVar, true, true);
            } else {
                int i11 = yVar.c;
                byte[] bArr = new byte[i11];
                System.arraycopy(yVar.a, 0, bArr, 0, i11);
                int i12 = zVar.a;
                int i13 = 5;
                e3.b.w(5, yVar, false);
                int A3 = yVar.A() + 1;
                c4.f fVar = new c4.f(yVar.a);
                int i14 = 8;
                fVar.L(yVar.b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 < A3) {
                        int i17 = i14;
                        if (fVar.j(24) != 5653314) {
                            throw v0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.d * 8) + fVar.e));
                        }
                        int j11 = fVar.j(16);
                        int j12 = fVar.j(24);
                        if (fVar.i()) {
                            fVar.L(i13);
                            int i18 = 0;
                            while (i18 < j12) {
                                int i19 = 0;
                                for (int i20 = j12 - i18; i20 > 0; i20 >>>= 1) {
                                    i19++;
                                }
                                i18 += fVar.j(i19);
                            }
                        } else {
                            boolean i21 = fVar.i();
                            for (int i22 = 0; i22 < j12; i22++) {
                                if (!i21) {
                                    fVar.L(i13);
                                } else if (fVar.i()) {
                                    fVar.L(i13);
                                }
                            }
                        }
                        int j13 = fVar.j(4);
                        if (j13 > 2) {
                            throw v0.a(null, "lookup type greater than 2 not decodable: " + j13);
                        }
                        if (j13 == 1 || j13 == 2) {
                            fVar.L(32);
                            fVar.L(32);
                            int j14 = fVar.j(4) + 1;
                            fVar.L(1);
                            fVar.L((int) ((j13 == 1 ? j11 != 0 ? (long) Math.floor(Math.pow(j12, 1.0d / j11)) : 0L : j12 * j11) * j14));
                        }
                        i15++;
                        i14 = i17;
                        i13 = 5;
                    } else {
                        int i23 = i14;
                        int i24 = 6;
                        int j15 = fVar.j(6) + 1;
                        for (int i25 = 0; i25 < j15; i25++) {
                            if (fVar.j(16) != 0) {
                                throw v0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i26 = 1;
                        int j16 = fVar.j(6) + 1;
                        int i27 = 0;
                        while (true) {
                            int i28 = 3;
                            if (i27 < j16) {
                                int j17 = fVar.j(i16);
                                if (j17 == 0) {
                                    int i29 = i23;
                                    fVar.L(i29);
                                    fVar.L(16);
                                    fVar.L(16);
                                    fVar.L(6);
                                    fVar.L(i29);
                                    int j18 = fVar.j(4) + 1;
                                    int i30 = 0;
                                    while (i30 < j18) {
                                        fVar.L(i29);
                                        i30++;
                                        i29 = 8;
                                    }
                                } else {
                                    if (j17 != i26) {
                                        throw v0.a(null, "floor type greater than 1 not decodable: " + j17);
                                    }
                                    int j19 = fVar.j(5);
                                    int[] iArr = new int[j19];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < j19; i32++) {
                                        int j20 = fVar.j(i3);
                                        iArr[i32] = j20;
                                        if (j20 > i31) {
                                            i31 = j20;
                                        }
                                    }
                                    int i33 = i31 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = fVar.j(i28) + 1;
                                        int j21 = fVar.j(2);
                                        int i35 = i23;
                                        if (j21 > 0) {
                                            fVar.L(i35);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i36 = 0;
                                        for (int i37 = 1; i36 < (i37 << j21); i37 = 1) {
                                            fVar.L(i35);
                                            i36++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        iArr2 = iArr3;
                                        i23 = 8;
                                        i28 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    fVar.L(2);
                                    int j22 = fVar.j(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < j19; i40++) {
                                        i38 += iArr4[iArr[i40]];
                                        while (i39 < i38) {
                                            fVar.L(j22);
                                            i39++;
                                        }
                                    }
                                }
                                i27++;
                                i23 = 8;
                                i24 = 6;
                                i3 = 4;
                                i16 = 16;
                                i26 = 1;
                            } else {
                                int j23 = fVar.j(i24) + 1;
                                int i41 = 0;
                                while (i41 < j23) {
                                    if (fVar.j(16) > 2) {
                                        throw v0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    fVar.L(24);
                                    fVar.L(24);
                                    fVar.L(24);
                                    int j24 = fVar.j(i24) + 1;
                                    int i42 = 8;
                                    fVar.L(8);
                                    int[] iArr5 = new int[j24];
                                    for (int i43 = 0; i43 < j24; i43++) {
                                        iArr5[i43] = ((fVar.i() ? fVar.j(5) : 0) * 8) + fVar.j(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < j24) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr5[i44] & (1 << i45)) != 0) {
                                                fVar.L(i42);
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
                                int j25 = fVar.j(i24) + 1;
                                for (int i46 = 0; i46 < j25; i46++) {
                                    int j26 = fVar.j(16);
                                    if (j26 != 0) {
                                        g2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + j26);
                                    } else {
                                        int j27 = fVar.i() ? fVar.j(4) + 1 : 1;
                                        if (fVar.i()) {
                                            int j28 = fVar.j(8) + 1;
                                            for (int i47 = 0; i47 < j28; i47++) {
                                                int i48 = i12 - 1;
                                                int i49 = 0;
                                                for (int i50 = i48; i50 > 0; i50 >>>= 1) {
                                                    i49++;
                                                }
                                                fVar.L(i49);
                                                int i51 = 0;
                                                while (i48 > 0) {
                                                    i51++;
                                                    i48 >>>= 1;
                                                }
                                                fVar.L(i51);
                                            }
                                        }
                                        if (fVar.j(2) != 0) {
                                            throw v0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (j27 > 1) {
                                            for (int i52 = 0; i52 < i12; i52++) {
                                                fVar.L(4);
                                            }
                                        }
                                        for (int i53 = 0; i53 < j27; i53++) {
                                            fVar.L(8);
                                            fVar.L(8);
                                            fVar.L(8);
                                        }
                                    }
                                }
                                int j29 = fVar.j(6);
                                int i54 = j29 + 1;
                                di.a[] aVarArr = new di.a[i54];
                                for (int i55 = 0; i55 < i54; i55++) {
                                    boolean i56 = fVar.i();
                                    fVar.j(16);
                                    fVar.j(16);
                                    fVar.j(8);
                                    di.a aVar = new di.a();
                                    aVar.a = i56;
                                    aVarArr[i55] = aVar;
                                }
                                if (!fVar.i()) {
                                    throw v0.a(null, "framing bit after modes not set as expected");
                                }
                                int i57 = 0;
                                while (j29 > 0) {
                                    i57++;
                                    j29 >>>= 1;
                                }
                                e0Var = new e0(zVar, k0Var, bArr, aVarArr, i57);
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
        s0 r5 = e3.b.r(i0.r(((k0) e0Var.d).a));
        u uVar = new u();
        uVar.q = u0.n("audio/ogg");
        uVar.r = u0.n("audio/vorbis");
        uVar.h = zVar3.d;
        uVar.i = zVar3.c;
        uVar.J = zVar3.a;
        uVar.K = zVar3.b;
        uVar.u = arrayList;
        uVar.k = r5;
        bVar.b = new v(uVar);
        return true;
    }

    @Override // z3.i
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
