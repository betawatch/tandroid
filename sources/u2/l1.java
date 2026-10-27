package u2;

import a8.hc;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l1 implements y2.i {
    public final g2.m a;
    public final g2.b0 b;
    public byte[] c;

    public l1(g2.h hVar, g2.m mVar) {
        u.g.getAndIncrement();
        this.a = mVar;
        this.b = new g2.b0(hVar);
    }

    @Override // y2.i
    public final void b() {
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
            hc.a(b0Var);
        } catch (Throwable th2) {
            hc.a(b0Var);
            throw th2;
        }
    }

    @Override // y2.i
    public final void f0() {
    }
}
