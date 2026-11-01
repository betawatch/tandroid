package rf;

import org.telegram.messenger.i0;
import ph.x1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class m {
    public final l a;
    public long b;
    public boolean c;
    public final x1 d = new x1(this, 6);

    public m(l lVar) {
        this.a = lVar;
    }

    public final void a(long j10) {
        if (this.c && this.b == j10) {
            return;
        }
        this.b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.c = true;
        x1 x1Var = this.d;
        i0.r(x1Var);
        i0.h3(x1Var, 1000L);
    }

    public final void b() {
        this.c = false;
        i0.r(this.d);
    }
}
