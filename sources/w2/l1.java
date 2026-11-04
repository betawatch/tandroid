package w2;

import b8.uc;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l1 implements a3.m {
    public final i2.n a;
    public final i2.c0 b;
    public byte[] c;

    public l1(i2.h hVar, i2.n nVar) {
        u.g.getAndIncrement();
        this.a = nVar;
        this.b = new i2.c0(hVar);
    }

    @Override // a3.m
    public final void a() {
        i2.c0 c0Var = this.b;
        c0Var.b = 0L;
        try {
            c0Var.open(this.a);
            int i3 = 0;
            while (i3 != -1) {
                int i10 = (int) c0Var.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i3 = c0Var.read(bArr2, i10, bArr2.length - i10);
            }
            uc.a(c0Var);
        } catch (Throwable th2) {
            uc.a(c0Var);
            throw th2;
        }
    }

    @Override // a3.m
    public final void X1() {
    }
}
