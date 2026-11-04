package q2;

import d2.u;
import d2.u0;
import d2.v;
import e3.h0;
import e3.i0;
import g2.y;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements i0 {
    public static final v f;
    public static final v g;
    public final i0 a;
    public final v b;
    public v c;
    public byte[] d;
    public int e;

    static {
        u uVar = new u();
        uVar.r = u0.n("application/id3");
        f = new v(uVar);
        u uVar2 = new u();
        uVar2.r = u0.n("application/x-emsg");
        g = new v(uVar2);
    }

    public o(i0 i0Var, int i3) {
        this.a = i0Var;
        if (i3 == 1) {
            this.b = f;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException(p1.i(i3, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // e3.i0
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(d2.o oVar, int i3, boolean z10) {
        int i10 = this.e + i3;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = oVar.read(this.d, this.e, i3);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // e3.i0
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        this.c.getClass();
        int i12 = this.e - i11;
        y yVar = new y(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.e = i11;
        String str = this.c.s;
        v vVar = this.b;
        String str2 = vVar.s;
        String str3 = vVar.s;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.s)) {
                g2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.s);
                return;
            }
            p3.a c2 = o3.b.c(yVar);
            v b10 = c2.b();
            if (b10 == null || !Objects.equals(str3, b10.s)) {
                g2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c2.b());
                return;
            }
            byte[] c10 = c2.c();
            c10.getClass();
            yVar = new y(c10);
        }
        int a10 = yVar.a();
        i0 i0Var = this.a;
        i0Var.e(a10, yVar);
        i0Var.d(j10, i3, a10, 0, h0Var);
    }

    @Override // e3.i0
    public final /* synthetic */ void e(int i3, y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override // e3.i0
    public final void f(y yVar, int i3, int i10) {
        int i11 = this.e + i3;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        yVar.k(this.e, i3, this.d);
        this.e += i3;
    }

    @Override // e3.i0
    public final void g(v vVar) {
        this.c = vVar;
        this.a.g(this.b);
    }

    @Override // e3.i0
    public final /* synthetic */ void b(long j10) {
    }
}
