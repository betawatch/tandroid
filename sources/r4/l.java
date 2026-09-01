package r4;

import h5.d0;
import j3.n0;
import o4.l0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class l implements l0 {
    public final n0 a;
    public long[] c;
    public boolean d;
    public s4.g e;
    public boolean f;
    public int h;
    public final f7.b b = new f7.b(3, (byte) 0);
    public long n = -9223372036854775807L;

    public l(s4.g gVar, n0 n0Var, boolean z4) {
        this.a = n0Var;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z4);
    }

    public final void b(s4.g gVar, boolean z4) {
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.c[i10 - 1];
        this.d = z4;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j12 = this.n;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.h = d0.b(jArr, j11, false);
            }
        } else {
            int b10 = d0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j10 = j12;
            }
            this.n = j10;
        }
    }

    @Override // o4.l0
    public final boolean h() {
        return true;
    }

    @Override // o4.l0
    public final int l(long j10) {
        int max = Math.max(this.h, d0.b(this.c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override // o4.l0
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        int i11 = this.h;
        boolean z4 = i11 == this.c.length;
        if (z4 && !this.d) {
            iVar.b = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f) {
            bVar.c = this.a;
            this.f = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] q10 = this.b.q(this.e.a[i11]);
            iVar.j(q10.length);
            iVar.d.put(q10);
        }
        iVar.f = this.c[i11];
        iVar.b = 1;
        return -4;
    }

    @Override // o4.l0
    public final void a() {
    }
}
