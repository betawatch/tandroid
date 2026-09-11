package w3;

import b2.p0;
import b2.r0;
import b2.s0;
import c3.a0;
import c3.b0;
import c3.c0;
import c3.f0;
import c3.h0;
import c3.s;
import c3.t;
import c3.w;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class k implements c3.o, b0 {
    public j[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public r3.a F;
    public final z3.k a;
    public final int b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final ArrayDeque g;
    public final m h;
    public final ArrayList i;
    public a1 j;
    public int k;
    public int l;
    public long m;
    public int n;
    public v o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public long y;
    public c3.q z;

    public k(z3.k kVar, int i10) {
        this.a = kVar;
        this.b = i10;
        g0 g0Var = i0.b;
        this.j = a1.e;
        this.k = (i10 & 4) != 0 ? 3 : 0;
        this.h = new m();
        this.i = new ArrayList();
        this.f = new v(16);
        this.g = new ArrayDeque();
        this.c = new v(f2.p.a);
        this.d = new v(6);
        this.e = new v();
        this.p = -1;
        this.z = c3.q.m;
        this.A = new j[0];
    }

    @Override // c3.o
    public final boolean b(c3.p pVar) {
        a1 a1Var;
        f0 n10 = n.n(pVar, false, (this.b & 2) != 0);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.b;
            a1Var = a1.e;
        }
        this.j = a1Var;
        return n10 == null;
    }

    @Override // c3.b0
    public final boolean f() {
        return true;
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        if ((this.b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.a);
        }
        this.z = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j3 == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.n = 0;
                return;
            } else {
                m mVar = this.h;
                mVar.a.clear();
                mVar.b = 0;
                this.i.clear();
                return;
            }
        }
        for (j jVar : this.A) {
            r rVar = jVar.b;
            int e7 = d0.e(rVar.f, j10, false);
            while (true) {
                if (e7 < 0) {
                    e7 = -1;
                    break;
                } else if ((rVar.g[e7] & 1) != 0) {
                    break;
                } else {
                    e7--;
                }
            }
            if (e7 == -1) {
                e7 = rVar.a(j10);
            }
            jVar.e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.b = false;
                i0Var.c = 0;
            }
        }
    }

    @Override // c3.o
    public final List i() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // c3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 j(long j3) {
        long j10;
        long j11;
        long j12;
        int i10;
        j[] jVarArr;
        int i11;
        long j13;
        int a2;
        j[] jVarArr2 = this.A;
        int length = jVarArr2.length;
        c0 c0Var = c0.c;
        if (length == 0) {
            return new a0(c0Var, c0Var);
        }
        int i12 = this.C;
        boolean z10 = false;
        int i13 = -1;
        long j14 = -1;
        if (i12 != -1) {
            r rVar = jVarArr2[i12].b;
            long[] jArr = rVar.f;
            int e7 = d0.e(jArr, j3, false);
            while (true) {
                if (e7 < 0) {
                    e7 = -1;
                    break;
                }
                if ((rVar.g[e7] & 1) != 0) {
                    break;
                }
                e7--;
            }
            if (e7 == -1) {
                e7 = rVar.a(j3);
            }
            long[] jArr2 = rVar.c;
            if (e7 == -1) {
                return new a0(c0Var, c0Var);
            }
            j11 = jArr[e7];
            j10 = jArr2[e7];
            if (j11 < j3 && e7 < rVar.b - 1 && (a2 = rVar.a(j3)) != -1 && a2 != e7) {
                j12 = jArr[a2];
                j14 = jArr2[a2];
                long j15 = j10;
                i10 = 0;
                while (true) {
                    jVarArr = this.A;
                    if (i10 < jVarArr.length) {
                        break;
                    }
                    if (i10 != this.C) {
                        r rVar2 = jVarArr[i10].b;
                        long[] jArr3 = rVar2.c;
                        int[] iArr = rVar2.g;
                        long[] jArr4 = rVar2.f;
                        int e10 = d0.e(jArr4, j11, z10);
                        while (true) {
                            if (e10 < 0) {
                                i11 = -1;
                                break;
                            }
                            if ((iArr[e10] & 1) != 0) {
                                i11 = e10;
                                break;
                            }
                            e10--;
                        }
                        if (i11 == i13) {
                            i11 = rVar2.a(j11);
                        }
                        if (i11 == i13) {
                            j13 = j14;
                        } else {
                            j13 = j14;
                            j15 = Math.min(jArr3[i11], j15);
                        }
                        if (j12 != -9223372036854775807L) {
                            z10 = false;
                            int e11 = d0.e(jArr4, j12, false);
                            while (true) {
                                if (e11 < 0) {
                                    e11 = -1;
                                    break;
                                }
                                if ((iArr[e11] & 1) != 0) {
                                    break;
                                }
                                e11--;
                            }
                            if (e11 == -1) {
                                e11 = rVar2.a(j12);
                            }
                            j14 = e11 == -1 ? j13 : Math.min(jArr3[e11], j13);
                        } else {
                            j14 = j13;
                            z10 = false;
                        }
                    }
                    i10++;
                    i13 = -1;
                }
                c0 c0Var2 = new c0(j11, j15);
                return j12 != -9223372036854775807L ? new a0(c0Var2, c0Var2) : new a0(c0Var2, new c0(j12, j14));
            }
        } else {
            j10 = Long.MAX_VALUE;
            j11 = j3;
        }
        j12 = -9223372036854775807L;
        long j152 = j10;
        i10 = 0;
        while (true) {
            jVarArr = this.A;
            if (i10 < jVarArr.length) {
            }
            i10++;
            i13 = -1;
        }
        c0 c0Var22 = new c0(j11, j152);
        if (j12 != -9223372036854775807L) {
        }
    }

    @Override // c3.b0
    public final long l() {
        return this.D;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(c3.p pVar, s sVar) {
        char c10;
        char c11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j3;
        v vVar;
        char c12;
        char c13;
        boolean z10;
        f2.d dVar;
        boolean z11;
        while (true) {
            int i15 = this.k;
            ArrayDeque arrayDeque = this.g;
            int i16 = this.b;
            v vVar2 = this.e;
            int i17 = 4;
            if (i15 == 0) {
                int i18 = this.n;
                v vVar3 = this.f;
                if (i18 == 0) {
                    if (pVar.d(vVar3.a, 0, 8, true)) {
                        this.n = 8;
                        vVar3.J(0);
                        this.m = vVar3.z();
                        this.l = vVar3.j();
                    } else {
                        if (this.E == 2 && (i16 & 2) != 0) {
                            h0 R1 = this.z.R1(0, 4);
                            r3.a aVar = this.F;
                            p0 p0Var = aVar == null ? null : new p0(aVar);
                            b2.r rVar = new b2.r();
                            rVar.k = p0Var;
                            i2.g.u(rVar, R1);
                            this.z.Z0();
                            this.z.P1(new t(-9223372036854775807L));
                        }
                        z11 = false;
                        if (z11) {
                            return -1;
                        }
                    }
                }
                long j10 = this.m;
                if (j10 == 1) {
                    pVar.readFully(vVar3.a, 8, 8);
                    this.n += 8;
                    this.m = vVar3.C();
                } else if (j10 == 0) {
                    long length = pVar.getLength();
                    if (length == -1 && (dVar = (f2.d) arrayDeque.peek()) != null) {
                        length = dVar.c;
                    }
                    if (length != -1) {
                        this.m = (length - pVar.getPosition()) + this.n;
                    }
                }
                long j11 = this.m;
                int i19 = this.n;
                if (j11 < i19) {
                    throw s0.c("Atom size less than header length (unsupported).");
                }
                int i20 = this.l;
                if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1701082227 || i20 == 1835365473 || i20 == 1635284069) {
                    long position = pVar.getPosition();
                    long j12 = this.m;
                    long j13 = this.n;
                    long j14 = (position + j12) - j13;
                    if (j12 != j13 && this.l == 1835365473) {
                        vVar2.G(8);
                        pVar.b(0, 8, vVar2.a);
                        c.a(vVar2);
                        pVar.r(vVar2.b);
                        pVar.q();
                    }
                    arrayDeque.push(new f2.d(this.l, j14));
                    if (this.m == this.n) {
                        n(j14);
                    } else {
                        this.k = 0;
                        this.n = 0;
                    }
                } else if (i20 == 1835296868 || i20 == 1836476516 || i20 == 1751411826 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1937011571 || i20 == 1668576371 || i20 == 1701606260 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1953196132 || i20 == 1718909296 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                    e2.d.g(i19 == 8);
                    e2.d.g(this.m <= 2147483647L);
                    v vVar4 = new v((int) this.m);
                    System.arraycopy(vVar3.a, 0, vVar4.a, 0, 8);
                    this.o = vVar4;
                    this.k = 1;
                } else {
                    long position2 = pVar.getPosition();
                    long j15 = this.n;
                    long j16 = position2 - j15;
                    if (this.l == 1836086884) {
                        this.F = new r3.a(0L, j16, -9223372036854775807L, j16 + j15, this.m - j15);
                    }
                    this.o = null;
                    this.k = 1;
                }
                z11 = true;
                if (z11) {
                }
            } else {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        m mVar = this.h;
                        ArrayList arrayList = mVar.a;
                        int i21 = mVar.b;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                short s10 = 2817;
                                short s11 = 2816;
                                short s12 = 2192;
                                if (i21 == 2) {
                                    long length2 = pVar.getLength();
                                    int i22 = mVar.c - 20;
                                    v vVar5 = new v(i22);
                                    pVar.readFully(vVar5.a, 0, i22);
                                    int i23 = 0;
                                    while (i23 < i22 / 12) {
                                        vVar5.K(2);
                                        short n10 = vVar5.n();
                                        if (n10 != s12 && n10 != s11 && n10 != s10 && n10 != 2819) {
                                            if (n10 != 2820) {
                                                vVar5.K(8);
                                                j3 = length2;
                                                vVar = vVar5;
                                                i23++;
                                                length2 = j3;
                                                vVar5 = vVar;
                                                s12 = 2192;
                                                s10 = 2817;
                                                s11 = 2816;
                                            }
                                        }
                                        j3 = length2;
                                        vVar = vVar5;
                                        arrayList.add(new l((j3 - mVar.c) - vVar5.l(), vVar.l()));
                                        i23++;
                                        length2 = j3;
                                        vVar5 = vVar;
                                        s12 = 2192;
                                        s10 = 2817;
                                        s11 = 2816;
                                    }
                                    if (arrayList.isEmpty()) {
                                        sVar.a = 0L;
                                    } else {
                                        mVar.b = 3;
                                        sVar.a = ((l) arrayList.get(0)).a;
                                    }
                                } else {
                                    if (i21 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    long position3 = pVar.getPosition();
                                    int length3 = (int) ((pVar.getLength() - pVar.getPosition()) - mVar.c);
                                    v vVar6 = new v(length3);
                                    pVar.readFully(vVar6.a, 0, length3);
                                    int i24 = 0;
                                    while (i24 < arrayList.size()) {
                                        l lVar = (l) arrayList.get(i24);
                                        vVar6.J((int) (lVar.a - position3));
                                        vVar6.K(i17);
                                        int l4 = vVar6.l();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String v = vVar6.v(l4, charset);
                                        switch (v.hashCode()) {
                                            case -1711564334:
                                                if (v.equals("SlowMotion_Data")) {
                                                    c12 = 0;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case -1332107749:
                                                if (v.equals("Super_SlowMotion_Edit_Data")) {
                                                    c12 = 1;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case -1251387154:
                                                if (v.equals("Super_SlowMotion_Data")) {
                                                    c12 = 2;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case -830665521:
                                                if (v.equals("Super_SlowMotion_Deflickering_On")) {
                                                    c12 = 3;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1760745220:
                                                if (v.equals("Super_SlowMotion_BGM")) {
                                                    c12 = 4;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            default:
                                                c12 = 65535;
                                                break;
                                        }
                                        switch (c12) {
                                            case 0:
                                                c13 = 2192;
                                                break;
                                            case 1:
                                                c13 = 2819;
                                                break;
                                            case 2:
                                                c13 = 2816;
                                                break;
                                            case 3:
                                                c13 = 2820;
                                                break;
                                            case 4:
                                                c13 = 2817;
                                                break;
                                            default:
                                                throw s0.a(null, "Invalid SEF name");
                                        }
                                        int i25 = lVar.b - (l4 + 8);
                                        if (c13 == 2192) {
                                            ArrayList arrayList2 = new ArrayList();
                                            List x10 = m.e.x(vVar6.v(i25, charset));
                                            for (int i26 = 0; i26 < x10.size(); i26++) {
                                                List x11 = m.d.x((CharSequence) x10.get(i26));
                                                if (x11.size() != 3) {
                                                    throw s0.a(null, null);
                                                }
                                                try {
                                                    arrayList2.add(new r3.b(Long.parseLong((String) x11.get(0)), Long.parseLong((String) x11.get(1)), 1 << (Integer.parseInt((String) x11.get(2)) - 1)));
                                                } catch (NumberFormatException e7) {
                                                    throw s0.a(e7, null);
                                                }
                                            }
                                            this.i.add(new r3.c(arrayList2));
                                        } else if (c13 != 2816 && c13 != 2817 && c13 != 2819 && c13 != 2820) {
                                            throw new IllegalStateException();
                                        }
                                        i24++;
                                        i17 = 4;
                                    }
                                    sVar.a = 0L;
                                }
                            } else {
                                v vVar7 = new v(8);
                                pVar.readFully(vVar7.a, 0, 8);
                                mVar.c = vVar7.l() + 8;
                                if (vVar7.j() != 1397048916) {
                                    sVar.a = 0L;
                                } else {
                                    sVar.a = pVar.getPosition() - (mVar.c - 12);
                                    mVar.b = 2;
                                }
                            }
                            i14 = 1;
                        } else {
                            long length4 = pVar.getLength();
                            sVar.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i14 = 1;
                            mVar.b = 1;
                        }
                        if (sVar.a != 0) {
                            return 1;
                        }
                        this.k = 0;
                        this.n = 0;
                        return i14;
                    }
                    long position4 = pVar.getPosition();
                    if (this.p == -1) {
                        int i27 = 0;
                        int i28 = -1;
                        int i29 = -1;
                        boolean z12 = true;
                        boolean z13 = true;
                        long j17 = Long.MAX_VALUE;
                        long j18 = Long.MAX_VALUE;
                        long j19 = Long.MAX_VALUE;
                        while (true) {
                            j[] jVarArr = this.A;
                            if (i27 >= jVarArr.length) {
                                break;
                            }
                            j jVar = jVarArr[i27];
                            int i30 = jVar.e;
                            r rVar2 = jVar.b;
                            if (i30 != rVar2.b) {
                                long j20 = rVar2.c[i30];
                                long[][] jArr = this.B;
                                String str = d0.a;
                                long j21 = jArr[i27][i30];
                                long j22 = j20 - position4;
                                boolean z14 = j22 < 0 || j22 >= 262144;
                                if ((!z14 && z12) || (z14 == z12 && j22 < j19)) {
                                    i29 = i27;
                                    z12 = z14;
                                    j18 = j21;
                                    j19 = j22;
                                }
                                if (j21 < j17) {
                                    i28 = i27;
                                    z13 = z14;
                                    j17 = j21;
                                }
                            }
                            i27++;
                        }
                        c10 = 2;
                        if (j17 == Long.MAX_VALUE || !z13 || j18 < j17 + 524288) {
                            i28 = i29;
                        }
                        this.p = i28;
                        if (i28 == -1) {
                            return -1;
                        }
                    } else {
                        c10 = 2;
                    }
                    j jVar2 = this.A[this.p];
                    h0 h0Var = jVar2.c;
                    r rVar3 = jVar2.b;
                    o oVar = jVar2.a;
                    int i31 = jVar2.e;
                    long[] jArr2 = rVar3.c;
                    int[] iArr = rVar3.d;
                    long j23 = jArr2[i31] + this.y;
                    int i32 = iArr[i31];
                    c3.i0 i0Var = jVar2.d;
                    long j24 = (j23 - position4) + this.q;
                    if (j24 < 0 || j24 >= 262144) {
                        sVar.a = j23;
                        return 1;
                    }
                    int i33 = oVar.h;
                    int i34 = oVar.k;
                    b2.s sVar2 = oVar.g;
                    if (i33 == 1) {
                        j24 += 8;
                        i32 -= 8;
                    }
                    int i35 = i32;
                    pVar.r((int) j24);
                    String str2 = sVar2.r;
                    String str3 = sVar2.r;
                    if (!Objects.equals(str2, MediaController.VIDEO_MIME_TYPE) ? !Objects.equals(str3, "video/hevc") || (i16 & 128) == 0 : (i16 & 32) == 0) {
                        c11 = 1;
                        this.t = true;
                    } else {
                        c11 = 1;
                    }
                    if (i34 != 0) {
                        v vVar8 = this.d;
                        byte[] bArr = vVar8.a;
                        bArr[0] = 0;
                        bArr[c11] = 0;
                        bArr[c10] = 0;
                        int i36 = 4 - i34;
                        int i37 = i35 + i36;
                        while (this.r < i37) {
                            int i38 = this.s;
                            if (i38 == 0) {
                                if (this.t || f2.p.d(sVar2) + i34 > iArr[i31] - this.q) {
                                    i12 = i34;
                                    i13 = 0;
                                } else {
                                    i13 = f2.p.d(sVar2);
                                    i12 = i34 + i13;
                                }
                                pVar.readFully(bArr, i36, i12);
                                i11 = i37;
                                this.q += i12;
                                vVar8.J(0);
                                int j25 = vVar8.j();
                                if (j25 < 0) {
                                    throw s0.a(null, "Invalid NAL length");
                                }
                                this.s = j25 - i13;
                                v vVar9 = this.c;
                                vVar9.J(0);
                                int i39 = i13;
                                h0Var.d(4, vVar9);
                                this.r += 4;
                                if (i39 > 0) {
                                    h0Var.d(i39, vVar8);
                                    this.r += i39;
                                    if (f2.p.c(bArr, i39, sVar2)) {
                                        this.t = true;
                                    }
                                }
                            } else {
                                i11 = i37;
                                int a2 = h0Var.a(pVar, i38, false);
                                this.q += a2;
                                this.r += a2;
                                this.s -= a2;
                            }
                            i37 = i11;
                        }
                        i10 = i37;
                    } else {
                        if ("audio/ac4".equals(str3)) {
                            if (this.r == 0) {
                                c3.b.g(i35, vVar2);
                                h0Var.d(7, vVar2);
                                this.r += 7;
                            }
                            i35 += 7;
                        } else if (i0Var != null) {
                            i0Var.c(pVar);
                        }
                        while (true) {
                            int i40 = this.r;
                            if (i40 >= i35) {
                                break;
                            }
                            int a10 = h0Var.a(pVar, i35 - i40, false);
                            this.q += a10;
                            this.r += a10;
                            this.s -= a10;
                        }
                        i10 = i35;
                    }
                    long j26 = rVar3.f[i31];
                    int i41 = rVar3.g[i31];
                    if (!this.t) {
                        i41 |= 67108864;
                    }
                    int i42 = i41;
                    if (i0Var != null) {
                        i0Var.b(h0Var, j26, i42, i10, 0, null);
                        if (i31 + 1 == rVar3.b) {
                            i0Var.a(h0Var, null);
                        }
                    } else {
                        h0Var.c(j26, i42, i10, 0, null);
                    }
                    jVar2.e++;
                    this.p = -1;
                    this.q = 0;
                    this.r = 0;
                    this.s = 0;
                    this.t = false;
                    return 0;
                }
                long j27 = this.m - this.n;
                long position5 = pVar.getPosition() + j27;
                v vVar10 = this.o;
                if (vVar10 != null) {
                    pVar.readFully(vVar10.a, this.n, (int) j27);
                    if (this.l == 1718909296) {
                        this.u = true;
                        vVar10.J(8);
                        int j28 = vVar10.j();
                        int i43 = j28 != 1751476579 ? j28 != 1903435808 ? 0 : 1 : 2;
                        if (i43 == 0) {
                            vVar10.K(4);
                            while (true) {
                                if (vVar10.a() <= 0) {
                                    i43 = 0;
                                    break;
                                }
                                int j29 = vVar10.j();
                                i43 = j29 != 1751476579 ? j29 != 1903435808 ? 0 : 1 : 2;
                                if (i43 != 0) {
                                    break;
                                }
                            }
                        }
                        this.E = i43;
                    } else if (!arrayDeque.isEmpty()) {
                        ((f2.d) arrayDeque.peek()).d.add(new f2.e(this.l, vVar10));
                    }
                } else {
                    if (!this.u && this.l == 1835295092) {
                        this.E = 1;
                    }
                    if (j27 < 262144) {
                        pVar.r((int) j27);
                    } else {
                        sVar.a = pVar.getPosition() + j27;
                        z10 = true;
                        n(position5);
                        if (this.v) {
                            this.x = true;
                            sVar.a = this.w;
                            this.v = false;
                            z10 = true;
                        }
                        if (!((z10 || this.k == 2) ? false : true)) {
                            return 1;
                        }
                    }
                }
                z10 = false;
                n(position5);
                if (this.v) {
                }
                if (!((z10 || this.k == 2) ? false : true)) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(long j3) {
        p0 p0Var;
        ArrayDeque arrayDeque;
        p0 p0Var2;
        p0 p0Var3;
        boolean z10;
        ArrayDeque arrayDeque2;
        int i10;
        ArrayList arrayList;
        String str;
        p0 p0Var4;
        int i11;
        int i12;
        f2.b b10;
        while (true) {
            ArrayDeque arrayDeque3 = this.g;
            if (arrayDeque3.isEmpty() || ((f2.d) arrayDeque3.peek()).c != j3) {
                break;
            }
            f2.d dVar = (f2.d) arrayDeque3.pop();
            if (dVar.b == 1836019574) {
                f2.d i13 = dVar.i(1835365473);
                ArrayList arrayList2 = new ArrayList();
                int i14 = this.b;
                if (i13 != null) {
                    p0Var = c.f(i13);
                    if (this.x) {
                        e2.d.h(p0Var);
                        f2.b b11 = n.b(p0Var, "auxiliary.tracks.interleaved");
                        if (b11 != null && b11.b[0] == 0) {
                            this.y = this.w + 16;
                        }
                        f2.b b12 = n.b(p0Var, "auxiliary.tracks.map");
                        e2.d.h(b12);
                        ArrayList d = b12.d();
                        ArrayList arrayList3 = new ArrayList(d.size());
                        int i15 = 0;
                        while (i15 < d.size()) {
                            int intValue = ((Integer) d.get(i15)).intValue();
                            i15 = e2.e(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1, i15, 1, arrayList3);
                        }
                        arrayList2 = arrayList3;
                    } else if (p0Var != null && (i14 & 64) != 0 && (b10 = n.b(p0Var, "auxiliary.tracks.offset")) != null) {
                        long C = new v(b10.b).C();
                        if (C > 0) {
                            this.w = C;
                            this.v = true;
                            arrayDeque = arrayDeque3;
                            arrayDeque.clear();
                            if (this.v) {
                                this.k = 2;
                            }
                        }
                    }
                } else {
                    p0Var = null;
                }
                ArrayList arrayList4 = new ArrayList();
                boolean z11 = this.E == 1;
                ArrayList arrayList5 = arrayList2;
                w wVar = new w();
                f2.e j10 = dVar.j(1969517665);
                if (j10 != null) {
                    p0 k10 = c.k(j10);
                    wVar.b(k10);
                    p0Var2 = k10;
                } else {
                    p0Var2 = null;
                }
                f2.e j11 = dVar.j(1836476516);
                j11.getClass();
                p0 p0Var5 = new p0(c.g(j11.c));
                if ((i14 & 1) != 0) {
                    p0Var3 = p0Var5;
                    z10 = true;
                } else {
                    p0Var3 = p0Var5;
                    z10 = false;
                }
                p0 p0Var6 = p0Var3;
                ArrayList j12 = c.j(dVar, wVar, -9223372036854775807L, null, z10, z11, new t0.a(18));
                if (this.x) {
                    boolean z12 = arrayList5.size() == j12.size();
                    Locale locale = Locale.US;
                    e2.d.f("The number of auxiliary track types from metadata (" + arrayList5.size() + ") is not same as the number of auxiliary tracks (" + j12.size() + ")", z12);
                }
                String c10 = n.c(j12);
                int i16 = -1;
                int i17 = 0;
                int i18 = 0;
                long j13 = -9223372036854775807L;
                while (i17 < j12.size()) {
                    r rVar = (r) j12.get(i17);
                    int i19 = rVar.b;
                    int i20 = rVar.e;
                    if (i19 == 0) {
                        arrayDeque2 = arrayDeque3;
                        arrayList = j12;
                        str = c10;
                        i10 = i18;
                        p0Var4 = p0Var;
                    } else {
                        o oVar = rVar.a;
                        arrayDeque2 = arrayDeque3;
                        c3.q qVar = this.z;
                        i10 = i18 + 1;
                        arrayList = j12;
                        int i21 = oVar.b;
                        str = c10;
                        b2.s sVar = oVar.g;
                        h0 R1 = qVar.R1(i18, i21);
                        j jVar = new j(oVar, rVar, R1);
                        p0Var4 = p0Var;
                        long j14 = oVar.e;
                        if (j14 == -9223372036854775807L) {
                            j14 = rVar.h;
                        }
                        R1.getClass();
                        j13 = Math.max(j13, j14);
                        int i22 = "audio/true-hd".equals(sVar.r) ? i20 * 16 : i20 + 30;
                        b2.r a2 = sVar.a();
                        a2.r = i22;
                        if (i21 == 2) {
                            int i23 = sVar.f;
                            if ((i14 & 8) != 0) {
                                i23 |= i16 == -1 ? 1 : 2;
                            }
                            if (this.x) {
                                i23 |= 32768;
                                a2.g = ((Integer) arrayList5.get(i17)).intValue();
                            }
                            a2.f = i23;
                        }
                        if (i21 == 1 && (i11 = wVar.a) != -1 && (i12 = wVar.b) != -1) {
                            a2.L = i11;
                            a2.M = i12;
                        }
                        p0 p0Var7 = sVar.l;
                        ArrayList arrayList6 = this.i;
                        n.m(i21, p0Var4, a2, p0Var7, arrayList6.isEmpty() ? null : new p0(arrayList6), p0Var2, p0Var6);
                        a2.p = r0.n(str);
                        i2.g.u(a2, R1);
                        if (i21 == 2 && i16 == -1) {
                            i16 = arrayList4.size();
                        }
                        arrayList4.add(jVar);
                    }
                    i17++;
                    p0Var = p0Var4;
                    arrayDeque3 = arrayDeque2;
                    i18 = i10;
                    j12 = arrayList;
                    c10 = str;
                }
                arrayDeque = arrayDeque3;
                this.C = i16;
                this.D = j13;
                j[] jVarArr = (j[]) arrayList4.toArray(new j[0]);
                this.A = jVarArr;
                long[][] jArr = new long[jVarArr.length][];
                int[] iArr = new int[jVarArr.length];
                long[] jArr2 = new long[jVarArr.length];
                boolean[] zArr = new boolean[jVarArr.length];
                for (int i24 = 0; i24 < jVarArr.length; i24++) {
                    jArr[i24] = new long[jVarArr[i24].b.b];
                    jArr2[i24] = jVarArr[i24].b.f[0];
                }
                int i25 = 0;
                long j15 = 0;
                while (i25 < jVarArr.length) {
                    long j16 = Long.MAX_VALUE;
                    int i26 = -1;
                    for (int i27 = 0; i27 < jVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            long j17 = jArr2[i27];
                            if (j17 <= j16) {
                                i26 = i27;
                                j16 = j17;
                            }
                        }
                    }
                    int i28 = iArr[i26];
                    long[] jArr3 = jArr[i26];
                    jArr3[i28] = j15;
                    r rVar2 = jVarArr[i26].b;
                    j15 += rVar2.d[i28];
                    int i29 = i28 + 1;
                    iArr[i26] = i29;
                    if (i29 < jArr3.length) {
                        jArr2[i26] = rVar2.f[i29];
                    } else {
                        zArr[i26] = true;
                        i25++;
                    }
                }
                this.B = jArr;
                this.z.Z0();
                this.z.P1(this);
                arrayDeque.clear();
                if (this.v) {
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((f2.d) arrayDeque3.peek()).e.add(dVar);
            }
        }
        if (this.k != 2) {
            this.k = 0;
            this.n = 0;
        }
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
