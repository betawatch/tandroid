package y2;

import e2.m0;
import java.util.Arrays;
import u2.b1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public a[] f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.d + 1;
            this.d = i10;
            int i11 = this.e;
            if (i11 > 0) {
                a[] aVarArr = this.f;
                int i12 = i11 - 1;
                this.e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.b], 0);
                a[] aVarArr2 = this.f;
                if (i10 > aVarArr2.length) {
                    this.f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(b1 b1Var) {
        while (b1Var != null) {
            a[] aVarArr = this.f;
            int i10 = this.e;
            this.e = i10 + 1;
            a aVar = (a) b1Var.c;
            aVar.getClass();
            aVarArr[i10] = aVar;
            this.d--;
            b1Var = (b1) b1Var.d;
            if (b1Var == null || ((a) b1Var.c) == null) {
                b1Var = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f;
        int i10 = this.e;
        this.e = i10 + 1;
        aVarArr[i10] = aVar;
        this.d--;
    }

    public final synchronized void d(int i10) {
        boolean z10 = i10 < this.c;
        this.c = i10;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.c, this.b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f, max, i10, (Object) null);
        this.e = max;
    }
}
