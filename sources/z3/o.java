package z3;

import b2.p;
import b2.w;
import b2.w0;
import b2.x;
import c3.h0;
import c3.i0;
import e2.m0;
import java.io.EOFException;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class o implements i0 {
    public final i0 a;
    public final l b;
    public n g;
    public x h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = m0.b;
    public final e2.x c = new e2.x();

    public o(i0 i0Var, l lVar) {
        this.a = i0Var;
        this.b = lVar;
    }

    @Override // c3.i0
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.i0
    public final void b(x xVar) {
        xVar.s.getClass();
        String str = xVar.s;
        u6.g(w0.h(str) == 3);
        boolean equals = xVar.equals(this.h);
        l lVar = this.b;
        if (!equals) {
            this.h = xVar;
            this.g = lVar.b0(xVar) ? lVar.p(xVar) : null;
        }
        n nVar = this.g;
        i0 i0Var = this.a;
        if (nVar == null) {
            i0Var.b(xVar);
            return;
        }
        w a2 = xVar.a();
        a2.r = w0.n("application/x-media3-cues");
        a2.j = str;
        a2.w = Long.MAX_VALUE;
        a2.P = lVar.J(xVar);
        i2.d.s(a2, i0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // c3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
        o oVar;
        int i13;
        int i14;
        n nVar;
        byte[] bArr;
        m mVar;
        j2.d dVar;
        if (this.g == null) {
            this.a.c(j10, i10, i11, i12, h0Var);
            return;
        }
        int i15 = i11;
        u6.f("DRM on subtitles is not supported", h0Var == null);
        int i16 = (this.e - i12) - i15;
        try {
            nVar = this.g;
            bArr = this.f;
            mVar = m.c;
        } catch (RuntimeException e) {
            e = e;
            oVar = this;
        }
        try {
            dVar = new j2.d(this, j10, i10, 7);
            oVar = this;
            i13 = i16;
        } catch (RuntimeException e7) {
            e = e7;
            oVar = this;
            i13 = i16;
            RuntimeException runtimeException = e;
            if (oVar.i) {
                throw runtimeException;
            }
            e2.a.m("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i14 = i13 + i15;
            oVar.d = i14;
            if (i14 != oVar.e) {
            }
        }
        try {
            nVar.u0(bArr, i13, i15, mVar, dVar);
            i15 = i15;
        } catch (RuntimeException e10) {
            e = e10;
            i15 = i15;
            RuntimeException runtimeException2 = e;
            if (oVar.i) {
            }
        }
        i14 = i13 + i15;
        oVar.d = i14;
        if (i14 != oVar.e) {
            oVar.d = 0;
            oVar.e = 0;
        }
    }

    @Override // c3.i0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.i0
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

    @Override // c3.i0
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

    @Override // c3.i0
    public final /* synthetic */ void e(long j10) {
    }
}
