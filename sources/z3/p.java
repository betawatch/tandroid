package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class p implements h0 {
    public final h0 a;
    public final l b;
    public n g;
    public s h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = d0.b;
    public final v c = new v();

    public p(h0 h0Var, l lVar) {
        this.a = h0Var;
        this.b = lVar;
    }

    @Override // c3.h0
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void b(s sVar) {
        sVar.r.getClass();
        String str = sVar.r;
        e2.d.b(r0.h(str) == 3);
        boolean equals = sVar.equals(this.h);
        l lVar = this.b;
        if (!equals) {
            this.h = sVar;
            this.g = lVar.W(sVar) ? lVar.x(sVar) : null;
        }
        n nVar = this.g;
        h0 h0Var = this.a;
        if (nVar == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.q = r0.n("application/x-media3-cues");
        a2.j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = lVar.D(sVar);
        hg.c.u(a2, h0Var);
    }

    @Override // c3.h0
    public final void c(final long j3, final int i10, int i11, int i12, g0 g0Var) {
        if (this.g == null) {
            this.a.c(j3, i10, i11, i12, g0Var);
            return;
        }
        e2.d.a("DRM on subtitles is not supported", g0Var == null);
        int i13 = (this.e - i12) - i11;
        try {
            this.g.B(this.f, i13, i11, m.c, new e2.h() { // from class: z3.o
                @Override // e2.h
                public final void accept(Object obj) {
                    b bVar = (b) obj;
                    p pVar = p.this;
                    e2.d.h(pVar.h);
                    byte[] C2 = ob.a.C2(bVar.a, bVar.c);
                    v vVar = pVar.c;
                    vVar.getClass();
                    vVar.H(C2.length, C2);
                    pVar.a.d(C2.length, vVar);
                    long j10 = bVar.b;
                    long j11 = j3;
                    if (j10 == -9223372036854775807L) {
                        e2.d.g(pVar.h.w == Long.MAX_VALUE);
                    } else {
                        long j12 = pVar.h.w;
                        j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
                    }
                    pVar.a.c(j11, i10 | 1, C2.length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            e2.a.o("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i14 = i13 + i11;
        this.d = i14;
        if (i14 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // c3.h0
    public final /* synthetic */ void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        if (this.g == null) {
            return this.a.e(kVar, i10, z10);
        }
        g(i10);
        int read = kVar.read(this.f, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.h0
    public final void f(v vVar, int i10, int i11) {
        if (this.g == null) {
            this.a.f(vVar, i10, i11);
            return;
        }
        g(i10);
        vVar.h(this.e, i10, this.f);
        this.e += i10;
    }

    public final void g(int i10) {
        int length = this.f.length;
        int i11 = this.e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.d;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i12);
        this.d = 0;
        this.e = i12;
        this.f = bArr2;
    }
}
