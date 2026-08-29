package z3;

import a4.k;
import f5.d0;
import j3.s0;
import j3.t0;
import j3.t1;
import o3.m;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m a;
    public final w b;
    public final k c;
    public final int d;
    public final byte[] e;
    public final f5.w f;
    public final int g;
    public final t0 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public a(m mVar, w wVar, k kVar) {
        this.a = mVar;
        this.b = wVar;
        this.c = kVar;
        int i10 = kVar.b;
        int max = Math.max(1, i10 / 10);
        this.g = max;
        f5.w wVar2 = new f5.w((byte[]) kVar.e);
        wVar2.k();
        int k9 = wVar2.k();
        this.d = k9;
        int i11 = kVar.a;
        int i12 = kVar.c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (kVar.d * i11)) + 1;
        if (k9 != i13) {
            throw t1.a("Expected frames per block: " + i13 + "; got: " + k9, null);
        }
        int f9 = d0.f(max, k9);
        this.e = new byte[f9 * i12];
        this.f = new f5.w(k9 * 2 * i11 * f9);
        int i14 = ((i12 * i10) * 8) / k9;
        s0 s0Var = new s0();
        s0Var.o = "audio/raw";
        s0Var.f = i14;
        s0Var.g = i14;
        s0Var.p = max * 2 * i11;
        s0Var.B = i11;
        s0Var.C = i10;
        s0Var.D = 2;
        this.h = new t0(s0Var);
    }

    @Override // z3.b
    public final void a(long j10) {
        this.i = 0;
        this.j = j10;
        this.k = 0;
        this.l = 0L;
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
    @Override // z3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(o3.l r25, long r26) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.b(o3.l, long):boolean");
    }

    @Override // z3.b
    public final void c(int i10, long j10) {
        this.a.D1(new d(this.c, this.d, i10, j10));
        this.b.b(this.h);
    }

    public final void d(int i10) {
        long j10 = this.j;
        long j11 = this.l;
        k kVar = this.c;
        long O = j10 + d0.O(j11, 1000000L, kVar.b);
        int i11 = i10 * 2 * kVar.a;
        this.b.c(O, 1, i11, this.k - i11, null);
        this.l += i10;
        this.k -= i11;
    }
}
