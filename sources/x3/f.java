package x3;

import a8.ia;
import aa.c0;
import android.util.Pair;
import android.util.SparseArray;
import c4.k;
import e2.m;
import e2.p0;
import e2.q0;
import e2.r;
import e2.s0;
import e2.t;
import e2.t0;
import f3.j0;
import f3.k0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f5.u;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f implements o {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final b a;
    public int a0;
    public final g b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final k f;
    public boolean f0;
    public final x g;
    public int g0;
    public final x h;
    public byte h0;
    public final x i;
    public boolean i0;
    public final x j;
    public q j0;
    public final x k;
    public final x l;
    public final x m;
    public final x n;
    public final x o;
    public final x p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public e y;
    public boolean z;

    static {
        String str = m0.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.google.android.recaptcha.internal.a.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.google.android.recaptcha.internal.a.p(qs.K2, hashMap, "htc_video_rotA-180", qs.t4, "htc_video_rotA-270");
        p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i7) {
        b bVar = new b();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = bVar;
        bVar.d = new n(this);
        this.f = kVar;
        this.C = new SparseArray();
        this.d = (i7 & 1) == 0;
        this.e = (i7 & 2) == 0;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new x(4);
        this.j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new x(4);
        this.g = new x(i2.o.a);
        this.h = new x(4);
        this.l = new x();
        this.m = new x();
        this.n = new x(8);
        this.o = new x();
        this.p = new x();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] j(long j3, String str, long j10) {
        ia.f(j3 != -9223372036854775807L);
        int i7 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i7 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str2 = m0.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        u uVar = new u(18, (short) 0);
        x xVar = (x) uVar.c;
        l lVar = (l) pVar;
        long j3 = lVar.c;
        long j10 = 1024;
        if (j3 != -1 && j3 <= 1024) {
            j10 = j3;
        }
        int i7 = (int) j10;
        lVar.k(xVar.a, 0, 4, false);
        long C = xVar.C();
        uVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i10 = uVar.b + 1;
                uVar.b = i10;
                if (i10 == i7) {
                    break;
                }
                lVar.k(xVar.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.a[0] & 255);
            } else {
                long u10 = uVar.u(lVar);
                long j11 = uVar.b;
                if (u10 != Long.MIN_VALUE && (j3 == -1 || j11 + u10 < j3)) {
                    while (true) {
                        long j12 = uVar.b;
                        long j13 = j11 + u10;
                        if (j12 < j13) {
                            if (uVar.u(lVar) != Long.MIN_VALUE) {
                                long u11 = uVar.u(lVar);
                                if (u11 < 0 || u11 > 2147483647L) {
                                    break;
                                }
                                if (u11 != 0) {
                                    int i11 = (int) u11;
                                    lVar.v(i11, false);
                                    uVar.b += i11;
                                }
                            } else {
                                break;
                            }
                        } else if (j12 == j13) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // f3.o
    public final void c(q qVar) {
        if (this.e) {
            qVar = new ab.q(qVar, this.f);
        }
        this.j0 = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.a;
        bVar.e = 0;
        bVar.b.clear();
        g gVar = bVar.c;
        gVar.b = 0;
        gVar.c = 0;
        g gVar2 = this.b;
        gVar2.b = 0;
        gVar2.c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i7 >= sparseArray.size()) {
                return;
            }
            k0 k0Var = ((e) sparseArray.valueAt(i7)).V;
            if (k0Var != null) {
                k0Var.b = false;
                k0Var.c = 0;
            }
            i7++;
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0f71, code lost:
    
        if (r0.z == false) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0f73, code lost:
    
        r6 = r0.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0f77, code lost:
    
        if (r6 == (-1)) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0f79, code lost:
    
        r45.a = r6;
        r0.L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0f7f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0f86, code lost:
    
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0f86, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0f5e, code lost:
    
        r0.L = r2;
        r45.a = r0.K;
        r0.J = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0f6a, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0f80, code lost:
    
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a0d, code lost:
    
        if (r0.u() == r4.getLeastSignificantBits()) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d2a, code lost:
    
        r5 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f52, code lost:
    
        if (r5 == false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0f54, code lost:
    
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0f5c, code lost:
    
        if (r0.J == false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0f6b, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0c4c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v100 */
    /* JADX WARN: Type inference failed for: r6v101, types: [int] */
    /* JADX WARN: Type inference failed for: r6v103 */
    /* JADX WARN: Type inference failed for: r6v104, types: [int] */
    /* JADX WARN: Type inference failed for: r6v117 */
    /* JADX WARN: Type inference failed for: r6v118, types: [int] */
    /* JADX WARN: Type inference failed for: r6v123 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v125 */
    /* JADX WARN: Type inference failed for: r8v0, types: [x3.g] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        boolean z9;
        int i7;
        boolean z10;
        ?? r15;
        String str;
        int i10;
        int a10;
        p pVar2;
        char c10;
        List singletonList;
        int D;
        ?? r22;
        int i11;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list;
        List u10;
        String str3;
        List list2;
        List list3;
        t tVar;
        boolean i12;
        int i13;
        m mVar;
        byte[] bArr;
        int i14;
        String str4;
        c0 a11;
        List list4;
        int i15;
        List list5;
        int i16;
        long j3;
        int i17;
        long j10;
        long j11;
        q0 a12;
        f fVar = this;
        boolean z11 = false;
        fVar.N = false;
        boolean z12 = true;
        boolean z13 = true;
        while (z13 && !fVar.N) {
            b bVar = fVar.a;
            ?? r82 = bVar.c;
            ArrayDeque arrayDeque = bVar.b;
            bVar.d.getClass();
            ?? r42 = z12;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || pVar.getPosition() < aVar.b) {
                    ?? r43 = z11;
                    p pVar3 = pVar;
                    if (bVar.e == 0) {
                        int i18 = 4;
                        long b10 = r82.b(pVar3, true, r43, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar.a;
                            pVar3.q();
                            int i19 = r43;
                            while (true) {
                                pVar3.b(i19, i18, bArr2);
                                byte b11 = bArr2[i19];
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= 8) {
                                        i10 = -1;
                                    } else if ((g.d[i20] & b11) != 0) {
                                        i10 = i20 + 1;
                                    } else {
                                        i20++;
                                    }
                                }
                                if (i10 != -1 && i10 <= 4) {
                                    a10 = (int) g.a(i10, false, bArr2);
                                    Object obj = bVar.d.a;
                                    if (a10 == 357149030 || a10 == 524531317 || a10 == 475249515 || a10 == 374648427) {
                                    }
                                }
                                pVar3.s(1);
                                i18 = 4;
                                i19 = 0;
                            }
                            pVar3.s(i10);
                            b10 = a10;
                        }
                        z9 = true;
                        if (b10 == -1) {
                            z10 = false;
                            z13 = false;
                            p pVar4 = pVar3;
                        } else {
                            bVar.f = (int) b10;
                            bVar.e = 1;
                        }
                    } else {
                        z9 = true;
                    }
                    if (bVar.e == z9) {
                        bVar.g = r82.b(pVar3, false, z9, 8);
                        bVar.e = 2;
                    }
                    n nVar = bVar.d;
                    int i21 = bVar.f;
                    Object obj2 = nVar.a;
                    switch (i21) {
                        case qs.P1 /* 131 */:
                        case qs.S1 /* 136 */:
                        case qs.l2 /* 155 */:
                        case qs.p2 /* 159 */:
                        case qs.G2 /* 176 */:
                        case qs.J2 /* 179 */:
                        case qs.Q2 /* 186 */:
                        case qs.s3 /* 215 */:
                        case qs.H3 /* 231 */:
                        case qs.N3 /* 238 */:
                        case qs.P3 /* 240 */:
                        case qs.Q3 /* 241 */:
                        case qs.W3 /* 247 */:
                        case qs.a4 /* 251 */:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i7 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i7 = 3;
                            break;
                        case qs.q2 /* 160 */:
                        case qs.w2 /* 166 */:
                        case qs.E2 /* 174 */:
                        case qs.N2 /* 183 */:
                        case qs.R2 /* 187 */:
                        case qs.B3 /* 224 */:
                        case qs.C3 /* 225 */:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i7 = 1;
                            break;
                        case qs.r2 /* 161 */:
                        case qs.t2 /* 163 */:
                        case qs.v2 /* 165 */:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i7 = 4;
                            break;
                        case qs.L2 /* 181 */:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i7 = 5;
                            break;
                        default:
                            i7 = 0;
                            break;
                    }
                    if (i7 == 0) {
                        pVar3.s((int) bVar.g);
                        bVar.e = 0;
                        z11 = false;
                        r42 = 1;
                    } else if (i7 == 1) {
                        long position = pVar3.getPosition();
                        arrayDeque.push(new a(bVar.f, bVar.g + position));
                        bVar.d.A(position, bVar.f, bVar.g);
                        z10 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else if (i7 == 2) {
                        long j12 = bVar.g;
                        if (j12 > 8) {
                            throw t0.a(null, "Invalid integer size: " + bVar.g);
                        }
                        nVar.w(i21, bVar.a(pVar3, (int) j12));
                        z10 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else if (i7 == 3) {
                        long j13 = bVar.g;
                        if (j13 > 2147483647L) {
                            throw t0.a(null, "String element size: " + bVar.g);
                        }
                        int i22 = (int) j13;
                        if (i22 == 0) {
                            str = "";
                            r15 = 0;
                        } else {
                            byte[] bArr3 = new byte[i22];
                            pVar3.readFully(bArr3, 0, i22);
                            while (i22 > 0 && bArr3[i22 - 1] == 0) {
                                i22--;
                            }
                            r15 = 0;
                            str = new String(bArr3, 0, i22);
                        }
                        nVar.B(i21, str);
                        bVar.e = r15;
                        z10 = r15;
                        pVar2 = pVar3;
                    } else if (i7 == 4) {
                        nVar.p(i21, (int) bVar.g, pVar3);
                        z10 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else {
                        if (i7 != 5) {
                            throw t0.a(null, "Invalid element type " + i7);
                        }
                        long j14 = bVar.g;
                        if (j14 != 4 && j14 != 8) {
                            throw t0.a(null, "Invalid float size: " + bVar.g);
                        }
                        int i23 = (int) j14;
                        double intBitsToFloat = i23 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(bVar.a(pVar3, i23));
                        f fVar2 = (f) nVar.a;
                        if (i21 == 181) {
                            fVar2.h(i21);
                            fVar2.y.S = (int) intBitsToFloat;
                        } else if (i21 != 17545) {
                            switch (i21) {
                                case 21969:
                                    fVar2.h(i21);
                                    fVar2.y.F = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    fVar2.h(i21);
                                    fVar2.y.G = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    fVar2.h(i21);
                                    fVar2.y.H = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    fVar2.h(i21);
                                    fVar2.y.I = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    fVar2.h(i21);
                                    fVar2.y.J = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    fVar2.h(i21);
                                    fVar2.y.K = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    fVar2.h(i21);
                                    fVar2.y.L = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    fVar2.h(i21);
                                    fVar2.y.M = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    fVar2.h(i21);
                                    fVar2.y.N = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    fVar2.h(i21);
                                    fVar2.y.O = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i21) {
                                        case 30323:
                                            fVar2.h(i21);
                                            fVar2.y.u = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            fVar2.h(i21);
                                            fVar2.y.v = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            fVar2.h(i21);
                                            fVar2.y.w = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            fVar2.u = (long) intBitsToFloat;
                        }
                        z10 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    }
                } else {
                    n nVar2 = bVar.d;
                    int i24 = ((a) arrayDeque.pop()).a;
                    f fVar3 = (f) nVar2.a;
                    ?? r83 = fVar3.C;
                    ?? r92 = fVar3.c;
                    fVar3.j0.getClass();
                    if (i24 != 160) {
                        if (i24 == 174) {
                            e eVar = fVar3.y;
                            eVar.getClass();
                            String str5 = eVar.c;
                            if (str5 == null) {
                                throw t0.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str5) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i25 = eVar.d;
                                    switch (str5.hashCode()) {
                                        case -2095576542:
                                            if (str5.equals("V_MPEG4/ISO/AP")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -2095575984:
                                            if (str5.equals("V_MPEG4/ISO/SP")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1985379776:
                                            if (str5.equals("A_MS/ACM")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1784763192:
                                            if (str5.equals("A_TRUEHD")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1730367663:
                                            if (str5.equals("A_VORBIS")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1482641358:
                                            if (str5.equals("A_MPEG/L2")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1482641357:
                                            if (str5.equals("A_MPEG/L3")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1373388978:
                                            if (str5.equals("V_MS/VFW/FOURCC")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -933872740:
                                            if (str5.equals("S_DVBSUB")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -538363189:
                                            if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                c10 = '\t';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -538363109:
                                            if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                c10 = '\n';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -425012669:
                                            if (str5.equals("S_VOBSUB")) {
                                                c10 = 11;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -356037306:
                                            if (str5.equals("A_DTS/LOSSLESS")) {
                                                c10 = '\f';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 62923557:
                                            if (str5.equals("A_AAC")) {
                                                c10 = '\r';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 62923603:
                                            if (str5.equals("A_AC3")) {
                                                c10 = 14;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 62927045:
                                            if (str5.equals("A_DTS")) {
                                                c10 = 15;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82318131:
                                            if (str5.equals("V_AV1")) {
                                                c10 = 16;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82338133:
                                            if (str5.equals("V_VP8")) {
                                                c10 = 17;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82338134:
                                            if (str5.equals("V_VP9")) {
                                                c10 = 18;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 99146302:
                                            if (str5.equals("S_HDMV/PGS")) {
                                                c10 = 19;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 444813526:
                                            if (str5.equals("V_THEORA")) {
                                                c10 = 20;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 542569478:
                                            if (str5.equals("A_DTS/EXPRESS")) {
                                                c10 = 21;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 635596514:
                                            if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                c10 = 22;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 725948237:
                                            if (str5.equals("A_PCM/INT/BIG")) {
                                                c10 = 23;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 725957860:
                                            if (str5.equals("A_PCM/INT/LIT")) {
                                                c10 = 24;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 738597099:
                                            if (str5.equals("S_TEXT/ASS")) {
                                                c10 = 25;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 738614379:
                                            if (str5.equals("S_TEXT/SSA")) {
                                                c10 = 26;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c10 = 27;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c10 = 28;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c10 = 29;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c10 = 30;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c10 = 31;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c10 = ' ';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c10 = '!';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    String str6 = "video/x-unknown";
                                    switch (c10) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            byte[] bArr4 = eVar.l;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str6 = "video/mp4v-es";
                                            u10 = singletonList;
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null && (a11 = c0.a(new x(eVar.P))) != null) {
                                                str2 = a11.a;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i26 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map = p0;
                                            if (!i12) {
                                                tVar.J = eVar.Q;
                                                tVar.K = eVar.S;
                                                tVar.L = D;
                                            } else if (s0.m(str6)) {
                                                if (eVar.s == 0) {
                                                    int i27 = eVar.q;
                                                    i13 = -1;
                                                    if (i27 == -1) {
                                                        i27 = eVar.n;
                                                    }
                                                    eVar.q = i27;
                                                    int i28 = eVar.r;
                                                    if (i28 == -1) {
                                                        i28 = eVar.o;
                                                    }
                                                    eVar.r = i28;
                                                } else {
                                                    i13 = -1;
                                                }
                                                float f10 = (eVar.q == i13 || (i14 = eVar.r) == i13) ? -1.0f : (eVar.o * r0) / (eVar.n * i14);
                                                if (eVar.z) {
                                                    if (eVar.F == -1.0f || eVar.G == -1.0f || eVar.H == -1.0f || eVar.I == -1.0f || eVar.J == -1.0f || eVar.K == -1.0f || eVar.L == -1.0f || eVar.M == -1.0f || eVar.N == -1.0f || eVar.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((eVar.F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.K * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.L * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.M * 50000.0f) + 0.5f));
                                                        order.putShort((short) (eVar.N + 0.5f));
                                                        order.putShort((short) (eVar.O + 0.5f));
                                                        order.putShort((short) eVar.D);
                                                        order.putShort((short) eVar.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i29 = eVar.A;
                                                    int i30 = eVar.C;
                                                    int i31 = eVar.B;
                                                    int i32 = eVar.p;
                                                    mVar = new m(i29, i30, i31, bArr, i32, i32);
                                                } else {
                                                    mVar = null;
                                                }
                                                String str7 = eVar.b;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(eVar.b)).intValue();
                                                if (eVar.t == 0 && Float.compare(eVar.u, 0.0f) == 0 && Float.compare(eVar.v, 0.0f) == 0) {
                                                    if (Float.compare(eVar.w, 0.0f) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(eVar.w, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(eVar.w, -180.0f) == 0 || Float.compare(eVar.w, 180.0f) == 0) {
                                                        intValue = qs.K2;
                                                    } else if (Float.compare(eVar.w, -90.0f) == 0) {
                                                        intValue = qs.t4;
                                                    }
                                                }
                                                tVar.y = eVar.n;
                                                tVar.z = eVar.o;
                                                tVar.E = f10;
                                                tVar.D = intValue;
                                                tVar.F = eVar.x;
                                                tVar.G = eVar.y;
                                                tVar.H = mVar;
                                            } else if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                throw t0.a(null, "Unexpected MIME type.");
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                tVar.b = eVar.b;
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 2:
                                            x xVar = new x(eVar.a(eVar.c));
                                            try {
                                                int t6 = xVar.t();
                                                if (t6 != 1) {
                                                    if (t6 == 65534) {
                                                        xVar.N(24);
                                                        long u11 = xVar.u();
                                                        UUID uuid = o0;
                                                        if (u11 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    h2.a.l("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i11 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                        str2 = a11.a;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i262 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    tVar = new t();
                                                    i12 = s0.i(str6);
                                                    Map map2 = p0;
                                                    if (!i12) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                        tVar.b = eVar.b;
                                                        break;
                                                    }
                                                    tVar.a = Integer.toString(i25);
                                                    tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    tVar.r = s0.n(str6);
                                                    tVar.s = i11;
                                                    tVar.d = eVar.Z;
                                                    tVar.e = i262;
                                                    tVar.u = list3;
                                                    tVar.j = str2;
                                                    tVar.v = eVar.m;
                                                    eVar.b0 = tVar.a();
                                                    eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                    r92.put(eVar.d, eVar);
                                                }
                                                int i33 = eVar.R;
                                                String str8 = m0.a;
                                                D = m0.D(i33, ByteOrder.LITTLE_ENDIAN);
                                                if (D == 0) {
                                                    h2.a.l("MatroskaExtractor", "Unsupported PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i11 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                    }
                                                    int i2622 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    tVar = new t();
                                                    i12 = s0.i(str6);
                                                    Map map22 = p0;
                                                    if (!i12) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    tVar.a = Integer.toString(i25);
                                                    tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    tVar.r = s0.n(str6);
                                                    tVar.s = i11;
                                                    tVar.d = eVar.Z;
                                                    tVar.e = i2622;
                                                    tVar.u = list3;
                                                    tVar.j = str2;
                                                    tVar.v = eVar.m;
                                                    eVar.b0 = tVar.a();
                                                    eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                    r92.put(eVar.d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i26222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i26222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw t0.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            eVar.V = new k0();
                                            str6 = "audio/true-hd";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i262222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 4:
                                            byte[] a13 = eVar.a(str5);
                                            try {
                                                r22 = a13[0];
                                                try {
                                                    if (r22 != 2) {
                                                        throw t0.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i34 = 0;
                                                    int i35 = 1;
                                                    while (true) {
                                                        int i36 = a13[i35] & qs.e4;
                                                        if (i36 == 255) {
                                                            i34 += qs.e4;
                                                            i35++;
                                                        } else {
                                                            int i37 = i35 + 1;
                                                            int i38 = i34 + i36;
                                                            int i39 = 0;
                                                            while (true) {
                                                                int i40 = a13[i37] & qs.e4;
                                                                if (i40 == 255) {
                                                                    i39 += qs.e4;
                                                                    i37++;
                                                                } else {
                                                                    int i41 = i37 + 1;
                                                                    int i42 = i39 + i40;
                                                                    if (a13[i41] != 1) {
                                                                        throw t0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i38];
                                                                    System.arraycopy(a13, i41, bArr6, 0, i38);
                                                                    int i43 = i41 + i38;
                                                                    if (a13[i43] != 3) {
                                                                        throw t0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i44 = i43 + i42;
                                                                    if (a13[i44] != 5) {
                                                                        throw t0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a13.length - i44];
                                                                    System.arraycopy(a13, i44, bArr7, 0, a13.length - i44);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str6 = "audio/vorbis";
                                                                    i11 = TLObject.FLAG_13;
                                                                    arrayList = arrayList2;
                                                                    D = -1;
                                                                    list4 = arrayList;
                                                                    str2 = null;
                                                                    list3 = list4;
                                                                    if (eVar.P != null) {
                                                                    }
                                                                    int i2622222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                                    tVar = new t();
                                                                    i12 = s0.i(str6);
                                                                    Map map22222 = p0;
                                                                    if (!i12) {
                                                                    }
                                                                    str4 = eVar.b;
                                                                    if (str4 != null) {
                                                                    }
                                                                    tVar.a = Integer.toString(i25);
                                                                    tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                                    tVar.r = s0.n(str6);
                                                                    tVar.s = i11;
                                                                    tVar.d = eVar.Z;
                                                                    tVar.e = i2622222;
                                                                    tVar.u = list3;
                                                                    tVar.j = str2;
                                                                    tVar.v = eVar.m;
                                                                    eVar.b0 = tVar.a();
                                                                    eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                                    r92.put(eVar.d, eVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw t0.a(r22, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r22 = 0;
                                            }
                                            break;
                                        case 5:
                                            str6 = "audio/mpeg-L2";
                                            D = -1;
                                            i11 = TLObject.FLAG_12;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 6:
                                            str6 = "audio/mpeg";
                                            D = -1;
                                            i11 = TLObject.FLAG_12;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 7:
                                            x xVar2 = new x(eVar.a(eVar.c));
                                            try {
                                                xVar2.O(16);
                                                long r10 = xVar2.r();
                                                if (r10 == 1482049860) {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw t0.a(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else {
                                                    if (r10 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (r10 == 826496599) {
                                                            byte[] bArr8 = xVar2.a;
                                                            for (int i45 = xVar2.b + 20; i45 < bArr8.length - 4; i45++) {
                                                                if (bArr8[i45] == 0 && bArr8[i45 + 1] == 0 && bArr8[i45 + 2] == 1) {
                                                                    if (bArr8[i45 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i45, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            runtimeException = null;
                                                            throw t0.a(null, "Failed to find FourCC VC1 initialization data");
                                                        }
                                                        h2.a.l("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                list = (List) pair.second;
                                                D = -1;
                                                i11 = -1;
                                                list3 = list;
                                                if (eVar.P != null) {
                                                }
                                                int i2622222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map22222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i2622222222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case '\b':
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(eVar.a(str5), 0, bArr9, 0, 4);
                                            u10 = i0.u(bArr9);
                                            str6 = "application/dvbsubs";
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '\n':
                                            f3.d a14 = f3.d.a(new x(eVar.a(eVar.c)));
                                            ArrayList arrayList3 = a14.a;
                                            eVar.c0 = a14.b;
                                            str3 = a14.l;
                                            str6 = "video/avc";
                                            list2 = arrayList3;
                                            str2 = str3;
                                            list = list2;
                                            D = -1;
                                            i11 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 11:
                                            u10 = i0.u(eVar.a(str5));
                                            str6 = "application/vobsub";
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '\f':
                                            str6 = "audio/vnd.dts.hd";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(eVar.a(str5));
                                            byte[] bArr10 = eVar.l;
                                            f3.a n10 = f3.b.n(new d4.f(bArr10, bArr10.length), false);
                                            eVar.S = n10.b;
                                            eVar.Q = n10.c;
                                            str6 = "audio/mp4a-latm";
                                            list = singletonList2;
                                            str2 = n10.a;
                                            D = -1;
                                            i11 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 14:
                                            str6 = "audio/ac3";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 15:
                                        case 21:
                                            eVar.W = true;
                                            str6 = "audio/vnd.dts";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 16:
                                            byte[] bArr11 = eVar.l;
                                            singletonList = bArr11 == null ? null : i0.u(bArr11);
                                            str6 = "video/av01";
                                            u10 = singletonList;
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 17:
                                            str6 = "video/x-vnd.on2.vp8";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 18:
                                            byte[] bArr12 = eVar.l;
                                            singletonList = bArr12 == null ? null : i0.u(bArr12);
                                            str6 = "video/x-vnd.on2.vp9";
                                            u10 = singletonList;
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 19:
                                            str6 = "application/pgs";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 20:
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 22:
                                            if (eVar.R == 32) {
                                                str6 = "audio/raw";
                                                D = 4;
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i26222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i26222222222222222222222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } else {
                                                h2.a.l("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                D = -1;
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i262222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map2222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i262222222222222222222222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            }
                                            break;
                                        case 23:
                                            int i46 = eVar.R;
                                            if (i46 == 8) {
                                                str6 = "audio/raw";
                                                D = 3;
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i2622222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map22222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i2622222222222222222222222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } else {
                                                if (i46 == 16) {
                                                    D = TLObject.FLAG_28;
                                                } else if (i46 == 24) {
                                                    D = 1342177280;
                                                } else if (i46 == 32) {
                                                    D = 1610612736;
                                                } else {
                                                    h2.a.l("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i11 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                    }
                                                    int i26222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    tVar = new t();
                                                    i12 = s0.i(str6);
                                                    Map map222222222222222222222222 = p0;
                                                    if (!i12) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    tVar.a = Integer.toString(i25);
                                                    tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    tVar.r = s0.n(str6);
                                                    tVar.s = i11;
                                                    tVar.d = eVar.Z;
                                                    tVar.e = i26222222222222222222222222;
                                                    tVar.u = list3;
                                                    tVar.j = str2;
                                                    tVar.v = eVar.m;
                                                    eVar.b0 = tVar.a();
                                                    eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                    r92.put(eVar.d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i262222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map2222222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i262222222222222222222222222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            }
                                            break;
                                        case 24:
                                            int i47 = eVar.R;
                                            String str9 = m0.a;
                                            D = m0.D(i47, ByteOrder.LITTLE_ENDIAN);
                                            if (D == 0) {
                                                h2.a.l("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                D = -1;
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i2622222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                tVar = new t();
                                                i12 = s0.i(str6);
                                                Map map22222222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                tVar.a = Integer.toString(i25);
                                                tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                tVar.r = s0.n(str6);
                                                tVar.s = i11;
                                                tVar.d = eVar.Z;
                                                tVar.e = i2622222222222222222222222222;
                                                tVar.u = list3;
                                                tVar.j = str2;
                                                tVar.v = eVar.m;
                                                eVar.b0 = tVar.a();
                                                eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            }
                                            str6 = "audio/raw";
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 25:
                                        case 26:
                                            u10 = i0.v(l0, eVar.a(str5));
                                            str6 = "text/x-ssa";
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 27:
                                            f3.x a15 = f3.x.a(new x(eVar.a(eVar.c)), false, null);
                                            List list6 = a15.a;
                                            eVar.c0 = a15.b;
                                            str3 = a15.n;
                                            str6 = "video/hevc";
                                            list2 = list6;
                                            str2 = str3;
                                            list = list2;
                                            D = -1;
                                            i11 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 28:
                                            str6 = "text/vtt";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 29:
                                            str6 = "application/x-subrip";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case qs.T /* 30 */:
                                            str6 = "video/mpeg2";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case qs.U /* 31 */:
                                            str6 = "audio/eac3";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map222222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i26222222222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case ' ':
                                            singletonList = Collections.singletonList(eVar.a(str5));
                                            str6 = "audio/flac";
                                            u10 = singletonList;
                                            D = -1;
                                            i11 = -1;
                                            list4 = u10;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map2222222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i262222222222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '!':
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(eVar.a(eVar.c));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(allocate.order(byteOrder).putLong(eVar.T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(eVar.U).array());
                                            str6 = "audio/opus";
                                            i11 = 5760;
                                            arrayList = arrayList4;
                                            D = -1;
                                            list4 = arrayList;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            tVar = new t();
                                            i12 = s0.i(str6);
                                            Map map22222222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            tVar.a = Integer.toString(i25);
                                            tVar.q = s0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            tVar.r = s0.n(str6);
                                            tVar.s = i11;
                                            tVar.d = eVar.Z;
                                            tVar.e = i2622222222222222222222222222222222222;
                                            tVar.u = list3;
                                            tVar.j = str2;
                                            tVar.v = eVar.m;
                                            eVar.b0 = tVar.a();
                                            eVar.a0 = fVar3.j0.O1(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        default:
                                            throw t0.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    fVar3.y = null;
                                    break;
                            }
                        } else if (i24 != 183) {
                            if (i24 == 19899) {
                                int i48 = fVar3.A;
                                if (i48 != -1) {
                                    long j15 = fVar3.B;
                                    if (j15 != -1) {
                                        if (i48 == 475249515) {
                                            fVar3.K = j15;
                                        }
                                    }
                                }
                                throw t0.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i24 == 25152) {
                                fVar3.h(i24);
                                e eVar2 = fVar3.y;
                                if (eVar2.i) {
                                    f3.i0 i0Var = eVar2.k;
                                    if (i0Var == null) {
                                        throw t0.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    eVar2.m = new r(null, true, new e2.q(e2.l.b, null, "video/webm", i0Var.b));
                                }
                            } else if (i24 == 28032) {
                                fVar3.h(i24);
                                e eVar3 = fVar3.y;
                                if (eVar3.i && eVar3.j != null) {
                                    throw t0.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i24 == 357149030) {
                                if (fVar3.t == -9223372036854775807L) {
                                    fVar3.t = 1000000L;
                                }
                                long j16 = fVar3.u;
                                if (j16 != -9223372036854775807L) {
                                    fVar3.v = fVar3.n(j16);
                                }
                            } else if (i24 == 374648427) {
                                boolean z14 = z11;
                                if (r92.size() == 0) {
                                    throw t0.a(null, "No valid tracks were found");
                                }
                                boolean z15 = (!fVar3.d || fVar3.K == -1) ? true : z14 ? 1 : 0;
                                int i49 = -1;
                                int i50 = -1;
                                int i51 = -1;
                                int i52 = -1;
                                for (int i53 = z14 ? 1 : 0; i53 < r92.size(); i53++) {
                                    e eVar4 = (e) r92.valueAt(i53);
                                    int i54 = eVar4.e;
                                    if (i54 == 2) {
                                        if (eVar4.Y) {
                                            i49 = eVar4.d;
                                        }
                                        if (i50 == -1) {
                                            i50 = eVar4.d;
                                        }
                                    } else if (i54 == 1) {
                                        if (eVar4.Y) {
                                            i51 = eVar4.d;
                                        }
                                        if (i52 == -1) {
                                            i52 = eVar4.d;
                                        }
                                    }
                                    if (z15) {
                                        eVar4.a0.getClass();
                                        if (!eVar4.W) {
                                            j0 j0Var = eVar4.a0;
                                            e2.u uVar = eVar4.b0;
                                            uVar.getClass();
                                            j0Var.g(uVar);
                                        }
                                    }
                                }
                                if (i49 != -1) {
                                    fVar3.I = i49;
                                } else if (i50 != -1) {
                                    fVar3.I = i50;
                                } else if (i51 != -1) {
                                    fVar3.I = i51;
                                } else if (i52 != -1) {
                                    fVar3.I = i52;
                                } else {
                                    fVar3.I = r92.size() > 0 ? ((e) r92.valueAt(z14 ? 1 : 0)).d : -1;
                                }
                                if (z15) {
                                    fVar3.k();
                                }
                            } else if (i24 == 475249515 && !fVar3.z) {
                                ?? r62 = z11;
                                while (true) {
                                    if (r62 < r83.size()) {
                                        if (((List) r83.valueAt(r62)).isEmpty()) {
                                            r62++;
                                        } else if (fVar3.v != -9223372036854775807L) {
                                            for (?? r63 = z11; r63 < r83.size(); r63++) {
                                                Collections.sort((List) r83.valueAt(r63));
                                            }
                                            fVar3.j0.f(new d(r83, fVar3.v, fVar3.I, fVar3.s, fVar3.r));
                                        }
                                    }
                                }
                                fVar3.j0.f(new f3.t(fVar3.v));
                                fVar3.z = r42;
                                fVar3.D = z11;
                                int i55 = r42;
                                for (?? r64 = z11; r64 < r92.size(); r64 = i16 + 1) {
                                    e eVar5 = (e) r92.valueAt(r64);
                                    long j17 = fVar3.v;
                                    long j18 = fVar3.s;
                                    long j19 = fVar3.r;
                                    boolean z16 = z11;
                                    int i56 = i55;
                                    if (eVar5.e != 2 || (list5 = (List) r83.get(eVar5.d)) == null || list5.isEmpty()) {
                                        i16 = r64;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i16 = r64;
                                        } else {
                                            i16 = r64;
                                            int min = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i57 = z16 ? 1 : 0;
                                            int i58 = -1;
                                            while (i57 < min) {
                                                c cVar = (c) list5.get(i57);
                                                long j20 = j18;
                                                long j21 = cVar.a;
                                                long j22 = cVar.c;
                                                long j23 = cVar.b;
                                                if (j21 <= 10000000) {
                                                    if (i57 < list5.size() - 1) {
                                                        c cVar2 = (c) list5.get(i57 + 1);
                                                        i17 = i57;
                                                        j10 = (cVar2.b + cVar2.c) - (j23 + j22);
                                                        j11 = cVar2.a - j21;
                                                    } else {
                                                        i17 = i57;
                                                        j10 = (j20 + j19) - (j23 + j22);
                                                        j11 = j17 - j21;
                                                    }
                                                    if (j11 > 0) {
                                                        double d2 = j10 / j11;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i58 = i17;
                                                        }
                                                    }
                                                    i57 = i17 + 1;
                                                    j18 = j20;
                                                } else if (i58 != -1) {
                                                    j3 = ((c) list5.get(i58)).a;
                                                    if (j3 != -9223372036854775807L) {
                                                        e2.u uVar2 = eVar5.b0;
                                                        uVar2.getClass();
                                                        q0 q0Var = uVar2.l;
                                                        o3.c cVar3 = new o3.c(j3);
                                                        if (q0Var == null) {
                                                            p0[] p0VarArr = new p0[i56];
                                                            p0VarArr[z16 ? 1 : 0] = cVar3;
                                                            a12 = new q0(p0VarArr);
                                                        } else {
                                                            p0[] p0VarArr2 = new p0[i56];
                                                            p0VarArr2[z16 ? 1 : 0] = cVar3;
                                                            a12 = q0Var.a(p0VarArr2);
                                                        }
                                                        t a16 = eVar5.b0.a();
                                                        a16.k = a12;
                                                        eVar5.b0 = new e2.u(a16);
                                                    }
                                                }
                                            }
                                            if (i58 != -1) {
                                            }
                                        }
                                        j3 = -9223372036854775807L;
                                        if (j3 != -9223372036854775807L) {
                                        }
                                    }
                                    if (!eVar5.W) {
                                        eVar5.a0.getClass();
                                        j0 j0Var2 = eVar5.a0;
                                        e2.u uVar3 = eVar5.b0;
                                        uVar3.getClass();
                                        j0Var2.g(uVar3);
                                    }
                                    z11 = z16 ? 1 : 0;
                                    i55 = 1;
                                }
                                fVar3.k();
                                z10 = z11;
                                pVar2 = pVar;
                            }
                        } else if (!fVar3.z) {
                            fVar3.g(i24);
                            if (fVar3.E != -9223372036854775807L && (i15 = fVar3.F) != -1 && fVar3.G != -1) {
                                List list7 = (List) r83.get(i15);
                                if (list7 == null) {
                                    list7 = new ArrayList();
                                    r83.put(fVar3.F, list7);
                                }
                                list7.add(new c(fVar3.E, fVar3.s + fVar3.G, fVar3.H));
                            }
                        }
                        z10 = false;
                        pVar2 = pVar;
                    } else {
                        if (fVar3.O == 2) {
                            e eVar6 = (e) r92.get(fVar3.U);
                            eVar6.a0.getClass();
                            if (fVar3.Z > 0 && "A_OPUS".equals(eVar6.c)) {
                                x xVar3 = fVar3.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(fVar3.Z).array();
                                xVar3.getClass();
                                xVar3.L(array.length, array);
                            }
                            int i59 = 0;
                            for (int i60 = 0; i60 < fVar3.S; i60++) {
                                i59 += fVar3.T[i60];
                            }
                            int i61 = 0;
                            while (i61 < fVar3.S) {
                                long j24 = fVar3.P + ((eVar6.f * i61) / 1000);
                                int i62 = fVar3.W;
                                if (i61 == 0 && !fVar3.Y) {
                                    i62 |= 1;
                                }
                                int i63 = fVar3.T[i61];
                                int i64 = i59 - i63;
                                fVar3.i(eVar6, j24, i62, i63, i64);
                                i61++;
                                i59 = i64;
                            }
                            z10 = false;
                            fVar3.O = 0;
                            pVar2 = pVar;
                        }
                        z10 = false;
                        pVar2 = pVar;
                    }
                }
            }
        }
        if (z13) {
            return 0;
        }
        int i65 = 0;
        while (true) {
            SparseArray sparseArray = fVar.c;
            if (i65 >= sparseArray.size()) {
                return -1;
            }
            e eVar7 = (e) sparseArray.valueAt(i65);
            eVar7.a0.getClass();
            k0 k0Var = eVar7.V;
            if (k0Var != null) {
                k0Var.a(eVar7.a0, eVar7.k);
            }
            i65++;
        }
    }

    public final void g(int i7) {
        if (this.D) {
            return;
        }
        throw t0.a(null, "Element " + i7 + " must be in a Cues");
    }

    public final void h(int i7) {
        if (this.y != null) {
            return;
        }
        throw t0.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(e eVar, long j3, int i7, int i10, int i11) {
        byte[] j10;
        int i12;
        int i13;
        k0 k0Var = eVar.V;
        if (k0Var != null) {
            k0Var.b(eVar.a0, j3, i7, i10, i11, eVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(eVar.c) || "S_TEXT/ASS".equals(eVar.c) || "S_TEXT/SSA".equals(eVar.c) || "S_TEXT/WEBVTT".equals(eVar.c)) {
                if (this.S > 1) {
                    h2.a.l("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.Q;
                    if (j11 == -9223372036854775807L) {
                        h2.a.l("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = eVar.c;
                        x xVar = this.m;
                        byte[] bArr = xVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                j10 = j(j11, "%01d:%02d:%02d:%02d", 10000L);
                                i12 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                j10 = j(j11, "%02d:%02d:%02d.%03d", 1000L);
                                i12 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                j10 = j(j11, "%02d:%02d:%02d,%03d", 1000L);
                                i12 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(j10, 0, bArr, i12, j10.length);
                        int i14 = xVar.b;
                        while (true) {
                            if (i14 < xVar.c) {
                                if (xVar.a[i14] == 0) {
                                    xVar.M(i14);
                                } else {
                                    i14++;
                                }
                            }
                        }
                        eVar.a0.b(xVar.c, xVar);
                        i13 = i10 + xVar.c;
                        if ((i7 & TLObject.FLAG_28) != 0) {
                            int i15 = this.S;
                            x xVar2 = this.p;
                            if (i15 > 1) {
                                xVar2.K(0);
                            } else {
                                int i16 = xVar2.c;
                                eVar.a0.a(xVar2, i16, 2);
                                i13 += i16;
                            }
                        }
                        eVar.a0.c(j3, i7, i13, i11, eVar.k);
                    }
                }
            }
            i13 = i10;
            if ((i7 & TLObject.FLAG_28) != 0) {
            }
            eVar.a0.c(j3, i7, i13, i11, eVar.k);
        }
        this.N = true;
    }

    public final void k() {
        if (!this.x) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i7 >= sparseArray.size()) {
                q qVar = this.j0;
                qVar.getClass();
                qVar.U0();
                this.x = false;
                return;
            }
            if (((e) sparseArray.valueAt(i7)).W) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void l(p pVar, int i7) {
        x xVar = this.i;
        if (xVar.c >= i7) {
            return;
        }
        byte[] bArr = xVar.a;
        if (bArr.length < i7) {
            xVar.c(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = xVar.a;
        int i10 = xVar.c;
        pVar.readFully(bArr2, i10, i7 - i10);
        xVar.M(i7);
    }

    public final void m() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.K(0);
    }

    public final long n(long j3) {
        long j10 = this.t;
        if (j10 == -9223372036854775807L) {
            throw t0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = m0.a;
        return m0.a0(j3, j10, 1000L, RoundingMode.DOWN);
    }

    public final int o(p pVar, e eVar, int i7, boolean z9) {
        int e10;
        int e11;
        int i10;
        if ("S_TEXT/UTF8".equals(eVar.c)) {
            p(pVar, k0, i7);
            int i11 = this.b0;
            m();
            return i11;
        }
        if ("S_TEXT/ASS".equals(eVar.c) || "S_TEXT/SSA".equals(eVar.c)) {
            p(pVar, m0, i7);
            int i12 = this.b0;
            m();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(eVar.c)) {
            p(pVar, n0, i7);
            int i13 = this.b0;
            m();
            return i13;
        }
        if (eVar.W) {
            eVar.b0.getClass();
            x xVar = new x(i7);
            if (pVar.k(xVar.a, 0, i7, true)) {
                pVar.q();
                if (f3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    xVar.k(0, 10, bArr);
                    xVar.N(0);
                    int g10 = f3.b.g(bArr);
                    if (g10 > 0 && xVar.a() >= g10 + 4) {
                        xVar.O(g10);
                        if (f3.b.i(xVar.m()) == 2) {
                            t a10 = eVar.b0.a();
                            a10.r = s0.n("audio/vnd.dts.hd");
                            eVar.b0 = new e2.u(a10);
                        }
                    }
                }
            }
            eVar.a0.g(eVar.b0);
            eVar.W = false;
            k();
        }
        j0 j0Var = eVar.a0;
        boolean z10 = this.d0;
        x xVar2 = this.l;
        if (!z10) {
            boolean z11 = eVar.i;
            x xVar3 = this.i;
            if (z11) {
                this.W &= -1073741825;
                if (!this.e0) {
                    pVar.readFully(xVar3.a, 0, 1);
                    this.a0++;
                    byte b10 = xVar3.a[0];
                    if ((b10 & 128) == 128) {
                        throw t0.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b10;
                    this.e0 = true;
                }
                byte b11 = this.h0;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.W |= TLObject.FLAG_30;
                    if (!this.i0) {
                        x xVar4 = this.n;
                        pVar.readFully(xVar4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        xVar3.a[0] = (byte) ((z12 ? 128 : 0) | 8);
                        xVar3.N(0);
                        j0Var.a(xVar3, 1, 1);
                        this.b0++;
                        xVar4.N(0);
                        j0Var.a(xVar4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z12) {
                        if (!this.f0) {
                            pVar.readFully(xVar3.a, 0, 1);
                            this.a0++;
                            xVar3.N(0);
                            this.g0 = xVar3.A();
                            this.f0 = true;
                        }
                        int i14 = this.g0 * 4;
                        xVar3.K(i14);
                        pVar.readFully(xVar3.a, 0, i14);
                        this.a0 += i14;
                        short s5 = (short) ((this.g0 / 2) + 1);
                        int i15 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.q = ByteBuffer.allocate(i15);
                        }
                        this.q.position(0);
                        this.q.putShort(s5);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.g0;
                            if (i16 >= i10) {
                                break;
                            }
                            int E = xVar3.E();
                            if (i16 % 2 == 0) {
                                this.q.putShort((short) (E - i17));
                            } else {
                                this.q.putInt(E - i17);
                            }
                            i16++;
                            i17 = E;
                        }
                        int i18 = (i7 - this.a0) - i17;
                        if (i10 % 2 == 1) {
                            this.q.putInt(i18);
                        } else {
                            this.q.putShort((short) i18);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        x xVar5 = this.o;
                        xVar5.L(i15, array);
                        j0Var.a(xVar5, i15, 1);
                        this.b0 += i15;
                    }
                }
            } else {
                byte[] bArr2 = eVar.j;
                if (bArr2 != null) {
                    xVar2.L(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(eVar.c) ? z9 : eVar.g > 0) {
                this.W |= TLObject.FLAG_28;
                this.p.K(0);
                int i19 = (xVar2.c + i7) - this.a0;
                xVar3.K(4);
                byte[] bArr3 = xVar3.a;
                bArr3[0] = (byte) ((i19 >> 24) & qs.e4);
                bArr3[1] = (byte) ((i19 >> 16) & qs.e4);
                bArr3[2] = (byte) ((i19 >> 8) & qs.e4);
                bArr3[3] = (byte) (i19 & qs.e4);
                j0Var.a(xVar3, 4, 2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i20 = i7 + xVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(eVar.c) && !"V_MPEGH/ISO/HEVC".equals(eVar.c)) {
            if (eVar.V != null) {
                ia.p(xVar2.c == 0);
                eVar.V.c(pVar);
            }
            while (true) {
                int i21 = this.a0;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int a11 = xVar2.a();
                if (a11 > 0) {
                    e11 = Math.min(i22, a11);
                    j0Var.b(e11, xVar2);
                } else {
                    e11 = j0Var.e(pVar, i22, false);
                }
                this.a0 += e11;
                this.b0 += e11;
            }
        } else {
            x xVar6 = this.h;
            byte[] bArr4 = xVar6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i23 = eVar.c0;
            int i24 = 4 - i23;
            while (this.a0 < i20) {
                int i25 = this.c0;
                if (i25 == 0) {
                    int min = Math.min(i23, xVar2.a());
                    pVar.readFully(bArr4, i24 + min, i23 - min);
                    if (min > 0) {
                        xVar2.k(i24, min, bArr4);
                    }
                    this.a0 += i23;
                    xVar6.N(0);
                    this.c0 = xVar6.E();
                    x xVar7 = this.g;
                    xVar7.N(0);
                    j0Var.b(4, xVar7);
                    this.b0 += 4;
                } else {
                    int a12 = xVar2.a();
                    if (a12 > 0) {
                        e10 = Math.min(i25, a12);
                        j0Var.b(e10, xVar2);
                    } else {
                        e10 = j0Var.e(pVar, i25, false);
                    }
                    this.a0 += e10;
                    this.b0 += e10;
                    this.c0 -= e10;
                }
            }
        }
        if ("A_VORBIS".equals(eVar.c)) {
            x xVar8 = this.j;
            xVar8.N(0);
            j0Var.b(4, xVar8);
            this.b0 += 4;
        }
        int i26 = this.b0;
        m();
        return i26;
    }

    public final void p(p pVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        x xVar = this.m;
        byte[] bArr2 = xVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.a, bArr.length, i7);
        xVar.N(0);
        xVar.M(length);
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
