package u3;

import android.util.Pair;
import android.util.SparseArray;
import b2.m;
import b2.n;
import b2.r;
import b2.s0;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.i0;
import c3.j0;
import c3.k0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c5.c0;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import v7.u6;
import z3.k;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        k3.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        k3.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i10) {
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
        bVar.d = new l2.f(this, 24);
        this.f = kVar;
        this.C = new SparseArray();
        this.d = (i10 & 1) == 0;
        this.e = (i10 & 2) == 0;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new x(4);
        this.j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new x(4);
        this.g = new x(f2.q.a);
        this.h = new x(4);
        this.l = new x();
        this.m = new x();
        this.n = new x(8);
        this.o = new x();
        this.p = new x();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] j(long j10, long j11, String str) {
        u6.g(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        String str2 = m0.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        c0 c0Var = new c0(14, (short) 0);
        x xVar = (x) c0Var.c;
        l lVar = (l) pVar;
        long j10 = lVar.c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        lVar.j(xVar.a, 0, 4, false);
        long C = xVar.C();
        c0Var.b = 4;
        while (true) {
            if (C != 440786851) {
                int i11 = c0Var.b + 1;
                c0Var.b = i11;
                if (i11 == i10) {
                    break;
                }
                lVar.j(xVar.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.a[0] & 255);
            } else {
                long t10 = c0Var.t(lVar);
                long j12 = c0Var.b;
                if (t10 != Long.MIN_VALUE && (j10 == -1 || j12 + t10 < j10)) {
                    while (true) {
                        long j13 = c0Var.b;
                        long j14 = j12 + t10;
                        if (j13 < j14) {
                            if (c0Var.t(lVar) != Long.MIN_VALUE) {
                                long t11 = c0Var.t(lVar);
                                if (t11 < 0 || t11 > 2147483647L) {
                                    break;
                                }
                                if (t11 != 0) {
                                    int i12 = (int) t11;
                                    lVar.v(i12, false);
                                    c0Var.b += i12;
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

    @Override // c3.o
    public final void c(q qVar) {
        if (this.e) {
            qVar = new c2.b(qVar, this.f);
        }
        this.j0 = qVar;
    }

    @Override // c3.o
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
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            k0 k0Var = ((e) sparseArray.valueAt(i10)).V;
            if (k0Var != null) {
                k0Var.b = false;
                k0Var.c = 0;
            }
            i10++;
        }
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0f80, code lost:
    
        if (r0.z == false) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0f82, code lost:
    
        r6 = r0.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0f86, code lost:
    
        if (r6 == (-1)) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0f88, code lost:
    
        r45.a = r6;
        r0.L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0f8e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0f95, code lost:
    
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0f95, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0f6d, code lost:
    
        r0.L = r2;
        r45.a = r0.K;
        r0.J = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0f79, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0f8f, code lost:
    
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a1a, code lost:
    
        if (r0.u() == r4.getLeastSignificantBits()) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d3a, code lost:
    
        r5 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f61, code lost:
    
        if (r5 == false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0f63, code lost:
    
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0f6b, code lost:
    
        if (r0.J == false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0f7a, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v100, types: [int] */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v103, types: [int] */
    /* JADX WARN: Type inference failed for: r6v116 */
    /* JADX WARN: Type inference failed for: r6v117, types: [int] */
    /* JADX WARN: Type inference failed for: r6v122 */
    /* JADX WARN: Type inference failed for: r6v123 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r8v0, types: [u3.g] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        boolean z10;
        int i10;
        boolean z11;
        ?? r15;
        String str;
        int i11;
        int a2;
        p pVar2;
        char c10;
        List singletonList;
        int D;
        ?? r22;
        int i12;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list;
        List y3;
        String str3;
        List list2;
        List list3;
        v vVar;
        boolean i13;
        int i14;
        n nVar;
        byte[] bArr;
        int i15;
        String str4;
        f2.a a10;
        List list4;
        int i16;
        List list5;
        int i17;
        long j10;
        int i18;
        long j11;
        long j12;
        t0 a11;
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
                        int i19 = 4;
                        long b10 = r82.b(pVar3, true, r43, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar.a;
                            pVar3.q();
                            int i20 = r43;
                            while (true) {
                                pVar3.b(i20, i19, bArr2);
                                byte b11 = bArr2[i20];
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= 8) {
                                        i11 = -1;
                                    } else if ((g.d[i21] & b11) != 0) {
                                        i11 = i21 + 1;
                                    } else {
                                        i21++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    a2 = (int) g.a(i11, false, bArr2);
                                    Object obj = bVar.d.b;
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                pVar3.r(1);
                                i19 = 4;
                                i20 = 0;
                            }
                            pVar3.r(i11);
                            b10 = a2;
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
                    l2.f fVar2 = bVar.d;
                    int i22 = bVar.f;
                    Object obj2 = fVar2.b;
                    switch (i22) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case MessagesStorage.LAST_DB_VERSION /* 179 */:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
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
                            i10 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i10 = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
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
                            i10 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i10 = 4;
                            break;
                        case 181:
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
                            i10 = 5;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (i10 == 0) {
                        pVar3.r((int) bVar.g);
                        bVar.e = 0;
                        z12 = false;
                        r42 = 1;
                    } else if (i10 == 1) {
                        long position = pVar3.getPosition();
                        arrayDeque.push(new a(bVar.f, bVar.g + position));
                        bVar.d.Q(bVar.f, position, bVar.g);
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else if (i10 == 2) {
                        long j13 = bVar.g;
                        if (j13 > 8) {
                            throw w0.a(null, "Invalid integer size: " + bVar.g);
                        }
                        fVar2.G(i22, bVar.a(pVar3, (int) j13));
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else if (i10 == 3) {
                        long j14 = bVar.g;
                        if (j14 > 2147483647L) {
                            throw w0.a(null, "String element size: " + bVar.g);
                        }
                        int i23 = (int) j14;
                        if (i23 == 0) {
                            str = "";
                            r15 = 0;
                        } else {
                            byte[] bArr3 = new byte[i23];
                            pVar3.readFully(bArr3, 0, i23);
                            while (i23 > 0 && bArr3[i23 - 1] == 0) {
                                i23--;
                            }
                            r15 = 0;
                            str = new String(bArr3, 0, i23);
                        }
                        fVar2.R(i22, str);
                        bVar.e = r15;
                        z11 = r15;
                        pVar2 = pVar3;
                    } else if (i10 == 4) {
                        fVar2.t(i22, (int) bVar.g, pVar3);
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    } else {
                        if (i10 != 5) {
                            throw w0.a(null, "Invalid element type " + i10);
                        }
                        long j15 = bVar.g;
                        if (j15 != 4 && j15 != 8) {
                            throw w0.a(null, "Invalid float size: " + bVar.g);
                        }
                        int i24 = (int) j15;
                        double intBitsToFloat = i24 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(bVar.a(pVar3, i24));
                        f fVar3 = (f) fVar2.b;
                        if (i22 == 181) {
                            fVar3.h(i22);
                            fVar3.y.S = (int) intBitsToFloat;
                        } else if (i22 != 17545) {
                            switch (i22) {
                                case 21969:
                                    fVar3.h(i22);
                                    fVar3.y.F = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    fVar3.h(i22);
                                    fVar3.y.G = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    fVar3.h(i22);
                                    fVar3.y.H = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    fVar3.h(i22);
                                    fVar3.y.I = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    fVar3.h(i22);
                                    fVar3.y.J = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    fVar3.h(i22);
                                    fVar3.y.K = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    fVar3.h(i22);
                                    fVar3.y.L = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    fVar3.h(i22);
                                    fVar3.y.M = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    fVar3.h(i22);
                                    fVar3.y.N = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    fVar3.h(i22);
                                    fVar3.y.O = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i22) {
                                        case 30323:
                                            fVar3.h(i22);
                                            fVar3.y.u = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            fVar3.h(i22);
                                            fVar3.y.v = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            fVar3.h(i22);
                                            fVar3.y.w = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            fVar3.u = (long) intBitsToFloat;
                        }
                        z11 = false;
                        bVar.e = 0;
                        pVar2 = pVar3;
                    }
                } else {
                    l2.f fVar4 = bVar.d;
                    int i25 = ((a) arrayDeque.pop()).a;
                    f fVar5 = (f) fVar4.b;
                    ?? r83 = fVar5.C;
                    ?? r92 = fVar5.c;
                    fVar5.j0.getClass();
                    if (i25 != 160) {
                        if (i25 == 174) {
                            e eVar = fVar5.y;
                            eVar.getClass();
                            String str5 = eVar.c;
                            if (str5 == null) {
                                throw w0.a(null, "CodecId is missing in TrackEntry element");
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
                                    int i26 = eVar.d;
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
                                            y3 = singletonList;
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null && (a10 = f2.a.a(new x(eVar.P))) != null) {
                                                str2 = a10.a;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i27 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map = p0;
                                            if (!i13) {
                                                vVar.J = eVar.Q;
                                                vVar.K = eVar.S;
                                                vVar.L = D;
                                            } else if (v0.m(str6)) {
                                                if (eVar.s == 0) {
                                                    int i28 = eVar.q;
                                                    i14 = -1;
                                                    if (i28 == -1) {
                                                        i28 = eVar.n;
                                                    }
                                                    eVar.q = i28;
                                                    int i29 = eVar.r;
                                                    if (i29 == -1) {
                                                        i29 = eVar.o;
                                                    }
                                                    eVar.r = i29;
                                                } else {
                                                    i14 = -1;
                                                }
                                                float f7 = (eVar.q == i14 || (i15 = eVar.r) == i14) ? -1.0f : (eVar.o * r0) / (eVar.n * i15);
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
                                                    int i30 = eVar.A;
                                                    int i31 = eVar.C;
                                                    int i32 = eVar.B;
                                                    int i33 = eVar.p;
                                                    nVar = new n(i30, i31, i32, bArr, i33, i33);
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
                                                        intValue = 180;
                                                    } else if (Float.compare(eVar.w, -90.0f) == 0) {
                                                        intValue = 270;
                                                    }
                                                }
                                                vVar.y = eVar.n;
                                                vVar.z = eVar.o;
                                                vVar.E = f7;
                                                vVar.D = intValue;
                                                vVar.F = eVar.x;
                                                vVar.G = eVar.y;
                                                vVar.H = nVar;
                                            } else if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                throw w0.a(null, "Unexpected MIME type.");
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                vVar.b = eVar.b;
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 2:
                                            x xVar = new x(eVar.a(eVar.c));
                                            try {
                                                int t10 = xVar.t();
                                                if (t10 != 1) {
                                                    if (t10 == 65534) {
                                                        xVar.N(24);
                                                        long u10 = xVar.u();
                                                        UUID uuid = o0;
                                                        if (u10 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    e2.a.l("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i12 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                        str2 = a10.a;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i272 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    vVar = new v();
                                                    i13 = v0.i(str6);
                                                    Map map2 = p0;
                                                    if (!i13) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                        vVar.b = eVar.b;
                                                        break;
                                                    }
                                                    vVar.a = Integer.toString(i26);
                                                    vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    vVar.r = v0.n(str6);
                                                    vVar.s = i12;
                                                    vVar.d = eVar.Z;
                                                    vVar.e = i272;
                                                    vVar.u = list3;
                                                    vVar.j = str2;
                                                    vVar.v = eVar.m;
                                                    eVar.b0 = vVar.a();
                                                    eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                    r92.put(eVar.d, eVar);
                                                }
                                                int i34 = eVar.R;
                                                String str8 = m0.a;
                                                D = m0.D(i34, ByteOrder.LITTLE_ENDIAN);
                                                if (D == 0) {
                                                    e2.a.l("MatroskaExtractor", "Unsupported PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i12 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                    }
                                                    int i2722 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    vVar = new v();
                                                    i13 = v0.i(str6);
                                                    Map map22 = p0;
                                                    if (!i13) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    vVar.a = Integer.toString(i26);
                                                    vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    vVar.r = v0.n(str6);
                                                    vVar.s = i12;
                                                    vVar.d = eVar.Z;
                                                    vVar.e = i2722;
                                                    vVar.u = list3;
                                                    vVar.j = str2;
                                                    vVar.v = eVar.m;
                                                    eVar.b0 = vVar.a();
                                                    eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                    r92.put(eVar.d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i27222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i27222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw w0.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            eVar.V = new k0();
                                            str6 = "audio/true-hd";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i272222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 4:
                                            byte[] a12 = eVar.a(str5);
                                            try {
                                                r22 = a12[0];
                                                try {
                                                    if (r22 != 2) {
                                                        throw w0.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i35 = 0;
                                                    int i36 = 1;
                                                    while (true) {
                                                        int i37 = a12[i36] & 255;
                                                        if (i37 == 255) {
                                                            i35 += 255;
                                                            i36++;
                                                        } else {
                                                            int i38 = i36 + 1;
                                                            int i39 = i35 + i37;
                                                            int i40 = 0;
                                                            while (true) {
                                                                int i41 = a12[i38] & 255;
                                                                if (i41 == 255) {
                                                                    i40 += 255;
                                                                    i38++;
                                                                } else {
                                                                    int i42 = i38 + 1;
                                                                    int i43 = i40 + i41;
                                                                    if (a12[i42] != 1) {
                                                                        throw w0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i39];
                                                                    System.arraycopy(a12, i42, bArr6, 0, i39);
                                                                    int i44 = i42 + i39;
                                                                    if (a12[i44] != 3) {
                                                                        throw w0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i45 = i44 + i43;
                                                                    if (a12[i45] != 5) {
                                                                        throw w0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a12.length - i45];
                                                                    System.arraycopy(a12, i45, bArr7, 0, a12.length - i45);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str6 = "audio/vorbis";
                                                                    i12 = 8192;
                                                                    arrayList = arrayList2;
                                                                    D = -1;
                                                                    list4 = arrayList;
                                                                    str2 = null;
                                                                    list3 = list4;
                                                                    if (eVar.P != null) {
                                                                    }
                                                                    int i2722222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                                    vVar = new v();
                                                                    i13 = v0.i(str6);
                                                                    Map map22222 = p0;
                                                                    if (!i13) {
                                                                    }
                                                                    str4 = eVar.b;
                                                                    if (str4 != null) {
                                                                    }
                                                                    vVar.a = Integer.toString(i26);
                                                                    vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                                    vVar.r = v0.n(str6);
                                                                    vVar.s = i12;
                                                                    vVar.d = eVar.Z;
                                                                    vVar.e = i2722222;
                                                                    vVar.u = list3;
                                                                    vVar.j = str2;
                                                                    vVar.v = eVar.m;
                                                                    eVar.b0 = vVar.a();
                                                                    eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                                    r92.put(eVar.d, eVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw w0.a(r22, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r22 = 0;
                                            }
                                            break;
                                        case 5:
                                            str6 = "audio/mpeg-L2";
                                            D = -1;
                                            i12 = 4096;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 6:
                                            str6 = "audio/mpeg";
                                            D = -1;
                                            i12 = 4096;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
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
                                                        throw w0.a(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else {
                                                    if (r10 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (r10 == 826496599) {
                                                            byte[] bArr8 = xVar2.a;
                                                            for (int i46 = xVar2.b + 20; i46 < bArr8.length - 4; i46++) {
                                                                if (bArr8[i46] == 0 && bArr8[i46 + 1] == 0 && bArr8[i46 + 2] == 1) {
                                                                    if (bArr8[i46 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i46, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            runtimeException = null;
                                                            throw w0.a(null, "Failed to find FourCC VC1 initialization data");
                                                        }
                                                        e2.a.l("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                list = (List) pair.second;
                                                D = -1;
                                                i12 = -1;
                                                list3 = list;
                                                if (eVar.P != null) {
                                                }
                                                int i2722222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map22222222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i2722222222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case '\b':
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(eVar.a(str5), 0, bArr9, 0, 4);
                                            y3 = n0.y(bArr9);
                                            str6 = "application/dvbsubs";
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '\n':
                                            c3.d a13 = c3.d.a(new x(eVar.a(eVar.c)));
                                            ArrayList arrayList3 = a13.a;
                                            eVar.c0 = a13.b;
                                            str3 = a13.l;
                                            str6 = MediaController.VIDEO_MIME_TYPE;
                                            list2 = arrayList3;
                                            str2 = str3;
                                            list = list2;
                                            D = -1;
                                            i12 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 11:
                                            y3 = n0.y(eVar.a(str5));
                                            str6 = "application/vobsub";
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '\f':
                                            str6 = "audio/vnd.dts.hd";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(eVar.a(str5));
                                            byte[] bArr10 = eVar.l;
                                            c3.a n10 = c3.b.n(new a4.g(bArr10, bArr10.length), false);
                                            eVar.S = n10.b;
                                            eVar.Q = n10.c;
                                            String str9 = n10.a;
                                            str6 = MediaController.AUDIO_MIME_TYPE;
                                            list = singletonList2;
                                            str2 = str9;
                                            D = -1;
                                            i12 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 14:
                                            str6 = "audio/ac3";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 15:
                                        case 21:
                                            eVar.W = true;
                                            str6 = "audio/vnd.dts";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 16:
                                            byte[] bArr11 = eVar.l;
                                            singletonList = bArr11 == null ? null : n0.y(bArr11);
                                            str6 = "video/av01";
                                            y3 = singletonList;
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 17:
                                            str6 = "video/x-vnd.on2.vp8";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 18:
                                            byte[] bArr12 = eVar.l;
                                            singletonList = bArr12 == null ? null : n0.y(bArr12);
                                            str6 = "video/x-vnd.on2.vp9";
                                            y3 = singletonList;
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 19:
                                            str6 = "application/pgs";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 20:
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 22:
                                            if (eVar.R == 32) {
                                                str6 = "audio/raw";
                                                D = 4;
                                                i12 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i27222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map222222222222222222222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i27222222222222222222222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } else {
                                                e2.a.l("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                D = -1;
                                                i12 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i272222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map2222222222222222222222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i272222222222222222222222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            }
                                            break;
                                        case 23:
                                            int i47 = eVar.R;
                                            if (i47 == 8) {
                                                str6 = "audio/raw";
                                                D = 3;
                                                i12 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i2722222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map22222222222222222222222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i2722222222222222222222222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            } else {
                                                if (i47 == 16) {
                                                    D = TLObject.FLAG_28;
                                                } else if (i47 == 24) {
                                                    D = 1342177280;
                                                } else if (i47 == 32) {
                                                    D = 1610612736;
                                                } else {
                                                    e2.a.l("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    D = -1;
                                                    i12 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                    }
                                                    int i27222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                    vVar = new v();
                                                    i13 = v0.i(str6);
                                                    Map map222222222222222222222222 = p0;
                                                    if (!i13) {
                                                    }
                                                    str4 = eVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    vVar.a = Integer.toString(i26);
                                                    vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                    vVar.r = v0.n(str6);
                                                    vVar.s = i12;
                                                    vVar.d = eVar.Z;
                                                    vVar.e = i27222222222222222222222222;
                                                    vVar.u = list3;
                                                    vVar.j = str2;
                                                    vVar.v = eVar.m;
                                                    eVar.b0 = vVar.a();
                                                    eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                    r92.put(eVar.d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i272222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map2222222222222222222222222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i272222222222222222222222222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            }
                                            break;
                                        case 24:
                                            int i48 = eVar.R;
                                            String str10 = m0.a;
                                            D = m0.D(i48, ByteOrder.LITTLE_ENDIAN);
                                            if (D == 0) {
                                                e2.a.l("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                D = -1;
                                                i12 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                }
                                                int i2722222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                                vVar = new v();
                                                i13 = v0.i(str6);
                                                Map map22222222222222222222222222 = p0;
                                                if (!i13) {
                                                }
                                                str4 = eVar.b;
                                                if (str4 != null) {
                                                }
                                                vVar.a = Integer.toString(i26);
                                                vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                                vVar.r = v0.n(str6);
                                                vVar.s = i12;
                                                vVar.d = eVar.Z;
                                                vVar.e = i2722222222222222222222222222;
                                                vVar.u = list3;
                                                vVar.j = str2;
                                                vVar.v = eVar.m;
                                                eVar.b0 = vVar.a();
                                                eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                                r92.put(eVar.d, eVar);
                                            }
                                            str6 = "audio/raw";
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 25:
                                        case 26:
                                            y3 = n0.z(l0, eVar.a(str5));
                                            str6 = "text/x-ssa";
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 27:
                                            c3.x a14 = c3.x.a(new x(eVar.a(eVar.c)), false, null);
                                            List list6 = a14.a;
                                            eVar.c0 = a14.b;
                                            str3 = a14.n;
                                            str6 = "video/hevc";
                                            list2 = list6;
                                            str2 = str3;
                                            list = list2;
                                            D = -1;
                                            i12 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 28:
                                            str6 = "text/vtt";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case 29:
                                            str6 = "application/x-subrip";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                            str6 = "video/mpeg2";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                            str6 = "audio/eac3";
                                            D = -1;
                                            i12 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                            }
                                            int i27222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map222222222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i27222222222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        case ' ':
                                            singletonList = Collections.singletonList(eVar.a(str5));
                                            str6 = "audio/flac";
                                            y3 = singletonList;
                                            D = -1;
                                            i12 = -1;
                                            list4 = y3;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i272222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map2222222222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i272222222222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
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
                                            i12 = 5760;
                                            arrayList = arrayList4;
                                            D = -1;
                                            list4 = arrayList;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                            }
                                            int i2722222222222222222222222222222222222 = (eVar.Y ? 1 : 0) | (!eVar.X ? 2 : 0);
                                            vVar = new v();
                                            i13 = v0.i(str6);
                                            Map map22222222222222222222222222222222222 = p0;
                                            if (!i13) {
                                            }
                                            str4 = eVar.b;
                                            if (str4 != null) {
                                            }
                                            vVar.a = Integer.toString(i26);
                                            vVar.q = v0.n(!eVar.a ? "video/webm" : "video/x-matroska");
                                            vVar.r = v0.n(str6);
                                            vVar.s = i12;
                                            vVar.d = eVar.Z;
                                            vVar.e = i2722222222222222222222222222222222222;
                                            vVar.u = list3;
                                            vVar.j = str2;
                                            vVar.v = eVar.m;
                                            eVar.b0 = vVar.a();
                                            eVar.a0 = fVar5.j0.j0(eVar.d, eVar.e);
                                            r92.put(eVar.d, eVar);
                                            break;
                                        default:
                                            throw w0.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    fVar5.y = null;
                                    break;
                            }
                        } else if (i25 != 183) {
                            if (i25 == 19899) {
                                int i49 = fVar5.A;
                                if (i49 != -1) {
                                    long j16 = fVar5.B;
                                    if (j16 != -1) {
                                        if (i49 == 475249515) {
                                            fVar5.K = j16;
                                        }
                                    }
                                }
                                throw w0.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i25 == 25152) {
                                fVar5.h(i25);
                                e eVar2 = fVar5.y;
                                if (eVar2.i) {
                                    i0 i0Var = eVar2.k;
                                    if (i0Var == null) {
                                        throw w0.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    eVar2.m = new b2.s(null, true, new r(m.b, null, "video/webm", i0Var.b));
                                }
                            } else if (i25 == 28032) {
                                fVar5.h(i25);
                                e eVar3 = fVar5.y;
                                if (eVar3.i && eVar3.j != null) {
                                    throw w0.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i25 == 357149030) {
                                if (fVar5.t == -9223372036854775807L) {
                                    fVar5.t = 1000000L;
                                }
                                long j17 = fVar5.u;
                                if (j17 != -9223372036854775807L) {
                                    fVar5.v = fVar5.n(j17);
                                }
                            } else if (i25 == 374648427) {
                                boolean z15 = z12;
                                if (r92.size() == 0) {
                                    throw w0.a(null, "No valid tracks were found");
                                }
                                boolean z16 = (!fVar5.d || fVar5.K == -1) ? true : z15 ? 1 : 0;
                                int i50 = -1;
                                int i51 = -1;
                                int i52 = -1;
                                int i53 = -1;
                                for (int i54 = z15 ? 1 : 0; i54 < r92.size(); i54++) {
                                    e eVar4 = (e) r92.valueAt(i54);
                                    int i55 = eVar4.e;
                                    if (i55 == 2) {
                                        if (eVar4.Y) {
                                            i50 = eVar4.d;
                                        }
                                        if (i51 == -1) {
                                            i51 = eVar4.d;
                                        }
                                    } else if (i55 == 1) {
                                        if (eVar4.Y) {
                                            i52 = eVar4.d;
                                        }
                                        if (i53 == -1) {
                                            i53 = eVar4.d;
                                        }
                                    }
                                    if (z16) {
                                        eVar4.a0.getClass();
                                        if (!eVar4.W) {
                                            j0 j0Var = eVar4.a0;
                                            w wVar = eVar4.b0;
                                            wVar.getClass();
                                            j0Var.b(wVar);
                                        }
                                    }
                                }
                                if (i50 != -1) {
                                    fVar5.I = i50;
                                } else if (i51 != -1) {
                                    fVar5.I = i51;
                                } else if (i52 != -1) {
                                    fVar5.I = i52;
                                } else if (i53 != -1) {
                                    fVar5.I = i53;
                                } else {
                                    fVar5.I = r92.size() > 0 ? ((e) r92.valueAt(z15 ? 1 : 0)).d : -1;
                                }
                                if (z16) {
                                    fVar5.k();
                                }
                            } else if (i25 == 475249515 && !fVar5.z) {
                                ?? r62 = z12;
                                while (true) {
                                    if (r62 < r83.size()) {
                                        if (((List) r83.valueAt(r62)).isEmpty()) {
                                            r62++;
                                        } else if (fVar5.v != -9223372036854775807L) {
                                            for (?? r63 = z12; r63 < r83.size(); r63++) {
                                                Collections.sort((List) r83.valueAt(r63));
                                            }
                                            fVar5.j0.g0(new d(r83, fVar5.v, fVar5.I, fVar5.s, fVar5.r));
                                        }
                                    }
                                }
                                fVar5.j0.g0(new t(fVar5.v));
                                fVar5.z = r42;
                                fVar5.D = z12;
                                int i56 = r42;
                                for (?? r64 = z12; r64 < r92.size(); r64 = i17 + 1) {
                                    e eVar5 = (e) r92.valueAt(r64);
                                    long j18 = fVar5.v;
                                    long j19 = fVar5.s;
                                    long j20 = fVar5.r;
                                    boolean z17 = z12;
                                    int i57 = i56;
                                    if (eVar5.e != 2 || (list5 = (List) r83.get(eVar5.d)) == null || list5.isEmpty()) {
                                        i17 = r64;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i17 = r64;
                                        } else {
                                            i17 = r64;
                                            int min = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i58 = z17 ? 1 : 0;
                                            int i59 = -1;
                                            while (i58 < min) {
                                                c cVar = (c) list5.get(i58);
                                                long j21 = j19;
                                                long j22 = cVar.a;
                                                long j23 = cVar.c;
                                                long j24 = cVar.b;
                                                if (j22 <= 10000000) {
                                                    if (i58 < list5.size() - 1) {
                                                        c cVar2 = (c) list5.get(i58 + 1);
                                                        i18 = i58;
                                                        j11 = (cVar2.b + cVar2.c) - (j24 + j23);
                                                        j12 = cVar2.a - j22;
                                                    } else {
                                                        i18 = i58;
                                                        j11 = (j21 + j20) - (j24 + j23);
                                                        j12 = j18 - j22;
                                                    }
                                                    if (j12 > 0) {
                                                        double d10 = j11 / j12;
                                                        if (d10 > d) {
                                                            d = d10;
                                                            i59 = i18;
                                                        }
                                                    }
                                                    i58 = i18 + 1;
                                                    j19 = j21;
                                                } else if (i59 != -1) {
                                                    j10 = ((c) list5.get(i59)).a;
                                                    if (j10 != -9223372036854775807L) {
                                                        w wVar2 = eVar5.b0;
                                                        wVar2.getClass();
                                                        t0 t0Var = wVar2.l;
                                                        l3.c cVar3 = new l3.c(j10);
                                                        if (t0Var == null) {
                                                            s0[] s0VarArr = new s0[i57];
                                                            s0VarArr[z17 ? 1 : 0] = cVar3;
                                                            a11 = new t0(s0VarArr);
                                                        } else {
                                                            s0[] s0VarArr2 = new s0[i57];
                                                            s0VarArr2[z17 ? 1 : 0] = cVar3;
                                                            a11 = t0Var.a(s0VarArr2);
                                                        }
                                                        v a15 = eVar5.b0.a();
                                                        a15.k = a11;
                                                        eVar5.b0 = new w(a15);
                                                    }
                                                }
                                            }
                                            if (i59 != -1) {
                                            }
                                        }
                                        j10 = -9223372036854775807L;
                                        if (j10 != -9223372036854775807L) {
                                        }
                                    }
                                    if (!eVar5.W) {
                                        eVar5.a0.getClass();
                                        j0 j0Var2 = eVar5.a0;
                                        w wVar3 = eVar5.b0;
                                        wVar3.getClass();
                                        j0Var2.b(wVar3);
                                    }
                                    z12 = z17 ? 1 : 0;
                                    i56 = 1;
                                }
                                fVar5.k();
                                z11 = z12;
                                pVar2 = pVar;
                            }
                        } else if (!fVar5.z) {
                            fVar5.g(i25);
                            if (fVar5.E != -9223372036854775807L && (i16 = fVar5.F) != -1 && fVar5.G != -1) {
                                List list7 = (List) r83.get(i16);
                                if (list7 == null) {
                                    list7 = new ArrayList();
                                    r83.put(fVar5.F, list7);
                                }
                                list7.add(new c(fVar5.E, fVar5.s + fVar5.G, fVar5.H));
                            }
                        }
                        z11 = false;
                        pVar2 = pVar;
                    } else {
                        if (fVar5.O == 2) {
                            e eVar6 = (e) r92.get(fVar5.U);
                            eVar6.a0.getClass();
                            if (fVar5.Z > 0 && "A_OPUS".equals(eVar6.c)) {
                                x xVar3 = fVar5.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(fVar5.Z).array();
                                xVar3.getClass();
                                xVar3.L(array.length, array);
                            }
                            int i60 = 0;
                            for (int i61 = 0; i61 < fVar5.S; i61++) {
                                i60 += fVar5.T[i61];
                            }
                            int i62 = 0;
                            while (i62 < fVar5.S) {
                                long j25 = fVar5.P + ((eVar6.f * i62) / MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int i63 = fVar5.W;
                                if (i62 == 0 && !fVar5.Y) {
                                    i63 |= 1;
                                }
                                int i64 = fVar5.T[i62];
                                int i65 = i60 - i64;
                                fVar5.i(eVar6, j25, i63, i64, i65);
                                i62++;
                                i60 = i65;
                            }
                            z11 = false;
                            fVar5.O = 0;
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
        int i66 = 0;
        while (true) {
            SparseArray sparseArray = fVar.c;
            if (i66 >= sparseArray.size()) {
                return -1;
            }
            e eVar7 = (e) sparseArray.valueAt(i66);
            eVar7.a0.getClass();
            k0 k0Var = eVar7.V;
            if (k0Var != null) {
                k0Var.a(eVar7.a0, eVar7.k);
            }
            i66++;
        }
    }

    public final void g(int i10) {
        if (this.D) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void h(int i10) {
        if (this.y != null) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(e eVar, long j10, int i10, int i11, int i12) {
        byte[] j11;
        int i13;
        int i14;
        k0 k0Var = eVar.V;
        if (k0Var != null) {
            k0Var.b(eVar.a0, j10, i10, i11, i12, eVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(eVar.c) || "S_TEXT/ASS".equals(eVar.c) || "S_TEXT/SSA".equals(eVar.c) || "S_TEXT/WEBVTT".equals(eVar.c)) {
                if (this.S > 1) {
                    e2.a.l("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.Q;
                    if (j12 == -9223372036854775807L) {
                        e2.a.l("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = eVar.c;
                        x xVar = this.m;
                        byte[] bArr = xVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                j11 = j(j12, 10000L, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                j11 = j(j12, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                j11 = j(j12, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(j11, 0, bArr, i13, j11.length);
                        int i15 = xVar.b;
                        while (true) {
                            if (i15 < xVar.c) {
                                if (xVar.a[i15] == 0) {
                                    xVar.M(i15);
                                } else {
                                    i15++;
                                }
                            }
                        }
                        eVar.a0.d(xVar.c, xVar);
                        i14 = i11 + xVar.c;
                        if ((i10 & TLObject.FLAG_28) != 0) {
                            int i16 = this.S;
                            x xVar2 = this.p;
                            if (i16 > 1) {
                                xVar2.K(0);
                            } else {
                                int i17 = xVar2.c;
                                eVar.a0.g(xVar2, i17, 2);
                                i14 += i17;
                            }
                        }
                        eVar.a0.c(j10, i10, i14, i12, eVar.k);
                    }
                }
            }
            i14 = i11;
            if ((i10 & TLObject.FLAG_28) != 0) {
            }
            eVar.a0.c(j10, i10, i14, i12, eVar.k);
        }
        this.N = true;
    }

    public final void k() {
        if (!this.x) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                q qVar = this.j0;
                qVar.getClass();
                qVar.H();
                this.x = false;
                return;
            }
            if (((e) sparseArray.valueAt(i10)).W) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void l(p pVar, int i10) {
        x xVar = this.i;
        if (xVar.c >= i10) {
            return;
        }
        byte[] bArr = xVar.a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.a;
        int i11 = xVar.c;
        pVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
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
            throw w0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = m0.a;
        return m0.a0(j10, j11, 1000L, RoundingMode.DOWN);
    }

    public final int o(p pVar, e eVar, int i10, boolean z10) {
        int a2;
        int a10;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.c)) {
            p(pVar, k0, i10);
            int i12 = this.b0;
            m();
            return i12;
        }
        if ("S_TEXT/ASS".equals(eVar.c) || "S_TEXT/SSA".equals(eVar.c)) {
            p(pVar, m0, i10);
            int i13 = this.b0;
            m();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(eVar.c)) {
            p(pVar, n0, i10);
            int i14 = this.b0;
            m();
            return i14;
        }
        if (eVar.W) {
            eVar.b0.getClass();
            x xVar = new x(i10);
            if (pVar.j(xVar.a, 0, i10, true)) {
                pVar.q();
                if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    xVar.k(0, 10, bArr);
                    xVar.N(0);
                    int g10 = c3.b.g(bArr);
                    if (g10 > 0 && xVar.a() >= g10 + 4) {
                        xVar.O(g10);
                        if (c3.b.i(xVar.m()) == 2) {
                            v a11 = eVar.b0.a();
                            a11.r = v0.n("audio/vnd.dts.hd");
                            eVar.b0 = new w(a11);
                        }
                    }
                }
            }
            eVar.a0.b(eVar.b0);
            eVar.W = false;
            k();
        }
        j0 j0Var = eVar.a0;
        boolean z11 = this.d0;
        x xVar2 = this.l;
        if (!z11) {
            boolean z12 = eVar.i;
            x xVar3 = this.i;
            if (z12) {
                this.W &= -1073741825;
                if (!this.e0) {
                    pVar.readFully(xVar3.a, 0, 1);
                    this.a0++;
                    byte b10 = xVar3.a[0];
                    if ((b10 & 128) == 128) {
                        throw w0.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b10;
                    this.e0 = true;
                }
                byte b11 = this.h0;
                if ((b11 & 1) == 1) {
                    boolean z13 = (b11 & 2) == 2;
                    this.W |= TLObject.FLAG_30;
                    if (!this.i0) {
                        x xVar4 = this.n;
                        pVar.readFully(xVar4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        xVar3.a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        xVar3.N(0);
                        j0Var.g(xVar3, 1, 1);
                        this.b0++;
                        xVar4.N(0);
                        j0Var.g(xVar4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z13) {
                        if (!this.f0) {
                            pVar.readFully(xVar3.a, 0, 1);
                            this.a0++;
                            xVar3.N(0);
                            this.g0 = xVar3.A();
                            this.f0 = true;
                        }
                        int i15 = this.g0 * 4;
                        xVar3.K(i15);
                        pVar.readFully(xVar3.a, 0, i15);
                        this.a0 += i15;
                        short s10 = (short) ((this.g0 / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.q = ByteBuffer.allocate(i16);
                        }
                        this.q.position(0);
                        this.q.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.g0;
                            if (i17 >= i11) {
                                break;
                            }
                            int E = xVar3.E();
                            if (i17 % 2 == 0) {
                                this.q.putShort((short) (E - i18));
                            } else {
                                this.q.putInt(E - i18);
                            }
                            i17++;
                            i18 = E;
                        }
                        int i19 = (i10 - this.a0) - i18;
                        if (i11 % 2 == 1) {
                            this.q.putInt(i19);
                        } else {
                            this.q.putShort((short) i19);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        x xVar5 = this.o;
                        xVar5.L(i16, array);
                        j0Var.g(xVar5, i16, 1);
                        this.b0 += i16;
                    }
                }
            } else {
                byte[] bArr2 = eVar.j;
                if (bArr2 != null) {
                    xVar2.L(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(eVar.c) ? z10 : eVar.g > 0) {
                this.W |= TLObject.FLAG_28;
                this.p.K(0);
                int i20 = (xVar2.c + i10) - this.a0;
                xVar3.K(4);
                byte[] bArr3 = xVar3.a;
                bArr3[0] = (byte) ((i20 >> 24) & 255);
                bArr3[1] = (byte) ((i20 >> 16) & 255);
                bArr3[2] = (byte) ((i20 >> 8) & 255);
                bArr3[3] = (byte) (i20 & 255);
                j0Var.g(xVar3, 4, 2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i21 = i10 + xVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(eVar.c) && !"V_MPEGH/ISO/HEVC".equals(eVar.c)) {
            if (eVar.V != null) {
                u6.p(xVar2.c == 0);
                eVar.V.c(pVar);
            }
            while (true) {
                int i22 = this.a0;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int a12 = xVar2.a();
                if (a12 > 0) {
                    a10 = Math.min(i23, a12);
                    j0Var.d(a10, xVar2);
                } else {
                    a10 = j0Var.a(pVar, i23, false);
                }
                this.a0 += a10;
                this.b0 += a10;
            }
        } else {
            x xVar6 = this.h;
            byte[] bArr4 = xVar6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i24 = eVar.c0;
            int i25 = 4 - i24;
            while (this.a0 < i21) {
                int i26 = this.c0;
                if (i26 == 0) {
                    int min = Math.min(i24, xVar2.a());
                    pVar.readFully(bArr4, i25 + min, i24 - min);
                    if (min > 0) {
                        xVar2.k(i25, min, bArr4);
                    }
                    this.a0 += i24;
                    xVar6.N(0);
                    this.c0 = xVar6.E();
                    x xVar7 = this.g;
                    xVar7.N(0);
                    j0Var.d(4, xVar7);
                    this.b0 += 4;
                } else {
                    int a13 = xVar2.a();
                    if (a13 > 0) {
                        a2 = Math.min(i26, a13);
                        j0Var.d(a2, xVar2);
                    } else {
                        a2 = j0Var.a(pVar, i26, false);
                    }
                    this.a0 += a2;
                    this.b0 += a2;
                    this.c0 -= a2;
                }
            }
        }
        if ("A_VORBIS".equals(eVar.c)) {
            x xVar8 = this.j;
            xVar8.N(0);
            j0Var.d(4, xVar8);
            this.b0 += 4;
        }
        int i27 = this.b0;
        m();
        return i27;
    }

    public final void p(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.m;
        byte[] bArr2 = xVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.a, bArr.length, i10);
        xVar.N(0);
        xVar.M(length);
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
