package z3;

import a8.ia;
import android.util.Pair;
import android.util.SparseArray;
import e2.q0;
import e2.s0;
import e2.t0;
import e2.u;
import f3.c0;
import f3.j0;
import f3.w;
import h2.k0;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import m4.d0;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h implements f3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final u P;
    public long A;
    public long B;
    public g C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public f3.q I;
    public j0[] J;
    public j0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final c4.k a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final x i;
    public final k0 j;
    public final h2.c o;
    public final j0 p;
    public final aa.n q;
    public t1 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public x w;
    public long x;
    public int y;
    public long z;
    public final d0 k = new d0(20);
    public final x l = new x(16);
    public final x e = new x(i2.o.a);
    public final x f = new x(6);
    public final x g = new x();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        e2.t tVar = new e2.t();
        tVar.r = s0.n("application/x-emsg");
        P = new u(tVar);
    }

    public h(c4.k kVar, int i7, k0 k0Var, List list, o2.o oVar) {
        this.a = kVar;
        this.b = i7;
        this.j = k0Var;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new x(bArr);
        g0 g0Var = i0.b;
        this.r = t1.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = f3.q.q;
        this.J = new j0[0];
        this.K = new j0[0];
        this.o = new h2.c(new e(this));
        this.q = new aa.n(17);
        this.N = -1L;
    }

    public static int g(int i7) {
        int i10 = (i7 & 1) != 0 ? 64 : 0;
        return (i7 & 2) != 0 ? i10 | 128 : i10;
    }

    public static e2.r i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            i2.d dVar = (i2.d) list.get(i7);
            if (dVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.c.a;
                m6.n i10 = p.i(bArr);
                UUID uuid = i10 == null ? null : (UUID) i10.b;
                if (uuid == null) {
                    h2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e2.q(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new e2.r(null, false, (e2.q[]) arrayList.toArray(new e2.q[0]));
    }

    public static void j(x xVar, int i7, s sVar) {
        xVar.N(i7 + 8);
        int m10 = xVar.m();
        byte[] bArr = c.a;
        if ((m10 & 1) != 0) {
            throw t0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z9 = (m10 & 2) != 0;
        int E = xVar.E();
        if (E == 0) {
            Arrays.fill(sVar.l, 0, sVar.e, false);
            return;
        }
        int i10 = sVar.e;
        x xVar2 = sVar.n;
        if (E != i10) {
            StringBuilder n10 = jg.g.n(E, "Senc sample count ", " is different from fragment sample count");
            n10.append(sVar.e);
            throw t0.a(null, n10.toString());
        }
        Arrays.fill(sVar.l, 0, E, z9);
        xVar2.K(xVar.a());
        sVar.k = true;
        sVar.o = true;
        xVar.k(0, xVar2.c, xVar2.a);
        xVar2.N(0);
        sVar.o = false;
    }

    public static Pair k(long j3, x xVar) {
        long G;
        long G2;
        x xVar2 = xVar;
        xVar2.N(8);
        int e10 = c.e(xVar2.m());
        xVar2.O(4);
        long C = xVar2.C();
        if (e10 == 0) {
            G = xVar2.C();
            G2 = xVar2.C();
        } else {
            G = xVar2.G();
            G2 = xVar2.G();
        }
        long j10 = G2 + j3;
        String str = m0.a;
        long a02 = m0.a0(G, 1000000L, C, RoundingMode.DOWN);
        xVar2.O(2);
        int H = xVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j11 = j10;
        long j12 = a02;
        int i7 = 0;
        while (i7 < H) {
            int m10 = xVar2.m();
            if ((Integer.MIN_VALUE & m10) != 0) {
                throw t0.a(null, "Unhandled indirect reference");
            }
            long C2 = xVar2.C();
            iArr[i7] = m10 & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i7] = j11;
            jArr3[i7] = j12;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long a03 = m0.a0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i7] = a03 - jArr5[i7];
            xVar2.O(4);
            j11 += iArr[i7];
            i7++;
            H = H;
            xVar2 = xVar;
            j12 = a03;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(a02), new f3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override // f3.o
    public final boolean b(f3.p pVar) {
        t1 t1Var;
        f3.g0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.b;
            t1Var = t1.e;
        }
        this.r = t1Var;
        return m10 == null;
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        int i7;
        int i10 = this.b;
        if ((i10 & 32) == 0) {
            qVar = new ab.q(qVar, this.a);
        }
        this.I = qVar;
        h();
        j0[] j0VarArr = new j0[2];
        this.J = j0VarArr;
        int i11 = 0;
        j0 j0Var = this.p;
        if (j0Var != null) {
            j0VarArr[0] = j0Var;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i12 = 100;
        if ((i10 & 4) != 0) {
            j0VarArr[i7] = this.I.O1(100, 5);
            i12 = 101;
            i7++;
        }
        j0[] j0VarArr2 = (j0[]) m0.U(i7, this.J);
        this.J = j0VarArr2;
        for (j0 j0Var2 : j0VarArr2) {
            j0Var2.g(P);
        }
        List list = this.c;
        this.K = new j0[list.size()];
        while (i11 < this.K.length) {
            j0 O1 = this.I.O1(i12, 3);
            O1.g((u) list.get(i11));
            this.K[i11] = O1;
            i11++;
            i12++;
        }
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((g) sparseArray.valueAt(i7)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j10;
        this.m.clear();
        h();
    }

    @Override // f3.o
    public final List e() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0674, code lost:
    
        throw e2.t0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x00ce, code lost:
    
        r5 = r2.a;
        r6 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x00db, code lost:
    
        if (r32.s != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x00df, code lost:
    
        if (r2.m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00e1, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00f0, code lost:
    
        r32.D = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x00fe, code lost:
    
        if (j$.util.Objects.equals(r9.s, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0102, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0104, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0117, code lost:
    
        r32.G = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x011f, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0121, code lost:
    
        r33.s(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x012a, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x012d, code lost:
    
        r3 = r6.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0131, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0133, code lost:
    
        r3.O(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0136, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x013a, code lost:
    
        if (r6.k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0140, code lost:
    
        if (r6.l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0142, code lost:
    
        r3.O(r3.H() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x014e, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0150, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0153, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x015f, code lost:
    
        if (r2.d.a.h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0161, code lost:
    
        r32.D -= 8;
        r33.s(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.s) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x017c, code lost:
    
        r32.E = r2.d(r32.D, 7);
        f3.b.f(r32.D, r8);
        r5.b(7, r8);
        r32.E += 7;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x019f, code lost:
    
        r32.D += r32.E;
        r32.s = 4;
        r32.F = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0195, code lost:
    
        r8 = 0;
        r32.E = r2.d(r32.D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0107, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0110, code lost:
    
        if (j$.util.Objects.equals(r9.s, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0114, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x00ea, code lost:
    
        r9 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01aa, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01b0, code lost:
    
        if (r2.m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01b2, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01b8, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01c1, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01c3, code lost:
    
        r12 = r14.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01c7, code lost:
    
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01cb, code lost:
    
        if (r4 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01cd, code lost:
    
        r9 = r32.f;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01df, code lost:
    
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01e5, code lost:
    
        if (r32.E >= r32.D) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01e7, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01e9, code lost:
    
        if (r2 != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01ee, code lost:
    
        if (r32.K.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01f2, code lost:
    
        if (r32.G != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0209, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x020a, code lost:
    
        r33.readFully(r15, r6, r22 + r2);
        r9.N(0);
        r19 = r9.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0217, code lost:
    
        if (r19 < 0) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0219, code lost:
    
        r32.F = r19 - r2;
        r4 = r32.e;
        r26 = r6;
        r4.N(0);
        r5.b(4, r4);
        r32.E += 4;
        r32.D += r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0237, code lost:
    
        if (r32.K.length <= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0239, code lost:
    
        if (r2 <= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x023b, code lost:
    
        r4 = i2.o.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x023f, code lost:
    
        if (r4 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0246, code lost:
    
        switch(r4.hashCode()) {
            case -1662541442: goto L130;
            case 1331836730: goto L126;
            case 1331856911: goto L122;
            default: goto L121;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0249, code lost:
    
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0268, code lost:
    
        switch(r4) {
            case 0: goto L142;
            case 1: goto L139;
            case 2: goto L136;
            default: goto L145;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0277, code lost:
    
        if (((r15[5] & 248) >> 3) != 23) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0294, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0297, code lost:
    
        r32.H = r4;
        r5.b(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02a1, code lost:
    
        if (r2 <= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x02a5, code lost:
    
        if (r32.G != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x02ab, code lost:
    
        if (i2.o.f(r15, r2, r8) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02ad, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02b0, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x02b2, code lost:
    
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0282, code lost:
    
        if ((r15[4] & 31) != 6) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0292, code lost:
    
        if (((r15[4] & 126) >> 1) != 39) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0251, code lost:
    
        if (r4.equals("video/vvc") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0254, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x025b, code lost:
    
        if (r4.equals("video/avc") != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x025e, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0264, code lost:
    
        if (r4.equals("video/hevc") != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0267, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0296, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02bd, code lost:
    
        throw e2.t0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x01f4, code lost:
    
        r2 = i2.o.g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0204, code lost:
    
        if ((r22 + r2) > (r32.D - r32.E)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0206, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x02be, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x02c2, code lost:
    
        if (r32.H == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02c4, code lost:
    
        r4 = r32.g;
        r4.K(r2);
        r25 = r9;
        r33.readFully(r4.a, 0, r32.F);
        r5.b(r32.F, r4);
        r2 = r32.F;
        r2 = i2.o.p(r4.c, r4.a);
        r4.N(0);
        r4.M(r2);
        r2 = r8.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02ed, code lost:
    
        if (r2 != (-1)) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02f1, code lost:
    
        if (r7.a == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02f3, code lost:
    
        r7.C(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02fe, code lost:
    
        r7.a(r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0308, code lost:
    
        if ((r17.a() & 4) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x030a, code lost:
    
        r7.r(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x030d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0318, code lost:
    
        r32.E += r2;
        r32.F -= r2;
        r4 = r22;
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x02f9, code lost:
    
        if (r7.a == r2) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02fb, code lost:
    
        r7.C(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0310, code lost:
    
        r25 = r9;
        r2 = r5.e(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x033b, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0341, code lost:
    
        if (r32.G != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0343, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0346, code lost:
    
        r28 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x034c, code lost:
    
        if (r1 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x034e, code lost:
    
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0355, code lost:
    
        r26 = r12;
        r5.c(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0366, code lost:
    
        if (r3.isEmpty() != false) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0368, code lost:
    
        r1 = (z3.f) r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0379, code lost:
    
        if (r1.b == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x037b, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x037d, code lost:
    
        if (r14 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x037f, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0383, code lost:
    
        r7 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0388, code lost:
    
        if (r5 >= r4) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x038a, code lost:
    
        r2[r5].c(r7, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x039c, code lost:
    
        if (r17.c() != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x039e, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x03a1, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x03a6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0353, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0327, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0329, code lost:
    
        r2 = r32.E;
        r4 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x032d, code lost:
    
        if (r2 >= r4) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x032f, code lost:
    
        r32.E += r5.e(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x01ba, code lost:
    
        r15 = r6.i[r2.f];
     */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(f3.p pVar, f3.s sVar) {
        char c10;
        boolean z9;
        int i7;
        int i10;
        String v;
        String v10;
        long j3;
        long j10;
        long a02;
        long C;
        int i11;
        while (true) {
            int i12 = this.s;
            ArrayDeque arrayDeque = this.m;
            h2.c cVar = this.o;
            x xVar = this.i;
            aa.n nVar = this.q;
            SparseArray sparseArray = this.d;
            boolean z10 = true;
            if (i12 != 0) {
                ArrayDeque arrayDeque2 = this.n;
                int i13 = this.b;
                k0 k0Var = this.j;
                if (i12 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i12 != 2) {
                        g gVar = this.C;
                        if (gVar != null) {
                            c10 = 2;
                            z9 = true;
                            i7 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c10 = 2;
                        int i14 = 0;
                        g gVar2 = null;
                        while (i14 < size) {
                            g gVar3 = (g) sparseArray.valueAt(i14);
                            boolean z11 = z10;
                            boolean z12 = gVar3.m;
                            s sVar2 = gVar3.b;
                            if (z12) {
                                i10 = size;
                            } else {
                                i10 = size;
                                if (gVar3.f == gVar3.d.b) {
                                    i14++;
                                    z10 = z11;
                                    size = i10;
                                }
                            }
                            if (!z12 || gVar3.h != sVar2.d) {
                                long j12 = !z12 ? gVar3.d.c[gVar3.f] : sVar2.f[gVar3.h];
                                if (j12 < j11) {
                                    gVar2 = gVar3;
                                    j11 = j12;
                                }
                            }
                            i14++;
                            z10 = z11;
                            size = i10;
                        }
                        z9 = z10;
                        i7 = 8;
                        if (gVar2 == null) {
                            int position = (int) (this.x - pVar.getPosition());
                            if (position < 0) {
                                throw t0.a(null, "Offset to end of mdat was negative.");
                            }
                            pVar.s(position);
                            h();
                        } else {
                            int position2 = (int) ((!gVar2.m ? gVar2.d.c[gVar2.f] : gVar2.b.f[gVar2.h]) - pVar.getPosition());
                            if (position2 < 0) {
                                h2.a.l("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            pVar.s(position2);
                            this.C = gVar2;
                            gVar = gVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        g gVar4 = null;
                        for (int i15 = 0; i15 < size2; i15++) {
                            s sVar3 = ((g) sparseArray.valueAt(i15)).b;
                            if (sVar3.o) {
                                long j13 = sVar3.c;
                                if (j13 < j11) {
                                    gVar4 = (g) sparseArray.valueAt(i15);
                                    j11 = j13;
                                }
                            }
                        }
                        if (gVar4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j11 - pVar.getPosition());
                            if (position3 < 0) {
                                throw t0.a(null, "Offset to encryption data was negative.");
                            }
                            pVar.s(position3);
                            s sVar4 = gVar4.b;
                            x xVar2 = sVar4.n;
                            pVar.readFully(xVar2.a, 0, xVar2.c);
                            xVar2.N(0);
                            sVar4.o = false;
                        }
                    }
                } else {
                    int i16 = (int) (this.u - this.v);
                    x xVar3 = this.w;
                    if (xVar3 != null) {
                        pVar.readFully(xVar3.a, 8, i16);
                        int i17 = this.t;
                        i2.d dVar = new i2.d(i17, xVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((i2.c) arrayDeque.peek()).d.add(dVar);
                        } else if (i17 == 1936286840) {
                            Pair k10 = k(pVar.getPosition(), xVar3);
                            nVar.a((f3.j) k10.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) nVar.b;
                            this.B = ((Long) k10.first).longValue();
                            if (this.M) {
                                i11 = 1;
                            } else {
                                i11 = 1;
                                this.I.f(linkedHashMap.size() == 1 ? (c0) k10.second : nVar.m());
                                this.L = true;
                            }
                            if ((i13 & 256) != 0 && !this.M && linkedHashMap.size() > i11) {
                                this.N = pVar.getPosition();
                            }
                        } else if (i17 == 1701671783 && this.J.length != 0) {
                            xVar3.N(8);
                            int e10 = c.e(xVar3.m());
                            long j14 = -9223372036854775807L;
                            if (e10 == 0) {
                                v = xVar3.v();
                                v.getClass();
                                v10 = xVar3.v();
                                v10.getClass();
                                long C2 = xVar3.C();
                                long C3 = xVar3.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a03 = m0.a0(C3, 1000000L, C2, roundingMode);
                                long j15 = this.B;
                                long j16 = j15 != -9223372036854775807L ? j15 + a03 : -9223372036854775807L;
                                j3 = a03;
                                j10 = j16;
                                a02 = m0.a0(xVar3.C(), 1000L, C2, roundingMode);
                                C = xVar3.C();
                            } else if (e10 != 1) {
                                com.google.android.recaptcha.internal.a.o(e10, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long C4 = xVar3.C();
                                long G = xVar3.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j10 = m0.a0(G, 1000000L, C4, roundingMode2);
                                long a04 = m0.a0(xVar3.C(), 1000L, C4, roundingMode2);
                                long C5 = xVar3.C();
                                v = xVar3.v();
                                v.getClass();
                                v10 = xVar3.v();
                                v10.getClass();
                                a02 = a04;
                                C = C5;
                                j3 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v10;
                            byte[] bArr = new byte[xVar3.a()];
                            xVar3.k(0, xVar3.a(), bArr);
                            x xVar4 = new x(this.k.B(new q3.a(str, str2, a02, C, bArr)));
                            int a10 = xVar4.a();
                            j0[] j0VarArr = this.J;
                            int length = j0VarArr.length;
                            int i18 = 0;
                            while (i18 < length) {
                                j0 j0Var = j0VarArr[i18];
                                xVar4.N(0);
                                j0Var.b(a10, xVar4);
                                i18++;
                                j14 = j14;
                            }
                            if (j10 == j14) {
                                arrayDeque2.addLast(new f(a10, j3, true));
                                this.y += a10;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new f(a10, j10, false));
                                this.y += a10;
                            } else if (k0Var == null || k0Var.f()) {
                                if (k0Var != null) {
                                    j10 = k0Var.a(j10);
                                }
                                long j17 = j10;
                                for (j0 j0Var2 : this.J) {
                                    j0Var2.c(j17, 1, a10, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new f(a10, j10, false));
                                this.y += a10;
                            }
                        }
                    } else {
                        pVar.s(i16);
                    }
                    l(pVar.getPosition());
                }
            } else {
                int i19 = this.v;
                x xVar5 = this.l;
                if (i19 == 0) {
                    if (!pVar.c(xVar5.a, 0, 8, true)) {
                        long j18 = this.N;
                        if (j18 == -1) {
                            cVar.r(0);
                            return -1;
                        }
                        sVar.a = j18;
                        this.N = -1L;
                        this.I.f(nVar.m());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    xVar5.N(0);
                    this.u = xVar5.C();
                    this.t = xVar5.m();
                }
                long j19 = this.u;
                if (j19 == 1) {
                    pVar.readFully(xVar5.a, 8, 8);
                    this.v += 8;
                    this.u = xVar5.G();
                } else if (j19 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((i2.c) arrayDeque.peek()).c;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - pVar.getPosition()) + this.v;
                    }
                }
                long j20 = this.u;
                int i20 = this.v;
                long j21 = i20;
                if (j20 < j21) {
                    if (this.t != 1718773093 || i20 != 8) {
                        break;
                    }
                    this.u = j21;
                }
                if (this.N != -1) {
                    if (this.t == 1936286840) {
                        xVar.K((int) this.u);
                        System.arraycopy(xVar5.a, 0, xVar.a, 0, 8);
                        pVar.readFully(xVar.a, 8, (int) (this.u - this.v));
                        nVar.a((f3.j) k(pVar.l(), xVar).second);
                    } else {
                        pVar.j((int) (this.u - j21), true);
                    }
                    h();
                } else {
                    long position4 = pVar.getPosition() - this.v;
                    int i21 = this.t;
                    if ((i21 == 1836019558 || i21 == 1835295092) && !this.L) {
                        this.I.f(new f3.t(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            s sVar5 = ((g) sparseArray.valueAt(i22)).b;
                            sVar5.getClass();
                            sVar5.c = position4;
                            sVar5.b = position4;
                        }
                    }
                    int i23 = this.t;
                    if (i23 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i23 == 1836019574 || i23 == 1953653099 || i23 == 1835297121 || i23 == 1835626086 || i23 == 1937007212 || i23 == 1836019558 || i23 == 1953653094 || i23 == 1836475768 || i23 == 1701082227 || i23 == 1835365473) {
                        long position5 = pVar.getPosition();
                        long j22 = this.u;
                        long j23 = (position5 + j22) - 8;
                        if (j22 != this.v && this.t == 1835365473) {
                            xVar.K(8);
                            pVar.b(0, 8, xVar.a);
                            c.a(xVar);
                            pVar.s(xVar.b);
                            pVar.q();
                        }
                        arrayDeque.push(new i2.c(this.t, j23));
                        if (this.u == this.v) {
                            l(j23);
                        } else {
                            h();
                        }
                    } else if (i23 == 1751411826 || i23 == 1835296868 || i23 == 1836476516 || i23 == 1936286840 || i23 == 1937011556 || i23 == 1937011827 || i23 == 1668576371 || i23 == 1937011555 || i23 == 1937011578 || i23 == 1937013298 || i23 == 1937007471 || i23 == 1668232756 || i23 == 1937011571 || i23 == 1952867444 || i23 == 1952868452 || i23 == 1953196132 || i23 == 1953654136 || i23 == 1953658222 || i23 == 1886614376 || i23 == 1935763834 || i23 == 1935763823 || i23 == 1936027235 || i23 == 1970628964 || i23 == 1935828848 || i23 == 1936158820 || i23 == 1701606260 || i23 == 1835362404 || i23 == 1701671783 || i23 == 1969517665 || i23 == 1801812339 || i23 == 1768715124) {
                        if (this.v != 8) {
                            throw t0.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw t0.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        x xVar6 = new x((int) this.u);
                        System.arraycopy(xVar5.a, 0, xVar6.a, 0, 8);
                        this.w = xVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw t0.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.w = null;
                        this.s = 1;
                    }
                }
            }
        }
    }

    public final void h() {
        this.s = 0;
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x0808, code lost:
    
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x080b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x042a, code lost:
    
        if ((h2.m0.a0(r39, 1000000, r7, r45) + h2.m0.a0(r8[0], 1000000, r4.c, r45)) >= r4.e) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0724  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j3) {
        q0 q0Var;
        ArrayList arrayList;
        q0 q0Var2;
        d dVar;
        int i7;
        d dVar2;
        ArrayList arrayList2;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i11;
        int i12;
        ArrayList arrayList5;
        int i13;
        g gVar;
        int i14;
        int size;
        int i15;
        byte[] bArr;
        int i16;
        boolean z9;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList6;
        int i20;
        x xVar;
        int i21;
        int i22;
        int i23;
        d dVar3;
        int i24;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((i2.c) arrayDeque.peek()).c != j3) {
                break;
            }
            i2.c cVar = (i2.c) arrayDeque.pop();
            int i25 = cVar.b;
            ArrayList arrayList7 = cVar.e;
            ArrayList arrayList8 = cVar.d;
            int i26 = 12;
            int i27 = this.b;
            int i28 = 0;
            SparseArray sparseArray = this.d;
            if (i25 == 1836019574) {
                e2.r i29 = i(arrayList8);
                i2.c d = cVar.d(1836475768);
                d.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList9 = d.d;
                int size2 = arrayList9.size();
                int i30 = 0;
                long j10 = -9223372036854775807L;
                while (i30 < size2) {
                    i2.d dVar4 = (i2.d) arrayList9.get(i30);
                    int i31 = dVar4.b;
                    x xVar2 = dVar4.c;
                    if (i31 == 1953654136) {
                        xVar2.N(i26);
                        arrayList2 = arrayList9;
                        Pair create = Pair.create(Integer.valueOf(xVar2.m()), new d(xVar2.m() - 1, xVar2.m(), xVar2.m(), xVar2.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (d) create.second);
                    } else {
                        arrayList2 = arrayList9;
                        if (i31 == 1835362404) {
                            xVar2.N(8);
                            j10 = c.e(xVar2.m()) == 0 ? xVar2.C() : xVar2.G();
                        }
                    }
                    i30++;
                    arrayList9 = arrayList2;
                    i26 = 12;
                }
                i2.c d2 = cVar.d(1835365473);
                q0 f10 = d2 != null ? c.f(d2) : null;
                w wVar = new w();
                i2.d e10 = cVar.e(1969517665);
                if (e10 != null) {
                    q0 j11 = c.j(e10);
                    wVar.b(j11);
                    q0Var = j11;
                } else {
                    q0Var = null;
                }
                i2.d e11 = cVar.e(1836476516);
                e11.getClass();
                q0 q0Var3 = new q0(c.g(e11.c));
                ArrayList i32 = c.i(cVar, wVar, j10, i29, (i27 & 16) != 0, false, new e(this), false);
                int size3 = i32.size();
                if (sparseArray.size() == 0) {
                    String b10 = p.b(i32);
                    int i33 = 0;
                    while (i33 < size3) {
                        t tVar = (t) i32.get(i33);
                        q qVar = tVar.a;
                        f3.q qVar2 = this.I;
                        int i34 = qVar.b;
                        int i35 = qVar.a;
                        u uVar = qVar.g;
                        int i36 = size3;
                        String str = b10;
                        long j12 = qVar.e;
                        j0 O1 = qVar2.O1(i33, i34);
                        O1.d(j12);
                        e2.t a10 = uVar.a();
                        int i37 = i33;
                        a10.q = s0.n(str);
                        if (i34 == 1) {
                            int i38 = wVar.a;
                            q0Var2 = q0Var3;
                            arrayList = i32;
                            if (i38 != -1 && (i7 = wVar.b) != -1) {
                                a10.M = i38;
                                a10.N = i7;
                            }
                        } else {
                            arrayList = i32;
                            q0Var2 = q0Var3;
                        }
                        q0 q0Var4 = uVar.l;
                        q0[] q0VarArr = new q0[2];
                        q0VarArr[i28] = q0Var;
                        q0VarArr[1] = q0Var2;
                        p.l(i34, f10, a10, q0Var4, q0VarArr);
                        if (sparseArray2.size() == 1) {
                            dVar = (d) sparseArray2.valueAt(i28);
                        } else {
                            dVar = (d) sparseArray2.get(i35);
                            dVar.getClass();
                        }
                        sparseArray.put(i35, new g(O1, tVar, dVar, new u(a10)));
                        this.A = Math.max(this.A, j12);
                        i33 = i37 + 1;
                        size3 = i36;
                        b10 = str;
                        q0Var3 = q0Var2;
                        i32 = arrayList;
                        i28 = 0;
                    }
                    this.I.U0();
                } else {
                    ArrayList arrayList10 = i32;
                    ia.p(sparseArray.size() == size3);
                    int i39 = 0;
                    while (i39 < size3) {
                        ArrayList arrayList11 = arrayList10;
                        t tVar2 = (t) arrayList11.get(i39);
                        q qVar3 = tVar2.a;
                        g gVar2 = (g) sparseArray.get(qVar3.a);
                        int i40 = qVar3.a;
                        if (sparseArray2.size() == 1) {
                            dVar2 = (d) sparseArray2.valueAt(0);
                        } else {
                            dVar2 = (d) sparseArray2.get(i40);
                            dVar2.getClass();
                        }
                        gVar2.d = tVar2;
                        gVar2.e = dVar2;
                        gVar2.a.g(gVar2.j);
                        gVar2.e();
                        i39++;
                        arrayList10 = arrayList11;
                    }
                }
            } else if (i25 == 1836019558) {
                int size4 = arrayList7.size();
                int i41 = 0;
                while (i41 < size4) {
                    i2.c cVar2 = (i2.c) arrayList7.get(i41);
                    if (cVar2.b == 1953653094) {
                        i2.d e12 = cVar2.e(1952868452);
                        ArrayList arrayList12 = cVar2.d;
                        e12.getClass();
                        x xVar3 = e12.c;
                        xVar3.N(8);
                        int m10 = xVar3.m();
                        byte[] bArr2 = c.a;
                        g gVar3 = (g) sparseArray.get(xVar3.m());
                        if (gVar3 == null) {
                            i10 = size4;
                            arrayList5 = arrayList7;
                            gVar = null;
                        } else {
                            s sVar = gVar3.b;
                            if ((m10 & 1) != 0) {
                                arrayList5 = arrayList7;
                                long G = xVar3.G();
                                sVar.b = G;
                                sVar.c = G;
                            } else {
                                arrayList5 = arrayList7;
                            }
                            d dVar5 = gVar3.e;
                            int m11 = (m10 & 2) != 0 ? xVar3.m() - 1 : dVar5.a;
                            int m12 = (m10 & 8) != 0 ? xVar3.m() : dVar5.b;
                            if ((m10 & 16) != 0) {
                                i10 = size4;
                                i13 = xVar3.m();
                            } else {
                                i10 = size4;
                                i13 = dVar5.c;
                            }
                            sVar.a = new d(m11, m12, i13, (m10 & 32) != 0 ? xVar3.m() : dVar5.d);
                            gVar = gVar3;
                        }
                        if (gVar == null) {
                            arrayList4 = arrayList8;
                            i11 = i41;
                            arrayList3 = arrayList5;
                            i12 = i27;
                        } else {
                            s sVar2 = gVar.b;
                            long j13 = sVar2.p;
                            boolean z10 = sVar2.q;
                            gVar.e();
                            gVar.m = true;
                            i2.d e13 = cVar2.e(1952867444);
                            if (e13 == null || (i27 & 2) != 0) {
                                sVar2.p = j13;
                                sVar2.q = z10;
                            } else {
                                x xVar4 = e13.c;
                                xVar4.N(8);
                                sVar2.p = c.e(xVar4.m()) == 1 ? xVar4.G() : xVar4.C();
                                sVar2.q = true;
                            }
                            int size5 = arrayList12.size();
                            int i42 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i42 >= size5) {
                                    break;
                                }
                                i2.d dVar6 = (i2.d) arrayList12.get(i42);
                                ArrayList arrayList13 = arrayList8;
                                if (dVar6.b == 1953658222) {
                                    x xVar5 = dVar6.c;
                                    xVar5.N(12);
                                    int E = xVar5.E();
                                    if (E > 0) {
                                        i44 += E;
                                        i43++;
                                    }
                                }
                                i42++;
                                arrayList8 = arrayList13;
                            }
                            arrayList4 = arrayList8;
                            gVar.h = 0;
                            gVar.g = 0;
                            gVar.f = 0;
                            sVar2.d = i43;
                            sVar2.e = i44;
                            if (sVar2.g.length < i43) {
                                sVar2.f = new long[i43];
                                sVar2.g = new int[i43];
                            }
                            if (sVar2.h.length < i44) {
                                int i45 = (i44 * qs.J1) / 100;
                                sVar2.h = new int[i45];
                                sVar2.i = new long[i45];
                                sVar2.j = new boolean[i45];
                                sVar2.l = new boolean[i45];
                            }
                            int i46 = 0;
                            int i47 = 0;
                            int i48 = 0;
                            while (true) {
                                long j14 = 0;
                                if (i46 < size5) {
                                    i2.d dVar7 = (i2.d) arrayList12.get(i46);
                                    if (dVar7.b == i14) {
                                        int i49 = i47 + 1;
                                        x xVar6 = dVar7.c;
                                        xVar6.N(8);
                                        int m13 = xVar6.m();
                                        byte[] bArr3 = c.a;
                                        i17 = size5;
                                        q qVar4 = gVar.d.a;
                                        i18 = i46;
                                        d dVar8 = sVar2.a;
                                        String str2 = m0.a;
                                        i19 = i41;
                                        sVar2.g[i47] = xVar6.E();
                                        long[] jArr = sVar2.f;
                                        int i50 = i47;
                                        long j15 = sVar2.b;
                                        jArr[i50] = j15;
                                        if ((m13 & 1) != 0) {
                                            jArr[i50] = j15 + xVar6.m();
                                        }
                                        boolean z11 = (m13 & 4) != 0;
                                        int i51 = dVar8.d;
                                        if (z11) {
                                            i51 = xVar6.m();
                                        }
                                        boolean z12 = z11;
                                        boolean z13 = (m13 & 256) != 0;
                                        boolean z14 = (m13 & 512) != 0;
                                        boolean z15 = (m13 & 1024) != 0;
                                        boolean z16 = (m13 & 2048) != 0;
                                        boolean z17 = z15;
                                        long[] jArr2 = qVar4.i;
                                        int i52 = i51;
                                        long[] jArr3 = qVar4.j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j16 = jArr2[0];
                                            if (j16 != 0) {
                                                long j17 = qVar4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j14 = jArr3[0];
                                        }
                                        int[] iArr = sVar2.h;
                                        long[] jArr4 = sVar2.i;
                                        boolean[] zArr = sVar2.j;
                                        boolean z18 = qVar4.b == 2 && (i27 & 1) != 0;
                                        int i53 = sVar2.g[i50] + i48;
                                        int i54 = i48;
                                        arrayList6 = arrayList5;
                                        long j18 = qVar4.c;
                                        x xVar7 = xVar6;
                                        long j19 = sVar2.p;
                                        int i55 = i54;
                                        while (i55 < i53) {
                                            if (z13) {
                                                xVar = xVar7;
                                                i21 = xVar7.m();
                                            } else {
                                                xVar = xVar7;
                                                i21 = dVar8.b;
                                            }
                                            boolean z19 = z18;
                                            if (i21 < 0) {
                                                throw t0.a(null, "Unexpected negative value: " + i21);
                                            }
                                            if (z14) {
                                                i22 = i53;
                                                i23 = xVar.m();
                                            } else {
                                                i22 = i53;
                                                i23 = dVar8.c;
                                            }
                                            if (i23 < 0) {
                                                throw t0.a(null, "Unexpected negative value: " + i23);
                                            }
                                            int m14 = z17 ? xVar.m() : (i55 == 0 && z12) ? i52 : dVar8.d;
                                            if (z16) {
                                                dVar3 = dVar8;
                                                i24 = xVar.m();
                                            } else {
                                                dVar3 = dVar8;
                                                i24 = 0;
                                            }
                                            int i56 = i49;
                                            int i57 = i27;
                                            long a02 = m0.a0((i24 + j19) - j14, 1000000L, j18, RoundingMode.DOWN);
                                            jArr4[i55] = a02;
                                            if (!sVar2.q) {
                                                jArr4[i55] = a02 + gVar.d.i;
                                            }
                                            iArr[i55] = i23;
                                            zArr[i55] = ((m14 >> 16) & 1) == 0 && (!z19 || i55 == 0);
                                            j19 += i21;
                                            i55++;
                                            xVar7 = xVar;
                                            z18 = z19;
                                            i53 = i22;
                                            dVar8 = dVar3;
                                            i27 = i57;
                                            i49 = i56;
                                        }
                                        i20 = i27;
                                        sVar2.p = j19;
                                        i48 = i53;
                                        i47 = i49;
                                    } else {
                                        i17 = size5;
                                        i18 = i46;
                                        i19 = i41;
                                        arrayList6 = arrayList5;
                                        i20 = i27;
                                    }
                                    i46 = i18 + 1;
                                    size5 = i17;
                                    i41 = i19;
                                    arrayList5 = arrayList6;
                                    i27 = i20;
                                    i14 = 1953658222;
                                } else {
                                    i11 = i41;
                                    arrayList3 = arrayList5;
                                    i12 = i27;
                                    q qVar5 = gVar.d.a;
                                    d dVar9 = sVar2.a;
                                    dVar9.getClass();
                                    r rVar = qVar5.l[dVar9.a];
                                    i2.d e14 = cVar2.e(1935763834);
                                    if (e14 != null) {
                                        rVar.getClass();
                                        x xVar8 = e14.c;
                                        int i58 = rVar.d;
                                        xVar8.N(8);
                                        int m15 = xVar8.m();
                                        byte[] bArr4 = c.a;
                                        if ((m15 & 1) == 1) {
                                            xVar8.O(8);
                                        }
                                        int A = xVar8.A();
                                        int E2 = xVar8.E();
                                        if (E2 > sVar2.e) {
                                            StringBuilder n10 = jg.g.n(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            n10.append(sVar2.e);
                                            throw t0.a(null, n10.toString());
                                        }
                                        if (A == 0) {
                                            boolean[] zArr2 = sVar2.l;
                                            i16 = 0;
                                            for (int i59 = 0; i59 < E2; i59++) {
                                                int A2 = xVar8.A();
                                                i16 += A2;
                                                zArr2[i59] = A2 > i58;
                                            }
                                            z9 = false;
                                        } else {
                                            boolean z20 = A > i58;
                                            i16 = A * E2;
                                            z9 = false;
                                            Arrays.fill(sVar2.l, 0, E2, z20);
                                        }
                                        Arrays.fill(sVar2.l, E2, sVar2.e, z9);
                                        if (i16 > 0) {
                                            sVar2.n.K(i16);
                                            sVar2.k = true;
                                            sVar2.o = true;
                                        }
                                    }
                                    i2.d e15 = cVar2.e(1935763823);
                                    if (e15 != null) {
                                        x xVar9 = e15.c;
                                        xVar9.N(8);
                                        int m16 = xVar9.m();
                                        byte[] bArr5 = c.a;
                                        if ((m16 & 1) == 1) {
                                            xVar9.O(8);
                                        }
                                        int E3 = xVar9.E();
                                        if (E3 != 1) {
                                            throw t0.a(null, "Unexpected saio entry count: " + E3);
                                        }
                                        sVar2.c += c.e(m16) == 0 ? xVar9.C() : xVar9.G();
                                    }
                                    i2.d e16 = cVar2.e(1936027235);
                                    if (e16 != null) {
                                        j(e16.c, 0, sVar2);
                                    }
                                    String str3 = rVar != null ? rVar.b : null;
                                    x xVar10 = null;
                                    x xVar11 = null;
                                    for (int i60 = 0; i60 < arrayList12.size(); i60++) {
                                        i2.d dVar10 = (i2.d) arrayList12.get(i60);
                                        x xVar12 = dVar10.c;
                                        int i61 = dVar10.b;
                                        if (i61 == 1935828848) {
                                            xVar12.N(12);
                                            if (xVar12.m() == 1936025959) {
                                                xVar10 = xVar12;
                                            }
                                        } else if (i61 == 1936158820) {
                                            xVar12.N(12);
                                            if (xVar12.m() == 1936025959) {
                                                xVar11 = xVar12;
                                            }
                                        }
                                    }
                                    if (xVar10 != null && xVar11 != null) {
                                        xVar10.N(8);
                                        int e17 = c.e(xVar10.m());
                                        xVar10.O(4);
                                        if (e17 == 1) {
                                            xVar10.O(4);
                                        }
                                        if (xVar10.m() != 1) {
                                            throw t0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        xVar11.N(8);
                                        int e18 = c.e(xVar11.m());
                                        xVar11.O(4);
                                        if (e18 == 1) {
                                            if (xVar11.C() == 0) {
                                                throw t0.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e18 >= 2) {
                                            xVar11.O(4);
                                        }
                                        if (xVar11.C() != 1) {
                                            throw t0.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        xVar11.O(1);
                                        int A3 = xVar11.A();
                                        int i62 = (A3 & qs.P3) >> 4;
                                        int i63 = A3 & 15;
                                        boolean z21 = xVar11.A() == 1;
                                        if (z21) {
                                            int A4 = xVar11.A();
                                            byte[] bArr6 = new byte[16];
                                            xVar11.k(0, 16, bArr6);
                                            if (A4 == 0) {
                                                int A5 = xVar11.A();
                                                byte[] bArr7 = new byte[A5];
                                                xVar11.k(0, A5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            sVar2.k = true;
                                            sVar2.m = new r(z21, str3, A4, bArr6, i62, i63, bArr);
                                            size = arrayList12.size();
                                            for (i15 = 0; i15 < size; i15++) {
                                                i2.d dVar11 = (i2.d) arrayList12.get(i15);
                                                if (dVar11.b == 1970628964) {
                                                    x xVar13 = dVar11.c;
                                                    xVar13.N(8);
                                                    byte[] bArr8 = this.h;
                                                    xVar13.k(0, 16, bArr8);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        j(xVar13, 16, sVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList12.size();
                                    while (i15 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i10 = size4;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        i11 = i41;
                        i12 = i27;
                    }
                    i41 = i11 + 1;
                    size4 = i10;
                    arrayList8 = arrayList4;
                    arrayList7 = arrayList3;
                    i27 = i12;
                }
                e2.r i64 = i(arrayList8);
                if (i64 != null) {
                    int size6 = sparseArray.size();
                    for (int i65 = 0; i65 < size6; i65++) {
                        g gVar4 = (g) sparseArray.valueAt(i65);
                        q qVar6 = gVar4.d.a;
                        d dVar12 = gVar4.b.a;
                        String str4 = m0.a;
                        r rVar2 = qVar6.l[dVar12.a];
                        e2.r a11 = i64.a(rVar2 != null ? rVar2.b : null);
                        e2.t a12 = gVar4.j.a();
                        a12.v = a11;
                        gVar4.a.g(new u(a12));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i66 = 0; i66 < size7; i66++) {
                        g gVar5 = (g) sparseArray.valueAt(i66);
                        long j20 = this.z;
                        int i67 = gVar5.f;
                        while (true) {
                            s sVar3 = gVar5.b;
                            if (i67 < sVar3.e && sVar3.i[i67] <= j20) {
                                if (sVar3.j[i67]) {
                                    gVar5.i = i67;
                                }
                                i67++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((i2.c) arrayDeque.peek()).e.add(cVar);
            }
        }
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
