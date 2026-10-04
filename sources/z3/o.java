package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import hg.k0;
import java.io.EOFException;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class o implements h0 {
    public final h0 a;
    public final l b;
    public n g;
    public s h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = d0.b;
    public final v c = new v();

    public o(h0 h0Var, l lVar) {
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
            this.g = lVar.V(sVar) ? lVar.x(sVar) : null;
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
        a2.O = lVar.H(sVar);
        k0.r(a2, h0Var);
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
        o oVar;
        int i13;
        int i14;
        n nVar;
        byte[] bArr;
        m mVar;
        j2.d dVar;
        if (this.g == null) {
            this.a.c(j3, i10, i11, i12, g0Var);
            return;
        }
        int i15 = i11;
        e2.d.a("DRM on subtitles is not supported", g0Var == null);
        int i16 = (this.e - i12) - i15;
        try {
            nVar = this.g;
            bArr = this.f;
            mVar = m.c;
        } catch (RuntimeException e7) {
            e = e7;
            oVar = this;
        }
        try {
            dVar = new j2.d(this, j3, i10, 7);
            oVar = this;
            i13 = i16;
        } catch (RuntimeException e10) {
            e = e10;
            oVar = this;
            i13 = i16;
            RuntimeException runtimeException = e;
            if (oVar.i) {
                throw runtimeException;
            }
            e2.a.o("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i14 = i13 + i15;
            oVar.d = i14;
            if (i14 != oVar.e) {
            }
        }
        try {
            nVar.F(bArr, i13, i15, mVar, dVar);
            i15 = i15;
        } catch (RuntimeException e11) {
            e = e11;
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
