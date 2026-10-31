package u2;

import java.util.Arrays;
import v7.l7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l1 implements y2.i {
    public final g2.n a;
    public final g2.c0 b;
    public byte[] c;

    public l1(g2.h hVar, g2.n nVar) {
        u.g.getAndIncrement();
        this.a = nVar;
        this.b = new g2.c0(hVar);
    }

    @Override // y2.i
    public final void b() {
        g2.c0 c0Var = this.b;
        c0Var.b = 0L;
        try {
            c0Var.open(this.a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) c0Var.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i10 = c0Var.read(bArr2, i11, bArr2.length - i11);
            }
            l7.a(c0Var);
        } catch (Throwable th2) {
            l7.a(c0Var);
            throw th2;
        }
    }

    @Override // y2.i
    public final void R1() {
    }
}
