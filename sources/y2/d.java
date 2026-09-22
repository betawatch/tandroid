package y2;

import e2.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class d {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public a[] f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.c;
        this.c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.c, this.b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f, max, i10, (Object) null);
        this.e = max;
    }
}
