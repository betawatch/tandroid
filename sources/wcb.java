// default package

import java.io.EOFException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wcb implements yzb {
    public final yzb a;
    public final tcb b;
    public vcb g;
    public go4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = hac.b;
    public final yw7 c = new yw7();

    public wcb(yzb yzbVar, tcb tcbVar) {
        this.a = yzbVar;
        this.b = tcbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
        wcb wcbVar;
        int i4;
        int i5;
        int i6;
        vcb vcbVar;
        byte[] bArr;
        ucb ucbVar;
        hg hgVar;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, xzbVar);
            return;
        }
        jte.e("DRM on subtitles is not supported", xzbVar == null);
        int i7 = (this.e - i3) - i2;
        try {
            vcbVar = this.g;
            bArr = this.f;
            ucbVar = ucb.c;
            hgVar = new hg((Object) this, j, i, (byte) 7);
            wcbVar = this;
            i4 = i2;
            i5 = i7;
        } catch (RuntimeException e) {
            e = e;
            wcbVar = this;
            i4 = i2;
            i5 = i7;
        }
        try {
            vcbVar.p(bArr, i5, i4, ucbVar, hgVar);
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!wcbVar.i) {
                throw runtimeException;
            }
            ncd.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i6 = i5 + i4;
            wcbVar.d = i6;
            if (i6 != wcbVar.e) {
            }
        }
        i6 = i5 + i4;
        wcbVar.d = i6;
        if (i6 != wcbVar.e) {
            wcbVar.d = 0;
            wcbVar.e = 0;
        }
    }

    @Override // yzb
    public final void b(yw7 yw7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(yw7Var, i, i2);
            return;
        }
        h(i);
        yw7Var.k(this.e, i, this.f);
        this.e += i;
    }

    @Override // yzb
    public final int c(s73 s73Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(s73Var, i, z);
        }
        h(i);
        int read = s73Var.read(this.f, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yzb
    public final /* synthetic */ void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override // yzb
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override // yzb
    public final void g(go4 go4Var) {
        go4Var.t.getClass();
        String str = go4Var.t;
        jte.f(wf7.h(str) == 3);
        boolean equals = go4Var.equals(this.h);
        tcb tcbVar = this.b;
        if (!equals) {
            this.h = go4Var;
            this.g = tcbVar.h(go4Var) ? tcbVar.v(go4Var) : null;
        }
        vcb vcbVar = this.g;
        yzb yzbVar = this.a;
        if (vcbVar == null) {
            yzbVar.g(go4Var);
            return;
        }
        fo4 a = go4Var.a();
        a.s = wf7.n("application/x-media3-cues");
        a.k = str;
        a.x = Long.MAX_VALUE;
        a.T = tcbVar.C(go4Var);
        mlb.w(a, yzbVar);
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

    @Override // yzb
    public final void d(long j) {
    }
}
