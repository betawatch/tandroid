package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.u0;
import b2.v0;
import b2.w;
import b2.w0;
import b2.x;
import c3.b0;
import c3.f0;
import c3.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements c3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final x P;
    public long A;
    public long B;
    public g C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public c3.q I;
    public k0[] J;
    public k0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final z3.k a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final e2.x i;
    public final e2.k0 j;
    public final e2.c o;
    public final k0 p;
    public final za.c q;
    public x1 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public e2.x w;
    public long x;
    public int y;
    public long z;
    public final m5.e k = new m5.e(2);
    public final e2.x l = new e2.x(16);
    public final e2.x e = new e2.x(f2.q.a);
    public final e2.x f = new e2.x(6);
    public final e2.x g = new e2.x();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        w wVar = new w();
        wVar.r = v0.n("application/x-emsg");
        P = new x(wVar);
    }

    public h(z3.k kVar, int i10, e2.k0 k0Var, List list, l2.o oVar) {
        this.a = kVar;
        this.b = i10;
        this.j = k0Var;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new e2.x(bArr);
        l0 l0Var = n0.b;
        this.r = x1.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.i;
        this.J = new k0[0];
        this.K = new k0[0];
        this.o = new e2.c(new e(this));
        this.q = new za.c(11);
        this.N = -1L;
    }

    public static int g(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    public static b2.t i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.e eVar = (f2.e) list.get(i10);
            if (eVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.c.a;
                j6.m i11 = p.i(bArr);
                UUID uuid = i11 == null ? null : (UUID) i11.b;
                if (uuid == null) {
                    e2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new b2.s(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new b2.t(null, false, (b2.s[]) arrayList.toArray(new b2.s[0]));
    }

    public static void j(e2.x xVar, int i10, s sVar) {
        xVar.N(i10 + 8);
        int m10 = xVar.m();
        byte[] bArr = c.a;
        if ((m10 & 1) != 0) {
            throw w0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (m10 & 2) != 0;
        int E = xVar.E();
        if (E == 0) {
            Arrays.fill(sVar.l, 0, sVar.e, false);
            return;
        }
        int i11 = sVar.e;
        e2.x xVar2 = sVar.n;
        if (E != i11) {
            StringBuilder l4 = i0.a.l(E, "Senc sample count ", " is different from fragment sample count");
            l4.append(sVar.e);
            throw w0.a(null, l4.toString());
        }
        Arrays.fill(sVar.l, 0, E, z10);
        xVar2.K(xVar.a());
        sVar.k = true;
        sVar.o = true;
        xVar.k(0, xVar2.c, xVar2.a);
        xVar2.N(0);
        sVar.o = false;
    }

    public static Pair k(long j10, e2.x xVar) {
        long G;
        long G2;
        e2.x xVar2 = xVar;
        xVar2.N(8);
        int e = c.e(xVar2.m());
        xVar2.O(4);
        long C = xVar2.C();
        if (e == 0) {
            G = xVar2.C();
            G2 = xVar2.C();
        } else {
            G = xVar2.G();
            G2 = xVar2.G();
        }
        long j11 = G2 + j10;
        String str = e2.l0.a;
        long a02 = e2.l0.a0(G, 1000000L, C, RoundingMode.DOWN);
        xVar2.O(2);
        int H = xVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j12 = j11;
        long j13 = a02;
        int i10 = 0;
        while (i10 < H) {
            int m10 = xVar2.m();
            if ((Integer.MIN_VALUE & m10) != 0) {
                throw w0.a(null, "Unhandled indirect reference");
            }
            long C2 = xVar2.C();
            iArr[i10] = m10 & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long a03 = e2.l0.a0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i10] = a03 - jArr5[i10];
            xVar2.O(4);
            j12 += iArr[i10];
            i10++;
            H = H;
            xVar2 = xVar;
            j13 = a03;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(a02), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        x1 x1Var;
        f0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.b;
            x1Var = x1.e;
        }
        this.r = x1Var;
        return m10 == null;
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        int i10;
        int i11 = this.b;
        if ((i11 & 32) == 0) {
            qVar = new ac.a(qVar, this.a);
        }
        this.I = qVar;
        h();
        k0[] k0VarArr = new k0[2];
        this.J = k0VarArr;
        int i12 = 0;
        k0 k0Var = this.p;
        if (k0Var != null) {
            k0VarArr[0] = k0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            k0VarArr[i10] = this.I.I1(100, 5);
            i13 = 101;
            i10++;
        }
        k0[] k0VarArr2 = (k0[]) e2.l0.U(i10, this.J);
        this.J = k0VarArr2;
        for (k0 k0Var2 : k0VarArr2) {
            k0Var2.b(P);
        }
        List list = this.c;
        this.K = new k0[list.size()];
        while (i12 < this.K.length) {
            k0 I1 = this.I.I1(i13, 3);
            I1.b((x) list.get(i12));
            this.K[i12] = I1;
            i12++;
            i13++;
        }
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) sparseArray.valueAt(i10)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j11;
        this.m.clear();
        h();
    }

    @Override // c3.o
    public final List e() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0674, code lost:
    
        throw b2.w0.c("Atom size less than header length (unsupported).");
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
    
        r33.q(r32.D);
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
        r33.q(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.s) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x017c, code lost:
    
        r32.E = r2.d(r32.D, 7);
        c3.b.f(r32.D, r8);
        r5.d(7, r8);
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
        r5.d(4, r4);
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
    
        r4 = f2.q.d(r8);
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
        r5.d(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02a1, code lost:
    
        if (r2 <= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x02a5, code lost:
    
        if (r32.G != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x02ab, code lost:
    
        if (f2.q.f(r15, r2, r8) == false) goto L153;
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
    
        throw b2.w0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x01f4, code lost:
    
        r2 = f2.q.g(r8);
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
        r5.d(r32.F, r4);
        r2 = r32.F;
        r2 = f2.q.p(r4.c, r4.a);
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
    
        r7.p(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02fe, code lost:
    
        r7.a(r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0308, code lost:
    
        if ((r17.a() & 4) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x030a, code lost:
    
        r7.e(0);
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
    
        r7.p(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0310, code lost:
    
        r25 = r9;
        r2 = r5.a(r33, r2, false);
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
    
        r1 = (w3.f) r3.removeFirst();
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
    
        r32.E += r5.a(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x01ba, code lost:
    
        r15 = r6.i[r2.f];
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(c3.p pVar, c3.s sVar) {
        char c10;
        boolean z10;
        int i10;
        int i11;
        String v;
        String v10;
        long j10;
        long j11;
        long a02;
        long C;
        int i12;
        while (true) {
            int i13 = this.s;
            ArrayDeque arrayDeque = this.m;
            e2.c cVar = this.o;
            e2.x xVar = this.i;
            za.c cVar2 = this.q;
            SparseArray sparseArray = this.d;
            boolean z11 = true;
            if (i13 != 0) {
                ArrayDeque arrayDeque2 = this.n;
                int i14 = this.b;
                e2.k0 k0Var = this.j;
                if (i13 != 1) {
                    long j12 = Long.MAX_VALUE;
                    if (i13 != 2) {
                        g gVar = this.C;
                        if (gVar != null) {
                            c10 = 2;
                            z10 = true;
                            i10 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c10 = 2;
                        int i15 = 0;
                        g gVar2 = null;
                        while (i15 < size) {
                            g gVar3 = (g) sparseArray.valueAt(i15);
                            boolean z12 = z11;
                            boolean z13 = gVar3.m;
                            s sVar2 = gVar3.b;
                            if (z13) {
                                i11 = size;
                            } else {
                                i11 = size;
                                if (gVar3.f == gVar3.d.b) {
                                    i15++;
                                    z11 = z12;
                                    size = i11;
                                }
                            }
                            if (!z13 || gVar3.h != sVar2.d) {
                                long j13 = !z13 ? gVar3.d.c[gVar3.f] : sVar2.f[gVar3.h];
                                if (j13 < j12) {
                                    gVar2 = gVar3;
                                    j12 = j13;
                                }
                            }
                            i15++;
                            z11 = z12;
                            size = i11;
                        }
                        z10 = z11;
                        i10 = 8;
                        if (gVar2 == null) {
                            int position = (int) (this.x - pVar.getPosition());
                            if (position < 0) {
                                throw w0.a(null, "Offset to end of mdat was negative.");
                            }
                            pVar.q(position);
                            h();
                        } else {
                            int position2 = (int) ((!gVar2.m ? gVar2.d.c[gVar2.f] : gVar2.b.f[gVar2.h]) - pVar.getPosition());
                            if (position2 < 0) {
                                e2.a.l("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            pVar.q(position2);
                            this.C = gVar2;
                            gVar = gVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        g gVar4 = null;
                        for (int i16 = 0; i16 < size2; i16++) {
                            s sVar3 = ((g) sparseArray.valueAt(i16)).b;
                            if (sVar3.o) {
                                long j14 = sVar3.c;
                                if (j14 < j12) {
                                    gVar4 = (g) sparseArray.valueAt(i16);
                                    j12 = j14;
                                }
                            }
                        }
                        if (gVar4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j12 - pVar.getPosition());
                            if (position3 < 0) {
                                throw w0.a(null, "Offset to encryption data was negative.");
                            }
                            pVar.q(position3);
                            s sVar4 = gVar4.b;
                            e2.x xVar2 = sVar4.n;
                            pVar.readFully(xVar2.a, 0, xVar2.c);
                            xVar2.N(0);
                            sVar4.o = false;
                        }
                    }
                } else {
                    int i17 = (int) (this.u - this.v);
                    e2.x xVar3 = this.w;
                    if (xVar3 != null) {
                        pVar.readFully(xVar3.a, 8, i17);
                        int i18 = this.t;
                        f2.e eVar = new f2.e(i18, xVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((f2.d) arrayDeque.peek()).d.add(eVar);
                        } else if (i18 == 1936286840) {
                            Pair k10 = k(pVar.getPosition(), xVar3);
                            cVar2.h((c3.j) k10.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar2.b;
                            this.B = ((Long) k10.first).longValue();
                            if (this.M) {
                                i12 = 1;
                            } else {
                                i12 = 1;
                                this.I.G1(linkedHashMap.size() == 1 ? (b0) k10.second : cVar2.s());
                                this.L = true;
                            }
                            if ((i14 & 256) != 0 && !this.M && linkedHashMap.size() > i12) {
                                this.N = pVar.getPosition();
                            }
                        } else if (i18 == 1701671783 && this.J.length != 0) {
                            xVar3.N(8);
                            int e = c.e(xVar3.m());
                            long j15 = -9223372036854775807L;
                            if (e == 0) {
                                v = xVar3.v();
                                v.getClass();
                                v10 = xVar3.v();
                                v10.getClass();
                                long C2 = xVar3.C();
                                long C3 = xVar3.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a03 = e2.l0.a0(C3, 1000000L, C2, roundingMode);
                                long j16 = this.B;
                                long j17 = j16 != -9223372036854775807L ? j16 + a03 : -9223372036854775807L;
                                j10 = a03;
                                j11 = j17;
                                a02 = e2.l0.a0(xVar3.C(), 1000L, C2, roundingMode);
                                C = xVar3.C();
                            } else if (e != 1) {
                                a1.g.w(e, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long C4 = xVar3.C();
                                long G = xVar3.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j11 = e2.l0.a0(G, 1000000L, C4, roundingMode2);
                                long a04 = e2.l0.a0(xVar3.C(), 1000L, C4, roundingMode2);
                                long C5 = xVar3.C();
                                v = xVar3.v();
                                v.getClass();
                                v10 = xVar3.v();
                                v10.getClass();
                                a02 = a04;
                                C = C5;
                                j10 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v10;
                            byte[] bArr = new byte[xVar3.a()];
                            xVar3.k(0, xVar3.a(), bArr);
                            e2.x xVar4 = new e2.x(this.k.G(new n3.a(str, str2, a02, C, bArr)));
                            int a2 = xVar4.a();
                            k0[] k0VarArr = this.J;
                            int length = k0VarArr.length;
                            int i19 = 0;
                            while (i19 < length) {
                                k0 k0Var2 = k0VarArr[i19];
                                xVar4.N(0);
                                k0Var2.d(a2, xVar4);
                                i19++;
                                j15 = j15;
                            }
                            if (j11 == j15) {
                                arrayDeque2.addLast(new f(a2, j10, true));
                                this.y += a2;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new f(a2, j11, false));
                                this.y += a2;
                            } else if (k0Var == null || k0Var.f()) {
                                if (k0Var != null) {
                                    j11 = k0Var.a(j11);
                                }
                                long j18 = j11;
                                for (k0 k0Var3 : this.J) {
                                    k0Var3.c(j18, 1, a2, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new f(a2, j11, false));
                                this.y += a2;
                            }
                        }
                    } else {
                        pVar.q(i17);
                    }
                    l(pVar.getPosition());
                }
            } else {
                int i20 = this.v;
                e2.x xVar5 = this.l;
                if (i20 == 0) {
                    if (!pVar.d(xVar5.a, 0, 8, true)) {
                        long j19 = this.N;
                        if (j19 == -1) {
                            cVar.e(0);
                            return -1;
                        }
                        sVar.a = j19;
                        this.N = -1L;
                        this.I.G1(cVar2.s());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    xVar5.N(0);
                    this.u = xVar5.C();
                    this.t = xVar5.m();
                }
                long j20 = this.u;
                if (j20 == 1) {
                    pVar.readFully(xVar5.a, 8, 8);
                    this.v += 8;
                    this.u = xVar5.G();
                } else if (j20 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((f2.d) arrayDeque.peek()).c;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - pVar.getPosition()) + this.v;
                    }
                }
                long j21 = this.u;
                int i21 = this.v;
                long j22 = i21;
                if (j21 < j22) {
                    if (this.t != 1718773093 || i21 != 8) {
                        break;
                    }
                    this.u = j22;
                }
                if (this.N != -1) {
                    if (this.t == 1936286840) {
                        xVar.K((int) this.u);
                        System.arraycopy(xVar5.a, 0, xVar.a, 0, 8);
                        pVar.readFully(xVar.a, 8, (int) (this.u - this.v));
                        cVar2.h((c3.j) k(pVar.k(), xVar).second);
                    } else {
                        pVar.i((int) (this.u - j22), true);
                    }
                    h();
                } else {
                    long position4 = pVar.getPosition() - this.v;
                    int i22 = this.t;
                    if ((i22 == 1836019558 || i22 == 1835295092) && !this.L) {
                        this.I.G1(new c3.t(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            s sVar5 = ((g) sparseArray.valueAt(i23)).b;
                            sVar5.getClass();
                            sVar5.c = position4;
                            sVar5.b = position4;
                        }
                    }
                    int i24 = this.t;
                    if (i24 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1836019558 || i24 == 1953653094 || i24 == 1836475768 || i24 == 1701082227 || i24 == 1835365473) {
                        long position5 = pVar.getPosition();
                        long j23 = this.u;
                        long j24 = (position5 + j23) - 8;
                        if (j23 != this.v && this.t == 1835365473) {
                            xVar.K(8);
                            pVar.b(0, 8, xVar.a);
                            c.a(xVar);
                            pVar.q(xVar.b);
                            pVar.m();
                        }
                        arrayDeque.push(new f2.d(this.t, j24));
                        if (this.u == this.v) {
                            l(j24);
                        } else {
                            h();
                        }
                    } else if (i24 == 1751411826 || i24 == 1835296868 || i24 == 1836476516 || i24 == 1936286840 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1668576371 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1937011571 || i24 == 1952867444 || i24 == 1952868452 || i24 == 1953196132 || i24 == 1953654136 || i24 == 1953658222 || i24 == 1886614376 || i24 == 1935763834 || i24 == 1935763823 || i24 == 1936027235 || i24 == 1970628964 || i24 == 1935828848 || i24 == 1936158820 || i24 == 1701606260 || i24 == 1835362404 || i24 == 1701671783 || i24 == 1969517665 || i24 == 1801812339 || i24 == 1768715124) {
                        if (this.v != 8) {
                            throw w0.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw w0.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        e2.x xVar6 = new e2.x((int) this.u);
                        System.arraycopy(xVar5.a, 0, xVar6.a, 0, 8);
                        this.w = xVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw w0.c("Skipping atom with length > 2147483647 (unsupported).");
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
    
        if ((e2.l0.a0(r39, 1000000, r7, r45) + e2.l0.a0(r8[0], 1000000, r4.c, r45)) >= r4.e) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0724  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j10) {
        u0 u0Var;
        ArrayList arrayList;
        u0 u0Var2;
        d dVar;
        int i10;
        d dVar2;
        ArrayList arrayList2;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i12;
        int i13;
        ArrayList arrayList5;
        int i14;
        g gVar;
        int i15;
        int size;
        int i16;
        byte[] bArr;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList6;
        int i21;
        e2.x xVar;
        int i22;
        int i23;
        int i24;
        d dVar3;
        int i25;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((f2.d) arrayDeque.peek()).c != j10) {
                break;
            }
            f2.d dVar4 = (f2.d) arrayDeque.pop();
            int i26 = dVar4.b;
            ArrayList arrayList7 = dVar4.e;
            ArrayList arrayList8 = dVar4.d;
            int i27 = 12;
            int i28 = this.b;
            int i29 = 0;
            SparseArray sparseArray = this.d;
            if (i26 == 1836019574) {
                b2.t i30 = i(arrayList8);
                f2.d d = dVar4.d(1836475768);
                d.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList9 = d.d;
                int size2 = arrayList9.size();
                int i31 = 0;
                long j11 = -9223372036854775807L;
                while (i31 < size2) {
                    f2.e eVar = (f2.e) arrayList9.get(i31);
                    int i32 = eVar.b;
                    e2.x xVar2 = eVar.c;
                    if (i32 == 1953654136) {
                        xVar2.N(i27);
                        arrayList2 = arrayList9;
                        Pair create = Pair.create(Integer.valueOf(xVar2.m()), new d(xVar2.m() - 1, xVar2.m(), xVar2.m(), xVar2.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (d) create.second);
                    } else {
                        arrayList2 = arrayList9;
                        if (i32 == 1835362404) {
                            xVar2.N(8);
                            j11 = c.e(xVar2.m()) == 0 ? xVar2.C() : xVar2.G();
                        }
                    }
                    i31++;
                    arrayList9 = arrayList2;
                    i27 = 12;
                }
                f2.d d10 = dVar4.d(1835365473);
                u0 f7 = d10 != null ? c.f(d10) : null;
                c3.w wVar = new c3.w();
                f2.e e = dVar4.e(1969517665);
                if (e != null) {
                    u0 j12 = c.j(e);
                    wVar.b(j12);
                    u0Var = j12;
                } else {
                    u0Var = null;
                }
                f2.e e7 = dVar4.e(1836476516);
                e7.getClass();
                u0 u0Var3 = new u0(c.g(e7.c));
                ArrayList i33 = c.i(dVar4, wVar, j11, i30, (i28 & 16) != 0, false, new e(this), false);
                int size3 = i33.size();
                if (sparseArray.size() == 0) {
                    String b10 = p.b(i33);
                    int i34 = 0;
                    while (i34 < size3) {
                        t tVar = (t) i33.get(i34);
                        q qVar = tVar.a;
                        c3.q qVar2 = this.I;
                        int i35 = qVar.b;
                        int i36 = qVar.a;
                        x xVar3 = qVar.g;
                        int i37 = size3;
                        String str = b10;
                        long j13 = qVar.e;
                        k0 I1 = qVar2.I1(i34, i35);
                        I1.e(j13);
                        w a2 = xVar3.a();
                        int i38 = i34;
                        a2.q = v0.n(str);
                        if (i35 == 1) {
                            int i39 = wVar.a;
                            u0Var2 = u0Var3;
                            arrayList = i33;
                            if (i39 != -1 && (i10 = wVar.b) != -1) {
                                a2.M = i39;
                                a2.N = i10;
                            }
                        } else {
                            arrayList = i33;
                            u0Var2 = u0Var3;
                        }
                        u0 u0Var4 = xVar3.l;
                        u0[] u0VarArr = new u0[2];
                        u0VarArr[i29] = u0Var;
                        u0VarArr[1] = u0Var2;
                        p.l(i35, f7, a2, u0Var4, u0VarArr);
                        if (sparseArray2.size() == 1) {
                            dVar = (d) sparseArray2.valueAt(i29);
                        } else {
                            dVar = (d) sparseArray2.get(i36);
                            dVar.getClass();
                        }
                        sparseArray.put(i36, new g(I1, tVar, dVar, new x(a2)));
                        this.A = Math.max(this.A, j13);
                        i34 = i38 + 1;
                        size3 = i37;
                        b10 = str;
                        u0Var3 = u0Var2;
                        i33 = arrayList;
                        i29 = 0;
                    }
                    this.I.Q0();
                } else {
                    ArrayList arrayList10 = i33;
                    t6.p(sparseArray.size() == size3);
                    int i40 = 0;
                    while (i40 < size3) {
                        ArrayList arrayList11 = arrayList10;
                        t tVar2 = (t) arrayList11.get(i40);
                        q qVar3 = tVar2.a;
                        g gVar2 = (g) sparseArray.get(qVar3.a);
                        int i41 = qVar3.a;
                        if (sparseArray2.size() == 1) {
                            dVar2 = (d) sparseArray2.valueAt(0);
                        } else {
                            dVar2 = (d) sparseArray2.get(i41);
                            dVar2.getClass();
                        }
                        gVar2.d = tVar2;
                        gVar2.e = dVar2;
                        gVar2.a.b(gVar2.j);
                        gVar2.e();
                        i40++;
                        arrayList10 = arrayList11;
                    }
                }
            } else if (i26 == 1836019558) {
                int size4 = arrayList7.size();
                int i42 = 0;
                while (i42 < size4) {
                    f2.d dVar5 = (f2.d) arrayList7.get(i42);
                    if (dVar5.b == 1953653094) {
                        f2.e e10 = dVar5.e(1952868452);
                        ArrayList arrayList12 = dVar5.d;
                        e10.getClass();
                        e2.x xVar4 = e10.c;
                        xVar4.N(8);
                        int m10 = xVar4.m();
                        byte[] bArr2 = c.a;
                        g gVar3 = (g) sparseArray.get(xVar4.m());
                        if (gVar3 == null) {
                            i11 = size4;
                            arrayList5 = arrayList7;
                            gVar = null;
                        } else {
                            s sVar = gVar3.b;
                            if ((m10 & 1) != 0) {
                                arrayList5 = arrayList7;
                                long G = xVar4.G();
                                sVar.b = G;
                                sVar.c = G;
                            } else {
                                arrayList5 = arrayList7;
                            }
                            d dVar6 = gVar3.e;
                            int m11 = (m10 & 2) != 0 ? xVar4.m() - 1 : dVar6.a;
                            int m12 = (m10 & 8) != 0 ? xVar4.m() : dVar6.b;
                            if ((m10 & 16) != 0) {
                                i11 = size4;
                                i14 = xVar4.m();
                            } else {
                                i11 = size4;
                                i14 = dVar6.c;
                            }
                            sVar.a = new d(m11, m12, i14, (m10 & 32) != 0 ? xVar4.m() : dVar6.d);
                            gVar = gVar3;
                        }
                        if (gVar == null) {
                            arrayList4 = arrayList8;
                            i12 = i42;
                            arrayList3 = arrayList5;
                            i13 = i28;
                        } else {
                            s sVar2 = gVar.b;
                            long j14 = sVar2.p;
                            boolean z11 = sVar2.q;
                            gVar.e();
                            gVar.m = true;
                            f2.e e11 = dVar5.e(1952867444);
                            if (e11 == null || (i28 & 2) != 0) {
                                sVar2.p = j14;
                                sVar2.q = z11;
                            } else {
                                e2.x xVar5 = e11.c;
                                xVar5.N(8);
                                sVar2.p = c.e(xVar5.m()) == 1 ? xVar5.G() : xVar5.C();
                                sVar2.q = true;
                            }
                            int size5 = arrayList12.size();
                            int i43 = 0;
                            int i44 = 0;
                            int i45 = 0;
                            while (true) {
                                i15 = 1953658222;
                                if (i43 >= size5) {
                                    break;
                                }
                                f2.e eVar2 = (f2.e) arrayList12.get(i43);
                                ArrayList arrayList13 = arrayList8;
                                if (eVar2.b == 1953658222) {
                                    e2.x xVar6 = eVar2.c;
                                    xVar6.N(12);
                                    int E = xVar6.E();
                                    if (E > 0) {
                                        i45 += E;
                                        i44++;
                                    }
                                }
                                i43++;
                                arrayList8 = arrayList13;
                            }
                            arrayList4 = arrayList8;
                            gVar.h = 0;
                            gVar.g = 0;
                            gVar.f = 0;
                            sVar2.d = i44;
                            sVar2.e = i45;
                            if (sVar2.g.length < i44) {
                                sVar2.f = new long[i44];
                                sVar2.g = new int[i44];
                            }
                            if (sVar2.h.length < i45) {
                                int i46 = (i45 * zs.J1) / 100;
                                sVar2.h = new int[i46];
                                sVar2.i = new long[i46];
                                sVar2.j = new boolean[i46];
                                sVar2.l = new boolean[i46];
                            }
                            int i47 = 0;
                            int i48 = 0;
                            int i49 = 0;
                            while (true) {
                                long j15 = 0;
                                if (i47 < size5) {
                                    f2.e eVar3 = (f2.e) arrayList12.get(i47);
                                    if (eVar3.b == i15) {
                                        int i50 = i48 + 1;
                                        e2.x xVar7 = eVar3.c;
                                        xVar7.N(8);
                                        int m13 = xVar7.m();
                                        byte[] bArr3 = c.a;
                                        i18 = size5;
                                        q qVar4 = gVar.d.a;
                                        i19 = i47;
                                        d dVar7 = sVar2.a;
                                        String str2 = e2.l0.a;
                                        i20 = i42;
                                        sVar2.g[i48] = xVar7.E();
                                        long[] jArr = sVar2.f;
                                        int i51 = i48;
                                        long j16 = sVar2.b;
                                        jArr[i51] = j16;
                                        if ((m13 & 1) != 0) {
                                            jArr[i51] = j16 + xVar7.m();
                                        }
                                        boolean z12 = (m13 & 4) != 0;
                                        int i52 = dVar7.d;
                                        if (z12) {
                                            i52 = xVar7.m();
                                        }
                                        boolean z13 = z12;
                                        boolean z14 = (m13 & 256) != 0;
                                        boolean z15 = (m13 & 512) != 0;
                                        boolean z16 = (m13 & 1024) != 0;
                                        boolean z17 = (m13 & 2048) != 0;
                                        boolean z18 = z16;
                                        long[] jArr2 = qVar4.i;
                                        int i53 = i52;
                                        long[] jArr3 = qVar4.j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j17 = jArr2[0];
                                            if (j17 != 0) {
                                                long j18 = qVar4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j15 = jArr3[0];
                                        }
                                        int[] iArr = sVar2.h;
                                        long[] jArr4 = sVar2.i;
                                        boolean[] zArr = sVar2.j;
                                        boolean z19 = qVar4.b == 2 && (i28 & 1) != 0;
                                        int i54 = sVar2.g[i51] + i49;
                                        int i55 = i49;
                                        arrayList6 = arrayList5;
                                        long j19 = qVar4.c;
                                        e2.x xVar8 = xVar7;
                                        long j20 = sVar2.p;
                                        int i56 = i55;
                                        while (i56 < i54) {
                                            if (z14) {
                                                xVar = xVar8;
                                                i22 = xVar8.m();
                                            } else {
                                                xVar = xVar8;
                                                i22 = dVar7.b;
                                            }
                                            boolean z20 = z19;
                                            if (i22 < 0) {
                                                throw w0.a(null, "Unexpected negative value: " + i22);
                                            }
                                            if (z15) {
                                                i23 = i54;
                                                i24 = xVar.m();
                                            } else {
                                                i23 = i54;
                                                i24 = dVar7.c;
                                            }
                                            if (i24 < 0) {
                                                throw w0.a(null, "Unexpected negative value: " + i24);
                                            }
                                            int m14 = z18 ? xVar.m() : (i56 == 0 && z13) ? i53 : dVar7.d;
                                            if (z17) {
                                                dVar3 = dVar7;
                                                i25 = xVar.m();
                                            } else {
                                                dVar3 = dVar7;
                                                i25 = 0;
                                            }
                                            int i57 = i50;
                                            int i58 = i28;
                                            long a02 = e2.l0.a0((i25 + j20) - j15, 1000000L, j19, RoundingMode.DOWN);
                                            jArr4[i56] = a02;
                                            if (!sVar2.q) {
                                                jArr4[i56] = a02 + gVar.d.i;
                                            }
                                            iArr[i56] = i24;
                                            zArr[i56] = ((m14 >> 16) & 1) == 0 && (!z20 || i56 == 0);
                                            j20 += i22;
                                            i56++;
                                            xVar8 = xVar;
                                            z19 = z20;
                                            i54 = i23;
                                            dVar7 = dVar3;
                                            i28 = i58;
                                            i50 = i57;
                                        }
                                        i21 = i28;
                                        sVar2.p = j20;
                                        i49 = i54;
                                        i48 = i50;
                                    } else {
                                        i18 = size5;
                                        i19 = i47;
                                        i20 = i42;
                                        arrayList6 = arrayList5;
                                        i21 = i28;
                                    }
                                    i47 = i19 + 1;
                                    size5 = i18;
                                    i42 = i20;
                                    arrayList5 = arrayList6;
                                    i28 = i21;
                                    i15 = 1953658222;
                                } else {
                                    i12 = i42;
                                    arrayList3 = arrayList5;
                                    i13 = i28;
                                    q qVar5 = gVar.d.a;
                                    d dVar8 = sVar2.a;
                                    dVar8.getClass();
                                    r rVar = qVar5.l[dVar8.a];
                                    f2.e e12 = dVar5.e(1935763834);
                                    if (e12 != null) {
                                        rVar.getClass();
                                        e2.x xVar9 = e12.c;
                                        int i59 = rVar.d;
                                        xVar9.N(8);
                                        int m15 = xVar9.m();
                                        byte[] bArr4 = c.a;
                                        if ((m15 & 1) == 1) {
                                            xVar9.O(8);
                                        }
                                        int A = xVar9.A();
                                        int E2 = xVar9.E();
                                        if (E2 > sVar2.e) {
                                            StringBuilder l4 = i0.a.l(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            l4.append(sVar2.e);
                                            throw w0.a(null, l4.toString());
                                        }
                                        if (A == 0) {
                                            boolean[] zArr2 = sVar2.l;
                                            i17 = 0;
                                            for (int i60 = 0; i60 < E2; i60++) {
                                                int A2 = xVar9.A();
                                                i17 += A2;
                                                zArr2[i60] = A2 > i59;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z21 = A > i59;
                                            i17 = A * E2;
                                            z10 = false;
                                            Arrays.fill(sVar2.l, 0, E2, z21);
                                        }
                                        Arrays.fill(sVar2.l, E2, sVar2.e, z10);
                                        if (i17 > 0) {
                                            sVar2.n.K(i17);
                                            sVar2.k = true;
                                            sVar2.o = true;
                                        }
                                    }
                                    f2.e e13 = dVar5.e(1935763823);
                                    if (e13 != null) {
                                        e2.x xVar10 = e13.c;
                                        xVar10.N(8);
                                        int m16 = xVar10.m();
                                        byte[] bArr5 = c.a;
                                        if ((m16 & 1) == 1) {
                                            xVar10.O(8);
                                        }
                                        int E3 = xVar10.E();
                                        if (E3 != 1) {
                                            throw w0.a(null, "Unexpected saio entry count: " + E3);
                                        }
                                        sVar2.c += c.e(m16) == 0 ? xVar10.C() : xVar10.G();
                                    }
                                    f2.e e14 = dVar5.e(1936027235);
                                    if (e14 != null) {
                                        j(e14.c, 0, sVar2);
                                    }
                                    String str3 = rVar != null ? rVar.b : null;
                                    e2.x xVar11 = null;
                                    e2.x xVar12 = null;
                                    for (int i61 = 0; i61 < arrayList12.size(); i61++) {
                                        f2.e eVar4 = (f2.e) arrayList12.get(i61);
                                        e2.x xVar13 = eVar4.c;
                                        int i62 = eVar4.b;
                                        if (i62 == 1935828848) {
                                            xVar13.N(12);
                                            if (xVar13.m() == 1936025959) {
                                                xVar11 = xVar13;
                                            }
                                        } else if (i62 == 1936158820) {
                                            xVar13.N(12);
                                            if (xVar13.m() == 1936025959) {
                                                xVar12 = xVar13;
                                            }
                                        }
                                    }
                                    if (xVar11 != null && xVar12 != null) {
                                        xVar11.N(8);
                                        int e15 = c.e(xVar11.m());
                                        xVar11.O(4);
                                        if (e15 == 1) {
                                            xVar11.O(4);
                                        }
                                        if (xVar11.m() != 1) {
                                            throw w0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        xVar12.N(8);
                                        int e16 = c.e(xVar12.m());
                                        xVar12.O(4);
                                        if (e16 == 1) {
                                            if (xVar12.C() == 0) {
                                                throw w0.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e16 >= 2) {
                                            xVar12.O(4);
                                        }
                                        if (xVar12.C() != 1) {
                                            throw w0.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        xVar12.O(1);
                                        int A3 = xVar12.A();
                                        int i63 = (A3 & zs.P3) >> 4;
                                        int i64 = A3 & 15;
                                        boolean z22 = xVar12.A() == 1;
                                        if (z22) {
                                            int A4 = xVar12.A();
                                            byte[] bArr6 = new byte[16];
                                            xVar12.k(0, 16, bArr6);
                                            if (A4 == 0) {
                                                int A5 = xVar12.A();
                                                byte[] bArr7 = new byte[A5];
                                                xVar12.k(0, A5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            sVar2.k = true;
                                            sVar2.m = new r(z22, str3, A4, bArr6, i63, i64, bArr);
                                            size = arrayList12.size();
                                            for (i16 = 0; i16 < size; i16++) {
                                                f2.e eVar5 = (f2.e) arrayList12.get(i16);
                                                if (eVar5.b == 1970628964) {
                                                    e2.x xVar14 = eVar5.c;
                                                    xVar14.N(8);
                                                    byte[] bArr8 = this.h;
                                                    xVar14.k(0, 16, bArr8);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        j(xVar14, 16, sVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList12.size();
                                    while (i16 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i11 = size4;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        i12 = i42;
                        i13 = i28;
                    }
                    i42 = i12 + 1;
                    size4 = i11;
                    arrayList8 = arrayList4;
                    arrayList7 = arrayList3;
                    i28 = i13;
                }
                b2.t i65 = i(arrayList8);
                if (i65 != null) {
                    int size6 = sparseArray.size();
                    for (int i66 = 0; i66 < size6; i66++) {
                        g gVar4 = (g) sparseArray.valueAt(i66);
                        q qVar6 = gVar4.d.a;
                        d dVar9 = gVar4.b.a;
                        String str4 = e2.l0.a;
                        r rVar2 = qVar6.l[dVar9.a];
                        b2.t a10 = i65.a(rVar2 != null ? rVar2.b : null);
                        w a11 = gVar4.j.a();
                        a11.v = a10;
                        gVar4.a.b(new x(a11));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i67 = 0; i67 < size7; i67++) {
                        g gVar5 = (g) sparseArray.valueAt(i67);
                        long j21 = this.z;
                        int i68 = gVar5.f;
                        while (true) {
                            s sVar3 = gVar5.b;
                            if (i68 < sVar3.e && sVar3.i[i68] <= j21) {
                                if (sVar3.j[i68]) {
                                    gVar5.i = i68;
                                }
                                i68++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((f2.d) arrayDeque.peek()).e.add(dVar4);
            }
        }
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
