package t3;

import h5.d0;
import r3.r;
import r3.t;
import r3.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e {
    public final v a;
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

    public e(int i10, int i11, long j10, int i12, v vVar) {
        boolean z4 = true;
        if (i11 != 1 && i11 != 2) {
            z4 = false;
        }
        h5.a.f(z4);
        this.d = j10;
        this.e = i12;
        this.a = vVar;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.c = i11 == 2 ? i13 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final t a(int i10) {
        return new t(((this.d * 1) / this.e) * this.l[i10], this.k[i10]);
    }

    public final r b(long j10) {
        int i10 = (int) (j10 / ((this.d * 1) / this.e));
        int d = d0.d(this.l, i10, true, true);
        if (this.l[d] == i10) {
            t a2 = a(d);
            return new r(a2, a2);
        }
        t a10 = a(d);
        int i11 = d + 1;
        return i11 < this.k.length ? new r(a10, a(i11)) : new r(a10, a10);
    }
}
