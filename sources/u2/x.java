package u2;

import org.telegram.tgnet.ConnectionsManager;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class x extends i2.a {
    public final b2.o1 h;
    public final int i;
    public final int j;
    public final int k;

    public x(b2.o1 o1Var, int i10) {
        super(new j1(i10));
        this.h = o1Var;
        int h = o1Var.h();
        this.i = h;
        this.j = o1Var.o();
        this.k = i10;
        if (h > 0) {
            u6.o("LoopingMediaSource contains too many periods", i10 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h);
        }
    }

    @Override // b2.o1
    public final int h() {
        return this.i * this.k;
    }

    @Override // b2.o1
    public final int o() {
        return this.j * this.k;
    }

    @Override // i2.a
    public final int q(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // i2.a
    public final int r(int i10) {
        return i10 / this.i;
    }

    @Override // i2.a
    public final int s(int i10) {
        return i10 / this.j;
    }

    @Override // i2.a
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override // i2.a
    public final int u(int i10) {
        return i10 * this.i;
    }

    @Override // i2.a
    public final int v(int i10) {
        return i10 * this.j;
    }

    @Override // i2.a
    public final b2.o1 x(int i10) {
        return this.h;
    }
}
