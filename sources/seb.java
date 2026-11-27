// default package

import java.io.EOFException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class seb implements x1c {
    public final x1c a;
    public final peb b;
    public reb g;
    public ko4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = gcc.b;
    public final ey7 c = new ey7();

    public seb(x1c x1cVar, peb pebVar) {
        this.a = x1cVar;
        this.b = pebVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // x1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        seb sebVar;
        int i4;
        int i5;
        int i6;
        reb rebVar;
        byte[] bArr;
        qeb qebVar;
        lf lfVar;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, w1cVar);
            return;
        }
        yve.e("DRM on subtitles is not supported", w1cVar == null);
        int i7 = (this.e - i3) - i2;
        try {
            rebVar = this.g;
            bArr = this.f;
            qebVar = qeb.c;
            lfVar = new lf((Object) this, j, i, (byte) 7);
            sebVar = this;
            i4 = i2;
            i5 = i7;
        } catch (RuntimeException e) {
            e = e;
            sebVar = this;
            i4 = i2;
            i5 = i7;
        }
        try {
            rebVar.l(bArr, i5, i4, qebVar, lfVar);
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!sebVar.i) {
                throw runtimeException;
            }
            efd.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i6 = i5 + i4;
            sebVar.d = i6;
            if (i6 != sebVar.e) {
            }
        }
        i6 = i5 + i4;
        sebVar.d = i6;
        if (i6 != sebVar.e) {
            sebVar.d = 0;
            sebVar.e = 0;
        }
    }

    @Override // x1c
    public final void b(ey7 ey7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(ey7Var, i, i2);
            return;
        }
        h(i);
        ey7Var.k(this.e, i, this.f);
        this.e += i;
    }

    @Override // x1c
    public final int c(z63 z63Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(z63Var, i, z);
        }
        h(i);
        int read = z63Var.read(this.f, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x1c
    public final /* synthetic */ void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override // x1c
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override // x1c
    public final void g(ko4 ko4Var) {
        ko4Var.t.getClass();
        String str = ko4Var.t;
        yve.f(dg7.h(str) == 3);
        boolean equals = ko4Var.equals(this.h);
        peb pebVar = this.b;
        if (!equals) {
            this.h = ko4Var;
            this.g = pebVar.j(ko4Var) ? pebVar.s(ko4Var) : null;
        }
        reb rebVar = this.g;
        x1c x1cVar = this.a;
        if (rebVar == null) {
            x1cVar.g(ko4Var);
            return;
        }
        jo4 a = ko4Var.a();
        a.s = dg7.n("application/x-media3-cues");
        a.k = str;
        a.x = Long.MAX_VALUE;
        a.T = pebVar.y(ko4Var);
        xnb.v(a, x1cVar);
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 << 1, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }

    @Override // x1c
    public final void d(long j) {
    }
}
