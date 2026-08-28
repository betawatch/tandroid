package u3;

import android.util.Pair;
import android.util.SparseArray;
import d5.e0;
import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m3.t;
import m3.w;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements m3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int a;
    public final List b;
    public final byte[] g;
    public final y h;
    public final e0 i;
    public final w n;
    public int o;
    public int p;
    public long q;
    public int r;
    public y s;
    public long t;
    public int u;
    public h y;
    public int z;
    public final we.b j = new we.b(6, (byte) 0);
    public final y k = new y(16);
    public final y d = new y(d5.a.d);
    public final y e = new y(5);
    public final y f = new y();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray c = new SparseArray();
    public long w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long x = -9223372036854775807L;
    public m3.m D = m3.m.t;
    public w[] E = new w[0];
    public w[] F = new w[0];

    static {
        s0 s0Var = new s0();
        s0Var.o = "application/x-emsg";
        I = new t0(s0Var);
    }

    public i(int i9, e0 e0Var, List list, m4.n nVar) {
        this.a = i9;
        this.i = e0Var;
        this.b = DesugarCollections.unmodifiableList(list);
        this.n = nVar;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new y(bArr);
    }

    public static l3.c a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) list.get(i9);
            if (bVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.c.a;
                n5.e0 e10 = j.e(bArr);
                UUID uuid = e10 == null ? null : (UUID) e10.b;
                if (uuid == null) {
                    d5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new l3.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new l3.c(null, false, (l3.b[]) arrayList.toArray(new l3.b[0]));
    }

    public static void d(y yVar, int i9, q qVar) {
        yVar.C(i9 + 8);
        int e10 = yVar.e();
        if ((e10 & 1) != 0) {
            throw t1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (e10 & 2) != 0;
        int u10 = yVar.u();
        if (u10 == 0) {
            Arrays.fill(qVar.l, 0, qVar.e, false);
            return;
        }
        int i10 = qVar.e;
        y yVar2 = qVar.n;
        if (u10 != i10) {
            StringBuilder p6 = r0.p(u10, "Senc sample count ", " is different from fragment sample count");
            p6.append(qVar.e);
            throw t1.a(p6.toString(), null);
        }
        Arrays.fill(qVar.l, 0, u10, z10);
        yVar2.z(yVar.a());
        qVar.k = true;
        qVar.o = true;
        yVar.c(0, yVar2.c, yVar2.a);
        yVar2.C(0);
        qVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0129, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        r33.z = r4 - 8;
        ((m3.h) r34).u(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0145, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.B) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0147, code lost:
    
        r33.A = r2.c(r33.z, 7);
        r4 = r33.z;
        r7 = r33.h;
        j3.b.c(r4, r7);
        r2.a.a(7, r7);
        r33.A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x016a, code lost:
    
        r33.z += r33.A;
        r33.o = 4;
        r33.B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0162, code lost:
    
        r33.A = r2.c(r33.z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00de, code lost:
    
        r4 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0176, code lost:
    
        r4 = r2.d;
        r6 = r4.a;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017e, code lost:
    
        if (r2.l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0180, code lost:
    
        r13 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018d, code lost:
    
        if (r15 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018f, code lost:
    
        r13 = r15.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0193, code lost:
    
        r4 = r6.j;
        r6 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0197, code lost:
    
        if (r4 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0199, code lost:
    
        r9 = r33.e;
        r11 = r9.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[r35] = 0;
        r8 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01af, code lost:
    
        if (r33.A >= r33.z) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b1, code lost:
    
        r5 = r33.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b6, code lost:
    
        if (r5 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b8, code lost:
    
        r30 = r12;
        ((m3.h) r34).d(r11, r4, r8, false);
        r9.C(0);
        r5 = r9.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c9, code lost:
    
        if (r5 < 1) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cb, code lost:
    
        r33.B = r5 - 1;
        r5 = r33.d;
        r5.C(0);
        r7.a(4, r5);
        r7.a(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e0, code lost:
    
        if (r33.F.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e2, code lost:
    
        r5 = r6.B;
        r19 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ed, code lost:
    
        if (org.telegram.messenger.MediaController.VIDEO_MIME_TYPE.equals(r5) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ef, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f4, code lost:
    
        if ((r19 & 31) == 6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0210, code lost:
    
        r33.C = r5;
        r33.A += 5;
        r33.z += r35;
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0220, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01fe, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0208, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f7, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020c, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x022b, code lost:
    
        throw h3.t1.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x022c, code lost:
    
        r35 = r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0233, code lost:
    
        if (r33.C == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0235, code lost:
    
        r12 = r33.f;
        r12.z(r5);
        r19 = r8;
        r22 = r9;
        ((m3.h) r34).d(r12.a, 0, r33.B, false);
        r7.a(r33.B, r12);
        r4 = r33.B;
        r5 = d5.a.J(r12.c, r12.a);
        r12.C("video/hevc".equals(r6.B) ? 1 : 0);
        r12.B(r5);
        g7.p.a(r13, r12, r33.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0273, code lost:
    
        r33.A += r4;
        r33.B -= r4;
        r4 = r35;
        r8 = r19;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x026a, code lost:
    
        r19 = r8;
        r22 = r9;
        r4 = r7.b(r34, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0284, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x029d, code lost:
    
        if (r2.l != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029f, code lost:
    
        r11 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b7, code lost:
    
        if (r2.a() == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b9, code lost:
    
        r11 = r11 | org.telegram.tgnet.TLObject.FLAG_30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bc, code lost:
    
        r25 = r11;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c2, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c4, code lost:
    
        r28 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cb, code lost:
    
        r23 = r13;
        r7.e(r23, r25, r33.z, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dc, code lost:
    
        if (r30.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02de, code lost:
    
        r1 = (u3.g) r30.removeFirst();
        r33.u -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ef, code lost:
    
        if (r1.b == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02f1, code lost:
    
        r3 = r3 + r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f3, code lost:
    
        if (r15 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f5, code lost:
    
        r3 = r15.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f9, code lost:
    
        r6 = r3;
        r3 = r33.E;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fe, code lost:
    
        if (r12 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0300, code lost:
    
        r3[r12].e(r6, 1, r1.c, r33.u, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0312, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0314, code lost:
    
        r33.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0317, code lost:
    
        r33.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02c9, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ae, code lost:
    
        if (r3.j[r2.f] == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b0, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02b2, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0287, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0289, code lost:
    
        r4 = r33.A;
        r5 = r33.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x028d, code lost:
    
        if (r4 >= r5) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x028f, code lost:
    
        r33.A += r7.b(r34, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0187, code lost:
    
        r13 = r3.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        if (r33.o != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r2.l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d5, code lost:
    
        r4 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        r33.z = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ea, code lost:
    
        if (r2.f >= r2.i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ec, code lost:
    
        ((m3.h) r34).u(r4);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r4 = r3.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fc, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        r4.D(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0101, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0105, code lost:
    
        if (r3.k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010b, code lost:
    
        if (r3.l[r1] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        r4.D(r4.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011a, code lost:
    
        if (r2.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011c, code lost:
    
        r33.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011e, code lost:
    
        r33.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0121, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(m3.l lVar, m3.n nVar) {
        String m10;
        String m11;
        long j10;
        long j11;
        long O;
        long s10;
        long v;
        long v4;
        char c10;
        loop0: while (true) {
            while (true) {
                int i9 = this.o;
                ArrayDeque arrayDeque = this.l;
                SparseArray sparseArray = this.c;
                if (i9 != 0) {
                    ArrayDeque arrayDeque2 = this.m;
                    e0 e0Var = this.i;
                    if (i9 != 1) {
                        long j12 = Long.MAX_VALUE;
                        if (i9 != 2) {
                            h hVar = this.y;
                            if (hVar != null) {
                                c10 = 2;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            long j13 = Long.MAX_VALUE;
                            h hVar2 = null;
                            for (int i10 = 0; i10 < size; i10++) {
                                h hVar3 = (h) sparseArray.valueAt(i10);
                                boolean z10 = hVar3.l;
                                q qVar = hVar3.b;
                                if ((z10 || hVar3.f != hVar3.d.b) && (!z10 || hVar3.h != qVar.d)) {
                                    long j14 = !z10 ? hVar3.d.c[hVar3.f] : qVar.f[hVar3.h];
                                    if (j14 < j13) {
                                        hVar2 = hVar3;
                                        j13 = j14;
                                    }
                                }
                            }
                            c10 = 2;
                            if (hVar2 == null) {
                                int i11 = (int) (this.t - ((m3.h) lVar).d);
                                if (i11 < 0) {
                                    throw t1.a("Offset to end of mdat was negative.", null);
                                }
                                ((m3.h) lVar).u(i11);
                                this.o = 0;
                                this.r = 0;
                            } else {
                                int i12 = (int) ((!hVar2.l ? hVar2.d.c[hVar2.f] : hVar2.b.f[hVar2.h]) - ((m3.h) lVar).d);
                                if (i12 < 0) {
                                    d5.a.K("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i12 = 0;
                                }
                                ((m3.h) lVar).u(i12);
                                this.y = hVar2;
                                hVar = hVar2;
                            }
                        } else {
                            int size2 = sparseArray.size();
                            h hVar4 = null;
                            for (int i13 = 0; i13 < size2; i13++) {
                                q qVar2 = ((h) sparseArray.valueAt(i13)).b;
                                if (qVar2.o) {
                                    long j15 = qVar2.c;
                                    if (j15 < j12) {
                                        hVar4 = (h) sparseArray.valueAt(i13);
                                        j12 = j15;
                                    }
                                }
                            }
                            if (hVar4 == null) {
                                this.o = 3;
                            } else {
                                int i14 = (int) (j12 - ((m3.h) lVar).d);
                                if (i14 < 0) {
                                    throw t1.a("Offset to encryption data was negative.", null);
                                }
                                m3.h hVar5 = (m3.h) lVar;
                                hVar5.u(i14);
                                q qVar3 = hVar4.b;
                                y yVar = qVar3.n;
                                hVar5.d(yVar.a, 0, yVar.c, false);
                                yVar.C(0);
                                qVar3.o = false;
                            }
                        }
                    } else {
                        int i15 = ((int) this.q) - this.r;
                        y yVar2 = this.s;
                        if (yVar2 != null) {
                            ((m3.h) lVar).d(yVar2.a, 8, i15, false);
                            int i16 = this.p;
                            b bVar = new b(i16, yVar2);
                            long j16 = ((m3.h) lVar).d;
                            if (!arrayDeque.isEmpty()) {
                                ((a) arrayDeque.peek()).d.add(bVar);
                            } else if (i16 == 1936286840) {
                                yVar2.C(8);
                                int b10 = lc.k.b(yVar2.e());
                                yVar2.D(4);
                                long s11 = yVar2.s();
                                if (b10 == 0) {
                                    v = yVar2.s();
                                    v4 = yVar2.s();
                                } else {
                                    v = yVar2.v();
                                    v4 = yVar2.v();
                                }
                                long j17 = v4 + j16;
                                long j18 = v;
                                long O2 = f0.O(j18, 1000000L, s11);
                                yVar2.D(2);
                                int w8 = yVar2.w();
                                int[] iArr = new int[w8];
                                long[] jArr = new long[w8];
                                long[] jArr2 = new long[w8];
                                long[] jArr3 = new long[w8];
                                long j19 = O2;
                                long j20 = j18;
                                int i17 = 0;
                                while (i17 < w8) {
                                    int e10 = yVar2.e();
                                    if ((e10 & TLObject.FLAG_31) != 0) {
                                        throw t1.a("Unhandled indirect reference", null);
                                    }
                                    long s12 = yVar2.s();
                                    iArr[i17] = e10 & ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    jArr[i17] = j17;
                                    jArr3[i17] = j19;
                                    long j21 = j20 + s12;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i18 = i17;
                                    j19 = f0.O(j21, 1000000L, s11);
                                    jArr4[i18] = j19 - jArr5[i18];
                                    yVar2.D(4);
                                    j17 += iArr[i18];
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    i17 = i18 + 1;
                                    O2 = O2;
                                    j20 = j21;
                                }
                                Pair create = Pair.create(Long.valueOf(O2), new m3.f(iArr, jArr, jArr2, jArr3));
                                this.x = ((Long) create.first).longValue();
                                this.D.y((t) create.second);
                                this.G = true;
                            } else if (i16 == 1701671783 && this.E.length != 0) {
                                yVar2.C(8);
                                int b11 = lc.k.b(yVar2.e());
                                if (b11 == 0) {
                                    m10 = yVar2.m();
                                    m10.getClass();
                                    m11 = yVar2.m();
                                    m11.getClass();
                                    long s13 = yVar2.s();
                                    long O3 = f0.O(yVar2.s(), 1000000L, s13);
                                    long j22 = this.x;
                                    long j23 = j22 != -9223372036854775807L ? j22 + O3 : -9223372036854775807L;
                                    j10 = O3;
                                    j11 = j23;
                                    O = f0.O(yVar2.s(), 1000L, s13);
                                    s10 = yVar2.s();
                                } else if (b11 != 1) {
                                    e2.c.t(b11, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long s14 = yVar2.s();
                                    j11 = f0.O(yVar2.v(), 1000000L, s14);
                                    long O4 = f0.O(yVar2.s(), 1000L, s14);
                                    long s15 = yVar2.s();
                                    m10 = yVar2.m();
                                    m10.getClass();
                                    m11 = yVar2.m();
                                    m11.getClass();
                                    O = O4;
                                    s10 = s15;
                                    j10 = -9223372036854775807L;
                                }
                                String str = m10;
                                String str2 = m11;
                                byte[] bArr = new byte[yVar2.a()];
                                yVar2.c(0, yVar2.a(), bArr);
                                y yVar3 = new y(this.j.A(new b4.a(str, str2, O, s10, bArr)));
                                int a2 = yVar3.a();
                                for (w wVar : this.E) {
                                    yVar3.C(0);
                                    wVar.a(a2, yVar3);
                                }
                                if (j11 == -9223372036854775807L) {
                                    arrayDeque2.addLast(new g(a2, j10, true));
                                    this.u += a2;
                                } else if (arrayDeque2.isEmpty()) {
                                    if (e0Var != null) {
                                        j11 = e0Var.a(j11);
                                    }
                                    long j24 = j11;
                                    for (w wVar2 : this.E) {
                                        wVar2.e(j24, 1, a2, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new g(a2, j11, false));
                                    this.u += a2;
                                }
                            }
                        } else {
                            ((m3.h) lVar).u(i15);
                        }
                        e(((m3.h) lVar).d);
                    }
                } else {
                    int i19 = this.r;
                    y yVar4 = this.k;
                    if (i19 == 0) {
                        if (!((m3.h) lVar).d(yVar4.a, 0, 8, true)) {
                            return -1;
                        }
                        this.r = 8;
                        yVar4.C(0);
                        this.q = yVar4.s();
                        this.p = yVar4.e();
                    }
                    long j25 = this.q;
                    if (j25 == 1) {
                        ((m3.h) lVar).d(yVar4.a, 8, 8, false);
                        this.r += 8;
                        this.q = yVar4.v();
                    } else if (j25 == 0) {
                        long j26 = ((m3.h) lVar).c;
                        if (j26 == -1 && !arrayDeque.isEmpty()) {
                            j26 = ((a) arrayDeque.peek()).c;
                        }
                        if (j26 != -1) {
                            this.q = (j26 - ((m3.h) lVar).d) + this.r;
                        }
                    }
                    long j27 = this.q;
                    int i20 = this.r;
                    if (j27 < i20) {
                        throw t1.c("Atom size less than header length (unsupported).");
                    }
                    long j28 = ((m3.h) lVar).d - i20;
                    int i21 = this.p;
                    if ((i21 == 1836019558 || i21 == 1835295092) && !this.G) {
                        this.D.y(new m3.o(this.w, j28));
                        this.G = true;
                    }
                    if (this.p == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            q qVar4 = ((h) sparseArray.valueAt(i22)).b;
                            qVar4.getClass();
                            qVar4.c = j28;
                            qVar4.b = j28;
                        }
                    }
                    int i23 = this.p;
                    if (i23 == 1835295092) {
                        this.y = null;
                        this.t = j28 + this.q;
                        this.o = 2;
                    } else if (i23 == 1836019574 || i23 == 1953653099 || i23 == 1835297121 || i23 == 1835626086 || i23 == 1937007212 || i23 == 1836019558 || i23 == 1953653094 || i23 == 1836475768 || i23 == 1701082227) {
                        long j29 = (((m3.h) lVar).d + this.q) - 8;
                        arrayDeque.push(new a(i23, j29));
                        if (this.q == this.r) {
                            e(j29);
                        } else {
                            this.o = 0;
                            this.r = 0;
                        }
                    } else if (i23 == 1751411826 || i23 == 1835296868 || i23 == 1836476516 || i23 == 1936286840 || i23 == 1937011556 || i23 == 1937011827 || i23 == 1668576371 || i23 == 1937011555 || i23 == 1937011578 || i23 == 1937013298 || i23 == 1937007471 || i23 == 1668232756 || i23 == 1937011571 || i23 == 1952867444 || i23 == 1952868452 || i23 == 1953196132 || i23 == 1953654136 || i23 == 1953658222 || i23 == 1886614376 || i23 == 1935763834 || i23 == 1935763823 || i23 == 1936027235 || i23 == 1970628964 || i23 == 1935828848 || i23 == 1936158820 || i23 == 1701606260 || i23 == 1835362404 || i23 == 1701671783) {
                        if (this.r != 8) {
                            throw t1.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.q > 2147483647L) {
                            throw t1.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        y yVar5 = new y((int) this.q);
                        System.arraycopy(yVar4.a, 0, yVar5.a, 0, 8);
                        this.s = yVar5;
                        this.o = 1;
                    } else {
                        if (this.q > 2147483647L) {
                            throw t1.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.s = null;
                        this.o = 1;
                    }
                }
            }
        }
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        int i9;
        this.D = mVar;
        int i10 = 0;
        this.o = 0;
        this.r = 0;
        w[] wVarArr = new w[2];
        this.E = wVarArr;
        w wVar = this.n;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i11 = 100;
        if ((this.a & 4) != 0) {
            wVarArr[i9] = mVar.I(100, 5);
            i11 = 101;
            i9++;
        }
        w[] wVarArr2 = (w[]) f0.J(i9, this.E);
        this.E = wVarArr2;
        for (w wVar2 : wVarArr2) {
            wVar2.c(I);
        }
        List list = this.b;
        this.F = new w[list.size()];
        while (i10 < this.F.length) {
            w I2 = this.D.I(i11, 3);
            I2.c((t0) list.get(i10));
            this.F[i10] = I2;
            i10++;
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0711, code lost:
    
        r50.o = 0;
        r50.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0716, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:246:0x062b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j10) {
        f fVar;
        f fVar2;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        boolean z10;
        int i15;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i16;
        int i17;
        int i18;
        f fVar3;
        int i19;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).c != j10) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i20 = aVar.b;
            ArrayList arrayList6 = aVar.e;
            ArrayList arrayList7 = aVar.d;
            int i21 = this.a;
            int i22 = 12;
            SparseArray sparseArray = this.c;
            if (i20 == 1836019574) {
                l3.c a2 = a(arrayList7);
                a e10 = aVar.e(1836475768);
                e10.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = e10.d;
                int size2 = arrayList8.size();
                int i23 = 0;
                long j11 = -9223372036854775807L;
                while (i23 < size2) {
                    b bVar = (b) arrayList8.get(i23);
                    int i24 = bVar.b;
                    y yVar = bVar.c;
                    if (i24 == 1953654136) {
                        yVar.C(i22);
                        arrayList = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(yVar.e()), new f(yVar.e() - 1, yVar.e(), yVar.e(), yVar.e()));
                        sparseArray2.put(((Integer) create.first).intValue(), (f) create.second);
                    } else {
                        arrayList = arrayList8;
                        if (i24 == 1835362404) {
                            yVar.C(8);
                            j11 = lc.k.b(yVar.e()) == 0 ? yVar.s() : yVar.v();
                        }
                    }
                    i23++;
                    arrayList8 = arrayList;
                    i22 = 12;
                }
                ArrayList e11 = e.e(aVar, new m3.q(), j11, a2, (i21 & 16) != 0, false, new t0.c(this, 3));
                int size3 = e11.size();
                if (sparseArray.size() == 0) {
                    for (int i25 = 0; i25 < size3; i25++) {
                        r rVar = (r) e11.get(i25);
                        o oVar = rVar.a;
                        m3.m mVar = this.D;
                        int i26 = oVar.b;
                        int i27 = oVar.a;
                        w I2 = mVar.I(i25, i26);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar = (f) sparseArray2.get(i27);
                            fVar.getClass();
                        }
                        sparseArray.put(i27, new h(I2, rVar, fVar));
                        this.w = Math.max(this.w, oVar.e);
                    }
                    this.D.B();
                } else {
                    d5.a.i(sparseArray.size() == size3);
                    for (int i28 = 0; i28 < size3; i28++) {
                        r rVar2 = (r) e11.get(i28);
                        o oVar2 = rVar2.a;
                        h hVar = (h) sparseArray.get(oVar2.a);
                        int i29 = oVar2.a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i29);
                            fVar2.getClass();
                        }
                        hVar.d = rVar2;
                        hVar.e = fVar2;
                        hVar.a.c(rVar2.a.f);
                        hVar.d();
                    }
                }
            } else if (i20 == 1836019558) {
                int size4 = arrayList6.size();
                int i30 = 0;
                while (i30 < size4) {
                    a aVar2 = (a) arrayList6.get(i30);
                    if (aVar2.b == 1953653094) {
                        b f10 = aVar2.f(1952868452);
                        ArrayList arrayList9 = aVar2.d;
                        f10.getClass();
                        y yVar2 = f10.c;
                        yVar2.C(8);
                        int e12 = yVar2.e();
                        h hVar2 = (h) sparseArray.get(yVar2.e());
                        if (hVar2 == null) {
                            i9 = size4;
                            hVar2 = null;
                        } else {
                            q qVar = hVar2.b;
                            if ((e12 & 1) != 0) {
                                long v = yVar2.v();
                                qVar.b = v;
                                qVar.c = v;
                            }
                            f fVar4 = hVar2.e;
                            int e13 = (e12 & 2) != 0 ? yVar2.e() - 1 : fVar4.a;
                            int e14 = (e12 & 8) != 0 ? yVar2.e() : fVar4.b;
                            if ((e12 & 16) != 0) {
                                i9 = size4;
                                i11 = yVar2.e();
                            } else {
                                i9 = size4;
                                i11 = fVar4.c;
                            }
                            qVar.a = new f(e13, e14, i11, (e12 & 32) != 0 ? yVar2.e() : fVar4.d);
                        }
                        if (hVar2 == null) {
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i10 = i30;
                        } else {
                            q qVar2 = hVar2.b;
                            long j12 = qVar2.p;
                            boolean z11 = qVar2.q;
                            hVar2.d();
                            hVar2.l = true;
                            b f11 = aVar2.f(1952867444);
                            if (f11 == null || (i21 & 2) != 0) {
                                qVar2.p = j12;
                                qVar2.q = z11;
                            } else {
                                y yVar3 = f11.c;
                                yVar3.C(8);
                                qVar2.p = lc.k.b(yVar3.e()) == 1 ? yVar3.v() : yVar3.s();
                                qVar2.q = true;
                            }
                            int size5 = arrayList9.size();
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            while (true) {
                                i12 = 1953658222;
                                if (i31 >= size5) {
                                    break;
                                }
                                b bVar2 = (b) arrayList9.get(i31);
                                int i34 = i31;
                                if (bVar2.b == 1953658222) {
                                    y yVar4 = bVar2.c;
                                    yVar4.C(12);
                                    int u10 = yVar4.u();
                                    if (u10 > 0) {
                                        i33 += u10;
                                        i32++;
                                    }
                                }
                                i31 = i34 + 1;
                            }
                            hVar2.h = 0;
                            hVar2.g = 0;
                            hVar2.f = 0;
                            qVar2.d = i32;
                            qVar2.e = i33;
                            if (qVar2.g.length < i32) {
                                qVar2.f = new long[i32];
                                qVar2.g = new int[i32];
                            }
                            if (qVar2.h.length < i33) {
                                int i35 = (i33 * 125) / 100;
                                qVar2.h = new int[i35];
                                qVar2.i = new long[i35];
                                qVar2.j = new boolean[i35];
                                qVar2.l = new boolean[i35];
                            }
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            while (true) {
                                long j13 = 0;
                                if (i36 < size5) {
                                    b bVar3 = (b) arrayList9.get(i36);
                                    int i39 = size5;
                                    if (bVar3.b == i12) {
                                        int i40 = i37 + 1;
                                        y yVar5 = bVar3.c;
                                        yVar5.C(8);
                                        int e15 = yVar5.e();
                                        o oVar3 = hVar2.d.a;
                                        i15 = i36;
                                        f fVar5 = qVar2.a;
                                        int i41 = f0.a;
                                        arrayList4 = arrayList6;
                                        qVar2.g[i37] = yVar5.u();
                                        long[] jArr = qVar2.f;
                                        arrayList5 = arrayList7;
                                        long j14 = qVar2.b;
                                        jArr[i37] = j14;
                                        if ((e15 & 1) != 0) {
                                            jArr[i37] = j14 + yVar5.e();
                                        }
                                        boolean z12 = (e15 & 4) != 0;
                                        int i42 = fVar5.d;
                                        if (z12) {
                                            i42 = yVar5.e();
                                        }
                                        boolean z13 = z12;
                                        boolean z14 = (e15 & 256) != 0;
                                        boolean z15 = (e15 & 512) != 0;
                                        boolean z16 = (e15 & 1024) != 0;
                                        boolean z17 = (e15 & 2048) != 0;
                                        boolean z18 = z16;
                                        long[] jArr2 = oVar3.h;
                                        int i43 = i42;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            j13 = oVar3.i[0];
                                        }
                                        int[] iArr = qVar2.h;
                                        long[] jArr3 = qVar2.i;
                                        boolean[] zArr = qVar2.j;
                                        boolean z19 = oVar3.b == 2 && (i21 & 1) != 0;
                                        int i44 = qVar2.g[i37] + i38;
                                        i16 = i30;
                                        long j15 = oVar3.c;
                                        long j16 = qVar2.p;
                                        while (i38 < i44) {
                                            int e16 = z14 ? yVar5.e() : fVar5.b;
                                            boolean z20 = z19;
                                            if (e16 < 0) {
                                                throw t1.a("Unexpected negative value: " + e16, null);
                                            }
                                            if (z15) {
                                                i17 = i44;
                                                i18 = yVar5.e();
                                            } else {
                                                i17 = i44;
                                                i18 = fVar5.c;
                                            }
                                            if (i18 < 0) {
                                                throw t1.a("Unexpected negative value: " + i18, null);
                                            }
                                            int e17 = z18 ? yVar5.e() : (i38 == 0 && z13) ? i43 : fVar5.d;
                                            if (z17) {
                                                fVar3 = fVar5;
                                                i19 = yVar5.e();
                                            } else {
                                                fVar3 = fVar5;
                                                i19 = 0;
                                            }
                                            int i45 = e17;
                                            long O = f0.O((i19 + j16) - j13, 1000000L, j15);
                                            jArr3[i38] = O;
                                            if (!qVar2.q) {
                                                jArr3[i38] = O + hVar2.d.h;
                                            }
                                            iArr[i38] = i18;
                                            zArr[i38] = ((i45 >> 16) & 1) == 0 && (!z20 || i38 == 0);
                                            j16 += e16;
                                            i38++;
                                            z19 = z20;
                                            i44 = i17;
                                            fVar5 = fVar3;
                                        }
                                        qVar2.p = j16;
                                        i37 = i40;
                                        i38 = i44;
                                    } else {
                                        i15 = i36;
                                        arrayList4 = arrayList6;
                                        arrayList5 = arrayList7;
                                        i16 = i30;
                                    }
                                    i36 = i15 + 1;
                                    size5 = i39;
                                    arrayList6 = arrayList4;
                                    arrayList7 = arrayList5;
                                    i30 = i16;
                                    i12 = 1953658222;
                                } else {
                                    arrayList2 = arrayList6;
                                    arrayList3 = arrayList7;
                                    i10 = i30;
                                    o oVar4 = hVar2.d.a;
                                    f fVar6 = qVar2.a;
                                    fVar6.getClass();
                                    p pVar = oVar4.k[fVar6.a];
                                    b f12 = aVar2.f(1935763834);
                                    if (f12 != null) {
                                        pVar.getClass();
                                        y yVar6 = f12.c;
                                        int i46 = pVar.d;
                                        yVar6.C(8);
                                        if ((yVar6.e() & 1) == 1) {
                                            yVar6.D(8);
                                        }
                                        int r10 = yVar6.r();
                                        int u11 = yVar6.u();
                                        if (u11 > qVar2.e) {
                                            StringBuilder p6 = r0.p(u11, "Saiz sample count ", " is greater than fragment sample count");
                                            p6.append(qVar2.e);
                                            throw t1.a(p6.toString(), null);
                                        }
                                        if (r10 == 0) {
                                            boolean[] zArr2 = qVar2.l;
                                            i14 = 0;
                                            for (int i47 = 0; i47 < u11; i47++) {
                                                int r11 = yVar6.r();
                                                i14 += r11;
                                                zArr2[i47] = r11 > i46;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z21 = r10 > i46;
                                            i14 = r10 * u11;
                                            z10 = false;
                                            Arrays.fill(qVar2.l, 0, u11, z21);
                                        }
                                        Arrays.fill(qVar2.l, u11, qVar2.e, z10);
                                        if (i14 > 0) {
                                            qVar2.n.z(i14);
                                            qVar2.k = true;
                                            qVar2.o = true;
                                        }
                                    }
                                    b f13 = aVar2.f(1935763823);
                                    if (f13 != null) {
                                        y yVar7 = f13.c;
                                        yVar7.C(8);
                                        int e18 = yVar7.e();
                                        if ((e18 & 1) == 1) {
                                            yVar7.D(8);
                                        }
                                        int u12 = yVar7.u();
                                        if (u12 != 1) {
                                            throw t1.a("Unexpected saio entry count: " + u12, null);
                                        }
                                        qVar2.c += lc.k.b(e18) == 0 ? yVar7.s() : yVar7.v();
                                    }
                                    byte[] bArr = null;
                                    b f14 = aVar2.f(1936027235);
                                    if (f14 != null) {
                                        d(f14.c, 0, qVar2);
                                    }
                                    String str = pVar != null ? pVar.b : null;
                                    y yVar8 = null;
                                    y yVar9 = null;
                                    for (int i48 = 0; i48 < arrayList9.size(); i48++) {
                                        b bVar4 = (b) arrayList9.get(i48);
                                        y yVar10 = bVar4.c;
                                        int i49 = bVar4.b;
                                        if (i49 == 1935828848) {
                                            yVar10.C(12);
                                            if (yVar10.e() == 1936025959) {
                                                yVar9 = yVar10;
                                            }
                                        } else if (i49 == 1936158820) {
                                            yVar10.C(12);
                                            if (yVar10.e() == 1936025959) {
                                                yVar8 = yVar10;
                                            }
                                        }
                                    }
                                    if (yVar9 != null && yVar8 != null) {
                                        yVar9.C(8);
                                        int b10 = lc.k.b(yVar9.e());
                                        yVar9.D(4);
                                        if (b10 == 1) {
                                            yVar9.D(4);
                                        }
                                        if (yVar9.e() != 1) {
                                            throw t1.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        yVar8.C(8);
                                        int b11 = lc.k.b(yVar8.e());
                                        yVar8.D(4);
                                        if (b11 == 1) {
                                            if (yVar8.s() == 0) {
                                                throw t1.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (b11 >= 2) {
                                            yVar8.D(4);
                                        }
                                        if (yVar8.s() != 1) {
                                            throw t1.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        yVar8.D(1);
                                        int r12 = yVar8.r();
                                        int i50 = (r12 & 240) >> 4;
                                        int i51 = r12 & 15;
                                        boolean z22 = yVar8.r() == 1;
                                        if (z22) {
                                            int r13 = yVar8.r();
                                            byte[] bArr2 = new byte[16];
                                            yVar8.c(0, 16, bArr2);
                                            if (r13 == 0) {
                                                int r14 = yVar8.r();
                                                bArr = new byte[r14];
                                                yVar8.c(0, r14, bArr);
                                            }
                                            qVar2.k = true;
                                            qVar2.m = new p(z22, str, r13, bArr2, i50, i51, bArr);
                                            size = arrayList9.size();
                                            for (i13 = 0; i13 < size; i13++) {
                                                b bVar5 = (b) arrayList9.get(i13);
                                                if (bVar5.b == 1970628964) {
                                                    y yVar11 = bVar5.c;
                                                    yVar11.C(8);
                                                    byte[] bArr3 = this.g;
                                                    yVar11.c(0, 16, bArr3);
                                                    if (Arrays.equals(bArr3, H)) {
                                                        d(yVar11, 16, qVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList9.size();
                                    while (i13 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i9 = size4;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i10 = i30;
                    }
                    i30 = i10 + 1;
                    size4 = i9;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                }
                l3.c a3 = a(arrayList7);
                if (a3 != null) {
                    int size6 = sparseArray.size();
                    for (int i52 = 0; i52 < size6; i52++) {
                        h hVar3 = (h) sparseArray.valueAt(i52);
                        o oVar5 = hVar3.d.a;
                        f fVar7 = hVar3.b.a;
                        int i53 = f0.a;
                        p pVar2 = oVar5.k[fVar7.a];
                        l3.c a10 = a3.a(pVar2 != null ? pVar2.b : null);
                        s0 a11 = hVar3.d.a.f.a();
                        a11.r = a10;
                        hVar3.a.c(new t0(a11));
                    }
                }
                if (this.v != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i54 = 0; i54 < size7; i54++) {
                        h hVar4 = (h) sparseArray.valueAt(i54);
                        long j17 = this.v;
                        int i55 = hVar4.f;
                        while (true) {
                            q qVar3 = hVar4.b;
                            if (i55 < qVar3.e && qVar3.i[i55] <= j17) {
                                if (qVar3.j[i55]) {
                                    hVar4.i = i55;
                                }
                                i55++;
                            }
                        }
                    }
                    this.v = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.peek()).e.add(aVar);
            }
        }
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        return j.i(lVar, true, false);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((h) sparseArray.valueAt(i9)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j11;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    @Override // m3.k
    public final void release() {
    }
}
