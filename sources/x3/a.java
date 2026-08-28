package x3;

import c2.b1;
import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import m3.m;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m a;
    public final w b;
    public final b1 c;
    public final int d;
    public final byte[] e;
    public final y f;
    public final int g;
    public final t0 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public a(m mVar, w wVar, b1 b1Var) {
        this.a = mVar;
        this.b = wVar;
        this.c = b1Var;
        int i9 = b1Var.b;
        int max = Math.max(1, i9 / 10);
        this.g = max;
        y yVar = new y((byte[]) b1Var.e);
        yVar.k();
        int k10 = yVar.k();
        this.d = k10;
        int i10 = b1Var.a;
        int i11 = b1Var.c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (b1Var.d * i10)) + 1;
        if (k10 != i12) {
            throw t1.a("Expected frames per block: " + i12 + "; got: " + k10, null);
        }
        int f10 = f0.f(max, k10);
        this.e = new byte[f10 * i11];
        this.f = new y(k10 * 2 * i10 * f10);
        int i13 = ((i11 * i9) * 8) / k10;
        s0 s0Var = new s0();
        s0Var.o = "audio/raw";
        s0Var.f = i13;
        s0Var.g = i13;
        s0Var.p = max * 2 * i10;
        s0Var.B = i10;
        s0Var.C = i9;
        s0Var.D = 2;
        this.h = new t0(s0Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:5:0x0024->B:11:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // x3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(m3.l r25, long r26) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.a.a(m3.l, long):boolean");
    }

    @Override // x3.b
    public final void b(long j10) {
        this.i = 0;
        this.j = j10;
        this.k = 0;
        this.l = 0L;
    }

    @Override // x3.b
    public final void c(int i9, long j10) {
        this.a.y(new d(this.c, this.d, i9, j10));
        this.b.c(this.h);
    }

    public final void d(int i9) {
        long j10 = this.j;
        long j11 = this.l;
        b1 b1Var = this.c;
        long O = j10 + f0.O(j11, 1000000L, b1Var.b);
        int i10 = i9 * 2 * b1Var.a;
        this.b.e(O, 1, i10, this.k - i10, null);
        this.l += i9;
        this.k -= i10;
    }
}
