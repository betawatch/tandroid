package t4;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import java.io.EOFException;
import java.util.Arrays;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p implements r3.v {
    public static final n0 f;
    public static final n0 g;
    public final r3.v a;
    public final n0 b;
    public n0 c;
    public byte[] d;
    public int e;

    static {
        m0 m0Var = new m0();
        m0Var.o = "application/id3";
        f = new n0(m0Var);
        m0 m0Var2 = new m0();
        m0Var2.o = "application/x-emsg";
        g = new n0(m0Var2);
    }

    public p(r3.v vVar, int i10) {
        this.a = vVar;
        if (i10 == 1) {
            this.b = f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(l.d.j(i10, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // r3.v
    public final void a(int i10, w wVar) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        wVar.e(this.e, i10, this.d);
        this.e += i10;
    }

    @Override // r3.v
    public final void b(n0 n0Var) {
        this.c = n0Var;
        this.a.b(this.b);
    }

    @Override // r3.v
    public final void c(long j10, int i10, int i11, int i12, r3.u uVar) {
        this.c.getClass();
        int i13 = this.e - i12;
        w wVar = new w(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.c.C;
        n0 n0Var = this.b;
        String str2 = n0Var.C;
        String str3 = n0Var.C;
        if (!d0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.c.C)) {
                h5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.C);
                return;
            }
            g4.a c3 = f4.b.c(wVar);
            n0 b10 = c3.b();
            if (b10 == null || !d0.a(str3, b10.C)) {
                h5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c3.b());
                return;
            }
            byte[] d = c3.d();
            d.getClass();
            wVar = new w(d);
        }
        int a2 = wVar.a();
        r3.v vVar = this.a;
        vVar.d(a2, wVar);
        vVar.c(j10, i10, a2, i12, uVar);
    }

    @Override // r3.v
    public final /* synthetic */ void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override // r3.v
    public final int e(g5.j jVar, int i10, boolean z4) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = jVar.read(this.d, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }
}
