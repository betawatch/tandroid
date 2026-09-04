package u2;

import java.util.Arrays;
import v7.m7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j1 implements y2.j {
    public final g2.m a;
    public final g2.b0 b;
    public byte[] c;

    public j1(g2.h hVar, g2.m mVar) {
        t.b.getAndIncrement();
        this.a = mVar;
        this.b = new g2.b0(hVar);
    }

    @Override // y2.j
    public final void a() {
        g2.b0 b0Var = this.b;
        b0Var.b = 0L;
        try {
            b0Var.open(this.a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            m7.a(b0Var);
        } catch (Throwable th2) {
            m7.a(b0Var);
            throw th2;
        }
    }

    @Override // y2.j
    public final void W() {
    }
}
