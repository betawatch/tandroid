package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j1 implements b3.l {
    public final j2.m a;
    public final j2.c0 b;
    public byte[] c;

    public j1(j2.h hVar, j2.m mVar) {
        t.g.getAndIncrement();
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
