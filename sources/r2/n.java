package r2;

import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import f3.j0;
import h2.x;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n implements j0 {
    public static final u f;
    public static final u g;
    public final j0 a;
    public final u b;
    public u c;
    public byte[] d;
    public int e;

    static {
        t tVar = new t();
        tVar.r = s0.n("application/id3");
        f = new u(tVar);
        t tVar2 = new t();
        tVar2.r = s0.n("application/x-emsg");
        g = new u(tVar2);
    }

    public n(j0 j0Var, int i7) {
        this.a = j0Var;
        if (i7 == 1) {
            this.b = f;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(jg.g.j(i7, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // f3.j0
    public final void a(x xVar, int i7, int i10) {
        int i11 = this.e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        xVar.k(this.e, i7, this.d);
        this.e += i7;
    }

    @Override // f3.j0
    public final /* synthetic */ void b(int i7, x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override // f3.j0
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        this.c.getClass();
        int i12 = this.e - i11;
        x xVar = new x(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.e = i11;
        String str = this.c.s;
        u uVar = this.b;
        String str2 = uVar.s;
        String str3 = uVar.s;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.s)) {
                h2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.s);
                return;
            }
            q3.a c10 = p3.b.c(xVar);
            u a10 = c10.a();
            if (a10 == null || !Objects.equals(str3, a10.s)) {
                h2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c10.a());
                return;
            }
            byte[] c11 = c10.c();
            c11.getClass();
            xVar = new x(c11);
        }
        int a11 = xVar.a();
        j0 j0Var = this.a;
        j0Var.b(a11, xVar);
        j0Var.c(j3, i7, a11, 0, i0Var);
    }

    @Override // f3.j0
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override // f3.j0
    public final int f(e2.n nVar, int i7, boolean z9) {
        int i10 = this.e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = nVar.read(this.d, this.e, i7);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // f3.j0
    public final void g(u uVar) {
        this.c = uVar;
        this.a.g(this.b);
    }

    @Override // f3.j0
    public final /* synthetic */ void d(long j3) {
    }
}
