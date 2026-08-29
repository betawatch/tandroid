package q3;

import f5.d0;
import o3.s;
import o3.u;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e {
    public final w a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public e(int i10, int i11, long j10, int i12, w wVar) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        f5.a.f(z10);
        this.d = j10;
        this.e = i12;
        this.a = wVar;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.c = i11 == 2 ? i13 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final u a(int i10) {
        return new u(((this.d * 1) / this.e) * this.l[i10], this.k[i10]);
    }

    public final s b(long j10) {
        int i10 = (int) (j10 / ((this.d * 1) / this.e));
        int d = d0.d(this.l, i10, true, true);
        if (this.l[d] == i10) {
            u a2 = a(d);
            return new s(a2, a2);
        }
        u a10 = a(d);
        int i11 = d + 1;
        return i11 < this.k.length ? new s(a10, a(i11)) : new s(a10, a10);
    }
}
