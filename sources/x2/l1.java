package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class l1 implements b3.m {
    public final j2.m a;
    public final j2.b0 b;
    public byte[] c;

    public l1(j2.h hVar, j2.m mVar) {
        u.g.getAndIncrement();
        this.a = mVar;
        this.b = new j2.b0(hVar);
    }

    @Override // b3.m
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
            c8.s0.a(b0Var);
        } catch (Throwable th2) {
            c8.s0.a(b0Var);
            throw th2;
        }
    }

    @Override // b3.m
    public final void A() {
    }
}
