package u2;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w extends i2.a {
    public final b2.k1 h;
    public final int i;
    public final int j;
    public final int k;

    public w(b2.k1 k1Var, int i10) {
        super(new h1(i10));
        this.h = k1Var;
        int h = k1Var.h();
        this.i = h;
        this.j = k1Var.o();
        this.k = i10;
        if (h > 0) {
            e2.d.f("LoopingMediaSource contains too many periods", i10 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h);
        }
    }

    @Override // b2.k1
    public final int h() {
        return this.i * this.k;
    }

    @Override // b2.k1
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
    public final b2.k1 x(int i10) {
        return this.h;
    }
}
