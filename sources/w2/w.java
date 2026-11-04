package w2;

import b8.zb;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w extends k2.a {
    public final d2.n1 h;
    public final int i;
    public final int j;
    public final int k;

    public w(d2.n1 n1Var, int i3) {
        super(new h1(i3));
        this.h = n1Var;
        int h = n1Var.h();
        this.i = h;
        this.j = n1Var.o();
        this.k = i3;
        if (h > 0) {
            zb.o("LoopingMediaSource contains too many periods", i3 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h);
        }
    }

    @Override // d2.n1
    public final int h() {
        return this.i * this.k;
    }

    @Override // d2.n1
    public final int o() {
        return this.j * this.k;
    }

    @Override // k2.a
    public final int q(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // k2.a
    public final int r(int i3) {
        return i3 / this.i;
    }

    @Override // k2.a
    public final int s(int i3) {
        return i3 / this.j;
    }

    @Override // k2.a
    public final Object t(int i3) {
        return Integer.valueOf(i3);
    }

    @Override // k2.a
    public final int u(int i3) {
        return i3 * this.i;
    }

    @Override // k2.a
    public final int v(int i3) {
        return i3 * this.j;
    }

    @Override // k2.a
    public final d2.n1 x(int i3) {
        return this.h;
    }
}
