package u3;

import android.util.Pair;
import android.util.SparseArray;
import d5.f0;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m3.t;
import m3.w;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final z h;
    public final f0 i;
    public final w n;
    public int o;
    public int p;
    public long q;
    public int r;
    public z s;
    public long t;
    public int u;
    public h y;
    public int z;
    public final xe.b j = new xe.b(7, (byte) 0);
    public final z k = new z(16);
    public final z d = new z(d5.a.d);
    public final z e = new z(5);
    public final z f = new z();
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

    public i(int i10, f0 f0Var, List list, m4.n nVar) {
        this.a = i10;
        this.i = f0Var;
        this.b = DesugarCollections.unmodifiableList(list);
        this.n = nVar;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new z(bArr);
    }

    public static l3.d a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.c.a;
                n1.d e9 = j.e(bArr);
                UUID uuid = e9 == null ? null : (UUID) e9.b;
                if (uuid == null) {
                    d5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new l3.c(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new l3.d(null, false, (l3.c[]) arrayList.toArray(new l3.c[0]));
    }

    public static void d(z zVar, int i10, r rVar) {
        zVar.C(i10 + 8);
        int e9 = zVar.e();
        if ((e9 & 1) != 0) {
            throw t1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (e9 & 2) != 0;
        int u10 = zVar.u();
        if (u10 == 0) {
            Arrays.fill(rVar.l, 0, rVar.e, false);
            return;
        }
        int i11 = rVar.e;
        z zVar2 = rVar.n;
        if (u10 != i11) {
            StringBuilder o10 = i0.a.o(u10, "Senc sample count ", " is different from fragment sample count");
            o10.append(rVar.e);
            throw t1.a(o10.toString(), null);
        }
        Arrays.fill(rVar.l, 0, u10, z10);
        zVar2.z(zVar.a());
        rVar.k = true;
        rVar.o = true;
        zVar.c(0, zVar2.c, zVar2.a);
        zVar2.C(0);
        rVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0129, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        r33.z = r4 - 8;
        ((m3.h) r34).t(8);
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
        h7.p.a(r13, r12, r33.F);
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
    
        ((m3.h) r34).t(r4);
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
                int i10 = this.o;
                ArrayDeque arrayDeque = this.l;
                SparseArray sparseArray = this.c;
                if (i10 != 0) {
                    ArrayDeque arrayDeque2 = this.m;
                    f0 f0Var = this.i;
                    if (i10 != 1) {
                        long j12 = Long.MAX_VALUE;
                        if (i10 != 2) {
                            h hVar = this.y;
                            if (hVar != null) {
                                c10 = 2;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            long j13 = Long.MAX_VALUE;
                            h hVar2 = null;
                            for (int i11 = 0; i11 < size; i11++) {
                                h hVar3 = (h) sparseArray.valueAt(i11);
                                boolean z10 = hVar3.l;
                                r rVar = hVar3.b;
                                if ((z10 || hVar3.f != hVar3.d.b) && (!z10 || hVar3.h != rVar.d)) {
                                    long j14 = !z10 ? hVar3.d.c[hVar3.f] : rVar.f[hVar3.h];
                                    if (j14 < j13) {
                                        hVar2 = hVar3;
                                        j13 = j14;
                                    }
                                }
                            }
                            c10 = 2;
                            if (hVar2 == null) {
                                int i12 = (int) (this.t - ((m3.h) lVar).d);
                                if (i12 < 0) {
                                    throw t1.a("Offset to end of mdat was negative.", null);
                                }
                                ((m3.h) lVar).t(i12);
                                this.o = 0;
                                this.r = 0;
                            } else {
                                int i13 = (int) ((!hVar2.l ? hVar2.d.c[hVar2.f] : hVar2.b.f[hVar2.h]) - ((m3.h) lVar).d);
                                if (i13 < 0) {
                                    d5.a.K("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i13 = 0;
                                }
                                ((m3.h) lVar).t(i13);
                                this.y = hVar2;
                                hVar = hVar2;
                            }
                        } else {
                            int size2 = sparseArray.size();
                            h hVar4 = null;
                            for (int i14 = 0; i14 < size2; i14++) {
                                r rVar2 = ((h) sparseArray.valueAt(i14)).b;
                                if (rVar2.o) {
                                    long j15 = rVar2.c;
                                    if (j15 < j12) {
                                        hVar4 = (h) sparseArray.valueAt(i14);
                                        j12 = j15;
                                    }
                                }
                            }
                            if (hVar4 == null) {
                                this.o = 3;
                            } else {
                                int i15 = (int) (j12 - ((m3.h) lVar).d);
                                if (i15 < 0) {
                                    throw t1.a("Offset to encryption data was negative.", null);
                                }
                                m3.h hVar5 = (m3.h) lVar;
                                hVar5.t(i15);
                                r rVar3 = hVar4.b;
                                z zVar = rVar3.n;
                                hVar5.d(zVar.a, 0, zVar.c, false);
                                zVar.C(0);
                                rVar3.o = false;
                            }
                        }
                    } else {
                        int i16 = ((int) this.q) - this.r;
                        z zVar2 = this.s;
                        if (zVar2 != null) {
                            ((m3.h) lVar).d(zVar2.a, 8, i16, false);
                            int i17 = this.p;
                            b bVar = new b(i17, zVar2);
                            long j16 = ((m3.h) lVar).d;
                            if (!arrayDeque.isEmpty()) {
                                ((a) arrayDeque.peek()).d.add(bVar);
                            } else if (i17 == 1936286840) {
                                zVar2.C(8);
                                int b10 = mc.k.b(zVar2.e());
                                zVar2.D(4);
                                long s11 = zVar2.s();
                                if (b10 == 0) {
                                    v = zVar2.s();
                                    v4 = zVar2.s();
                                } else {
                                    v = zVar2.v();
                                    v4 = zVar2.v();
                                }
                                long j17 = v4 + j16;
                                long j18 = v;
                                long O2 = g0.O(j18, 1000000L, s11);
                                zVar2.D(2);
                                int w10 = zVar2.w();
                                int[] iArr = new int[w10];
                                long[] jArr = new long[w10];
                                long[] jArr2 = new long[w10];
                                long[] jArr3 = new long[w10];
                                long j19 = O2;
                                long j20 = j18;
                                int i18 = 0;
                                while (i18 < w10) {
                                    int e9 = zVar2.e();
                                    if ((e9 & TLObject.FLAG_31) != 0) {
                                        throw t1.a("Unhandled indirect reference", null);
                                    }
                                    long s12 = zVar2.s();
                                    iArr[i18] = e9 & ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    jArr[i18] = j17;
                                    jArr3[i18] = j19;
                                    long j21 = j20 + s12;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i19 = i18;
                                    j19 = g0.O(j21, 1000000L, s11);
                                    jArr4[i19] = j19 - jArr5[i19];
                                    zVar2.D(4);
                                    j17 += iArr[i19];
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    i18 = i19 + 1;
                                    O2 = O2;
                                    j20 = j21;
                                }
                                Pair create = Pair.create(Long.valueOf(O2), new m3.f(iArr, jArr, jArr2, jArr3));
                                this.x = ((Long) create.first).longValue();
                                this.D.n((t) create.second);
                                this.G = true;
                            } else if (i17 == 1701671783 && this.E.length != 0) {
                                zVar2.C(8);
                                int b11 = mc.k.b(zVar2.e());
                                if (b11 == 0) {
                                    m10 = zVar2.m();
                                    m10.getClass();
                                    m11 = zVar2.m();
                                    m11.getClass();
                                    long s13 = zVar2.s();
                                    long O3 = g0.O(zVar2.s(), 1000000L, s13);
                                    long j22 = this.x;
                                    long j23 = j22 != -9223372036854775807L ? j22 + O3 : -9223372036854775807L;
                                    j10 = O3;
                                    j11 = j23;
                                    O = g0.O(zVar2.s(), 1000L, s13);
                                    s10 = zVar2.s();
                                } else if (b11 != 1) {
                                    com.google.android.recaptcha.internal.a.s(b11, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long s14 = zVar2.s();
                                    j11 = g0.O(zVar2.v(), 1000000L, s14);
                                    long O4 = g0.O(zVar2.s(), 1000L, s14);
                                    long s15 = zVar2.s();
                                    m10 = zVar2.m();
                                    m10.getClass();
                                    m11 = zVar2.m();
                                    m11.getClass();
                                    O = O4;
                                    s10 = s15;
                                    j10 = -9223372036854775807L;
                                }
                                String str = m10;
                                String str2 = m11;
                                byte[] bArr = new byte[zVar2.a()];
                                zVar2.c(0, zVar2.a(), bArr);
                                z zVar3 = new z(this.j.A(new b4.a(str, str2, O, s10, bArr)));
                                int a2 = zVar3.a();
                                for (w wVar : this.E) {
                                    zVar3.C(0);
                                    wVar.a(a2, zVar3);
                                }
                                if (j11 == -9223372036854775807L) {
                                    arrayDeque2.addLast(new g(a2, j10, true));
                                    this.u += a2;
                                } else if (arrayDeque2.isEmpty()) {
                                    if (f0Var != null) {
                                        j11 = f0Var.a(j11);
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
                            ((m3.h) lVar).t(i16);
                        }
                        e(((m3.h) lVar).d);
                    }
                } else {
                    int i20 = this.r;
                    z zVar4 = this.k;
                    if (i20 == 0) {
                        if (!((m3.h) lVar).d(zVar4.a, 0, 8, true)) {
                            return -1;
                        }
                        this.r = 8;
                        zVar4.C(0);
                        this.q = zVar4.s();
                        this.p = zVar4.e();
                    }
                    long j25 = this.q;
                    if (j25 == 1) {
                        ((m3.h) lVar).d(zVar4.a, 8, 8, false);
                        this.r += 8;
                        this.q = zVar4.v();
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
                    int i21 = this.r;
                    if (j27 < i21) {
                        throw t1.c("Atom size less than header length (unsupported).");
                    }
                    long j28 = ((m3.h) lVar).d - i21;
                    int i22 = this.p;
                    if ((i22 == 1836019558 || i22 == 1835295092) && !this.G) {
                        this.D.n(new m3.o(this.w, j28));
                        this.G = true;
                    }
                    if (this.p == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            r rVar4 = ((h) sparseArray.valueAt(i23)).b;
                            rVar4.getClass();
                            rVar4.c = j28;
                            rVar4.b = j28;
                        }
                    }
                    int i24 = this.p;
                    if (i24 == 1835295092) {
                        this.y = null;
                        this.t = j28 + this.q;
                        this.o = 2;
                    } else if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1836019558 || i24 == 1953653094 || i24 == 1836475768 || i24 == 1701082227) {
                        long j29 = (((m3.h) lVar).d + this.q) - 8;
                        arrayDeque.push(new a(i24, j29));
                        if (this.q == this.r) {
                            e(j29);
                        } else {
                            this.o = 0;
                            this.r = 0;
                        }
                    } else if (i24 == 1751411826 || i24 == 1835296868 || i24 == 1836476516 || i24 == 1936286840 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1668576371 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1937011571 || i24 == 1952867444 || i24 == 1952868452 || i24 == 1953196132 || i24 == 1953654136 || i24 == 1953658222 || i24 == 1886614376 || i24 == 1935763834 || i24 == 1935763823 || i24 == 1936027235 || i24 == 1970628964 || i24 == 1935828848 || i24 == 1936158820 || i24 == 1701606260 || i24 == 1835362404 || i24 == 1701671783) {
                        if (this.r != 8) {
                            throw t1.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.q > 2147483647L) {
                            throw t1.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        z zVar5 = new z((int) this.q);
                        System.arraycopy(zVar4.a, 0, zVar5.a, 0, 8);
                        this.s = zVar5;
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
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.o = 0;
        this.r = 0;
        w[] wVarArr = new w[2];
        this.E = wVarArr;
        w wVar = this.n;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.a & 4) != 0) {
            wVarArr[i10] = mVar.C(100, 5);
            i12 = 101;
            i10++;
        }
        w[] wVarArr2 = (w[]) g0.J(i10, this.E);
        this.E = wVarArr2;
        for (w wVar2 : wVarArr2) {
            wVar2.c(I);
        }
        List list = this.b;
        this.F = new w[list.size()];
        while (i11 < this.F.length) {
            w C = this.D.C(i12, 3);
            C.c((t0) list.get(i11));
            this.F[i11] = C;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0726, code lost:
    
        r50.o = 0;
        r50.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x072b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x063b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j10) {
        f fVar;
        f fVar2;
        l3.d dVar;
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        int i13;
        int i14;
        int size;
        int i15;
        int i16;
        boolean z10;
        int i17;
        int i18;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i19;
        boolean z11;
        int i20;
        int i21;
        int i22;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).c != j10) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i23 = aVar.b;
            ArrayList arrayList5 = aVar.e;
            ArrayList arrayList6 = aVar.d;
            int i24 = this.a;
            int i25 = 12;
            SparseArray sparseArray = this.c;
            if (i23 == 1836019574) {
                l3.d a2 = a(arrayList6);
                a e9 = aVar.e(1836475768);
                e9.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = e9.d;
                int size2 = arrayList7.size();
                int i26 = 0;
                long j11 = -9223372036854775807L;
                while (i26 < size2) {
                    b bVar = (b) arrayList7.get(i26);
                    int i27 = bVar.b;
                    z zVar = bVar.c;
                    if (i27 == 1953654136) {
                        zVar.C(i25);
                        dVar = a2;
                        Pair create = Pair.create(Integer.valueOf(zVar.e()), new f(zVar.e() - 1, zVar.e(), zVar.e(), zVar.e()));
                        sparseArray2.put(((Integer) create.first).intValue(), (f) create.second);
                    } else {
                        dVar = a2;
                        if (i27 == 1835362404) {
                            zVar.C(8);
                            j11 = mc.k.b(zVar.e()) == 0 ? zVar.s() : zVar.v();
                        }
                    }
                    i26++;
                    a2 = dVar;
                    i25 = 12;
                }
                ArrayList e10 = e.e(aVar, new m3.q(), j11, a2, (i24 & 16) != 0, false, new t0.c(this, 2));
                int size3 = e10.size();
                if (sparseArray.size() == 0) {
                    for (int i28 = 0; i28 < size3; i28++) {
                        s sVar = (s) e10.get(i28);
                        p pVar = sVar.a;
                        m3.m mVar = this.D;
                        int i29 = pVar.b;
                        int i30 = pVar.a;
                        w C = mVar.C(i28, i29);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar = (f) sparseArray2.get(i30);
                            fVar.getClass();
                        }
                        sparseArray.put(i30, new h(C, sVar, fVar));
                        this.w = Math.max(this.w, pVar.e);
                    }
                    this.D.A();
                } else {
                    d5.a.i(sparseArray.size() == size3);
                    for (int i31 = 0; i31 < size3; i31++) {
                        s sVar2 = (s) e10.get(i31);
                        p pVar2 = sVar2.a;
                        h hVar = (h) sparseArray.get(pVar2.a);
                        int i32 = pVar2.a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i32);
                            fVar2.getClass();
                        }
                        hVar.d = sVar2;
                        hVar.e = fVar2;
                        hVar.a.c(sVar2.a.f);
                        hVar.d();
                    }
                }
            } else if (i23 == 1836019558) {
                int size4 = arrayList5.size();
                int i33 = 0;
                while (i33 < size4) {
                    a aVar2 = (a) arrayList5.get(i33);
                    if (aVar2.b == 1953653094) {
                        b f10 = aVar2.f(1952868452);
                        ArrayList arrayList8 = aVar2.d;
                        f10.getClass();
                        z zVar2 = f10.c;
                        zVar2.C(8);
                        int e11 = zVar2.e();
                        h hVar2 = (h) sparseArray.get(zVar2.e());
                        if (hVar2 == null) {
                            i10 = size4;
                            hVar2 = null;
                        } else {
                            r rVar = hVar2.b;
                            if ((e11 & 1) != 0) {
                                long v = zVar2.v();
                                rVar.b = v;
                                rVar.c = v;
                            }
                            f fVar3 = hVar2.e;
                            int e12 = (e11 & 2) != 0 ? zVar2.e() - 1 : fVar3.a;
                            int e13 = (e11 & 8) != 0 ? zVar2.e() : fVar3.b;
                            if ((e11 & 16) != 0) {
                                i10 = size4;
                                i13 = zVar2.e();
                            } else {
                                i10 = size4;
                                i13 = fVar3.c;
                            }
                            rVar.a = new f(e12, e13, i13, (e11 & 32) != 0 ? zVar2.e() : fVar3.d);
                        }
                        if (hVar2 == null) {
                            i11 = i33;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i12 = i24;
                        } else {
                            r rVar2 = hVar2.b;
                            long j12 = rVar2.p;
                            boolean z12 = rVar2.q;
                            hVar2.d();
                            hVar2.l = true;
                            b f11 = aVar2.f(1952867444);
                            if (f11 == null || (i24 & 2) != 0) {
                                rVar2.p = j12;
                                rVar2.q = z12;
                            } else {
                                z zVar3 = f11.c;
                                zVar3.C(8);
                                rVar2.p = mc.k.b(zVar3.e()) == 1 ? zVar3.v() : zVar3.s();
                                rVar2.q = true;
                            }
                            int size5 = arrayList8.size();
                            int i34 = 0;
                            int i35 = 0;
                            int i36 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i34 >= size5) {
                                    break;
                                }
                                b bVar2 = (b) arrayList8.get(i34);
                                int i37 = i33;
                                if (bVar2.b == 1953658222) {
                                    z zVar4 = bVar2.c;
                                    zVar4.C(12);
                                    int u10 = zVar4.u();
                                    if (u10 > 0) {
                                        i36 += u10;
                                        i35++;
                                    }
                                }
                                i34++;
                                i33 = i37;
                            }
                            i11 = i33;
                            hVar2.h = 0;
                            hVar2.g = 0;
                            hVar2.f = 0;
                            rVar2.d = i35;
                            rVar2.e = i36;
                            if (rVar2.g.length < i35) {
                                rVar2.f = new long[i35];
                                rVar2.g = new int[i35];
                            }
                            if (rVar2.h.length < i36) {
                                int i38 = (i36 * 125) / 100;
                                rVar2.h = new int[i38];
                                rVar2.i = new long[i38];
                                rVar2.j = new boolean[i38];
                                rVar2.l = new boolean[i38];
                            }
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            while (true) {
                                long j13 = 0;
                                if (i39 < size5) {
                                    b bVar3 = (b) arrayList8.get(i39);
                                    if (bVar3.b == i14) {
                                        int i42 = i40 + 1;
                                        z zVar5 = bVar3.c;
                                        zVar5.C(8);
                                        int e14 = zVar5.e();
                                        i17 = i39;
                                        p pVar3 = hVar2.d.a;
                                        i18 = size5;
                                        f fVar4 = rVar2.a;
                                        int i43 = g0.a;
                                        arrayList3 = arrayList5;
                                        rVar2.g[i40] = zVar5.u();
                                        long[] jArr = rVar2.f;
                                        arrayList4 = arrayList6;
                                        long j14 = rVar2.b;
                                        jArr[i40] = j14;
                                        if ((e14 & 1) != 0) {
                                            jArr[i40] = j14 + zVar5.e();
                                        }
                                        boolean z13 = (e14 & 4) != 0;
                                        int i44 = fVar4.d;
                                        if (z13) {
                                            i44 = zVar5.e();
                                        }
                                        boolean z14 = z13;
                                        boolean z15 = (e14 & 256) != 0;
                                        boolean z16 = (e14 & 512) != 0;
                                        boolean z17 = (e14 & 1024) != 0;
                                        boolean z18 = (e14 & 2048) != 0;
                                        boolean z19 = z17;
                                        long[] jArr2 = pVar3.h;
                                        int i45 = i44;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            j13 = pVar3.i[0];
                                        }
                                        int[] iArr = rVar2.h;
                                        long[] jArr3 = rVar2.i;
                                        boolean[] zArr = rVar2.j;
                                        boolean z20 = pVar3.b == 2 && (i24 & 1) != 0;
                                        int i46 = rVar2.g[i40] + i41;
                                        i19 = i24;
                                        long j15 = pVar3.c;
                                        long j16 = rVar2.p;
                                        int i47 = i41;
                                        while (i47 < i46) {
                                            int e15 = z15 ? zVar5.e() : fVar4.b;
                                            int i48 = i47;
                                            if (e15 < 0) {
                                                throw t1.a("Unexpected negative value: " + e15, null);
                                            }
                                            if (z16) {
                                                z11 = z20;
                                                i20 = zVar5.e();
                                            } else {
                                                z11 = z20;
                                                i20 = fVar4.c;
                                            }
                                            if (i20 < 0) {
                                                throw t1.a("Unexpected negative value: " + i20, null);
                                            }
                                            int e16 = z19 ? zVar5.e() : (i48 == 0 && z14) ? i45 : fVar4.d;
                                            if (z18) {
                                                i21 = e16;
                                                i22 = zVar5.e();
                                            } else {
                                                i21 = e16;
                                                i22 = 0;
                                            }
                                            f fVar5 = fVar4;
                                            long O = g0.O((i22 + j16) - j13, 1000000L, j15);
                                            jArr3[i48] = O;
                                            if (!rVar2.q) {
                                                jArr3[i48] = O + hVar2.d.h;
                                            }
                                            iArr[i48] = i20;
                                            zArr[i48] = ((i21 >> 16) & 1) == 0 && (!z11 || i48 == 0);
                                            j16 += e15;
                                            i47 = i48 + 1;
                                            z20 = z11;
                                            fVar4 = fVar5;
                                        }
                                        rVar2.p = j16;
                                        i41 = i46;
                                        i40 = i42;
                                    } else {
                                        i17 = i39;
                                        i18 = size5;
                                        arrayList3 = arrayList5;
                                        arrayList4 = arrayList6;
                                        i19 = i24;
                                    }
                                    i39 = i17 + 1;
                                    size5 = i18;
                                    arrayList5 = arrayList3;
                                    arrayList6 = arrayList4;
                                    i24 = i19;
                                    i14 = 1953658222;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList2 = arrayList6;
                                    i12 = i24;
                                    p pVar4 = hVar2.d.a;
                                    f fVar6 = rVar2.a;
                                    fVar6.getClass();
                                    q qVar = pVar4.k[fVar6.a];
                                    b f12 = aVar2.f(1935763834);
                                    if (f12 != null) {
                                        qVar.getClass();
                                        z zVar6 = f12.c;
                                        int i49 = qVar.d;
                                        zVar6.C(8);
                                        if ((zVar6.e() & 1) == 1) {
                                            zVar6.D(8);
                                        }
                                        int r10 = zVar6.r();
                                        int u11 = zVar6.u();
                                        if (u11 > rVar2.e) {
                                            StringBuilder o10 = i0.a.o(u11, "Saiz sample count ", " is greater than fragment sample count");
                                            o10.append(rVar2.e);
                                            throw t1.a(o10.toString(), null);
                                        }
                                        if (r10 == 0) {
                                            boolean[] zArr2 = rVar2.l;
                                            i16 = 0;
                                            for (int i50 = 0; i50 < u11; i50++) {
                                                int r11 = zVar6.r();
                                                i16 += r11;
                                                zArr2[i50] = r11 > i49;
                                            }
                                            z10 = false;
                                        } else {
                                            i16 = r10 * u11;
                                            z10 = false;
                                            Arrays.fill(rVar2.l, 0, u11, r10 > i49);
                                        }
                                        Arrays.fill(rVar2.l, u11, rVar2.e, z10);
                                        if (i16 > 0) {
                                            rVar2.n.z(i16);
                                            rVar2.k = true;
                                            rVar2.o = true;
                                        }
                                    }
                                    b f13 = aVar2.f(1935763823);
                                    if (f13 != null) {
                                        z zVar7 = f13.c;
                                        zVar7.C(8);
                                        int e17 = zVar7.e();
                                        if ((e17 & 1) == 1) {
                                            zVar7.D(8);
                                        }
                                        int u12 = zVar7.u();
                                        if (u12 != 1) {
                                            throw t1.a("Unexpected saio entry count: " + u12, null);
                                        }
                                        rVar2.c += mc.k.b(e17) == 0 ? zVar7.s() : zVar7.v();
                                    }
                                    byte[] bArr = null;
                                    b f14 = aVar2.f(1936027235);
                                    if (f14 != null) {
                                        d(f14.c, 0, rVar2);
                                    }
                                    String str = qVar != null ? qVar.b : null;
                                    z zVar8 = null;
                                    z zVar9 = null;
                                    for (int i51 = 0; i51 < arrayList8.size(); i51++) {
                                        b bVar4 = (b) arrayList8.get(i51);
                                        z zVar10 = bVar4.c;
                                        int i52 = bVar4.b;
                                        if (i52 == 1935828848) {
                                            zVar10.C(12);
                                            if (zVar10.e() == 1936025959) {
                                                zVar8 = zVar10;
                                            }
                                        } else if (i52 == 1936158820) {
                                            zVar10.C(12);
                                            if (zVar10.e() == 1936025959) {
                                                zVar9 = zVar10;
                                            }
                                        }
                                    }
                                    if (zVar8 != null && zVar9 != null) {
                                        zVar8.C(8);
                                        int b10 = mc.k.b(zVar8.e());
                                        zVar8.D(4);
                                        if (b10 == 1) {
                                            zVar8.D(4);
                                        }
                                        if (zVar8.e() != 1) {
                                            throw t1.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        zVar9.C(8);
                                        int b11 = mc.k.b(zVar9.e());
                                        zVar9.D(4);
                                        if (b11 == 1) {
                                            if (zVar9.s() == 0) {
                                                throw t1.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (b11 >= 2) {
                                            zVar9.D(4);
                                        }
                                        if (zVar9.s() != 1) {
                                            throw t1.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        zVar9.D(1);
                                        int r12 = zVar9.r();
                                        int i53 = (r12 & 240) >> 4;
                                        int i54 = r12 & 15;
                                        boolean z21 = zVar9.r() == 1;
                                        if (z21) {
                                            int r13 = zVar9.r();
                                            byte[] bArr2 = new byte[16];
                                            zVar9.c(0, 16, bArr2);
                                            if (r13 == 0) {
                                                int r14 = zVar9.r();
                                                bArr = new byte[r14];
                                                zVar9.c(0, r14, bArr);
                                            }
                                            rVar2.k = true;
                                            rVar2.m = new q(z21, str, r13, bArr2, i53, i54, bArr);
                                            size = arrayList8.size();
                                            for (i15 = 0; i15 < size; i15++) {
                                                b bVar5 = (b) arrayList8.get(i15);
                                                if (bVar5.b == 1970628964) {
                                                    z zVar11 = bVar5.c;
                                                    zVar11.C(8);
                                                    byte[] bArr3 = this.g;
                                                    zVar11.c(0, 16, bArr3);
                                                    if (Arrays.equals(bArr3, H)) {
                                                        d(zVar11, 16, rVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList8.size();
                                    while (i15 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i10 = size4;
                        i11 = i33;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i12 = i24;
                    }
                    i33 = i11 + 1;
                    size4 = i10;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    i24 = i12;
                }
                l3.d a3 = a(arrayList6);
                if (a3 != null) {
                    int size6 = sparseArray.size();
                    for (int i55 = 0; i55 < size6; i55++) {
                        h hVar3 = (h) sparseArray.valueAt(i55);
                        p pVar5 = hVar3.d.a;
                        f fVar7 = hVar3.b.a;
                        int i56 = g0.a;
                        q qVar2 = pVar5.k[fVar7.a];
                        l3.d a10 = a3.a(qVar2 != null ? qVar2.b : null);
                        s0 a11 = hVar3.d.a.f.a();
                        a11.r = a10;
                        hVar3.a.c(new t0(a11));
                    }
                }
                if (this.v != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i57 = 0; i57 < size7; i57++) {
                        h hVar4 = (h) sparseArray.valueAt(i57);
                        long j17 = this.v;
                        int i58 = hVar4.f;
                        while (true) {
                            r rVar3 = hVar4.b;
                            if (i58 < rVar3.e && rVar3.i[i58] <= j17) {
                                if (rVar3.j[i58]) {
                                    hVar4.i = i58;
                                }
                                i58++;
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
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
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
