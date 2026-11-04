package y3;

import android.util.Pair;
import android.util.SparseArray;
import b8.zb;
import d2.s0;
import d2.u0;
import d2.v;
import d2.v0;
import e3.b0;
import e3.f0;
import e3.i0;
import e3.w;
import g2.l0;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import k2.p1;
import mi.h0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements e3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final v P;
    public long A;
    public long B;
    public h C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public e3.q I;
    public i0[] J;
    public i0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final b4.k a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final y i;
    public final l0 j;
    public final g2.d o;
    public final i0 p;
    public final android.support.v4.media.c q;
    public s1 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public y w;
    public long x;
    public int y;
    public long z;
    public final h0 k = new h0(17);
    public final y l = new y(16);
    public final y e = new y(h2.o.a);
    public final y f = new y(6);
    public final y g = new y();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        d2.u uVar = new d2.u();
        uVar.r = u0.n("application/x-emsg");
        P = new v(uVar);
    }

    public i(b4.k kVar, int i3, l0 l0Var, List list, n2.o oVar) {
        this.a = kVar;
        this.b = i3;
        this.j = l0Var;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new y(bArr);
        g0 g0Var = g9.i0.b;
        this.r = s1.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = e3.q.k;
        this.J = new i0[0];
        this.K = new i0[0];
        this.o = new g2.d(new f(this));
        this.q = new android.support.v4.media.c(17);
        this.N = -1L;
    }

    public static int g(int i3) {
        int i10 = (i3 & 1) != 0 ? 64 : 0;
        return (i3 & 2) != 0 ? i10 | 128 : i10;
    }

    public static d2.s i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            h2.d dVar = (h2.d) list.get(i3);
            if (dVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.c.a;
                l6.n i10 = q.i(bArr);
                UUID uuid = i10 == null ? null : (UUID) i10.b;
                if (uuid == null) {
                    g2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new d2.r(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new d2.s(null, false, (d2.r[]) arrayList.toArray(new d2.r[0]));
    }

    public static void j(y yVar, int i3, t tVar) {
        yVar.N(i3 + 8);
        int m10 = yVar.m();
        byte[] bArr = d.a;
        if ((m10 & 1) != 0) {
            throw v0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (m10 & 2) != 0;
        int E = yVar.E();
        if (E == 0) {
            Arrays.fill(tVar.l, 0, tVar.e, false);
            return;
        }
        int i10 = tVar.e;
        y yVar2 = tVar.n;
        if (E != i10) {
            StringBuilder m11 = p1.m(E, "Senc sample count ", " is different from fragment sample count");
            m11.append(tVar.e);
            throw v0.a(null, m11.toString());
        }
        Arrays.fill(tVar.l, 0, E, z10);
        yVar2.K(yVar.a());
        tVar.k = true;
        tVar.o = true;
        yVar.k(0, yVar2.c, yVar2.a);
        yVar2.N(0);
        tVar.o = false;
    }

    public static Pair k(long j10, y yVar) {
        long G;
        long G2;
        y yVar2 = yVar;
        yVar2.N(8);
        int e10 = d.e(yVar2.m());
        yVar2.O(4);
        long C = yVar2.C();
        if (e10 == 0) {
            G = yVar2.C();
            G2 = yVar2.C();
        } else {
            G = yVar2.G();
            G2 = yVar2.G();
        }
        long j11 = G2 + j10;
        String str = n0.a;
        long a02 = n0.a0(G, 1000000L, C, RoundingMode.DOWN);
        yVar2.O(2);
        int H = yVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j12 = j11;
        long j13 = a02;
        int i3 = 0;
        while (i3 < H) {
            int m10 = yVar2.m();
            if ((Integer.MIN_VALUE & m10) != 0) {
                throw v0.a(null, "Unhandled indirect reference");
            }
            long C2 = yVar2.C();
            iArr[i3] = m10 & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i3] = j12;
            jArr3[i3] = j13;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long a03 = n0.a0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i3] = a03 - jArr5[i3];
            yVar2.O(4);
            j12 += iArr[i3];
            i3++;
            H = H;
            yVar2 = yVar;
            j13 = a03;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(a02), new e3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        s1 s1Var;
        f0 m10 = q.m(pVar, true, false);
        if (m10 != null) {
            s1Var = g9.i0.u(m10);
        } else {
            g0 g0Var = g9.i0.b;
            s1Var = s1.e;
        }
        this.r = s1Var;
        return m10 == null;
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        int i3;
        int i10 = this.b;
        if ((i10 & 32) == 0) {
            qVar = new b4.n(qVar, this.a);
        }
        this.I = qVar;
        h();
        i0[] i0VarArr = new i0[2];
        this.J = i0VarArr;
        int i11 = 0;
        i0 i0Var = this.p;
        if (i0Var != null) {
            i0VarArr[0] = i0Var;
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i12 = 100;
        if ((i10 & 4) != 0) {
            i0VarArr[i3] = this.I.i0(100, 5);
            i12 = 101;
            i3++;
        }
        i0[] i0VarArr2 = (i0[]) n0.U(i3, this.J);
        this.J = i0VarArr2;
        for (i0 i0Var2 : i0VarArr2) {
            i0Var2.g(P);
        }
        List list = this.c;
        this.K = new i0[list.size()];
        while (i11 < this.K.length) {
            i0 i02 = this.I.i0(i12, 3);
            i02.g((v) list.get(i11));
            this.K[i11] = i02;
            i11++;
            i12++;
        }
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((h) sparseArray.valueAt(i3)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j11;
        this.m.clear();
        h();
    }

    @Override // e3.o
    public final List e() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0674, code lost:
    
        throw d2.v0.c("Atom size less than header length (unsupported).");
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
    
        r33.u(r32.D);
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
        r33.u(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.s) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x017c, code lost:
    
        r32.E = r2.d(r32.D, 7);
        e3.b.f(r32.D, r8);
        r5.e(7, r8);
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
        r5.e(4, r4);
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
    
        r4 = h2.o.d(r8);
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
        r5.e(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02a1, code lost:
    
        if (r2 <= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x02a5, code lost:
    
        if (r32.G != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x02ab, code lost:
    
        if (h2.o.f(r15, r2, r8) == false) goto L153;
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
    
        throw d2.v0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x01f4, code lost:
    
        r2 = h2.o.g(r8);
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
        r5.e(r32.F, r4);
        r2 = r32.F;
        r2 = h2.o.p(r4.c, r4.a);
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
        r5.d(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0366, code lost:
    
        if (r3.isEmpty() != false) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0368, code lost:
    
        r1 = (y3.g) r3.removeFirst();
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
    
        r2[r5].d(r7, 1, r1.c, r32.y, null);
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
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(e3.p pVar, e3.s sVar) {
        char c2;
        boolean z10;
        int i3;
        int i10;
        String v;
        String v10;
        long j10;
        long j11;
        long a02;
        long C;
        int i11;
        while (true) {
            int i12 = this.s;
            ArrayDeque arrayDeque = this.m;
            g2.d dVar = this.o;
            y yVar = this.i;
            android.support.v4.media.c cVar = this.q;
            SparseArray sparseArray = this.d;
            boolean z11 = true;
            if (i12 != 0) {
                ArrayDeque arrayDeque2 = this.n;
                int i13 = this.b;
                l0 l0Var = this.j;
                if (i12 != 1) {
                    long j12 = Long.MAX_VALUE;
                    if (i12 != 2) {
                        h hVar = this.C;
                        if (hVar != null) {
                            c2 = 2;
                            z10 = true;
                            i3 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c2 = 2;
                        int i14 = 0;
                        h hVar2 = null;
                        while (i14 < size) {
                            h hVar3 = (h) sparseArray.valueAt(i14);
                            boolean z12 = z11;
                            boolean z13 = hVar3.m;
                            t tVar = hVar3.b;
                            if (z13) {
                                i10 = size;
                            } else {
                                i10 = size;
                                if (hVar3.f == hVar3.d.b) {
                                    i14++;
                                    z11 = z12;
                                    size = i10;
                                }
                            }
                            if (!z13 || hVar3.h != tVar.d) {
                                long j13 = !z13 ? hVar3.d.c[hVar3.f] : tVar.f[hVar3.h];
                                if (j13 < j12) {
                                    hVar2 = hVar3;
                                    j12 = j13;
                                }
                            }
                            i14++;
                            z11 = z12;
                            size = i10;
                        }
                        z10 = z11;
                        i3 = 8;
                        if (hVar2 == null) {
                            int position = (int) (this.x - pVar.getPosition());
                            if (position < 0) {
                                throw v0.a(null, "Offset to end of mdat was negative.");
                            }
                            pVar.u(position);
                            h();
                        } else {
                            int position2 = (int) ((!hVar2.m ? hVar2.d.c[hVar2.f] : hVar2.b.f[hVar2.h]) - pVar.getPosition());
                            if (position2 < 0) {
                                g2.a.l("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            pVar.u(position2);
                            this.C = hVar2;
                            hVar = hVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        h hVar4 = null;
                        for (int i15 = 0; i15 < size2; i15++) {
                            t tVar2 = ((h) sparseArray.valueAt(i15)).b;
                            if (tVar2.o) {
                                long j14 = tVar2.c;
                                if (j14 < j12) {
                                    hVar4 = (h) sparseArray.valueAt(i15);
                                    j12 = j14;
                                }
                            }
                        }
                        if (hVar4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j12 - pVar.getPosition());
                            if (position3 < 0) {
                                throw v0.a(null, "Offset to encryption data was negative.");
                            }
                            pVar.u(position3);
                            t tVar3 = hVar4.b;
                            y yVar2 = tVar3.n;
                            pVar.readFully(yVar2.a, 0, yVar2.c);
                            yVar2.N(0);
                            tVar3.o = false;
                        }
                    }
                } else {
                    int i16 = (int) (this.u - this.v);
                    y yVar3 = this.w;
                    if (yVar3 != null) {
                        pVar.readFully(yVar3.a, 8, i16);
                        int i17 = this.t;
                        h2.d dVar2 = new h2.d(i17, yVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((h2.c) arrayDeque.peek()).d.add(dVar2);
                        } else if (i17 == 1936286840) {
                            Pair k10 = k(pVar.getPosition(), yVar3);
                            cVar.U((e3.j) k10.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.b;
                            this.B = ((Long) k10.first).longValue();
                            if (this.M) {
                                i11 = 1;
                            } else {
                                i11 = 1;
                                this.I.f(linkedHashMap.size() == 1 ? (b0) k10.second : cVar.j0());
                                this.L = true;
                            }
                            if ((i13 & 256) != 0 && !this.M && linkedHashMap.size() > i11) {
                                this.N = pVar.getPosition();
                            }
                        } else if (i17 == 1701671783 && this.J.length != 0) {
                            yVar3.N(8);
                            int e10 = d.e(yVar3.m());
                            long j15 = -9223372036854775807L;
                            if (e10 == 0) {
                                v = yVar3.v();
                                v.getClass();
                                v10 = yVar3.v();
                                v10.getClass();
                                long C2 = yVar3.C();
                                long C3 = yVar3.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long a03 = n0.a0(C3, 1000000L, C2, roundingMode);
                                long j16 = this.B;
                                long j17 = j16 != -9223372036854775807L ? j16 + a03 : -9223372036854775807L;
                                j10 = a03;
                                j11 = j17;
                                a02 = n0.a0(yVar3.C(), 1000L, C2, roundingMode);
                                C = yVar3.C();
                            } else if (e10 != 1) {
                                com.google.android.recaptcha.internal.a.o(e10, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long C4 = yVar3.C();
                                long G = yVar3.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j11 = n0.a0(G, 1000000L, C4, roundingMode2);
                                long a04 = n0.a0(yVar3.C(), 1000L, C4, roundingMode2);
                                long C5 = yVar3.C();
                                v = yVar3.v();
                                v.getClass();
                                v10 = yVar3.v();
                                v10.getClass();
                                a02 = a04;
                                C = C5;
                                j10 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v10;
                            byte[] bArr = new byte[yVar3.a()];
                            yVar3.k(0, yVar3.a(), bArr);
                            y yVar4 = new y(this.k.e(new p3.a(str, str2, a02, C, bArr)));
                            int a10 = yVar4.a();
                            i0[] i0VarArr = this.J;
                            int length = i0VarArr.length;
                            int i18 = 0;
                            while (i18 < length) {
                                i0 i0Var = i0VarArr[i18];
                                yVar4.N(0);
                                i0Var.e(a10, yVar4);
                                i18++;
                                j15 = j15;
                            }
                            if (j11 == j15) {
                                arrayDeque2.addLast(new g(a10, j10, true));
                                this.y += a10;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new g(a10, j11, false));
                                this.y += a10;
                            } else if (l0Var == null || l0Var.f()) {
                                if (l0Var != null) {
                                    j11 = l0Var.a(j11);
                                }
                                long j18 = j11;
                                for (i0 i0Var2 : this.J) {
                                    i0Var2.d(j18, 1, a10, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new g(a10, j11, false));
                                this.y += a10;
                            }
                        }
                    } else {
                        pVar.u(i16);
                    }
                    l(pVar.getPosition());
                }
            } else {
                int i19 = this.v;
                y yVar5 = this.l;
                if (i19 == 0) {
                    if (!pVar.d(yVar5.a, 0, 8, true)) {
                        long j19 = this.N;
                        if (j19 == -1) {
                            dVar.r(0);
                            return -1;
                        }
                        sVar.a = j19;
                        this.N = -1L;
                        this.I.f(cVar.j0());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    yVar5.N(0);
                    this.u = yVar5.C();
                    this.t = yVar5.m();
                }
                long j20 = this.u;
                if (j20 == 1) {
                    pVar.readFully(yVar5.a, 8, 8);
                    this.v += 8;
                    this.u = yVar5.G();
                } else if (j20 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((h2.c) arrayDeque.peek()).c;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - pVar.getPosition()) + this.v;
                    }
                }
                long j21 = this.u;
                int i20 = this.v;
                long j22 = i20;
                if (j21 < j22) {
                    if (this.t != 1718773093 || i20 != 8) {
                        break;
                    }
                    this.u = j22;
                }
                if (this.N != -1) {
                    if (this.t == 1936286840) {
                        yVar.K((int) this.u);
                        System.arraycopy(yVar5.a, 0, yVar.a, 0, 8);
                        pVar.readFully(yVar.a, 8, (int) (this.u - this.v));
                        cVar.U((e3.j) k(pVar.k(), yVar).second);
                    } else {
                        pVar.g((int) (this.u - j22), true);
                    }
                    h();
                } else {
                    long position4 = pVar.getPosition() - this.v;
                    int i21 = this.t;
                    if ((i21 == 1836019558 || i21 == 1835295092) && !this.L) {
                        this.I.f(new e3.t(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            t tVar4 = ((h) sparseArray.valueAt(i22)).b;
                            tVar4.getClass();
                            tVar4.c = position4;
                            tVar4.b = position4;
                        }
                    }
                    int i23 = this.t;
                    if (i23 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i23 == 1836019574 || i23 == 1953653099 || i23 == 1835297121 || i23 == 1835626086 || i23 == 1937007212 || i23 == 1836019558 || i23 == 1953653094 || i23 == 1836475768 || i23 == 1701082227 || i23 == 1835365473) {
                        long position5 = pVar.getPosition();
                        long j23 = this.u;
                        long j24 = (position5 + j23) - 8;
                        if (j23 != this.v && this.t == 1835365473) {
                            yVar.K(8);
                            pVar.c(0, 8, yVar.a);
                            d.a(yVar);
                            pVar.u(yVar.b);
                            pVar.o();
                        }
                        arrayDeque.push(new h2.c(this.t, j24));
                        if (this.u == this.v) {
                            l(j24);
                        } else {
                            h();
                        }
                    } else if (i23 == 1751411826 || i23 == 1835296868 || i23 == 1836476516 || i23 == 1936286840 || i23 == 1937011556 || i23 == 1937011827 || i23 == 1668576371 || i23 == 1937011555 || i23 == 1937011578 || i23 == 1937013298 || i23 == 1937007471 || i23 == 1668232756 || i23 == 1937011571 || i23 == 1952867444 || i23 == 1952868452 || i23 == 1953196132 || i23 == 1953654136 || i23 == 1953658222 || i23 == 1886614376 || i23 == 1935763834 || i23 == 1935763823 || i23 == 1936027235 || i23 == 1970628964 || i23 == 1935828848 || i23 == 1936158820 || i23 == 1701606260 || i23 == 1835362404 || i23 == 1701671783 || i23 == 1969517665 || i23 == 1801812339 || i23 == 1768715124) {
                        if (this.v != 8) {
                            throw v0.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw v0.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        y yVar6 = new y((int) this.u);
                        System.arraycopy(yVar5.a, 0, yVar6.a, 0, 8);
                        this.w = yVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw v0.c("Skipping atom with length > 2147483647 (unsupported).");
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
    
        if ((g2.n0.a0(r39, 1000000, r7, r45) + g2.n0.a0(r8[0], 1000000, r4.c, r45)) >= r4.e) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0724  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j10) {
        s0 s0Var;
        ArrayList arrayList;
        s0 s0Var2;
        e eVar;
        int i3;
        e eVar2;
        ArrayList arrayList2;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i11;
        int i12;
        ArrayList arrayList5;
        int i13;
        h hVar;
        int i14;
        int size;
        int i15;
        byte[] bArr;
        int i16;
        boolean z10;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList6;
        int i20;
        y yVar;
        int i21;
        int i22;
        int i23;
        e eVar3;
        int i24;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((h2.c) arrayDeque.peek()).c != j10) {
                break;
            }
            h2.c cVar = (h2.c) arrayDeque.pop();
            int i25 = cVar.b;
            ArrayList arrayList7 = cVar.e;
            ArrayList arrayList8 = cVar.d;
            int i26 = 12;
            int i27 = this.b;
            int i28 = 0;
            SparseArray sparseArray = this.d;
            if (i25 == 1836019574) {
                d2.s i29 = i(arrayList8);
                h2.c d = cVar.d(1836475768);
                d.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList9 = d.d;
                int size2 = arrayList9.size();
                int i30 = 0;
                long j11 = -9223372036854775807L;
                while (i30 < size2) {
                    h2.d dVar = (h2.d) arrayList9.get(i30);
                    int i31 = dVar.b;
                    y yVar2 = dVar.c;
                    if (i31 == 1953654136) {
                        yVar2.N(i26);
                        arrayList2 = arrayList9;
                        Pair create = Pair.create(Integer.valueOf(yVar2.m()), new e(yVar2.m() - 1, yVar2.m(), yVar2.m(), yVar2.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (e) create.second);
                    } else {
                        arrayList2 = arrayList9;
                        if (i31 == 1835362404) {
                            yVar2.N(8);
                            j11 = d.e(yVar2.m()) == 0 ? yVar2.C() : yVar2.G();
                        }
                    }
                    i30++;
                    arrayList9 = arrayList2;
                    i26 = 12;
                }
                h2.c d10 = cVar.d(1835365473);
                s0 f10 = d10 != null ? d.f(d10) : null;
                w wVar = new w();
                h2.d e10 = cVar.e(1969517665);
                if (e10 != null) {
                    s0 j12 = d.j(e10);
                    wVar.b(j12);
                    s0Var = j12;
                } else {
                    s0Var = null;
                }
                h2.d e11 = cVar.e(1836476516);
                e11.getClass();
                s0 s0Var3 = new s0(d.g(e11.c));
                ArrayList i32 = d.i(cVar, wVar, j11, i29, (i27 & 16) != 0, false, new f(this), false);
                int size3 = i32.size();
                if (sparseArray.size() == 0) {
                    String b10 = q.b(i32);
                    int i33 = 0;
                    while (i33 < size3) {
                        u uVar = (u) i32.get(i33);
                        r rVar = uVar.a;
                        e3.q qVar = this.I;
                        int i34 = rVar.b;
                        int i35 = rVar.a;
                        v vVar = rVar.g;
                        int i36 = size3;
                        String str = b10;
                        long j13 = rVar.e;
                        i0 i02 = qVar.i0(i33, i34);
                        i02.b(j13);
                        d2.u a10 = vVar.a();
                        int i37 = i33;
                        a10.q = u0.n(str);
                        if (i34 == 1) {
                            int i38 = wVar.a;
                            s0Var2 = s0Var3;
                            arrayList = i32;
                            if (i38 != -1 && (i3 = wVar.b) != -1) {
                                a10.M = i38;
                                a10.N = i3;
                            }
                        } else {
                            arrayList = i32;
                            s0Var2 = s0Var3;
                        }
                        s0 s0Var4 = vVar.l;
                        s0[] s0VarArr = new s0[2];
                        s0VarArr[i28] = s0Var;
                        s0VarArr[1] = s0Var2;
                        q.l(i34, f10, a10, s0Var4, s0VarArr);
                        if (sparseArray2.size() == 1) {
                            eVar = (e) sparseArray2.valueAt(i28);
                        } else {
                            eVar = (e) sparseArray2.get(i35);
                            eVar.getClass();
                        }
                        sparseArray.put(i35, new h(i02, uVar, eVar, new v(a10)));
                        this.A = Math.max(this.A, j13);
                        i33 = i37 + 1;
                        size3 = i36;
                        b10 = str;
                        s0Var3 = s0Var2;
                        i32 = arrayList;
                        i28 = 0;
                    }
                    this.I.L();
                } else {
                    ArrayList arrayList10 = i32;
                    zb.p(sparseArray.size() == size3);
                    int i39 = 0;
                    while (i39 < size3) {
                        ArrayList arrayList11 = arrayList10;
                        u uVar2 = (u) arrayList11.get(i39);
                        r rVar2 = uVar2.a;
                        h hVar2 = (h) sparseArray.get(rVar2.a);
                        int i40 = rVar2.a;
                        if (sparseArray2.size() == 1) {
                            eVar2 = (e) sparseArray2.valueAt(0);
                        } else {
                            eVar2 = (e) sparseArray2.get(i40);
                            eVar2.getClass();
                        }
                        hVar2.d = uVar2;
                        hVar2.e = eVar2;
                        hVar2.a.g(hVar2.j);
                        hVar2.e();
                        i39++;
                        arrayList10 = arrayList11;
                    }
                }
            } else if (i25 == 1836019558) {
                int size4 = arrayList7.size();
                int i41 = 0;
                while (i41 < size4) {
                    h2.c cVar2 = (h2.c) arrayList7.get(i41);
                    if (cVar2.b == 1953653094) {
                        h2.d e12 = cVar2.e(1952868452);
                        ArrayList arrayList12 = cVar2.d;
                        e12.getClass();
                        y yVar3 = e12.c;
                        yVar3.N(8);
                        int m10 = yVar3.m();
                        byte[] bArr2 = d.a;
                        h hVar3 = (h) sparseArray.get(yVar3.m());
                        if (hVar3 == null) {
                            i10 = size4;
                            arrayList5 = arrayList7;
                            hVar = null;
                        } else {
                            t tVar = hVar3.b;
                            if ((m10 & 1) != 0) {
                                arrayList5 = arrayList7;
                                long G = yVar3.G();
                                tVar.b = G;
                                tVar.c = G;
                            } else {
                                arrayList5 = arrayList7;
                            }
                            e eVar4 = hVar3.e;
                            int m11 = (m10 & 2) != 0 ? yVar3.m() - 1 : eVar4.a;
                            int m12 = (m10 & 8) != 0 ? yVar3.m() : eVar4.b;
                            if ((m10 & 16) != 0) {
                                i10 = size4;
                                i13 = yVar3.m();
                            } else {
                                i10 = size4;
                                i13 = eVar4.c;
                            }
                            tVar.a = new e(m11, m12, i13, (m10 & 32) != 0 ? yVar3.m() : eVar4.d);
                            hVar = hVar3;
                        }
                        if (hVar == null) {
                            arrayList4 = arrayList8;
                            i11 = i41;
                            arrayList3 = arrayList5;
                            i12 = i27;
                        } else {
                            t tVar2 = hVar.b;
                            long j14 = tVar2.p;
                            boolean z11 = tVar2.q;
                            hVar.e();
                            hVar.m = true;
                            h2.d e13 = cVar2.e(1952867444);
                            if (e13 == null || (i27 & 2) != 0) {
                                tVar2.p = j14;
                                tVar2.q = z11;
                            } else {
                                y yVar4 = e13.c;
                                yVar4.N(8);
                                tVar2.p = d.e(yVar4.m()) == 1 ? yVar4.G() : yVar4.C();
                                tVar2.q = true;
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
                                h2.d dVar2 = (h2.d) arrayList12.get(i42);
                                ArrayList arrayList13 = arrayList8;
                                if (dVar2.b == 1953658222) {
                                    y yVar5 = dVar2.c;
                                    yVar5.N(12);
                                    int E = yVar5.E();
                                    if (E > 0) {
                                        i44 += E;
                                        i43++;
                                    }
                                }
                                i42++;
                                arrayList8 = arrayList13;
                            }
                            arrayList4 = arrayList8;
                            hVar.h = 0;
                            hVar.g = 0;
                            hVar.f = 0;
                            tVar2.d = i43;
                            tVar2.e = i44;
                            if (tVar2.g.length < i43) {
                                tVar2.f = new long[i43];
                                tVar2.g = new int[i43];
                            }
                            if (tVar2.h.length < i44) {
                                int i45 = (i44 * hs.J1) / 100;
                                tVar2.h = new int[i45];
                                tVar2.i = new long[i45];
                                tVar2.j = new boolean[i45];
                                tVar2.l = new boolean[i45];
                            }
                            int i46 = 0;
                            int i47 = 0;
                            int i48 = 0;
                            while (true) {
                                long j15 = 0;
                                if (i46 < size5) {
                                    h2.d dVar3 = (h2.d) arrayList12.get(i46);
                                    if (dVar3.b == i14) {
                                        int i49 = i47 + 1;
                                        y yVar6 = dVar3.c;
                                        yVar6.N(8);
                                        int m13 = yVar6.m();
                                        byte[] bArr3 = d.a;
                                        i17 = size5;
                                        r rVar3 = hVar.d.a;
                                        i18 = i46;
                                        e eVar5 = tVar2.a;
                                        String str2 = n0.a;
                                        i19 = i41;
                                        tVar2.g[i47] = yVar6.E();
                                        long[] jArr = tVar2.f;
                                        int i50 = i47;
                                        long j16 = tVar2.b;
                                        jArr[i50] = j16;
                                        if ((m13 & 1) != 0) {
                                            jArr[i50] = j16 + yVar6.m();
                                        }
                                        boolean z12 = (m13 & 4) != 0;
                                        int i51 = eVar5.d;
                                        if (z12) {
                                            i51 = yVar6.m();
                                        }
                                        boolean z13 = z12;
                                        boolean z14 = (m13 & 256) != 0;
                                        boolean z15 = (m13 & 512) != 0;
                                        boolean z16 = (m13 & 1024) != 0;
                                        boolean z17 = (m13 & 2048) != 0;
                                        boolean z18 = z16;
                                        long[] jArr2 = rVar3.i;
                                        int i52 = i51;
                                        long[] jArr3 = rVar3.j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j17 = jArr2[0];
                                            if (j17 != 0) {
                                                long j18 = rVar3.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j15 = jArr3[0];
                                        }
                                        int[] iArr = tVar2.h;
                                        long[] jArr4 = tVar2.i;
                                        boolean[] zArr = tVar2.j;
                                        boolean z19 = rVar3.b == 2 && (i27 & 1) != 0;
                                        int i53 = tVar2.g[i50] + i48;
                                        int i54 = i48;
                                        arrayList6 = arrayList5;
                                        long j19 = rVar3.c;
                                        y yVar7 = yVar6;
                                        long j20 = tVar2.p;
                                        int i55 = i54;
                                        while (i55 < i53) {
                                            if (z14) {
                                                yVar = yVar7;
                                                i21 = yVar7.m();
                                            } else {
                                                yVar = yVar7;
                                                i21 = eVar5.b;
                                            }
                                            boolean z20 = z19;
                                            if (i21 < 0) {
                                                throw v0.a(null, "Unexpected negative value: " + i21);
                                            }
                                            if (z15) {
                                                i22 = i53;
                                                i23 = yVar.m();
                                            } else {
                                                i22 = i53;
                                                i23 = eVar5.c;
                                            }
                                            if (i23 < 0) {
                                                throw v0.a(null, "Unexpected negative value: " + i23);
                                            }
                                            int m14 = z18 ? yVar.m() : (i55 == 0 && z13) ? i52 : eVar5.d;
                                            if (z17) {
                                                eVar3 = eVar5;
                                                i24 = yVar.m();
                                            } else {
                                                eVar3 = eVar5;
                                                i24 = 0;
                                            }
                                            int i56 = i49;
                                            int i57 = i27;
                                            long a02 = n0.a0((i24 + j20) - j15, 1000000L, j19, RoundingMode.DOWN);
                                            jArr4[i55] = a02;
                                            if (!tVar2.q) {
                                                jArr4[i55] = a02 + hVar.d.i;
                                            }
                                            iArr[i55] = i23;
                                            zArr[i55] = ((m14 >> 16) & 1) == 0 && (!z20 || i55 == 0);
                                            j20 += i21;
                                            i55++;
                                            yVar7 = yVar;
                                            z19 = z20;
                                            i53 = i22;
                                            eVar5 = eVar3;
                                            i27 = i57;
                                            i49 = i56;
                                        }
                                        i20 = i27;
                                        tVar2.p = j20;
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
                                    r rVar4 = hVar.d.a;
                                    e eVar6 = tVar2.a;
                                    eVar6.getClass();
                                    s sVar = rVar4.l[eVar6.a];
                                    h2.d e14 = cVar2.e(1935763834);
                                    if (e14 != null) {
                                        sVar.getClass();
                                        y yVar8 = e14.c;
                                        int i58 = sVar.d;
                                        yVar8.N(8);
                                        int m15 = yVar8.m();
                                        byte[] bArr4 = d.a;
                                        if ((m15 & 1) == 1) {
                                            yVar8.O(8);
                                        }
                                        int A = yVar8.A();
                                        int E2 = yVar8.E();
                                        if (E2 > tVar2.e) {
                                            StringBuilder m16 = p1.m(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            m16.append(tVar2.e);
                                            throw v0.a(null, m16.toString());
                                        }
                                        if (A == 0) {
                                            boolean[] zArr2 = tVar2.l;
                                            i16 = 0;
                                            for (int i59 = 0; i59 < E2; i59++) {
                                                int A2 = yVar8.A();
                                                i16 += A2;
                                                zArr2[i59] = A2 > i58;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z21 = A > i58;
                                            i16 = A * E2;
                                            z10 = false;
                                            Arrays.fill(tVar2.l, 0, E2, z21);
                                        }
                                        Arrays.fill(tVar2.l, E2, tVar2.e, z10);
                                        if (i16 > 0) {
                                            tVar2.n.K(i16);
                                            tVar2.k = true;
                                            tVar2.o = true;
                                        }
                                    }
                                    h2.d e15 = cVar2.e(1935763823);
                                    if (e15 != null) {
                                        y yVar9 = e15.c;
                                        yVar9.N(8);
                                        int m17 = yVar9.m();
                                        byte[] bArr5 = d.a;
                                        if ((m17 & 1) == 1) {
                                            yVar9.O(8);
                                        }
                                        int E3 = yVar9.E();
                                        if (E3 != 1) {
                                            throw v0.a(null, "Unexpected saio entry count: " + E3);
                                        }
                                        tVar2.c += d.e(m17) == 0 ? yVar9.C() : yVar9.G();
                                    }
                                    h2.d e16 = cVar2.e(1936027235);
                                    if (e16 != null) {
                                        j(e16.c, 0, tVar2);
                                    }
                                    String str3 = sVar != null ? sVar.b : null;
                                    y yVar10 = null;
                                    y yVar11 = null;
                                    for (int i60 = 0; i60 < arrayList12.size(); i60++) {
                                        h2.d dVar4 = (h2.d) arrayList12.get(i60);
                                        y yVar12 = dVar4.c;
                                        int i61 = dVar4.b;
                                        if (i61 == 1935828848) {
                                            yVar12.N(12);
                                            if (yVar12.m() == 1936025959) {
                                                yVar10 = yVar12;
                                            }
                                        } else if (i61 == 1936158820) {
                                            yVar12.N(12);
                                            if (yVar12.m() == 1936025959) {
                                                yVar11 = yVar12;
                                            }
                                        }
                                    }
                                    if (yVar10 != null && yVar11 != null) {
                                        yVar10.N(8);
                                        int e17 = d.e(yVar10.m());
                                        yVar10.O(4);
                                        if (e17 == 1) {
                                            yVar10.O(4);
                                        }
                                        if (yVar10.m() != 1) {
                                            throw v0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        yVar11.N(8);
                                        int e18 = d.e(yVar11.m());
                                        yVar11.O(4);
                                        if (e18 == 1) {
                                            if (yVar11.C() == 0) {
                                                throw v0.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e18 >= 2) {
                                            yVar11.O(4);
                                        }
                                        if (yVar11.C() != 1) {
                                            throw v0.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        yVar11.O(1);
                                        int A3 = yVar11.A();
                                        int i62 = (A3 & hs.P3) >> 4;
                                        int i63 = A3 & 15;
                                        boolean z22 = yVar11.A() == 1;
                                        if (z22) {
                                            int A4 = yVar11.A();
                                            byte[] bArr6 = new byte[16];
                                            yVar11.k(0, 16, bArr6);
                                            if (A4 == 0) {
                                                int A5 = yVar11.A();
                                                byte[] bArr7 = new byte[A5];
                                                yVar11.k(0, A5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            tVar2.k = true;
                                            tVar2.m = new s(z22, str3, A4, bArr6, i62, i63, bArr);
                                            size = arrayList12.size();
                                            for (i15 = 0; i15 < size; i15++) {
                                                h2.d dVar5 = (h2.d) arrayList12.get(i15);
                                                if (dVar5.b == 1970628964) {
                                                    y yVar13 = dVar5.c;
                                                    yVar13.N(8);
                                                    byte[] bArr8 = this.h;
                                                    yVar13.k(0, 16, bArr8);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        j(yVar13, 16, tVar2);
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
                d2.s i64 = i(arrayList8);
                if (i64 != null) {
                    int size6 = sparseArray.size();
                    for (int i65 = 0; i65 < size6; i65++) {
                        h hVar4 = (h) sparseArray.valueAt(i65);
                        r rVar5 = hVar4.d.a;
                        e eVar7 = hVar4.b.a;
                        String str4 = n0.a;
                        s sVar2 = rVar5.l[eVar7.a];
                        d2.s a11 = i64.a(sVar2 != null ? sVar2.b : null);
                        d2.u a12 = hVar4.j.a();
                        a12.v = a11;
                        hVar4.a.g(new v(a12));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i66 = 0; i66 < size7; i66++) {
                        h hVar5 = (h) sparseArray.valueAt(i66);
                        long j21 = this.z;
                        int i67 = hVar5.f;
                        while (true) {
                            t tVar3 = hVar5.b;
                            if (i67 < tVar3.e && tVar3.i[i67] <= j21) {
                                if (tVar3.j[i67]) {
                                    hVar5.i = i67;
                                }
                                i67++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((h2.c) arrayDeque.peek()).e.add(cVar);
            }
        }
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
