package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import java.io.EOFException;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class n implements h0 {
    public final h0 a;
    public final k b;
    public m g;
    public s h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = d0.b;
    public final v c = new v();

    public n(h0 h0Var, k kVar) {
        this.a = h0Var;
        this.b = kVar;
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
        k kVar = this.b;
        if (!equals) {
            this.h = sVar;
            this.g = kVar.W(sVar) ? kVar.x(sVar) : null;
        }
        m mVar = this.g;
        h0 h0Var = this.a;
        if (mVar == null) {
            h0Var.b(sVar);
            return;
        }
        r a2 = sVar.a();
        a2.q = r0.n("application/x-media3-cues");
        a2.j = str;
        a2.v = Long.MAX_VALUE;
        a2.O = kVar.D(sVar);
        hg.c.s(a2, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // c3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        n nVar;
        int i13;
        int i14;
        m mVar;
        byte[] bArr;
        l lVar;
        j2.d dVar;
        if (this.g == null) {
            this.a.c(j3, i10, i11, i12, g0Var);
            return;
        }
        int i15 = i11;
        e2.d.a("DRM on subtitles is not supported", g0Var == null);
        int i16 = (this.e - i12) - i15;
        try {
            mVar = this.g;
            bArr = this.f;
            lVar = l.c;
        } catch (RuntimeException e) {
            e = e;
            nVar = this;
        }
        try {
            dVar = new j2.d(this, j3, i10, 7);
            nVar = this;
            i13 = i16;
        } catch (RuntimeException e7) {
            e = e7;
            nVar = this;
            i13 = i16;
            RuntimeException runtimeException = e;
            if (nVar.i) {
                throw runtimeException;
            }
            e2.a.o("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i14 = i13 + i15;
            nVar.d = i14;
            if (i14 != nVar.e) {
            }
        }
        try {
            mVar.C(bArr, i13, i15, lVar, dVar);
            i15 = i15;
        } catch (RuntimeException e10) {
            e = e10;
            i15 = i15;
            RuntimeException runtimeException2 = e;
            if (nVar.i) {
            }
        }
        i14 = i13 + i15;
        nVar.d = i14;
        if (i14 != nVar.e) {
            nVar.d = 0;
            nVar.e = 0;
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
