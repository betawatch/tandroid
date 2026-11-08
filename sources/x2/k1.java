package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k1 implements b3.l {
    public final j2.m a;
    public final j2.c0 b;
    public byte[] c;

    public k1(j2.h hVar, j2.m mVar) {
        u.g.getAndIncrement();
        this.a = mVar;
        this.b = new j2.c0(hVar);
    }

    @Override // b3.l
    public final void a() {
        j2.c0 c0Var = this.b;
        c0Var.b = 0L;
        try {
            c0Var.open(this.a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) c0Var.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i7 = c0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.p0.a(c0Var);
        } catch (Throwable th2) {
            c8.p0.a(c0Var);
            throw th2;
        }
    }

    @Override // b3.l
    public final void q0() {
    }
}
