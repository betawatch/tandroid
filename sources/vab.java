// default package

import java.io.EOFException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vab implements wxb {
    public final wxb a;
    public final sab b;
    public uab g;
    public fm4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = g8c.b;
    public final xu7 c = new xu7();

    public vab(wxb wxbVar, sab sabVar) {
        this.a = wxbVar;
        this.b = sabVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // wxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        vab vabVar;
        int i4;
        int i5;
        int i6;
        uab uabVar;
        byte[] bArr;
        tab tabVar;
        gf gfVar;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, vxbVar);
            return;
        }
        gre.e("DRM on subtitles is not supported", vxbVar == null);
        int i7 = (this.e - i3) - i2;
        try {
            uabVar = this.g;
            bArr = this.f;
            tabVar = tab.c;
            gfVar = new gf((Object) this, j, i, (byte) 7);
            vabVar = this;
            i4 = i2;
            i5 = i7;
        } catch (RuntimeException e) {
            e = e;
            vabVar = this;
            i4 = i2;
            i5 = i7;
        }
        try {
            uabVar.l(bArr, i5, i4, tabVar, gfVar);
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!vabVar.i) {
                throw runtimeException;
            }
            lad.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i6 = i5 + i4;
            vabVar.d = i6;
            if (i6 != vabVar.e) {
            }
        }
        i6 = i5 + i4;
        vabVar.d = i6;
        if (i6 != vabVar.e) {
            vabVar.d = 0;
            vabVar.e = 0;
        }
    }

    @Override // wxb
    public final void b(xu7 xu7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(xu7Var, i, i2);
            return;
        }
        h(i);
        xu7Var.k(this.e, i, this.f);
        this.e += i;
    }

    @Override // wxb
    public final int c(g63 g63Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(g63Var, i, z);
        }
        h(i);
        int read = g63Var.read(this.f, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // wxb
    public final /* synthetic */ void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override // wxb
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override // wxb
    public final void g(fm4 fm4Var) {
        fm4Var.t.getClass();
        String str = fm4Var.t;
        gre.f(ud7.h(str) == 3);
        boolean equals = fm4Var.equals(this.h);
        sab sabVar = this.b;
        if (!equals) {
            this.h = fm4Var;
            this.g = sabVar.h(fm4Var) ? sabVar.r(fm4Var) : null;
        }
        uab uabVar = this.g;
        wxb wxbVar = this.a;
        if (uabVar == null) {
            wxbVar.g(fm4Var);
            return;
        }
        em4 a = fm4Var.a();
        a.s = ud7.n("application/x-media3-cues");
        a.k = str;
        a.x = Long.MAX_VALUE;
        a.T = sabVar.y(fm4Var);
        yjb.v(a, wxbVar);
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

    @Override // wxb
    public final void d(long j) {
    }
}
