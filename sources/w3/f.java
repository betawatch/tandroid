package w3;

import android.util.Pair;
import android.util.SparseArray;
import b4.k;
import b4.n;
import b8.zb;
import d2.m;
import d2.r;
import d2.r0;
import d2.s0;
import d2.u0;
import d2.v;
import d2.v0;
import e3.h0;
import e3.j0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import e3.x;
import e5.u;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
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
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final y g;
    public int g0;
    public final y h;
    public byte h0;
    public final y i;
    public boolean i0;
    public final y j;
    public q j0;
    public final y k;
    public final y l;
    public final y m;
    public final y n;
    public final y o;
    public final y p;
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
        String str = n0.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.google.android.recaptcha.internal.a.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.google.android.recaptcha.internal.a.p(hs.K2, hashMap, "htc_video_rotA-180", hs.t4, "htc_video_rotA-270");
        p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i3) {
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
        bVar.d = new y00(this);
        this.f = kVar;
        this.C = new SparseArray();
        this.d = (i3 & 1) == 0;
        this.e = (i3 & 2) == 0;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new y(4);
        this.j = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new y(4);
        this.g = new y(h2.o.a);
        this.h = new y(4);
        this.l = new y();
        this.m = new y();
        this.n = new y(8);
        this.o = new y();
        this.p = new y();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] j(long j10, String str, long j11) {
        zb.f(j10 != -9223372036854775807L);
        int i3 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i3 * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - (i10 * 60000000);
        int i11 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11)));
        String str2 = n0.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        u uVar = new u(17, (short) 0);
        y yVar = (y) uVar.c;
        l lVar = (l) pVar;
        long j10 = lVar.c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i3 = (int) j11;
        lVar.h(yVar.a, 0, 4, false);
        long C = yVar.C();
        uVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i10 = uVar.b + 1;
                uVar.b = i10;
                if (i10 == i3) {
                    break;
                }
                lVar.h(yVar.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (yVar.a[0] & 255);
            } else {
                long p10 = uVar.p(lVar);
                long j12 = uVar.b;
                if (p10 != Long.MIN_VALUE && (j10 == -1 || j12 + p10 < j10)) {
                    while (true) {
                        long j13 = uVar.b;
                        long j14 = j12 + p10;
                        if (j13 < j14) {
                            if (uVar.p(lVar) != Long.MIN_VALUE) {
                                long p11 = uVar.p(lVar);
                                if (p11 < 0 || p11 > 2147483647L) {
                                    break;
                                }
                                if (p11 != 0) {
                                    int i11 = (int) p11;
                                    lVar.w(i11, false);
                                    uVar.b += i11;
                                }
                            } else {
                                break;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e3.o
    public final void c(q qVar) {
        if (this.e) {
            qVar = new n(qVar, this.f);
        }
        this.j0 = qVar;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
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
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i3 >= sparseArray.size()) {
                return;
            }
            j0 j0Var = ((e) sparseArray.valueAt(i3)).V;
            if (j0Var != null) {
                j0Var.b = false;
                j0Var.c = 0;
            }
            i3++;
        }
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
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
    /* JADX WARN: Type inference failed for: r8v0, types: [w3.g] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        boolean z10;
        int i3;
        boolean z11;
        ?? r15;
        String str;
        int i10;
        int a10;
        p pVar2;
        char c2;
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
        d2.u uVar;
        boolean i12;
        int i13;
        d2.n nVar;
        byte[] bArr;
        int i14;
        String str4;
        com.google.android.gms.internal.clearcut.e c10;
        List list4;
        int i15;
        List list5;
        int i16;
        long j10;
        int i17;
        long j11;
        long j12;
        s0 a11;
        f fVar = this;
        boolean z12 = false;
        fVar.N = false;
        boolean z13 = true;
        boolean z14 = true;
        while (z14 && !fVar.N) {
            b bVar = fVar.a;
            ?? r82 = bVar.c;
            ArrayDeque arrayDeque = bVar.b;
            bVar.d.getClass();
            ?? r42 = z13;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || pVar.getPosition() < aVar.b) {
                    ?? r43 = z12;
                    p pVar3 = pVar;
                    if (bVar.e == 0) {
                        int i18 = 4;
                        long b10 = r82.b(pVar3, true, r43, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar.a;
                            pVar3.o();
                            int i19 = r43;
                            while (true) {
                                pVar3.c(i19, i18, bArr2);
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
                                pVar3.u(1);
                                i18 = 4;
                                i19 = 0;
                            }
                            pVar3.u(i10);
                            b10 = a10;
                        }
                        z10 = true;
                        if (b10 == -1) {
                            z11 = false;
                            z14 = false;
                            p pVar4 = pVar3;
                        } else {
                            bVar.f = (int) b10;
                            bVar.e = 1;
                        }
                    } else {
                        z10 = true;
                    }
                    if (bVar.e == z10) {
                        bVar.g = r82.b(pVar3, false, z10, 8);
                        bVar.e = 2;
                    }
                    y00 y00Var = bVar.d;
                    int i21 = bVar.f;
                    Object obj2 = y00Var.a;
                    switch (i21) {
                        case hs.P1 /* 131 */:
                        case hs.S1 /* 136 */:
                        case hs.l2 /* 155 */:
                        case hs.p2 /* 159 */:
                        case hs.G2 /* 176 */:
                        case hs.J2 /* 179 */:
                        case hs.Q2 /* 186 */:
                        case hs.s3 /* 215 */:
                        case hs.H3 /* 231 */:
                        case hs.N3 /* 238 */:
                        case hs.P3 /* 240 */:
                        case hs.Q3 /* 241 */:
                        case hs.W3 /* 247 */:
                        case hs.a4 /* 251 */:
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
                            i3 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i3 = 3;
                            break;
                        case hs.q2 /* 160 */:
                        case hs.w2 /* 166 */:
                        case hs.E2 /* 174 */:
                        case hs.N2 /* 183 */:
                        case hs.R2 /* 187 */:
                        case hs.B3 /* 224 */:
                        case hs.C3 /* 225 */:
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
                            i3 = 1;
                            break;
                        case hs.r2 /* 161 */:
                        case hs.t2 /* 163 */:
                        case hs.v2 /* 165 */:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i3 = 4;
                            break;
                        case hs.L2 /* 181 */:
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
                            i3 = 5;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    if (i3 == 0) {
                        pVar3.u((int) bVar.g);
                        bVar.e = 0;
                        z12 = false;
                        r42 = 1;
                    } else if (i3 == 1) {
                        long position = pVar3.getPosition();
                        arrayDeque.push(new a(bVar.f, bVar.g + position));
                        bVar.d.A(position, bVar.f, bVar.g);
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else if (i3 == 2) {
                        long j13 = bVar.g;
                        if (j13 > 8) {
                            throw v0.a(null, "Invalid integer size: " + bVar.g);
                        }
                        y00Var.v(i21, bVar.a(pVar3, (int) j13));
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else if (i3 == 3) {
                        long j14 = bVar.g;
                        if (j14 > 2147483647L) {
                            throw v0.a(null, "String element size: " + bVar.g);
                        }
                        int i22 = (int) j14;
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
                        y00Var.B(i21, str);
                        bVar.e = r15;
                        z11 = r15;
                        pVar2 = pVar3;
                    } else if (i3 == 4) {
                        y00Var.g(i21, (int) bVar.g, pVar3);
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else {
                        if (i3 != 5) {
                            throw v0.a(null, "Invalid element type " + i3);
                        }
                        long j15 = bVar.g;
                        if (j15 != 4 && j15 != 8) {
                            throw v0.a(null, "Invalid float size: " + bVar.g);
                        }
                        int i23 = (int) j15;
                        double intBitsToFloat = i23 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(bVar.a(pVar3, i23));
                        f fVar2 = (f) y00Var.a;
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
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    }
                } else {
                    y00 y00Var2 = bVar.d;
                    int i24 = ((a) arrayDeque.pop()).a;
                    f fVar3 = (f) y00Var2.a;
                    ?? r83 = fVar3.C;
                    ?? r9 = fVar3.c;
                    fVar3.j0.getClass();
                    if (i24 != 160) {
                        if (i24 == 174) {
                            e eVar = fVar3.y;
                            eVar.getClass();
                            String str5 = eVar.c;
                            if (str5 == null) {
                                throw v0.a(null, "CodecId is missing in TrackEntry element");
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
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2095575984:
                                            if (str5.equals("V_MPEG4/ISO/SP")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1985379776:
                                            if (str5.equals("A_MS/ACM")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1784763192:
                                            if (str5.equals("A_TRUEHD")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1730367663:
                                            if (str5.equals("A_VORBIS")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1482641358:
                                            if (str5.equals("A_MPEG/L2")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1482641357:
                                            if (str5.equals("A_MPEG/L3")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1373388978:
                                            if (str5.equals("V_MS/VFW/FOURCC")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -933872740:
                                            if (str5.equals("S_DVBSUB")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -538363189:
                                            if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                c2 = '\t';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -538363109:
                                            if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                c2 = '\n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -425012669:
                                            if (str5.equals("S_VOBSUB")) {
                                                c2 = 11;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -356037306:
                                            if (str5.equals("A_DTS/LOSSLESS")) {
                                                c2 = '\f';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 62923557:
                                            if (str5.equals("A_AAC")) {
                                                c2 = '\r';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 62923603:
                                            if (str5.equals("A_AC3")) {
                                                c2 = 14;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 62927045:
                                            if (str5.equals("A_DTS")) {
                                                c2 = 15;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82318131:
                                            if (str5.equals("V_AV1")) {
                                                c2 = 16;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82338133:
                                            if (str5.equals("V_VP8")) {
                                                c2 = 17;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82338134:
                                            if (str5.equals("V_VP9")) {
                                                c2 = 18;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 99146302:
                                            if (str5.equals("S_HDMV/PGS")) {
                                                c2 = 19;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 444813526:
                                            if (str5.equals("V_THEORA")) {
                                                c2 = 20;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 542569478:
                                            if (str5.equals("A_DTS/EXPRESS")) {
                                                c2 = 21;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 635596514:
                                            if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                c2 = 22;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 725948237:
                                            if (str5.equals("A_PCM/INT/BIG")) {
                                                c2 = 23;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 725957860:
                                            if (str5.equals("A_PCM/INT/LIT")) {
                                                c2 = 24;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 738597099:
                                            if (str5.equals("S_TEXT/ASS")) {
                                                c2 = 25;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 738614379:
                                            if (str5.equals("S_TEXT/SSA")) {
                                                c2 = 26;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c2 = 27;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c2 = 28;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c2 = 29;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c2 = 30;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c2 = 31;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c2 = ' ';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c2 = '!';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    String str6 = "video/x-unknown";
                                    switch (c2) {
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
                                            if (eVar.P != null && (c10 = com.google.android.gms.internal.clearcut.e.c(new y(eVar.P))) != null) {
                                                str2 = c10.a;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i26 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map = p0;
                                            if (!i12) {
                                                uVar.J = eVar.Q;
                                                uVar.K = eVar.S;
                                                uVar.L = D;
                                            } else if (u0.m(str6)) {
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
                                                    nVar = new d2.n(i29, i30, i31, bArr, i32, i32);
                                                } else {
                                                    nVar = null;
                                                }
                                                String str7 = eVar.b;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(eVar.b)).intValue();
                                                if (eVar.t == 0 && Float.compare(eVar.u, 0.0f) == 0 && Float.compare(eVar.v, 0.0f) == 0) {
                                                    if (Float.compare(eVar.w, 0.0f) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(eVar.w, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(eVar.w, -180.0f) == 0 || Float.compare(eVar.w, 180.0f) == 0) {
                                                        intValue = hs.K2;
                                                    } else if (Float.compare(eVar.w, -90.0f) == 0) {
                                                        intValue = hs.t4;
                                                    }
                                                }
                                                uVar.y = eVar.n;
                                                uVar.z = eVar.o;
                                                uVar.E = f10;
                                                uVar.D = intValue;
                                                uVar.F = eVar.x;
                                                uVar.G = eVar.y;
                                                uVar.H = nVar;
                                            } else if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                throw v0.a(null, "Unexpected MIME type.");
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                uVar.b = eVar.b;
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case 2:
                                            y yVar = new y(eVar.a(eVar.c));
                                            try {
                                                int t10 = yVar.t();
                                                if (t10 != 1) {
                                                    if (t10 == 65534) {
                                                        yVar.N(24);
                                                        long u11 = yVar.u();
                                                        UUID uuid = o0;
                                                        if (u11 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    g2.a.l("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i11 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                        str2 = c10.a;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i262 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    uVar = new d2.u();
                                                    i12 = u0.i(str6);
                                                    Map map2 = p0;
                                                    if (!i12) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                        uVar.b = eVar.b;
                                                        break;
                                                    }
                                                    uVar.a = Integer.toString(i25);
                                                    uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    uVar.r = u0.n(str6);
                                                    uVar.s = i11;
                                                    uVar.d = eVar.Z;
                                                    uVar.e = i262;
                                                    uVar.u = list3;
                                                    uVar.j = str2;
                                                    uVar.v = eVar.m;
                                                    eVar.b0 = uVar.a();
                                                    eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                    r9.put(eVar.d, eVar);
                                                }
                                                int i33 = eVar.R;
                                                String str8 = n0.a;
                                                D = n0.D(i33, ByteOrder.LITTLE_ENDIAN);
                                                if (D == 0) {
                                                    g2.a.l("MatroskaExtractor", "Unsupported PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i11 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                    }
                                                    int i2622 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    uVar = new d2.u();
                                                    i12 = u0.i(str6);
                                                    Map map22 = p0;
                                                    if (!i12) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    uVar.a = Integer.toString(i25);
                                                    uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    uVar.r = u0.n(str6);
                                                    uVar.s = i11;
                                                    uVar.d = eVar.Z;
                                                    uVar.e = i2622;
                                                    uVar.u = list3;
                                                    uVar.j = str2;
                                                    uVar.v = eVar.m;
                                                    eVar.b0 = uVar.a();
                                                    eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                    r9.put(eVar.d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i26222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i26222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw v0.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            eVar.V = new j0();
                                            str6 = "audio/true-hd";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i262222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case 4:
                                            byte[] a12 = eVar.a(str5);
                                            try {
                                                r22 = a12[0];
                                                try {
                                                    if (r22 != 2) {
                                                        throw v0.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i34 = 0;
                                                    int i35 = 1;
                                                    while (true) {
                                                        int i36 = a12[i35] & hs.e4;
                                                        if (i36 == 255) {
                                                            i34 += hs.e4;
                                                            i35++;
                                                        } else {
                                                            int i37 = i35 + 1;
                                                            int i38 = i34 + i36;
                                                            int i39 = 0;
                                                            while (true) {
                                                                int i40 = a12[i37] & hs.e4;
                                                                if (i40 == 255) {
                                                                    i39 += hs.e4;
                                                                    i37++;
                                                                } else {
                                                                    int i41 = i37 + 1;
                                                                    int i42 = i39 + i40;
                                                                    if (a12[i41] != 1) {
                                                                        throw v0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i38];
                                                                    System.arraycopy(a12, i41, bArr6, 0, i38);
                                                                    int i43 = i41 + i38;
                                                                    if (a12[i43] != 3) {
                                                                        throw v0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i44 = i43 + i42;
                                                                    if (a12[i44] != 5) {
                                                                        throw v0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a12.length - i44];
                                                                    System.arraycopy(a12, i44, bArr7, 0, a12.length - i44);
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
                                                                    uVar = new d2.u();
                                                                    i12 = u0.i(str6);
                                                                    Map map22222 = p0;
                                                                    if (!i12) {
                                                                    }
                                                                    str4 = eVar.b;
                                                                    if (str4 != null) {
                                                                    }
                                                                    uVar.a = Integer.toString(i25);
                                                                    uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                                    uVar.r = u0.n(str6);
                                                                    uVar.s = i11;
                                                                    uVar.d = eVar.Z;
                                                                    uVar.e = i2622222;
                                                                    uVar.u = list3;
                                                                    uVar.j = str2;
                                                                    uVar.v = eVar.m;
                                                                    eVar.b0 = uVar.a();
                                                                    eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                                    r9.put(eVar.d, eVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw v0.a(r22, "Error parsing vorbis codec private");
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case 7:
                                            y yVar2 = new y(eVar.a(eVar.c));
                                            try {
                                                yVar2.O(16);
                                                long r5 = yVar2.r();
                                                if (r5 == 1482049860) {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw v0.a(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else {
                                                    if (r5 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (r5 == 826496599) {
                                                            byte[] bArr8 = yVar2.a;
                                                            for (int i45 = yVar2.b + 20; i45 < bArr8.length - 4; i45++) {
                                                                if (bArr8[i45] == 0 && bArr8[i45 + 1] == 0 && bArr8[i45 + 2] == 1) {
                                                                    if (bArr8[i45 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i45, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            runtimeException = null;
                                                            throw v0.a(null, "Failed to find FourCC VC1 initialization data");
                                                        }
                                                        g2.a.l("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
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
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map22222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i2622222222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case '\n':
                                            e3.d a13 = e3.d.a(new y(eVar.a(eVar.c)));
                                            ArrayList arrayList3 = a13.a;
                                            eVar.c0 = a13.b;
                                            str3 = a13.l;
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(eVar.a(str5));
                                            byte[] bArr10 = eVar.l;
                                            e3.a n4 = e3.b.n(new c4.f(bArr10, bArr10.length), false);
                                            eVar.S = n4.b;
                                            eVar.Q = n4.c;
                                            str6 = "audio/mp4a-latm";
                                            list = singletonList2;
                                            str2 = n4.a;
                                            D = -1;
                                            i11 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i262222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case 20:
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i26222222222222222222222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
                                            } else {
                                                g2.a.l("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                D = -1;
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i262222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map2222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i262222222222222222222222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
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
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map22222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i2622222222222222222222222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
                                            } else {
                                                if (i46 == 16) {
                                                    D = TLObject.FLAG_28;
                                                } else if (i46 == 24) {
                                                    D = 1342177280;
                                                } else if (i46 == 32) {
                                                    D = 1610612736;
                                                } else {
                                                    g2.a.l("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i11 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                    }
                                                    int i26222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    uVar = new d2.u();
                                                    i12 = u0.i(str6);
                                                    Map map222222222222222222222222 = p0;
                                                    if (!i12) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    uVar.a = Integer.toString(i25);
                                                    uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    uVar.r = u0.n(str6);
                                                    uVar.s = i11;
                                                    uVar.d = eVar.Z;
                                                    uVar.e = i26222222222222222222222222;
                                                    uVar.u = list3;
                                                    uVar.j = str2;
                                                    uVar.v = eVar.m;
                                                    eVar.b0 = uVar.a();
                                                    eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                    r9.put(eVar.d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i262222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map2222222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i262222222222222222222222222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
                                            }
                                            break;
                                        case 24:
                                            int i47 = eVar.R;
                                            String str9 = n0.a;
                                            D = n0.D(i47, ByteOrder.LITTLE_ENDIAN);
                                            if (D == 0) {
                                                g2.a.l("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                D = -1;
                                                i11 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i2622222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                uVar = new d2.u();
                                                i12 = u0.i(str6);
                                                Map map22222222222222222222222222 = p0;
                                                if (!i12) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                uVar.a = Integer.toString(i25);
                                                uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                uVar.r = u0.n(str6);
                                                uVar.s = i11;
                                                uVar.d = eVar.Z;
                                                uVar.e = i2622222222222222222222222222;
                                                uVar.u = list3;
                                                uVar.j = str2;
                                                uVar.v = eVar.m;
                                                eVar.b0 = uVar.a();
                                                eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                                r9.put(eVar.d, eVar);
                                            }
                                            str6 = "audio/raw";
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case 27:
                                            x a14 = x.a(new y(eVar.a(eVar.c)), false, null);
                                            List list6 = a14.a;
                                            eVar.c0 = a14.b;
                                            str3 = a14.n;
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case hs.T /* 30 */:
                                            str6 = "video/mpeg2";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2622222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        case hs.U /* 31 */:
                                            str6 = "audio/eac3";
                                            D = -1;
                                            i11 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i26222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map222222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i26222222222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map2222222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i262222222222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
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
                                            uVar = new d2.u();
                                            i12 = u0.i(str6);
                                            Map map22222222222222222222222222222222222 = p0;
                                            if (!i12) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            uVar.a = Integer.toString(i25);
                                            uVar.q = u0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            uVar.r = u0.n(str6);
                                            uVar.s = i11;
                                            uVar.d = eVar.Z;
                                            uVar.e = i2622222222222222222222222222222222222;
                                            uVar.u = list3;
                                            uVar.j = str2;
                                            uVar.v = eVar.m;
                                            eVar.b0 = uVar.a();
                                            eVar.a0 = fVar3.j0.i0(eVar.d, eVar.e);
                                            r9.put(eVar.d, eVar);
                                            break;
                                        default:
                                            throw v0.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    fVar3.y = null;
                                    break;
                            }
                        } else if (i24 != 183) {
                            if (i24 == 19899) {
                                int i48 = fVar3.A;
                                if (i48 != -1) {
                                    long j16 = fVar3.B;
                                    if (j16 != -1) {
                                        if (i48 == 475249515) {
                                            fVar3.K = j16;
                                        }
                                    }
                                }
                                throw v0.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i24 == 25152) {
                                fVar3.h(i24);
                                e eVar2 = fVar3.y;
                                if (eVar2.i) {
                                    h0 h0Var = eVar2.k;
                                    if (h0Var == null) {
                                        throw v0.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    eVar2.m = new d2.s(null, true, new r(m.b, null, "video/webm", h0Var.b));
                                }
                            } else if (i24 == 28032) {
                                fVar3.h(i24);
                                e eVar3 = fVar3.y;
                                if (eVar3.i && eVar3.j != null) {
                                    throw v0.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i24 == 357149030) {
                                if (fVar3.t == -9223372036854775807L) {
                                    fVar3.t = 1000000L;
                                }
                                long j17 = fVar3.u;
                                if (j17 != -9223372036854775807L) {
                                    fVar3.v = fVar3.n(j17);
                                }
                            } else if (i24 == 374648427) {
                                boolean z15 = z12;
                                if (r9.size() == 0) {
                                    throw v0.a(null, "No valid tracks were found");
                                }
                                boolean z16 = (!fVar3.d || fVar3.K == -1) ? true : z15 ? 1 : 0;
                                int i49 = -1;
                                int i50 = -1;
                                int i51 = -1;
                                int i52 = -1;
                                for (int i53 = z15 ? 1 : 0; i53 < r9.size(); i53++) {
                                    e eVar4 = (e) r9.valueAt(i53);
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
                                    if (z16) {
                                        eVar4.a0.getClass();
                                        if (!eVar4.W) {
                                            e3.i0 i0Var = eVar4.a0;
                                            v vVar = eVar4.b0;
                                            vVar.getClass();
                                            i0Var.g(vVar);
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
                                    fVar3.I = r9.size() > 0 ? ((e) r9.valueAt(z15 ? 1 : 0)).d : -1;
                                }
                                if (z16) {
                                    fVar3.k();
                                }
                            } else if (i24 == 475249515 && !fVar3.z) {
                                ?? r62 = z12;
                                while (true) {
                                    if (r62 < r83.size()) {
                                        if (((List) r83.valueAt(r62)).isEmpty()) {
                                            r62++;
                                        } else if (fVar3.v != -9223372036854775807L) {
                                            for (?? r63 = z12; r63 < r83.size(); r63++) {
                                                Collections.sort((List) r83.valueAt(r63));
                                            }
                                            fVar3.j0.f(new d(r83, fVar3.v, fVar3.I, fVar3.s, fVar3.r));
                                        }
                                    }
                                }
                                fVar3.j0.f(new t(fVar3.v));
                                fVar3.z = r42;
                                fVar3.D = z12;
                                int i55 = r42;
                                for (?? r64 = z12; r64 < r9.size(); r64 = i16 + 1) {
                                    e eVar5 = (e) r9.valueAt(r64);
                                    long j18 = fVar3.v;
                                    long j19 = fVar3.s;
                                    long j20 = fVar3.r;
                                    boolean z17 = z12;
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
                                            int i57 = z17 ? 1 : 0;
                                            int i58 = -1;
                                            while (i57 < min) {
                                                c cVar = (c) list5.get(i57);
                                                long j21 = j19;
                                                long j22 = cVar.a;
                                                long j23 = cVar.c;
                                                long j24 = cVar.b;
                                                if (j22 <= 10000000) {
                                                    if (i57 < list5.size() - 1) {
                                                        c cVar2 = (c) list5.get(i57 + 1);
                                                        i17 = i57;
                                                        j11 = (cVar2.b + cVar2.c) - (j24 + j23);
                                                        j12 = cVar2.a - j22;
                                                    } else {
                                                        i17 = i57;
                                                        j11 = (j21 + j20) - (j24 + j23);
                                                        j12 = j18 - j22;
                                                    }
                                                    if (j12 > 0) {
                                                        double d10 = j11 / j12;
                                                        if (d10 > d) {
                                                            d = d10;
                                                            i58 = i17;
                                                        }
                                                    }
                                                    i57 = i17 + 1;
                                                    j19 = j21;
                                                } else if (i58 != -1) {
                                                    j10 = ((c) list5.get(i58)).a;
                                                    if (j10 != -9223372036854775807L) {
                                                        v vVar2 = eVar5.b0;
                                                        vVar2.getClass();
                                                        s0 s0Var = vVar2.l;
                                                        n3.c cVar3 = new n3.c(j10);
                                                        if (s0Var == null) {
                                                            r0[] r0VarArr = new r0[i56];
                                                            r0VarArr[z17 ? 1 : 0] = cVar3;
                                                            a11 = new s0(r0VarArr);
                                                        } else {
                                                            r0[] r0VarArr2 = new r0[i56];
                                                            r0VarArr2[z17 ? 1 : 0] = cVar3;
                                                            a11 = s0Var.a(r0VarArr2);
                                                        }
                                                        d2.u a15 = eVar5.b0.a();
                                                        a15.k = a11;
                                                        eVar5.b0 = new v(a15);
                                                    }
                                                }
                                            }
                                            if (i58 != -1) {
                                            }
                                        }
                                        j10 = -9223372036854775807L;
                                        if (j10 != -9223372036854775807L) {
                                        }
                                    }
                                    if (!eVar5.W) {
                                        eVar5.a0.getClass();
                                        e3.i0 i0Var2 = eVar5.a0;
                                        v vVar3 = eVar5.b0;
                                        vVar3.getClass();
                                        i0Var2.g(vVar3);
                                    }
                                    z12 = z17 ? 1 : 0;
                                    i55 = 1;
                                }
                                fVar3.k();
                                z11 = z12;
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
                        z11 = false;
                        pVar2 = pVar;
                    } else {
                        if (fVar3.O == 2) {
                            e eVar6 = (e) r9.get(fVar3.U);
                            eVar6.a0.getClass();
                            if (fVar3.Z > 0 && "A_OPUS".equals(eVar6.c)) {
                                y yVar3 = fVar3.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(fVar3.Z).array();
                                yVar3.getClass();
                                yVar3.L(array.length, array);
                            }
                            int i59 = 0;
                            for (int i60 = 0; i60 < fVar3.S; i60++) {
                                i59 += fVar3.T[i60];
                            }
                            int i61 = 0;
                            while (i61 < fVar3.S) {
                                long j25 = fVar3.P + ((eVar6.f * i61) / 1000);
                                int i62 = fVar3.W;
                                if (i61 == 0 && !fVar3.Y) {
                                    i62 |= 1;
                                }
                                int i63 = fVar3.T[i61];
                                int i64 = i59 - i63;
                                fVar3.i(eVar6, j25, i62, i63, i64);
                                i61++;
                                i59 = i64;
                            }
                            z11 = false;
                            fVar3.O = 0;
                            pVar2 = pVar;
                        }
                        z11 = false;
                        pVar2 = pVar;
                    }
                }
            }
        }
        if (z14) {
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
            j0 j0Var = eVar7.V;
            if (j0Var != null) {
                j0Var.a(eVar7.a0, eVar7.k);
            }
            i65++;
        }
    }

    public final void g(int i3) {
        if (this.D) {
            return;
        }
        throw v0.a(null, "Element " + i3 + " must be in a Cues");
    }

    public final void h(int i3) {
        if (this.y != null) {
            return;
        }
        throw v0.a(null, "Element " + i3 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(e eVar, long j10, int i3, int i10, int i11) {
        byte[] j11;
        int i12;
        int i13;
        j0 j0Var = eVar.V;
        if (j0Var != null) {
            j0Var.b(eVar.a0, j10, i3, i10, i11, eVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(eVar.c) || "S_TEXT/ASS".equals(eVar.c) || "S_TEXT/SSA".equals(eVar.c) || "S_TEXT/WEBVTT".equals(eVar.c)) {
                if (this.S > 1) {
                    g2.a.l("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.Q;
                    if (j12 == -9223372036854775807L) {
                        g2.a.l("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = eVar.c;
                        y yVar = this.m;
                        byte[] bArr = yVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                j11 = j(j12, "%01d:%02d:%02d:%02d", 10000L);
                                i12 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                j11 = j(j12, "%02d:%02d:%02d.%03d", 1000L);
                                i12 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                j11 = j(j12, "%02d:%02d:%02d,%03d", 1000L);
                                i12 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(j11, 0, bArr, i12, j11.length);
                        int i14 = yVar.b;
                        while (true) {
                            if (i14 < yVar.c) {
                                if (yVar.a[i14] == 0) {
                                    yVar.M(i14);
                                } else {
                                    i14++;
                                }
                            }
                        }
                        eVar.a0.e(yVar.c, yVar);
                        i13 = i10 + yVar.c;
                        if ((i3 & TLObject.FLAG_28) != 0) {
                            int i15 = this.S;
                            y yVar2 = this.p;
                            if (i15 > 1) {
                                yVar2.K(0);
                            } else {
                                int i16 = yVar2.c;
                                eVar.a0.f(yVar2, i16, 2);
                                i13 += i16;
                            }
                        }
                        eVar.a0.d(j10, i3, i13, i11, eVar.k);
                    }
                }
            }
            i13 = i10;
            if ((i3 & TLObject.FLAG_28) != 0) {
            }
            eVar.a0.d(j10, i3, i13, i11, eVar.k);
        }
        this.N = true;
    }

    public final void k() {
        if (!this.x) {
            return;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i3 >= sparseArray.size()) {
                q qVar = this.j0;
                qVar.getClass();
                qVar.L();
                this.x = false;
                return;
            }
            if (((e) sparseArray.valueAt(i3)).W) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void l(p pVar, int i3) {
        y yVar = this.i;
        if (yVar.c >= i3) {
            return;
        }
        byte[] bArr = yVar.a;
        if (bArr.length < i3) {
            yVar.c(Math.max(bArr.length * 2, i3));
        }
        byte[] bArr2 = yVar.a;
        int i10 = yVar.c;
        pVar.readFully(bArr2, i10, i3 - i10);
        yVar.M(i3);
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

    public final long n(long j10) {
        long j11 = this.t;
        if (j11 == -9223372036854775807L) {
            throw v0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = n0.a;
        return n0.a0(j10, j11, 1000L, RoundingMode.DOWN);
    }

    public final int o(p pVar, e eVar, int i3, boolean z10) {
        int a10;
        int a11;
        int i10;
        if ("S_TEXT/UTF8".equals(eVar.c)) {
            p(pVar, k0, i3);
            int i11 = this.b0;
            m();
            return i11;
        }
        if ("S_TEXT/ASS".equals(eVar.c) || "S_TEXT/SSA".equals(eVar.c)) {
            p(pVar, m0, i3);
            int i12 = this.b0;
            m();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(eVar.c)) {
            p(pVar, n0, i3);
            int i13 = this.b0;
            m();
            return i13;
        }
        if (eVar.W) {
            eVar.b0.getClass();
            y yVar = new y(i3);
            if (pVar.h(yVar.a, 0, i3, true)) {
                pVar.o();
                if (e3.b.i(yVar.i()) == 1 && yVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    yVar.k(0, 10, bArr);
                    yVar.N(0);
                    int g7 = e3.b.g(bArr);
                    if (g7 > 0 && yVar.a() >= g7 + 4) {
                        yVar.O(g7);
                        if (e3.b.i(yVar.m()) == 2) {
                            d2.u a12 = eVar.b0.a();
                            a12.r = u0.n("audio/vnd.dts.hd");
                            eVar.b0 = new v(a12);
                        }
                    }
                }
            }
            eVar.a0.g(eVar.b0);
            eVar.W = false;
            k();
        }
        e3.i0 i0Var = eVar.a0;
        boolean z11 = this.d0;
        y yVar2 = this.l;
        if (!z11) {
            boolean z12 = eVar.i;
            y yVar3 = this.i;
            if (z12) {
                this.W &= -1073741825;
                if (!this.e0) {
                    pVar.readFully(yVar3.a, 0, 1);
                    this.a0++;
                    byte b10 = yVar3.a[0];
                    if ((b10 & 128) == 128) {
                        throw v0.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b10;
                    this.e0 = true;
                }
                byte b11 = this.h0;
                if ((b11 & 1) == 1) {
                    boolean z13 = (b11 & 2) == 2;
                    this.W |= TLObject.FLAG_30;
                    if (!this.i0) {
                        y yVar4 = this.n;
                        pVar.readFully(yVar4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        yVar3.a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        yVar3.N(0);
                        i0Var.f(yVar3, 1, 1);
                        this.b0++;
                        yVar4.N(0);
                        i0Var.f(yVar4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z13) {
                        if (!this.f0) {
                            pVar.readFully(yVar3.a, 0, 1);
                            this.a0++;
                            yVar3.N(0);
                            this.g0 = yVar3.A();
                            this.f0 = true;
                        }
                        int i14 = this.g0 * 4;
                        yVar3.K(i14);
                        pVar.readFully(yVar3.a, 0, i14);
                        this.a0 += i14;
                        short s6 = (short) ((this.g0 / 2) + 1);
                        int i15 = (s6 * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.q = ByteBuffer.allocate(i15);
                        }
                        this.q.position(0);
                        this.q.putShort(s6);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.g0;
                            if (i16 >= i10) {
                                break;
                            }
                            int E = yVar3.E();
                            if (i16 % 2 == 0) {
                                this.q.putShort((short) (E - i17));
                            } else {
                                this.q.putInt(E - i17);
                            }
                            i16++;
                            i17 = E;
                        }
                        int i18 = (i3 - this.a0) - i17;
                        if (i10 % 2 == 1) {
                            this.q.putInt(i18);
                        } else {
                            this.q.putShort((short) i18);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        y yVar5 = this.o;
                        yVar5.L(i15, array);
                        i0Var.f(yVar5, i15, 1);
                        this.b0 += i15;
                    }
                }
            } else {
                byte[] bArr2 = eVar.j;
                if (bArr2 != null) {
                    yVar2.L(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(eVar.c) ? z10 : eVar.g > 0) {
                this.W |= TLObject.FLAG_28;
                this.p.K(0);
                int i19 = (yVar2.c + i3) - this.a0;
                yVar3.K(4);
                byte[] bArr3 = yVar3.a;
                bArr3[0] = (byte) ((i19 >> 24) & hs.e4);
                bArr3[1] = (byte) ((i19 >> 16) & hs.e4);
                bArr3[2] = (byte) ((i19 >> 8) & hs.e4);
                bArr3[3] = (byte) (i19 & hs.e4);
                i0Var.f(yVar3, 4, 2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i20 = i3 + yVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(eVar.c) && !"V_MPEGH/ISO/HEVC".equals(eVar.c)) {
            if (eVar.V != null) {
                zb.p(yVar2.c == 0);
                eVar.V.c(pVar);
            }
            while (true) {
                int i21 = this.a0;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int a13 = yVar2.a();
                if (a13 > 0) {
                    a11 = Math.min(i22, a13);
                    i0Var.e(a11, yVar2);
                } else {
                    a11 = i0Var.a(pVar, i22, false);
                }
                this.a0 += a11;
                this.b0 += a11;
            }
        } else {
            y yVar6 = this.h;
            byte[] bArr4 = yVar6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i23 = eVar.c0;
            int i24 = 4 - i23;
            while (this.a0 < i20) {
                int i25 = this.c0;
                if (i25 == 0) {
                    int min = Math.min(i23, yVar2.a());
                    pVar.readFully(bArr4, i24 + min, i23 - min);
                    if (min > 0) {
                        yVar2.k(i24, min, bArr4);
                    }
                    this.a0 += i23;
                    yVar6.N(0);
                    this.c0 = yVar6.E();
                    y yVar7 = this.g;
                    yVar7.N(0);
                    i0Var.e(4, yVar7);
                    this.b0 += 4;
                } else {
                    int a14 = yVar2.a();
                    if (a14 > 0) {
                        a10 = Math.min(i25, a14);
                        i0Var.e(a10, yVar2);
                    } else {
                        a10 = i0Var.a(pVar, i25, false);
                    }
                    this.a0 += a10;
                    this.b0 += a10;
                    this.c0 -= a10;
                }
            }
        }
        if ("A_VORBIS".equals(eVar.c)) {
            y yVar8 = this.j;
            yVar8.N(0);
            i0Var.e(4, yVar8);
            this.b0 += 4;
        }
        int i26 = this.b0;
        m();
        return i26;
    }

    public final void p(p pVar, byte[] bArr, int i3) {
        int length = bArr.length + i3;
        y yVar = this.m;
        byte[] bArr2 = yVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i3);
            yVar.getClass();
            yVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(yVar.a, bArr.length, i3);
        yVar.N(0);
        yVar.M(length);
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
