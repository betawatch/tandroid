package z3;

import a8.yb;
import b2.p;
import b2.w;
import b2.w0;
import b2.x;
import c3.h0;
import c3.i0;
import c3.j0;
import e2.n0;
import java.io.EOFException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n implements j0 {
    public final j0 a;
    public final k b;
    public m g;
    public x h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = n0.b;
    public final e2.x c = new e2.x();

    public n(j0 j0Var, k kVar) {
        this.a = j0Var;
        this.b = kVar;
    }

    @Override // c3.j0
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.j0
    public final void b(x xVar) {
        xVar.s.getClass();
        String str = xVar.s;
        yb.g(w0.h(str) == 3);
        boolean equals = xVar.equals(this.h);
        k kVar = this.b;
        if (!equals) {
            this.h = xVar;
            this.g = kVar.i1(xVar) ? kVar.f0(xVar) : null;
        }
        m mVar = this.g;
        j0 j0Var = this.a;
        if (mVar == null) {
            j0Var.b(xVar);
            return;
        }
        w a2 = xVar.a();
        a2.r = w0.n("application/x-media3-cues");
        a2.j = str;
        a2.w = Long.MAX_VALUE;
        a2.P = kVar.B0(xVar);
        ic.a.u(a2, j0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // c3.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        n nVar;
        int i13;
        int i14;
        m mVar;
        byte[] bArr;
        l lVar;
        j2.c cVar;
        if (this.g == null) {
            this.a.c(j10, i10, i11, i12, i0Var);
            return;
        }
        int i15 = i11;
        yb.f("DRM on subtitles is not supported", i0Var == null);
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
            cVar = new j2.c(this, j10, i10, 7);
            nVar = this;
            i13 = i16;
        } catch (RuntimeException e10) {
            e = e10;
            nVar = this;
            i13 = i16;
            RuntimeException runtimeException = e;
            if (nVar.i) {
                throw runtimeException;
            }
            e2.a.m("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i14 = i13 + i15;
            nVar.d = i14;
            if (i14 != nVar.e) {
            }
        }
        try {
            mVar.G(bArr, i13, i15, lVar, cVar);
            i15 = i15;
        } catch (RuntimeException e11) {
            e = e11;
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

    @Override // c3.j0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        h0.a(this, xVar, i10);
    }

    @Override // c3.j0
    public final int f(p pVar, int i10, boolean z10) {
        if (this.g == null) {
            return this.a.f(pVar, i10, z10);
        }
        h(i10);
        int read = pVar.read(this.f, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.j0
    public final void g(e2.x xVar, int i10, int i11) {
        if (this.g == null) {
            this.a.g(xVar, i10, i11);
            return;
        }
        h(i10);
        xVar.k(this.e, i10, this.f);
        this.e += i10;
    }

    public final void h(int i10) {
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

    @Override // c3.j0
    public final /* synthetic */ void e(long j10) {
    }
}
