package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j1 implements b3.l {
    public final j2.m a;
    public final j2.b0 b;
    public byte[] c;

    public j1(j2.h hVar, j2.m mVar) {
        t.g.getAndIncrement();
        this.a = mVar;
        this.b = new j2.b0(hVar);
    }

    @Override // b3.l
    public final void a() {
        j2.b0 b0Var = this.b;
        b0Var.b = 0L;
        try {
            b0Var.open(this.a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) b0Var.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i7 = b0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.q0.a(b0Var);
        } catch (Throwable th2) {
            c8.q0.a(b0Var);
            throw th2;
        }
    }

    @Override // b3.l
    public final void D() {
    }
}
